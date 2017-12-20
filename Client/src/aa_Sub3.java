/* aa_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class aa_Sub3 extends aa
{
	static int[] anIntArray5490;
	static int anInt5491;
	static int anInt5492;
	static int anInt5493;
	protected Class169_Sub2_Sub1 aClass169_Sub2_Sub1_5494;
	
	static final int method160(int i) {
		anInt5491++;
		if (Class291.anIntArray3665 == null) {
			return 0;
		}
		if (i != -5573) {
			return 103;
		}
		return 2 * Class291.anIntArray3665.length;
	}
	
	public static void method161(int i) {
		anIntArray5490 = null;
		if (i > -102) {
			anIntArray5490 = null;
		}
	}
	
	static final void method162(int i, int i_0_, byte[] bs, int i_1_, int i_2_, int i_3_, byte[] bs_4_, int i_5_, int i_6_) {
		anInt5492++;
		int i_7_ = -(i_5_ >> 2);
		i_5_ = -(i_3_ & i_5_);
		for (int i_8_ = -i_1_; (i_8_ ^ 0xffffffff) > -1; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				bs[i_2_++] += -bs_4_[i_0_++];
				bs[i_2_++] += -bs_4_[i_0_++];
				bs[i_2_++] += -bs_4_[i_0_++];
				bs[i_2_++] += -bs_4_[i_0_++];
			}
			for (int i_10_ = i_5_; (i_10_ ^ 0xffffffff) > -1; i_10_++)
				bs[i_2_++] += -bs_4_[i_0_++];
			i_0_ += i_6_;
			i_2_ += i;
		}
	}
	
	aa_Sub3(GLToolkit gltoolkit, int i, int i_11_, byte[] bs) {
		aClass169_Sub2_Sub1_5494 = Class320_Sub21.method3761(i_11_, 6406, 8222, bs, 6406, gltoolkit, i, false);
		aClass169_Sub2_Sub1_5494.method1776(false, 126, false);
	}
}
