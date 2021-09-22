package com.rs.net.decoders;

import com.rs.Settings;
import com.rs.io.InputStream;
import com.rs.net.Session;
import org.pmw.tinylog.Logger;

public final class ClientPacketsDecoder extends Decoder {

	public ClientPacketsDecoder(Session connection) {
		super(connection);
	}

	@Override
	public final void decode(InputStream stream) {
		session.setDecoder(-1);
		int packetId = stream.readUnsignedByte();
		switch (packetId) {
		case 14:
			decodeLogin(stream);
			break;
		case 15:
			decodeGrab(stream);
			break;
		default:
			if (Settings.DEBUG) Logger.info("ClientPacketsDecoder", "PacketId " + packetId);
            session.getChannel().close();
			break;
		}
	}

	private void decodeLogin(InputStream stream) {
		if (stream.getRemaining() != 0) {
			session.getChannel().close();
			return;
		}
		session.setDecoder(2);
		session.setEncoder(1);
		session.getLoginPackets().sendStartUpPacket();
	}

	private void decodeGrab(InputStream stream) {
		if (stream.getRemaining() != 8) {
			System.out.println(" "+stream.getRemaining());
			session.getChannel().close();
			return;
		}
		session.setEncoder(0);
		if (stream.readInt() != Settings.CLIENT_BUILD
				|| stream.readInt() != Settings.CUSTOM_CLIENT_BUILD) {
			session.setDecoder(-1);
			session.getGrabPackets().sendOutdatedClientPacket();
			return;
		}
		session.setDecoder(1);
		session.getGrabPackets().sendStartUpPacket();
	}
}
