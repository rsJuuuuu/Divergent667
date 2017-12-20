/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_Sub1 extends OutputStream
{
	static Class124 aClass124_88 = new Class124(53);
	static int anInt89;
	static int anInt90;
	static int anInt91;
	
	OutputStream_Sub1() {
		/* empty */
	}
	
	static final void decodeGlobalPlayerUpdate(Packet packet, int packetSize) {
		Node_Sub9_Sub4.DECODE_MASKS_PLAYERS_COUNT = 0;
		Class189.DEBUG_GLOBAL_PLAYER_UPDATE = false;
		Class142.decodeGlobalPlayerUpdate(packet);
		CacheNode_Sub14_Sub2.decodePlayerMasks(packet);
		if (Class189.DEBUG_GLOBAL_PLAYER_UPDATE)
			//System.out.println("---endgpp---");
		if (packet.offset != packetSize)
			throw new RuntimeException("gpi1 pos:" + packet.offset + " psize:" + packetSize);
	}
	
	public final void write(int i) throws IOException {
		anInt89++;
		throw new IOException();
	}
	
	public static void method135(byte b) {
		if (b >= -7) {
			aClass124_88 = null;
		}
		aClass124_88 = null;
	}
	
	static final String method136(int i, String string) {
		anInt90++;
		if (Class223.aString2660.startsWith("win")) {
			return string + ".dll";
		}
		if (!Class223.aString2660.startsWith("linux")) {
			if (Class223.aString2660.startsWith("mac")) {
				return "lib" + string + ".dylib";
			}
		} else {
			return "lib" + string + ".so";
		}
		@SuppressWarnings("unused")
		int i_1_ = 35 / ((i - 66) / 55);
		return null;
	}
}
