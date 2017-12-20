/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class375
{
	static int anInt4654;
	static IncommingPacket aClass192_4655 = new IncommingPacket(107, 4);
	static int anInt4656;
	static int anInt4657;
	
	public static void method4114(int i) {
		if (i < 16) {
			anInt4657 = -15;
		}
		aClass192_4655 = null;
	}
	
	static final void method4115(byte b) {
		Class152.anInt1941 = -2;
		anInt4654++;
		if (b >= -1) {
			method4114(-63);
		}
		Class339_Sub2.anInt8653 = -2;
		Node_Sub38_Sub8.anInt10163 = 0;
	}
	
	static final aa_Sub3 method4116(int i, int[] is, GLToolkit gltoolkit, int[] is_0_, int i_1_, int i_2_) {
		anInt4656++;
		byte[] bs = new byte[i_1_ * i_2_];
		for (int i_3_ = 0; i_1_ > i_3_; i_3_++) {
			int i_4_ = i_3_ * i_2_ + is_0_[i_3_];
			for (int i_5_ = 0; (is[i_3_] ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
				bs[i_4_++] = (byte) -1;
		}
		if (i != 17787) {
			anInt4657 = 5;
		}
		return new aa_Sub3(gltoolkit, i_2_, i_1_, bs);
	}
}
