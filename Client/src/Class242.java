/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class242
{
	private int[] anIntArray3058;
	private int[] anIntArray3059;
	private int anInt3060;
	protected int anInt3061;
	private float[][] aFloatArrayArray3062;
	private int[] anIntArray3063;
	
	private static final int method3054(int i, int i_0_) {
		int i_1_;
		for (i_1_ = (int) Math.pow((double) i, 1.0 / (double) i_0_) + 1; Class230_Sub1.method2131(i_0_, i_1_, 62) > i; i_1_--) {
			/* empty */
		}
		return i_1_;
	}
	
	private final void method3055() {
		int[] is = new int[anInt3060];
		int[] is_2_ = new int[33];
		for (int i = 0; i < anInt3060; i++) {
			int i_3_ = anIntArray3058[i];
			if (i_3_ != 0) {
				int i_4_ = 1 << 32 - i_3_;
				int i_5_ = is_2_[i_3_];
				is[i] = i_5_;
				int i_6_;
				if ((i_5_ & i_4_) != 0) {
					i_6_ = is_2_[i_3_ - 1];
				} else {
					i_6_ = i_5_ | i_4_;
					for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
						int i_8_ = is_2_[i_7_];
						if (i_8_ != i_5_) {
							break;
						}
						int i_9_ = 1 << 32 - i_7_;
						if ((i_8_ & i_9_) != 0) {
							is_2_[i_7_] = is_2_[i_7_ - 1];
							break;
						}
						is_2_[i_7_] = i_8_ | i_9_;
					}
				}
				is_2_[i_3_] = i_6_;
				for (int i_10_ = i_3_ + 1; i_10_ <= 32; i_10_++) {
					int i_11_ = is_2_[i_10_];
					if (i_11_ == i_5_) {
						is_2_[i_10_] = i_6_;
					}
				}
			}
		}
		anIntArray3063 = new int[8];
		int i = 0;
		for (int i_12_ = 0; i_12_ < anInt3060; i_12_++) {
			int i_13_ = anIntArray3058[i_12_];
			if (i_13_ != 0) {
				int i_14_ = is[i_12_];
				int i_15_ = 0;
				for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
					int i_17_ = -2147483648 >>> i_16_;
					if ((i_14_ & i_17_) != 0) {
						if (anIntArray3063[i_15_] == 0) {
							anIntArray3063[i_15_] = i;
						}
						i_15_ = anIntArray3063[i_15_];
					} else {
						i_15_++;
					}
					if (i_15_ >= anIntArray3063.length) {
						int[] is_18_ = new int[anIntArray3063.length * 2];
						for (int i_19_ = 0; i_19_ < anIntArray3063.length; i_19_++)
							is_18_[i_19_] = anIntArray3063[i_19_];
						anIntArray3063 = is_18_;
					}
					i_17_ >>>= 1;
				}
				anIntArray3063[i_15_] = i_12_ ^ 0xffffffff;
				if (i_15_ >= i) {
					i = i_15_ + 1;
				}
			}
		}
	}
	
	final int method3056() {
		int i;
		for (i = 0; anIntArray3063[i] >= 0; i = Node_Sub49.method2965() != 0 ? anIntArray3063[i] : i + 1) {
			/* empty */
		}
		return anIntArray3063[i] ^ 0xffffffff;
	}
	
	final float[] method3057() {
		return aFloatArrayArray3062[method3056()];
	}
	
	Class242() {
		Node_Sub49.method2956(24);
		anInt3061 = Node_Sub49.method2956(16);
		anInt3060 = Node_Sub49.method2956(24);
		anIntArray3058 = new int[anInt3060];
		boolean bool = Node_Sub49.method2965() != 0;
		if (bool) {
			int i = 0;
			int i_20_ = Node_Sub49.method2956(5) + 1;
			while (i < anInt3060) {
				int i_21_ = Node_Sub49.method2956(Node_Sub38_Sub20.method2855(anInt3060 - i, (byte) -86));
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
					anIntArray3058[i++] = i_20_;
				i_20_++;
			}
		} else {
			boolean bool_23_ = Node_Sub49.method2965() != 0;
			for (int i = 0; i < anInt3060; i++) {
				if (bool_23_ && Node_Sub49.method2965() == 0) {
					anIntArray3058[i] = 0;
				} else {
					anIntArray3058[i] = Node_Sub49.method2956(5) + 1;
				}
			}
		}
		method3055();
		int i = Node_Sub49.method2956(4);
		if (i > 0) {
			float f = Node_Sub49.method2963(Node_Sub49.method2956(32));
			float f_24_ = Node_Sub49.method2963(Node_Sub49.method2956(32));
			int i_25_ = Node_Sub49.method2956(4) + 1;
			boolean bool_26_ = Node_Sub49.method2965() != 0;
			int i_27_;
			if (i == 1) {
				i_27_ = method3054(anInt3060, anInt3061);
			} else {
				i_27_ = anInt3060 * anInt3061;
			}
			anIntArray3059 = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
				anIntArray3059[i_28_] = Node_Sub49.method2956(i_25_);
			aFloatArrayArray3062 = new float[anInt3060][anInt3061];
			if (i == 1) {
				for (int i_29_ = 0; i_29_ < anInt3060; i_29_++) {
					float f_30_ = 0.0F;
					int i_31_ = 1;
					for (int i_32_ = 0; i_32_ < anInt3061; i_32_++) {
						int i_33_ = i_29_ / i_31_ % i_27_;
						float f_34_ = (float) anIntArray3059[i_33_] * f_24_ + f + f_30_;
						aFloatArrayArray3062[i_29_][i_32_] = f_34_;
						if (bool_26_) {
							f_30_ = f_34_;
						}
						i_31_ *= i_27_;
					}
				}
			} else {
				for (int i_35_ = 0; i_35_ < anInt3060; i_35_++) {
					float f_36_ = 0.0F;
					int i_37_ = i_35_ * anInt3061;
					for (int i_38_ = 0; i_38_ < anInt3061; i_38_++) {
						float f_39_ = (float) anIntArray3059[i_37_] * f_24_ + f + f_36_;
						aFloatArrayArray3062[i_35_][i_38_] = f_39_;
						if (bool_26_) {
							f_36_ = f_39_;
						}
						i_37_++;
					}
				}
			}
		}
	}
}
