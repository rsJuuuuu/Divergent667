/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class185
{
	protected boolean aBoolean2212 = false;
	protected int anInt2213;
	private float[] aFloatArray2214;
	private int anInt2215;
	protected int anInt2216;
	protected boolean aBoolean2217 = false;
	private int[] anIntArray2218;
	private Class374 aClass374_2219;
	protected int anInt2220;
	private PureJavaToolkit aPureJavaToolkit2221;
	protected int anInt2222;
	private boolean aBoolean2223 = false;
	protected int[] anIntArray2224;
	protected int anInt2225;
	protected boolean aBoolean2226 = true;
	private boolean aBoolean2227;
	private int anInt2228;
	private int anInt2229;
	private int anInt2230;
	private int[] anIntArray2231;
	private int anInt2232;
	private int anInt2233;
	private int anInt2234;
	private int anInt2235;
	private int[] anIntArray2236;
	private int anInt2237;
	private float aFloat2238;
	private boolean aBoolean2239;
	private int[] anIntArray2240;
	private float aFloat2241;
	private float aFloat2242;
	private int anInt2243;
	private int anInt2244;
	private int anInt2245;
	
	final int method1849() {
		return anIntArray2224[0] / anInt2215;
	}
	
	final void method1850(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, float f_5_, float f_6_, float f_7_, int i, int i_8_, int i_9_) {
		if (aBoolean2227) {
			aPureJavaToolkit2221.method1236((int) f_0_, (int) f, (int) f_3_, ~0xffffff | i, 1, (int) f_2_);
			aPureJavaToolkit2221.method1236((int) f_1_, (int) f_0_, (int) f_4_, ~0xffffff | i, 1, (int) f_3_);
			aPureJavaToolkit2221.method1236((int) f, (int) f_1_, (int) f_2_, ~0xffffff | i, 1, (int) f_4_);
		} else {
			float f_10_ = f_3_ - f_2_;
			float f_11_ = f_0_ - f;
			float f_12_ = f_4_ - f_2_;
			float f_13_ = f_1_ - f;
			float f_14_ = f_6_ - f_5_;
			float f_15_ = f_7_ - f_5_;
			float f_16_ = (float) ((i_8_ & 0xff0000) - (i & 0xff0000));
			float f_17_ = (float) ((i_9_ & 0xff0000) - (i & 0xff0000));
			float f_18_ = (float) ((i_8_ & 0xff00) - (i & 0xff00));
			float f_19_ = (float) ((i_9_ & 0xff00) - (i & 0xff00));
			float f_20_ = (float) ((i_8_ & 0xff) - (i & 0xff));
			float f_21_ = (float) ((i_9_ & 0xff) - (i & 0xff));
			float f_22_;
			if (f_1_ != f_0_) {
				f_22_ = (f_4_ - f_3_) / (f_1_ - f_0_);
			} else {
				f_22_ = 0.0F;
			}
			float f_23_;
			if (f_0_ != f) {
				f_23_ = f_10_ / f_11_;
			} else {
				f_23_ = 0.0F;
			}
			float f_24_;
			if (f_1_ != f) {
				f_24_ = f_12_ / f_13_;
			} else {
				f_24_ = 0.0F;
			}
			float f_25_ = f_10_ * f_13_ - f_12_ * f_11_;
			if (f_25_ != 0.0F) {
				float f_26_ = (f_14_ * f_13_ - f_15_ * f_11_) / f_25_;
				float f_27_ = (f_15_ * f_10_ - f_14_ * f_12_) / f_25_;
				float f_28_ = (f_16_ * f_13_ - f_17_ * f_11_) / f_25_;
				float f_29_ = (f_17_ * f_10_ - f_16_ * f_12_) / f_25_;
				float f_30_ = (f_18_ * f_13_ - f_19_ * f_11_) / f_25_;
				float f_31_ = (f_19_ * f_10_ - f_18_ * f_12_) / f_25_;
				float f_32_ = (f_20_ * f_13_ - f_21_ * f_11_) / f_25_;
				float f_33_ = (f_21_ * f_10_ - f_20_ * f_12_) / f_25_;
				if (f <= f_0_ && f <= f_1_) {
					if (!(f >= (float) anInt2225)) {
						if (f_0_ > (float) anInt2225) {
							f_0_ = (float) anInt2225;
						}
						if (f_1_ > (float) anInt2225) {
							f_1_ = (float) anInt2225;
						}
						f_5_ = f_5_ - f_26_ * f_2_ + f_26_;
						float f_34_ = (float) (i & 0xff0000) - f_28_ * f_2_ + f_28_;
						float f_35_ = (float) (i & 0xff00) - f_30_ * f_2_ + f_30_;
						float f_36_ = (float) (i & 0xff) - f_32_ * f_2_ + f_32_;
						if (f_0_ < f_1_) {
							f_4_ = f_2_;
							if (f < 0.0F) {
								f_4_ -= f_24_ * f;
								f_2_ -= f_23_ * f;
								f_5_ -= f_27_ * f;
								f_34_ -= f_29_ * f;
								f_35_ -= f_31_ * f;
								f_36_ -= f_33_ * f;
								f = 0.0F;
							}
							if (f_0_ < 0.0F) {
								f_3_ -= f_22_ * f_0_;
								f_0_ = 0.0F;
							}
							if (f != f_0_ && f_24_ < f_23_ || f == f_0_ && f_24_ > f_22_) {
								f_1_ -= f_0_;
								f_0_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_0_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_4_, (int) f_2_, f_5_, f_26_, f_34_, f_28_, f_35_, f_30_, f_36_, f_32_);
									f_4_ += f_24_;
									f_2_ += f_23_;
									f_5_ += f_27_;
									f_34_ += f_29_;
									f_35_ += f_31_;
									f_36_ += f_33_;
									f += (float) anInt2215;
								}
								while (--f_1_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_4_, (int) f_3_, f_5_, f_26_, f_34_, f_28_, f_35_, f_30_, f_36_, f_32_);
									f_4_ += f_24_;
									f_3_ += f_22_;
									f_5_ += f_27_;
									f_34_ += f_29_;
									f_35_ += f_31_;
									f_36_ += f_33_;
									f += (float) anInt2215;
								}
							} else {
								f_1_ -= f_0_;
								f_0_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_0_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_2_, (int) f_4_, f_5_, f_26_, f_34_, f_28_, f_35_, f_30_, f_36_, f_32_);
									f_4_ += f_24_;
									f_2_ += f_23_;
									f_5_ += f_27_;
									f_34_ += f_29_;
									f_35_ += f_31_;
									f_36_ += f_33_;
									f += (float) anInt2215;
								}
								while (--f_1_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_3_, (int) f_4_, f_5_, f_26_, f_34_, f_28_, f_35_, f_30_, f_36_, f_32_);
									f_4_ += f_24_;
									f_3_ += f_22_;
									f_5_ += f_27_;
									f_34_ += f_29_;
									f_35_ += f_31_;
									f_36_ += f_33_;
									f += (float) anInt2215;
								}
							}
						} else {
							f_3_ = f_2_;
							if (f < 0.0F) {
								f_3_ -= f_24_ * f;
								f_2_ -= f_23_ * f;
								f_5_ -= f_27_ * f;
								f_34_ -= f_29_ * f;
								f_35_ -= f_31_ * f;
								f_36_ -= f_33_ * f;
								f = 0.0F;
							}
							if (f_1_ < 0.0F) {
								f_4_ -= f_22_ * f_1_;
								f_1_ = 0.0F;
							}
							if (f != f_1_ && f_24_ < f_23_ || f == f_1_ && f_22_ > f_23_) {
								f_0_ -= f_1_;
								f_1_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_1_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_3_, (int) f_2_, f_5_, f_26_, f_34_, f_28_, f_35_, f_30_, f_36_, f_32_);
									f_3_ += f_24_;
									f_2_ += f_23_;
									f_5_ += f_27_;
									f_34_ += f_29_;
									f_35_ += f_31_;
									f_36_ += f_33_;
									f += (float) anInt2215;
								}
								while (--f_0_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_4_, (int) f_2_, f_5_, f_26_, f_34_, f_28_, f_35_, f_30_, f_36_, f_32_);
									f_4_ += f_22_;
									f_2_ += f_23_;
									f_5_ += f_27_;
									f_34_ += f_29_;
									f_35_ += f_31_;
									f_36_ += f_33_;
									f += (float) anInt2215;
								}
							} else {
								f_0_ -= f_1_;
								f_1_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_1_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_2_, (int) f_3_, f_5_, f_26_, f_34_, f_28_, f_35_, f_30_, f_36_, f_32_);
									f_3_ += f_24_;
									f_2_ += f_23_;
									f_5_ += f_27_;
									f_34_ += f_29_;
									f_35_ += f_31_;
									f_36_ += f_33_;
									f += (float) anInt2215;
								}
								while (--f_0_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_2_, (int) f_4_, f_5_, f_26_, f_34_, f_28_, f_35_, f_30_, f_36_, f_32_);
									f_4_ += f_22_;
									f_2_ += f_23_;
									f_5_ += f_27_;
									f_34_ += f_29_;
									f_35_ += f_31_;
									f_36_ += f_33_;
									f += (float) anInt2215;
								}
							}
						}
					}
				} else if (f_0_ <= f_1_) {
					if (!(f_0_ >= (float) anInt2225)) {
						if (f_1_ > (float) anInt2225) {
							f_1_ = (float) anInt2225;
						}
						if (f > (float) anInt2225) {
							f = (float) anInt2225;
						}
						f_6_ = f_6_ - f_26_ * f_3_ + f_26_;
						float f_37_ = (float) (i_8_ & 0xff0000) - f_28_ * f_3_ + f_28_;
						float f_38_ = (float) (i_8_ & 0xff00) - f_30_ * f_3_ + f_30_;
						float f_39_ = (float) (i_8_ & 0xff) - f_32_ * f_3_ + f_32_;
						if (f_1_ < f) {
							f_2_ = f_3_;
							if (f_0_ < 0.0F) {
								f_2_ -= f_23_ * f_0_;
								f_3_ -= f_22_ * f_0_;
								f_6_ -= f_27_ * f_0_;
								f_37_ -= f_29_ * f_0_;
								f_38_ -= f_31_ * f_0_;
								f_39_ -= f_33_ * f_0_;
								f_0_ = 0.0F;
							}
							if (f_1_ < 0.0F) {
								f_4_ -= f_24_ * f_1_;
								f_1_ = 0.0F;
							}
							if (f_0_ != f_1_ && f_23_ < f_22_ || f_0_ == f_1_ && f_23_ > f_24_) {
								f -= f_1_;
								f_1_ -= f_0_;
								f_0_ = (float) anIntArray2224[(int) f_0_];
								while (--f_1_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f_0_, 0, 0, (int) f_2_, (int) f_3_, f_6_, f_26_, f_37_, f_28_, f_38_, f_30_, f_39_, f_32_);
									f_2_ += f_23_;
									f_3_ += f_22_;
									f_6_ += f_27_;
									f_37_ += f_29_;
									f_38_ += f_31_;
									f_39_ += f_33_;
									f_0_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f_0_, 0, 0, (int) f_2_, (int) f_4_, f_6_, f_26_, f_37_, f_28_, f_38_, f_30_, f_39_, f_32_);
									f_2_ += f_23_;
									f_4_ += f_24_;
									f_6_ += f_27_;
									f_37_ += f_29_;
									f_38_ += f_31_;
									f_39_ += f_33_;
									f_0_ += (float) anInt2215;
								}
							} else {
								f -= f_1_;
								f_1_ -= f_0_;
								f_0_ = (float) anIntArray2224[(int) f_0_];
								while (--f_1_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f_0_, 0, 0, (int) f_3_, (int) f_2_, f_6_, f_26_, f_37_, f_28_, f_38_, f_30_, f_39_, f_32_);
									f_2_ += f_23_;
									f_3_ += f_22_;
									f_6_ += f_27_;
									f_37_ += f_29_;
									f_38_ += f_31_;
									f_39_ += f_33_;
									f_0_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f_0_, 0, 0, (int) f_4_, (int) f_2_, f_6_, f_26_, f_37_, f_28_, f_38_, f_30_, f_39_, f_32_);
									f_2_ += f_23_;
									f_4_ += f_24_;
									f_6_ += f_27_;
									f_37_ += f_29_;
									f_38_ += f_31_;
									f_39_ += f_33_;
									f_0_ += (float) anInt2215;
								}
							}
						} else {
							f_4_ = f_3_;
							if (f_0_ < 0.0F) {
								f_4_ -= f_23_ * f_0_;
								f_3_ -= f_22_ * f_0_;
								f_6_ -= f_27_ * f_0_;
								f_37_ -= f_29_ * f_0_;
								f_38_ -= f_31_ * f_0_;
								f_39_ -= f_33_ * f_0_;
								f_0_ = 0.0F;
							}
							if (f < 0.0F) {
								f_2_ -= f_24_ * f;
								f = 0.0F;
							}
							if (f_23_ < f_22_) {
								f_1_ -= f;
								f -= f_0_;
								f_0_ = (float) anIntArray2224[(int) f_0_];
								while (--f >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f_0_, 0, 0, (int) f_4_, (int) f_3_, f_6_, f_26_, f_37_, f_28_, f_38_, f_30_, f_39_, f_32_);
									f_4_ += f_23_;
									f_3_ += f_22_;
									f_6_ += f_27_;
									f_37_ += f_29_;
									f_38_ += f_31_;
									f_39_ += f_33_;
									f_0_ += (float) anInt2215;
								}
								while (--f_1_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f_0_, 0, 0, (int) f_2_, (int) f_3_, f_6_, f_26_, f_37_, f_28_, f_38_, f_30_, f_39_, f_32_);
									f_2_ += f_24_;
									f_3_ += f_22_;
									f_6_ += f_27_;
									f_37_ += f_29_;
									f_38_ += f_31_;
									f_39_ += f_33_;
									f_0_ += (float) anInt2215;
								}
							} else {
								f_1_ -= f;
								f -= f_0_;
								f_0_ = (float) anIntArray2224[(int) f_0_];
								while (--f >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f_0_, 0, 0, (int) f_3_, (int) f_4_, f_6_, f_26_, f_37_, f_28_, f_38_, f_30_, f_39_, f_32_);
									f_4_ += f_23_;
									f_3_ += f_22_;
									f_6_ += f_27_;
									f_37_ += f_29_;
									f_38_ += f_31_;
									f_39_ += f_33_;
									f_0_ += (float) anInt2215;
								}
								while (--f_1_ >= 0.0F) {
									method1857(anIntArray2218, aFloatArray2214, (int) f_0_, 0, 0, (int) f_3_, (int) f_2_, f_6_, f_26_, f_37_, f_28_, f_38_, f_30_, f_39_, f_32_);
									f_2_ += f_24_;
									f_3_ += f_22_;
									f_6_ += f_27_;
									f_37_ += f_29_;
									f_38_ += f_31_;
									f_39_ += f_33_;
									f_0_ += (float) anInt2215;
								}
							}
						}
					}
				} else if (!(f_1_ >= (float) anInt2225)) {
					if (f > (float) anInt2225) {
						f = (float) anInt2225;
					}
					if (f_0_ > (float) anInt2225) {
						f_0_ = (float) anInt2225;
					}
					f_7_ = f_7_ - f_26_ * f_4_ + f_26_;
					float f_40_ = (float) (i_9_ & 0xff0000) - f_28_ * f_4_ + f_28_;
					float f_41_ = (float) (i_9_ & 0xff00) - f_30_ * f_4_ + f_30_;
					float f_42_ = (float) (i_9_ & 0xff) - f_32_ * f_4_ + f_32_;
					if (f < f_0_) {
						f_3_ = f_4_;
						if (f_1_ < 0.0F) {
							f_3_ -= f_22_ * f_1_;
							f_4_ -= f_24_ * f_1_;
							f_7_ -= f_27_ * f_1_;
							f_40_ -= f_29_ * f_1_;
							f_41_ -= f_31_ * f_1_;
							f_42_ -= f_33_ * f_1_;
							f_1_ = 0.0F;
						}
						if (f < 0.0F) {
							f_2_ -= f_23_ * f;
							f = 0.0F;
						}
						if (f_22_ < f_24_) {
							f_0_ -= f;
							f -= f_1_;
							f_1_ = (float) anIntArray2224[(int) f_1_];
							while (--f >= 0.0F) {
								method1857(anIntArray2218, aFloatArray2214, (int) f_1_, 0, 0, (int) f_3_, (int) f_4_, f_7_, f_26_, f_40_, f_28_, f_41_, f_30_, f_42_, f_32_);
								f_3_ += f_22_;
								f_4_ += f_24_;
								f_7_ += f_27_;
								f_40_ += f_29_;
								f_41_ += f_31_;
								f_42_ += f_33_;
								f_1_ += (float) anInt2215;
							}
							while (--f_0_ >= 0.0F) {
								method1857(anIntArray2218, aFloatArray2214, (int) f_1_, 0, 0, (int) f_3_, (int) f_2_, f_7_, f_26_, f_40_, f_28_, f_41_, f_30_, f_42_, f_32_);
								f_3_ += f_22_;
								f_2_ += f_23_;
								f_7_ += f_27_;
								f_40_ += f_29_;
								f_41_ += f_31_;
								f_42_ += f_33_;
								f_1_ += (float) anInt2215;
							}
						} else {
							f_0_ -= f;
							f -= f_1_;
							f_1_ = (float) anIntArray2224[(int) f_1_];
							while (--f >= 0.0F) {
								method1857(anIntArray2218, aFloatArray2214, (int) f_1_, 0, 0, (int) f_4_, (int) f_3_, f_7_, f_26_, f_40_, f_28_, f_41_, f_30_, f_42_, f_32_);
								f_3_ += f_22_;
								f_4_ += f_24_;
								f_7_ += f_27_;
								f_40_ += f_29_;
								f_41_ += f_31_;
								f_42_ += f_33_;
								f_1_ += (float) anInt2215;
							}
							while (--f_0_ >= 0.0F) {
								method1857(anIntArray2218, aFloatArray2214, (int) f_1_, 0, 0, (int) f_2_, (int) f_3_, f_7_, f_26_, f_40_, f_28_, f_41_, f_30_, f_42_, f_32_);
								f_3_ += f_22_;
								f_2_ += f_23_;
								f_7_ += f_27_;
								f_40_ += f_29_;
								f_41_ += f_31_;
								f_42_ += f_33_;
								f_1_ += (float) anInt2215;
							}
						}
					} else {
						f_2_ = f_4_;
						if (f_1_ < 0.0F) {
							f_2_ -= f_22_ * f_1_;
							f_4_ -= f_24_ * f_1_;
							f_7_ -= f_27_ * f_1_;
							f_40_ -= f_29_ * f_1_;
							f_41_ -= f_31_ * f_1_;
							f_42_ -= f_33_ * f_1_;
							f_1_ = 0.0F;
						}
						if (f_0_ < 0.0F) {
							f_3_ -= f_23_ * f_0_;
							f_0_ = 0.0F;
						}
						if (f_22_ < f_24_) {
							f -= f_0_;
							f_0_ -= f_1_;
							f_1_ = (float) anIntArray2224[(int) f_1_];
							while (--f_0_ >= 0.0F) {
								method1857(anIntArray2218, aFloatArray2214, (int) f_1_, 0, 0, (int) f_2_, (int) f_4_, f_7_, f_26_, f_40_, f_28_, f_41_, f_30_, f_42_, f_32_);
								f_2_ += f_22_;
								f_4_ += f_24_;
								f_7_ += f_27_;
								f_40_ += f_29_;
								f_41_ += f_31_;
								f_42_ += f_33_;
								f_1_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1857(anIntArray2218, aFloatArray2214, (int) f_1_, 0, 0, (int) f_3_, (int) f_4_, f_7_, f_26_, f_40_, f_28_, f_41_, f_30_, f_42_, f_32_);
								f_3_ += f_23_;
								f_4_ += f_24_;
								f_7_ += f_27_;
								f_40_ += f_29_;
								f_41_ += f_31_;
								f_42_ += f_33_;
								f_1_ += (float) anInt2215;
							}
						} else {
							f -= f_0_;
							f_0_ -= f_1_;
							f_1_ = (float) anIntArray2224[(int) f_1_];
							while (--f_0_ >= 0.0F) {
								method1857(anIntArray2218, aFloatArray2214, (int) f_1_, 0, 0, (int) f_4_, (int) f_2_, f_7_, f_26_, f_40_, f_28_, f_41_, f_30_, f_42_, f_32_);
								f_2_ += f_22_;
								f_4_ += f_24_;
								f_7_ += f_27_;
								f_40_ += f_29_;
								f_41_ += f_31_;
								f_42_ += f_33_;
								f_1_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1857(anIntArray2218, aFloatArray2214, (int) f_1_, 0, 0, (int) f_4_, (int) f_3_, f_7_, f_26_, f_40_, f_28_, f_41_, f_30_, f_42_, f_32_);
								f_3_ += f_23_;
								f_4_ += f_24_;
								f_7_ += f_27_;
								f_40_ += f_29_;
								f_41_ += f_31_;
								f_42_ += f_33_;
								f_1_ += (float) anInt2215;
							}
						}
					}
				}
			}
		}
	}
	
	final void method1851(boolean bool) {
		aBoolean2227 = bool;
	}
	
	final void method1852(float f, float f_43_, float f_44_, float f_45_, float f_46_, float f_47_, float f_48_, float f_49_, float f_50_, int i, int i_51_, int i_52_) {
		if (aBoolean2227) {
			aPureJavaToolkit2221.method1236((int) f_43_, (int) f, (int) f_46_, ~0xffffff | i, 1, (int) f_45_);
			aPureJavaToolkit2221.method1236((int) f_44_, (int) f_43_, (int) f_47_, ~0xffffff | i, 1, (int) f_46_);
			aPureJavaToolkit2221.method1236((int) f, (int) f_44_, (int) f_45_, ~0xffffff | i, 1, (int) f_47_);
		} else {
			float f_53_ = f_46_ - f_45_;
			float f_54_ = f_43_ - f;
			float f_55_ = f_47_ - f_45_;
			float f_56_ = f_44_ - f;
			float f_57_ = f_49_ - f_48_;
			float f_58_ = f_50_ - f_48_;
			float f_59_ = (float) ((i_51_ & 0xff0000) - (i & 0xff0000));
			float f_60_ = (float) ((i_52_ & 0xff0000) - (i & 0xff0000));
			float f_61_ = (float) ((i_51_ & 0xff00) - (i & 0xff00));
			float f_62_ = (float) ((i_52_ & 0xff00) - (i & 0xff00));
			float f_63_ = (float) ((i_51_ & 0xff) - (i & 0xff));
			float f_64_ = (float) ((i_52_ & 0xff) - (i & 0xff));
			float f_65_;
			if (f_44_ != f_43_) {
				f_65_ = (f_47_ - f_46_) / (f_44_ - f_43_);
			} else {
				f_65_ = 0.0F;
			}
			float f_66_;
			if (f_43_ != f) {
				f_66_ = f_53_ / f_54_;
			} else {
				f_66_ = 0.0F;
			}
			float f_67_;
			if (f_44_ != f) {
				f_67_ = f_55_ / f_56_;
			} else {
				f_67_ = 0.0F;
			}
			float f_68_ = f_53_ * f_56_ - f_55_ * f_54_;
			if (f_68_ != 0.0F) {
				float f_69_ = (f_57_ * f_56_ - f_58_ * f_54_) / f_68_;
				float f_70_ = (f_58_ * f_53_ - f_57_ * f_55_) / f_68_;
				float f_71_ = (f_59_ * f_56_ - f_60_ * f_54_) / f_68_;
				float f_72_ = (f_60_ * f_53_ - f_59_ * f_55_) / f_68_;
				float f_73_ = (f_61_ * f_56_ - f_62_ * f_54_) / f_68_;
				float f_74_ = (f_62_ * f_53_ - f_61_ * f_55_) / f_68_;
				float f_75_ = (f_63_ * f_56_ - f_64_ * f_54_) / f_68_;
				float f_76_ = (f_64_ * f_53_ - f_63_ * f_55_) / f_68_;
				if (f <= f_43_ && f <= f_44_) {
					if (!(f >= (float) anInt2225)) {
						if (f_43_ > (float) anInt2225) {
							f_43_ = (float) anInt2225;
						}
						if (f_44_ > (float) anInt2225) {
							f_44_ = (float) anInt2225;
						}
						f_48_ = f_48_ - f_69_ * f_45_ + f_69_;
						float f_77_ = (float) (i & 0xff0000) - f_71_ * f_45_ + f_71_;
						float f_78_ = (float) (i & 0xff00) - f_73_ * f_45_ + f_73_;
						float f_79_ = (float) (i & 0xff) - f_75_ * f_45_ + f_75_;
						if (f_43_ < f_44_) {
							f_47_ = f_45_;
							if (f < 0.0F) {
								f_47_ -= f_67_ * f;
								f_45_ -= f_66_ * f;
								f_48_ -= f_70_ * f;
								f_77_ -= f_72_ * f;
								f_78_ -= f_74_ * f;
								f_79_ -= f_76_ * f;
								f = 0.0F;
							}
							if (f_43_ < 0.0F) {
								f_46_ -= f_65_ * f_43_;
								f_43_ = 0.0F;
							}
							if (f != f_43_ && f_67_ < f_66_ || f == f_43_ && f_67_ > f_65_) {
								f_44_ -= f_43_;
								f_43_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_43_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_47_, (int) f_45_, f_48_, f_69_, f_77_, f_71_, f_78_, f_73_, f_79_, f_75_);
									f_47_ += f_67_;
									f_45_ += f_66_;
									f_48_ += f_70_;
									f_77_ += f_72_;
									f_78_ += f_74_;
									f_79_ += f_76_;
									f += (float) anInt2215;
								}
								while (--f_44_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_47_, (int) f_46_, f_48_, f_69_, f_77_, f_71_, f_78_, f_73_, f_79_, f_75_);
									f_47_ += f_67_;
									f_46_ += f_65_;
									f_48_ += f_70_;
									f_77_ += f_72_;
									f_78_ += f_74_;
									f_79_ += f_76_;
									f += (float) anInt2215;
								}
							} else {
								f_44_ -= f_43_;
								f_43_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_43_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_45_, (int) f_47_, f_48_, f_69_, f_77_, f_71_, f_78_, f_73_, f_79_, f_75_);
									f_47_ += f_67_;
									f_45_ += f_66_;
									f_48_ += f_70_;
									f_77_ += f_72_;
									f_78_ += f_74_;
									f_79_ += f_76_;
									f += (float) anInt2215;
								}
								while (--f_44_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_46_, (int) f_47_, f_48_, f_69_, f_77_, f_71_, f_78_, f_73_, f_79_, f_75_);
									f_47_ += f_67_;
									f_46_ += f_65_;
									f_48_ += f_70_;
									f_77_ += f_72_;
									f_78_ += f_74_;
									f_79_ += f_76_;
									f += (float) anInt2215;
								}
							}
						} else {
							f_46_ = f_45_;
							if (f < 0.0F) {
								f_46_ -= f_67_ * f;
								f_45_ -= f_66_ * f;
								f_48_ -= f_70_ * f;
								f_77_ -= f_72_ * f;
								f_78_ -= f_74_ * f;
								f_79_ -= f_76_ * f;
								f = 0.0F;
							}
							if (f_44_ < 0.0F) {
								f_47_ -= f_65_ * f_44_;
								f_44_ = 0.0F;
							}
							if (f != f_44_ && f_67_ < f_66_ || f == f_44_ && f_65_ > f_66_) {
								f_43_ -= f_44_;
								f_44_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_44_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_46_, (int) f_45_, f_48_, f_69_, f_77_, f_71_, f_78_, f_73_, f_79_, f_75_);
									f_46_ += f_67_;
									f_45_ += f_66_;
									f_48_ += f_70_;
									f_77_ += f_72_;
									f_78_ += f_74_;
									f_79_ += f_76_;
									f += (float) anInt2215;
								}
								while (--f_43_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_47_, (int) f_45_, f_48_, f_69_, f_77_, f_71_, f_78_, f_73_, f_79_, f_75_);
									f_47_ += f_65_;
									f_45_ += f_66_;
									f_48_ += f_70_;
									f_77_ += f_72_;
									f_78_ += f_74_;
									f_79_ += f_76_;
									f += (float) anInt2215;
								}
							} else {
								f_43_ -= f_44_;
								f_44_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_44_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_45_, (int) f_46_, f_48_, f_69_, f_77_, f_71_, f_78_, f_73_, f_79_, f_75_);
									f_46_ += f_67_;
									f_45_ += f_66_;
									f_48_ += f_70_;
									f_77_ += f_72_;
									f_78_ += f_74_;
									f_79_ += f_76_;
									f += (float) anInt2215;
								}
								while (--f_43_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_45_, (int) f_47_, f_48_, f_69_, f_77_, f_71_, f_78_, f_73_, f_79_, f_75_);
									f_47_ += f_65_;
									f_45_ += f_66_;
									f_48_ += f_70_;
									f_77_ += f_72_;
									f_78_ += f_74_;
									f_79_ += f_76_;
									f += (float) anInt2215;
								}
							}
						}
					}
				} else if (f_43_ <= f_44_) {
					if (!(f_43_ >= (float) anInt2225)) {
						if (f_44_ > (float) anInt2225) {
							f_44_ = (float) anInt2225;
						}
						if (f > (float) anInt2225) {
							f = (float) anInt2225;
						}
						f_49_ = f_49_ - f_69_ * f_46_ + f_69_;
						float f_80_ = (float) (i_51_ & 0xff0000) - f_71_ * f_46_ + f_71_;
						float f_81_ = (float) (i_51_ & 0xff00) - f_73_ * f_46_ + f_73_;
						float f_82_ = (float) (i_51_ & 0xff) - f_75_ * f_46_ + f_75_;
						if (f_44_ < f) {
							f_45_ = f_46_;
							if (f_43_ < 0.0F) {
								f_45_ -= f_66_ * f_43_;
								f_46_ -= f_65_ * f_43_;
								f_49_ -= f_70_ * f_43_;
								f_80_ -= f_72_ * f_43_;
								f_81_ -= f_74_ * f_43_;
								f_82_ -= f_76_ * f_43_;
								f_43_ = 0.0F;
							}
							if (f_44_ < 0.0F) {
								f_47_ -= f_67_ * f_44_;
								f_44_ = 0.0F;
							}
							if (f_43_ != f_44_ && f_66_ < f_65_ || f_43_ == f_44_ && f_66_ > f_67_) {
								f -= f_44_;
								f_44_ -= f_43_;
								f_43_ = (float) anIntArray2224[(int) f_43_];
								while (--f_44_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f_43_, 0, 0, (int) f_45_, (int) f_46_, f_49_, f_69_, f_80_, f_71_, f_81_, f_73_, f_82_, f_75_);
									f_45_ += f_66_;
									f_46_ += f_65_;
									f_49_ += f_70_;
									f_80_ += f_72_;
									f_81_ += f_74_;
									f_82_ += f_76_;
									f_43_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f_43_, 0, 0, (int) f_45_, (int) f_47_, f_49_, f_69_, f_80_, f_71_, f_81_, f_73_, f_82_, f_75_);
									f_45_ += f_66_;
									f_47_ += f_67_;
									f_49_ += f_70_;
									f_80_ += f_72_;
									f_81_ += f_74_;
									f_82_ += f_76_;
									f_43_ += (float) anInt2215;
								}
							} else {
								f -= f_44_;
								f_44_ -= f_43_;
								f_43_ = (float) anIntArray2224[(int) f_43_];
								while (--f_44_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f_43_, 0, 0, (int) f_46_, (int) f_45_, f_49_, f_69_, f_80_, f_71_, f_81_, f_73_, f_82_, f_75_);
									f_45_ += f_66_;
									f_46_ += f_65_;
									f_49_ += f_70_;
									f_80_ += f_72_;
									f_81_ += f_74_;
									f_82_ += f_76_;
									f_43_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f_43_, 0, 0, (int) f_47_, (int) f_45_, f_49_, f_69_, f_80_, f_71_, f_81_, f_73_, f_82_, f_75_);
									f_45_ += f_66_;
									f_47_ += f_67_;
									f_49_ += f_70_;
									f_80_ += f_72_;
									f_81_ += f_74_;
									f_82_ += f_76_;
									f_43_ += (float) anInt2215;
								}
							}
						} else {
							f_47_ = f_46_;
							if (f_43_ < 0.0F) {
								f_47_ -= f_66_ * f_43_;
								f_46_ -= f_65_ * f_43_;
								f_49_ -= f_70_ * f_43_;
								f_80_ -= f_72_ * f_43_;
								f_81_ -= f_74_ * f_43_;
								f_82_ -= f_76_ * f_43_;
								f_43_ = 0.0F;
							}
							if (f < 0.0F) {
								f_45_ -= f_67_ * f;
								f = 0.0F;
							}
							if (f_66_ < f_65_) {
								f_44_ -= f;
								f -= f_43_;
								f_43_ = (float) anIntArray2224[(int) f_43_];
								while (--f >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f_43_, 0, 0, (int) f_47_, (int) f_46_, f_49_, f_69_, f_80_, f_71_, f_81_, f_73_, f_82_, f_75_);
									f_47_ += f_66_;
									f_46_ += f_65_;
									f_49_ += f_70_;
									f_80_ += f_72_;
									f_81_ += f_74_;
									f_82_ += f_76_;
									f_43_ += (float) anInt2215;
								}
								while (--f_44_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f_43_, 0, 0, (int) f_45_, (int) f_46_, f_49_, f_69_, f_80_, f_71_, f_81_, f_73_, f_82_, f_75_);
									f_45_ += f_67_;
									f_46_ += f_65_;
									f_49_ += f_70_;
									f_80_ += f_72_;
									f_81_ += f_74_;
									f_82_ += f_76_;
									f_43_ += (float) anInt2215;
								}
							} else {
								f_44_ -= f;
								f -= f_43_;
								f_43_ = (float) anIntArray2224[(int) f_43_];
								while (--f >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f_43_, 0, 0, (int) f_46_, (int) f_47_, f_49_, f_69_, f_80_, f_71_, f_81_, f_73_, f_82_, f_75_);
									f_47_ += f_66_;
									f_46_ += f_65_;
									f_49_ += f_70_;
									f_80_ += f_72_;
									f_81_ += f_74_;
									f_82_ += f_76_;
									f_43_ += (float) anInt2215;
								}
								while (--f_44_ >= 0.0F) {
									method1855(anIntArray2218, aFloatArray2214, (int) f_43_, 0, 0, (int) f_46_, (int) f_45_, f_49_, f_69_, f_80_, f_71_, f_81_, f_73_, f_82_, f_75_);
									f_45_ += f_67_;
									f_46_ += f_65_;
									f_49_ += f_70_;
									f_80_ += f_72_;
									f_81_ += f_74_;
									f_82_ += f_76_;
									f_43_ += (float) anInt2215;
								}
							}
						}
					}
				} else if (!(f_44_ >= (float) anInt2225)) {
					if (f > (float) anInt2225) {
						f = (float) anInt2225;
					}
					if (f_43_ > (float) anInt2225) {
						f_43_ = (float) anInt2225;
					}
					f_50_ = f_50_ - f_69_ * f_47_ + f_69_;
					float f_83_ = (float) (i_52_ & 0xff0000) - f_71_ * f_47_ + f_71_;
					float f_84_ = (float) (i_52_ & 0xff00) - f_73_ * f_47_ + f_73_;
					float f_85_ = (float) (i_52_ & 0xff) - f_75_ * f_47_ + f_75_;
					if (f < f_43_) {
						f_46_ = f_47_;
						if (f_44_ < 0.0F) {
							f_46_ -= f_65_ * f_44_;
							f_47_ -= f_67_ * f_44_;
							f_50_ -= f_70_ * f_44_;
							f_83_ -= f_72_ * f_44_;
							f_84_ -= f_74_ * f_44_;
							f_85_ -= f_76_ * f_44_;
							f_44_ = 0.0F;
						}
						if (f < 0.0F) {
							f_45_ -= f_66_ * f;
							f = 0.0F;
						}
						if (f_65_ < f_67_) {
							f_43_ -= f;
							f -= f_44_;
							f_44_ = (float) anIntArray2224[(int) f_44_];
							while (--f >= 0.0F) {
								method1855(anIntArray2218, aFloatArray2214, (int) f_44_, 0, 0, (int) f_46_, (int) f_47_, f_50_, f_69_, f_83_, f_71_, f_84_, f_73_, f_85_, f_75_);
								f_46_ += f_65_;
								f_47_ += f_67_;
								f_50_ += f_70_;
								f_83_ += f_72_;
								f_84_ += f_74_;
								f_85_ += f_76_;
								f_44_ += (float) anInt2215;
							}
							while (--f_43_ >= 0.0F) {
								method1855(anIntArray2218, aFloatArray2214, (int) f_44_, 0, 0, (int) f_46_, (int) f_45_, f_50_, f_69_, f_83_, f_71_, f_84_, f_73_, f_85_, f_75_);
								f_46_ += f_65_;
								f_45_ += f_66_;
								f_50_ += f_70_;
								f_83_ += f_72_;
								f_84_ += f_74_;
								f_85_ += f_76_;
								f_44_ += (float) anInt2215;
							}
						} else {
							f_43_ -= f;
							f -= f_44_;
							f_44_ = (float) anIntArray2224[(int) f_44_];
							while (--f >= 0.0F) {
								method1855(anIntArray2218, aFloatArray2214, (int) f_44_, 0, 0, (int) f_47_, (int) f_46_, f_50_, f_69_, f_83_, f_71_, f_84_, f_73_, f_85_, f_75_);
								f_46_ += f_65_;
								f_47_ += f_67_;
								f_50_ += f_70_;
								f_83_ += f_72_;
								f_84_ += f_74_;
								f_85_ += f_76_;
								f_44_ += (float) anInt2215;
							}
							while (--f_43_ >= 0.0F) {
								method1855(anIntArray2218, aFloatArray2214, (int) f_44_, 0, 0, (int) f_45_, (int) f_46_, f_50_, f_69_, f_83_, f_71_, f_84_, f_73_, f_85_, f_75_);
								f_46_ += f_65_;
								f_45_ += f_66_;
								f_50_ += f_70_;
								f_83_ += f_72_;
								f_84_ += f_74_;
								f_85_ += f_76_;
								f_44_ += (float) anInt2215;
							}
						}
					} else {
						f_45_ = f_47_;
						if (f_44_ < 0.0F) {
							f_45_ -= f_65_ * f_44_;
							f_47_ -= f_67_ * f_44_;
							f_50_ -= f_70_ * f_44_;
							f_83_ -= f_72_ * f_44_;
							f_84_ -= f_74_ * f_44_;
							f_85_ -= f_76_ * f_44_;
							f_44_ = 0.0F;
						}
						if (f_43_ < 0.0F) {
							f_46_ -= f_66_ * f_43_;
							f_43_ = 0.0F;
						}
						if (f_65_ < f_67_) {
							f -= f_43_;
							f_43_ -= f_44_;
							f_44_ = (float) anIntArray2224[(int) f_44_];
							while (--f_43_ >= 0.0F) {
								method1855(anIntArray2218, aFloatArray2214, (int) f_44_, 0, 0, (int) f_45_, (int) f_47_, f_50_, f_69_, f_83_, f_71_, f_84_, f_73_, f_85_, f_75_);
								f_45_ += f_65_;
								f_47_ += f_67_;
								f_50_ += f_70_;
								f_83_ += f_72_;
								f_84_ += f_74_;
								f_85_ += f_76_;
								f_44_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1855(anIntArray2218, aFloatArray2214, (int) f_44_, 0, 0, (int) f_46_, (int) f_47_, f_50_, f_69_, f_83_, f_71_, f_84_, f_73_, f_85_, f_75_);
								f_46_ += f_66_;
								f_47_ += f_67_;
								f_50_ += f_70_;
								f_83_ += f_72_;
								f_84_ += f_74_;
								f_85_ += f_76_;
								f_44_ += (float) anInt2215;
							}
						} else {
							f -= f_43_;
							f_43_ -= f_44_;
							f_44_ = (float) anIntArray2224[(int) f_44_];
							while (--f_43_ >= 0.0F) {
								method1855(anIntArray2218, aFloatArray2214, (int) f_44_, 0, 0, (int) f_47_, (int) f_45_, f_50_, f_69_, f_83_, f_71_, f_84_, f_73_, f_85_, f_75_);
								f_45_ += f_65_;
								f_47_ += f_67_;
								f_50_ += f_70_;
								f_83_ += f_72_;
								f_84_ += f_74_;
								f_85_ += f_76_;
								f_44_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1855(anIntArray2218, aFloatArray2214, (int) f_44_, 0, 0, (int) f_47_, (int) f_46_, f_50_, f_69_, f_83_, f_71_, f_84_, f_73_, f_85_, f_75_);
								f_46_ += f_66_;
								f_47_ += f_67_;
								f_50_ += f_70_;
								f_83_ += f_72_;
								f_84_ += f_74_;
								f_85_ += f_76_;
								f_44_ += (float) anInt2215;
							}
						}
					}
				}
			}
		}
	}
	
	final void method1853(float f, float f_86_, float f_87_, float f_88_, float f_89_, float f_90_, float f_91_, float f_92_, float f_93_, int i) {
		if (aBoolean2227) {
			aPureJavaToolkit2221.method1236((int) f_86_, (int) f, (int) f_89_, i, 1, (int) f_88_);
			aPureJavaToolkit2221.method1236((int) f_87_, (int) f_86_, (int) f_90_, i, 1, (int) f_89_);
			aPureJavaToolkit2221.method1236((int) f, (int) f_87_, (int) f_88_, i, 1, (int) f_90_);
		} else {
			float f_94_ = f_89_ - f_88_;
			float f_95_ = f_86_ - f;
			float f_96_ = f_90_ - f_88_;
			float f_97_ = f_87_ - f;
			float f_98_ = f_92_ - f_91_;
			float f_99_ = f_93_ - f_91_;
			float f_100_ = 0.0F;
			if (f_86_ != f) {
				f_100_ = (f_89_ - f_88_) / (f_86_ - f);
			}
			float f_101_ = 0.0F;
			if (f_87_ != f_86_) {
				f_101_ = (f_90_ - f_89_) / (f_87_ - f_86_);
			}
			float f_102_ = 0.0F;
			if (f_87_ != f) {
				f_102_ = (f_88_ - f_90_) / (f - f_87_);
			}
			float f_103_ = f_94_ * f_97_ - f_96_ * f_95_;
			if (f_103_ != 0.0F) {
				float f_104_ = (f_98_ * f_97_ - f_99_ * f_95_) / f_103_;
				float f_105_ = (f_99_ * f_94_ - f_98_ * f_96_) / f_103_;
				if (f <= f_86_ && f <= f_87_) {
					if (!(f >= (float) anInt2225)) {
						if (f_86_ > (float) anInt2225) {
							f_86_ = (float) anInt2225;
						}
						if (f_87_ > (float) anInt2225) {
							f_87_ = (float) anInt2225;
						}
						f_91_ = f_91_ - f_104_ * f_88_ + f_104_;
						if (f_86_ < f_87_) {
							f_90_ = f_88_;
							if (f < 0.0F) {
								f_90_ -= f_102_ * f;
								f_88_ -= f_100_ * f;
								f_91_ -= f_105_ * f;
								f = 0.0F;
							}
							if (f_86_ < 0.0F) {
								f_89_ -= f_101_ * f_86_;
								f_86_ = 0.0F;
							}
							if (f != f_86_ && f_102_ < f_100_ || f == f_86_ && f_102_ > f_101_) {
								f_87_ -= f_86_;
								f_86_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_86_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_90_, (int) f_88_, f_91_, f_104_);
									f_90_ += f_102_;
									f_88_ += f_100_;
									f_91_ += f_105_;
									f += (float) anInt2215;
								}
								while (--f_87_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_90_, (int) f_89_, f_91_, f_104_);
									f_90_ += f_102_;
									f_89_ += f_101_;
									f_91_ += f_105_;
									f += (float) anInt2215;
								}
							} else {
								f_87_ -= f_86_;
								f_86_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_86_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_88_, (int) f_90_, f_91_, f_104_);
									f_90_ += f_102_;
									f_88_ += f_100_;
									f_91_ += f_105_;
									f += (float) anInt2215;
								}
								while (--f_87_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_89_, (int) f_90_, f_91_, f_104_);
									f_90_ += f_102_;
									f_89_ += f_101_;
									f_91_ += f_105_;
									f += (float) anInt2215;
								}
							}
						} else {
							f_89_ = f_88_;
							if (f < 0.0F) {
								f_89_ -= f_102_ * f;
								f_88_ -= f_100_ * f;
								f_91_ -= f_105_ * f;
								f = 0.0F;
							}
							if (f_87_ < 0.0F) {
								f_90_ -= f_101_ * f_87_;
								f_87_ = 0.0F;
							}
							if (f != f_87_ && f_102_ < f_100_ || f == f_87_ && f_101_ > f_100_) {
								f_86_ -= f_87_;
								f_87_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_87_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_89_, (int) f_88_, f_91_, f_104_);
									f_89_ += f_102_;
									f_88_ += f_100_;
									f_91_ += f_105_;
									f += (float) anInt2215;
								}
								while (--f_86_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_90_, (int) f_88_, f_91_, f_104_);
									f_90_ += f_101_;
									f_88_ += f_100_;
									f_91_ += f_105_;
									f += (float) anInt2215;
								}
							} else {
								f_86_ -= f_87_;
								f_87_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_87_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_88_, (int) f_89_, f_91_, f_104_);
									f_89_ += f_102_;
									f_88_ += f_100_;
									f_91_ += f_105_;
									f += (float) anInt2215;
								}
								while (--f_86_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_88_, (int) f_90_, f_91_, f_104_);
									f_90_ += f_101_;
									f_88_ += f_100_;
									f_91_ += f_105_;
									f += (float) anInt2215;
								}
							}
						}
					}
				} else if (f_86_ <= f_87_) {
					if (!(f_86_ >= (float) anInt2225)) {
						if (f_87_ > (float) anInt2225) {
							f_87_ = (float) anInt2225;
						}
						if (f > (float) anInt2225) {
							f = (float) anInt2225;
						}
						f_92_ = f_92_ - f_104_ * f_89_ + f_104_;
						if (f_87_ < f) {
							f_88_ = f_89_;
							if (f_86_ < 0.0F) {
								f_88_ -= f_100_ * f_86_;
								f_89_ -= f_101_ * f_86_;
								f_92_ -= f_105_ * f_86_;
								f_86_ = 0.0F;
							}
							if (f_87_ < 0.0F) {
								f_90_ -= f_102_ * f_87_;
								f_87_ = 0.0F;
							}
							if (f_86_ != f_87_ && f_100_ < f_101_ || f_86_ == f_87_ && f_100_ > f_102_) {
								f -= f_87_;
								f_87_ -= f_86_;
								f_86_ = (float) anIntArray2224[(int) f_86_];
								while (--f_87_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f_86_, i, 0, (int) f_88_, (int) f_89_, f_92_, f_104_);
									f_88_ += f_100_;
									f_89_ += f_101_;
									f_92_ += f_105_;
									f_86_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f_86_, i, 0, (int) f_88_, (int) f_90_, f_92_, f_104_);
									f_88_ += f_100_;
									f_90_ += f_102_;
									f_92_ += f_105_;
									f_86_ += (float) anInt2215;
								}
							} else {
								f -= f_87_;
								f_87_ -= f_86_;
								f_86_ = (float) anIntArray2224[(int) f_86_];
								while (--f_87_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f_86_, i, 0, (int) f_89_, (int) f_88_, f_92_, f_104_);
									f_88_ += f_100_;
									f_89_ += f_101_;
									f_92_ += f_105_;
									f_86_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f_86_, i, 0, (int) f_90_, (int) f_88_, f_92_, f_104_);
									f_88_ += f_100_;
									f_90_ += f_102_;
									f_92_ += f_105_;
									f_86_ += (float) anInt2215;
								}
							}
						} else {
							f_90_ = f_89_;
							if (f_86_ < 0.0F) {
								f_90_ -= f_100_ * f_86_;
								f_89_ -= f_101_ * f_86_;
								f_92_ -= f_105_ * f_86_;
								f_86_ = 0.0F;
							}
							if (f < 0.0F) {
								f_88_ -= f_102_ * f;
								f = 0.0F;
							}
							if (f_100_ < f_101_) {
								f_87_ -= f;
								f -= f_86_;
								f_86_ = (float) anIntArray2224[(int) f_86_];
								while (--f >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f_86_, i, 0, (int) f_90_, (int) f_89_, f_92_, f_104_);
									f_90_ += f_100_;
									f_89_ += f_101_;
									f_92_ += f_105_;
									f_86_ += (float) anInt2215;
								}
								while (--f_87_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f_86_, i, 0, (int) f_88_, (int) f_89_, f_92_, f_104_);
									f_88_ += f_102_;
									f_89_ += f_101_;
									f_92_ += f_105_;
									f_86_ += (float) anInt2215;
								}
							} else {
								f_87_ -= f;
								f -= f_86_;
								f_86_ = (float) anIntArray2224[(int) f_86_];
								while (--f >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f_86_, i, 0, (int) f_89_, (int) f_90_, f_92_, f_104_);
									f_90_ += f_100_;
									f_89_ += f_101_;
									f_92_ += f_105_;
									f_86_ += (float) anInt2215;
								}
								while (--f_87_ >= 0.0F) {
									method1861(anIntArray2218, aFloatArray2214, (int) f_86_, i, 0, (int) f_89_, (int) f_88_, f_92_, f_104_);
									f_88_ += f_102_;
									f_89_ += f_101_;
									f_92_ += f_105_;
									f_86_ += (float) anInt2215;
								}
							}
						}
					}
				} else if (!(f_87_ >= (float) anInt2225)) {
					if (f > (float) anInt2225) {
						f = (float) anInt2225;
					}
					if (f_86_ > (float) anInt2225) {
						f_86_ = (float) anInt2225;
					}
					f_93_ = f_93_ - f_104_ * f_90_ + f_104_;
					if (f < f_86_) {
						f_89_ = f_90_;
						if (f_87_ < 0.0F) {
							f_89_ -= f_101_ * f_87_;
							f_90_ -= f_102_ * f_87_;
							f_93_ -= f_105_ * f_87_;
							f_87_ = 0.0F;
						}
						if (f < 0.0F) {
							f_88_ -= f_100_ * f;
							f = 0.0F;
						}
						if (f_101_ < f_102_) {
							f_86_ -= f;
							f -= f_87_;
							f_87_ = (float) anIntArray2224[(int) f_87_];
							while (--f >= 0.0F) {
								method1861(anIntArray2218, aFloatArray2214, (int) f_87_, i, 0, (int) f_89_, (int) f_90_, f_93_, f_104_);
								f_89_ += f_101_;
								f_90_ += f_102_;
								f_93_ += f_105_;
								f_87_ += (float) anInt2215;
							}
							while (--f_86_ >= 0.0F) {
								method1861(anIntArray2218, aFloatArray2214, (int) f_87_, i, 0, (int) f_89_, (int) f_88_, f_93_, f_104_);
								f_89_ += f_101_;
								f_88_ += f_100_;
								f_93_ += f_105_;
								f_87_ += (float) anInt2215;
							}
						} else {
							f_86_ -= f;
							f -= f_87_;
							f_87_ = (float) anIntArray2224[(int) f_87_];
							while (--f >= 0.0F) {
								method1861(anIntArray2218, aFloatArray2214, (int) f_87_, i, 0, (int) f_90_, (int) f_89_, f_93_, f_104_);
								f_89_ += f_101_;
								f_90_ += f_102_;
								f_93_ += f_105_;
								f_87_ += (float) anInt2215;
							}
							while (--f_86_ >= 0.0F) {
								method1861(anIntArray2218, aFloatArray2214, (int) f_87_, i, 0, (int) f_88_, (int) f_89_, f_93_, f_104_);
								f_89_ += f_101_;
								f_88_ += f_100_;
								f_93_ += f_105_;
								f_87_ += (float) anInt2215;
							}
						}
					} else {
						f_88_ = f_90_;
						if (f_87_ < 0.0F) {
							f_88_ -= f_101_ * f_87_;
							f_90_ -= f_102_ * f_87_;
							f_93_ -= f_105_ * f_87_;
							f_87_ = 0.0F;
						}
						if (f_86_ < 0.0F) {
							f_89_ -= f_100_ * f_86_;
							f_86_ = 0.0F;
						}
						if (f_101_ < f_102_) {
							f -= f_86_;
							f_86_ -= f_87_;
							f_87_ = (float) anIntArray2224[(int) f_87_];
							while (--f_86_ >= 0.0F) {
								method1861(anIntArray2218, aFloatArray2214, (int) f_87_, i, 0, (int) f_88_, (int) f_90_, f_93_, f_104_);
								f_88_ += f_101_;
								f_90_ += f_102_;
								f_93_ += f_105_;
								f_87_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1861(anIntArray2218, aFloatArray2214, (int) f_87_, i, 0, (int) f_89_, (int) f_90_, f_93_, f_104_);
								f_89_ += f_100_;
								f_90_ += f_102_;
								f_93_ += f_105_;
								f_87_ += (float) anInt2215;
							}
						} else {
							f -= f_86_;
							f_86_ -= f_87_;
							f_87_ = (float) anIntArray2224[(int) f_87_];
							while (--f_86_ >= 0.0F) {
								method1861(anIntArray2218, aFloatArray2214, (int) f_87_, i, 0, (int) f_90_, (int) f_88_, f_93_, f_104_);
								f_88_ += f_101_;
								f_90_ += f_102_;
								f_93_ += f_105_;
								f_87_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1861(anIntArray2218, aFloatArray2214, (int) f_87_, i, 0, (int) f_90_, (int) f_89_, f_93_, f_104_);
								f_89_ += f_100_;
								f_90_ += f_102_;
								f_93_ += f_105_;
								f_87_ += (float) anInt2215;
							}
						}
					}
				}
			}
		}
	}
	
	private final void method1854(int[] is, int[] is_106_, int i, int i_107_, int i_108_, float f, float f_109_, float f_110_, float f_111_, float f_112_, float f_113_, float f_114_, float f_115_, float f_116_, float f_117_, float f_118_, float f_119_, float f_120_, float f_121_, float f_122_, float f_123_) {
		int i_124_ = i_108_ - i_107_;
		float f_125_ = 1.0F / (float) i_124_;
		float f_126_ = (f_109_ - f) * f_125_;
		float f_127_ = (f_111_ - f_110_) * f_125_;
		float f_128_ = (f_113_ - f_112_) * f_125_;
		float f_129_ = (f_115_ - f_114_) * f_125_;
		float f_130_ = (f_117_ - f_116_) * f_125_;
		float f_131_ = (f_119_ - f_118_) * f_125_;
		float f_132_ = (f_121_ - f_120_) * f_125_;
		float f_133_ = (f_123_ - f_122_) * f_125_;
		if (aBoolean2217) {
			if (i_108_ > anInt2222) {
				i_108_ = anInt2222;
			}
			if (i_107_ < 0) {
				f -= f_126_ * (float) i_107_;
				f_110_ -= f_127_ * (float) i_107_;
				f_112_ -= f_128_ * (float) i_107_;
				f_114_ -= f_129_ * (float) i_107_;
				f_116_ -= f_130_ * (float) i_107_;
				f_118_ -= f_131_ * (float) i_107_;
				f_120_ -= f_132_ * (float) i_107_;
				f_122_ -= f_133_ * (float) i_107_;
				i_107_ = 0;
			}
		}
		if (i_107_ < i_108_) {
			i_124_ = i_108_ - i_107_;
			i += i_107_;
			while (i_124_-- > 0) {
				float f_134_ = 1.0F / f;
				if (f_134_ < aFloatArray2214[i]) {
					int i_135_ = (int) (f_110_ * f_134_ * (float) anInt2232);
					if (aBoolean2239) {
						i_135_ &= anInt2243;
					} else if (i_135_ < 0) {
						i_135_ = 0;
					} else if (i_135_ > anInt2243) {
						i_135_ = anInt2243;
					}
					int i_136_ = (int) (f_112_ * f_134_ * (float) anInt2232);
					if (aBoolean2239) {
						i_136_ &= anInt2243;
					} else if (i_136_ < 0) {
						i_136_ = 0;
					} else if (i_136_ > anInt2243) {
						i_136_ = anInt2243;
					}
					int i_137_ = anIntArray2240[i_136_ * anInt2232 + i_135_];
					int i_138_ = 255;
					if (anInt2229 == 2) {
						i_138_ = i_137_ >> 24 & 0xff;
					} else if (anInt2229 == 1) {
						i_138_ = i_137_ == 0 ? 0 : 255;
					} else {
						i_138_ = (int) f_116_;
					}
					if (i_138_ != 0) {
						if (i_138_ != 255) {
							int i_139_ = ~0xffffff | (int) (f_118_ * (float) (i_137_ >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_120_ * (float) (i_137_ >> 8 & 0xff)) & 0xff00 | (int) (f_122_ * (float) (i_137_ & 0xff)) >> 8;
							if (f_114_ != 0.0F) {
								int i_140_ = (int) (255.0F - f_114_);
								int i_141_ = ((anInt2230 & 0xff00ff) * (int) f_114_ & ~0xff00ff | (anInt2230 & 0xff00) * (int) f_114_ & 0xff0000) >>> 8;
								i_139_ = (((i_139_ & 0xff00ff) * i_140_ & ~0xff00ff | (i_139_ & 0xff00) * i_140_ & 0xff0000) >>> 8) + i_141_;
							}
							int i_142_ = is[i];
							int i_143_ = 255 - i_138_;
							i_139_ = ((i_142_ & 0xff00ff) * i_143_ + (i_139_ & 0xff00ff) * i_138_ & ~0xff00ff) + ((i_142_ & 0xff00) * i_143_ + (i_139_ & 0xff00) * i_138_ & 0xff0000) >> 8;
							is[i] = i_139_;
							aFloatArray2214[i] = f_134_;
						} else {
							int i_144_ = ~0xffffff | (int) (f_118_ * (float) (i_137_ >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_120_ * (float) (i_137_ >> 8 & 0xff)) & 0xff00 | (int) (f_122_ * (float) (i_137_ & 0xff)) >> 8;
							if (f_114_ != 0.0F) {
								int i_145_ = (int) (255.0F - f_114_);
								int i_146_ = ((anInt2230 & 0xff00ff) * (int) f_114_ & ~0xff00ff | (anInt2230 & 0xff00) * (int) f_114_ & 0xff0000) >>> 8;
								i_144_ = (((i_144_ & 0xff00ff) * i_145_ & ~0xff00ff | (i_144_ & 0xff00) * i_145_ & 0xff0000) >>> 8) + i_146_;
							}
							is[i] = i_144_;
							aFloatArray2214[i] = f_134_;
						}
					}
				}
				i++;
				f += f_126_;
				f_110_ += f_127_;
				f_112_ += f_128_;
				f_114_ += f_129_;
				f_116_ += f_130_;
				f_118_ += f_131_;
				f_120_ += f_132_;
				f_122_ += f_133_;
			}
		}
	}
	
	private final void method1855(int[] is, float[] fs, int i, int i_147_, int i_148_, int i_149_, int i_150_, float f, float f_151_, float f_152_, float f_153_, float f_154_, float f_155_, float f_156_, float f_157_) {
		if (aBoolean2217) {
			if (i_150_ > anInt2222) {
				i_150_ = anInt2222;
			}
			if (i_149_ < 0) {
				i_149_ = 0;
			}
		}
		if (i_149_ < i_150_) {
			if (aBoolean2223) {
				i += i_149_;
				f_152_ += f_153_ * (float) i_149_;
				f_154_ += f_155_ * (float) i_149_;
				f_156_ += f_157_ * (float) i_149_;
				if (aBoolean2226) {
					i_148_ = i_150_ - i_149_ >> 2;
					f_153_ *= 4.0F;
					f_155_ *= 4.0F;
					f_157_ *= 4.0F;
					if (anInt2220 == 0) {
						if (i_148_ > 0) {
							do {
								i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
								f_152_ += f_153_;
								f_154_ += f_155_;
								f_156_ += f_157_;
								is[i++] = i_147_;
								is[i++] = i_147_;
								is[i++] = i_147_;
								is[i++] = i_147_;
							} while (--i_148_ > 0);
						}
						i_148_ = i_150_ - i_149_ & 0x3;
						if (i_148_ > 0) {
							i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
							do
								is[i++] = i_147_;
							while (--i_148_ > 0);
						}
					} else if (!aBoolean2212) {
						int i_158_ = anInt2220;
						int i_159_ = 256 - anInt2220;
						if (i_148_ > 0) {
							do {
								i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
								f_152_ += f_153_;
								f_154_ += f_155_;
								f_156_ += f_157_;
								i_147_ = ((i_147_ & 0xff00ff) * i_159_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_159_ >> 8 & 0xff00);
								int i_160_ = is[i];
								is[i++] = (i_159_ | i_160_ >> 24) << 24 | i_147_ + ((i_160_ & 0xff00ff) * i_158_ >> 8 & 0xff00ff) + ((i_160_ & 0xff00) * i_158_ >> 8 & 0xff00);
								i_160_ = is[i];
								is[i++] = (i_159_ | i_160_ >> 24) << 24 | i_147_ + ((i_160_ & 0xff00ff) * i_158_ >> 8 & 0xff00ff) + ((i_160_ & 0xff00) * i_158_ >> 8 & 0xff00);
								i_160_ = is[i];
								is[i++] = (i_159_ | i_160_ >> 24) << 24 | i_147_ + ((i_160_ & 0xff00ff) * i_158_ >> 8 & 0xff00ff) + ((i_160_ & 0xff00) * i_158_ >> 8 & 0xff00);
								i_160_ = is[i];
								is[i++] = (i_159_ | i_160_ >> 24) << 24 | i_147_ + ((i_160_ & 0xff00ff) * i_158_ >> 8 & 0xff00ff) + ((i_160_ & 0xff00) * i_158_ >> 8 & 0xff00);
							} while (--i_148_ > 0);
						}
						i_148_ = i_150_ - i_149_ & 0x3;
						if (i_148_ > 0) {
							i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
							i_147_ = ((i_147_ & 0xff00ff) * i_159_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_159_ >> 8 & 0xff00);
							do {
								int i_161_ = is[i];
								is[i++] = (i_159_ | i_161_ >> 24) << 24 | i_147_ + ((i_161_ & 0xff00ff) * i_158_ >> 8 & 0xff00ff) + ((i_161_ & 0xff00) * i_158_ >> 8 & 0xff00);
							} while (--i_148_ > 0);
						}
					} else {
						if (i_148_ > 0) {
							do {
								i_147_ = (int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff;
								f_152_ += f_153_;
								f_154_ += f_155_;
								f_156_ += f_157_;
								int[] is_162_ = is;
								int i_163_ = i++;
								int i_164_ = i_147_;
								int i_165_ = is_162_[i_163_];
								int i_166_ = i_164_ + i_165_;
								int i_167_ = (i_164_ & 0xff00ff) + (i_165_ & 0xff00ff);
								i_165_ = (i_167_ & 0x1000100) + (i_166_ - i_167_ & 0x10000);
								is_162_[i_163_] = ~0xffffff | i_166_ - i_165_ | i_165_ - (i_165_ >>> 8);
								int[] is_168_ = is;
								int i_169_ = i++;
								int i_170_ = i_147_;
								int i_171_ = is_168_[i_169_];
								int i_172_ = i_170_ + i_171_;
								int i_173_ = (i_170_ & 0xff00ff) + (i_171_ & 0xff00ff);
								i_171_ = (i_173_ & 0x1000100) + (i_172_ - i_173_ & 0x10000);
								is_168_[i_169_] = ~0xffffff | i_172_ - i_171_ | i_171_ - (i_171_ >>> 8);
								int[] is_174_ = is;
								int i_175_ = i++;
								int i_176_ = i_147_;
								int i_177_ = is_174_[i_175_];
								int i_178_ = i_176_ + i_177_;
								int i_179_ = (i_176_ & 0xff00ff) + (i_177_ & 0xff00ff);
								i_177_ = (i_179_ & 0x1000100) + (i_178_ - i_179_ & 0x10000);
								is_174_[i_175_] = ~0xffffff | i_178_ - i_177_ | i_177_ - (i_177_ >>> 8);
								int[] is_180_ = is;
								int i_181_ = i++;
								int i_182_ = i_147_;
								int i_183_ = is_180_[i_181_];
								int i_184_ = i_182_ + i_183_;
								int i_185_ = (i_182_ & 0xff00ff) + (i_183_ & 0xff00ff);
								i_183_ = (i_185_ & 0x1000100) + (i_184_ - i_185_ & 0x10000);
								is_180_[i_181_] = ~0xffffff | i_184_ - i_183_ | i_183_ - (i_183_ >>> 8);
							} while (--i_148_ > 0);
						}
						i_148_ = i_150_ - i_149_ & 0x3;
						if (i_148_ > 0) {
							i_147_ = (int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff;
							do {
								int[] is_186_ = is;
								int i_187_ = i++;
								int i_188_ = i_147_;
								int i_189_ = is_186_[i_187_];
								int i_190_ = i_188_ + i_189_;
								int i_191_ = (i_188_ & 0xff00ff) + (i_189_ & 0xff00ff);
								i_189_ = (i_191_ & 0x1000100) + (i_190_ - i_191_ & 0x10000);
								is_186_[i_187_] = ~0xffffff | i_190_ - i_189_ | i_189_ - (i_189_ >>> 8);
							} while (--i_148_ > 0);
						}
					}
				} else {
					i_148_ = i_150_ - i_149_;
					if (anInt2220 == 0) {
						do {
							is[i++] = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
							f_152_ += f_153_;
							f_154_ += f_155_;
							f_156_ += f_157_;
						} while (--i_148_ > 0);
					} else if (!aBoolean2212) {
						int i_192_ = anInt2220;
						int i_193_ = 256 - anInt2220;
						do {
							i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
							f_152_ += f_153_;
							f_154_ += f_155_;
							f_156_ += f_157_;
							i_147_ = ((i_147_ & 0xff00ff) * i_193_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_193_ >> 8 & 0xff00);
							int i_194_ = is[i];
							is[i++] = (i_193_ | i_194_ >> 24) << 24 | i_147_ + ((i_194_ & 0xff00ff) * i_192_ >> 8 & 0xff00ff) + ((i_194_ & 0xff00) * i_192_ >> 8 & 0xff00);
						} while (--i_148_ > 0);
					} else {
						do {
							int[] is_195_ = is;
							int i_196_ = i++;
							int i_197_ = (int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff;
							int i_198_ = is_195_[i_196_];
							int i_199_ = i_197_ + i_198_;
							int i_200_ = (i_197_ & 0xff00ff) + (i_198_ & 0xff00ff);
							i_198_ = (i_200_ & 0x1000100) + (i_199_ - i_200_ & 0x10000);
							is_195_[i_196_] = ~0xffffff | i_199_ - i_198_ | i_198_ - (i_198_ >>> 8);
							f_152_ += f_153_;
							f_154_ += f_155_;
							f_156_ += f_157_;
						} while (--i_148_ > 0);
					}
				}
			} else {
				i += i_149_ - 1;
				f += f_151_ * (float) i_149_;
				f_152_ += f_153_ * (float) i_149_;
				f_154_ += f_155_ * (float) i_149_;
				f_156_ += f_157_ * (float) i_149_;
				if (aClass374_2219.aBoolean4615) {
					if (aBoolean2226) {
						i_148_ = i_150_ - i_149_ >> 2;
						f_153_ *= 4.0F;
						f_155_ *= 4.0F;
						f_157_ *= 4.0F;
						if (anInt2220 == 0) {
							if (i_148_ > 0) {
								do {
									i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
									f_152_ += f_153_;
									f_154_ += f_155_;
									f_156_ += f_157_;
									if (f < fs[++i]) {
										is[i] = i_147_;
										fs[i] = f;
									}
									f += f_151_;
									if (f < fs[++i]) {
										is[i] = i_147_;
										fs[i] = f;
									}
									f += f_151_;
									if (f < fs[++i]) {
										is[i] = i_147_;
										fs[i] = f;
									}
									f += f_151_;
									if (f < fs[++i]) {
										is[i] = i_147_;
										fs[i] = f;
									}
									f += f_151_;
								} while (--i_148_ > 0);
							}
							i_148_ = i_150_ - i_149_ & 0x3;
							if (i_148_ > 0) {
								i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
								do {
									if (f < fs[++i]) {
										is[i] = i_147_;
										fs[i] = f;
									}
									f += f_151_;
								} while (--i_148_ > 0);
							}
						} else if (!aBoolean2212) {
							int i_201_ = anInt2220;
							int i_202_ = 256 - anInt2220;
							if (i_148_ > 0) {
								do {
									i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
									f_152_ += f_153_;
									f_154_ += f_155_;
									f_156_ += f_157_;
									i_147_ = ((i_147_ & 0xff00ff) * i_202_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_202_ >> 8 & 0xff00);
									if (f < fs[++i]) {
										int i_203_ = is[i];
										is[i] = (i_202_ | i_203_ >> 24) << 24 | i_147_ + ((i_203_ & 0xff00ff) * i_201_ >> 8 & 0xff00ff) + ((i_203_ & 0xff00) * i_201_ >> 8 & 0xff00);
										fs[i] = f;
									}
									f += f_151_;
									if (f < fs[++i]) {
										int i_204_ = is[i];
										is[i] = (i_202_ | i_204_ >> 24) << 24 | i_147_ + ((i_204_ & 0xff00ff) * i_201_ >> 8 & 0xff00ff) + ((i_204_ & 0xff00) * i_201_ >> 8 & 0xff00);
										fs[i] = f;
									}
									f += f_151_;
									if (f < fs[++i]) {
										int i_205_ = is[i];
										is[i] = (i_202_ | i_205_ >> 24) << 24 | i_147_ + ((i_205_ & 0xff00ff) * i_201_ >> 8 & 0xff00ff) + ((i_205_ & 0xff00) * i_201_ >> 8 & 0xff00);
										fs[i] = f;
									}
									f += f_151_;
									if (f < fs[++i]) {
										int i_206_ = is[i];
										is[i] = (i_202_ | i_206_ >> 24) << 24 | i_147_ + ((i_206_ & 0xff00ff) * i_201_ >> 8 & 0xff00ff) + ((i_206_ & 0xff00) * i_201_ >> 8 & 0xff00);
										fs[i] = f;
									}
									f += f_151_;
								} while (--i_148_ > 0);
							}
							i_148_ = i_150_ - i_149_ & 0x3;
							if (i_148_ > 0) {
								i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
								i_147_ = ((i_147_ & 0xff00ff) * i_202_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_202_ >> 8 & 0xff00);
								do {
									if (f < fs[++i]) {
										int i_207_ = is[i];
										is[i] = (i_202_ | i_207_ >> 24) << 24 | i_147_ + ((i_207_ & 0xff00ff) * i_201_ >> 8 & 0xff00ff) + ((i_207_ & 0xff00) * i_201_ >> 8 & 0xff00);
										fs[i] = f;
									}
									f += f_151_;
								} while (--i_148_ > 0);
							}
						} else {
							if (i_148_ > 0) {
								do {
									i_147_ = (int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff;
									f_152_ += f_153_;
									f_154_ += f_155_;
									f_156_ += f_157_;
									if (f < fs[++i]) {
										int[] is_208_ = is;
										int i_209_ = i;
										int i_210_ = i_147_;
										int i_211_ = is_208_[i_209_];
										int i_212_ = i_210_ + i_211_;
										int i_213_ = (i_210_ & 0xff00ff) + (i_211_ & 0xff00ff);
										i_211_ = (i_213_ & 0x1000100) + (i_212_ - i_213_ & 0x10000);
										is_208_[i_209_] = ~0xffffff | i_212_ - i_211_ | i_211_ - (i_211_ >>> 8);
										fs[i] = f;
									}
									f += f_151_;
									if (f < fs[++i]) {
										int[] is_214_ = is;
										int i_215_ = i;
										int i_216_ = i_147_;
										int i_217_ = is_214_[i_215_];
										int i_218_ = i_216_ + i_217_;
										int i_219_ = (i_216_ & 0xff00ff) + (i_217_ & 0xff00ff);
										i_217_ = (i_219_ & 0x1000100) + (i_218_ - i_219_ & 0x10000);
										is_214_[i_215_] = ~0xffffff | i_218_ - i_217_ | i_217_ - (i_217_ >>> 8);
										fs[i] = f;
									}
									f += f_151_;
									if (f < fs[++i]) {
										int[] is_220_ = is;
										int i_221_ = i;
										int i_222_ = i_147_;
										int i_223_ = is_220_[i_221_];
										int i_224_ = i_222_ + i_223_;
										int i_225_ = (i_222_ & 0xff00ff) + (i_223_ & 0xff00ff);
										i_223_ = (i_225_ & 0x1000100) + (i_224_ - i_225_ & 0x10000);
										is_220_[i_221_] = ~0xffffff | i_224_ - i_223_ | i_223_ - (i_223_ >>> 8);
										fs[i] = f;
									}
									f += f_151_;
									if (f < fs[++i]) {
										int[] is_226_ = is;
										int i_227_ = i;
										int i_228_ = i_147_;
										int i_229_ = is_226_[i_227_];
										int i_230_ = i_228_ + i_229_;
										int i_231_ = (i_228_ & 0xff00ff) + (i_229_ & 0xff00ff);
										i_229_ = (i_231_ & 0x1000100) + (i_230_ - i_231_ & 0x10000);
										is_226_[i_227_] = ~0xffffff | i_230_ - i_229_ | i_229_ - (i_229_ >>> 8);
										fs[i] = f;
									}
									f += f_151_;
								} while (--i_148_ > 0);
							}
							i_148_ = i_150_ - i_149_ & 0x3;
							if (i_148_ > 0) {
								i_147_ = (int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff;
								do {
									if (f < fs[++i]) {
										int[] is_232_ = is;
										int i_233_ = i;
										int i_234_ = i_147_;
										int i_235_ = is_232_[i_233_];
										int i_236_ = i_234_ + i_235_;
										int i_237_ = (i_234_ & 0xff00ff) + (i_235_ & 0xff00ff);
										i_235_ = (i_237_ & 0x1000100) + (i_236_ - i_237_ & 0x10000);
										is_232_[i_233_] = ~0xffffff | i_236_ - i_235_ | i_235_ - (i_235_ >>> 8);
										fs[i] = f;
									}
									f += f_151_;
								} while (--i_148_ > 0);
							}
						}
					} else {
						i_148_ = i_150_ - i_149_;
						if (anInt2220 == 0) {
							do {
								if (f < fs[++i]) {
									is[i] = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
									fs[i] = f;
								}
								f += f_151_;
								f_152_ += f_153_;
								f_154_ += f_155_;
								f_156_ += f_157_;
							} while (--i_148_ > 0);
						} else if (!aBoolean2212) {
							int i_238_ = anInt2220;
							int i_239_ = 256 - anInt2220;
							do {
								if (f < fs[++i]) {
									i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
									i_147_ = ((i_147_ & 0xff00ff) * i_239_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_239_ >> 8 & 0xff00);
									int i_240_ = is[i];
									is[i] = (i_239_ | i_240_ >> 24) << 24 | i_147_ + ((i_240_ & 0xff00ff) * i_238_ >> 8 & 0xff00ff) + ((i_240_ & 0xff00) * i_238_ >> 8 & 0xff00);
									fs[i] = f;
								}
								f += f_151_;
								f_152_ += f_153_;
								f_154_ += f_155_;
								f_156_ += f_157_;
							} while (--i_148_ > 0);
						} else {
							do {
								if (f < fs[++i]) {
									int[] is_241_ = is;
									int i_242_ = i;
									int i_243_ = (int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff;
									int i_244_ = is_241_[i_242_];
									int i_245_ = i_243_ + i_244_;
									int i_246_ = (i_243_ & 0xff00ff) + (i_244_ & 0xff00ff);
									i_244_ = (i_246_ & 0x1000100) + (i_245_ - i_246_ & 0x10000);
									is_241_[i_242_] = ~0xffffff | i_245_ - i_244_ | i_244_ - (i_244_ >>> 8);
									fs[i] = f;
								}
								f += f_151_;
								f_152_ += f_153_;
								f_154_ += f_155_;
								f_156_ += f_157_;
							} while (--i_148_ > 0);
						}
					}
				} else if (aBoolean2226) {
					i_148_ = i_150_ - i_149_ >> 2;
					f_153_ *= 4.0F;
					f_155_ *= 4.0F;
					f_157_ *= 4.0F;
					if (anInt2220 == 0) {
						if (i_148_ > 0) {
							do {
								i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
								f_152_ += f_153_;
								f_154_ += f_155_;
								f_156_ += f_157_;
								if (f < fs[++i]) {
									is[i] = i_147_;
								}
								f += f_151_;
								if (f < fs[++i]) {
									is[i] = i_147_;
								}
								f += f_151_;
								if (f < fs[++i]) {
									is[i] = i_147_;
								}
								f += f_151_;
								if (f < fs[++i]) {
									is[i] = i_147_;
								}
								f += f_151_;
							} while (--i_148_ > 0);
						}
						i_148_ = i_150_ - i_149_ & 0x3;
						if (i_148_ > 0) {
							i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
							do {
								if (f < fs[++i]) {
									is[i] = i_147_;
								}
								f += f_151_;
							} while (--i_148_ > 0);
						}
					} else if (!aBoolean2212) {
						int i_247_ = anInt2220;
						int i_248_ = 256 - anInt2220;
						if (i_148_ > 0) {
							do {
								i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
								f_152_ += f_153_;
								f_154_ += f_155_;
								f_156_ += f_157_;
								i_147_ = ((i_147_ & 0xff00ff) * i_248_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_248_ >> 8 & 0xff00);
								if (f < fs[++i]) {
									int i_249_ = is[i];
									is[i] = (i_248_ | i_249_ >> 24) << 24 | i_147_ + ((i_249_ & 0xff00ff) * i_247_ >> 8 & 0xff00ff) + ((i_249_ & 0xff00) * i_247_ >> 8 & 0xff00);
								}
								f += f_151_;
								if (f < fs[++i]) {
									int i_250_ = is[i];
									is[i] = (i_248_ | i_250_ >> 24) << 24 | i_147_ + ((i_250_ & 0xff00ff) * i_247_ >> 8 & 0xff00ff) + ((i_250_ & 0xff00) * i_247_ >> 8 & 0xff00);
								}
								f += f_151_;
								if (f < fs[++i]) {
									int i_251_ = is[i];
									is[i] = (i_248_ | i_251_ >> 24) << 24 | i_147_ + ((i_251_ & 0xff00ff) * i_247_ >> 8 & 0xff00ff) + ((i_251_ & 0xff00) * i_247_ >> 8 & 0xff00);
								}
								f += f_151_;
								if (f < fs[++i]) {
									int i_252_ = is[i];
									is[i] = (i_248_ | i_252_ >> 24) << 24 | i_147_ + ((i_252_ & 0xff00ff) * i_247_ >> 8 & 0xff00ff) + ((i_252_ & 0xff00) * i_247_ >> 8 & 0xff00);
								}
								f += f_151_;
							} while (--i_148_ > 0);
						}
						i_148_ = i_150_ - i_149_ & 0x3;
						if (i_148_ > 0) {
							i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
							i_147_ = ((i_147_ & 0xff00ff) * i_248_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_248_ >> 8 & 0xff00);
							do {
								if (f < fs[++i]) {
									int i_253_ = is[i];
									is[i] = (i_248_ | i_253_ >> 24) << 24 | i_147_ + ((i_253_ & 0xff00ff) * i_247_ >> 8 & 0xff00ff) + ((i_253_ & 0xff00) * i_247_ >> 8 & 0xff00);
								}
								f += f_151_;
							} while (--i_148_ > 0);
						}
					} else {
						if (i_148_ > 0) {
							do {
								i_147_ = (int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff;
								f_152_ += f_153_;
								f_154_ += f_155_;
								f_156_ += f_157_;
								if (f < fs[++i]) {
									int[] is_254_ = is;
									int i_255_ = i;
									int i_256_ = i_147_;
									int i_257_ = is_254_[i_255_];
									int i_258_ = i_256_ + i_257_;
									int i_259_ = (i_256_ & 0xff00ff) + (i_257_ & 0xff00ff);
									i_257_ = (i_259_ & 0x1000100) + (i_258_ - i_259_ & 0x10000);
									is_254_[i_255_] = ~0xffffff | i_258_ - i_257_ | i_257_ - (i_257_ >>> 8);
								}
								f += f_151_;
								if (f < fs[++i]) {
									int[] is_260_ = is;
									int i_261_ = i;
									int i_262_ = i_147_;
									int i_263_ = is_260_[i_261_];
									int i_264_ = i_262_ + i_263_;
									int i_265_ = (i_262_ & 0xff00ff) + (i_263_ & 0xff00ff);
									i_263_ = (i_265_ & 0x1000100) + (i_264_ - i_265_ & 0x10000);
									is_260_[i_261_] = ~0xffffff | i_264_ - i_263_ | i_263_ - (i_263_ >>> 8);
								}
								f += f_151_;
								if (f < fs[++i]) {
									int[] is_266_ = is;
									int i_267_ = i;
									int i_268_ = i_147_;
									int i_269_ = is_266_[i_267_];
									int i_270_ = i_268_ + i_269_;
									int i_271_ = (i_268_ & 0xff00ff) + (i_269_ & 0xff00ff);
									i_269_ = (i_271_ & 0x1000100) + (i_270_ - i_271_ & 0x10000);
									is_266_[i_267_] = ~0xffffff | i_270_ - i_269_ | i_269_ - (i_269_ >>> 8);
								}
								f += f_151_;
								if (f < fs[++i]) {
									int[] is_272_ = is;
									int i_273_ = i;
									int i_274_ = i_147_;
									int i_275_ = is_272_[i_273_];
									int i_276_ = i_274_ + i_275_;
									int i_277_ = (i_274_ & 0xff00ff) + (i_275_ & 0xff00ff);
									i_275_ = (i_277_ & 0x1000100) + (i_276_ - i_277_ & 0x10000);
									is_272_[i_273_] = ~0xffffff | i_276_ - i_275_ | i_275_ - (i_275_ >>> 8);
								}
								f += f_151_;
							} while (--i_148_ > 0);
						}
						i_148_ = i_150_ - i_149_ & 0x3;
						if (i_148_ > 0) {
							i_147_ = (int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff;
							do {
								if (f < fs[++i]) {
									int[] is_278_ = is;
									int i_279_ = i;
									int i_280_ = i_147_;
									int i_281_ = is_278_[i_279_];
									int i_282_ = i_280_ + i_281_;
									int i_283_ = (i_280_ & 0xff00ff) + (i_281_ & 0xff00ff);
									i_281_ = (i_283_ & 0x1000100) + (i_282_ - i_283_ & 0x10000);
									is_278_[i_279_] = ~0xffffff | i_282_ - i_281_ | i_281_ - (i_281_ >>> 8);
								}
								f += f_151_;
							} while (--i_148_ > 0);
						}
					}
				} else {
					i_148_ = i_150_ - i_149_;
					if (anInt2220 == 0) {
						do {
							if (f < fs[++i]) {
								is[i] = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
							}
							f += f_151_;
							f_152_ += f_153_;
							f_154_ += f_155_;
							f_156_ += f_157_;
						} while (--i_148_ > 0);
					} else if (!aBoolean2212) {
						int i_284_ = anInt2220;
						int i_285_ = 256 - anInt2220;
						do {
							if (f < fs[++i]) {
								i_147_ = ~0xffffff | ((int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff);
								i_147_ = ((i_147_ & 0xff00ff) * i_285_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_285_ >> 8 & 0xff00);
								int i_286_ = is[i];
								is[i] = (i_285_ | i_286_ >> 24) << 24 | i_147_ + ((i_286_ & 0xff00ff) * i_284_ >> 8 & 0xff00ff) + ((i_286_ & 0xff00) * i_284_ >> 8 & 0xff00);
							}
							f += f_151_;
							f_152_ += f_153_;
							f_154_ += f_155_;
							f_156_ += f_157_;
						} while (--i_148_ > 0);
					} else {
						do {
							if (f < fs[++i]) {
								int[] is_287_ = is;
								int i_288_ = i;
								int i_289_ = (int) f_152_ & 0xff0000 | (int) f_154_ & 0xff00 | (int) f_156_ & 0xff;
								int i_290_ = is_287_[i_288_];
								int i_291_ = i_289_ + i_290_;
								int i_292_ = (i_289_ & 0xff00ff) + (i_290_ & 0xff00ff);
								i_290_ = (i_292_ & 0x1000100) + (i_291_ - i_292_ & 0x10000);
								is_287_[i_288_] = ~0xffffff | i_291_ - i_290_ | i_290_ - (i_290_ >>> 8);
							}
							f += f_151_;
							f_152_ += f_153_;
							f_154_ += f_155_;
							f_156_ += f_157_;
						} while (--i_148_ > 0);
					}
				}
			}
		}
	}
	
	private final void method1856(int[] is, int[] is_293_, int i, int i_294_, int i_295_, float f, float f_296_, float f_297_, float f_298_, float f_299_, float f_300_, float f_301_, float f_302_, float f_303_, float f_304_, float f_305_, float f_306_, float f_307_, float f_308_, float f_309_, float f_310_) {
		int i_311_ = i_295_ - i_294_;
		float f_312_ = 1.0F / (float) i_311_;
		float f_313_ = (f_296_ - f) * f_312_;
		float f_314_ = (f_298_ - f_297_) * f_312_;
		float f_315_ = (f_300_ - f_299_) * f_312_;
		float f_316_ = (f_302_ - f_301_) * f_312_;
		float f_317_ = (f_304_ - f_303_) * f_312_;
		float f_318_ = (f_306_ - f_305_) * f_312_;
		float f_319_ = (f_308_ - f_307_) * f_312_;
		float f_320_ = (f_310_ - f_309_) * f_312_;
		if (aBoolean2217) {
			if (i_295_ > anInt2222) {
				i_295_ = anInt2222;
			}
			if (i_294_ < 0) {
				f -= f_313_ * (float) i_294_;
				f_297_ -= f_314_ * (float) i_294_;
				f_299_ -= f_315_ * (float) i_294_;
				f_301_ -= f_316_ * (float) i_294_;
				f_303_ -= f_317_ * (float) i_294_;
				f_305_ -= f_318_ * (float) i_294_;
				f_307_ -= f_319_ * (float) i_294_;
				f_309_ -= f_320_ * (float) i_294_;
				i_294_ = 0;
			}
		}
		if (i_294_ < i_295_) {
			i_311_ = i_295_ - i_294_;
			i += i_294_;
			while (i_311_-- > 0) {
				float f_321_ = 1.0F / f;
				if (f_321_ < aFloatArray2214[i]) {
					int i_322_ = (int) (f_297_ * f_321_ * (float) anInt2232);
					if (aBoolean2239) {
						i_322_ &= anInt2243;
					} else if (i_322_ < 0) {
						i_322_ = 0;
					} else if (i_322_ > anInt2243) {
						i_322_ = anInt2243;
					}
					int i_323_ = (int) (f_299_ * f_321_ * (float) anInt2232);
					if (aBoolean2239) {
						i_323_ &= anInt2243;
					} else if (i_323_ < 0) {
						i_323_ = 0;
					} else if (i_323_ > anInt2243) {
						i_323_ = anInt2243;
					}
					int i_324_ = anIntArray2240[i_323_ * anInt2232 + i_322_];
					int i_325_ = 255;
					if (anInt2229 == 2) {
						i_325_ = i_324_ >> 24 & 0xff;
					} else if (anInt2229 == 1) {
						i_325_ = i_324_ == 0 ? 0 : 255;
					} else {
						i_325_ = (int) f_303_;
					}
					if (i_325_ != 0) {
						if (i_325_ != 255) {
							int i_326_ = ~0xffffff | (int) (f_305_ * (float) (i_324_ >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_307_ * (float) (i_324_ >> 8 & 0xff)) & 0xff00 | (int) (f_309_ * (float) (i_324_ & 0xff)) >> 8;
							if (f_301_ != 0.0F) {
								int i_327_ = (int) (255.0F - f_301_);
								int i_328_ = ((anInt2230 & 0xff00ff) * (int) f_301_ & ~0xff00ff | (anInt2230 & 0xff00) * (int) f_301_ & 0xff0000) >>> 8;
								i_326_ = (((i_326_ & 0xff00ff) * i_327_ & ~0xff00ff | (i_326_ & 0xff00) * i_327_ & 0xff0000) >>> 8) + i_328_;
							}
							int i_329_ = is[i];
							int i_330_ = 255 - i_325_;
							i_326_ = ((i_329_ & 0xff00ff) * i_330_ + (i_326_ & 0xff00ff) * i_325_ & ~0xff00ff) + ((i_329_ & 0xff00) * i_330_ + (i_326_ & 0xff00) * i_325_ & 0xff0000) >> 8;
							is[i] = (i_325_ | is[i] >> 24) << 24 | i_326_;
							aFloatArray2214[i] = f_321_;
						} else {
							int i_331_ = ~0xffffff | (int) (f_305_ * (float) (i_324_ >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_307_ * (float) (i_324_ >> 8 & 0xff)) & 0xff00 | (int) (f_309_ * (float) (i_324_ & 0xff)) >> 8;
							if (f_301_ != 0.0F) {
								int i_332_ = (int) (255.0F - f_301_);
								int i_333_ = ((anInt2230 & 0xff00ff) * (int) f_301_ & ~0xff00ff | (anInt2230 & 0xff00) * (int) f_301_ & 0xff0000) >>> 8;
								i_331_ = (((i_331_ & 0xff00ff) * i_332_ & ~0xff00ff | (i_331_ & 0xff00) * i_332_ & 0xff0000) >>> 8) + i_333_;
							}
							is[i] = i_325_ << 24 | i_331_;
							aFloatArray2214[i] = f_321_;
						}
					}
				}
				i++;
				f += f_313_;
				f_297_ += f_314_;
				f_299_ += f_315_;
				f_301_ += f_316_;
				f_303_ += f_317_;
				f_305_ += f_318_;
				f_307_ += f_319_;
				f_309_ += f_320_;
			}
		}
	}
	
	private final void method1857(int[] is, float[] fs, int i, int i_334_, int i_335_, int i_336_, int i_337_, float f, float f_338_, float f_339_, float f_340_, float f_341_, float f_342_, float f_343_, float f_344_) {
		if (aBoolean2217) {
			if (i_337_ > anInt2222) {
				i_337_ = anInt2222;
			}
			if (i_336_ < 0) {
				i_336_ = 0;
			}
		}
		if (i_336_ < i_337_) {
			if (aBoolean2223) {
				i += i_336_;
				f_339_ += f_340_ * (float) i_336_;
				f_341_ += f_342_ * (float) i_336_;
				f_343_ += f_344_ * (float) i_336_;
				if (aBoolean2226) {
					i_335_ = i_337_ - i_336_ >> 2;
					f_340_ *= 4.0F;
					f_342_ *= 4.0F;
					f_344_ *= 4.0F;
					if (anInt2220 == 0) {
						if (i_335_ > 0) {
							do {
								i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
								f_339_ += f_340_;
								f_341_ += f_342_;
								f_343_ += f_344_;
								is[i++] = i_334_;
								is[i++] = i_334_;
								is[i++] = i_334_;
								is[i++] = i_334_;
							} while (--i_335_ > 0);
						}
						i_335_ = i_337_ - i_336_ & 0x3;
						if (i_335_ > 0) {
							i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
							do
								is[i++] = i_334_;
							while (--i_335_ > 0);
						}
					} else if (!aBoolean2212) {
						int i_345_ = anInt2220;
						int i_346_ = 256 - anInt2220;
						if (i_335_ > 0) {
							do {
								i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
								f_339_ += f_340_;
								f_341_ += f_342_;
								f_343_ += f_344_;
								i_334_ = ((i_334_ & 0xff00ff) * i_346_ >> 8 & 0xff00ff) + ((i_334_ & 0xff00) * i_346_ >> 8 & 0xff00);
								int i_347_ = is[i];
								is[i++] = i_334_ + ((i_347_ & 0xff00ff) * i_345_ >> 8 & 0xff00ff) + ((i_347_ & 0xff00) * i_345_ >> 8 & 0xff00);
								i_347_ = is[i];
								is[i++] = i_334_ + ((i_347_ & 0xff00ff) * i_345_ >> 8 & 0xff00ff) + ((i_347_ & 0xff00) * i_345_ >> 8 & 0xff00);
								i_347_ = is[i];
								is[i++] = i_334_ + ((i_347_ & 0xff00ff) * i_345_ >> 8 & 0xff00ff) + ((i_347_ & 0xff00) * i_345_ >> 8 & 0xff00);
								i_347_ = is[i];
								is[i++] = i_334_ + ((i_347_ & 0xff00ff) * i_345_ >> 8 & 0xff00ff) + ((i_347_ & 0xff00) * i_345_ >> 8 & 0xff00);
							} while (--i_335_ > 0);
						}
						i_335_ = i_337_ - i_336_ & 0x3;
						if (i_335_ > 0) {
							i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
							i_334_ = ((i_334_ & 0xff00ff) * i_346_ >> 8 & 0xff00ff) + ((i_334_ & 0xff00) * i_346_ >> 8 & 0xff00);
							do {
								int i_348_ = is[i];
								is[i++] = i_334_ + ((i_348_ & 0xff00ff) * i_345_ >> 8 & 0xff00ff) + ((i_348_ & 0xff00) * i_345_ >> 8 & 0xff00);
							} while (--i_335_ > 0);
						}
					} else {
						if (i_335_ > 0) {
							do {
								i_334_ = (int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff;
								f_339_ += f_340_;
								f_341_ += f_342_;
								f_343_ += f_344_;
								int[] is_349_ = is;
								int i_350_ = i++;
								int i_351_ = i_334_;
								int i_352_ = is_349_[i_350_];
								int i_353_ = i_351_ + i_352_;
								int i_354_ = (i_351_ & 0xff00ff) + (i_352_ & 0xff00ff);
								i_352_ = (i_354_ & 0x1000100) + (i_353_ - i_354_ & 0x10000);
								is_349_[i_350_] = ~0xffffff | i_353_ - i_352_ | i_352_ - (i_352_ >>> 8);
								int[] is_355_ = is;
								int i_356_ = i++;
								int i_357_ = i_334_;
								int i_358_ = is_355_[i_356_];
								int i_359_ = i_357_ + i_358_;
								int i_360_ = (i_357_ & 0xff00ff) + (i_358_ & 0xff00ff);
								i_358_ = (i_360_ & 0x1000100) + (i_359_ - i_360_ & 0x10000);
								is_355_[i_356_] = ~0xffffff | i_359_ - i_358_ | i_358_ - (i_358_ >>> 8);
								int[] is_361_ = is;
								int i_362_ = i++;
								int i_363_ = i_334_;
								int i_364_ = is_361_[i_362_];
								int i_365_ = i_363_ + i_364_;
								int i_366_ = (i_363_ & 0xff00ff) + (i_364_ & 0xff00ff);
								i_364_ = (i_366_ & 0x1000100) + (i_365_ - i_366_ & 0x10000);
								is_361_[i_362_] = ~0xffffff | i_365_ - i_364_ | i_364_ - (i_364_ >>> 8);
								int[] is_367_ = is;
								int i_368_ = i++;
								int i_369_ = i_334_;
								int i_370_ = is_367_[i_368_];
								int i_371_ = i_369_ + i_370_;
								int i_372_ = (i_369_ & 0xff00ff) + (i_370_ & 0xff00ff);
								i_370_ = (i_372_ & 0x1000100) + (i_371_ - i_372_ & 0x10000);
								is_367_[i_368_] = ~0xffffff | i_371_ - i_370_ | i_370_ - (i_370_ >>> 8);
							} while (--i_335_ > 0);
						}
						i_335_ = i_337_ - i_336_ & 0x3;
						if (i_335_ > 0) {
							i_334_ = (int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff;
							do {
								int[] is_373_ = is;
								int i_374_ = i++;
								int i_375_ = i_334_;
								int i_376_ = is_373_[i_374_];
								int i_377_ = i_375_ + i_376_;
								int i_378_ = (i_375_ & 0xff00ff) + (i_376_ & 0xff00ff);
								i_376_ = (i_378_ & 0x1000100) + (i_377_ - i_378_ & 0x10000);
								is_373_[i_374_] = ~0xffffff | i_377_ - i_376_ | i_376_ - (i_376_ >>> 8);
							} while (--i_335_ > 0);
						}
					}
				} else {
					i_335_ = i_337_ - i_336_;
					if (anInt2220 == 0) {
						do {
							is[i++] = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
							f_339_ += f_340_;
							f_341_ += f_342_;
							f_343_ += f_344_;
						} while (--i_335_ > 0);
					} else if (!aBoolean2212) {
						int i_379_ = anInt2220;
						int i_380_ = 256 - anInt2220;
						do {
							i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
							f_339_ += f_340_;
							f_341_ += f_342_;
							f_343_ += f_344_;
							i_334_ = ((i_334_ & 0xff00ff) * i_380_ >> 8 & 0xff00ff) + ((i_334_ & 0xff00) * i_380_ >> 8 & 0xff00);
							int i_381_ = is[i];
							is[i++] = i_334_ + ((i_381_ & 0xff00ff) * i_379_ >> 8 & 0xff00ff) + ((i_381_ & 0xff00) * i_379_ >> 8 & 0xff00);
						} while (--i_335_ > 0);
					} else {
						do {
							int[] is_382_ = is;
							int i_383_ = i++;
							int i_384_ = (int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff;
							int i_385_ = is_382_[i_383_];
							int i_386_ = i_384_ + i_385_;
							int i_387_ = (i_384_ & 0xff00ff) + (i_385_ & 0xff00ff);
							i_385_ = (i_387_ & 0x1000100) + (i_386_ - i_387_ & 0x10000);
							is_382_[i_383_] = ~0xffffff | i_386_ - i_385_ | i_385_ - (i_385_ >>> 8);
							f_339_ += f_340_;
							f_341_ += f_342_;
							f_343_ += f_344_;
						} while (--i_335_ > 0);
					}
				}
			} else {
				i += i_336_ - 1;
				f += f_338_ * (float) i_336_;
				f_339_ += f_340_ * (float) i_336_;
				f_341_ += f_342_ * (float) i_336_;
				f_343_ += f_344_ * (float) i_336_;
				if (aClass374_2219.aBoolean4615) {
					if (aBoolean2226) {
						i_335_ = i_337_ - i_336_ >> 2;
						f_340_ *= 4.0F;
						f_342_ *= 4.0F;
						f_344_ *= 4.0F;
						if (anInt2220 == 0) {
							if (i_335_ > 0) {
								do {
									i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
									f_339_ += f_340_;
									f_341_ += f_342_;
									f_343_ += f_344_;
									if (f < fs[++i]) {
										is[i] = i_334_;
										fs[i] = f;
									}
									f += f_338_;
									if (f < fs[++i]) {
										is[i] = i_334_;
										fs[i] = f;
									}
									f += f_338_;
									if (f < fs[++i]) {
										is[i] = i_334_;
										fs[i] = f;
									}
									f += f_338_;
									if (f < fs[++i]) {
										is[i] = i_334_;
										fs[i] = f;
									}
									f += f_338_;
								} while (--i_335_ > 0);
							}
							i_335_ = i_337_ - i_336_ & 0x3;
							if (i_335_ > 0) {
								i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
								do {
									if (f < fs[++i]) {
										is[i] = i_334_;
										fs[i] = f;
									}
									f += f_338_;
								} while (--i_335_ > 0);
							}
						} else if (!aBoolean2212) {
							int i_388_ = anInt2220;
							int i_389_ = 256 - anInt2220;
							if (i_335_ > 0) {
								do {
									i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
									f_339_ += f_340_;
									f_341_ += f_342_;
									f_343_ += f_344_;
									i_334_ = ((i_334_ & 0xff00ff) * i_389_ >> 8 & 0xff00ff) + ((i_334_ & 0xff00) * i_389_ >> 8 & 0xff00);
									if (f < fs[++i]) {
										int i_390_ = is[i];
										is[i] = i_334_ + ((i_390_ & 0xff00ff) * i_388_ >> 8 & 0xff00ff) + ((i_390_ & 0xff00) * i_388_ >> 8 & 0xff00);
										fs[i] = f;
									}
									f += f_338_;
									if (f < fs[++i]) {
										int i_391_ = is[i];
										is[i] = i_334_ + ((i_391_ & 0xff00ff) * i_388_ >> 8 & 0xff00ff) + ((i_391_ & 0xff00) * i_388_ >> 8 & 0xff00);
										fs[i] = f;
									}
									f += f_338_;
									if (f < fs[++i]) {
										int i_392_ = is[i];
										is[i] = i_334_ + ((i_392_ & 0xff00ff) * i_388_ >> 8 & 0xff00ff) + ((i_392_ & 0xff00) * i_388_ >> 8 & 0xff00);
										fs[i] = f;
									}
									f += f_338_;
									if (f < fs[++i]) {
										int i_393_ = is[i];
										is[i] = i_334_ + ((i_393_ & 0xff00ff) * i_388_ >> 8 & 0xff00ff) + ((i_393_ & 0xff00) * i_388_ >> 8 & 0xff00);
										fs[i] = f;
									}
									f += f_338_;
								} while (--i_335_ > 0);
							}
							i_335_ = i_337_ - i_336_ & 0x3;
							if (i_335_ > 0) {
								i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
								i_334_ = ((i_334_ & 0xff00ff) * i_389_ >> 8 & 0xff00ff) + ((i_334_ & 0xff00) * i_389_ >> 8 & 0xff00);
								do {
									if (f < fs[++i]) {
										int i_394_ = is[i];
										is[i] = i_334_ + ((i_394_ & 0xff00ff) * i_388_ >> 8 & 0xff00ff) + ((i_394_ & 0xff00) * i_388_ >> 8 & 0xff00);
										fs[i] = f;
									}
									f += f_338_;
								} while (--i_335_ > 0);
							}
						} else {
							if (i_335_ > 0) {
								do {
									i_334_ = (int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff;
									f_339_ += f_340_;
									f_341_ += f_342_;
									f_343_ += f_344_;
									if (f < fs[++i]) {
										int[] is_395_ = is;
										int i_396_ = i;
										int i_397_ = i_334_;
										int i_398_ = is_395_[i_396_];
										int i_399_ = i_397_ + i_398_;
										int i_400_ = (i_397_ & 0xff00ff) + (i_398_ & 0xff00ff);
										i_398_ = (i_400_ & 0x1000100) + (i_399_ - i_400_ & 0x10000);
										is_395_[i_396_] = ~0xffffff | i_399_ - i_398_ | i_398_ - (i_398_ >>> 8);
										fs[i] = f;
									}
									f += f_338_;
									if (f < fs[++i]) {
										int[] is_401_ = is;
										int i_402_ = i;
										int i_403_ = i_334_;
										int i_404_ = is_401_[i_402_];
										int i_405_ = i_403_ + i_404_;
										int i_406_ = (i_403_ & 0xff00ff) + (i_404_ & 0xff00ff);
										i_404_ = (i_406_ & 0x1000100) + (i_405_ - i_406_ & 0x10000);
										is_401_[i_402_] = ~0xffffff | i_405_ - i_404_ | i_404_ - (i_404_ >>> 8);
										fs[i] = f;
									}
									f += f_338_;
									if (f < fs[++i]) {
										int[] is_407_ = is;
										int i_408_ = i;
										int i_409_ = i_334_;
										int i_410_ = is_407_[i_408_];
										int i_411_ = i_409_ + i_410_;
										int i_412_ = (i_409_ & 0xff00ff) + (i_410_ & 0xff00ff);
										i_410_ = (i_412_ & 0x1000100) + (i_411_ - i_412_ & 0x10000);
										is_407_[i_408_] = ~0xffffff | i_411_ - i_410_ | i_410_ - (i_410_ >>> 8);
										fs[i] = f;
									}
									f += f_338_;
									if (f < fs[++i]) {
										int[] is_413_ = is;
										int i_414_ = i;
										int i_415_ = i_334_;
										int i_416_ = is_413_[i_414_];
										int i_417_ = i_415_ + i_416_;
										int i_418_ = (i_415_ & 0xff00ff) + (i_416_ & 0xff00ff);
										i_416_ = (i_418_ & 0x1000100) + (i_417_ - i_418_ & 0x10000);
										is_413_[i_414_] = ~0xffffff | i_417_ - i_416_ | i_416_ - (i_416_ >>> 8);
										fs[i] = f;
									}
									f += f_338_;
								} while (--i_335_ > 0);
							}
							i_335_ = i_337_ - i_336_ & 0x3;
							if (i_335_ > 0) {
								i_334_ = (int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff;
								do {
									if (f < fs[++i]) {
										int[] is_419_ = is;
										int i_420_ = i;
										int i_421_ = i_334_;
										int i_422_ = is_419_[i_420_];
										int i_423_ = i_421_ + i_422_;
										int i_424_ = (i_421_ & 0xff00ff) + (i_422_ & 0xff00ff);
										i_422_ = (i_424_ & 0x1000100) + (i_423_ - i_424_ & 0x10000);
										is_419_[i_420_] = ~0xffffff | i_423_ - i_422_ | i_422_ - (i_422_ >>> 8);
										fs[i] = f;
									}
									f += f_338_;
								} while (--i_335_ > 0);
							}
						}
					} else {
						i_335_ = i_337_ - i_336_;
						if (anInt2220 == 0) {
							do {
								if (f < fs[++i]) {
									is[i] = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
									fs[i] = f;
								}
								f += f_338_;
								f_339_ += f_340_;
								f_341_ += f_342_;
								f_343_ += f_344_;
							} while (--i_335_ > 0);
						} else if (!aBoolean2212) {
							int i_425_ = anInt2220;
							int i_426_ = 256 - anInt2220;
							do {
								if (f < fs[++i]) {
									i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
									i_334_ = ((i_334_ & 0xff00ff) * i_426_ >> 8 & 0xff00ff) + ((i_334_ & 0xff00) * i_426_ >> 8 & 0xff00);
									int i_427_ = is[i];
									is[i] = i_334_ + ((i_427_ & 0xff00ff) * i_425_ >> 8 & 0xff00ff) + ((i_427_ & 0xff00) * i_425_ >> 8 & 0xff00);
									fs[i] = f;
								}
								f += f_338_;
								f_339_ += f_340_;
								f_341_ += f_342_;
								f_343_ += f_344_;
							} while (--i_335_ > 0);
						} else {
							do {
								if (f < fs[++i]) {
									int[] is_428_ = is;
									int i_429_ = i;
									int i_430_ = (int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff;
									int i_431_ = is_428_[i_429_];
									int i_432_ = i_430_ + i_431_;
									int i_433_ = (i_430_ & 0xff00ff) + (i_431_ & 0xff00ff);
									i_431_ = (i_433_ & 0x1000100) + (i_432_ - i_433_ & 0x10000);
									is_428_[i_429_] = ~0xffffff | i_432_ - i_431_ | i_431_ - (i_431_ >>> 8);
									fs[i] = f;
								}
								f += f_338_;
								f_339_ += f_340_;
								f_341_ += f_342_;
								f_343_ += f_344_;
							} while (--i_335_ > 0);
						}
					}
				} else if (aBoolean2226) {
					i_335_ = i_337_ - i_336_ >> 2;
					f_340_ *= 4.0F;
					f_342_ *= 4.0F;
					f_344_ *= 4.0F;
					if (anInt2220 == 0) {
						if (i_335_ > 0) {
							do {
								i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
								f_339_ += f_340_;
								f_341_ += f_342_;
								f_343_ += f_344_;
								if (f < fs[++i]) {
									is[i] = i_334_;
								}
								f += f_338_;
								if (f < fs[++i]) {
									is[i] = i_334_;
								}
								f += f_338_;
								if (f < fs[++i]) {
									is[i] = i_334_;
								}
								f += f_338_;
								if (f < fs[++i]) {
									is[i] = i_334_;
								}
								f += f_338_;
							} while (--i_335_ > 0);
						}
						i_335_ = i_337_ - i_336_ & 0x3;
						if (i_335_ > 0) {
							i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
							do {
								if (f < fs[++i]) {
									is[i] = i_334_;
								}
								f += f_338_;
							} while (--i_335_ > 0);
						}
					} else if (!aBoolean2212) {
						int i_434_ = anInt2220;
						int i_435_ = 256 - anInt2220;
						if (i_335_ > 0) {
							do {
								i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
								f_339_ += f_340_;
								f_341_ += f_342_;
								f_343_ += f_344_;
								i_334_ = ((i_334_ & 0xff00ff) * i_435_ >> 8 & 0xff00ff) + ((i_334_ & 0xff00) * i_435_ >> 8 & 0xff00);
								if (f < fs[++i]) {
									int i_436_ = is[i];
									is[i] = i_334_ + ((i_436_ & 0xff00ff) * i_434_ >> 8 & 0xff00ff) + ((i_436_ & 0xff00) * i_434_ >> 8 & 0xff00);
								}
								f += f_338_;
								if (f < fs[++i]) {
									int i_437_ = is[i];
									is[i] = i_334_ + ((i_437_ & 0xff00ff) * i_434_ >> 8 & 0xff00ff) + ((i_437_ & 0xff00) * i_434_ >> 8 & 0xff00);
								}
								f += f_338_;
								if (f < fs[++i]) {
									int i_438_ = is[i];
									is[i] = i_334_ + ((i_438_ & 0xff00ff) * i_434_ >> 8 & 0xff00ff) + ((i_438_ & 0xff00) * i_434_ >> 8 & 0xff00);
								}
								f += f_338_;
								if (f < fs[++i]) {
									int i_439_ = is[i];
									is[i] = i_334_ + ((i_439_ & 0xff00ff) * i_434_ >> 8 & 0xff00ff) + ((i_439_ & 0xff00) * i_434_ >> 8 & 0xff00);
								}
								f += f_338_;
							} while (--i_335_ > 0);
						}
						i_335_ = i_337_ - i_336_ & 0x3;
						if (i_335_ > 0) {
							i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
							i_334_ = ((i_334_ & 0xff00ff) * i_435_ >> 8 & 0xff00ff) + ((i_334_ & 0xff00) * i_435_ >> 8 & 0xff00);
							do {
								if (f < fs[++i]) {
									int i_440_ = is[i];
									is[i] = i_334_ + ((i_440_ & 0xff00ff) * i_434_ >> 8 & 0xff00ff) + ((i_440_ & 0xff00) * i_434_ >> 8 & 0xff00);
								}
								f += f_338_;
							} while (--i_335_ > 0);
						}
					} else {
						if (i_335_ > 0) {
							do {
								i_334_ = (int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff;
								f_339_ += f_340_;
								f_341_ += f_342_;
								f_343_ += f_344_;
								if (f < fs[++i]) {
									int[] is_441_ = is;
									int i_442_ = i;
									int i_443_ = i_334_;
									int i_444_ = is_441_[i_442_];
									int i_445_ = i_443_ + i_444_;
									int i_446_ = (i_443_ & 0xff00ff) + (i_444_ & 0xff00ff);
									i_444_ = (i_446_ & 0x1000100) + (i_445_ - i_446_ & 0x10000);
									is_441_[i_442_] = ~0xffffff | i_445_ - i_444_ | i_444_ - (i_444_ >>> 8);
								}
								f += f_338_;
								if (f < fs[++i]) {
									int[] is_447_ = is;
									int i_448_ = i;
									int i_449_ = i_334_;
									int i_450_ = is_447_[i_448_];
									int i_451_ = i_449_ + i_450_;
									int i_452_ = (i_449_ & 0xff00ff) + (i_450_ & 0xff00ff);
									i_450_ = (i_452_ & 0x1000100) + (i_451_ - i_452_ & 0x10000);
									is_447_[i_448_] = ~0xffffff | i_451_ - i_450_ | i_450_ - (i_450_ >>> 8);
								}
								f += f_338_;
								if (f < fs[++i]) {
									int[] is_453_ = is;
									int i_454_ = i;
									int i_455_ = i_334_;
									int i_456_ = is_453_[i_454_];
									int i_457_ = i_455_ + i_456_;
									int i_458_ = (i_455_ & 0xff00ff) + (i_456_ & 0xff00ff);
									i_456_ = (i_458_ & 0x1000100) + (i_457_ - i_458_ & 0x10000);
									is_453_[i_454_] = ~0xffffff | i_457_ - i_456_ | i_456_ - (i_456_ >>> 8);
								}
								f += f_338_;
								if (f < fs[++i]) {
									int[] is_459_ = is;
									int i_460_ = i;
									int i_461_ = i_334_;
									int i_462_ = is_459_[i_460_];
									int i_463_ = i_461_ + i_462_;
									int i_464_ = (i_461_ & 0xff00ff) + (i_462_ & 0xff00ff);
									i_462_ = (i_464_ & 0x1000100) + (i_463_ - i_464_ & 0x10000);
									is_459_[i_460_] = ~0xffffff | i_463_ - i_462_ | i_462_ - (i_462_ >>> 8);
								}
								f += f_338_;
							} while (--i_335_ > 0);
						}
						i_335_ = i_337_ - i_336_ & 0x3;
						if (i_335_ > 0) {
							i_334_ = (int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff;
							do {
								if (f < fs[++i]) {
									int[] is_465_ = is;
									int i_466_ = i;
									int i_467_ = i_334_;
									int i_468_ = is_465_[i_466_];
									int i_469_ = i_467_ + i_468_;
									int i_470_ = (i_467_ & 0xff00ff) + (i_468_ & 0xff00ff);
									i_468_ = (i_470_ & 0x1000100) + (i_469_ - i_470_ & 0x10000);
									is_465_[i_466_] = ~0xffffff | i_469_ - i_468_ | i_468_ - (i_468_ >>> 8);
								}
								f += f_338_;
							} while (--i_335_ > 0);
						}
					}
				} else {
					i_335_ = i_337_ - i_336_;
					if (anInt2220 == 0) {
						do {
							if (f < fs[++i]) {
								is[i] = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
							}
							f += f_338_;
							f_339_ += f_340_;
							f_341_ += f_342_;
							f_343_ += f_344_;
						} while (--i_335_ > 0);
					} else if (!aBoolean2212) {
						int i_471_ = anInt2220;
						int i_472_ = 256 - anInt2220;
						do {
							if (f < fs[++i]) {
								i_334_ = ~0xffffff | ((int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff);
								i_334_ = ((i_334_ & 0xff00ff) * i_472_ >> 8 & 0xff00ff) + ((i_334_ & 0xff00) * i_472_ >> 8 & 0xff00);
								int i_473_ = is[i];
								is[i] = i_334_ + ((i_473_ & 0xff00ff) * i_471_ >> 8 & 0xff00ff) + ((i_473_ & 0xff00) * i_471_ >> 8 & 0xff00);
							}
							f += f_338_;
							f_339_ += f_340_;
							f_341_ += f_342_;
							f_343_ += f_344_;
						} while (--i_335_ > 0);
					} else {
						do {
							if (f < fs[++i]) {
								int[] is_474_ = is;
								int i_475_ = i;
								int i_476_ = (int) f_339_ & 0xff0000 | (int) f_341_ & 0xff00 | (int) f_343_ & 0xff;
								int i_477_ = is_474_[i_475_];
								int i_478_ = i_476_ + i_477_;
								int i_479_ = (i_476_ & 0xff00ff) + (i_477_ & 0xff00ff);
								i_477_ = (i_479_ & 0x1000100) + (i_478_ - i_479_ & 0x10000);
								is_474_[i_475_] = ~0xffffff | i_478_ - i_477_ | i_477_ - (i_477_ >>> 8);
							}
							f += f_338_;
							f_339_ += f_340_;
							f_341_ += f_342_;
							f_343_ += f_344_;
						} while (--i_335_ > 0);
					}
				}
			}
		}
	}
	
	private final void method1858(int[] is, int[] is_480_, int i, int i_481_, int i_482_, float f, float f_483_, float f_484_, float f_485_, float f_486_, float f_487_, float f_488_, float f_489_, float f_490_, float f_491_, float f_492_, float f_493_, float f_494_, float f_495_, float f_496_, float f_497_, float f_498_, float f_499_, float f_500_, float f_501_) {
		int i_502_ = i_482_ - i_481_;
		float f_503_ = 1.0F / (float) i_502_;
		float f_504_ = (f_483_ - f) * f_503_;
		float f_505_ = (f_485_ - f_484_) * f_503_;
		float f_506_ = (f_487_ - f_486_) * f_503_;
		float f_507_ = (f_489_ - f_488_) * f_503_;
		float f_508_ = (f_493_ - f_492_) * f_503_;
		float f_509_ = (f_495_ - f_494_) * f_503_;
		float f_510_ = (f_497_ - f_496_) * f_503_;
		float f_511_ = (f_499_ - f_498_) * f_503_;
		float f_512_ = (f_501_ - f_500_) * f_503_;
		if (aBoolean2217) {
			if (i_482_ > anInt2222) {
				i_482_ = anInt2222;
			}
			if (i_481_ < 0) {
				f -= f_504_ * (float) i_481_;
				f_484_ -= f_505_ * (float) i_481_;
				f_486_ -= f_506_ * (float) i_481_;
				f_488_ -= f_507_ * (float) i_481_;
				f_492_ -= f_508_ * (float) i_481_;
				f_494_ -= f_509_ * (float) i_481_;
				f_496_ -= f_510_ * (float) i_481_;
				f_498_ -= f_511_ * (float) i_481_;
				f_500_ -= f_512_ * (float) i_481_;
				i_481_ = 0;
			}
		}
		if (i_481_ < i_482_) {
			i_502_ = i_482_ - i_481_;
			i += i_481_;
			while (i_502_-- > 0) {
				float f_513_ = 1.0F / f;
				if (f_513_ < aFloatArray2214[i]) {
					float f_514_ = f_484_ * f_513_;
					float f_515_ = f_486_ * f_513_;
					int i_516_ = (int) (f_514_ * (float) anInt2232 * aFloat2241) & anInt2243;
					int i_517_ = (int) (f_515_ * (float) anInt2232 * aFloat2241) & anInt2243;
					int i_518_ = anIntArray2240[i_517_ * anInt2232 + i_516_];
					i_516_ = (int) (f_514_ * (float) anInt2237 * aFloat2238) & anInt2235;
					i_517_ = (int) (f_515_ * (float) anInt2237 * aFloat2238) & anInt2235;
					int i_519_ = anIntArray2231[i_517_ * anInt2237 + i_516_];
					i_516_ = (int) (f_514_ * (float) anInt2228 * aFloat2242) & anInt2233;
					i_517_ = (int) (f_515_ * (float) anInt2228 * aFloat2242) & anInt2233;
					int i_520_ = anIntArray2236[i_517_ * anInt2228 + i_516_];
					float f_521_ = 1.0F - (f_498_ + f_500_);
					i_518_ = ~0xffffff | (int) (f_498_ * (float) (i_518_ >> 16 & 0xff)) << 16 | (int) (f_498_ * (float) (i_518_ >> 8 & 0xff)) << 8 | (int) (f_498_ * (float) (i_518_ & 0xff));
					i_519_ = ~0xffffff | (int) (f_500_ * (float) (i_519_ >> 16 & 0xff)) << 16 | (int) (f_500_ * (float) (i_519_ >> 8 & 0xff)) << 8 | (int) (f_500_ * (float) (i_519_ & 0xff));
					i_520_ = ~0xffffff | (int) (f_521_ * (float) (i_520_ >> 16 & 0xff)) << 16 | (int) (f_521_ * (float) (i_520_ >> 8 & 0xff)) << 8 | (int) (f_521_ * (float) (i_520_ & 0xff));
					int i_522_ = i_518_ + i_519_ + i_520_;
					int i_523_ = ~0xffffff | (int) (f_492_ * (float) (i_522_ >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_494_ * (float) (i_522_ >> 8 & 0xff)) & 0xff00 | (int) (f_496_ * (float) (i_522_ & 0xff)) >> 8;
					if (f_488_ != 0.0F) {
						int i_524_ = (int) (255.0F - f_488_);
						int i_525_ = ((anInt2230 & 0xff00ff) * (int) f_488_ & ~0xff00ff | (anInt2230 & 0xff00) * (int) f_488_ & 0xff0000) >>> 8;
						i_523_ = (((i_523_ & 0xff00ff) * i_524_ & ~0xff00ff | (i_523_ & 0xff00) * i_524_ & 0xff0000) >>> 8) + i_525_;
					}
					is[i] = i_523_;
					aFloatArray2214[i] = f_513_;
				}
				i++;
				f += f_504_;
				f_484_ += f_505_;
				f_486_ += f_506_;
				f_488_ += f_507_;
				f_492_ += f_508_;
				f_494_ += f_509_;
				f_496_ += f_510_;
				f_498_ += f_511_;
				f_500_ += f_512_;
			}
		}
	}
	
	final void method1859(float f, float f_526_, float f_527_, float f_528_, float f_529_, float f_530_, float f_531_, float f_532_, float f_533_, float f_534_, float f_535_, float f_536_, float f_537_, float f_538_, float f_539_, int i, int i_540_, int i_541_, int i_542_, int i_543_, int i_544_, int i_545_, int i_546_) {
		if (i_546_ != anInt2234) {
			anIntArray2240 = aPureJavaToolkit2221.method1495(i_546_);
			if (anIntArray2240 == null) {
				method1850((float) (int) f, (float) (int) f_526_, (float) (int) f_527_, (float) (int) f_528_, (float) (int) f_529_, (float) (int) f_530_, (float) (int) f_531_, (float) (int) f_532_, (float) (int) f_533_, Class249.method3086(i_542_ | i_543_ << 24, i, (byte) -56), Class249.method3086(i_542_ | i_544_ << 24, i_540_, (byte) -56), Class249.method3086(i_542_ | i_545_ << 24, i_541_, (byte) -56));
				return;
			}
			anInt2232 = aPureJavaToolkit2221.method1505(i_546_) ? 64 : aPureJavaToolkit2221.anInt6775;
			anInt2243 = anInt2232 - 1;
			anInt2229 = aPureJavaToolkit2221.method1502(i_546_);
			aBoolean2239 = aPureJavaToolkit2221.method1503(i_546_);
		}
		anInt2230 = i_542_;
		float f_547_ = (float) (i >> 24 & 0xff);
		float f_548_ = (float) (i_540_ >> 24 & 0xff);
		float f_549_ = (float) (i_541_ >> 24 & 0xff);
		float f_550_ = (float) (i >> 16 & 0xff);
		float f_551_ = (float) (i_540_ >> 16 & 0xff);
		float f_552_ = (float) (i_541_ >> 16 & 0xff);
		float f_553_ = (float) (i >> 8 & 0xff);
		float f_554_ = (float) (i_540_ >> 8 & 0xff);
		float f_555_ = (float) (i_541_ >> 8 & 0xff);
		float f_556_ = (float) (i & 0xff);
		float f_557_ = (float) (i_540_ & 0xff);
		float f_558_ = (float) (i_541_ & 0xff);
		f_534_ /= f_531_;
		f_535_ /= f_532_;
		f_536_ /= f_533_;
		f_537_ /= f_531_;
		f_538_ /= f_532_;
		f_539_ /= f_533_;
		f_531_ = 1.0F / f_531_;
		f_532_ = 1.0F / f_532_;
		f_533_ = 1.0F / f_533_;
		float f_559_ = 0.0F;
		float f_560_ = 0.0F;
		float f_561_ = 0.0F;
		float f_562_ = 0.0F;
		float f_563_ = 0.0F;
		float f_564_ = 0.0F;
		float f_565_ = 0.0F;
		float f_566_ = 0.0F;
		float f_567_ = 0.0F;
		if (f_526_ != f) {
			float f_568_ = f_526_ - f;
			f_559_ = (f_529_ - f_528_) / f_568_;
			f_560_ = (f_532_ - f_531_) / f_568_;
			f_561_ = (f_535_ - f_534_) / f_568_;
			f_562_ = (f_538_ - f_537_) / f_568_;
			f_563_ = (float) (i_544_ - i_543_) / f_568_;
			f_564_ = (f_548_ - f_547_) / f_568_;
			f_565_ = (f_551_ - f_550_) / f_568_;
			f_566_ = (f_554_ - f_553_) / f_568_;
			f_567_ = (f_557_ - f_556_) / f_568_;
		}
		float f_569_ = 0.0F;
		float f_570_ = 0.0F;
		float f_571_ = 0.0F;
		float f_572_ = 0.0F;
		float f_573_ = 0.0F;
		float f_574_ = 0.0F;
		float f_575_ = 0.0F;
		float f_576_ = 0.0F;
		float f_577_ = 0.0F;
		if (f_527_ != f_526_) {
			float f_578_ = f_527_ - f_526_;
			f_569_ = (f_530_ - f_529_) / f_578_;
			f_570_ = (f_533_ - f_532_) / f_578_;
			f_571_ = (f_536_ - f_535_) / f_578_;
			f_572_ = (f_539_ - f_538_) / f_578_;
			f_573_ = (float) (i_545_ - i_544_) / f_578_;
			f_574_ = (f_549_ - f_548_) / f_578_;
			f_575_ = (f_552_ - f_551_) / f_578_;
			f_576_ = (f_555_ - f_554_) / f_578_;
			f_577_ = (f_558_ - f_557_) / f_578_;
		}
		float f_579_ = 0.0F;
		float f_580_ = 0.0F;
		float f_581_ = 0.0F;
		float f_582_ = 0.0F;
		float f_583_ = 0.0F;
		float f_584_ = 0.0F;
		float f_585_ = 0.0F;
		float f_586_ = 0.0F;
		float f_587_ = 0.0F;
		if (f != f_527_) {
			float f_588_ = f - f_527_;
			f_579_ = (f_528_ - f_530_) / f_588_;
			f_580_ = (f_531_ - f_533_) / f_588_;
			f_581_ = (f_534_ - f_536_) / f_588_;
			f_582_ = (f_537_ - f_539_) / f_588_;
			f_583_ = (float) (i_543_ - i_545_) / f_588_;
			f_584_ = (f_547_ - f_549_) / f_588_;
			f_585_ = (f_550_ - f_552_) / f_588_;
			f_586_ = (f_553_ - f_555_) / f_588_;
			f_587_ = (f_556_ - f_558_) / f_588_;
		}
		if (f <= f_526_ && f <= f_527_) {
			if (!(f >= (float) anInt2225)) {
				if (f_526_ > (float) anInt2225) {
					f_526_ = (float) anInt2225;
				}
				if (f_527_ > (float) anInt2225) {
					f_527_ = (float) anInt2225;
				}
				if (f_526_ < f_527_) {
					f_530_ = f_528_;
					f_533_ = f_531_;
					f_536_ = f_534_;
					f_539_ = f_537_;
					i_545_ = i_543_;
					f_549_ = f_547_;
					f_552_ = f_550_;
					f_555_ = f_553_;
					f_558_ = f_556_;
					if (f < 0.0F) {
						f_528_ -= f_559_ * f;
						f_530_ -= f_579_ * f;
						f_531_ -= f_560_ * f;
						f_533_ -= f_580_ * f;
						f_534_ -= f_561_ * f;
						f_536_ -= f_581_ * f;
						f_537_ -= f_562_ * f;
						f_539_ -= f_582_ * f;
						i_543_ -= f_563_ * f;
						i_545_ -= f_583_ * f;
						f_547_ -= f_564_ * f;
						f_549_ -= f_584_ * f;
						f_550_ -= f_564_ * f;
						f_552_ -= f_584_ * f;
						f_553_ -= f_564_ * f;
						f_555_ -= f_584_ * f;
						f_556_ -= f_564_ * f;
						f_558_ -= f_584_ * f;
						f = 0.0F;
					}
					if (f_526_ < 0.0F) {
						f_529_ -= f_569_ * f_526_;
						f_532_ -= f_570_ * f_526_;
						f_535_ -= f_571_ * f_526_;
						f_538_ -= f_572_ * f_526_;
						i_544_ -= f_573_ * f_526_;
						f_548_ -= f_574_ * f_526_;
						f_551_ -= f_575_ * f_526_;
						f_554_ -= f_576_ * f_526_;
						f_557_ -= f_577_ * f_526_;
						f_526_ = 0.0F;
					}
					if (f != f_526_ && f_579_ < f_559_ || f == f_526_ && f_579_ > f_569_) {
						f_527_ -= f_526_;
						f_526_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_526_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f, (int) f_530_, (int) f_528_, f_533_, f_531_, f_536_, f_534_, f_539_, f_537_, (float) i_545_, (float) i_543_, f_549_, f_547_, f_552_, f_550_, f_555_, f_553_, f_558_, f_556_);
							f_528_ += f_559_;
							f_530_ += f_579_;
							f_531_ += f_560_;
							f_533_ += f_580_;
							f_534_ += f_561_;
							f_536_ += f_581_;
							f_537_ += f_562_;
							f_539_ += f_582_;
							i_543_ += f_563_;
							i_545_ += f_583_;
							f_547_ += f_564_;
							f_549_ += f_584_;
							f_550_ += f_565_;
							f_552_ += f_585_;
							f_553_ += f_566_;
							f_555_ += f_586_;
							f_556_ += f_567_;
							f_558_ += f_587_;
							f += (float) anInt2215;
						}
						while (--f_527_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f, (int) f_530_, (int) f_529_, f_533_, f_532_, f_536_, f_535_, f_539_, f_538_, (float) i_545_, (float) i_544_, f_549_, f_548_, f_552_, f_551_, f_555_, f_554_, f_558_, f_557_);
							f_529_ += f_569_;
							f_530_ += f_579_;
							f_532_ += f_570_;
							f_533_ += f_580_;
							f_535_ += f_571_;
							f_536_ += f_581_;
							f_538_ += f_572_;
							f_539_ += f_582_;
							i_544_ += f_573_;
							i_545_ += f_583_;
							f_548_ += f_574_;
							f_549_ += f_584_;
							f_551_ += f_575_;
							f_552_ += f_585_;
							f_554_ += f_576_;
							f_555_ += f_586_;
							f_557_ += f_577_;
							f_558_ += f_587_;
							f += (float) anInt2215;
						}
					} else {
						f_527_ -= f_526_;
						f_526_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_526_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f, (int) f_528_, (int) f_530_, f_531_, f_533_, f_534_, f_536_, f_537_, f_539_, (float) i_543_, (float) i_545_, f_547_, f_549_, f_550_, f_552_, f_553_, f_555_, f_556_, f_558_);
							f_528_ += f_559_;
							f_530_ += f_579_;
							f_531_ += f_560_;
							f_533_ += f_580_;
							f_534_ += f_561_;
							f_536_ += f_581_;
							f_537_ += f_562_;
							f_539_ += f_582_;
							i_543_ += f_563_;
							i_545_ += f_583_;
							f_547_ += f_564_;
							f_549_ += f_584_;
							f_550_ += f_565_;
							f_552_ += f_585_;
							f_553_ += f_566_;
							f_555_ += f_586_;
							f_556_ += f_567_;
							f_558_ += f_587_;
							f += (float) anInt2215;
						}
						while (--f_527_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f, (int) f_529_, (int) f_530_, f_532_, f_533_, f_535_, f_536_, f_538_, f_539_, (float) i_544_, (float) i_545_, f_548_, f_549_, f_551_, f_552_, f_554_, f_555_, f_557_, f_558_);
							f_529_ += f_569_;
							f_530_ += f_579_;
							f_532_ += f_570_;
							f_533_ += f_580_;
							f_535_ += f_571_;
							f_536_ += f_581_;
							f_538_ += f_572_;
							f_539_ += f_582_;
							i_544_ += f_573_;
							i_545_ += f_583_;
							f_548_ += f_574_;
							f_549_ += f_584_;
							f_551_ += f_575_;
							f_552_ += f_585_;
							f_554_ += f_576_;
							f_555_ += f_586_;
							f_557_ += f_577_;
							f_558_ += f_587_;
							f += (float) anInt2215;
						}
					}
				} else {
					f_529_ = f_528_;
					f_532_ = f_531_;
					f_535_ = f_534_;
					f_538_ = f_537_;
					i_544_ = i_543_;
					f_548_ = f_547_;
					f_551_ = f_550_;
					f_554_ = f_553_;
					f_557_ = f_556_;
					if (f < 0.0F) {
						f_528_ -= f_559_ * f;
						f_529_ -= f_579_ * f;
						f_531_ -= f_560_ * f;
						f_532_ -= f_580_ * f;
						f_534_ -= f_561_ * f;
						f_535_ -= f_581_ * f;
						f_537_ -= f_562_ * f;
						f_538_ -= f_582_ * f;
						i_543_ -= f_563_ * f;
						i_544_ -= f_583_ * f;
						f_547_ -= f_564_ * f;
						f_548_ -= f_584_ * f;
						f_550_ -= f_564_ * f;
						f_551_ -= f_584_ * f;
						f_553_ -= f_564_ * f;
						f_554_ -= f_584_ * f;
						f_556_ -= f_564_ * f;
						f_557_ -= f_584_ * f;
						f = 0.0F;
					}
					if (f_527_ < 0.0F) {
						f_530_ -= f_569_ * f_527_;
						f_533_ -= f_570_ * f_527_;
						f_536_ -= f_571_ * f_527_;
						f_539_ -= f_572_ * f_527_;
						i_545_ -= f_573_ * f_527_;
						f_549_ -= f_574_ * f_527_;
						f_552_ -= f_575_ * f_527_;
						f_555_ -= f_576_ * f_527_;
						f_558_ -= f_577_ * f_527_;
						f_527_ = 0.0F;
					}
					if (f != f_527_ && f_579_ < f_559_ || f == f_527_ && f_569_ > f_559_) {
						f_526_ -= f_527_;
						f_527_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_527_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f, (int) f_529_, (int) f_528_, f_532_, f_531_, f_535_, f_534_, f_538_, f_537_, (float) i_544_, (float) i_543_, f_548_, f_547_, f_551_, f_550_, f_554_, f_553_, f_557_, f_556_);
							f_528_ += f_559_;
							f_529_ += f_579_;
							f_531_ += f_560_;
							f_532_ += f_580_;
							f_534_ += f_561_;
							f_535_ += f_581_;
							f_537_ += f_562_;
							f_538_ += f_582_;
							i_543_ += f_563_;
							i_544_ += f_583_;
							f_547_ += f_564_;
							f_548_ += f_584_;
							f_550_ += f_565_;
							f_551_ += f_585_;
							f_553_ += f_566_;
							f_554_ += f_586_;
							f_556_ += f_567_;
							f_557_ += f_587_;
							f += (float) anInt2215;
						}
						while (--f_526_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f, (int) f_530_, (int) f_528_, f_533_, f_531_, f_536_, f_534_, f_539_, f_537_, (float) i_545_, (float) i_543_, f_549_, f_547_, f_552_, f_550_, f_555_, f_553_, f_558_, f_556_);
							f_530_ += f_569_;
							f_528_ += f_559_;
							f_533_ += f_570_;
							f_531_ += f_560_;
							f_536_ += f_571_;
							f_534_ += f_561_;
							f_539_ += f_572_;
							f_537_ += f_562_;
							i_545_ += f_573_;
							i_543_ += f_563_;
							f_549_ += f_574_;
							f_547_ += f_564_;
							f_552_ += f_575_;
							f_550_ += f_565_;
							f_555_ += f_576_;
							f_553_ += f_566_;
							f_558_ += f_577_;
							f_556_ += f_567_;
							f += (float) anInt2215;
						}
					} else {
						f_526_ -= f_527_;
						f_527_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_527_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f, (int) f_528_, (int) f_529_, f_531_, f_532_, f_534_, f_535_, f_537_, f_538_, (float) i_543_, (float) i_544_, f_547_, f_548_, f_550_, f_551_, f_553_, f_554_, f_556_, f_557_);
							f_529_ += f_579_;
							f_528_ += f_559_;
							f_532_ += f_580_;
							f_531_ += f_560_;
							f_535_ += f_581_;
							f_534_ += f_561_;
							f_538_ += f_582_;
							f_537_ += f_562_;
							i_544_ += f_583_;
							i_543_ += f_563_;
							f_548_ += f_584_;
							f_547_ += f_564_;
							f_551_ += f_585_;
							f_550_ += f_565_;
							f_554_ += f_586_;
							f_553_ += f_566_;
							f_557_ += f_587_;
							f_556_ += f_567_;
							f += (float) anInt2215;
						}
						while (--f_526_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f, (int) f_528_, (int) f_530_, f_531_, f_533_, f_534_, f_536_, f_537_, f_539_, (float) i_543_, (float) i_545_, f_547_, f_549_, f_550_, f_552_, f_553_, f_555_, f_556_, f_558_);
							f_528_ += f_559_;
							f_530_ += f_569_;
							f_531_ += f_560_;
							f_533_ += f_570_;
							f_534_ += f_561_;
							f_536_ += f_571_;
							f_537_ += f_562_;
							f_539_ += f_572_;
							i_543_ += f_563_;
							i_545_ += f_573_;
							f_547_ += f_564_;
							f_549_ += f_574_;
							f_550_ += f_565_;
							f_552_ += f_575_;
							f_553_ += f_566_;
							f_555_ += f_576_;
							f_556_ += f_567_;
							f_558_ += f_577_;
							f += (float) anInt2215;
						}
					}
				}
			}
		} else if (f_526_ <= f_527_) {
			if (!(f_526_ >= (float) anInt2225)) {
				if (f_527_ > (float) anInt2225) {
					f_527_ = (float) anInt2225;
				}
				if (f > (float) anInt2225) {
					f = (float) anInt2225;
				}
				if (f_527_ < f) {
					f_528_ = f_529_;
					f_531_ = f_532_;
					f_534_ = f_535_;
					f_537_ = f_538_;
					i_543_ = i_544_;
					f_547_ = f_548_;
					f_550_ = f_551_;
					f_553_ = f_554_;
					f_556_ = f_557_;
					if (f_526_ < 0.0F) {
						f_528_ -= f_559_ * f_526_;
						f_529_ -= f_569_ * f_526_;
						f_531_ -= f_560_ * f_526_;
						f_532_ -= f_570_ * f_526_;
						f_534_ -= f_561_ * f_526_;
						f_535_ -= f_571_ * f_526_;
						f_537_ -= f_562_ * f_526_;
						f_538_ -= f_572_ * f_526_;
						i_543_ -= f_563_ * f_526_;
						i_544_ -= f_573_ * f_526_;
						f_547_ -= f_564_ * f_526_;
						f_548_ -= f_574_ * f_526_;
						f_550_ -= f_565_ * f_526_;
						f_551_ -= f_575_ * f_526_;
						f_553_ -= f_566_ * f_526_;
						f_554_ -= f_576_ * f_526_;
						f_556_ -= f_567_ * f_526_;
						f_557_ -= f_577_ * f_526_;
						f_526_ = 0.0F;
					}
					if (f_527_ < 0.0F) {
						f_530_ -= f_579_ * f_527_;
						f_533_ -= f_580_ * f_527_;
						f_536_ -= f_581_ * f_527_;
						f_539_ -= f_582_ * f_527_;
						i_545_ -= f_583_ * f_527_;
						f_549_ -= f_584_ * f_527_;
						f_552_ -= f_585_ * f_527_;
						f_555_ -= f_586_ * f_527_;
						f_558_ -= f_587_ * f_527_;
						f_527_ = 0.0F;
					}
					if (f_526_ != f_527_ && f_559_ < f_569_ || f_526_ == f_527_ && f_559_ > f_579_) {
						f -= f_527_;
						f_527_ -= f_526_;
						f_526_ = (float) anIntArray2224[(int) f_526_];
						while (--f_527_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f_526_, (int) f_528_, (int) f_529_, f_531_, f_532_, f_534_, f_535_, f_537_, f_538_, (float) i_543_, (float) i_544_, f_547_, f_548_, f_550_, f_551_, f_553_, f_554_, f_556_, f_557_);
							f_528_ += f_559_;
							f_529_ += f_569_;
							f_531_ += f_560_;
							f_532_ += f_570_;
							f_534_ += f_561_;
							f_535_ += f_571_;
							f_537_ += f_562_;
							f_538_ += f_572_;
							i_543_ += f_563_;
							i_544_ += f_573_;
							f_547_ += f_564_;
							f_548_ += f_574_;
							f_550_ += f_565_;
							f_551_ += f_575_;
							f_553_ += f_566_;
							f_554_ += f_576_;
							f_556_ += f_567_;
							f_557_ += f_577_;
							f_526_ += (float) anInt2215;
						}
						while (--f >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f_526_, (int) f_528_, (int) f_530_, f_531_, f_533_, f_534_, f_536_, f_537_, f_539_, (float) i_543_, (float) i_545_, f_547_, f_549_, f_550_, f_552_, f_553_, f_555_, f_556_, f_558_);
							f_528_ += f_559_;
							f_530_ += f_579_;
							f_531_ += f_560_;
							f_533_ += f_580_;
							f_534_ += f_561_;
							f_536_ += f_581_;
							f_537_ += f_562_;
							f_539_ += f_582_;
							i_543_ += f_563_;
							i_545_ += f_583_;
							f_547_ += f_564_;
							f_549_ += f_584_;
							f_550_ += f_565_;
							f_552_ += f_585_;
							f_553_ += f_566_;
							f_555_ += f_586_;
							f_556_ += f_567_;
							f_558_ += f_587_;
							f_526_ += (float) anInt2215;
						}
					} else {
						f -= f_527_;
						f_527_ -= f_526_;
						f_526_ = (float) anIntArray2224[(int) f_526_];
						while (--f_527_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f_526_, (int) f_529_, (int) f_528_, f_532_, f_531_, f_535_, f_534_, f_538_, f_537_, (float) i_544_, (float) i_543_, f_548_, f_547_, f_551_, f_550_, f_554_, f_553_, f_557_, f_556_);
							f_529_ += f_569_;
							f_528_ += f_559_;
							f_532_ += f_570_;
							f_531_ += f_560_;
							f_535_ += f_571_;
							f_534_ += f_561_;
							f_538_ += f_572_;
							f_537_ += f_562_;
							i_544_ += f_573_;
							i_543_ += f_563_;
							f_548_ += f_574_;
							f_547_ += f_564_;
							f_551_ += f_575_;
							f_550_ += f_565_;
							f_554_ += f_576_;
							f_553_ += f_566_;
							f_557_ += f_577_;
							f_556_ += f_567_;
							f_526_ += (float) anInt2215;
						}
						while (--f >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f_526_, (int) f_530_, (int) f_528_, f_533_, f_531_, f_536_, f_534_, f_539_, f_537_, (float) i_545_, (float) i_543_, f_549_, f_547_, f_552_, f_550_, f_555_, f_553_, f_558_, f_556_);
							f_530_ += f_579_;
							f_528_ += f_559_;
							f_533_ += f_580_;
							f_531_ += f_560_;
							f_536_ += f_581_;
							f_534_ += f_561_;
							f_539_ += f_582_;
							f_537_ += f_562_;
							i_545_ += f_583_;
							i_543_ += f_563_;
							f_549_ += f_584_;
							f_547_ += f_564_;
							f_552_ += f_585_;
							f_550_ += f_565_;
							f_555_ += f_586_;
							f_553_ += f_566_;
							f_558_ += f_587_;
							f_556_ += f_567_;
							f_526_ += (float) anInt2215;
						}
					}
				} else {
					f_530_ = f_529_;
					f_533_ = f_532_;
					f_536_ = f_535_;
					f_539_ = f_538_;
					i_545_ = i_544_;
					f_549_ = f_548_;
					f_552_ = f_551_;
					f_555_ = f_554_;
					f_558_ = f_557_;
					if (f_526_ < 0.0F) {
						f_530_ -= f_559_ * f_526_;
						f_529_ -= f_569_ * f_526_;
						f_533_ -= f_560_ * f_526_;
						f_532_ -= f_570_ * f_526_;
						f_536_ -= f_561_ * f_526_;
						f_535_ -= f_571_ * f_526_;
						f_539_ -= f_562_ * f_526_;
						f_538_ -= f_572_ * f_526_;
						i_545_ -= f_563_ * f_526_;
						i_544_ -= f_573_ * f_526_;
						f_549_ -= f_564_ * f_526_;
						f_548_ -= f_574_ * f_526_;
						f_552_ -= f_565_ * f_526_;
						f_551_ -= f_575_ * f_526_;
						f_555_ -= f_566_ * f_526_;
						f_554_ -= f_576_ * f_526_;
						f_558_ -= f_567_ * f_526_;
						f_557_ -= f_577_ * f_526_;
						f_526_ = 0.0F;
					}
					if (f < 0.0F) {
						f_528_ -= f_579_ * f;
						f_531_ -= f_580_ * f;
						f_534_ -= f_581_ * f;
						f_537_ -= f_582_ * f;
						i_543_ -= f_583_ * f;
						f_547_ -= f_584_ * f;
						f_550_ -= f_585_ * f;
						f_553_ -= f_586_ * f;
						f_556_ -= f_587_ * f;
						f = 0.0F;
					}
					f_527_ -= f;
					f -= f_526_;
					f_526_ = (float) anIntArray2224[(int) f_526_];
					if (f_559_ < f_569_) {
						while (--f >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f_526_, (int) f_530_, (int) f_529_, f_533_, f_532_, f_536_, f_535_, f_539_, f_538_, (float) i_545_, (float) i_544_, f_549_, f_548_, f_552_, f_551_, f_555_, f_554_, f_558_, f_557_);
							f_530_ += f_559_;
							f_529_ += f_569_;
							f_533_ += f_560_;
							f_532_ += f_570_;
							f_536_ += f_561_;
							f_535_ += f_571_;
							f_539_ += f_562_;
							f_538_ += f_572_;
							i_545_ += f_563_;
							i_544_ += f_573_;
							f_549_ += f_564_;
							f_548_ += f_574_;
							f_552_ += f_565_;
							f_551_ += f_575_;
							f_555_ += f_566_;
							f_554_ += f_576_;
							f_558_ += f_567_;
							f_557_ += f_577_;
							f_526_ += (float) anInt2215;
						}
						while (--f_527_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f_526_, (int) f_528_, (int) f_529_, f_531_, f_532_, f_534_, f_535_, f_537_, f_538_, (float) i_543_, (float) i_544_, f_547_, f_548_, f_550_, f_551_, f_553_, f_554_, f_556_, f_557_);
							f_528_ += f_579_;
							f_529_ += f_569_;
							f_531_ += f_580_;
							f_532_ += f_570_;
							f_534_ += f_581_;
							f_535_ += f_571_;
							f_537_ += f_582_;
							f_538_ += f_572_;
							i_543_ += f_583_;
							i_544_ += f_573_;
							f_547_ += f_584_;
							f_548_ += f_574_;
							f_550_ += f_585_;
							f_551_ += f_575_;
							f_553_ += f_586_;
							f_554_ += f_576_;
							f_556_ += f_587_;
							f_557_ += f_577_;
							f_526_ += (float) anInt2215;
						}
					} else {
						while (--f >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f_526_, (int) f_529_, (int) f_530_, f_532_, f_533_, f_535_, f_536_, f_538_, f_539_, (float) i_544_, (float) i_545_, f_548_, f_549_, f_551_, f_552_, f_554_, f_555_, f_557_, f_558_);
							f_529_ += f_569_;
							f_530_ += f_559_;
							f_532_ += f_570_;
							f_533_ += f_560_;
							f_535_ += f_571_;
							f_536_ += f_561_;
							f_538_ += f_572_;
							f_539_ += f_562_;
							i_544_ += f_573_;
							i_545_ += f_563_;
							f_548_ += f_574_;
							f_549_ += f_564_;
							f_551_ += f_575_;
							f_552_ += f_565_;
							f_554_ += f_576_;
							f_555_ += f_566_;
							f_557_ += f_577_;
							f_558_ += f_567_;
							f_526_ += (float) anInt2215;
						}
						while (--f_527_ >= 0.0F) {
							method1854(anIntArray2218, anIntArray2240, (int) f_526_, (int) f_529_, (int) f_528_, f_532_, f_531_, f_535_, f_534_, f_538_, f_537_, (float) i_544_, (float) i_543_, f_548_, f_547_, f_551_, f_550_, f_554_, f_553_, f_557_, f_556_);
							f_529_ += f_569_;
							f_528_ += f_579_;
							f_532_ += f_570_;
							f_531_ += f_580_;
							f_535_ += f_571_;
							f_534_ += f_581_;
							f_538_ += f_572_;
							f_537_ += f_582_;
							i_544_ += f_573_;
							i_543_ += f_583_;
							f_548_ += f_574_;
							f_547_ += f_584_;
							f_551_ += f_575_;
							f_550_ += f_585_;
							f_554_ += f_576_;
							f_553_ += f_586_;
							f_557_ += f_577_;
							f_556_ += f_587_;
							f_526_ += (float) anInt2215;
						}
					}
				}
			}
		} else if (!(f_527_ >= (float) anInt2225)) {
			if (f > (float) anInt2225) {
				f = (float) anInt2225;
			}
			if (f_526_ > (float) anInt2225) {
				f_526_ = (float) anInt2225;
			}
			if (f < f_526_) {
				f_529_ = f_530_;
				f_532_ = f_533_;
				f_535_ = f_536_;
				f_538_ = f_539_;
				i_544_ = i_545_;
				f_548_ = f_549_;
				f_551_ = f_552_;
				f_554_ = f_555_;
				f_557_ = f_558_;
				if (f_527_ < 0.0F) {
					f_530_ -= f_579_ * f_527_;
					f_529_ -= f_569_ * f_527_;
					f_533_ -= f_580_ * f_527_;
					f_532_ -= f_570_ * f_527_;
					f_536_ -= f_581_ * f_527_;
					f_535_ -= f_571_ * f_527_;
					f_539_ -= f_582_ * f_527_;
					f_538_ -= f_572_ * f_527_;
					i_545_ -= f_583_ * 3.0F;
					i_544_ -= f_573_ * f_527_;
					f_549_ -= f_584_ * f_527_;
					f_548_ -= f_574_ * f_527_;
					f_552_ -= f_585_ * f_527_;
					f_551_ -= f_575_ * f_527_;
					f_555_ -= f_586_ * f_527_;
					f_554_ -= f_576_ * f_527_;
					f_558_ -= f_587_ * f_527_;
					f_557_ -= f_577_ * f_527_;
					f_527_ = 0.0F;
				}
				if (f < 0.0F) {
					f_528_ -= f_559_ * f;
					f_531_ -= f_560_ * f;
					f_534_ -= f_561_ * f;
					f_537_ -= f_562_ * f;
					i_543_ -= f_563_ * f;
					f_547_ -= f_564_ * f;
					f_550_ -= f_565_ * f;
					f_553_ -= f_566_ * f;
					f_556_ -= f_567_ * f;
					f = 0.0F;
				}
				if (f_569_ < f_579_) {
					f_526_ -= f;
					f -= f_527_;
					f_527_ = (float) anIntArray2224[(int) f_527_];
					while (--f >= 0.0F) {
						method1854(anIntArray2218, anIntArray2240, (int) f_527_, (int) f_529_, (int) f_530_, f_532_, f_533_, f_535_, f_536_, f_538_, f_539_, (float) i_544_, (float) i_545_, f_548_, f_549_, f_551_, f_552_, f_554_, f_555_, f_557_, f_558_);
						f_529_ += f_569_;
						f_530_ += f_579_;
						f_532_ += f_570_;
						f_533_ += f_580_;
						f_535_ += f_571_;
						f_536_ += f_581_;
						f_538_ += f_572_;
						f_539_ += f_582_;
						i_544_ += f_573_;
						i_545_ += f_583_;
						f_548_ += f_574_;
						f_549_ += f_584_;
						f_551_ += f_575_;
						f_552_ += f_585_;
						f_554_ += f_576_;
						f_555_ += f_586_;
						f_557_ += f_577_;
						f_558_ += f_587_;
						f_527_ += (float) anInt2215;
					}
					while (--f_526_ >= 0.0F) {
						method1854(anIntArray2218, anIntArray2240, (int) f_527_, (int) f_529_, (int) f_528_, f_532_, f_531_, f_535_, f_534_, f_538_, f_537_, (float) i_544_, (float) i_543_, f_548_, f_547_, f_551_, f_550_, f_554_, f_553_, f_557_, f_556_);
						f_529_ += f_569_;
						f_528_ += f_559_;
						f_532_ += f_570_;
						f_531_ += f_560_;
						f_535_ += f_571_;
						f_534_ += f_561_;
						f_538_ += f_572_;
						f_537_ += f_562_;
						i_544_ += f_573_;
						i_543_ += f_563_;
						f_548_ += f_574_;
						f_547_ += f_564_;
						f_551_ += f_575_;
						f_550_ += f_565_;
						f_554_ += f_576_;
						f_553_ += f_566_;
						f_557_ += f_577_;
						f_556_ += f_567_;
						f_527_ += (float) anInt2215;
					}
				} else {
					f_526_ -= f;
					f -= f_527_;
					f_527_ = (float) anIntArray2224[(int) f_527_];
					while (--f >= 0.0F) {
						method1854(anIntArray2218, anIntArray2240, (int) f_527_, (int) f_530_, (int) f_529_, f_533_, f_532_, f_536_, f_535_, f_539_, f_538_, (float) i_545_, (float) i_544_, f_549_, f_548_, f_552_, f_551_, f_555_, f_554_, f_558_, f_557_);
						f_530_ += f_579_;
						f_529_ += f_569_;
						f_533_ += f_580_;
						f_532_ += f_570_;
						f_536_ += f_581_;
						f_535_ += f_571_;
						f_539_ += f_582_;
						f_538_ += f_572_;
						i_545_ += f_583_;
						i_544_ += f_573_;
						f_549_ += f_584_;
						f_548_ += f_574_;
						f_552_ += f_585_;
						f_551_ += f_575_;
						f_555_ += f_586_;
						f_554_ += f_576_;
						f_558_ += f_587_;
						f_557_ += f_577_;
						f_527_ += (float) anInt2215;
					}
					while (--f_526_ >= 0.0F) {
						method1854(anIntArray2218, anIntArray2240, (int) f_527_, (int) f_528_, (int) f_529_, f_531_, f_532_, f_534_, f_535_, f_537_, f_538_, (float) i_543_, (float) i_544_, f_547_, f_548_, f_550_, f_551_, f_553_, f_554_, f_556_, f_557_);
						f_528_ += f_559_;
						f_529_ += f_569_;
						f_531_ += f_560_;
						f_532_ += f_570_;
						f_534_ += f_561_;
						f_535_ += f_571_;
						f_537_ += f_562_;
						f_538_ += f_572_;
						i_543_ += f_563_;
						i_544_ += f_573_;
						f_547_ += f_564_;
						f_548_ += f_574_;
						f_550_ += f_565_;
						f_551_ += f_575_;
						f_553_ += f_566_;
						f_554_ += f_576_;
						f_556_ += f_567_;
						f_557_ += f_577_;
						f_527_ += (float) anInt2215;
					}
				}
			} else {
				f_528_ = f_530_;
				f_531_ = f_533_;
				f_534_ = f_536_;
				f_537_ = f_539_;
				i_543_ = i_545_;
				f_547_ = f_549_;
				f_550_ = f_552_;
				f_553_ = f_555_;
				f_556_ = f_558_;
				if (f_527_ < 0.0F) {
					f_530_ -= f_579_ * f_527_;
					f_528_ -= f_569_ * f_527_;
					f_533_ -= f_580_ * f_527_;
					f_531_ -= f_570_ * f_527_;
					f_536_ -= f_581_ * f_527_;
					f_534_ -= f_571_ * f_527_;
					f_539_ -= f_582_ * f_527_;
					f_537_ -= f_572_ * f_527_;
					i_545_ -= f_583_ * 3.0F;
					i_543_ -= f_573_ * f_527_;
					f_549_ -= f_584_ * f_527_;
					f_547_ -= f_574_ * f_527_;
					f_552_ -= f_585_ * f_527_;
					f_550_ -= f_575_ * f_527_;
					f_555_ -= f_586_ * f_527_;
					f_553_ -= f_576_ * f_527_;
					f_558_ -= f_587_ * f_527_;
					f_556_ -= f_577_ * f_527_;
					f_527_ = 0.0F;
				}
				if (f_526_ < 0.0F) {
					f_529_ -= f_559_ * f_526_;
					f_532_ -= f_560_ * f_526_;
					f_535_ -= f_561_ * f_526_;
					f_538_ -= f_562_ * f_526_;
					i_544_ -= f_563_ * f_526_;
					f_548_ -= f_564_ * f_526_;
					f_551_ -= f_565_ * f_526_;
					f_554_ -= f_566_ * f_526_;
					f_557_ -= f_567_ * f_526_;
					f_526_ = 0.0F;
				}
				if (f_569_ < f_579_) {
					f -= f_526_;
					f_526_ -= f_527_;
					f_527_ = (float) anIntArray2224[(int) f_527_];
					while (--f_526_ >= 0.0F) {
						method1854(anIntArray2218, anIntArray2240, (int) f_527_, (int) f_528_, (int) f_530_, f_531_, f_533_, f_534_, f_536_, f_537_, f_539_, (float) i_543_, (float) i_545_, f_547_, f_549_, f_550_, f_552_, f_553_, f_555_, f_556_, f_558_);
						f_528_ += f_569_;
						f_530_ += f_579_;
						f_531_ += f_570_;
						f_533_ += f_580_;
						f_534_ += f_571_;
						f_536_ += f_581_;
						f_537_ += f_572_;
						f_539_ += f_582_;
						i_543_ += f_573_;
						i_545_ += f_583_;
						f_547_ += f_574_;
						f_549_ += f_584_;
						f_550_ += f_575_;
						f_552_ += f_585_;
						f_553_ += f_576_;
						f_555_ += f_586_;
						f_556_ += f_577_;
						f_558_ += f_587_;
						f_527_ += (float) anInt2215;
					}
					while (--f >= 0.0F) {
						method1854(anIntArray2218, anIntArray2240, (int) f_527_, (int) f_529_, (int) f_530_, f_532_, f_533_, f_535_, f_536_, f_538_, f_539_, (float) i_544_, (float) i_545_, f_548_, f_549_, f_551_, f_552_, f_554_, f_555_, f_557_, f_558_);
						f_529_ += f_559_;
						f_530_ += f_579_;
						f_532_ += f_560_;
						f_533_ += f_580_;
						f_535_ += f_561_;
						f_536_ += f_581_;
						f_538_ += f_562_;
						f_539_ += f_582_;
						i_544_ += f_563_;
						i_545_ += f_583_;
						f_548_ += f_564_;
						f_549_ += f_584_;
						f_551_ += f_565_;
						f_552_ += f_585_;
						f_554_ += f_566_;
						f_555_ += f_586_;
						f_557_ += f_567_;
						f_558_ += f_587_;
						f_527_ += (float) anInt2215;
					}
				} else {
					f -= f_526_;
					f_526_ -= f_527_;
					f_527_ = (float) anIntArray2224[(int) f_527_];
					while (--f_526_ >= 0.0F) {
						method1854(anIntArray2218, anIntArray2240, (int) f_527_, (int) f_530_, (int) f_528_, f_533_, f_531_, f_536_, f_534_, f_539_, f_537_, (float) i_545_, (float) i_543_, f_549_, f_547_, f_552_, f_550_, f_555_, f_553_, f_558_, f_556_);
						f_530_ += f_579_;
						f_528_ += f_569_;
						f_533_ += f_580_;
						f_531_ += f_570_;
						f_536_ += f_581_;
						f_534_ += f_571_;
						f_539_ += f_582_;
						f_537_ += f_572_;
						i_545_ += f_583_;
						i_543_ += f_573_;
						f_549_ += f_584_;
						f_547_ += f_574_;
						f_552_ += f_585_;
						f_550_ += f_575_;
						f_555_ += f_586_;
						f_553_ += f_576_;
						f_558_ += f_587_;
						f_556_ += f_577_;
						f_527_ += (float) anInt2215;
					}
					while (--f >= 0.0F) {
						method1854(anIntArray2218, anIntArray2240, (int) f_527_, (int) f_530_, (int) f_529_, f_533_, f_532_, f_536_, f_535_, f_539_, f_538_, (float) i_545_, (float) i_544_, f_549_, f_548_, f_552_, f_551_, f_555_, f_554_, f_558_, f_557_);
						f_530_ += f_579_;
						f_529_ += f_559_;
						f_533_ += f_580_;
						f_532_ += f_560_;
						f_536_ += f_581_;
						f_535_ += f_561_;
						f_539_ += f_582_;
						f_538_ += f_562_;
						i_545_ += f_583_;
						i_544_ += f_563_;
						f_549_ += f_584_;
						f_548_ += f_564_;
						f_552_ += f_585_;
						f_551_ += f_565_;
						f_555_ += f_586_;
						f_554_ += f_566_;
						f_558_ += f_587_;
						f_557_ += f_567_;
						f_527_ += (float) anInt2215;
					}
				}
			}
		}
	}
	
	private final void method1860(int[] is, float[] fs, int i, int i_589_, int i_590_, int i_591_, int i_592_, float f, float f_593_, float f_594_, float f_595_) {
		if (aBoolean2217) {
			if (i_592_ > anInt2222) {
				i_592_ = anInt2222;
			}
			if (i_591_ < 0) {
				i_591_ = 0;
			}
		}
		if (i_591_ < i_592_) {
			i += i_591_ - 1;
			f += f_593_ * (float) i_591_;
			f_594_ += f_595_ * (float) i_591_;
			if (aClass374_2219.aBoolean4615) {
				do {
					if (aBoolean2226) {
						i_590_ = i_592_ - i_591_ >> 2;
						f_593_ *= 4.0F;
						if (anInt2220 == 0) {
							if (i_590_ > 0) {
								do {
									i_589_ = Class170.anIntArray2054[(int) f];
									f += f_593_;
									if (f_594_ < fs[++i]) {
										is[i] = i_589_;
										fs[i] = f_594_;
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										is[i] = i_589_;
										fs[i] = f_594_;
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										is[i] = i_589_;
										fs[i] = f_594_;
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										is[i] = i_589_;
										fs[i] = f_594_;
									}
									f_594_ += f_595_;
								} while (--i_590_ > 0);
							}
							i_590_ = i_592_ - i_591_ & 0x3;
							if (i_590_ > 0) {
								i_589_ = Class170.anIntArray2054[(int) f];
								do {
									if (f_594_ < fs[++i]) {
										is[i] = i_589_;
										fs[i] = f_594_;
									}
									f_594_ += f_595_;
								} while (--i_590_ > 0);
							}
						} else {
							int i_596_ = anInt2220;
							int i_597_ = 256 - anInt2220;
							if (i_590_ > 0) {
								do {
									i_589_ = Class170.anIntArray2054[(int) f];
									f += f_593_;
									i_589_ = ((i_589_ & 0xff00ff) * i_597_ >> 8 & 0xff00ff) + ((i_589_ & 0xff00) * i_597_ >> 8 & 0xff00);
									if (f_594_ < fs[++i]) {
										int i_598_ = is[i];
										is[i] = i_589_ + ((i_598_ & 0xff00ff) * i_596_ >> 8 & 0xff00ff) + ((i_598_ & 0xff00) * i_596_ >> 8 & 0xff00);
										fs[i] = f_594_;
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										int i_599_ = is[i];
										is[i] = i_589_ + ((i_599_ & 0xff00ff) * i_596_ >> 8 & 0xff00ff) + ((i_599_ & 0xff00) * i_596_ >> 8 & 0xff00);
										fs[i] = f_594_;
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										int i_600_ = is[i];
										is[i] = i_589_ + ((i_600_ & 0xff00ff) * i_596_ >> 8 & 0xff00ff) + ((i_600_ & 0xff00) * i_596_ >> 8 & 0xff00);
										fs[i] = f_594_;
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										int i_601_ = is[i];
										is[i] = i_589_ + ((i_601_ & 0xff00ff) * i_596_ >> 8 & 0xff00ff) + ((i_601_ & 0xff00) * i_596_ >> 8 & 0xff00);
										fs[i] = f_594_;
									}
									f_594_ += f_595_;
								} while (--i_590_ > 0);
							}
							i_590_ = i_592_ - i_591_ & 0x3;
							if (i_590_ <= 0) {
								break;
							}
							i_589_ = Class170.anIntArray2054[(int) f];
							i_589_ = ((i_589_ & 0xff00ff) * i_597_ >> 8 & 0xff00ff) + ((i_589_ & 0xff00) * i_597_ >> 8 & 0xff00);
							do {
								if (f_594_ < fs[++i]) {
									int i_602_ = is[i];
									is[i] = i_589_ + ((i_602_ & 0xff00ff) * i_596_ >> 8 & 0xff00ff) + ((i_602_ & 0xff00) * i_596_ >> 8 & 0xff00);
									fs[i] = f_594_;
								}
								f_594_ += f_595_;
							} while (--i_590_ > 0);
						}
						break;
					}
					i_590_ = i_592_ - i_591_;
					if (anInt2220 == 0) {
						do {
							if (f_594_ < fs[++i]) {
								is[i] = Class170.anIntArray2054[(int) f];
								fs[i] = f_594_;
							}
							f_594_ += f_595_;
							f += f_593_;
						} while (--i_590_ > 0);
						break;
					}
					int i_603_ = anInt2220;
					int i_604_ = 256 - anInt2220;
					do {
						if (f_594_ < fs[++i]) {
							i_589_ = Class170.anIntArray2054[(int) f];
							i_589_ = ((i_589_ & 0xff00ff) * i_604_ >> 8 & 0xff00ff) + ((i_589_ & 0xff00) * i_604_ >> 8 & 0xff00);
							int i_605_ = is[i];
							is[i] = i_589_ + ((i_605_ & 0xff00ff) * i_603_ >> 8 & 0xff00ff) + ((i_605_ & 0xff00) * i_603_ >> 8 & 0xff00);
							fs[i] = f_594_;
						}
						f += f_593_;
						f_594_ += f_595_;
					} while (--i_590_ > 0);
				} while (false);
			} else {
				do {
					if (aBoolean2226) {
						i_590_ = i_592_ - i_591_ >> 2;
						f_593_ *= 4.0F;
						if (anInt2220 == 0) {
							if (i_590_ > 0) {
								do {
									i_589_ = Class170.anIntArray2054[(int) f];
									f += f_593_;
									if (f_594_ < fs[++i]) {
										is[i] = i_589_;
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										is[i] = i_589_;
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										is[i] = i_589_;
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										is[i] = i_589_;
									}
									f_594_ += f_595_;
								} while (--i_590_ > 0);
							}
							i_590_ = i_592_ - i_591_ & 0x3;
							if (i_590_ > 0) {
								i_589_ = Class170.anIntArray2054[(int) f];
								do {
									if (f_594_ < fs[++i]) {
										is[i] = i_589_;
									}
									f_594_ += f_595_;
								} while (--i_590_ > 0);
							}
						} else {
							int i_606_ = anInt2220;
							int i_607_ = 256 - anInt2220;
							if (i_590_ > 0) {
								do {
									i_589_ = Class170.anIntArray2054[(int) f];
									f += f_593_;
									i_589_ = ((i_589_ & 0xff00ff) * i_607_ >> 8 & 0xff00ff) + ((i_589_ & 0xff00) * i_607_ >> 8 & 0xff00);
									if (f_594_ < fs[++i]) {
										int i_608_ = is[i];
										is[i] = i_589_ + ((i_608_ & 0xff00ff) * i_606_ >> 8 & 0xff00ff) + ((i_608_ & 0xff00) * i_606_ >> 8 & 0xff00);
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										int i_609_ = is[i];
										is[i] = i_589_ + ((i_609_ & 0xff00ff) * i_606_ >> 8 & 0xff00ff) + ((i_609_ & 0xff00) * i_606_ >> 8 & 0xff00);
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										int i_610_ = is[i];
										is[i] = i_589_ + ((i_610_ & 0xff00ff) * i_606_ >> 8 & 0xff00ff) + ((i_610_ & 0xff00) * i_606_ >> 8 & 0xff00);
									}
									f_594_ += f_595_;
									if (f_594_ < fs[++i]) {
										int i_611_ = is[i];
										is[i] = i_589_ + ((i_611_ & 0xff00ff) * i_606_ >> 8 & 0xff00ff) + ((i_611_ & 0xff00) * i_606_ >> 8 & 0xff00);
									}
									f_594_ += f_595_;
								} while (--i_590_ > 0);
							}
							i_590_ = i_592_ - i_591_ & 0x3;
							if (i_590_ <= 0) {
								break;
							}
							i_589_ = Class170.anIntArray2054[(int) f];
							i_589_ = ((i_589_ & 0xff00ff) * i_607_ >> 8 & 0xff00ff) + ((i_589_ & 0xff00) * i_607_ >> 8 & 0xff00);
							do {
								if (f_594_ < fs[++i]) {
									int i_612_ = is[i];
									is[i] = i_589_ + ((i_612_ & 0xff00ff) * i_606_ >> 8 & 0xff00ff) + ((i_612_ & 0xff00) * i_606_ >> 8 & 0xff00);
								}
								f_594_ += f_595_;
							} while (--i_590_ > 0);
						}
						break;
					}
					i_590_ = i_592_ - i_591_;
					if (anInt2220 == 0) {
						do {
							if (f_594_ < fs[++i]) {
								is[i] = Class170.anIntArray2054[(int) f];
							}
							f_594_ += f_595_;
							f += f_593_;
						} while (--i_590_ > 0);
						break;
					}
					int i_613_ = anInt2220;
					int i_614_ = 256 - anInt2220;
					do {
						if (f_594_ < fs[++i]) {
							i_589_ = Class170.anIntArray2054[(int) f];
							i_589_ = ((i_589_ & 0xff00ff) * i_614_ >> 8 & 0xff00ff) + ((i_589_ & 0xff00) * i_614_ >> 8 & 0xff00);
							int i_615_ = is[i];
							is[i] = i_589_ + ((i_615_ & 0xff00ff) * i_613_ >> 8 & 0xff00ff) + ((i_615_ & 0xff00) * i_613_ >> 8 & 0xff00);
						}
						f += f_593_;
						f_594_ += f_595_;
					} while (--i_590_ > 0);
				} while (false);
			}
		}
	}
	
	private final void method1861(int[] is, float[] fs, int i, int i_616_, int i_617_, int i_618_, int i_619_, float f, float f_620_) {
		if (aBoolean2217) {
			if (i_619_ > anInt2222) {
				i_619_ = anInt2222;
			}
			if (i_618_ < 0) {
				i_618_ = 0;
			}
		}
		if (i_618_ < i_619_) {
			i += i_618_ - 1;
			i_617_ = i_619_ - i_618_ >> 2;
			f += f_620_ * (float) i_618_;
			if (aClass374_2219.aBoolean4615) {
				if (anInt2220 == 0) {
					while (--i_617_ >= 0) {
						if (f < fs[++i]) {
							is[i] = i_616_;
							fs[i] = f;
						}
						f += f_620_;
						if (f < fs[++i]) {
							is[i] = i_616_;
							fs[i] = f;
						}
						f += f_620_;
						if (f < fs[++i]) {
							is[i] = i_616_;
							fs[i] = f;
						}
						f += f_620_;
						if (f < fs[++i]) {
							is[i] = i_616_;
							fs[i] = f;
						}
						f += f_620_;
					}
					i_617_ = i_619_ - i_618_ & 0x3;
					while (--i_617_ >= 0) {
						if (f < fs[++i]) {
							is[i] = i_616_;
							fs[i] = f;
						}
						f += f_620_;
					}
				} else if (anInt2220 == 254) {
					if (i_618_ != 0 && i_619_ <= anInt2222 - 1) {
						while (--i_617_ >= 0) {
							if (f < fs[++i]) {
								is[i - 1] = is[i];
							}
							f += f_620_;
							if (f < fs[++i]) {
								is[i - 1] = is[i];
							}
							f += f_620_;
							if (f < fs[++i]) {
								is[i - 1] = is[i];
							}
							f += f_620_;
							if (f < fs[++i]) {
								is[i - 1] = is[i];
							}
							f += f_620_;
						}
						i_617_ = i_619_ - i_618_ & 0x3;
						while (--i_617_ >= 0) {
							if (f < fs[++i]) {
								is[i - 1] = is[i];
							}
							f += f_620_;
						}
					}
				} else {
					int i_621_ = anInt2220;
					int i_622_ = 256 - anInt2220;
					i_616_ = ((i_616_ & 0xff00ff) * i_622_ >> 8 & 0xff00ff) + ((i_616_ & 0xff00) * i_622_ >> 8 & 0xff00);
					while (--i_617_ >= 0) {
						if (f < fs[++i]) {
							int i_623_ = is[i];
							is[i] = (i_622_ | i_623_ >> 24) << 24 | i_616_ + ((i_623_ & 0xff00ff) * i_621_ >> 8 & 0xff00ff) + ((i_623_ & 0xff00) * i_621_ >> 8 & 0xff00);
							fs[i] = f;
						}
						f += f_620_;
						if (f < fs[++i]) {
							int i_624_ = is[i];
							is[i] = (i_622_ | i_624_ >> 24) << 24 | i_616_ + ((i_624_ & 0xff00ff) * i_621_ >> 8 & 0xff00ff) + ((i_624_ & 0xff00) * i_621_ >> 8 & 0xff00);
							fs[i] = f;
						}
						f += f_620_;
						if (f < fs[++i]) {
							int i_625_ = is[i];
							is[i] = (i_622_ | i_625_ >> 24) << 24 | i_616_ + ((i_625_ & 0xff00ff) * i_621_ >> 8 & 0xff00ff) + ((i_625_ & 0xff00) * i_621_ >> 8 & 0xff00);
							fs[i] = f;
						}
						f += f_620_;
						if (f < fs[++i]) {
							int i_626_ = is[i];
							is[i] = (i_622_ | i_626_ >> 24) << 24 | i_616_ + ((i_626_ & 0xff00ff) * i_621_ >> 8 & 0xff00ff) + ((i_626_ & 0xff00) * i_621_ >> 8 & 0xff00);
							fs[i] = f;
						}
						f += f_620_;
					}
					i_617_ = i_619_ - i_618_ & 0x3;
					while (--i_617_ >= 0) {
						if (f < fs[++i]) {
							int i_627_ = is[i];
							is[i] = (i_622_ | i_627_ >> 24) << 24 | i_616_ + ((i_627_ & 0xff00ff) * i_621_ >> 8 & 0xff00ff) + ((i_627_ & 0xff00) * i_621_ >> 8 & 0xff00);
							fs[i] = f;
						}
						f += f_620_;
					}
				}
			} else if (anInt2220 == 0) {
				while (--i_617_ >= 0) {
					if (f < fs[++i]) {
						is[i] = i_616_;
					}
					f += f_620_;
					if (f < fs[++i]) {
						is[i] = i_616_;
					}
					f += f_620_;
					if (f < fs[++i]) {
						is[i] = i_616_;
					}
					f += f_620_;
					if (f < fs[++i]) {
						is[i] = i_616_;
					}
					f += f_620_;
				}
				i_617_ = i_619_ - i_618_ & 0x3;
				while (--i_617_ >= 0) {
					if (f < fs[++i]) {
						is[i] = i_616_;
					}
					f += f_620_;
				}
			} else if (anInt2220 == 254) {
				if (i_618_ != 0 && i_619_ <= anInt2222 - 1) {
					while (--i_617_ >= 0) {
						if (f < fs[++i]) {
							is[i - 1] = is[i];
						}
						f += f_620_;
						if (f < fs[++i]) {
							is[i - 1] = is[i];
						}
						f += f_620_;
						if (f < fs[++i]) {
							is[i - 1] = is[i];
						}
						f += f_620_;
						if (f < fs[++i]) {
							is[i - 1] = is[i];
						}
						f += f_620_;
					}
					i_617_ = i_619_ - i_618_ & 0x3;
					while (--i_617_ >= 0) {
						if (f < fs[++i]) {
							is[i - 1] = is[i];
						}
						f += f_620_;
					}
				}
			} else {
				int i_628_ = anInt2220;
				int i_629_ = 256 - anInt2220;
				i_616_ = ((i_616_ & 0xff00ff) * i_629_ >> 8 & 0xff00ff) + ((i_616_ & 0xff00) * i_629_ >> 8 & 0xff00);
				while (--i_617_ >= 0) {
					if (f < fs[++i]) {
						int i_630_ = is[i];
						is[i] = (i_629_ | i_630_ >> 24) << 24 | i_616_ + ((i_630_ & 0xff00ff) * i_628_ >> 8 & 0xff00ff) + ((i_630_ & 0xff00) * i_628_ >> 8 & 0xff00);
					}
					f += f_620_;
					if (f < fs[++i]) {
						int i_631_ = is[i];
						is[i] = (i_629_ | i_631_ >> 24) << 24 | i_616_ + ((i_631_ & 0xff00ff) * i_628_ >> 8 & 0xff00ff) + ((i_631_ & 0xff00) * i_628_ >> 8 & 0xff00);
					}
					f += f_620_;
					if (f < fs[++i]) {
						int i_632_ = is[i];
						is[i] = (i_629_ | i_632_ >> 24) << 24 | i_616_ + ((i_632_ & 0xff00ff) * i_628_ >> 8 & 0xff00ff) + ((i_632_ & 0xff00) * i_628_ >> 8 & 0xff00);
					}
					f += f_620_;
					if (f < fs[++i]) {
						int i_633_ = is[i];
						is[i] = (i_629_ | i_633_ >> 24) << 24 | i_616_ + ((i_633_ & 0xff00ff) * i_628_ >> 8 & 0xff00ff) + ((i_633_ & 0xff00) * i_628_ >> 8 & 0xff00);
					}
					f += f_620_;
				}
				i_617_ = i_619_ - i_618_ & 0x3;
				while (--i_617_ >= 0) {
					if (f < fs[++i]) {
						int i_634_ = is[i];
						is[i] = (i_629_ | i_634_ >> 24) << 24 | i_616_ + ((i_634_ & 0xff00ff) * i_628_ >> 8 & 0xff00ff) + ((i_634_ & 0xff00) * i_628_ >> 8 & 0xff00);
					}
					f += f_620_;
				}
			}
		}
	}
	
	final void method1862(float f, float f_635_, float f_636_, float f_637_, float f_638_, float f_639_, float f_640_, float f_641_, float f_642_, float f_643_, float f_644_, float f_645_) {
		if (aBoolean2227) {
			aPureJavaToolkit2221.method1236((int) f_635_, (int) f, (int) f_638_, Class170.anIntArray2054[(int) f_643_], 1, (int) f_637_);
			aPureJavaToolkit2221.method1236((int) f_636_, (int) f_635_, (int) f_639_, Class170.anIntArray2054[(int) f_643_], 1, (int) f_638_);
			aPureJavaToolkit2221.method1236((int) f, (int) f_636_, (int) f_637_, Class170.anIntArray2054[(int) f_643_], 1, (int) f_639_);
		} else {
			float f_646_ = f_638_ - f_637_;
			float f_647_ = f_635_ - f;
			float f_648_ = f_639_ - f_637_;
			float f_649_ = f_636_ - f;
			float f_650_ = f_644_ - f_643_;
			float f_651_ = f_645_ - f_643_;
			float f_652_ = f_641_ - f_640_;
			float f_653_ = f_642_ - f_640_;
			float f_654_;
			if (f_636_ != f_635_) {
				f_654_ = (f_639_ - f_638_) / (f_636_ - f_635_);
			} else {
				f_654_ = 0.0F;
			}
			float f_655_;
			if (f_635_ != f) {
				f_655_ = f_646_ / f_647_;
			} else {
				f_655_ = 0.0F;
			}
			float f_656_;
			if (f_636_ != f) {
				f_656_ = f_648_ / f_649_;
			} else {
				f_656_ = 0.0F;
			}
			float f_657_ = f_646_ * f_649_ - f_648_ * f_647_;
			if (f_657_ != 0.0F) {
				float f_658_ = (f_650_ * f_649_ - f_651_ * f_647_) / f_657_;
				float f_659_ = (f_651_ * f_646_ - f_650_ * f_648_) / f_657_;
				float f_660_ = (f_652_ * f_649_ - f_653_ * f_647_) / f_657_;
				float f_661_ = (f_653_ * f_646_ - f_652_ * f_648_) / f_657_;
				if (f <= f_635_ && f <= f_636_) {
					if (!(f >= (float) anInt2225)) {
						if (f_635_ > (float) anInt2225) {
							f_635_ = (float) anInt2225;
						}
						if (f_636_ > (float) anInt2225) {
							f_636_ = (float) anInt2225;
						}
						f_643_ = f_643_ - f_658_ * f_637_ + f_658_;
						f_640_ = f_640_ - f_660_ * f_637_ + f_660_;
						if (f_635_ < f_636_) {
							f_639_ = f_637_;
							if (f < 0.0F) {
								f_639_ -= f_656_ * f;
								f_637_ -= f_655_ * f;
								f_643_ -= f_659_ * f;
								f_640_ -= f_661_ * f;
								f = 0.0F;
							}
							if (f_635_ < 0.0F) {
								f_638_ -= f_654_ * f_635_;
								f_635_ = 0.0F;
							}
							if (f != f_635_ && f_656_ < f_655_ || f == f_635_ && f_656_ > f_654_) {
								f_636_ -= f_635_;
								f_635_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_635_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_639_, (int) f_637_, f_643_, f_658_, f_640_, f_660_);
									f_639_ += f_656_;
									f_637_ += f_655_;
									f_643_ += f_659_;
									f_640_ += f_661_;
									f += (float) anInt2215;
								}
								while (--f_636_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_639_, (int) f_638_, f_643_, f_658_, f_640_, f_660_);
									f_639_ += f_656_;
									f_638_ += f_654_;
									f_643_ += f_659_;
									f_640_ += f_661_;
									f += (float) anInt2215;
								}
							} else {
								f_636_ -= f_635_;
								f_635_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_635_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_637_, (int) f_639_, f_643_, f_658_, f_640_, f_660_);
									f_639_ += f_656_;
									f_637_ += f_655_;
									f_643_ += f_659_;
									f_640_ += f_661_;
									f += (float) anInt2215;
								}
								while (--f_636_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_638_, (int) f_639_, f_643_, f_658_, f_640_, f_660_);
									f_639_ += f_656_;
									f_638_ += f_654_;
									f_643_ += f_659_;
									f_640_ += f_661_;
									f += (float) anInt2215;
								}
							}
						} else {
							f_638_ = f_637_;
							if (f < 0.0F) {
								f_638_ -= f_656_ * f;
								f_637_ -= f_655_ * f;
								f_643_ -= f_659_ * f;
								f_640_ -= f_661_ * f;
								f = 0.0F;
							}
							if (f_636_ < 0.0F) {
								f_639_ -= f_654_ * f_636_;
								f_636_ = 0.0F;
							}
							if (f != f_636_ && f_656_ < f_655_ || f == f_636_ && f_654_ > f_655_) {
								f_635_ -= f_636_;
								f_636_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_636_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_638_, (int) f_637_, f_643_, f_658_, f_640_, f_660_);
									f_638_ += f_656_;
									f_637_ += f_655_;
									f_643_ += f_659_;
									f_640_ += f_661_;
									f += (float) anInt2215;
								}
								while (--f_635_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_639_, (int) f_637_, f_643_, f_658_, f_640_, f_660_);
									f_639_ += f_654_;
									f_637_ += f_655_;
									f_643_ += f_659_;
									f_640_ += f_661_;
									f += (float) anInt2215;
								}
							} else {
								f_635_ -= f_636_;
								f_636_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_636_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_637_, (int) f_638_, f_643_, f_658_, f_640_, f_660_);
									f_638_ += f_656_;
									f_637_ += f_655_;
									f_643_ += f_659_;
									f_640_ += f_661_;
									f += (float) anInt2215;
								}
								while (--f_635_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_637_, (int) f_639_, f_643_, f_658_, f_640_, f_660_);
									f_639_ += f_654_;
									f_637_ += f_655_;
									f_643_ += f_659_;
									f_640_ += f_661_;
									f += (float) anInt2215;
								}
							}
						}
					}
				} else if (f_635_ <= f_636_) {
					if (!(f_635_ >= (float) anInt2225)) {
						if (f_636_ > (float) anInt2225) {
							f_636_ = (float) anInt2225;
						}
						if (f > (float) anInt2225) {
							f = (float) anInt2225;
						}
						f_644_ = f_644_ - f_658_ * f_638_ + f_658_;
						f_641_ = f_641_ - f_660_ * f_638_ + f_660_;
						if (f_636_ < f) {
							f_637_ = f_638_;
							if (f_635_ < 0.0F) {
								f_637_ -= f_655_ * f_635_;
								f_638_ -= f_654_ * f_635_;
								f_644_ -= f_659_ * f_635_;
								f_641_ -= f_661_ * f_635_;
								f_635_ = 0.0F;
							}
							if (f_636_ < 0.0F) {
								f_639_ -= f_656_ * f_636_;
								f_636_ = 0.0F;
							}
							if (f_635_ != f_636_ && f_655_ < f_654_ || f_635_ == f_636_ && f_655_ > f_656_) {
								f -= f_636_;
								f_636_ -= f_635_;
								f_635_ = (float) anIntArray2224[(int) f_635_];
								while (--f_636_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f_635_, 0, 0, (int) f_637_, (int) f_638_, f_644_, f_658_, f_641_, f_660_);
									f_637_ += f_655_;
									f_638_ += f_654_;
									f_644_ += f_659_;
									f_641_ += f_661_;
									f_635_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f_635_, 0, 0, (int) f_637_, (int) f_639_, f_644_, f_658_, f_641_, f_660_);
									f_637_ += f_655_;
									f_639_ += f_656_;
									f_644_ += f_659_;
									f_641_ += f_661_;
									f_635_ += (float) anInt2215;
								}
							} else {
								f -= f_636_;
								f_636_ -= f_635_;
								f_635_ = (float) anIntArray2224[(int) f_635_];
								while (--f_636_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f_635_, 0, 0, (int) f_638_, (int) f_637_, f_644_, f_658_, f_641_, f_660_);
									f_637_ += f_655_;
									f_638_ += f_654_;
									f_644_ += f_659_;
									f_641_ += f_661_;
									f_635_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f_635_, 0, 0, (int) f_639_, (int) f_637_, f_644_, f_658_, f_641_, f_660_);
									f_637_ += f_655_;
									f_639_ += f_656_;
									f_644_ += f_659_;
									f_641_ += f_661_;
									f_635_ += (float) anInt2215;
								}
							}
						} else {
							f_639_ = f_638_;
							if (f_635_ < 0.0F) {
								f_639_ -= f_655_ * f_635_;
								f_638_ -= f_654_ * f_635_;
								f_644_ -= f_659_ * f_635_;
								f_641_ -= f_661_ * f_635_;
								f_635_ = 0.0F;
							}
							if (f < 0.0F) {
								f_637_ -= f_656_ * f;
								f = 0.0F;
							}
							if (f_655_ < f_654_) {
								f_636_ -= f;
								f -= f_635_;
								f_635_ = (float) anIntArray2224[(int) f_635_];
								while (--f >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f_635_, 0, 0, (int) f_639_, (int) f_638_, f_644_, f_658_, f_641_, f_660_);
									f_639_ += f_655_;
									f_638_ += f_654_;
									f_644_ += f_659_;
									f_641_ += f_661_;
									f_635_ += (float) anInt2215;
								}
								while (--f_636_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f_635_, 0, 0, (int) f_637_, (int) f_638_, f_644_, f_658_, f_641_, f_660_);
									f_637_ += f_656_;
									f_638_ += f_654_;
									f_644_ += f_659_;
									f_641_ += f_661_;
									f_635_ += (float) anInt2215;
								}
							} else {
								f_636_ -= f;
								f -= f_635_;
								f_635_ = (float) anIntArray2224[(int) f_635_];
								while (--f >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f_635_, 0, 0, (int) f_638_, (int) f_639_, f_644_, f_658_, f_641_, f_660_);
									f_639_ += f_655_;
									f_638_ += f_654_;
									f_644_ += f_659_;
									f_641_ += f_661_;
									f_635_ += (float) anInt2215;
								}
								while (--f_636_ >= 0.0F) {
									method1866(anIntArray2218, aFloatArray2214, (int) f_635_, 0, 0, (int) f_638_, (int) f_637_, f_644_, f_658_, f_641_, f_660_);
									f_637_ += f_656_;
									f_638_ += f_654_;
									f_644_ += f_659_;
									f_641_ += f_661_;
									f_635_ += (float) anInt2215;
								}
							}
						}
					}
				} else if (!(f_636_ >= (float) anInt2225)) {
					if (f > (float) anInt2225) {
						f = (float) anInt2225;
					}
					if (f_635_ > (float) anInt2225) {
						f_635_ = (float) anInt2225;
					}
					f_645_ = f_645_ - f_658_ * f_639_ + f_658_;
					f_642_ = f_642_ - f_660_ * f_639_ + f_660_;
					if (f < f_635_) {
						f_638_ = f_639_;
						if (f_636_ < 0.0F) {
							f_638_ -= f_654_ * f_636_;
							f_639_ -= f_656_ * f_636_;
							f_645_ -= f_659_ * f_636_;
							f_642_ -= f_661_ * f_636_;
							f_636_ = 0.0F;
						}
						if (f < 0.0F) {
							f_637_ -= f_655_ * f;
							f = 0.0F;
						}
						if (f_654_ < f_656_) {
							f_635_ -= f;
							f -= f_636_;
							f_636_ = (float) anIntArray2224[(int) f_636_];
							while (--f >= 0.0F) {
								method1866(anIntArray2218, aFloatArray2214, (int) f_636_, 0, 0, (int) f_638_, (int) f_639_, f_645_, f_658_, f_642_, f_660_);
								f_638_ += f_654_;
								f_639_ += f_656_;
								f_645_ += f_659_;
								f_642_ += f_661_;
								f_636_ += (float) anInt2215;
							}
							while (--f_635_ >= 0.0F) {
								method1866(anIntArray2218, aFloatArray2214, (int) f_636_, 0, 0, (int) f_638_, (int) f_637_, f_645_, f_658_, f_642_, f_660_);
								f_638_ += f_654_;
								f_637_ += f_655_;
								f_645_ += f_659_;
								f_642_ += f_661_;
								f_636_ += (float) anInt2215;
							}
						} else {
							f_635_ -= f;
							f -= f_636_;
							f_636_ = (float) anIntArray2224[(int) f_636_];
							while (--f >= 0.0F) {
								method1866(anIntArray2218, aFloatArray2214, (int) f_636_, 0, 0, (int) f_639_, (int) f_638_, f_645_, f_658_, f_642_, f_660_);
								f_638_ += f_654_;
								f_639_ += f_656_;
								f_645_ += f_659_;
								f_642_ += f_661_;
								f_636_ += (float) anInt2215;
							}
							while (--f_635_ >= 0.0F) {
								method1866(anIntArray2218, aFloatArray2214, (int) f_636_, 0, 0, (int) f_637_, (int) f_638_, f_645_, f_658_, f_642_, f_660_);
								f_638_ += f_654_;
								f_637_ += f_655_;
								f_645_ += f_659_;
								f_642_ += f_661_;
								f_636_ += (float) anInt2215;
							}
						}
					} else {
						f_637_ = f_639_;
						if (f_636_ < 0.0F) {
							f_637_ -= f_654_ * f_636_;
							f_639_ -= f_656_ * f_636_;
							f_645_ -= f_659_ * f_636_;
							f_642_ -= f_661_ * f_636_;
							f_636_ = 0.0F;
						}
						if (f_635_ < 0.0F) {
							f_638_ -= f_655_ * f_635_;
							f_635_ = 0.0F;
						}
						if (f_654_ < f_656_) {
							f -= f_635_;
							f_635_ -= f_636_;
							f_636_ = (float) anIntArray2224[(int) f_636_];
							while (--f_635_ >= 0.0F) {
								method1866(anIntArray2218, aFloatArray2214, (int) f_636_, 0, 0, (int) f_637_, (int) f_639_, f_645_, f_658_, f_642_, f_660_);
								f_637_ += f_654_;
								f_639_ += f_656_;
								f_645_ += f_659_;
								f_642_ += f_661_;
								f_636_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1866(anIntArray2218, aFloatArray2214, (int) f_636_, 0, 0, (int) f_638_, (int) f_639_, f_645_, f_658_, f_642_, f_660_);
								f_638_ += f_655_;
								f_639_ += f_656_;
								f_645_ += f_659_;
								f_642_ += f_661_;
								f_636_ += (float) anInt2215;
							}
						} else {
							f -= f_635_;
							f_635_ -= f_636_;
							f_636_ = (float) anIntArray2224[(int) f_636_];
							while (--f_635_ >= 0.0F) {
								method1866(anIntArray2218, aFloatArray2214, (int) f_636_, 0, 0, (int) f_639_, (int) f_637_, f_645_, f_658_, f_642_, f_660_);
								f_637_ += f_654_;
								f_639_ += f_656_;
								f_645_ += f_659_;
								f_642_ += f_661_;
								f_636_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1866(anIntArray2218, aFloatArray2214, (int) f_636_, 0, 0, (int) f_639_, (int) f_638_, f_645_, f_658_, f_642_, f_660_);
								f_638_ += f_655_;
								f_639_ += f_656_;
								f_645_ += f_659_;
								f_642_ += f_661_;
								f_636_ += (float) anInt2215;
							}
						}
					}
				}
			}
		}
	}
	
	final void method1863(float f, float f_662_, float f_663_, float f_664_, float f_665_, float f_666_, float f_667_, float f_668_, float f_669_, float f_670_, float f_671_, float f_672_, float f_673_, float f_674_, float f_675_, int i, int i_676_, int i_677_, int i_678_, int i_679_, int i_680_, int i_681_, int i_682_) {
		if (i_682_ != anInt2234) {
			anIntArray2240 = aPureJavaToolkit2221.method1495(i_682_);
			if (anIntArray2240 == null) {
				method1852((float) (int) f, (float) (int) f_662_, (float) (int) f_663_, (float) (int) f_664_, (float) (int) f_665_, (float) (int) f_666_, (float) (int) f_667_, (float) (int) f_668_, (float) (int) f_669_, Class249.method3086(i_678_ | i_679_ << 24, i, (byte) -56), Class249.method3086(i_678_ | i_680_ << 24, i_676_, (byte) -56), Class249.method3086(i_678_ | i_681_ << 24, i_677_, (byte) -56));
				return;
			}
			anInt2232 = aPureJavaToolkit2221.method1505(i_682_) ? 64 : aPureJavaToolkit2221.anInt6775;
			anInt2243 = anInt2232 - 1;
			anInt2229 = aPureJavaToolkit2221.method1502(i_682_);
			aBoolean2239 = aPureJavaToolkit2221.method1503(i_682_);
		}
		anInt2230 = i_678_;
		float f_683_ = (float) (i >> 24 & 0xff);
		float f_684_ = (float) (i_676_ >> 24 & 0xff);
		float f_685_ = (float) (i_677_ >> 24 & 0xff);
		float f_686_ = (float) (i >> 16 & 0xff);
		float f_687_ = (float) (i_676_ >> 16 & 0xff);
		float f_688_ = (float) (i_677_ >> 16 & 0xff);
		float f_689_ = (float) (i >> 8 & 0xff);
		float f_690_ = (float) (i_676_ >> 8 & 0xff);
		float f_691_ = (float) (i_677_ >> 8 & 0xff);
		float f_692_ = (float) (i & 0xff);
		float f_693_ = (float) (i_676_ & 0xff);
		float f_694_ = (float) (i_677_ & 0xff);
		f_670_ /= f_667_;
		f_671_ /= f_668_;
		f_672_ /= f_669_;
		f_673_ /= f_667_;
		f_674_ /= f_668_;
		f_675_ /= f_669_;
		f_667_ = 1.0F / f_667_;
		f_668_ = 1.0F / f_668_;
		f_669_ = 1.0F / f_669_;
		float f_695_ = 0.0F;
		float f_696_ = 0.0F;
		float f_697_ = 0.0F;
		float f_698_ = 0.0F;
		float f_699_ = 0.0F;
		float f_700_ = 0.0F;
		float f_701_ = 0.0F;
		float f_702_ = 0.0F;
		float f_703_ = 0.0F;
		if (f_662_ != f) {
			float f_704_ = f_662_ - f;
			f_695_ = (f_665_ - f_664_) / f_704_;
			f_696_ = (f_668_ - f_667_) / f_704_;
			f_697_ = (f_671_ - f_670_) / f_704_;
			f_698_ = (f_674_ - f_673_) / f_704_;
			f_699_ = (float) (i_680_ - i_679_) / f_704_;
			f_700_ = (f_684_ - f_683_) / f_704_;
			f_701_ = (f_687_ - f_686_) / f_704_;
			f_702_ = (f_690_ - f_689_) / f_704_;
			f_703_ = (f_693_ - f_692_) / f_704_;
		}
		float f_705_ = 0.0F;
		float f_706_ = 0.0F;
		float f_707_ = 0.0F;
		float f_708_ = 0.0F;
		float f_709_ = 0.0F;
		float f_710_ = 0.0F;
		float f_711_ = 0.0F;
		float f_712_ = 0.0F;
		float f_713_ = 0.0F;
		if (f_663_ != f_662_) {
			float f_714_ = f_663_ - f_662_;
			f_705_ = (f_666_ - f_665_) / f_714_;
			f_706_ = (f_669_ - f_668_) / f_714_;
			f_707_ = (f_672_ - f_671_) / f_714_;
			f_708_ = (f_675_ - f_674_) / f_714_;
			f_709_ = (float) (i_681_ - i_680_) / f_714_;
			f_710_ = (f_685_ - f_684_) / f_714_;
			f_711_ = (f_688_ - f_687_) / f_714_;
			f_712_ = (f_691_ - f_690_) / f_714_;
			f_713_ = (f_694_ - f_693_) / f_714_;
		}
		float f_715_ = 0.0F;
		float f_716_ = 0.0F;
		float f_717_ = 0.0F;
		float f_718_ = 0.0F;
		float f_719_ = 0.0F;
		float f_720_ = 0.0F;
		float f_721_ = 0.0F;
		float f_722_ = 0.0F;
		float f_723_ = 0.0F;
		if (f != f_663_) {
			float f_724_ = f - f_663_;
			f_715_ = (f_664_ - f_666_) / f_724_;
			f_716_ = (f_667_ - f_669_) / f_724_;
			f_717_ = (f_670_ - f_672_) / f_724_;
			f_718_ = (f_673_ - f_675_) / f_724_;
			f_719_ = (float) (i_679_ - i_681_) / f_724_;
			f_720_ = (f_683_ - f_685_) / f_724_;
			f_721_ = (f_686_ - f_688_) / f_724_;
			f_722_ = (f_689_ - f_691_) / f_724_;
			f_723_ = (f_692_ - f_694_) / f_724_;
		}
		if (f <= f_662_ && f <= f_663_) {
			if (!(f >= (float) anInt2225)) {
				if (f_662_ > (float) anInt2225) {
					f_662_ = (float) anInt2225;
				}
				if (f_663_ > (float) anInt2225) {
					f_663_ = (float) anInt2225;
				}
				if (f_662_ < f_663_) {
					f_666_ = f_664_;
					f_669_ = f_667_;
					f_672_ = f_670_;
					f_675_ = f_673_;
					i_681_ = i_679_;
					f_685_ = f_683_;
					f_688_ = f_686_;
					f_691_ = f_689_;
					f_694_ = f_692_;
					if (f < 0.0F) {
						f_664_ -= f_695_ * f;
						f_666_ -= f_715_ * f;
						f_667_ -= f_696_ * f;
						f_669_ -= f_716_ * f;
						f_670_ -= f_697_ * f;
						f_672_ -= f_717_ * f;
						f_673_ -= f_698_ * f;
						f_675_ -= f_718_ * f;
						i_679_ -= f_699_ * f;
						i_681_ -= f_719_ * f;
						f_683_ -= f_700_ * f;
						f_685_ -= f_720_ * f;
						f_686_ -= f_700_ * f;
						f_688_ -= f_720_ * f;
						f_689_ -= f_700_ * f;
						f_691_ -= f_720_ * f;
						f_692_ -= f_700_ * f;
						f_694_ -= f_720_ * f;
						f = 0.0F;
					}
					if (f_662_ < 0.0F) {
						f_665_ -= f_705_ * f_662_;
						f_668_ -= f_706_ * f_662_;
						f_671_ -= f_707_ * f_662_;
						f_674_ -= f_708_ * f_662_;
						i_680_ -= f_709_ * f_662_;
						f_684_ -= f_710_ * f_662_;
						f_687_ -= f_711_ * f_662_;
						f_690_ -= f_712_ * f_662_;
						f_693_ -= f_713_ * f_662_;
						f_662_ = 0.0F;
					}
					if (f != f_662_ && f_715_ < f_695_ || f == f_662_ && f_715_ > f_705_) {
						f_663_ -= f_662_;
						f_662_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_662_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f, (int) f_666_, (int) f_664_, f_669_, f_667_, f_672_, f_670_, f_675_, f_673_, (float) i_681_, (float) i_679_, f_685_, f_683_, f_688_, f_686_, f_691_, f_689_, f_694_, f_692_);
							f_664_ += f_695_;
							f_666_ += f_715_;
							f_667_ += f_696_;
							f_669_ += f_716_;
							f_670_ += f_697_;
							f_672_ += f_717_;
							f_673_ += f_698_;
							f_675_ += f_718_;
							i_679_ += f_699_;
							i_681_ += f_719_;
							f_683_ += f_700_;
							f_685_ += f_720_;
							f_686_ += f_701_;
							f_688_ += f_721_;
							f_689_ += f_702_;
							f_691_ += f_722_;
							f_692_ += f_703_;
							f_694_ += f_723_;
							f += (float) anInt2215;
						}
						while (--f_663_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f, (int) f_666_, (int) f_665_, f_669_, f_668_, f_672_, f_671_, f_675_, f_674_, (float) i_681_, (float) i_680_, f_685_, f_684_, f_688_, f_687_, f_691_, f_690_, f_694_, f_693_);
							f_665_ += f_705_;
							f_666_ += f_715_;
							f_668_ += f_706_;
							f_669_ += f_716_;
							f_671_ += f_707_;
							f_672_ += f_717_;
							f_674_ += f_708_;
							f_675_ += f_718_;
							i_680_ += f_709_;
							i_681_ += f_719_;
							f_684_ += f_710_;
							f_685_ += f_720_;
							f_687_ += f_711_;
							f_688_ += f_721_;
							f_690_ += f_712_;
							f_691_ += f_722_;
							f_693_ += f_713_;
							f_694_ += f_723_;
							f += (float) anInt2215;
						}
					} else {
						f_663_ -= f_662_;
						f_662_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_662_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f, (int) f_664_, (int) f_666_, f_667_, f_669_, f_670_, f_672_, f_673_, f_675_, (float) i_679_, (float) i_681_, f_683_, f_685_, f_686_, f_688_, f_689_, f_691_, f_692_, f_694_);
							f_664_ += f_695_;
							f_666_ += f_715_;
							f_667_ += f_696_;
							f_669_ += f_716_;
							f_670_ += f_697_;
							f_672_ += f_717_;
							f_673_ += f_698_;
							f_675_ += f_718_;
							i_679_ += f_699_;
							i_681_ += f_719_;
							f_683_ += f_700_;
							f_685_ += f_720_;
							f_686_ += f_701_;
							f_688_ += f_721_;
							f_689_ += f_702_;
							f_691_ += f_722_;
							f_692_ += f_703_;
							f_694_ += f_723_;
							f += (float) anInt2215;
						}
						while (--f_663_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f, (int) f_665_, (int) f_666_, f_668_, f_669_, f_671_, f_672_, f_674_, f_675_, (float) i_680_, (float) i_681_, f_684_, f_685_, f_687_, f_688_, f_690_, f_691_, f_693_, f_694_);
							f_665_ += f_705_;
							f_666_ += f_715_;
							f_668_ += f_706_;
							f_669_ += f_716_;
							f_671_ += f_707_;
							f_672_ += f_717_;
							f_674_ += f_708_;
							f_675_ += f_718_;
							i_680_ += f_709_;
							i_681_ += f_719_;
							f_684_ += f_710_;
							f_685_ += f_720_;
							f_687_ += f_711_;
							f_688_ += f_721_;
							f_690_ += f_712_;
							f_691_ += f_722_;
							f_693_ += f_713_;
							f_694_ += f_723_;
							f += (float) anInt2215;
						}
					}
				} else {
					f_665_ = f_664_;
					f_668_ = f_667_;
					f_671_ = f_670_;
					f_674_ = f_673_;
					i_680_ = i_679_;
					f_684_ = f_683_;
					f_687_ = f_686_;
					f_690_ = f_689_;
					f_693_ = f_692_;
					if (f < 0.0F) {
						f_664_ -= f_695_ * f;
						f_665_ -= f_715_ * f;
						f_667_ -= f_696_ * f;
						f_668_ -= f_716_ * f;
						f_670_ -= f_697_ * f;
						f_671_ -= f_717_ * f;
						f_673_ -= f_698_ * f;
						f_674_ -= f_718_ * f;
						i_679_ -= f_699_ * f;
						i_680_ -= f_719_ * f;
						f_683_ -= f_700_ * f;
						f_684_ -= f_720_ * f;
						f_686_ -= f_700_ * f;
						f_687_ -= f_720_ * f;
						f_689_ -= f_700_ * f;
						f_690_ -= f_720_ * f;
						f_692_ -= f_700_ * f;
						f_693_ -= f_720_ * f;
						f = 0.0F;
					}
					if (f_663_ < 0.0F) {
						f_666_ -= f_705_ * f_663_;
						f_669_ -= f_706_ * f_663_;
						f_672_ -= f_707_ * f_663_;
						f_675_ -= f_708_ * f_663_;
						i_681_ -= f_709_ * f_663_;
						f_685_ -= f_710_ * f_663_;
						f_688_ -= f_711_ * f_663_;
						f_691_ -= f_712_ * f_663_;
						f_694_ -= f_713_ * f_663_;
						f_663_ = 0.0F;
					}
					if (f != f_663_ && f_715_ < f_695_ || f == f_663_ && f_705_ > f_695_) {
						f_662_ -= f_663_;
						f_663_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_663_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f, (int) f_665_, (int) f_664_, f_668_, f_667_, f_671_, f_670_, f_674_, f_673_, (float) i_680_, (float) i_679_, f_684_, f_683_, f_687_, f_686_, f_690_, f_689_, f_693_, f_692_);
							f_664_ += f_695_;
							f_665_ += f_715_;
							f_667_ += f_696_;
							f_668_ += f_716_;
							f_670_ += f_697_;
							f_671_ += f_717_;
							f_673_ += f_698_;
							f_674_ += f_718_;
							i_679_ += f_699_;
							i_680_ += f_719_;
							f_683_ += f_700_;
							f_684_ += f_720_;
							f_686_ += f_701_;
							f_687_ += f_721_;
							f_689_ += f_702_;
							f_690_ += f_722_;
							f_692_ += f_703_;
							f_693_ += f_723_;
							f += (float) anInt2215;
						}
						while (--f_662_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f, (int) f_666_, (int) f_664_, f_669_, f_667_, f_672_, f_670_, f_675_, f_673_, (float) i_681_, (float) i_679_, f_685_, f_683_, f_688_, f_686_, f_691_, f_689_, f_694_, f_692_);
							f_666_ += f_705_;
							f_664_ += f_695_;
							f_669_ += f_706_;
							f_667_ += f_696_;
							f_672_ += f_707_;
							f_670_ += f_697_;
							f_675_ += f_708_;
							f_673_ += f_698_;
							i_681_ += f_709_;
							i_679_ += f_699_;
							f_685_ += f_710_;
							f_683_ += f_700_;
							f_688_ += f_711_;
							f_686_ += f_701_;
							f_691_ += f_712_;
							f_689_ += f_702_;
							f_694_ += f_713_;
							f_692_ += f_703_;
							f += (float) anInt2215;
						}
					} else {
						f_662_ -= f_663_;
						f_663_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_663_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f, (int) f_664_, (int) f_665_, f_667_, f_668_, f_670_, f_671_, f_673_, f_674_, (float) i_679_, (float) i_680_, f_683_, f_684_, f_686_, f_687_, f_689_, f_690_, f_692_, f_693_);
							f_665_ += f_715_;
							f_664_ += f_695_;
							f_668_ += f_716_;
							f_667_ += f_696_;
							f_671_ += f_717_;
							f_670_ += f_697_;
							f_674_ += f_718_;
							f_673_ += f_698_;
							i_680_ += f_719_;
							i_679_ += f_699_;
							f_684_ += f_720_;
							f_683_ += f_700_;
							f_687_ += f_721_;
							f_686_ += f_701_;
							f_690_ += f_722_;
							f_689_ += f_702_;
							f_693_ += f_723_;
							f_692_ += f_703_;
							f += (float) anInt2215;
						}
						while (--f_662_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f, (int) f_664_, (int) f_666_, f_667_, f_669_, f_670_, f_672_, f_673_, f_675_, (float) i_679_, (float) i_681_, f_683_, f_685_, f_686_, f_688_, f_689_, f_691_, f_692_, f_694_);
							f_664_ += f_695_;
							f_666_ += f_705_;
							f_667_ += f_696_;
							f_669_ += f_706_;
							f_670_ += f_697_;
							f_672_ += f_707_;
							f_673_ += f_698_;
							f_675_ += f_708_;
							i_679_ += f_699_;
							i_681_ += f_709_;
							f_683_ += f_700_;
							f_685_ += f_710_;
							f_686_ += f_701_;
							f_688_ += f_711_;
							f_689_ += f_702_;
							f_691_ += f_712_;
							f_692_ += f_703_;
							f_694_ += f_713_;
							f += (float) anInt2215;
						}
					}
				}
			}
		} else if (f_662_ <= f_663_) {
			if (!(f_662_ >= (float) anInt2225)) {
				if (f_663_ > (float) anInt2225) {
					f_663_ = (float) anInt2225;
				}
				if (f > (float) anInt2225) {
					f = (float) anInt2225;
				}
				if (f_663_ < f) {
					f_664_ = f_665_;
					f_667_ = f_668_;
					f_670_ = f_671_;
					f_673_ = f_674_;
					i_679_ = i_680_;
					f_683_ = f_684_;
					f_686_ = f_687_;
					f_689_ = f_690_;
					f_692_ = f_693_;
					if (f_662_ < 0.0F) {
						f_664_ -= f_695_ * f_662_;
						f_665_ -= f_705_ * f_662_;
						f_667_ -= f_696_ * f_662_;
						f_668_ -= f_706_ * f_662_;
						f_670_ -= f_697_ * f_662_;
						f_671_ -= f_707_ * f_662_;
						f_673_ -= f_698_ * f_662_;
						f_674_ -= f_708_ * f_662_;
						i_679_ -= f_699_ * f_662_;
						i_680_ -= f_709_ * f_662_;
						f_683_ -= f_700_ * f_662_;
						f_684_ -= f_710_ * f_662_;
						f_686_ -= f_701_ * f_662_;
						f_687_ -= f_711_ * f_662_;
						f_689_ -= f_702_ * f_662_;
						f_690_ -= f_712_ * f_662_;
						f_692_ -= f_703_ * f_662_;
						f_693_ -= f_713_ * f_662_;
						f_662_ = 0.0F;
					}
					if (f_663_ < 0.0F) {
						f_666_ -= f_715_ * f_663_;
						f_669_ -= f_716_ * f_663_;
						f_672_ -= f_717_ * f_663_;
						f_675_ -= f_718_ * f_663_;
						i_681_ -= f_719_ * f_663_;
						f_685_ -= f_720_ * f_663_;
						f_688_ -= f_721_ * f_663_;
						f_691_ -= f_722_ * f_663_;
						f_694_ -= f_723_ * f_663_;
						f_663_ = 0.0F;
					}
					if (f_662_ != f_663_ && f_695_ < f_705_ || f_662_ == f_663_ && f_695_ > f_715_) {
						f -= f_663_;
						f_663_ -= f_662_;
						f_662_ = (float) anIntArray2224[(int) f_662_];
						while (--f_663_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f_662_, (int) f_664_, (int) f_665_, f_667_, f_668_, f_670_, f_671_, f_673_, f_674_, (float) i_679_, (float) i_680_, f_683_, f_684_, f_686_, f_687_, f_689_, f_690_, f_692_, f_693_);
							f_664_ += f_695_;
							f_665_ += f_705_;
							f_667_ += f_696_;
							f_668_ += f_706_;
							f_670_ += f_697_;
							f_671_ += f_707_;
							f_673_ += f_698_;
							f_674_ += f_708_;
							i_679_ += f_699_;
							i_680_ += f_709_;
							f_683_ += f_700_;
							f_684_ += f_710_;
							f_686_ += f_701_;
							f_687_ += f_711_;
							f_689_ += f_702_;
							f_690_ += f_712_;
							f_692_ += f_703_;
							f_693_ += f_713_;
							f_662_ += (float) anInt2215;
						}
						while (--f >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f_662_, (int) f_664_, (int) f_666_, f_667_, f_669_, f_670_, f_672_, f_673_, f_675_, (float) i_679_, (float) i_681_, f_683_, f_685_, f_686_, f_688_, f_689_, f_691_, f_692_, f_694_);
							f_664_ += f_695_;
							f_666_ += f_715_;
							f_667_ += f_696_;
							f_669_ += f_716_;
							f_670_ += f_697_;
							f_672_ += f_717_;
							f_673_ += f_698_;
							f_675_ += f_718_;
							i_679_ += f_699_;
							i_681_ += f_719_;
							f_683_ += f_700_;
							f_685_ += f_720_;
							f_686_ += f_701_;
							f_688_ += f_721_;
							f_689_ += f_702_;
							f_691_ += f_722_;
							f_692_ += f_703_;
							f_694_ += f_723_;
							f_662_ += (float) anInt2215;
						}
					} else {
						f -= f_663_;
						f_663_ -= f_662_;
						f_662_ = (float) anIntArray2224[(int) f_662_];
						while (--f_663_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f_662_, (int) f_665_, (int) f_664_, f_668_, f_667_, f_671_, f_670_, f_674_, f_673_, (float) i_680_, (float) i_679_, f_684_, f_683_, f_687_, f_686_, f_690_, f_689_, f_693_, f_692_);
							f_665_ += f_705_;
							f_664_ += f_695_;
							f_668_ += f_706_;
							f_667_ += f_696_;
							f_671_ += f_707_;
							f_670_ += f_697_;
							f_674_ += f_708_;
							f_673_ += f_698_;
							i_680_ += f_709_;
							i_679_ += f_699_;
							f_684_ += f_710_;
							f_683_ += f_700_;
							f_687_ += f_711_;
							f_686_ += f_701_;
							f_690_ += f_712_;
							f_689_ += f_702_;
							f_693_ += f_713_;
							f_692_ += f_703_;
							f_662_ += (float) anInt2215;
						}
						while (--f >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f_662_, (int) f_666_, (int) f_664_, f_669_, f_667_, f_672_, f_670_, f_675_, f_673_, (float) i_681_, (float) i_679_, f_685_, f_683_, f_688_, f_686_, f_691_, f_689_, f_694_, f_692_);
							f_666_ += f_715_;
							f_664_ += f_695_;
							f_669_ += f_716_;
							f_667_ += f_696_;
							f_672_ += f_717_;
							f_670_ += f_697_;
							f_675_ += f_718_;
							f_673_ += f_698_;
							i_681_ += f_719_;
							i_679_ += f_699_;
							f_685_ += f_720_;
							f_683_ += f_700_;
							f_688_ += f_721_;
							f_686_ += f_701_;
							f_691_ += f_722_;
							f_689_ += f_702_;
							f_694_ += f_723_;
							f_692_ += f_703_;
							f_662_ += (float) anInt2215;
						}
					}
				} else {
					f_666_ = f_665_;
					f_669_ = f_668_;
					f_672_ = f_671_;
					f_675_ = f_674_;
					i_681_ = i_680_;
					f_685_ = f_684_;
					f_688_ = f_687_;
					f_691_ = f_690_;
					f_694_ = f_693_;
					if (f_662_ < 0.0F) {
						f_666_ -= f_695_ * f_662_;
						f_665_ -= f_705_ * f_662_;
						f_669_ -= f_696_ * f_662_;
						f_668_ -= f_706_ * f_662_;
						f_672_ -= f_697_ * f_662_;
						f_671_ -= f_707_ * f_662_;
						f_675_ -= f_698_ * f_662_;
						f_674_ -= f_708_ * f_662_;
						i_681_ -= f_699_ * f_662_;
						i_680_ -= f_709_ * f_662_;
						f_685_ -= f_700_ * f_662_;
						f_684_ -= f_710_ * f_662_;
						f_688_ -= f_701_ * f_662_;
						f_687_ -= f_711_ * f_662_;
						f_691_ -= f_702_ * f_662_;
						f_690_ -= f_712_ * f_662_;
						f_694_ -= f_703_ * f_662_;
						f_693_ -= f_713_ * f_662_;
						f_662_ = 0.0F;
					}
					if (f < 0.0F) {
						f_664_ -= f_715_ * f;
						f_667_ -= f_716_ * f;
						f_670_ -= f_717_ * f;
						f_673_ -= f_718_ * f;
						i_679_ -= f_719_ * f;
						f_683_ -= f_720_ * f;
						f_686_ -= f_721_ * f;
						f_689_ -= f_722_ * f;
						f_692_ -= f_723_ * f;
						f = 0.0F;
					}
					f_663_ -= f;
					f -= f_662_;
					f_662_ = (float) anIntArray2224[(int) f_662_];
					if (f_695_ < f_705_) {
						while (--f >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f_662_, (int) f_666_, (int) f_665_, f_669_, f_668_, f_672_, f_671_, f_675_, f_674_, (float) i_681_, (float) i_680_, f_685_, f_684_, f_688_, f_687_, f_691_, f_690_, f_694_, f_693_);
							f_666_ += f_695_;
							f_665_ += f_705_;
							f_669_ += f_696_;
							f_668_ += f_706_;
							f_672_ += f_697_;
							f_671_ += f_707_;
							f_675_ += f_698_;
							f_674_ += f_708_;
							i_681_ += f_699_;
							i_680_ += f_709_;
							f_685_ += f_700_;
							f_684_ += f_710_;
							f_688_ += f_701_;
							f_687_ += f_711_;
							f_691_ += f_702_;
							f_690_ += f_712_;
							f_694_ += f_703_;
							f_693_ += f_713_;
							f_662_ += (float) anInt2215;
						}
						while (--f_663_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f_662_, (int) f_664_, (int) f_665_, f_667_, f_668_, f_670_, f_671_, f_673_, f_674_, (float) i_679_, (float) i_680_, f_683_, f_684_, f_686_, f_687_, f_689_, f_690_, f_692_, f_693_);
							f_664_ += f_715_;
							f_665_ += f_705_;
							f_667_ += f_716_;
							f_668_ += f_706_;
							f_670_ += f_717_;
							f_671_ += f_707_;
							f_673_ += f_718_;
							f_674_ += f_708_;
							i_679_ += f_719_;
							i_680_ += f_709_;
							f_683_ += f_720_;
							f_684_ += f_710_;
							f_686_ += f_721_;
							f_687_ += f_711_;
							f_689_ += f_722_;
							f_690_ += f_712_;
							f_692_ += f_723_;
							f_693_ += f_713_;
							f_662_ += (float) anInt2215;
						}
					} else {
						while (--f >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f_662_, (int) f_665_, (int) f_666_, f_668_, f_669_, f_671_, f_672_, f_674_, f_675_, (float) i_680_, (float) i_681_, f_684_, f_685_, f_687_, f_688_, f_690_, f_691_, f_693_, f_694_);
							f_665_ += f_705_;
							f_666_ += f_695_;
							f_668_ += f_706_;
							f_669_ += f_696_;
							f_671_ += f_707_;
							f_672_ += f_697_;
							f_674_ += f_708_;
							f_675_ += f_698_;
							i_680_ += f_709_;
							i_681_ += f_699_;
							f_684_ += f_710_;
							f_685_ += f_700_;
							f_687_ += f_711_;
							f_688_ += f_701_;
							f_690_ += f_712_;
							f_691_ += f_702_;
							f_693_ += f_713_;
							f_694_ += f_703_;
							f_662_ += (float) anInt2215;
						}
						while (--f_663_ >= 0.0F) {
							method1856(anIntArray2218, anIntArray2240, (int) f_662_, (int) f_665_, (int) f_664_, f_668_, f_667_, f_671_, f_670_, f_674_, f_673_, (float) i_680_, (float) i_679_, f_684_, f_683_, f_687_, f_686_, f_690_, f_689_, f_693_, f_692_);
							f_665_ += f_705_;
							f_664_ += f_715_;
							f_668_ += f_706_;
							f_667_ += f_716_;
							f_671_ += f_707_;
							f_670_ += f_717_;
							f_674_ += f_708_;
							f_673_ += f_718_;
							i_680_ += f_709_;
							i_679_ += f_719_;
							f_684_ += f_710_;
							f_683_ += f_720_;
							f_687_ += f_711_;
							f_686_ += f_721_;
							f_690_ += f_712_;
							f_689_ += f_722_;
							f_693_ += f_713_;
							f_692_ += f_723_;
							f_662_ += (float) anInt2215;
						}
					}
				}
			}
		} else if (!(f_663_ >= (float) anInt2225)) {
			if (f > (float) anInt2225) {
				f = (float) anInt2225;
			}
			if (f_662_ > (float) anInt2225) {
				f_662_ = (float) anInt2225;
			}
			if (f < f_662_) {
				f_665_ = f_666_;
				f_668_ = f_669_;
				f_671_ = f_672_;
				f_674_ = f_675_;
				i_680_ = i_681_;
				f_684_ = f_685_;
				f_687_ = f_688_;
				f_690_ = f_691_;
				f_693_ = f_694_;
				if (f_663_ < 0.0F) {
					f_666_ -= f_715_ * f_663_;
					f_665_ -= f_705_ * f_663_;
					f_669_ -= f_716_ * f_663_;
					f_668_ -= f_706_ * f_663_;
					f_672_ -= f_717_ * f_663_;
					f_671_ -= f_707_ * f_663_;
					f_675_ -= f_718_ * f_663_;
					f_674_ -= f_708_ * f_663_;
					i_681_ -= f_719_ * 3.0F;
					i_680_ -= f_709_ * f_663_;
					f_685_ -= f_720_ * f_663_;
					f_684_ -= f_710_ * f_663_;
					f_688_ -= f_721_ * f_663_;
					f_687_ -= f_711_ * f_663_;
					f_691_ -= f_722_ * f_663_;
					f_690_ -= f_712_ * f_663_;
					f_694_ -= f_723_ * f_663_;
					f_693_ -= f_713_ * f_663_;
					f_663_ = 0.0F;
				}
				if (f < 0.0F) {
					f_664_ -= f_695_ * f;
					f_667_ -= f_696_ * f;
					f_670_ -= f_697_ * f;
					f_673_ -= f_698_ * f;
					i_679_ -= f_699_ * f;
					f_683_ -= f_700_ * f;
					f_686_ -= f_701_ * f;
					f_689_ -= f_702_ * f;
					f_692_ -= f_703_ * f;
					f = 0.0F;
				}
				if (f_705_ < f_715_) {
					f_662_ -= f;
					f -= f_663_;
					f_663_ = (float) anIntArray2224[(int) f_663_];
					while (--f >= 0.0F) {
						method1856(anIntArray2218, anIntArray2240, (int) f_663_, (int) f_665_, (int) f_666_, f_668_, f_669_, f_671_, f_672_, f_674_, f_675_, (float) i_680_, (float) i_681_, f_684_, f_685_, f_687_, f_688_, f_690_, f_691_, f_693_, f_694_);
						f_665_ += f_705_;
						f_666_ += f_715_;
						f_668_ += f_706_;
						f_669_ += f_716_;
						f_671_ += f_707_;
						f_672_ += f_717_;
						f_674_ += f_708_;
						f_675_ += f_718_;
						i_680_ += f_709_;
						i_681_ += f_719_;
						f_684_ += f_710_;
						f_685_ += f_720_;
						f_687_ += f_711_;
						f_688_ += f_721_;
						f_690_ += f_712_;
						f_691_ += f_722_;
						f_693_ += f_713_;
						f_694_ += f_723_;
						f_663_ += (float) anInt2215;
					}
					while (--f_662_ >= 0.0F) {
						method1856(anIntArray2218, anIntArray2240, (int) f_663_, (int) f_665_, (int) f_664_, f_668_, f_667_, f_671_, f_670_, f_674_, f_673_, (float) i_680_, (float) i_679_, f_684_, f_683_, f_687_, f_686_, f_690_, f_689_, f_693_, f_692_);
						f_665_ += f_705_;
						f_664_ += f_695_;
						f_668_ += f_706_;
						f_667_ += f_696_;
						f_671_ += f_707_;
						f_670_ += f_697_;
						f_674_ += f_708_;
						f_673_ += f_698_;
						i_680_ += f_709_;
						i_679_ += f_699_;
						f_684_ += f_710_;
						f_683_ += f_700_;
						f_687_ += f_711_;
						f_686_ += f_701_;
						f_690_ += f_712_;
						f_689_ += f_702_;
						f_693_ += f_713_;
						f_692_ += f_703_;
						f_663_ += (float) anInt2215;
					}
				} else {
					f_662_ -= f;
					f -= f_663_;
					f_663_ = (float) anIntArray2224[(int) f_663_];
					while (--f >= 0.0F) {
						method1856(anIntArray2218, anIntArray2240, (int) f_663_, (int) f_666_, (int) f_665_, f_669_, f_668_, f_672_, f_671_, f_675_, f_674_, (float) i_681_, (float) i_680_, f_685_, f_684_, f_688_, f_687_, f_691_, f_690_, f_694_, f_693_);
						f_666_ += f_715_;
						f_665_ += f_705_;
						f_669_ += f_716_;
						f_668_ += f_706_;
						f_672_ += f_717_;
						f_671_ += f_707_;
						f_675_ += f_718_;
						f_674_ += f_708_;
						i_681_ += f_719_;
						i_680_ += f_709_;
						f_685_ += f_720_;
						f_684_ += f_710_;
						f_688_ += f_721_;
						f_687_ += f_711_;
						f_691_ += f_722_;
						f_690_ += f_712_;
						f_694_ += f_723_;
						f_693_ += f_713_;
						f_663_ += (float) anInt2215;
					}
					while (--f_662_ >= 0.0F) {
						method1856(anIntArray2218, anIntArray2240, (int) f_663_, (int) f_664_, (int) f_665_, f_667_, f_668_, f_670_, f_671_, f_673_, f_674_, (float) i_679_, (float) i_680_, f_683_, f_684_, f_686_, f_687_, f_689_, f_690_, f_692_, f_693_);
						f_664_ += f_695_;
						f_665_ += f_705_;
						f_667_ += f_696_;
						f_668_ += f_706_;
						f_670_ += f_697_;
						f_671_ += f_707_;
						f_673_ += f_698_;
						f_674_ += f_708_;
						i_679_ += f_699_;
						i_680_ += f_709_;
						f_683_ += f_700_;
						f_684_ += f_710_;
						f_686_ += f_701_;
						f_687_ += f_711_;
						f_689_ += f_702_;
						f_690_ += f_712_;
						f_692_ += f_703_;
						f_693_ += f_713_;
						f_663_ += (float) anInt2215;
					}
				}
			} else {
				f_664_ = f_666_;
				f_667_ = f_669_;
				f_670_ = f_672_;
				f_673_ = f_675_;
				i_679_ = i_681_;
				f_683_ = f_685_;
				f_686_ = f_688_;
				f_689_ = f_691_;
				f_692_ = f_694_;
				if (f_663_ < 0.0F) {
					f_666_ -= f_715_ * f_663_;
					f_664_ -= f_705_ * f_663_;
					f_669_ -= f_716_ * f_663_;
					f_667_ -= f_706_ * f_663_;
					f_672_ -= f_717_ * f_663_;
					f_670_ -= f_707_ * f_663_;
					f_675_ -= f_718_ * f_663_;
					f_673_ -= f_708_ * f_663_;
					i_681_ -= f_719_ * 3.0F;
					i_679_ -= f_709_ * f_663_;
					f_685_ -= f_720_ * f_663_;
					f_683_ -= f_710_ * f_663_;
					f_688_ -= f_721_ * f_663_;
					f_686_ -= f_711_ * f_663_;
					f_691_ -= f_722_ * f_663_;
					f_689_ -= f_712_ * f_663_;
					f_694_ -= f_723_ * f_663_;
					f_692_ -= f_713_ * f_663_;
					f_663_ = 0.0F;
				}
				if (f_662_ < 0.0F) {
					f_665_ -= f_695_ * f_662_;
					f_668_ -= f_696_ * f_662_;
					f_671_ -= f_697_ * f_662_;
					f_674_ -= f_698_ * f_662_;
					i_680_ -= f_699_ * f_662_;
					f_684_ -= f_700_ * f_662_;
					f_687_ -= f_701_ * f_662_;
					f_690_ -= f_702_ * f_662_;
					f_693_ -= f_703_ * f_662_;
					f_662_ = 0.0F;
				}
				if (f_705_ < f_715_) {
					f -= f_662_;
					f_662_ -= f_663_;
					f_663_ = (float) anIntArray2224[(int) f_663_];
					while (--f_662_ >= 0.0F) {
						method1856(anIntArray2218, anIntArray2240, (int) f_663_, (int) f_664_, (int) f_666_, f_667_, f_669_, f_670_, f_672_, f_673_, f_675_, (float) i_679_, (float) i_681_, f_683_, f_685_, f_686_, f_688_, f_689_, f_691_, f_692_, f_694_);
						f_664_ += f_705_;
						f_666_ += f_715_;
						f_667_ += f_706_;
						f_669_ += f_716_;
						f_670_ += f_707_;
						f_672_ += f_717_;
						f_673_ += f_708_;
						f_675_ += f_718_;
						i_679_ += f_709_;
						i_681_ += f_719_;
						f_683_ += f_710_;
						f_685_ += f_720_;
						f_686_ += f_711_;
						f_688_ += f_721_;
						f_689_ += f_712_;
						f_691_ += f_722_;
						f_692_ += f_713_;
						f_694_ += f_723_;
						f_663_ += (float) anInt2215;
					}
					while (--f >= 0.0F) {
						method1856(anIntArray2218, anIntArray2240, (int) f_663_, (int) f_665_, (int) f_666_, f_668_, f_669_, f_671_, f_672_, f_674_, f_675_, (float) i_680_, (float) i_681_, f_684_, f_685_, f_687_, f_688_, f_690_, f_691_, f_693_, f_694_);
						f_665_ += f_695_;
						f_666_ += f_715_;
						f_668_ += f_696_;
						f_669_ += f_716_;
						f_671_ += f_697_;
						f_672_ += f_717_;
						f_674_ += f_698_;
						f_675_ += f_718_;
						i_680_ += f_699_;
						i_681_ += f_719_;
						f_684_ += f_700_;
						f_685_ += f_720_;
						f_687_ += f_701_;
						f_688_ += f_721_;
						f_690_ += f_702_;
						f_691_ += f_722_;
						f_693_ += f_703_;
						f_694_ += f_723_;
						f_663_ += (float) anInt2215;
					}
				} else {
					f -= f_662_;
					f_662_ -= f_663_;
					f_663_ = (float) anIntArray2224[(int) f_663_];
					while (--f_662_ >= 0.0F) {
						method1856(anIntArray2218, anIntArray2240, (int) f_663_, (int) f_666_, (int) f_664_, f_669_, f_667_, f_672_, f_670_, f_675_, f_673_, (float) i_681_, (float) i_679_, f_685_, f_683_, f_688_, f_686_, f_691_, f_689_, f_694_, f_692_);
						f_666_ += f_715_;
						f_664_ += f_705_;
						f_669_ += f_716_;
						f_667_ += f_706_;
						f_672_ += f_717_;
						f_670_ += f_707_;
						f_675_ += f_718_;
						f_673_ += f_708_;
						i_681_ += f_719_;
						i_679_ += f_709_;
						f_685_ += f_720_;
						f_683_ += f_710_;
						f_688_ += f_721_;
						f_686_ += f_711_;
						f_691_ += f_722_;
						f_689_ += f_712_;
						f_694_ += f_723_;
						f_692_ += f_713_;
						f_663_ += (float) anInt2215;
					}
					while (--f >= 0.0F) {
						method1856(anIntArray2218, anIntArray2240, (int) f_663_, (int) f_666_, (int) f_665_, f_669_, f_668_, f_672_, f_671_, f_675_, f_674_, (float) i_681_, (float) i_680_, f_685_, f_684_, f_688_, f_687_, f_691_, f_690_, f_694_, f_693_);
						f_666_ += f_715_;
						f_665_ += f_695_;
						f_669_ += f_716_;
						f_668_ += f_696_;
						f_672_ += f_717_;
						f_671_ += f_697_;
						f_675_ += f_718_;
						f_674_ += f_698_;
						i_681_ += f_719_;
						i_680_ += f_699_;
						f_685_ += f_720_;
						f_684_ += f_700_;
						f_688_ += f_721_;
						f_687_ += f_701_;
						f_691_ += f_722_;
						f_690_ += f_702_;
						f_694_ += f_723_;
						f_693_ += f_703_;
						f_663_ += (float) anInt2215;
					}
				}
			}
		}
	}
	
	final void method1864(float f, float f_725_, float f_726_, float f_727_, float f_728_, float f_729_, float f_730_, float f_731_, float f_732_, float f_733_, float f_734_, float f_735_, float f_736_, float f_737_, float f_738_, int i, int i_739_, int i_740_, int i_741_, int i_742_, int i_743_, int i_744_, int i_745_, float f_746_, int i_747_, float f_748_, int i_749_, float f_750_) {
		if (i_745_ != anInt2234) {
			anIntArray2240 = aPureJavaToolkit2221.method1499(i_745_);
			if (anIntArray2240 == null) {
				method1850((float) (int) f, (float) (int) f_725_, (float) (int) f_726_, (float) (int) f_727_, (float) (int) f_728_, (float) (int) f_729_, (float) (int) f_730_, (float) (int) f_731_, (float) (int) f_732_, Class249.method3086(i_741_ | i_742_ << 24, i, (byte) -56), Class249.method3086(i_741_ | i_743_ << 24, i_739_, (byte) -56), Class249.method3086(i_741_ | i_744_ << 24, i_740_, (byte) -56));
				return;
			}
			anInt2232 = aPureJavaToolkit2221.method1505(i_745_) ? 64 : aPureJavaToolkit2221.anInt6775;
			anInt2243 = anInt2232 - 1;
			anInt2229 = aPureJavaToolkit2221.method1502(i_745_);
		}
		aFloat2241 = f_746_;
		if (i_747_ != anInt2245) {
			anIntArray2231 = aPureJavaToolkit2221.method1499(i_747_);
			if (anIntArray2231 == null) {
				method1850((float) (int) f, (float) (int) f_725_, (float) (int) f_726_, (float) (int) f_727_, (float) (int) f_728_, (float) (int) f_729_, (float) (int) f_730_, (float) (int) f_731_, (float) (int) f_732_, Class249.method3086(i_741_ | i_742_ << 24, i, (byte) -56), Class249.method3086(i_741_ | i_743_ << 24, i_739_, (byte) -56), Class249.method3086(i_741_ | i_744_ << 24, i_740_, (byte) -56));
				return;
			}
			anInt2237 = aPureJavaToolkit2221.method1505(i_747_) ? 64 : aPureJavaToolkit2221.anInt6775;
			anInt2235 = anInt2237 - 1;
		}
		aFloat2238 = f_748_;
		if (i_749_ != anInt2244) {
			anIntArray2236 = aPureJavaToolkit2221.method1499(i_749_);
			if (anIntArray2236 == null) {
				method1850((float) (int) f, (float) (int) f_725_, (float) (int) f_726_, (float) (int) f_727_, (float) (int) f_728_, (float) (int) f_729_, (float) (int) f_730_, (float) (int) f_731_, (float) (int) f_732_, Class249.method3086(i_741_ | i_742_ << 24, i, (byte) -56), Class249.method3086(i_741_ | i_743_ << 24, i_739_, (byte) -56), Class249.method3086(i_741_ | i_744_ << 24, i_740_, (byte) -56));
				return;
			}
			anInt2228 = aPureJavaToolkit2221.method1505(i_749_) ? 64 : aPureJavaToolkit2221.anInt6775;
			anInt2233 = anInt2228 - 1;
		}
		aFloat2242 = f_750_;
		anInt2230 = i_741_;
		float f_751_ = (float) (i >> 24 & 0xff);
		float f_752_ = (float) (i_739_ >> 24 & 0xff);
		float f_753_ = (float) (i_740_ >> 24 & 0xff);
		float f_754_ = (float) (i >> 16 & 0xff);
		float f_755_ = (float) (i_739_ >> 16 & 0xff);
		float f_756_ = (float) (i_740_ >> 16 & 0xff);
		float f_757_ = (float) (i >> 8 & 0xff);
		float f_758_ = (float) (i_739_ >> 8 & 0xff);
		float f_759_ = (float) (i_740_ >> 8 & 0xff);
		float f_760_ = (float) (i & 0xff);
		float f_761_ = (float) (i_739_ & 0xff);
		float f_762_ = (float) (i_740_ & 0xff);
		f_733_ /= f_730_;
		f_734_ /= f_731_;
		f_735_ /= f_732_;
		f_736_ /= f_730_;
		f_737_ /= f_731_;
		f_738_ /= f_732_;
		f_730_ = 1.0F / f_730_;
		f_731_ = 1.0F / f_731_;
		f_732_ = 1.0F / f_732_;
		float f_763_ = 1.0F;
		float f_764_ = 0.0F;
		float f_765_ = 0.0F;
		float f_766_ = 0.0F;
		float f_767_ = 1.0F;
		float f_768_ = 0.0F;
		float f_769_ = 0.0F;
		float f_770_ = 0.0F;
		float f_771_ = 0.0F;
		float f_772_ = 0.0F;
		float f_773_ = 0.0F;
		float f_774_ = 0.0F;
		float f_775_ = 0.0F;
		float f_776_ = 0.0F;
		float f_777_ = 0.0F;
		float f_778_ = 0.0F;
		float f_779_ = 0.0F;
		if (f_725_ != f) {
			float f_780_ = f_725_ - f;
			f_769_ = (f_728_ - f_727_) / f_780_;
			f_770_ = (f_731_ - f_730_) / f_780_;
			f_771_ = (f_734_ - f_733_) / f_780_;
			f_772_ = (f_737_ - f_736_) / f_780_;
			f_773_ = (float) (i_743_ - i_742_) / f_780_;
			f_774_ = (f_752_ - f_751_) / f_780_;
			f_775_ = (f_755_ - f_754_) / f_780_;
			f_776_ = (f_758_ - f_757_) / f_780_;
			f_777_ = (f_761_ - f_760_) / f_780_;
			f_778_ = (f_764_ - f_763_) / f_780_;
			f_779_ = (f_767_ - f_766_) / f_780_;
		}
		float f_781_ = 0.0F;
		float f_782_ = 0.0F;
		float f_783_ = 0.0F;
		float f_784_ = 0.0F;
		float f_785_ = 0.0F;
		float f_786_ = 0.0F;
		float f_787_ = 0.0F;
		float f_788_ = 0.0F;
		float f_789_ = 0.0F;
		float f_790_ = 0.0F;
		float f_791_ = 0.0F;
		if (f_726_ != f_725_) {
			float f_792_ = f_726_ - f_725_;
			f_781_ = (f_729_ - f_728_) / f_792_;
			f_782_ = (f_732_ - f_731_) / f_792_;
			f_783_ = (f_735_ - f_734_) / f_792_;
			f_784_ = (f_738_ - f_737_) / f_792_;
			f_785_ = (float) (i_744_ - i_743_) / f_792_;
			f_786_ = (f_753_ - f_752_) / f_792_;
			f_787_ = (f_756_ - f_755_) / f_792_;
			f_788_ = (f_759_ - f_758_) / f_792_;
			f_789_ = (f_762_ - f_761_) / f_792_;
			f_790_ = (f_765_ - f_764_) / f_792_;
			f_791_ = (f_768_ - f_767_) / f_792_;
		}
		float f_793_ = 0.0F;
		float f_794_ = 0.0F;
		float f_795_ = 0.0F;
		float f_796_ = 0.0F;
		float f_797_ = 0.0F;
		float f_798_ = 0.0F;
		float f_799_ = 0.0F;
		float f_800_ = 0.0F;
		float f_801_ = 0.0F;
		float f_802_ = 0.0F;
		float f_803_ = 0.0F;
		if (f != f_726_) {
			float f_804_ = f - f_726_;
			f_793_ = (f_727_ - f_729_) / f_804_;
			f_794_ = (f_730_ - f_732_) / f_804_;
			f_795_ = (f_733_ - f_735_) / f_804_;
			f_796_ = (f_736_ - f_738_) / f_804_;
			f_797_ = (float) (i_742_ - i_744_) / f_804_;
			f_798_ = (f_751_ - f_753_) / f_804_;
			f_799_ = (f_754_ - f_756_) / f_804_;
			f_800_ = (f_757_ - f_759_) / f_804_;
			f_801_ = (f_760_ - f_762_) / f_804_;
			f_802_ = (f_763_ - f_765_) / f_804_;
			f_803_ = (f_766_ - f_768_) / f_804_;
		}
		if (f <= f_725_ && f <= f_726_) {
			if (!(f >= (float) anInt2225)) {
				if (f_725_ > (float) anInt2225) {
					f_725_ = (float) anInt2225;
				}
				if (f_726_ > (float) anInt2225) {
					f_726_ = (float) anInt2225;
				}
				if (f_725_ < f_726_) {
					f_729_ = f_727_;
					f_732_ = f_730_;
					f_735_ = f_733_;
					f_738_ = f_736_;
					i_744_ = i_742_;
					f_753_ = f_751_;
					f_756_ = f_754_;
					f_759_ = f_757_;
					f_762_ = f_760_;
					f_765_ = f_763_;
					f_768_ = f_766_;
					if (f < 0.0F) {
						f_727_ -= f_769_ * f;
						f_729_ -= f_793_ * f;
						f_730_ -= f_770_ * f;
						f_732_ -= f_794_ * f;
						f_733_ -= f_771_ * f;
						f_735_ -= f_795_ * f;
						f_736_ -= f_772_ * f;
						f_738_ -= f_796_ * f;
						i_742_ -= f_773_ * f;
						i_744_ -= f_797_ * f;
						f_751_ -= f_774_ * f;
						f_753_ -= f_798_ * f;
						f_754_ -= f_775_ * f;
						f_756_ -= f_799_ * f;
						f_757_ -= f_776_ * f;
						f_759_ -= f_800_ * f;
						f_760_ -= f_777_ * f;
						f_762_ -= f_801_ * f;
						f_763_ -= f_778_ * f;
						f_765_ -= f_802_ * f;
						f_766_ -= f_779_ * f;
						f_768_ -= f_803_ * f;
						f = 0.0F;
					}
					if (f_725_ < 0.0F) {
						f_728_ -= f_781_ * f_725_;
						f_731_ -= f_782_ * f_725_;
						f_734_ -= f_783_ * f_725_;
						f_737_ -= f_784_ * f_725_;
						i_743_ -= f_785_ * f_725_;
						f_752_ -= f_786_ * f_725_;
						f_755_ -= f_787_ * f_725_;
						f_758_ -= f_788_ * f_725_;
						f_761_ -= f_789_ * f_725_;
						f_764_ -= f_790_ * f_725_;
						f_767_ -= f_791_ * f_725_;
						f_725_ = 0.0F;
					}
					if (f != f_725_ && f_793_ < f_769_ || f == f_725_ && f_793_ > f_781_) {
						f_726_ -= f_725_;
						f_725_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_725_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f, (int) f_729_, (int) f_727_, f_732_, f_730_, f_735_, f_733_, f_738_, f_736_, (float) i_744_, (float) i_742_, f_753_, f_751_, f_756_, f_754_, f_759_, f_757_, f_762_, f_760_, f_765_, f_763_, f_768_, f_766_);
							f_727_ += f_769_;
							f_729_ += f_793_;
							f_730_ += f_770_;
							f_732_ += f_794_;
							f_733_ += f_771_;
							f_735_ += f_795_;
							f_736_ += f_772_;
							f_738_ += f_796_;
							i_742_ += f_773_;
							i_744_ += f_797_;
							f_751_ += f_774_;
							f_753_ += f_798_;
							f_754_ += f_775_;
							f_756_ += f_799_;
							f_757_ += f_776_;
							f_759_ += f_800_;
							f_760_ += f_777_;
							f_762_ += f_801_;
							f_763_ += f_778_;
							f_765_ += f_802_;
							f_766_ += f_779_;
							f_768_ += f_779_;
							f += (float) anInt2215;
						}
						while (--f_726_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f, (int) f_729_, (int) f_728_, f_732_, f_731_, f_735_, f_734_, f_738_, f_737_, (float) i_744_, (float) i_743_, f_753_, f_752_, f_756_, f_755_, f_759_, f_758_, f_762_, f_761_, f_765_, f_764_, f_768_, f_767_);
							f_728_ += f_781_;
							f_729_ += f_793_;
							f_731_ += f_782_;
							f_732_ += f_794_;
							f_734_ += f_783_;
							f_735_ += f_795_;
							f_737_ += f_784_;
							f_738_ += f_796_;
							i_743_ += f_785_;
							i_744_ += f_797_;
							f_752_ += f_786_;
							f_753_ += f_798_;
							f_755_ += f_787_;
							f_756_ += f_799_;
							f_758_ += f_788_;
							f_759_ += f_800_;
							f_761_ += f_789_;
							f_762_ += f_801_;
							f_764_ += f_790_;
							f_765_ += f_802_;
							f_767_ += f_791_;
							f_768_ += f_803_;
							f += (float) anInt2215;
						}
					} else {
						f_726_ -= f_725_;
						f_725_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_725_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f, (int) f_727_, (int) f_729_, f_730_, f_732_, f_733_, f_735_, f_736_, f_738_, (float) i_742_, (float) i_744_, f_751_, f_753_, f_754_, f_756_, f_757_, f_759_, f_760_, f_762_, f_763_, f_765_, f_766_, f_768_);
							f_727_ += f_769_;
							f_729_ += f_793_;
							f_730_ += f_770_;
							f_732_ += f_794_;
							f_733_ += f_771_;
							f_735_ += f_795_;
							f_736_ += f_772_;
							f_738_ += f_796_;
							i_742_ += f_773_;
							i_744_ += f_797_;
							f_751_ += f_774_;
							f_753_ += f_798_;
							f_754_ += f_775_;
							f_756_ += f_799_;
							f_757_ += f_776_;
							f_759_ += f_800_;
							f_760_ += f_777_;
							f_762_ += f_801_;
							f_763_ += f_778_;
							f_765_ += f_802_;
							f_766_ += f_779_;
							f_768_ += f_803_;
							f += (float) anInt2215;
						}
						while (--f_726_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f, (int) f_728_, (int) f_729_, f_731_, f_732_, f_734_, f_735_, f_737_, f_738_, (float) i_743_, (float) i_744_, f_752_, f_753_, f_755_, f_756_, f_758_, f_759_, f_761_, f_762_, f_764_, f_765_, f_767_, f_768_);
							f_728_ += f_781_;
							f_729_ += f_793_;
							f_731_ += f_782_;
							f_732_ += f_794_;
							f_734_ += f_783_;
							f_735_ += f_795_;
							f_737_ += f_784_;
							f_738_ += f_796_;
							i_743_ += f_785_;
							i_744_ += f_797_;
							f_752_ += f_786_;
							f_753_ += f_798_;
							f_755_ += f_787_;
							f_756_ += f_799_;
							f_758_ += f_788_;
							f_759_ += f_800_;
							f_761_ += f_789_;
							f_762_ += f_801_;
							f_764_ += f_790_;
							f_765_ += f_802_;
							f_767_ += f_791_;
							f_768_ += f_803_;
							f += (float) anInt2215;
						}
					}
				} else {
					f_728_ = f_727_;
					f_731_ = f_730_;
					f_734_ = f_733_;
					f_737_ = f_736_;
					i_743_ = i_742_;
					f_752_ = f_751_;
					f_755_ = f_754_;
					f_758_ = f_757_;
					f_761_ = f_760_;
					f_764_ = f_763_;
					f_767_ = f_766_;
					if (f < 0.0F) {
						f_727_ -= f_769_ * f;
						f_728_ -= f_793_ * f;
						f_730_ -= f_770_ * f;
						f_731_ -= f_794_ * f;
						f_733_ -= f_771_ * f;
						f_734_ -= f_795_ * f;
						f_736_ -= f_772_ * f;
						f_737_ -= f_796_ * f;
						i_742_ -= f_773_ * f;
						i_743_ -= f_797_ * f;
						f_751_ -= f_774_ * f;
						f_752_ -= f_798_ * f;
						f_754_ -= f_775_ * f;
						f_755_ -= f_799_ * f;
						f_757_ -= f_776_ * f;
						f_758_ -= f_800_ * f;
						f_760_ -= f_777_ * f;
						f_761_ -= f_801_ * f;
						f_763_ -= f_778_ * f;
						f_764_ -= f_802_ * f;
						f_766_ -= f_779_ * f;
						f_767_ -= f_803_ * f;
						f = 0.0F;
					}
					if (f_726_ < 0.0F) {
						f_729_ -= f_781_ * f_726_;
						f_732_ -= f_782_ * f_726_;
						f_735_ -= f_783_ * f_726_;
						f_738_ -= f_784_ * f_726_;
						i_744_ -= f_785_ * f_726_;
						f_753_ -= f_786_ * f_726_;
						f_756_ -= f_787_ * f_726_;
						f_759_ -= f_788_ * f_726_;
						f_762_ -= f_789_ * f_726_;
						f_765_ -= f_790_ * f_726_;
						f_768_ -= f_791_ * f_726_;
						f_726_ = 0.0F;
					}
					if (f != f_726_ && f_793_ < f_769_ || f == f_726_ && f_781_ > f_769_) {
						f_725_ -= f_726_;
						f_726_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_726_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f, (int) f_728_, (int) f_727_, f_731_, f_730_, f_734_, f_733_, f_737_, f_736_, (float) i_743_, (float) i_742_, f_752_, f_751_, f_755_, f_754_, f_758_, f_757_, f_761_, f_760_, f_764_, f_763_, f_767_, f_766_);
							f_727_ += f_769_;
							f_728_ += f_793_;
							f_730_ += f_770_;
							f_731_ += f_794_;
							f_733_ += f_771_;
							f_734_ += f_795_;
							f_736_ += f_772_;
							f_737_ += f_796_;
							i_742_ += f_773_;
							i_743_ += f_797_;
							f_751_ += f_774_;
							f_752_ += f_798_;
							f_754_ += f_775_;
							f_755_ += f_799_;
							f_757_ += f_776_;
							f_758_ += f_800_;
							f_760_ += f_777_;
							f_761_ += f_801_;
							f_763_ += f_778_;
							f_764_ += f_802_;
							f_766_ += f_779_;
							f_767_ += f_803_;
							f += (float) anInt2215;
						}
						while (--f_725_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f, (int) f_729_, (int) f_727_, f_732_, f_730_, f_735_, f_733_, f_738_, f_736_, (float) i_744_, (float) i_742_, f_753_, f_751_, f_756_, f_754_, f_759_, f_757_, f_762_, f_760_, f_765_, f_763_, f_768_, f_766_);
							f_729_ += f_781_;
							f_727_ += f_769_;
							f_732_ += f_782_;
							f_730_ += f_770_;
							f_735_ += f_783_;
							f_733_ += f_771_;
							f_738_ += f_784_;
							f_736_ += f_772_;
							i_744_ += f_785_;
							i_742_ += f_773_;
							f_753_ += f_786_;
							f_751_ += f_774_;
							f_756_ += f_787_;
							f_754_ += f_775_;
							f_759_ += f_788_;
							f_757_ += f_776_;
							f_762_ += f_789_;
							f_760_ += f_777_;
							f_765_ += f_790_;
							f_763_ += f_778_;
							f_768_ += f_791_;
							f_766_ += f_779_;
							f += (float) anInt2215;
						}
					} else {
						f_725_ -= f_726_;
						f_726_ -= f;
						f = (float) anIntArray2224[(int) f];
						while (--f_726_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f, (int) f_727_, (int) f_728_, f_730_, f_731_, f_733_, f_734_, f_736_, f_737_, (float) i_742_, (float) i_743_, f_751_, f_752_, f_754_, f_755_, f_757_, f_758_, f_760_, f_761_, f_763_, f_764_, f_766_, f_767_);
							f_728_ += f_793_;
							f_727_ += f_769_;
							f_731_ += f_794_;
							f_730_ += f_770_;
							f_734_ += f_795_;
							f_733_ += f_771_;
							f_737_ += f_796_;
							f_736_ += f_772_;
							i_743_ += f_797_;
							i_742_ += f_773_;
							f_752_ += f_798_;
							f_751_ += f_774_;
							f_755_ += f_799_;
							f_754_ += f_775_;
							f_758_ += f_800_;
							f_757_ += f_776_;
							f_761_ += f_801_;
							f_760_ += f_777_;
							f_764_ += f_802_;
							f_763_ += f_778_;
							f_767_ += f_803_;
							f_766_ += f_779_;
							f += (float) anInt2215;
						}
						while (--f_725_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f, (int) f_727_, (int) f_729_, f_730_, f_732_, f_733_, f_735_, f_736_, f_738_, (float) i_742_, (float) i_744_, f_751_, f_753_, f_754_, f_756_, f_757_, f_759_, f_760_, f_762_, f_763_, f_765_, f_766_, f_768_);
							f_727_ += f_769_;
							f_729_ += f_781_;
							f_730_ += f_770_;
							f_732_ += f_782_;
							f_733_ += f_771_;
							f_735_ += f_783_;
							f_736_ += f_772_;
							f_738_ += f_784_;
							i_742_ += f_773_;
							i_744_ += f_785_;
							f_751_ += f_774_;
							f_753_ += f_786_;
							f_754_ += f_775_;
							f_756_ += f_787_;
							f_757_ += f_776_;
							f_759_ += f_788_;
							f_760_ += f_777_;
							f_762_ += f_789_;
							f_763_ += f_778_;
							f_765_ += f_790_;
							f_766_ += f_779_;
							f_768_ += f_791_;
							f += (float) anInt2215;
						}
					}
				}
			}
		} else if (f_725_ <= f_726_) {
			if (!(f_725_ >= (float) anInt2225)) {
				if (f_726_ > (float) anInt2225) {
					f_726_ = (float) anInt2225;
				}
				if (f > (float) anInt2225) {
					f = (float) anInt2225;
				}
				if (f_726_ < f) {
					f_727_ = f_728_;
					f_730_ = f_731_;
					f_733_ = f_734_;
					f_736_ = f_737_;
					i_742_ = i_743_;
					f_751_ = f_752_;
					f_754_ = f_755_;
					f_757_ = f_758_;
					f_760_ = f_761_;
					f_763_ = f_764_;
					f_766_ = f_767_;
					if (f_725_ < 0.0F) {
						f_727_ -= f_769_ * f_725_;
						f_728_ -= f_781_ * f_725_;
						f_730_ -= f_770_ * f_725_;
						f_731_ -= f_782_ * f_725_;
						f_733_ -= f_771_ * f_725_;
						f_734_ -= f_783_ * f_725_;
						f_736_ -= f_772_ * f_725_;
						f_737_ -= f_784_ * f_725_;
						i_742_ -= f_773_ * f_725_;
						i_743_ -= f_785_ * f_725_;
						f_751_ -= f_774_ * f_725_;
						f_752_ -= f_786_ * f_725_;
						f_754_ -= f_775_ * f_725_;
						f_755_ -= f_787_ * f_725_;
						f_757_ -= f_776_ * f_725_;
						f_758_ -= f_788_ * f_725_;
						f_760_ -= f_777_ * f_725_;
						f_761_ -= f_789_ * f_725_;
						f_763_ -= f_778_ * f_725_;
						f_764_ -= f_790_ * f_725_;
						f_766_ -= f_779_ * f_725_;
						f_767_ -= f_791_ * f_725_;
						f_725_ = 0.0F;
					}
					if (f_726_ < 0.0F) {
						f_729_ -= f_793_ * f_726_;
						f_732_ -= f_794_ * f_726_;
						f_735_ -= f_795_ * f_726_;
						f_738_ -= f_796_ * f_726_;
						i_744_ -= f_797_ * f_726_;
						f_753_ -= f_798_ * f_726_;
						f_756_ -= f_799_ * f_726_;
						f_759_ -= f_800_ * f_726_;
						f_762_ -= f_801_ * f_726_;
						f_765_ -= f_802_ * f_726_;
						f_768_ -= f_803_ * f_726_;
						f_726_ = 0.0F;
					}
					if (f_725_ != f_726_ && f_769_ < f_781_ || f_725_ == f_726_ && f_769_ > f_793_) {
						f -= f_726_;
						f_726_ -= f_725_;
						f_725_ = (float) anIntArray2224[(int) f_725_];
						while (--f_726_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f_725_, (int) f_727_, (int) f_728_, f_730_, f_731_, f_733_, f_734_, f_736_, f_737_, (float) i_742_, (float) i_743_, f_751_, f_752_, f_754_, f_755_, f_757_, f_758_, f_760_, f_761_, f_763_, f_764_, f_766_, f_767_);
							f_727_ += f_769_;
							f_728_ += f_781_;
							f_730_ += f_770_;
							f_731_ += f_782_;
							f_733_ += f_771_;
							f_734_ += f_783_;
							f_736_ += f_772_;
							f_737_ += f_784_;
							i_742_ += f_773_;
							i_743_ += f_785_;
							f_751_ += f_774_;
							f_752_ += f_786_;
							f_754_ += f_775_;
							f_755_ += f_787_;
							f_757_ += f_776_;
							f_758_ += f_788_;
							f_760_ += f_777_;
							f_761_ += f_789_;
							f_763_ += f_778_;
							f_764_ += f_790_;
							f_766_ += f_779_;
							f_767_ += f_791_;
							f_725_ += (float) anInt2215;
						}
						while (--f >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f_725_, (int) f_727_, (int) f_729_, f_730_, f_732_, f_733_, f_735_, f_736_, f_738_, (float) i_742_, (float) i_744_, f_751_, f_753_, f_754_, f_756_, f_757_, f_759_, f_760_, f_762_, f_763_, f_765_, f_766_, f_768_);
							f_727_ += f_769_;
							f_729_ += f_793_;
							f_730_ += f_770_;
							f_732_ += f_794_;
							f_733_ += f_771_;
							f_735_ += f_795_;
							f_736_ += f_772_;
							f_738_ += f_796_;
							i_742_ += f_773_;
							i_744_ += f_797_;
							f_751_ += f_774_;
							f_753_ += f_798_;
							f_754_ += f_775_;
							f_756_ += f_799_;
							f_757_ += f_776_;
							f_759_ += f_800_;
							f_760_ += f_777_;
							f_762_ += f_801_;
							f_763_ += f_778_;
							f_765_ += f_802_;
							f_766_ += f_779_;
							f_768_ += f_803_;
							f_725_ += (float) anInt2215;
						}
					} else {
						f -= f_726_;
						f_726_ -= f_725_;
						f_725_ = (float) anIntArray2224[(int) f_725_];
						while (--f_726_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f_725_, (int) f_728_, (int) f_727_, f_731_, f_730_, f_734_, f_733_, f_737_, f_736_, (float) i_743_, (float) i_742_, f_752_, f_751_, f_755_, f_754_, f_758_, f_757_, f_761_, f_760_, f_764_, f_763_, f_767_, f_766_);
							f_728_ += f_781_;
							f_727_ += f_769_;
							f_731_ += f_782_;
							f_730_ += f_770_;
							f_734_ += f_783_;
							f_733_ += f_771_;
							f_737_ += f_784_;
							f_736_ += f_772_;
							i_743_ += f_785_;
							i_742_ += f_773_;
							f_752_ += f_786_;
							f_751_ += f_774_;
							f_755_ += f_787_;
							f_754_ += f_775_;
							f_758_ += f_788_;
							f_757_ += f_776_;
							f_761_ += f_789_;
							f_760_ += f_777_;
							f_765_ += f_790_;
							f_763_ += f_778_;
							f_767_ += f_791_;
							f_766_ += f_779_;
							f_725_ += (float) anInt2215;
						}
						while (--f >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f_725_, (int) f_729_, (int) f_727_, f_732_, f_730_, f_735_, f_733_, f_738_, f_736_, (float) i_744_, (float) i_742_, f_753_, f_751_, f_756_, f_754_, f_759_, f_757_, f_762_, f_760_, f_765_, f_763_, f_768_, f_766_);
							f_729_ += f_793_;
							f_727_ += f_769_;
							f_732_ += f_794_;
							f_730_ += f_770_;
							f_735_ += f_795_;
							f_733_ += f_771_;
							f_738_ += f_796_;
							f_736_ += f_772_;
							i_744_ += f_797_;
							i_742_ += f_773_;
							f_753_ += f_798_;
							f_751_ += f_774_;
							f_756_ += f_799_;
							f_754_ += f_775_;
							f_759_ += f_800_;
							f_757_ += f_776_;
							f_762_ += f_801_;
							f_760_ += f_777_;
							f_765_ += f_802_;
							f_763_ += f_778_;
							f_768_ += f_803_;
							f_766_ += f_779_;
							f_725_ += (float) anInt2215;
						}
					}
				} else {
					f_729_ = f_728_;
					f_732_ = f_731_;
					f_735_ = f_734_;
					f_738_ = f_737_;
					i_744_ = i_743_;
					f_753_ = f_752_;
					f_756_ = f_755_;
					f_759_ = f_758_;
					f_762_ = f_761_;
					f_765_ = f_764_;
					f_768_ = f_767_;
					if (f_725_ < 0.0F) {
						f_729_ -= f_769_ * f_725_;
						f_728_ -= f_781_ * f_725_;
						f_732_ -= f_770_ * f_725_;
						f_731_ -= f_782_ * f_725_;
						f_735_ -= f_771_ * f_725_;
						f_734_ -= f_783_ * f_725_;
						f_738_ -= f_772_ * f_725_;
						f_737_ -= f_784_ * f_725_;
						i_744_ -= f_773_ * f_725_;
						i_743_ -= f_785_ * f_725_;
						f_753_ -= f_774_ * f_725_;
						f_752_ -= f_786_ * f_725_;
						f_756_ -= f_775_ * f_725_;
						f_755_ -= f_787_ * f_725_;
						f_759_ -= f_776_ * f_725_;
						f_758_ -= f_788_ * f_725_;
						f_762_ -= f_777_ * f_725_;
						f_761_ -= f_789_ * f_725_;
						f_765_ -= f_778_ * f_725_;
						f_764_ -= f_790_ * f_725_;
						f_768_ -= f_779_ * f_725_;
						f_767_ -= f_791_ * f_725_;
						f_725_ = 0.0F;
					}
					if (f < 0.0F) {
						f_727_ -= f_793_ * f;
						f_730_ -= f_794_ * f;
						f_733_ -= f_795_ * f;
						f_736_ -= f_796_ * f;
						i_742_ -= f_797_ * f;
						f_751_ -= f_798_ * f;
						f_754_ -= f_799_ * f;
						f_757_ -= f_800_ * f;
						f_760_ -= f_801_ * f;
						f_763_ -= f_802_ * f;
						f_766_ -= f_803_ * f;
						f = 0.0F;
					}
					f_726_ -= f;
					f -= f_725_;
					f_725_ = (float) anIntArray2224[(int) f_725_];
					if (f_769_ < f_781_) {
						while (--f >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f_725_, (int) f_729_, (int) f_728_, f_732_, f_731_, f_735_, f_734_, f_738_, f_737_, (float) i_744_, (float) i_743_, f_753_, f_752_, f_756_, f_755_, f_759_, f_758_, f_762_, f_761_, f_765_, f_764_, f_768_, f_767_);
							f_729_ += f_769_;
							f_728_ += f_781_;
							f_732_ += f_770_;
							f_731_ += f_782_;
							f_735_ += f_771_;
							f_734_ += f_783_;
							f_738_ += f_772_;
							f_737_ += f_784_;
							i_744_ += f_773_;
							i_743_ += f_785_;
							f_753_ += f_774_;
							f_752_ += f_786_;
							f_756_ += f_775_;
							f_755_ += f_787_;
							f_759_ += f_776_;
							f_758_ += f_788_;
							f_762_ += f_777_;
							f_761_ += f_789_;
							f_765_ += f_778_;
							f_764_ += f_790_;
							f_768_ += f_779_;
							f_767_ += f_791_;
							f_725_ += (float) anInt2215;
						}
						while (--f_726_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f_725_, (int) f_727_, (int) f_728_, f_730_, f_731_, f_733_, f_734_, f_736_, f_737_, (float) i_742_, (float) i_743_, f_751_, f_752_, f_754_, f_755_, f_757_, f_758_, f_760_, f_761_, f_763_, f_764_, f_766_, f_767_);
							f_727_ += f_793_;
							f_728_ += f_781_;
							f_730_ += f_794_;
							f_731_ += f_782_;
							f_733_ += f_795_;
							f_734_ += f_783_;
							f_736_ += f_796_;
							f_737_ += f_784_;
							i_742_ += f_797_;
							i_743_ += f_785_;
							f_751_ += f_798_;
							f_752_ += f_786_;
							f_754_ += f_799_;
							f_755_ += f_787_;
							f_757_ += f_800_;
							f_758_ += f_788_;
							f_760_ += f_801_;
							f_761_ += f_789_;
							f_763_ += f_802_;
							f_764_ += f_790_;
							f_766_ += f_803_;
							f_767_ += f_791_;
							f_725_ += (float) anInt2215;
						}
					} else {
						while (--f >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f_725_, (int) f_728_, (int) f_729_, f_731_, f_732_, f_734_, f_735_, f_737_, f_738_, (float) i_743_, (float) i_744_, f_752_, f_753_, f_755_, f_756_, f_758_, f_759_, f_761_, f_762_, f_764_, f_765_, f_767_, f_768_);
							f_728_ += f_781_;
							f_729_ += f_769_;
							f_731_ += f_782_;
							f_732_ += f_770_;
							f_734_ += f_783_;
							f_735_ += f_771_;
							f_737_ += f_784_;
							f_738_ += f_772_;
							i_743_ += f_785_;
							i_744_ += f_773_;
							f_752_ += f_786_;
							f_753_ += f_774_;
							f_755_ += f_787_;
							f_756_ += f_775_;
							f_758_ += f_788_;
							f_759_ += f_776_;
							f_761_ += f_789_;
							f_762_ += f_777_;
							f_764_ += f_790_;
							f_765_ += f_778_;
							f_767_ += f_791_;
							f_768_ += f_779_;
							f_725_ += (float) anInt2215;
						}
						while (--f_726_ >= 0.0F) {
							method1858(anIntArray2218, anIntArray2240, (int) f_725_, (int) f_728_, (int) f_727_, f_731_, f_730_, f_734_, f_733_, f_737_, f_736_, (float) i_743_, (float) i_742_, f_752_, f_751_, f_755_, f_754_, f_758_, f_757_, f_761_, f_760_, f_764_, f_763_, f_767_, f_766_);
							f_728_ += f_781_;
							f_727_ += f_793_;
							f_731_ += f_782_;
							f_730_ += f_794_;
							f_734_ += f_783_;
							f_733_ += f_795_;
							f_737_ += f_784_;
							f_736_ += f_796_;
							i_743_ += f_785_;
							i_742_ += f_797_;
							f_752_ += f_786_;
							f_751_ += f_798_;
							f_755_ += f_787_;
							f_754_ += f_799_;
							f_758_ += f_788_;
							f_757_ += f_800_;
							f_761_ += f_789_;
							f_760_ += f_801_;
							f_764_ += f_790_;
							f_763_ += f_802_;
							f_767_ += f_791_;
							f_766_ += f_803_;
							f_725_ += (float) anInt2215;
						}
					}
				}
			}
		} else if (!(f_726_ >= (float) anInt2225)) {
			if (f > (float) anInt2225) {
				f = (float) anInt2225;
			}
			if (f_725_ > (float) anInt2225) {
				f_725_ = (float) anInt2225;
			}
			if (f < f_725_) {
				f_728_ = f_729_;
				f_731_ = f_732_;
				f_734_ = f_735_;
				f_737_ = f_738_;
				i_743_ = i_744_;
				f_752_ = f_753_;
				f_755_ = f_756_;
				f_758_ = f_759_;
				f_761_ = f_762_;
				f_764_ = f_765_;
				f_767_ = f_768_;
				if (f_726_ < 0.0F) {
					f_729_ -= f_793_ * f_726_;
					f_728_ -= f_781_ * f_726_;
					f_732_ -= f_794_ * f_726_;
					f_731_ -= f_782_ * f_726_;
					f_735_ -= f_795_ * f_726_;
					f_734_ -= f_783_ * f_726_;
					f_738_ -= f_796_ * f_726_;
					f_737_ -= f_784_ * f_726_;
					i_744_ -= f_797_ * 3.0F;
					i_743_ -= f_785_ * f_726_;
					f_753_ -= f_798_ * f_726_;
					f_752_ -= f_786_ * f_726_;
					f_756_ -= f_799_ * f_726_;
					f_755_ -= f_787_ * f_726_;
					f_759_ -= f_800_ * f_726_;
					f_758_ -= f_788_ * f_726_;
					f_762_ -= f_801_ * f_726_;
					f_761_ -= f_789_ * f_726_;
					f_765_ -= f_802_ * f_726_;
					f_764_ -= f_790_ * f_726_;
					f_768_ -= f_803_ * f_726_;
					f_767_ -= f_791_ * f_726_;
					f_726_ = 0.0F;
				}
				if (f < 0.0F) {
					f_727_ -= f_769_ * f;
					f_730_ -= f_770_ * f;
					f_733_ -= f_771_ * f;
					f_736_ -= f_772_ * f;
					i_742_ -= f_773_ * f;
					f_751_ -= f_774_ * f;
					f_754_ -= f_775_ * f;
					f_757_ -= f_776_ * f;
					f_760_ -= f_777_ * f;
					f_763_ -= f_778_ * f;
					f_766_ -= f_779_ * f;
					f = 0.0F;
				}
				if (f_781_ < f_793_) {
					f_725_ -= f;
					f -= f_726_;
					f_726_ = (float) anIntArray2224[(int) f_726_];
					while (--f >= 0.0F) {
						method1858(anIntArray2218, anIntArray2240, (int) f_726_, (int) f_728_, (int) f_729_, f_731_, f_732_, f_734_, f_735_, f_737_, f_738_, (float) i_743_, (float) i_744_, f_752_, f_753_, f_755_, f_756_, f_758_, f_759_, f_761_, f_762_, f_764_, f_765_, f_767_, f_768_);
						f_728_ += f_781_;
						f_729_ += f_793_;
						f_731_ += f_782_;
						f_732_ += f_794_;
						f_734_ += f_783_;
						f_735_ += f_795_;
						f_737_ += f_784_;
						f_738_ += f_796_;
						i_743_ += f_785_;
						i_744_ += f_797_;
						f_752_ += f_786_;
						f_753_ += f_798_;
						f_755_ += f_787_;
						f_756_ += f_799_;
						f_758_ += f_788_;
						f_759_ += f_800_;
						f_761_ += f_789_;
						f_762_ += f_801_;
						f_764_ += f_790_;
						f_765_ += f_802_;
						f_767_ += f_791_;
						f_768_ += f_803_;
						f_726_ += (float) anInt2215;
					}
					while (--f_725_ >= 0.0F) {
						method1858(anIntArray2218, anIntArray2240, (int) f_726_, (int) f_728_, (int) f_727_, f_731_, f_730_, f_734_, f_733_, f_737_, f_736_, (float) i_743_, (float) i_742_, f_752_, f_751_, f_755_, f_754_, f_758_, f_757_, f_761_, f_760_, f_764_, f_763_, f_767_, f_766_);
						f_728_ += f_781_;
						f_727_ += f_769_;
						f_731_ += f_782_;
						f_730_ += f_770_;
						f_734_ += f_783_;
						f_733_ += f_771_;
						f_737_ += f_784_;
						f_736_ += f_772_;
						i_743_ += f_785_;
						i_742_ += f_773_;
						f_752_ += f_786_;
						f_751_ += f_774_;
						f_755_ += f_787_;
						f_754_ += f_775_;
						f_758_ += f_788_;
						f_757_ += f_776_;
						f_761_ += f_789_;
						f_760_ += f_777_;
						f_764_ += f_790_;
						f_763_ += f_778_;
						f_767_ += f_791_;
						f_766_ += f_779_;
						f_726_ += (float) anInt2215;
					}
				} else {
					f_725_ -= f;
					f -= f_726_;
					f_726_ = (float) anIntArray2224[(int) f_726_];
					while (--f >= 0.0F) {
						method1858(anIntArray2218, anIntArray2240, (int) f_726_, (int) f_729_, (int) f_728_, f_732_, f_731_, f_735_, f_734_, f_738_, f_737_, (float) i_744_, (float) i_743_, f_753_, f_752_, f_756_, f_755_, f_759_, f_758_, f_762_, f_761_, f_765_, f_764_, f_768_, f_767_);
						f_729_ += f_793_;
						f_728_ += f_781_;
						f_732_ += f_794_;
						f_731_ += f_782_;
						f_735_ += f_795_;
						f_734_ += f_783_;
						f_738_ += f_796_;
						f_737_ += f_784_;
						i_744_ += f_797_;
						i_743_ += f_785_;
						f_753_ += f_798_;
						f_752_ += f_786_;
						f_756_ += f_799_;
						f_755_ += f_787_;
						f_759_ += f_800_;
						f_758_ += f_788_;
						f_762_ += f_801_;
						f_761_ += f_789_;
						f_765_ += f_802_;
						f_764_ += f_790_;
						f_768_ += f_803_;
						f_767_ += f_791_;
						f_726_ += (float) anInt2215;
					}
					while (--f_725_ >= 0.0F) {
						method1858(anIntArray2218, anIntArray2240, (int) f_726_, (int) f_727_, (int) f_728_, f_730_, f_731_, f_733_, f_734_, f_736_, f_737_, (float) i_742_, (float) i_743_, f_751_, f_752_, f_754_, f_755_, f_757_, f_758_, f_760_, f_761_, f_763_, f_764_, f_766_, f_767_);
						f_727_ += f_769_;
						f_728_ += f_781_;
						f_730_ += f_770_;
						f_731_ += f_782_;
						f_733_ += f_771_;
						f_734_ += f_783_;
						f_736_ += f_772_;
						f_737_ += f_784_;
						i_742_ += f_773_;
						i_743_ += f_785_;
						f_751_ += f_774_;
						f_752_ += f_786_;
						f_754_ += f_775_;
						f_755_ += f_787_;
						f_757_ += f_776_;
						f_758_ += f_788_;
						f_760_ += f_777_;
						f_761_ += f_789_;
						f_763_ += f_778_;
						f_764_ += f_790_;
						f_766_ += f_779_;
						f_767_ += f_791_;
						f_726_ += (float) anInt2215;
					}
				}
			} else {
				f_727_ = f_729_;
				f_730_ = f_732_;
				f_733_ = f_735_;
				f_736_ = f_738_;
				i_742_ = i_744_;
				f_751_ = f_753_;
				f_754_ = f_756_;
				f_757_ = f_759_;
				f_760_ = f_762_;
				f_763_ = f_765_;
				f_766_ = f_768_;
				if (f_726_ < 0.0F) {
					f_729_ -= f_793_ * f_726_;
					f_727_ -= f_781_ * f_726_;
					f_732_ -= f_794_ * f_726_;
					f_730_ -= f_782_ * f_726_;
					f_735_ -= f_795_ * f_726_;
					f_733_ -= f_783_ * f_726_;
					f_738_ -= f_796_ * f_726_;
					f_736_ -= f_784_ * f_726_;
					i_744_ -= f_797_ * 3.0F;
					i_742_ -= f_785_ * f_726_;
					f_753_ -= f_798_ * f_726_;
					f_751_ -= f_786_ * f_726_;
					f_756_ -= f_799_ * f_726_;
					f_754_ -= f_787_ * f_726_;
					f_759_ -= f_800_ * f_726_;
					f_757_ -= f_788_ * f_726_;
					f_762_ -= f_801_ * f_726_;
					f_760_ -= f_789_ * f_726_;
					f_765_ -= f_802_ * f_726_;
					f_763_ -= f_790_ * f_726_;
					f_768_ -= f_803_ * f_726_;
					f_766_ -= f_791_ * f_726_;
					f_726_ = 0.0F;
				}
				if (f_725_ < 0.0F) {
					f_728_ -= f_769_ * f_725_;
					f_731_ -= f_770_ * f_725_;
					f_734_ -= f_771_ * f_725_;
					f_737_ -= f_772_ * f_725_;
					i_743_ -= f_773_ * f_725_;
					f_752_ -= f_774_ * f_725_;
					f_755_ -= f_775_ * f_725_;
					f_758_ -= f_776_ * f_725_;
					f_761_ -= f_777_ * f_725_;
					f_764_ -= f_778_ * f_725_;
					f_767_ -= f_779_ * f_725_;
					f_725_ = 0.0F;
				}
				if (f_781_ < f_793_) {
					f -= f_725_;
					f_725_ -= f_726_;
					f_726_ = (float) anIntArray2224[(int) f_726_];
					while (--f_725_ >= 0.0F) {
						method1858(anIntArray2218, anIntArray2240, (int) f_726_, (int) f_727_, (int) f_729_, f_730_, f_732_, f_733_, f_735_, f_736_, f_738_, (float) i_742_, (float) i_744_, f_751_, f_753_, f_754_, f_756_, f_757_, f_759_, f_760_, f_762_, f_763_, f_765_, f_766_, f_768_);
						f_727_ += f_781_;
						f_729_ += f_793_;
						f_730_ += f_782_;
						f_732_ += f_794_;
						f_733_ += f_783_;
						f_735_ += f_795_;
						f_736_ += f_784_;
						f_738_ += f_796_;
						i_742_ += f_785_;
						i_744_ += f_797_;
						f_751_ += f_786_;
						f_753_ += f_798_;
						f_754_ += f_787_;
						f_756_ += f_799_;
						f_757_ += f_788_;
						f_759_ += f_800_;
						f_760_ += f_789_;
						f_762_ += f_801_;
						f_763_ += f_790_;
						f_765_ += f_802_;
						f_766_ += f_791_;
						f_768_ += f_803_;
						f_726_ += (float) anInt2215;
					}
					while (--f >= 0.0F) {
						method1858(anIntArray2218, anIntArray2240, (int) f_726_, (int) f_728_, (int) f_729_, f_731_, f_732_, f_734_, f_735_, f_737_, f_738_, (float) i_743_, (float) i_744_, f_752_, f_753_, f_755_, f_756_, f_758_, f_759_, f_761_, f_762_, f_764_, f_765_, f_767_, f_768_);
						f_728_ += f_769_;
						f_729_ += f_793_;
						f_731_ += f_770_;
						f_732_ += f_794_;
						f_734_ += f_771_;
						f_735_ += f_795_;
						f_737_ += f_772_;
						f_738_ += f_796_;
						i_743_ += f_773_;
						i_744_ += f_797_;
						f_752_ += f_774_;
						f_753_ += f_798_;
						f_755_ += f_775_;
						f_756_ += f_799_;
						f_758_ += f_776_;
						f_759_ += f_800_;
						f_761_ += f_777_;
						f_762_ += f_801_;
						f_764_ += f_778_;
						f_765_ += f_802_;
						f_767_ += f_779_;
						f_768_ += f_803_;
						f_726_ += (float) anInt2215;
					}
				} else {
					f -= f_725_;
					f_725_ -= f_726_;
					f_726_ = (float) anIntArray2224[(int) f_726_];
					while (--f_725_ >= 0.0F) {
						method1858(anIntArray2218, anIntArray2240, (int) f_726_, (int) f_729_, (int) f_727_, f_732_, f_730_, f_735_, f_733_, f_738_, f_736_, (float) i_744_, (float) i_742_, f_753_, f_751_, f_756_, f_754_, f_759_, f_757_, f_762_, f_760_, f_765_, f_763_, f_768_, f_766_);
						f_729_ += f_793_;
						f_727_ += f_781_;
						f_732_ += f_794_;
						f_730_ += f_782_;
						f_735_ += f_795_;
						f_733_ += f_783_;
						f_738_ += f_796_;
						f_736_ += f_784_;
						i_744_ += f_797_;
						i_742_ += f_785_;
						f_753_ += f_798_;
						f_751_ += f_786_;
						f_756_ += f_799_;
						f_754_ += f_787_;
						f_759_ += f_800_;
						f_757_ += f_788_;
						f_762_ += f_801_;
						f_760_ += f_789_;
						f_765_ += f_802_;
						f_763_ += f_790_;
						f_768_ += f_803_;
						f_766_ += f_791_;
						f_726_ += (float) anInt2215;
					}
					while (--f >= 0.0F) {
						method1858(anIntArray2218, anIntArray2240, (int) f_726_, (int) f_729_, (int) f_728_, f_732_, f_731_, f_735_, f_734_, f_738_, f_737_, (float) i_744_, (float) i_743_, f_753_, f_752_, f_756_, f_755_, f_759_, f_758_, f_762_, f_761_, f_765_, f_764_, f_768_, f_767_);
						f_729_ += f_793_;
						f_728_ += f_769_;
						f_732_ += f_794_;
						f_731_ += f_770_;
						f_735_ += f_795_;
						f_734_ += f_771_;
						f_738_ += f_796_;
						f_737_ += f_772_;
						i_744_ += f_797_;
						i_743_ += f_773_;
						f_753_ += f_798_;
						f_752_ += f_774_;
						f_756_ += f_799_;
						f_755_ += f_775_;
						f_759_ += f_800_;
						f_758_ += f_776_;
						f_762_ += f_801_;
						f_761_ += f_777_;
						f_765_ += f_802_;
						f_764_ += f_778_;
						f_768_ += f_803_;
						f_767_ += f_779_;
						f_726_ += (float) anInt2215;
					}
				}
			}
		}
	}
	
	final void method1865(float f, float f_805_, float f_806_, float f_807_, float f_808_, float f_809_, float f_810_, float f_811_, float f_812_, float f_813_, float f_814_, float f_815_) {
		if (aBoolean2227) {
			aPureJavaToolkit2221.method1236((int) f_805_, (int) f, (int) f_808_, Class170.anIntArray2054[(int) f_813_], 1, (int) f_807_);
			aPureJavaToolkit2221.method1236((int) f_806_, (int) f_805_, (int) f_809_, Class170.anIntArray2054[(int) f_813_], 1, (int) f_808_);
			aPureJavaToolkit2221.method1236((int) f, (int) f_806_, (int) f_807_, Class170.anIntArray2054[(int) f_813_], 1, (int) f_809_);
		} else {
			float f_816_ = f_808_ - f_807_;
			float f_817_ = f_805_ - f;
			float f_818_ = f_809_ - f_807_;
			float f_819_ = f_806_ - f;
			float f_820_ = f_814_ - f_813_;
			float f_821_ = f_815_ - f_813_;
			float f_822_ = f_811_ - f_810_;
			float f_823_ = f_812_ - f_810_;
			float f_824_;
			if (f_806_ != f_805_) {
				f_824_ = (f_809_ - f_808_) / (f_806_ - f_805_);
			} else {
				f_824_ = 0.0F;
			}
			float f_825_;
			if (f_805_ != f) {
				f_825_ = f_816_ / f_817_;
			} else {
				f_825_ = 0.0F;
			}
			float f_826_;
			if (f_806_ != f) {
				f_826_ = f_818_ / f_819_;
			} else {
				f_826_ = 0.0F;
			}
			float f_827_ = f_816_ * f_819_ - f_818_ * f_817_;
			if (f_827_ != 0.0F) {
				float f_828_ = (f_820_ * f_819_ - f_821_ * f_817_) / f_827_;
				float f_829_ = (f_821_ * f_816_ - f_820_ * f_818_) / f_827_;
				float f_830_ = (f_822_ * f_819_ - f_823_ * f_817_) / f_827_;
				float f_831_ = (f_823_ * f_816_ - f_822_ * f_818_) / f_827_;
				if (f <= f_805_ && f <= f_806_) {
					if (!(f >= (float) anInt2225)) {
						if (f_805_ > (float) anInt2225) {
							f_805_ = (float) anInt2225;
						}
						if (f_806_ > (float) anInt2225) {
							f_806_ = (float) anInt2225;
						}
						f_813_ = f_813_ - f_828_ * f_807_ + f_828_;
						f_810_ = f_810_ - f_830_ * f_807_ + f_830_;
						if (f_805_ < f_806_) {
							f_809_ = f_807_;
							if (f < 0.0F) {
								f_809_ -= f_826_ * f;
								f_807_ -= f_825_ * f;
								f_813_ -= f_829_ * f;
								f_810_ -= f_831_ * f;
								f = 0.0F;
							}
							if (f_805_ < 0.0F) {
								f_808_ -= f_824_ * f_805_;
								f_805_ = 0.0F;
							}
							if (f != f_805_ && f_826_ < f_825_ || f == f_805_ && f_826_ > f_824_) {
								f_806_ -= f_805_;
								f_805_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_805_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_809_, (int) f_807_, f_813_, f_828_, f_810_, f_830_);
									f_809_ += f_826_;
									f_807_ += f_825_;
									f_813_ += f_829_;
									f_810_ += f_831_;
									f += (float) anInt2215;
								}
								while (--f_806_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_809_, (int) f_808_, f_813_, f_828_, f_810_, f_830_);
									f_809_ += f_826_;
									f_808_ += f_824_;
									f_813_ += f_829_;
									f_810_ += f_831_;
									f += (float) anInt2215;
								}
							} else {
								f_806_ -= f_805_;
								f_805_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_805_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_807_, (int) f_809_, f_813_, f_828_, f_810_, f_830_);
									f_809_ += f_826_;
									f_807_ += f_825_;
									f_813_ += f_829_;
									f_810_ += f_831_;
									f += (float) anInt2215;
								}
								while (--f_806_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_808_, (int) f_809_, f_813_, f_828_, f_810_, f_830_);
									f_809_ += f_826_;
									f_808_ += f_824_;
									f_813_ += f_829_;
									f_810_ += f_831_;
									f += (float) anInt2215;
								}
							}
						} else {
							f_808_ = f_807_;
							if (f < 0.0F) {
								f_808_ -= f_826_ * f;
								f_807_ -= f_825_ * f;
								f_813_ -= f_829_ * f;
								f_810_ -= f_831_ * f;
								f = 0.0F;
							}
							if (f_806_ < 0.0F) {
								f_809_ -= f_824_ * f_806_;
								f_806_ = 0.0F;
							}
							if (f != f_806_ && f_826_ < f_825_ || f == f_806_ && f_824_ > f_825_) {
								f_805_ -= f_806_;
								f_806_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_806_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_808_, (int) f_807_, f_813_, f_828_, f_810_, f_830_);
									f_808_ += f_826_;
									f_807_ += f_825_;
									f_813_ += f_829_;
									f_810_ += f_831_;
									f += (float) anInt2215;
								}
								while (--f_805_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_809_, (int) f_807_, f_813_, f_828_, f_810_, f_830_);
									f_809_ += f_824_;
									f_807_ += f_825_;
									f_813_ += f_829_;
									f_810_ += f_831_;
									f += (float) anInt2215;
								}
							} else {
								f_805_ -= f_806_;
								f_806_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_806_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_807_, (int) f_808_, f_813_, f_828_, f_810_, f_830_);
									f_808_ += f_826_;
									f_807_ += f_825_;
									f_813_ += f_829_;
									f_810_ += f_831_;
									f += (float) anInt2215;
								}
								while (--f_805_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f, 0, 0, (int) f_807_, (int) f_809_, f_813_, f_828_, f_810_, f_830_);
									f_809_ += f_824_;
									f_807_ += f_825_;
									f_813_ += f_829_;
									f_810_ += f_831_;
									f += (float) anInt2215;
								}
							}
						}
					}
				} else if (f_805_ <= f_806_) {
					if (!(f_805_ >= (float) anInt2225)) {
						if (f_806_ > (float) anInt2225) {
							f_806_ = (float) anInt2225;
						}
						if (f > (float) anInt2225) {
							f = (float) anInt2225;
						}
						f_814_ = f_814_ - f_828_ * f_808_ + f_828_;
						f_811_ = f_811_ - f_830_ * f_808_ + f_830_;
						if (f_806_ < f) {
							f_807_ = f_808_;
							if (f_805_ < 0.0F) {
								f_807_ -= f_825_ * f_805_;
								f_808_ -= f_824_ * f_805_;
								f_814_ -= f_829_ * f_805_;
								f_811_ -= f_831_ * f_805_;
								f_805_ = 0.0F;
							}
							if (f_806_ < 0.0F) {
								f_809_ -= f_826_ * f_806_;
								f_806_ = 0.0F;
							}
							if (f_805_ != f_806_ && f_825_ < f_824_ || f_805_ == f_806_ && f_825_ > f_826_) {
								f -= f_806_;
								f_806_ -= f_805_;
								f_805_ = (float) anIntArray2224[(int) f_805_];
								while (--f_806_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f_805_, 0, 0, (int) f_807_, (int) f_808_, f_814_, f_828_, f_811_, f_830_);
									f_807_ += f_825_;
									f_808_ += f_824_;
									f_814_ += f_829_;
									f_811_ += f_831_;
									f_805_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f_805_, 0, 0, (int) f_807_, (int) f_809_, f_814_, f_828_, f_811_, f_830_);
									f_807_ += f_825_;
									f_809_ += f_826_;
									f_814_ += f_829_;
									f_811_ += f_831_;
									f_805_ += (float) anInt2215;
								}
							} else {
								f -= f_806_;
								f_806_ -= f_805_;
								f_805_ = (float) anIntArray2224[(int) f_805_];
								while (--f_806_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f_805_, 0, 0, (int) f_808_, (int) f_807_, f_814_, f_828_, f_811_, f_830_);
									f_807_ += f_825_;
									f_808_ += f_824_;
									f_814_ += f_829_;
									f_811_ += f_831_;
									f_805_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f_805_, 0, 0, (int) f_809_, (int) f_807_, f_814_, f_828_, f_811_, f_830_);
									f_807_ += f_825_;
									f_809_ += f_826_;
									f_814_ += f_829_;
									f_811_ += f_831_;
									f_805_ += (float) anInt2215;
								}
							}
						} else {
							f_809_ = f_808_;
							if (f_805_ < 0.0F) {
								f_809_ -= f_825_ * f_805_;
								f_808_ -= f_824_ * f_805_;
								f_814_ -= f_829_ * f_805_;
								f_811_ -= f_831_ * f_805_;
								f_805_ = 0.0F;
							}
							if (f < 0.0F) {
								f_807_ -= f_826_ * f;
								f = 0.0F;
							}
							if (f_825_ < f_824_) {
								f_806_ -= f;
								f -= f_805_;
								f_805_ = (float) anIntArray2224[(int) f_805_];
								while (--f >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f_805_, 0, 0, (int) f_809_, (int) f_808_, f_814_, f_828_, f_811_, f_830_);
									f_809_ += f_825_;
									f_808_ += f_824_;
									f_814_ += f_829_;
									f_811_ += f_831_;
									f_805_ += (float) anInt2215;
								}
								while (--f_806_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f_805_, 0, 0, (int) f_807_, (int) f_808_, f_814_, f_828_, f_811_, f_830_);
									f_807_ += f_826_;
									f_808_ += f_824_;
									f_814_ += f_829_;
									f_811_ += f_831_;
									f_805_ += (float) anInt2215;
								}
							} else {
								f_806_ -= f;
								f -= f_805_;
								f_805_ = (float) anIntArray2224[(int) f_805_];
								while (--f >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f_805_, 0, 0, (int) f_808_, (int) f_809_, f_814_, f_828_, f_811_, f_830_);
									f_809_ += f_825_;
									f_808_ += f_824_;
									f_814_ += f_829_;
									f_811_ += f_831_;
									f_805_ += (float) anInt2215;
								}
								while (--f_806_ >= 0.0F) {
									method1860(anIntArray2218, aFloatArray2214, (int) f_805_, 0, 0, (int) f_808_, (int) f_807_, f_814_, f_828_, f_811_, f_830_);
									f_807_ += f_826_;
									f_808_ += f_824_;
									f_814_ += f_829_;
									f_811_ += f_831_;
									f_805_ += (float) anInt2215;
								}
							}
						}
					}
				} else if (!(f_806_ >= (float) anInt2225)) {
					if (f > (float) anInt2225) {
						f = (float) anInt2225;
					}
					if (f_805_ > (float) anInt2225) {
						f_805_ = (float) anInt2225;
					}
					f_815_ = f_815_ - f_828_ * f_809_ + f_828_;
					f_812_ = f_812_ - f_830_ * f_809_ + f_830_;
					if (f < f_805_) {
						f_808_ = f_809_;
						if (f_806_ < 0.0F) {
							f_808_ -= f_824_ * f_806_;
							f_809_ -= f_826_ * f_806_;
							f_815_ -= f_829_ * f_806_;
							f_812_ -= f_831_ * f_806_;
							f_806_ = 0.0F;
						}
						if (f < 0.0F) {
							f_807_ -= f_825_ * f;
							f = 0.0F;
						}
						if (f_824_ < f_826_) {
							f_805_ -= f;
							f -= f_806_;
							f_806_ = (float) anIntArray2224[(int) f_806_];
							while (--f >= 0.0F) {
								method1860(anIntArray2218, aFloatArray2214, (int) f_806_, 0, 0, (int) f_808_, (int) f_809_, f_815_, f_828_, f_812_, f_830_);
								f_808_ += f_824_;
								f_809_ += f_826_;
								f_815_ += f_829_;
								f_812_ += f_831_;
								f_806_ += (float) anInt2215;
							}
							while (--f_805_ >= 0.0F) {
								method1860(anIntArray2218, aFloatArray2214, (int) f_806_, 0, 0, (int) f_808_, (int) f_807_, f_815_, f_828_, f_812_, f_830_);
								f_808_ += f_824_;
								f_807_ += f_825_;
								f_815_ += f_829_;
								f_812_ += f_831_;
								f_806_ += (float) anInt2215;
							}
						} else {
							f_805_ -= f;
							f -= f_806_;
							f_806_ = (float) anIntArray2224[(int) f_806_];
							while (--f >= 0.0F) {
								method1860(anIntArray2218, aFloatArray2214, (int) f_806_, 0, 0, (int) f_809_, (int) f_808_, f_815_, f_828_, f_812_, f_830_);
								f_808_ += f_824_;
								f_809_ += f_826_;
								f_815_ += f_829_;
								f_812_ += f_831_;
								f_806_ += (float) anInt2215;
							}
							while (--f_805_ >= 0.0F) {
								method1860(anIntArray2218, aFloatArray2214, (int) f_806_, 0, 0, (int) f_807_, (int) f_808_, f_815_, f_828_, f_812_, f_830_);
								f_808_ += f_824_;
								f_807_ += f_825_;
								f_815_ += f_829_;
								f_812_ += f_831_;
								f_806_ += (float) anInt2215;
							}
						}
					} else {
						f_807_ = f_809_;
						if (f_806_ < 0.0F) {
							f_807_ -= f_824_ * f_806_;
							f_809_ -= f_826_ * f_806_;
							f_815_ -= f_829_ * f_806_;
							f_812_ -= f_831_ * f_806_;
							f_806_ = 0.0F;
						}
						if (f_805_ < 0.0F) {
							f_808_ -= f_825_ * f_805_;
							f_805_ = 0.0F;
						}
						if (f_824_ < f_826_) {
							f -= f_805_;
							f_805_ -= f_806_;
							f_806_ = (float) anIntArray2224[(int) f_806_];
							while (--f_805_ >= 0.0F) {
								method1860(anIntArray2218, aFloatArray2214, (int) f_806_, 0, 0, (int) f_807_, (int) f_809_, f_815_, f_828_, f_812_, f_830_);
								f_807_ += f_824_;
								f_809_ += f_826_;
								f_815_ += f_829_;
								f_812_ += f_831_;
								f_806_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1860(anIntArray2218, aFloatArray2214, (int) f_806_, 0, 0, (int) f_808_, (int) f_809_, f_815_, f_828_, f_812_, f_830_);
								f_808_ += f_825_;
								f_809_ += f_826_;
								f_815_ += f_829_;
								f_812_ += f_831_;
								f_806_ += (float) anInt2215;
							}
						} else {
							f -= f_805_;
							f_805_ -= f_806_;
							f_806_ = (float) anIntArray2224[(int) f_806_];
							while (--f_805_ >= 0.0F) {
								method1860(anIntArray2218, aFloatArray2214, (int) f_806_, 0, 0, (int) f_809_, (int) f_807_, f_815_, f_828_, f_812_, f_830_);
								f_807_ += f_824_;
								f_809_ += f_826_;
								f_815_ += f_829_;
								f_812_ += f_831_;
								f_806_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1860(anIntArray2218, aFloatArray2214, (int) f_806_, 0, 0, (int) f_809_, (int) f_808_, f_815_, f_828_, f_812_, f_830_);
								f_808_ += f_825_;
								f_809_ += f_826_;
								f_815_ += f_829_;
								f_812_ += f_831_;
								f_806_ += (float) anInt2215;
							}
						}
					}
				}
			}
		}
	}
	
	private final void method1866(int[] is, float[] fs, int i, int i_832_, int i_833_, int i_834_, int i_835_, float f, float f_836_, float f_837_, float f_838_) {
		if (aBoolean2217) {
			if (i_835_ > anInt2222) {
				i_835_ = anInt2222;
			}
			if (i_834_ < 0) {
				i_834_ = 0;
			}
		}
		if (i_834_ < i_835_) {
			i += i_834_ - 1;
			f += f_836_ * (float) i_834_;
			f_837_ += f_838_ * (float) i_834_;
			if (aClass374_2219.aBoolean4615) {
				do {
					if (aBoolean2226) {
						i_833_ = i_835_ - i_834_ >> 2;
						f_836_ *= 4.0F;
						if (anInt2220 == 0) {
							if (i_833_ > 0) {
								do {
									i_832_ = Class170.anIntArray2054[(int) f];
									f += f_836_;
									if (f_837_ < fs[++i]) {
										is[i] = i_832_;
										fs[i] = f_837_;
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										is[i] = i_832_;
										fs[i] = f_837_;
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										is[i] = i_832_;
										fs[i] = f_837_;
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										is[i] = i_832_;
										fs[i] = f_837_;
									}
									f_837_ += f_838_;
								} while (--i_833_ > 0);
							}
							i_833_ = i_835_ - i_834_ & 0x3;
							if (i_833_ > 0) {
								i_832_ = Class170.anIntArray2054[(int) f];
								do {
									if (f_837_ < fs[++i]) {
										is[i] = i_832_;
										fs[i] = f_837_;
									}
									f_837_ += f_838_;
								} while (--i_833_ > 0);
							}
						} else {
							int i_839_ = anInt2220;
							int i_840_ = 256 - anInt2220;
							if (i_833_ > 0) {
								do {
									i_832_ = Class170.anIntArray2054[(int) f];
									f += f_836_;
									i_832_ = ((i_832_ & 0xff00ff) * i_840_ >> 8 & 0xff00ff) + ((i_832_ & 0xff00) * i_840_ >> 8 & 0xff00);
									if (f_837_ < fs[++i]) {
										int i_841_ = is[i];
										is[i] = (i_840_ | i_841_ >> 24) << 24 | i_832_ + ((i_841_ & 0xff00ff) * i_839_ >> 8 & 0xff00ff) + ((i_841_ & 0xff00) * i_839_ >> 8 & 0xff00);
										fs[i] = f_837_;
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										int i_842_ = is[i];
										is[i] = (i_840_ | i_842_ >> 24) << 24 | i_832_ + ((i_842_ & 0xff00ff) * i_839_ >> 8 & 0xff00ff) + ((i_842_ & 0xff00) * i_839_ >> 8 & 0xff00);
										fs[i] = f_837_;
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										int i_843_ = is[i];
										is[i] = (i_840_ | i_843_ >> 24) << 24 | i_832_ + ((i_843_ & 0xff00ff) * i_839_ >> 8 & 0xff00ff) + ((i_843_ & 0xff00) * i_839_ >> 8 & 0xff00);
										fs[i] = f_837_;
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										int i_844_ = is[i];
										is[i] = (i_840_ | i_844_ >> 24) << 24 | i_832_ + ((i_844_ & 0xff00ff) * i_839_ >> 8 & 0xff00ff) + ((i_844_ & 0xff00) * i_839_ >> 8 & 0xff00);
										fs[i] = f_837_;
									}
									f_837_ += f_838_;
								} while (--i_833_ > 0);
							}
							i_833_ = i_835_ - i_834_ & 0x3;
							if (i_833_ <= 0) {
								break;
							}
							i_832_ = Class170.anIntArray2054[(int) f];
							i_832_ = ((i_832_ & 0xff00ff) * i_840_ >> 8 & 0xff00ff) + ((i_832_ & 0xff00) * i_840_ >> 8 & 0xff00);
							do {
								if (f_837_ < fs[++i]) {
									int i_845_ = is[i];
									is[i] = (i_840_ | i_845_ >> 24) << 24 | i_832_ + ((i_845_ & 0xff00ff) * i_839_ >> 8 & 0xff00ff) + ((i_845_ & 0xff00) * i_839_ >> 8 & 0xff00);
									fs[i] = f_837_;
								}
								f_837_ += f_838_;
							} while (--i_833_ > 0);
						}
						break;
					}
					i_833_ = i_835_ - i_834_;
					if (anInt2220 == 0) {
						do {
							if (f_837_ < fs[++i]) {
								is[i] = Class170.anIntArray2054[(int) f];
								fs[i] = f_837_;
							}
							f_837_ += f_838_;
							f += f_836_;
						} while (--i_833_ > 0);
						break;
					}
					int i_846_ = anInt2220;
					int i_847_ = 256 - anInt2220;
					do {
						if (f_837_ < fs[++i]) {
							i_832_ = Class170.anIntArray2054[(int) f];
							i_832_ = ((i_832_ & 0xff00ff) * i_847_ >> 8 & 0xff00ff) + ((i_832_ & 0xff00) * i_847_ >> 8 & 0xff00);
							int i_848_ = is[i];
							is[i] = (i_847_ | i_848_ >> 24) << 24 | i_832_ + ((i_848_ & 0xff00ff) * i_846_ >> 8 & 0xff00ff) + ((i_848_ & 0xff00) * i_846_ >> 8 & 0xff00);
							fs[i] = f_837_;
						}
						f += f_836_;
						f_837_ += f_838_;
					} while (--i_833_ > 0);
				} while (false);
			} else {
				do {
					if (aBoolean2226) {
						i_833_ = i_835_ - i_834_ >> 2;
						f_836_ *= 4.0F;
						if (anInt2220 == 0) {
							if (i_833_ > 0) {
								do {
									i_832_ = Class170.anIntArray2054[(int) f];
									f += f_836_;
									if (f_837_ < fs[++i]) {
										is[i] = i_832_;
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										is[i] = i_832_;
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										is[i] = i_832_;
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										is[i] = i_832_;
									}
									f_837_ += f_838_;
								} while (--i_833_ > 0);
							}
							i_833_ = i_835_ - i_834_ & 0x3;
							if (i_833_ > 0) {
								i_832_ = Class170.anIntArray2054[(int) f];
								do {
									if (f_837_ < fs[++i]) {
										is[i] = i_832_;
									}
									f_837_ += f_838_;
								} while (--i_833_ > 0);
							}
						} else {
							int i_849_ = anInt2220;
							int i_850_ = 256 - anInt2220;
							if (i_833_ > 0) {
								do {
									i_832_ = Class170.anIntArray2054[(int) f];
									f += f_836_;
									i_832_ = ((i_832_ & 0xff00ff) * i_850_ >> 8 & 0xff00ff) + ((i_832_ & 0xff00) * i_850_ >> 8 & 0xff00);
									if (f_837_ < fs[++i]) {
										int i_851_ = is[i];
										is[i] = (i_850_ | i_851_ >> 24) << 24 | i_832_ + ((i_851_ & 0xff00ff) * i_849_ >> 8 & 0xff00ff) + ((i_851_ & 0xff00) * i_849_ >> 8 & 0xff00);
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										int i_852_ = is[i];
										is[i] = (i_850_ | i_852_ >> 24) << 24 | i_832_ + ((i_852_ & 0xff00ff) * i_849_ >> 8 & 0xff00ff) + ((i_852_ & 0xff00) * i_849_ >> 8 & 0xff00);
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										int i_853_ = is[i];
										is[i] = (i_850_ | i_853_ >> 24) << 24 | i_832_ + ((i_853_ & 0xff00ff) * i_849_ >> 8 & 0xff00ff) + ((i_853_ & 0xff00) * i_849_ >> 8 & 0xff00);
									}
									f_837_ += f_838_;
									if (f_837_ < fs[++i]) {
										int i_854_ = is[i];
										is[i] = (i_850_ | i_854_ >> 24) << 24 | i_832_ + ((i_854_ & 0xff00ff) * i_849_ >> 8 & 0xff00ff) + ((i_854_ & 0xff00) * i_849_ >> 8 & 0xff00);
									}
									f_837_ += f_838_;
								} while (--i_833_ > 0);
							}
							i_833_ = i_835_ - i_834_ & 0x3;
							if (i_833_ <= 0) {
								break;
							}
							i_832_ = Class170.anIntArray2054[(int) f];
							i_832_ = ((i_832_ & 0xff00ff) * i_850_ >> 8 & 0xff00ff) + ((i_832_ & 0xff00) * i_850_ >> 8 & 0xff00);
							do {
								if (f_837_ < fs[++i]) {
									int i_855_ = is[i];
									is[i] = (i_850_ | i_855_ >> 24) << 24 | i_832_ + ((i_855_ & 0xff00ff) * i_849_ >> 8 & 0xff00ff) + ((i_855_ & 0xff00) * i_849_ >> 8 & 0xff00);
								}
								f_837_ += f_838_;
							} while (--i_833_ > 0);
						}
						break;
					}
					i_833_ = i_835_ - i_834_;
					if (anInt2220 == 0) {
						do {
							if (f_837_ < fs[++i]) {
								is[i] = Class170.anIntArray2054[(int) f];
							}
							f_837_ += f_838_;
							f += f_836_;
						} while (--i_833_ > 0);
						break;
					}
					int i_856_ = anInt2220;
					int i_857_ = 256 - anInt2220;
					do {
						if (f_837_ < fs[++i]) {
							i_832_ = Class170.anIntArray2054[(int) f];
							i_832_ = ((i_832_ & 0xff00ff) * i_857_ >> 8 & 0xff00ff) + ((i_832_ & 0xff00) * i_857_ >> 8 & 0xff00);
							int i_858_ = is[i];
							is[i] = (i_857_ | i_858_ >> 24) << 24 | i_832_ + ((i_858_ & 0xff00ff) * i_856_ >> 8 & 0xff00ff) + ((i_858_ & 0xff00) * i_856_ >> 8 & 0xff00);
						}
						f += f_836_;
						f_837_ += f_838_;
					} while (--i_833_ > 0);
				} while (false);
			}
		}
	}
	
	final void method1867(float f, float f_859_, float f_860_, float f_861_, float f_862_, float f_863_, float f_864_, float f_865_, float f_866_, int i) {
		if (aBoolean2227) {
			aPureJavaToolkit2221.method1236((int) f_859_, (int) f, (int) f_862_, i, 1, (int) f_861_);
			aPureJavaToolkit2221.method1236((int) f_860_, (int) f_859_, (int) f_863_, i, 1, (int) f_862_);
			aPureJavaToolkit2221.method1236((int) f, (int) f_860_, (int) f_861_, i, 1, (int) f_863_);
		} else {
			float f_867_ = f_862_ - f_861_;
			float f_868_ = f_859_ - f;
			float f_869_ = f_863_ - f_861_;
			float f_870_ = f_860_ - f;
			float f_871_ = f_865_ - f_864_;
			float f_872_ = f_866_ - f_864_;
			float f_873_ = 0.0F;
			if (f_859_ != f) {
				f_873_ = (f_862_ - f_861_) / (f_859_ - f);
			}
			float f_874_ = 0.0F;
			if (f_860_ != f_859_) {
				f_874_ = (f_863_ - f_862_) / (f_860_ - f_859_);
			}
			float f_875_ = 0.0F;
			if (f_860_ != f) {
				f_875_ = (f_861_ - f_863_) / (f - f_860_);
			}
			float f_876_ = f_867_ * f_870_ - f_869_ * f_868_;
			if (f_876_ != 0.0F) {
				float f_877_ = (f_871_ * f_870_ - f_872_ * f_868_) / f_876_;
				float f_878_ = (f_872_ * f_867_ - f_871_ * f_869_) / f_876_;
				if (f <= f_859_ && f <= f_860_) {
					if (!(f >= (float) anInt2225)) {
						if (f_859_ > (float) anInt2225) {
							f_859_ = (float) anInt2225;
						}
						if (f_860_ > (float) anInt2225) {
							f_860_ = (float) anInt2225;
						}
						f_864_ = f_864_ - f_877_ * f_861_ + f_877_;
						if (f_859_ < f_860_) {
							f_863_ = f_861_;
							if (f < 0.0F) {
								f_863_ -= f_875_ * f;
								f_861_ -= f_873_ * f;
								f_864_ -= f_878_ * f;
								f = 0.0F;
							}
							if (f_859_ < 0.0F) {
								f_862_ -= f_874_ * f_859_;
								f_859_ = 0.0F;
							}
							if (f != f_859_ && f_875_ < f_873_ || f == f_859_ && f_875_ > f_874_) {
								f_860_ -= f_859_;
								f_859_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_859_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_863_, (int) f_861_, f_864_, f_877_);
									f_863_ += f_875_;
									f_861_ += f_873_;
									f_864_ += f_878_;
									f += (float) anInt2215;
								}
								while (--f_860_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_863_, (int) f_862_, f_864_, f_877_);
									f_863_ += f_875_;
									f_862_ += f_874_;
									f_864_ += f_878_;
									f += (float) anInt2215;
								}
							} else {
								f_860_ -= f_859_;
								f_859_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_859_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_861_, (int) f_863_, f_864_, f_877_);
									f_863_ += f_875_;
									f_861_ += f_873_;
									f_864_ += f_878_;
									f += (float) anInt2215;
								}
								while (--f_860_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_862_, (int) f_863_, f_864_, f_877_);
									f_863_ += f_875_;
									f_862_ += f_874_;
									f_864_ += f_878_;
									f += (float) anInt2215;
								}
							}
						} else {
							f_862_ = f_861_;
							if (f < 0.0F) {
								f_862_ -= f_875_ * f;
								f_861_ -= f_873_ * f;
								f_864_ -= f_878_ * f;
								f = 0.0F;
							}
							if (f_860_ < 0.0F) {
								f_863_ -= f_874_ * f_860_;
								f_860_ = 0.0F;
							}
							if (f != f_860_ && f_875_ < f_873_ || f == f_860_ && f_874_ > f_873_) {
								f_859_ -= f_860_;
								f_860_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_860_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_862_, (int) f_861_, f_864_, f_877_);
									f_862_ += f_875_;
									f_861_ += f_873_;
									f_864_ += f_878_;
									f += (float) anInt2215;
								}
								while (--f_859_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_863_, (int) f_861_, f_864_, f_877_);
									f_863_ += f_874_;
									f_861_ += f_873_;
									f_864_ += f_878_;
									f += (float) anInt2215;
								}
							} else {
								f_859_ -= f_860_;
								f_860_ -= f;
								f = (float) anIntArray2224[(int) f];
								while (--f_860_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_861_, (int) f_862_, f_864_, f_877_);
									f_862_ += f_875_;
									f_861_ += f_873_;
									f_864_ += f_878_;
									f += (float) anInt2215;
								}
								while (--f_859_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f, i, 0, (int) f_861_, (int) f_863_, f_864_, f_877_);
									f_863_ += f_874_;
									f_861_ += f_873_;
									f_864_ += f_878_;
									f += (float) anInt2215;
								}
							}
						}
					}
				} else if (f_859_ <= f_860_) {
					if (!(f_859_ >= (float) anInt2225)) {
						if (f_860_ > (float) anInt2225) {
							f_860_ = (float) anInt2225;
						}
						if (f > (float) anInt2225) {
							f = (float) anInt2225;
						}
						f_865_ = f_865_ - f_877_ * f_862_ + f_877_;
						if (f_860_ < f) {
							f_861_ = f_862_;
							if (f_859_ < 0.0F) {
								f_861_ -= f_873_ * f_859_;
								f_862_ -= f_874_ * f_859_;
								f_865_ -= f_878_ * f_859_;
								f_859_ = 0.0F;
							}
							if (f_860_ < 0.0F) {
								f_863_ -= f_875_ * f_860_;
								f_860_ = 0.0F;
							}
							if (f_859_ != f_860_ && f_873_ < f_874_ || f_859_ == f_860_ && f_873_ > f_875_) {
								f -= f_860_;
								f_860_ -= f_859_;
								f_859_ = (float) anIntArray2224[(int) f_859_];
								while (--f_860_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f_859_, i, 0, (int) f_861_, (int) f_862_, f_865_, f_877_);
									f_861_ += f_873_;
									f_862_ += f_874_;
									f_865_ += f_878_;
									f_859_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f_859_, i, 0, (int) f_861_, (int) f_863_, f_865_, f_877_);
									f_861_ += f_873_;
									f_863_ += f_875_;
									f_865_ += f_878_;
									f_859_ += (float) anInt2215;
								}
							} else {
								f -= f_860_;
								f_860_ -= f_859_;
								f_859_ = (float) anIntArray2224[(int) f_859_];
								while (--f_860_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f_859_, i, 0, (int) f_862_, (int) f_861_, f_865_, f_877_);
									f_861_ += f_873_;
									f_862_ += f_874_;
									f_865_ += f_878_;
									f_859_ += (float) anInt2215;
								}
								while (--f >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f_859_, i, 0, (int) f_863_, (int) f_861_, f_865_, f_877_);
									f_861_ += f_873_;
									f_863_ += f_875_;
									f_865_ += f_878_;
									f_859_ += (float) anInt2215;
								}
							}
						} else {
							f_863_ = f_862_;
							if (f_859_ < 0.0F) {
								f_863_ -= f_873_ * f_859_;
								f_862_ -= f_874_ * f_859_;
								f_865_ -= f_878_ * f_859_;
								f_859_ = 0.0F;
							}
							if (f < 0.0F) {
								f_861_ -= f_875_ * f;
								f = 0.0F;
							}
							if (f_873_ < f_874_) {
								f_860_ -= f;
								f -= f_859_;
								f_859_ = (float) anIntArray2224[(int) f_859_];
								while (--f >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f_859_, i, 0, (int) f_863_, (int) f_862_, f_865_, f_877_);
									f_863_ += f_873_;
									f_862_ += f_874_;
									f_865_ += f_878_;
									f_859_ += (float) anInt2215;
								}
								while (--f_860_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f_859_, i, 0, (int) f_861_, (int) f_862_, f_865_, f_877_);
									f_861_ += f_875_;
									f_862_ += f_874_;
									f_865_ += f_878_;
									f_859_ += (float) anInt2215;
								}
							} else {
								f_860_ -= f;
								f -= f_859_;
								f_859_ = (float) anIntArray2224[(int) f_859_];
								while (--f >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f_859_, i, 0, (int) f_862_, (int) f_863_, f_865_, f_877_);
									f_863_ += f_873_;
									f_862_ += f_874_;
									f_865_ += f_878_;
									f_859_ += (float) anInt2215;
								}
								while (--f_860_ >= 0.0F) {
									method1868(anIntArray2218, aFloatArray2214, (int) f_859_, i, 0, (int) f_862_, (int) f_861_, f_865_, f_877_);
									f_861_ += f_875_;
									f_862_ += f_874_;
									f_865_ += f_878_;
									f_859_ += (float) anInt2215;
								}
							}
						}
					}
				} else if (!(f_860_ >= (float) anInt2225)) {
					if (f > (float) anInt2225) {
						f = (float) anInt2225;
					}
					if (f_859_ > (float) anInt2225) {
						f_859_ = (float) anInt2225;
					}
					f_866_ = f_866_ - f_877_ * f_863_ + f_877_;
					if (f < f_859_) {
						f_862_ = f_863_;
						if (f_860_ < 0.0F) {
							f_862_ -= f_874_ * f_860_;
							f_863_ -= f_875_ * f_860_;
							f_866_ -= f_878_ * f_860_;
							f_860_ = 0.0F;
						}
						if (f < 0.0F) {
							f_861_ -= f_873_ * f;
							f = 0.0F;
						}
						if (f_874_ < f_875_) {
							f_859_ -= f;
							f -= f_860_;
							f_860_ = (float) anIntArray2224[(int) f_860_];
							while (--f >= 0.0F) {
								method1868(anIntArray2218, aFloatArray2214, (int) f_860_, i, 0, (int) f_862_, (int) f_863_, f_866_, f_877_);
								f_862_ += f_874_;
								f_863_ += f_875_;
								f_866_ += f_878_;
								f_860_ += (float) anInt2215;
							}
							while (--f_859_ >= 0.0F) {
								method1868(anIntArray2218, aFloatArray2214, (int) f_860_, i, 0, (int) f_862_, (int) f_861_, f_866_, f_877_);
								f_862_ += f_874_;
								f_861_ += f_873_;
								f_866_ += f_878_;
								f_860_ += (float) anInt2215;
							}
						} else {
							f_859_ -= f;
							f -= f_860_;
							f_860_ = (float) anIntArray2224[(int) f_860_];
							while (--f >= 0.0F) {
								method1868(anIntArray2218, aFloatArray2214, (int) f_860_, i, 0, (int) f_863_, (int) f_862_, f_866_, f_877_);
								f_862_ += f_874_;
								f_863_ += f_875_;
								f_866_ += f_878_;
								f_860_ += (float) anInt2215;
							}
							while (--f_859_ >= 0.0F) {
								method1868(anIntArray2218, aFloatArray2214, (int) f_860_, i, 0, (int) f_861_, (int) f_862_, f_866_, f_877_);
								f_862_ += f_874_;
								f_861_ += f_873_;
								f_866_ += f_878_;
								f_860_ += (float) anInt2215;
							}
						}
					} else {
						f_861_ = f_863_;
						if (f_860_ < 0.0F) {
							f_861_ -= f_874_ * f_860_;
							f_863_ -= f_875_ * f_860_;
							f_866_ -= f_878_ * f_860_;
							f_860_ = 0.0F;
						}
						if (f_859_ < 0.0F) {
							f_862_ -= f_873_ * f_859_;
							f_859_ = 0.0F;
						}
						if (f_874_ < f_875_) {
							f -= f_859_;
							f_859_ -= f_860_;
							f_860_ = (float) anIntArray2224[(int) f_860_];
							while (--f_859_ >= 0.0F) {
								method1868(anIntArray2218, aFloatArray2214, (int) f_860_, i, 0, (int) f_861_, (int) f_863_, f_866_, f_877_);
								f_861_ += f_874_;
								f_863_ += f_875_;
								f_866_ += f_878_;
								f_860_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1868(anIntArray2218, aFloatArray2214, (int) f_860_, i, 0, (int) f_862_, (int) f_863_, f_866_, f_877_);
								f_862_ += f_873_;
								f_863_ += f_875_;
								f_866_ += f_878_;
								f_860_ += (float) anInt2215;
							}
						} else {
							f -= f_859_;
							f_859_ -= f_860_;
							f_860_ = (float) anIntArray2224[(int) f_860_];
							while (--f_859_ >= 0.0F) {
								method1868(anIntArray2218, aFloatArray2214, (int) f_860_, i, 0, (int) f_863_, (int) f_861_, f_866_, f_877_);
								f_861_ += f_874_;
								f_863_ += f_875_;
								f_866_ += f_878_;
								f_860_ += (float) anInt2215;
							}
							while (--f >= 0.0F) {
								method1868(anIntArray2218, aFloatArray2214, (int) f_860_, i, 0, (int) f_863_, (int) f_862_, f_866_, f_877_);
								f_862_ += f_873_;
								f_863_ += f_875_;
								f_866_ += f_878_;
								f_860_ += (float) anInt2215;
							}
						}
					}
				}
			}
		}
	}
	
	private final void method1868(int[] is, float[] fs, int i, int i_879_, int i_880_, int i_881_, int i_882_, float f, float f_883_) {
		if (aBoolean2217) {
			if (i_882_ > anInt2222) {
				i_882_ = anInt2222;
			}
			if (i_881_ < 0) {
				i_881_ = 0;
			}
		}
		if (i_881_ < i_882_) {
			i += i_881_ - 1;
			i_880_ = i_882_ - i_881_ >> 2;
			f += f_883_ * (float) i_881_;
			if (aClass374_2219.aBoolean4615) {
				if (anInt2220 == 0) {
					while (--i_880_ >= 0) {
						if (f < fs[++i]) {
							is[i] = i_879_;
							fs[i] = f;
						}
						f += f_883_;
						if (f < fs[++i]) {
							is[i] = i_879_;
							fs[i] = f;
						}
						f += f_883_;
						if (f < fs[++i]) {
							is[i] = i_879_;
							fs[i] = f;
						}
						f += f_883_;
						if (f < fs[++i]) {
							is[i] = i_879_;
							fs[i] = f;
						}
						f += f_883_;
					}
					i_880_ = i_882_ - i_881_ & 0x3;
					while (--i_880_ >= 0) {
						if (f < fs[++i]) {
							is[i] = i_879_;
							fs[i] = f;
						}
						f += f_883_;
					}
				} else if (anInt2220 == 254) {
					if (i_881_ != 0 && i_882_ <= anInt2222 - 1) {
						while (--i_880_ >= 0) {
							if (f < fs[++i]) {
								is[i - 1] = is[i];
							}
							f += f_883_;
							if (f < fs[++i]) {
								is[i - 1] = is[i];
							}
							f += f_883_;
							if (f < fs[++i]) {
								is[i - 1] = is[i];
							}
							f += f_883_;
							if (f < fs[++i]) {
								is[i - 1] = is[i];
							}
							f += f_883_;
						}
						i_880_ = i_882_ - i_881_ & 0x3;
						while (--i_880_ >= 0) {
							if (f < fs[++i]) {
								is[i - 1] = is[i];
							}
							f += f_883_;
						}
					}
				} else {
					int i_884_ = anInt2220;
					int i_885_ = 256 - anInt2220;
					i_879_ = ((i_879_ & 0xff00ff) * i_885_ >> 8 & 0xff00ff) + ((i_879_ & 0xff00) * i_885_ >> 8 & 0xff00);
					while (--i_880_ >= 0) {
						if (f < fs[++i]) {
							int i_886_ = is[i];
							is[i] = i_879_ + ((i_886_ & 0xff00ff) * i_884_ >> 8 & 0xff00ff) + ((i_886_ & 0xff00) * i_884_ >> 8 & 0xff00);
							fs[i] = f;
						}
						f += f_883_;
						if (f < fs[++i]) {
							int i_887_ = is[i];
							is[i] = i_879_ + ((i_887_ & 0xff00ff) * i_884_ >> 8 & 0xff00ff) + ((i_887_ & 0xff00) * i_884_ >> 8 & 0xff00);
							fs[i] = f;
						}
						f += f_883_;
						if (f < fs[++i]) {
							int i_888_ = is[i];
							is[i] = i_879_ + ((i_888_ & 0xff00ff) * i_884_ >> 8 & 0xff00ff) + ((i_888_ & 0xff00) * i_884_ >> 8 & 0xff00);
							fs[i] = f;
						}
						f += f_883_;
						if (f < fs[++i]) {
							int i_889_ = is[i];
							is[i] = i_879_ + ((i_889_ & 0xff00ff) * i_884_ >> 8 & 0xff00ff) + ((i_889_ & 0xff00) * i_884_ >> 8 & 0xff00);
							fs[i] = f;
						}
						f += f_883_;
					}
					i_880_ = i_882_ - i_881_ & 0x3;
					while (--i_880_ >= 0) {
						if (f < fs[++i]) {
							int i_890_ = is[i];
							is[i] = i_879_ + ((i_890_ & 0xff00ff) * i_884_ >> 8 & 0xff00ff) + ((i_890_ & 0xff00) * i_884_ >> 8 & 0xff00);
							fs[i] = f;
						}
						f += f_883_;
					}
				}
			} else if (anInt2220 == 0) {
				while (--i_880_ >= 0) {
					if (f < fs[++i]) {
						is[i] = i_879_;
					}
					f += f_883_;
					if (f < fs[++i]) {
						is[i] = i_879_;
					}
					f += f_883_;
					if (f < fs[++i]) {
						is[i] = i_879_;
					}
					f += f_883_;
					if (f < fs[++i]) {
						is[i] = i_879_;
					}
					f += f_883_;
				}
				i_880_ = i_882_ - i_881_ & 0x3;
				while (--i_880_ >= 0) {
					if (f < fs[++i]) {
						is[i] = i_879_;
					}
					f += f_883_;
				}
			} else if (anInt2220 == 254) {
				if (i_881_ != 0 && i_882_ <= anInt2222 - 1) {
					while (--i_880_ >= 0) {
						if (f < fs[++i]) {
							is[i - 1] = is[i];
						}
						f += f_883_;
						if (f < fs[++i]) {
							is[i - 1] = is[i];
						}
						f += f_883_;
						if (f < fs[++i]) {
							is[i - 1] = is[i];
						}
						f += f_883_;
						if (f < fs[++i]) {
							is[i - 1] = is[i];
						}
						f += f_883_;
					}
					i_880_ = i_882_ - i_881_ & 0x3;
					while (--i_880_ >= 0) {
						if (f < fs[++i]) {
							is[i - 1] = is[i];
						}
						f += f_883_;
					}
				}
			} else {
				int i_891_ = anInt2220;
				int i_892_ = 256 - anInt2220;
				i_879_ = ((i_879_ & 0xff00ff) * i_892_ >> 8 & 0xff00ff) + ((i_879_ & 0xff00) * i_892_ >> 8 & 0xff00);
				while (--i_880_ >= 0) {
					if (f < fs[++i]) {
						int i_893_ = is[i];
						is[i] = i_879_ + ((i_893_ & 0xff00ff) * i_891_ >> 8 & 0xff00ff) + ((i_893_ & 0xff00) * i_891_ >> 8 & 0xff00);
					}
					f += f_883_;
					if (f < fs[++i]) {
						int i_894_ = is[i];
						is[i] = i_879_ + ((i_894_ & 0xff00ff) * i_891_ >> 8 & 0xff00ff) + ((i_894_ & 0xff00) * i_891_ >> 8 & 0xff00);
					}
					f += f_883_;
					if (f < fs[++i]) {
						int i_895_ = is[i];
						is[i] = i_879_ + ((i_895_ & 0xff00ff) * i_891_ >> 8 & 0xff00ff) + ((i_895_ & 0xff00) * i_891_ >> 8 & 0xff00);
					}
					f += f_883_;
					if (f < fs[++i]) {
						int i_896_ = is[i];
						is[i] = i_879_ + ((i_896_ & 0xff00ff) * i_891_ >> 8 & 0xff00ff) + ((i_896_ & 0xff00) * i_891_ >> 8 & 0xff00);
					}
					f += f_883_;
				}
				i_880_ = i_882_ - i_881_ & 0x3;
				while (--i_880_ >= 0) {
					if (f < fs[++i]) {
						int i_897_ = is[i];
						is[i] = i_879_ + ((i_897_ & 0xff00ff) * i_891_ >> 8 & 0xff00ff) + ((i_897_ & 0xff00) * i_891_ >> 8 & 0xff00);
					}
					f += f_883_;
				}
			}
		}
	}
	
	final int method1869() {
		return anIntArray2224[0] % anInt2215;
	}
	
	Class185(PureJavaToolkit purejavatoolkit, Class374 class374) {
		anInt2220 = 0;
		anIntArray2224 = new int[4096];
		aBoolean2227 = false;
		anInt2228 = 0;
		anInt2237 = 0;
		anInt2233 = 0;
		anInt2232 = 0;
		anInt2229 = 0;
		anIntArray2236 = null;
		aFloat2238 = 0.0F;
		aBoolean2239 = true;
		anInt2234 = -1;
		anIntArray2240 = null;
		aFloat2242 = 0.0F;
		aFloat2241 = 0.0F;
		anIntArray2231 = null;
		anInt2243 = 0;
		anInt2244 = -1;
		anInt2245 = -1;
		anInt2235 = 0;
		aPureJavaToolkit2221 = purejavatoolkit;
		aClass374_2219 = class374;
		anInt2215 = aPureJavaToolkit2221.anInt6789;
		anIntArray2218 = aPureJavaToolkit2221.anIntArray6787;
		aFloatArray2214 = aPureJavaToolkit2221.aFloatArray6782;
	}
}
