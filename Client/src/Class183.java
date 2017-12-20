/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class183
{
	private int[] anIntArray2181;
	private int anInt2182;
	private int anInt2183;
	private int anInt2184;
	private int anInt2185;
	private int anInt2186;
	private int anInt2187 = Node_Sub49.method2956(16);
	
	final void method1842(float[] fs, int i, boolean bool) {
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			fs[i_0_] = 0.0F;
		if (!bool) {
			int i_1_ = Node_Sub49.aClass242Array7611[anInt2185].anInt3061;
			int i_2_ = anInt2183 - anInt2182;
			int i_3_ = i_2_ / anInt2184;
			int[] is = new int[i_3_];
			for (int i_4_ = 0; i_4_ < 8; i_4_++) {
				int i_5_ = 0;
				while (i_5_ < i_3_) {
					if (i_4_ == 0) {
						int i_6_ = Node_Sub49.aClass242Array7611[anInt2185].method3056();
						for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
							if (i_5_ + i_7_ < i_3_) {
								is[i_5_ + i_7_] = i_6_ % anInt2186;
							}
							i_6_ /= anInt2186;
						}
					}
					for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
						int i_9_ = is[i_5_];
						int i_10_ = anIntArray2181[i_9_ * 8 + i_4_];
						if (i_10_ >= 0) {
							int i_11_ = anInt2182 + i_5_ * anInt2184;
							Class242 class242 = Node_Sub49.aClass242Array7611[i_10_];
							if (anInt2187 == 0) {
								int i_12_ = anInt2184 / class242.anInt3061;
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									float[] fs_14_ = class242.method3057();
									for (int i_15_ = 0; i_15_ < class242.anInt3061; i_15_++)
										fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_[i_15_];
								}
							} else {
								int i_16_ = 0;
								while (i_16_ < anInt2184) {
									float[] fs_17_ = class242.method3057();
									for (int i_18_ = 0; i_18_ < class242.anInt3061; i_18_++) {
										fs[i_11_ + i_16_] += fs_17_[i_18_];
										i_16_++;
									}
								}
							}
						}
						if (++i_5_ >= i_3_) {
							break;
						}
					}
				}
			}
		}
	}
	
	Class183() {
		anInt2182 = Node_Sub49.method2956(24);
		anInt2183 = Node_Sub49.method2956(24);
		anInt2184 = Node_Sub49.method2956(24) + 1;
		anInt2186 = Node_Sub49.method2956(6) + 1;
		anInt2185 = Node_Sub49.method2956(8);
		int[] is = new int[anInt2186];
		for (int i = 0; i < anInt2186; i++) {
			int i_19_ = 0;
			int i_20_ = Node_Sub49.method2956(3);
			boolean bool = Node_Sub49.method2965() != 0;
			if (bool) {
				i_19_ = Node_Sub49.method2956(5);
			}
			is[i] = i_19_ << 3 | i_20_;
		}
		anIntArray2181 = new int[anInt2186 * 8];
		for (int i = 0; i < anInt2186 * 8; i++)
			anIntArray2181[i] = (is[i >> 3] & 1 << (i & 0x7)) != 0 ? Node_Sub49.method2956(8) : -1;
	}
}
