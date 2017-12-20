package com.rs.net.decoders;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.game.world.World;
import com.rs.game.player.Player;
import com.rs.io.AntiFlood;
import com.rs.io.InputStream;
import com.rs.net.Session;
import com.rs.game.player.PlayerUtils;
import com.rs.utils.security.Encryption;
import com.rs.utils.stringUtils.TextUtils;
import com.rs.utils.stringUtils.TimeUtils;
import org.pmw.tinylog.Logger;

public final class LoginPacketsDecoder extends Decoder {

    public LoginPacketsDecoder(Session session) {
        super(session);
    }

    @Override
    public void decode(InputStream stream) {
        session.setDecoder(-1);
        int packetId = stream.readUnsignedByte();
        if (packetId == 19) decodeLobbyLogin(stream);
        else if (packetId == 16) // 16 world login
            decodeWorldLogin(stream);
        else {
            if (Settings.DEBUG) Logger.info("LoginPacketsDecoder", "PacketId " + packetId);
            session.getChannel().close();
        }
    }

    private void decodeLobbyLogin(InputStream buffer) {
        int clientRev = buffer.readInt();
        int rsaBlockSize = buffer.readShort(); // RSA block size
        int rsaHeaderKey = buffer.readByte(); // RSA header key
        System.out.println(" " + rsaBlockSize + " " + rsaHeaderKey + " " + clientRev);

        int[] loginKeys = new int[4];
        for (int data = 0; data < 4; data++) {
            loginKeys[data] = buffer.readInt();
        }
        buffer.readLong();
        String pass = buffer.readString();
        @SuppressWarnings("unused") long serverSeed = buffer.readLong();
        @SuppressWarnings("unused") long clientSeed = buffer.readLong();

        buffer.decodeXTEA(loginKeys, buffer.getOffset(), buffer.getLength());
        String name = buffer.readString();
        boolean isHD = buffer.readByte() == 1;
        boolean isResizable = buffer.readByte() == 1;
        System.out.println("  Is resizable? " + isResizable);
        for (int i = 0; i < 24; i++)
            buffer.readByte();
        String settings = buffer.readString();

        @SuppressWarnings("unused") int unknown = buffer.readInt();
        int[] crcValues = new int[35];
        for (int i = 0; i < crcValues.length; i++)
            crcValues[i] = buffer.readInt();
        Player player;
        if (!PlayerUtils.playerExists(name)) {
            String salt = Encryption.getSalt();
            pass = Encryption.getSHAHash(pass + salt);
            player = new Player(name, salt);
            player.setPassword(pass);
        } else {
            player = PlayerUtils.loadPlayer(name);
            if (player == null) {
                session.getLoginPackets().sendClientPacket(20);
                return;
            }
            pass = Encryption.getSHAHash(pass + player.getSalt());
            if (!player.getPassword().equals(pass)) {
                session.getLoginPackets().sendClientPacket(3);
                return;
            }
        }
        if (player.isPermBanned() || (player.getBanned() > System.currentTimeMillis()))
            session.getLoginPackets().sendClientPacket(4);
        else {
            player.init(session, name);
            session.getLoginPackets().sendLobbyDetails(player);//sendLoginDetails(player);
            session.setDecoder(3, player);
            session.setEncoder(2, player);
            PlayerUtils.savePlayer(player);

            //player.start();
        }
    }

    private void decodeWorldLogin(InputStream stream) {
        if (World.exiting_start != 0) {
            session.getLoginPackets().sendClientPacket(14);
            return;
        }
        int packetSize = stream.readUnsignedShort();
        if (packetSize != stream.getRemaining()) {
            session.getChannel().close();
            return;
        }
        if (stream.readInt() != Settings.CLIENT_BUILD || stream.readInt() != Settings.CUSTOM_CLIENT_BUILD) {
            session.getLoginPackets().sendClientPacket(6);
            return;
        }
        stream.readUnsignedByte();
        int[] isaacKeys = new int[4];
        String password;
        if (!Settings.DISABLE_RSA) {
            int rsaBlockSize = stream.readUnsignedShort();
            if (rsaBlockSize > stream.getRemaining()) {
                session.getLoginPackets().sendClientPacket(10);
                return;
            }
            byte[] data = new byte[rsaBlockSize];
            stream.readBytes(data, 0, rsaBlockSize);
            InputStream rsaStream = new InputStream(Encryption.decryptRsa(data, Settings.RSA_EXPONENT, Settings
                    .RSA_MODULUS));

            if (rsaStream.readUnsignedByte() != 10) { // rsa block check
                session.getLoginPackets().sendClientPacket(10);
                return;
            }
            for (int i = 0; i < isaacKeys.length; i++)
                isaacKeys[i] = rsaStream.readInt();
            if (rsaStream.readLong() != 0L) { // password should start here (marked by 0L)
                session.getLoginPackets().sendClientPacket(10);
                return;
            }
            password = rsaStream.readString();
            rsaStream.readLong();
            rsaStream.readLong(); // random value
        } else {
            if (stream.readUnsignedByte() != 10) {
                session.getLoginPackets().sendClientPacket(10);
                return;
            }
            for (int i = 0; i < isaacKeys.length; i++)
                isaacKeys[i] = stream.readInt();
            if (stream.readLong() != 0L) {
                session.getLoginPackets().sendClientPacket(10);
                return;
            }
            password = stream.readString();
            stream.readLong();
            stream.readLong();
        }
        stream.decodeXTEA(isaacKeys, stream.getOffset(), stream.getLength());
        String username = TextUtils.formatPlayerNameForProtocol(stream.readString());
        stream.readUnsignedByte(); // unknown
        int displayMode = stream.readUnsignedByte();
        int screenWidth = stream.readUnsignedShort();
        int screenHeight = stream.readUnsignedShort();
        @SuppressWarnings("unused") int unknown2 = stream.readUnsignedByte();
        stream.skip(24); // 24bytes directly from a file, no idea whats there
        @SuppressWarnings("unused") String settings = stream.readString();
        @SuppressWarnings("unused") int affId = stream.readInt();
        stream.skip(stream.readUnsignedByte()); // useless settings
        if (stream.readUnsignedByte() != 5) {
            session.getLoginPackets().sendClientPacket(10);
            return;
        }
        stream.readUnsignedByte();
        stream.readUnsignedByte();
        stream.readUnsignedByte();
        stream.readUnsignedByte();
        stream.readUnsignedByte();
        stream.readUnsignedByte();
        stream.readUnsignedByte();
        stream.readUnsignedByte();
        stream.readUnsignedShort();
        stream.readUnsignedByte();
        stream.read24BitInt();
        stream.readUnsignedShort();
        stream.readUnsignedByte();
        stream.readUnsignedByte();
        stream.readUnsignedByte();
        stream.readJagString();
        stream.readJagString();
        stream.readJagString();
        stream.readJagString();
        stream.readUnsignedByte();
        stream.readUnsignedShort();
        @SuppressWarnings("unused") int unknown3 = stream.readInt();
        @SuppressWarnings("unused") long userFlow = stream.readLong();
        boolean hasAdditionalInformation = stream.readUnsignedByte() == 1;
        if (hasAdditionalInformation) stream.readString(); // additionalInformation
        @SuppressWarnings("unused") boolean hasJagtheora = stream.readUnsignedByte() == 1;
        @SuppressWarnings("unused") boolean js = stream.readUnsignedByte() == 1;
        @SuppressWarnings("unused") boolean hc = stream.readUnsignedByte() == 1;
        for (int index = 0; index < Cache.STORE.getIndexes().length; index++) {
            int crc = Cache.STORE.getIndexes()[index] == null ? 0 : Cache.STORE.getIndexes()[index].getCRC();
            int receivedCRC = stream.readInt();
            if (crc != receivedCRC && index < 32) {
                session.getLoginPackets().sendClientPacket(6);
                return;
            }
        }
        // invalid chars
        if (username.length() <= 1 || username.length() >= 15 || username.contains("?") || username.contains(":")
            || username.endsWith("<") || username.contains("\\") || username.contains("*") || username.startsWith("_")
            || username.contains("\"")) {
            session.getLoginPackets().sendClientPacket(3);
            return;
        }
        if (World.getPlayers().size() >= Settings.PLAYERS_LIMIT - 10) {
            session.getLoginPackets().sendClientPacket(7);
            return;
        }
        if (World.containsPlayer(username)) {
            session.getLoginPackets().sendClientPacket(5);
            return;
        }
        if (AntiFlood.getSessionsIP(session.getIP()) > Settings.MAX_LOGINS_FROM_SAME_IP) {
            session.getLoginPackets().sendClientPacket(9);
            return;
        }

        Player player;
        if (!PlayerUtils.playerExists(username)) {
            String salt;
            salt = Encryption.getSalt();
            password = Encryption.getSHAHash(password + salt);
            player = new Player(password, salt);
        } else {
            player = PlayerUtils.loadPlayer(username);
            if (player == null) {
                session.getLoginPackets().sendClientPacket(20);
                return;
            }
            password = Encryption.getSHAHash(password + player.getSalt());
            if (!player.getPassword().equals(password)) {
                session.getLoginPackets().sendClientPacket(3);
                return;
            }
        }
        if (player.isPermBanned() || player.getBanned() > TimeUtils.getTime()) {
            session.getLoginPackets().sendClientPacket(4);
            return;
        }
        player.init(session, username, displayMode, screenWidth, screenHeight);
        session.getLoginPackets().sendLoginDetails(player);
        session.setDecoder(3, player);
        session.setEncoder(2, player);
        player.start();

    }

}
