/* Class213_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213_Sub1 extends Class213
{
	protected Class207[] aClass207Array6911;
	static int anInt6912;
	
	Class213_Sub1(Class207[] class207s) {
		aClass207Array6911 = class207s;
	}
	
	static final aa_Sub2 method2057(int[] is, int[] is_0_, int i, int i_1_, AbstractToolkit abstracttoolkit, int i_2_) {
		anInt6912++;
		if (i != -16777216) {
			return null;
		}
		if (abstracttoolkit.method1295(Node_Sub52.aClass68_7639, Class372.aClass372_4594, 1)) {
			byte[] bs = new byte[i_2_ * i_1_];
			for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
				int i_4_ = is[i_3_] + i_3_ * i_1_;
				for (int i_5_ = 0; is_0_[i_3_] > i_5_; i_5_++)
					bs[i_4_++] = (byte) -1;
			}
			return new aa_Sub2(abstracttoolkit, i_1_, i_2_, bs);
		}
		int[] is_6_ = new int[i_1_ * i_2_];
		for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_7_++) {
			int i_8_ = i_7_ * i_1_ + is[i_7_];
			for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (is_0_[i_7_] ^ 0xffffffff); i_9_++)
				is_6_[i_8_++] = -16777216;
		}
		return new aa_Sub2(abstracttoolkit, i_1_, i_2_, is_6_);
	}
}
