package com.rs.net.encoders;

import com.rs.game.player.Player;
import com.rs.io.OutputStream;
import com.rs.net.Session;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelFutureListener;

public final class LoginPacketsEncoder extends Encoder {

    public LoginPacketsEncoder(Session connection) {
        super(connection);
    }

    public final void sendStartUpPacket() {
        OutputStream stream = new OutputStream(1);
        stream.writeByte(0);
        session.write(stream);
    }

    public final void sendClientPacket(int opcode) {
        OutputStream stream = new OutputStream(1);
        stream.writeByte(opcode);
        ChannelFuture future = session.write(stream);
        if (future != null) {
            future.addListener(ChannelFutureListener.CLOSE);
        } else {
            session.getChannel().close();
        }
    }

    public final void sendLoginDetails(Player player) {
        OutputStream stream = new OutputStream();
        stream.writePacketVarByte(2);
        stream.writeByte(player.getRank().getRights());
        stream.writeByte(0);
        stream.writeByte(0);
        stream.writeByte(0);
        stream.writeByte(1);
        stream.writeByte(0);
        stream.writeShort(player.getIndex());
        stream.writeByte(1);
        stream.write24BitInteger(0);
        stream.writeByte(1);
        stream.writeString(player.getDisplayName());
        stream.endPacketVarByte();
        session.write(stream);
    }

    public void sendLobbyDetails(Player player) {

        OutputStream responseBlock = new OutputStream();

        responseBlock.writePacketVarByte(2);
        responseBlock.writeByte(0);//1
        responseBlock.writeByte(0);//2
        responseBlock.writeByte(0);//3
        responseBlock.writeByte(0);//4
        responseBlock.writeByte(0);//5
        responseBlock.writeLong(0);//members subscription end
        responseBlock.writeByte(0);//0x1 - if members, 0x2 - subscription
        responseBlock.writeInt(0);//recovery questions set date

        responseBlock.writeByte(2);
        responseBlock.writeInt(0);
        responseBlock.writeByte(0);
        responseBlock.writeInt(0);

        responseBlock.writeShort(2649);
        responseBlock.writeShort(0);
        responseBlock.writeShort(11162011);
        responseBlock.writeInt(0);

        responseBlock.writeByte(0);
        responseBlock.writeShort(0);
        responseBlock.writeShort(0);
        responseBlock.writeByte(1);
        responseBlock.writeGJString(player.getUsername());
        responseBlock.writeByte((byte) 0);
        responseBlock.writeInt(1);
        responseBlock.writeByte(1);
        responseBlock.writeShort(1);
        responseBlock.writeGJString("");
        responseBlock.endPacketVarByte();

        player.getSession().write(responseBlock);
    }

}
