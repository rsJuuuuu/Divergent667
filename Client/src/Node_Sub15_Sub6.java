/* Node_Sub15_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.BitSet;

public class Node_Sub15_Sub6 extends Node_Sub15
{
	private byte aByte9811;
	private byte aByte9812;
	static int anInt9813;
	private boolean aBoolean9814;
	static int anInt9815;
	static IncommingPacket aClass192_9816;
	static int anInt9817;
	private byte aByte9818;
	private byte aByte9819;
	
	final void method2556(ClanChat clanchat, int i) {
		clanchat.aBoolean750 = aBoolean9814;
		anInt9815++;
		clanchat.aByte748 = aByte9811;
		clanchat.aByte738 = aByte9819;
		if (i != 16) {
			aClass192_9816 = null;
		}
		clanchat.aByte724 = aByte9812;
		clanchat.aByte751 = aByte9818;
	}
	
	final void method2554(int i, BufferedStream buffer) {
		aBoolean9814 = (buffer.readUnsignedByte() ^ 0xffffffff) == -2;
		anInt9817++;
		if (i == 29147) {
			aByte9818 = buffer.readByte();
			aByte9811 = buffer.readByte();
			aByte9819 = buffer.readByte();
			aByte9812 = buffer.readByte();
		}
	}
	
	static final void method2571(int i, boolean bool) {
		anInt9813++;
		if ((i ^ 0xffffffff) != 0 && Class169_Sub1.aBooleanArray8788[i]) {
			Node_Sub38_Sub31.aClass302_10422.method3534((byte) 73, i);
			Class134_Sub3.aWidgetArrayArray9035[i] = null;
			Class79.aWidgetArrayArray1082[i] = null;
			Class169_Sub1.aBooleanArray8788[i] = bool;
		}
	}
	
	static final Class261 method2572(int i, int i_0_, int i_1_) {
		if (Class175.aClass261ArrayArrayArray2099[i][i_0_][i_1_] == null) {
			boolean bool = Class175.aClass261ArrayArrayArray2099[0][i_0_][i_1_] != null && Class175.aClass261ArrayArrayArray2099[0][i_0_][i_1_].aClass261_3310 != null;
			if (bool && i >= Class159.anInt1995 - 1) {
				return null;
			}
			Class320_Sub24.method3775(i, i_0_, i_1_);
		}
		return Class175.aClass261ArrayArrayArray2099[i][i_0_][i_1_];
	}
	
	Node_Sub15_Sub6() {
		/* empty */
	}
	
	public static void method2573(byte b) {
		aClass192_9816 = null;
		if (b != -57) {
			method2572(28, 51, -41);
		}
	}
	
	static {
		new BitSet(65536);
		aClass192_9816 = new IncommingPacket(47, 4);
	}
}
