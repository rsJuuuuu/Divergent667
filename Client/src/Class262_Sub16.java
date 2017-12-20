/* Class262_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub16 extends Class262
{
	private int anInt7822;
	static int anInt7823;
	static Class346 aClass346_7824 = new Class346();
	private int anInt7825;
	static int anInt7826;
	static int anInt7827;
	private int anInt7828;
	private int anInt7829;
	static boolean aBoolean7830;
	private int anInt7831;
	
	static final boolean method3193(int i, int i_0_, byte b) {
		anInt7826++;
		@SuppressWarnings("unused")
		int i_1_ = 15 % ((b - 14) / 36);
        return (0x10 & i_0_) != 0;
    }
	
	public static void method3194(byte b) {
		if (b == 82) {
			aClass346_7824 = null;
		}
	}
	
	static final void method3195(int i) {
		Class364.anInt4514 = i;
	}
	
	static final void method3196(int i, byte[] bs, int i_2_, byte b, int i_3_, int i_4_) {
		anInt7823++;
		if (i_4_ < i) {
			i_2_ += i_4_;
			i_3_ = i - i_4_ >> 2;
			if (b != -24) {
				method3193(-8, -82, (byte) -41);
			}
			while ((--i_3_ ^ 0xffffffff) <= -1) {
				bs[i_2_++] = (byte) 1;
				bs[i_2_++] = (byte) 1;
				bs[i_2_++] = (byte) 1;
				bs[i_2_++] = (byte) 1;
			}
			i_3_ = 0x3 & i + -i_4_;
			while ((--i_3_ ^ 0xffffffff) <= -1)
				bs[i_2_++] = (byte) 1;
		}
	}
	
	Class262_Sub16(BufferedStream buffer) {
		super(buffer);
		anInt7822 = buffer.readUnsignedShort();
		int i = buffer.readInt();
		anInt7825 = 0xffff & i;
		anInt7828 = i >>> 16;
		anInt7831 = buffer.readUnsignedByte();
		anInt7829 = buffer.readUnsignedByte();
	}
	
	final void method3148(int i) {
		anInt7827++;
		if (i >= -102) {
			anInt7828 = -73;
		}
		Node_Sub39.aClass369Array7497[anInt7822].method4087(anInt7828, anInt7829, (byte) 46, anInt7825, anInt7831);
	}
}
