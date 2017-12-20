/* Class262_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub11 extends Class262
{
	static int anInt7777;
	private int anInt7778;
	static Class271 aClass271_7779 = new Class271();
	static int anInt7780;
	static int anInt7781;
	static int anInt7782;
	static int anInt7783;
	private int anInt7784;
	
	public static void method3174(int i) {
		if (i != 1570229672) {
			method3176(63);
		}
		aClass271_7779 = null;
	}
	
	static final void method3175(int i, int i_0_) {
		@SuppressWarnings("unused")
		int i_1_ = -59 / ((i_0_ - -62) / 52);
		if (Class188_Sub1_Sub2.anIntArray9345 == null || Class188_Sub1_Sub2.anIntArray9345.length < i) {
			Class188_Sub1_Sub2.anIntArray9345 = new int[i];
		}
		anInt7782++;
	}
	
	Class262_Sub11(BufferedStream buffer) {
		super(buffer);
		anInt7784 = buffer.readUnsignedShort();
		anInt7778 = buffer.readUnsignedShort();
	}
	
	static final void method3176(int i) {
		anInt7781++;
		if (Class170.anIntArray2054 == null) {
			Class170.anIntArray2054 = new int[65536];
			double d = 0.7 + (-0.015 + 0.03 * Math.random());
			int i_2_ = 0;
			int i_3_ = 0;
			if (i != 1) {
				method3174(-40);
			}
			for (/**/; (i_3_ ^ 0xffffffff) > -513; i_3_++) {
				float f = ((float) (i_3_ >> 3) / 64.0F + 0.0078125F) * 360.0F;
				float f_4_ = 0.0625F + (float) (0x7 & i_3_) / 8.0F;
				for (int i_5_ = 0; i_5_ < 128; i_5_++) {
					float f_6_ = (float) i_5_ / 128.0F;
					float f_7_ = 0.0F;
					float f_8_ = 0.0F;
					float f_9_ = 0.0F;
					float f_10_ = f / 60.0F;
					int i_11_ = (int) f_10_;
					int i_12_ = i_11_ % 6;
					float f_13_ = f_10_ - (float) i_11_;
					float f_14_ = f_6_ * (-f_4_ + 1.0F);
					float f_15_ = f_6_ * (-(f_13_ * f_4_) + 1.0F);
					float f_16_ = (1.0F - f_4_ * (-f_13_ + 1.0F)) * f_6_;
					if (i_12_ != 0) {
						if (i_12_ == 1) {
							f_9_ = f_14_;
							f_7_ = f_15_;
							f_8_ = f_6_;
						} else if ((i_12_ ^ 0xffffffff) != -3) {
							if ((i_12_ ^ 0xffffffff) != -4) {
								if ((i_12_ ^ 0xffffffff) != -5) {
									if (i_12_ == 5) {
										f_8_ = f_14_;
										f_9_ = f_15_;
										f_7_ = f_6_;
									}
								} else {
									f_9_ = f_6_;
									f_7_ = f_16_;
									f_8_ = f_14_;
								}
							} else {
								f_8_ = f_15_;
								f_7_ = f_14_;
								f_9_ = f_6_;
							}
						} else {
							f_7_ = f_14_;
							f_8_ = f_6_;
							f_9_ = f_16_;
						}
					} else {
						f_7_ = f_6_;
						f_9_ = f_14_;
						f_8_ = f_16_;
					}
					f_7_ = (float) Math.pow((double) f_7_, d);
					f_8_ = (float) Math.pow((double) f_8_, d);
					f_9_ = (float) Math.pow((double) f_9_, d);
					int i_17_ = (int) (f_7_ * 256.0F);
					int i_18_ = (int) (f_8_ * 256.0F);
					int i_19_ = (int) (f_9_ * 256.0F);
					int i_20_ = (i_18_ << 8) + -16777216 + ((i_17_ << 16) - -i_19_);
					Class170.anIntArray2054[i_2_++] = i_20_;
				}
			}
		}
	}
	
	final void method3148(int i) {
		anInt7780++;
		if (i >= -102) {
			method3179(69L, (byte) -92);
		}
		Class121.aClass206Array1529[anInt7784].method2037(-122).method849(anInt7778, -56, true);
	}
	
	static long method3177(long l, long l_21_) {
		return l ^ l_21_;
	}
	
	static final void method3178(int i, int i_22_, Class48 class48) {
		anInt7783++;
		if (Class23.anInt434 < 50 && (class48 != null && class48.anIntArrayArray700 != null && (class48.anIntArrayArray700.length ^ 0xffffffff) < (i ^ 0xffffffff) && class48.anIntArrayArray700[i] != null)) {
			int i_23_ = class48.anIntArrayArray700[i][0];
			int i_24_ = i_23_ >> 8;
			if (class48.anIntArrayArray700[i].length > 1) {
				int i_25_ = (int) (Math.random() * (double) class48.anIntArrayArray700[i].length);
				if ((i_25_ ^ 0xffffffff) < -1) {
					i_24_ = class48.anIntArrayArray700[i][i_25_];
				}
			}
			int i_26_ = i_23_ >> 5 & 0x7;
			int i_27_ = 256;
			if (i_22_ != -16777216) {
				aClass271_7779 = null;
			}
			if (class48.anIntArray690 != null && class48.anIntArray692 != null) {
				i_27_ = Class89.method1019(class48.anIntArray690[i], i_22_ + 16804033, class48.anIntArray692[i]);
			}
			if (!class48.aBoolean699) {
				Class91.method1033(i_27_, 0, i_24_, i_26_, 255, 0);
			} else {
				Class105.method1116(i_24_, i_26_, i_27_, (byte) 57, 0, 255, false);
			}
		}
	}
	
	static final void method3179(long l, byte b) {
		if (b > 106) {
			anInt7777++;
			try {
				Thread.sleep(l);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		}
	}
}
