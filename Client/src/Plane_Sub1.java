/* Plane_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Plane_Sub1 extends Plane
{
	private byte[][] aByteArrayArray7958;
	private float aFloat7959;
	private float aFloat7960;
	private float aFloat7961;
	private float aFloat7962;
	private int anInt7963 = -1;
	private float aFloat7964;
	private Class100[][] aClass100ArrayArray7965;
	private float aFloat7966;
	private byte[][] aByteArrayArray7967;
	private Class276[][] aClass276ArrayArray7968;
	private int anInt7969;
	private PureJavaToolkit aPureJavaToolkit7970;
	private float aFloat7971;
	private Class358[][] aClass358ArrayArray7972;
	private float aFloat7973;
	private float aFloat7974;
	private float aFloat7975;
	private float aFloat7976;
	private Class292[][] aClass292ArrayArray7977;
	private Class81[][] aClass81ArrayArray7978;
	private float aFloat7979;
	
	final void method3252(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool, int i_2_) {
		Class336_Sub2 class336_sub2 = aPureJavaToolkit7970.aClass336_Sub2_6788;
		anInt7963 = -1;
		aFloat7974 = class336_sub2.aFloat8580;
		aFloat7966 = class336_sub2.aFloat8571;
		aFloat7959 = class336_sub2.aFloat8566;
		aFloat7975 = class336_sub2.aFloat8583;
		aFloat7971 = class336_sub2.aFloat8578;
		aFloat7960 = class336_sub2.aFloat8561;
		aFloat7964 = class336_sub2.aFloat8558;
		aFloat7973 = class336_sub2.aFloat8579;
		aFloat7961 = class336_sub2.aFloat8577;
		aFloat7976 = class336_sub2.aFloat8567;
		aFloat7962 = class336_sub2.aFloat8584;
		aFloat7979 = class336_sub2.aFloat8589;
		for (int i_3_ = 0; i_3_ < i_1_ + i_1_; i_3_++) {
			for (int i_4_ = 0; i_4_ < i_1_ + i_1_; i_4_++) {
				if (bools[i_3_][i_4_]) {
					int i_5_ = i - i_1_ + i_3_;
					int i_6_ = i_0_ - i_1_ + i_4_;
					if (i_5_ >= 0 && i_5_ < anInt3408 && i_6_ >= 0 && i_6_ < anInt3404) {
						method3272(i_5_, i_6_, i_2_);
					}
				}
			}
		}
	}
	
	final void method3250(Node_Sub29 node_sub29, int[] is) {
		/* empty */
	}
	
	final boolean method3256(r var_r, int i, int i_7_, int i_8_, int i_9_, boolean bool) {
		return false;
	}
	
	final void CA(r var_r, int i, int i_10_, int i_11_, int i_12_, boolean bool) {
		/* empty */
	}
	
	private final void method3265(int i, int i_13_, boolean bool, Class374 class374, Class185 class185, int[] is, int[] is_14_, int[] is_15_, int[] is_16_, int i_17_) {
		Class292 class292 = aClass292ArrayArray7977[i][i_13_];
		if (i_17_ == 0 || (i_17_ & 0x2) == 0) {
			if (class292 != null) {
				if (anInt7963 == -1) {
					for (int i_18_ = 0; i_18_ < class292.aShort3678; i_18_++) {
						int i_19_ = class292.aShortArray3675[i_18_] + (i << anInt3410);
						int i_20_ = class292.aShortArray3676[i_18_];
						int i_21_ = class292.aShortArray3669[i_18_] + (i_13_ << anInt3410);
						float f = aFloat7979 + (aFloat7961 * (float) i_19_ + aFloat7976 * (float) i_20_ + aFloat7962 * (float) i_21_);
						if (f <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						is_16_[i_18_] = 0;
						if (bool) {
							int i_22_ = (int) (f - (float) class374.anInt4618);
							if (i_22_ > 255) {
								i_22_ = 255;
							}
							if (i_22_ > 0) {
								is_16_[i_18_] = i_22_;
								int i_23_ = class292.aShortArray3671[i_18_] * i_22_ / 255;
								if (i_23_ > 0) {
									i_20_ -= i_23_;
								}
							}
						} else if (class374.aBoolean4621) {
							int i_24_ = (int) (f - (float) class374.anInt4618);
							if (i_24_ > 0) {
								is_16_[i_18_] = i_24_;
								if (is_16_[i_18_] > 255) {
									is_16_[i_18_] = 255;
								}
							}
						}
						float f_25_ = aFloat7975 + (aFloat7974 * (float) i_19_ + aFloat7966 * (float) i_20_ + aFloat7959 * (float) i_21_);
						float f_26_ = aFloat7973 + (aFloat7971 * (float) i_19_ + aFloat7960 * (float) i_20_ + aFloat7964 * (float) i_21_);
						is[i_18_] = class185.anInt2216 + (int) (f_25_ * (float) aPureJavaToolkit7970.anInt6785 / f);
						is_14_[i_18_] = class185.anInt2213 + (int) (f_26_ * (float) aPureJavaToolkit7970.anInt6763 / f);
						is_15_[i_18_] = (int) f;
					}
				} else {
					for (int i_27_ = 0; i_27_ < class292.aShort3678; i_27_++) {
						int i_28_ = class292.aShortArray3675[i_27_] + (i << anInt3410);
						int i_29_ = class292.aShortArray3676[i_27_];
						int i_30_ = class292.aShortArray3669[i_27_] + (i_13_ << anInt3410);
						float f = aFloat7979 + (aFloat7961 * (float) i_28_ + aFloat7976 * (float) i_29_ + aFloat7962 * (float) i_30_);
						is_16_[i_27_] = 0;
						if (bool) {
							int i_31_ = anInt7963 - class374.anInt4618;
							if (i_31_ > 255) {
								i_31_ = 255;
							}
							if (i_31_ > 0) {
								is_16_[i_27_] = i_31_;
								int i_32_ = class292.aShortArray3671[i_27_] * i_31_ / 255;
								if (i_32_ > 0) {
									i_29_ -= i_32_;
								}
							}
						} else if (class374.aBoolean4621) {
							int i_33_ = anInt7963 - class374.anInt4618;
							if (i_33_ > 0) {
								is_16_[i_27_] = i_33_;
								if (is_16_[i_27_] > 255) {
									is_16_[i_27_] = 255;
								}
							}
						}
						float f_34_ = aFloat7975 + (aFloat7974 * (float) i_28_ + aFloat7966 * (float) i_29_ + aFloat7959 * (float) i_30_);
						float f_35_ = aFloat7973 + (aFloat7971 * (float) i_28_ + aFloat7960 * (float) i_29_ + aFloat7964 * (float) i_30_);
						is[i_27_] = class185.anInt2216 + (int) (f_34_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						is_14_[i_27_] = class185.anInt2213 + (int) (f_35_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						is_15_[i_27_] = (int) f;
					}
				}
				float f = (float) anInt3398;
				for (int i_36_ = 0; i_36_ < class292.aShort3670; i_36_++) {
					int i_37_ = i_36_ * 3;
					int i_38_ = i_37_ + 1;
					int i_39_ = i_38_ + 1;
					int i_40_ = is[i_37_];
					int i_41_ = is[i_38_];
					int i_42_ = is[i_39_];
					int i_43_ = is_14_[i_37_];
					int i_44_ = is_14_[i_38_];
					int i_45_ = is_14_[i_39_];
					if ((i_40_ - i_41_) * (i_45_ - i_44_) - (i_43_ - i_44_) * (i_42_ - i_41_) > 0) {
						class185.aBoolean2217 = i_40_ < 0 || i_41_ < 0 || i_42_ < 0 || i_40_ > class185.anInt2222 || i_41_ > class185.anInt2222 || i_42_ > class185.anInt2222;
						if (is_16_[i_37_] + is_16_[i_38_] + is_16_[i_39_] < 765) {
							int i_46_ = i << anInt3410;
							int i_47_ = i_13_ << anInt3410;
							if ((class292.anIntArray3674[i_37_] & 0xffffff) != 0) {
								if (class292.aShortArray3673[i_37_] == class292.aShortArray3673[i_38_] && class292.aShortArray3673[i_37_] == class292.aShortArray3673[i_39_] && class292.aShortArray3679[i_37_] == class292.aShortArray3679[i_38_] && class292.aShortArray3679[i_37_] == class292.aShortArray3679[i_39_]) {
									class185.method1859((float) i_43_, (float) i_44_, (float) i_45_, (float) i_40_, (float) i_41_, (float) i_42_, (float) is_15_[i_37_], (float) is_15_[i_38_], (float) is_15_[i_39_], (float) (i_46_ + class292.aShortArray3675[i_37_]) / (float) class292.aShortArray3679[i_37_], (float) (i_46_ + class292.aShortArray3675[i_38_]) / (float) class292.aShortArray3679[i_38_], (float) (i_46_ + class292.aShortArray3675[i_39_]) / (float) class292.aShortArray3679[i_39_], (float) (i_47_ + class292.aShortArray3669[i_37_]) / (float) class292.aShortArray3679[i_37_], (float) (i_47_ + class292.aShortArray3669[i_38_]) / (float) class292.aShortArray3679[i_38_], (float) (i_47_ + class292.aShortArray3669[i_39_]) / (float) class292.aShortArray3679[i_39_], class292.anIntArray3674[i_37_], class292.anIntArray3674[i_38_], class292.anIntArray3674[i_39_], class374.anInt4611, is_16_[i_37_], is_16_[i_38_], is_16_[i_39_], class292.aShortArray3673[i_37_]);
								} else {
									class185.method1864((float) i_43_, (float) i_44_, (float) i_45_, (float) i_40_, (float) i_41_, (float) i_42_, (float) is_15_[i_37_], (float) is_15_[i_38_], (float) is_15_[i_39_], (float) (i_46_ + class292.aShortArray3675[i_37_]) / f, (float) (i_46_ + class292.aShortArray3675[i_38_]) / f, (float) (i_46_ + class292.aShortArray3675[i_39_]) / f, (float) (i_47_ + class292.aShortArray3669[i_37_]) / f, (float) (i_47_ + class292.aShortArray3669[i_38_]) / f, (float) (i_47_ + class292.aShortArray3669[i_39_]) / f, class292.anIntArray3674[i_37_], class292.anIntArray3674[i_38_], class292.anIntArray3674[i_39_], class374.anInt4611, is_16_[i_37_], is_16_[i_38_], is_16_[i_39_], class292.aShortArray3673[i_37_], f / (float) class292.aShortArray3679[i_37_], class292.aShortArray3673[i_38_], f / (float) class292.aShortArray3679[i_38_], class292.aShortArray3673[i_39_], f / (float) class292.aShortArray3679[i_39_]);
								}
							}
						} else {
							class185.method1867((float) i_43_, (float) i_44_, (float) i_45_, (float) i_40_, (float) i_41_, (float) i_42_, (float) is_15_[i_37_], (float) is_15_[i_38_], (float) is_15_[i_39_], class374.anInt4611);
						}
					}
				}
			}
		}
	}
	
	final void method3257(int i, int i_48_) {
		method3272(i, i_48_, 0);
	}
	
	final void YA() {
		aByteArrayArray7967 = null;
		aByteArrayArray7958 = null;
	}
	
	Plane_Sub1(PureJavaToolkit purejavatoolkit, int i, int i_49_, int i_50_, int i_51_, int[][] is, int[][] is_52_, int i_53_) {
		super(i_50_, i_51_, i_53_, is);
		aPureJavaToolkit7970 = purejavatoolkit;
		anInt7969 = i_49_;
		aByteArrayArray7967 = new byte[i_50_ + 1][i_51_ + 1];
		int i_54_ = aPureJavaToolkit7970.anInt6780 >> 9;
		for (int i_55_ = 1; i_55_ < i_51_; i_55_++) {
			for (int i_56_ = 1; i_56_ < i_50_; i_56_++) {
				int i_57_ = i_54_;
				int i_58_ = is_52_[i_56_ + 1][i_55_] - is_52_[i_56_ - 1][i_55_];
				int i_59_ = is_52_[i_56_][i_55_ + 1] - is_52_[i_56_][i_55_ - 1];
				int i_60_ = (int) Math.sqrt((double) (i_58_ * i_58_ + 512 * i_53_ + i_59_ * i_59_));
				int i_61_ = (i_58_ << 8) / i_60_;
				int i_62_ = -512 * i_53_ / i_60_;
				int i_63_ = (i_59_ << 8) / i_60_;
				i_57_ += aPureJavaToolkit7970.anInt6764 * i_61_ + aPureJavaToolkit7970.anInt6784 * i_62_ + aPureJavaToolkit7970.anInt6774 * i_63_ >> 17;
				i_57_ >>= 1;
				if (i_57_ < 2) {
					i_57_ = 2;
				} else if (i_57_ > 126) {
					i_57_ = 126;
				}
				aByteArrayArray7967[i_56_][i_55_] = (byte) i_57_;
			}
		}
		aByteArrayArray7958 = new byte[i_50_ + 1][i_51_ + 1];
	}
	
	final void U(int i, int i_64_, int[] is, int[] is_65_, int[] is_66_, int[] is_67_, int[] is_68_, int[] is_69_, int[] is_70_, int[] is_71_, int i_72_, int i_73_, int i_74_, boolean bool) {
		boolean bool_75_ = (anInt7969 & 0x20) == 0;
		if (aClass276ArrayArray7968 == null && !bool_75_) {
			aClass276ArrayArray7968 = new Class276[anInt3408][anInt3404];
			aClass358ArrayArray7972 = new Class358[anInt3408][anInt3404];
		} else if (aClass292ArrayArray7977 == null && bool_75_) {
			aClass292ArrayArray7977 = new Class292[anInt3408][anInt3404];
		} else if (aClass100ArrayArray7965 != null) {
			throw new IllegalStateException();
		}
		if (is != null && is.length != 0) {
			for (int i_76_ = 0; i_76_ < is_68_.length; i_76_++) {
				if (is_68_[i_76_] == -1) {
					is_68_[i_76_] = 0;
				} else {
					is_68_[i_76_] = Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, is_68_[i_76_]) & 0xffff] << 8 | 0xff;
				}
			}
			if (is_69_ != null) {
				for (int i_77_ = 0; i_77_ < is_69_.length; i_77_++) {
					if (is_69_[i_77_] == -1) {
						is_69_[i_77_] = 0;
					} else {
						is_69_[i_77_] = Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, is_69_[i_77_]) & 0xffff] << 8 | 0xff;
					}
				}
			}
			if (bool_75_) {
				Class292 class292 = new Class292();
				class292.aShort3678 = (short) is.length;
				class292.aShort3670 = (short) (is.length / 3);
				class292.aShortArray3675 = new short[class292.aShort3678];
				class292.aShortArray3676 = new short[class292.aShort3678];
				class292.aShortArray3669 = new short[class292.aShort3678];
				class292.anIntArray3674 = new int[class292.aShort3678];
				class292.aShortArray3673 = new short[class292.aShort3678];
				class292.aShortArray3679 = new short[class292.aShort3678];
				class292.aByteArray3672 = new byte[class292.aShort3678];
				if (is_67_ != null) {
					class292.aShortArray3671 = new short[class292.aShort3678];
				}
				for (int i_78_ = 0; i_78_ < class292.aShort3678; i_78_++) {
					int i_79_ = is[i_78_];
					int i_80_ = is_66_[i_78_];
					int i_82_;
					if (i_79_ == 0 && i_80_ == 0) {
						i_82_ = aByteArrayArray7967[i][i_64_] - aByteArrayArray7958[i][i_64_];
					} else if (i_79_ == 0 && i_80_ == anInt3398) {
						i_82_ = aByteArrayArray7967[i][i_64_ + 1] - aByteArrayArray7958[i][i_64_ + 1];
					} else if (i_79_ == anInt3398 && i_80_ == anInt3398) {
						i_82_ = aByteArrayArray7967[i + 1][i_64_ + 1] - aByteArrayArray7958[i + 1][i_64_ + 1];
					} else if (i_79_ == anInt3398 && i_80_ == 0) {
						i_82_ = aByteArrayArray7967[i + 1][i_64_] - aByteArrayArray7958[i + 1][i_64_];
					} else {
						int i_83_ = (aByteArrayArray7967[i][i_64_] - aByteArrayArray7958[i][i_64_]) * (anInt3398 - i_79_) + (aByteArrayArray7967[i + 1][i_64_] - aByteArrayArray7958[i + 1][i_64_]) * i_79_;
						int i_84_ = (aByteArrayArray7967[i][i_64_ + 1] - aByteArrayArray7958[i][i_64_ + 1]) * (anInt3398 - i_79_) + (aByteArrayArray7967[i + 1][i_64_ + 1] - aByteArrayArray7958[i + 1][i_64_ + 1]) * i_79_;
						i_82_ = i_83_ * (anInt3398 - i_80_) + i_84_ * i_80_ >> 2 * anInt3410;
					}
					int i_85_ = (i << anInt3410) + i_79_;
					int i_86_ = (i_64_ << anInt3410) + i_80_;
					class292.aShortArray3675[i_78_] = (short) i_79_;
					class292.aShortArray3669[i_78_] = (short) i_80_;
					class292.aShortArray3676[i_78_] = (short) (this.method3260(i_86_, -113, i_85_) + (is_65_ != null ? is_65_[i_78_] : 0));
					if (i_82_ < 0) {
						i_82_ = 0;
					}
					if (is_68_[i_78_] == 0) {
						class292.anIntArray3674[i_78_] = 0;
						if (is_69_ != null) {
							class292.aByteArray3672[i_78_] = (byte) i_82_;
						}
					} else {
						int i_87_ = 0;
						if (is_67_ != null) {
							int i_88_ = class292.aShortArray3671[i_78_] = (short) is_67_[i_78_];
							if (i_73_ != 0) {
								i_87_ = 255 * i_88_ / i_73_;
								if (i_87_ < 0) {
									i_87_ = 0;
								} else if (i_87_ > 255) {
									i_87_ = 255;
								}
							}
						}
						int i_89_ = -16777216;
						if (is_70_[i_78_] != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(is_70_[i_78_], -8217).aByte1214)) {
							i_89_ = -1694498816;
						}
						class292.anIntArray3674[i_78_] = i_89_ | Plane.method3249(i_72_, 100, method3271(is_68_[i_78_] >> 8, i_82_), i_87_);
						if (is_69_ != null) {
							class292.aByteArray3672[i_78_] = (byte) i_82_;
						}
					}
					class292.aShortArray3673[i_78_] = (short) is_70_[i_78_];
					class292.aShortArray3679[i_78_] = (short) is_71_[i_78_];
				}
				if (is_69_ != null) {
					class292.anIntArray3677 = new int[class292.aShort3670];
				}
				for (int i_90_ = 0; i_90_ < class292.aShort3670; i_90_++) {
					int i_91_ = i_90_ * 3;
					if (is_69_ != null && is_69_[i_91_] != 0) {
						class292.anIntArray3677[i_90_] = ~0xffffff | is_69_[i_91_] >> 8;
					}
				}
				aClass292ArrayArray7977[i][i_64_] = class292;
			} else {
				boolean bool_92_ = true;
				int i_93_ = -1;
				int i_94_ = -1;
				int i_95_ = -1;
				int i_96_ = -1;
				if (is.length == 6) {
					for (int i_97_ = 0; i_97_ < 6; i_97_++) {
						if (is[i_97_] == 0 && is_66_[i_97_] == 0) {
							if (i_93_ != -1 && is_68_[i_93_] != is_68_[i_97_]) {
								bool_92_ = false;
								break;
							}
							i_93_ = i_97_;
						} else if (is[i_97_] == anInt3398 && is_66_[i_97_] == 0) {
							if (i_94_ != -1 && is_68_[i_94_] != is_68_[i_97_]) {
								bool_92_ = false;
								break;
							}
							i_94_ = i_97_;
						} else if (is[i_97_] == anInt3398 && is_66_[i_97_] == anInt3398) {
							if (i_95_ != -1 && is_68_[i_95_] != is_68_[i_97_]) {
								bool_92_ = false;
								break;
							}
							i_95_ = i_97_;
						} else if (is[i_97_] == 0 && is_66_[i_97_] == anInt3398) {
							if (i_96_ != -1 && is_68_[i_96_] != is_68_[i_97_]) {
								bool_92_ = false;
								break;
							}
							i_96_ = i_97_;
						}
					}
					if (i_93_ == -1 || i_94_ == -1 || i_95_ == -1 || i_96_ == -1) {
						bool_92_ = false;
					}
					if (bool_92_) {
						if (is_65_ != null) {
							for (int i_98_ = 0; i_98_ < 4; i_98_++) {
								if (is_65_[i_98_] != 0) {
									bool_92_ = false;
									break;
								}
							}
						}
						if (bool_92_) {
							for (int i_99_ = 1; i_99_ < 4; i_99_++) {
								if (is[i_99_] != is[0] && is[i_99_] != is[0] + anInt3398 && is[i_99_] != is[0] - anInt3398) {
									bool_92_ = false;
									break;
								}
								if (is_66_[i_99_] != is_66_[0] && is_66_[i_99_] != is_66_[0] + anInt3398 && is_66_[i_99_] != is_66_[0] - anInt3398) {
									bool_92_ = false;
									break;
								}
							}
						}
					}
				} else {
					bool_92_ = false;
				}
				if (bool_92_) {
					Class276 class276 = new Class276();
					int i_100_ = is_68_[0];
					int i_101_ = is_70_[0];
					if (is_69_ != null) {
						class276.anInt3506 = is_69_[0] >> 8;
						if (i_100_ == 0) {
							class276.aByte3503 |= 0x2;
						}
					} else if (i_100_ == 0) {
						return;
					}
					if (anIntArrayArray3407[i][i_64_] == anIntArrayArray3407[i + 1][i_64_] && anIntArrayArray3407[i][i_64_] == anIntArrayArray3407[i + 1][i_64_ + 1] && anIntArrayArray3407[i][i_64_] == anIntArrayArray3407[i][i_64_ + 1]) {
						class276.aByte3503 |= 0x1;
					}
					if (i_101_ != -1 && (class276.aByte3503 & 0x2) == 0 && !aPureJavaToolkit7970.aD1543.method10(i_101_, -8217).aBoolean1223) {
						int i_102_;
						if (is_67_ != null && i_73_ != 0) {
							i_102_ = 255 * is_67_[i_93_] / i_73_;
							if (i_102_ < 0) {
								i_102_ = 0;
							} else if (i_102_ > 255) {
								i_102_ = 255;
							}
						} else {
							i_102_ = 0;
						}
						class276.anInt3502 = Plane.method3249(i_72_, 105, method3271(is_68_[i_93_] >> 8, aByteArrayArray7967[i][i_64_] - aByteArrayArray7958[i][i_64_]), i_102_);
						if (class276.anInt3506 != 0) {
							class276.anInt3502 |= 255 - (aByteArrayArray7967[i][i_64_] - aByteArrayArray7958[i][i_64_]) << 25;
						}
						if (is_67_ != null && i_73_ != 0) {
							i_102_ = 255 * is_67_[i_94_] / i_73_;
							if (i_102_ < 0) {
								i_102_ = 0;
							} else if (i_102_ > 255) {
								i_102_ = 255;
							}
						} else {
							i_102_ = 0;
						}
						class276.anInt3507 = Plane.method3249(i_72_, 99, method3271(is_68_[i_94_] >> 8, aByteArrayArray7967[i + 1][i_64_] - aByteArrayArray7958[i + 1][i_64_]), i_102_);
						if (class276.anInt3506 != 0) {
							class276.anInt3507 |= 255 - (aByteArrayArray7967[i + 1][i_64_] - aByteArrayArray7958[i + 1][i_64_]) << 25;
						}
						if (is_67_ != null && i_73_ != 0) {
							i_102_ = 255 * is_67_[i_95_] / i_73_;
							if (i_102_ < 0) {
								i_102_ = 0;
							} else if (i_102_ > 255) {
								i_102_ = 255;
							}
						} else {
							i_102_ = 0;
						}
						class276.anInt3501 = Plane.method3249(i_72_, 91, method3271(is_68_[i_95_] >> 8, aByteArrayArray7967[i + 1][i_64_ + 1] - aByteArrayArray7958[i + 1][i_64_ + 1]), i_102_);
						if (class276.anInt3506 != 0) {
							class276.anInt3501 |= 255 - (aByteArrayArray7967[i + 1][i_64_ + 1] - aByteArrayArray7958[i + 1][i_64_ + 1]) << 25;
						}
						if (is_67_ != null && i_73_ != 0) {
							i_102_ = 255 * is_67_[i_96_] / i_73_;
							if (i_102_ < 0) {
								i_102_ = 0;
							} else if (i_102_ > 255) {
								i_102_ = 255;
							}
						} else {
							i_102_ = 0;
						}
						class276.anInt3504 = Plane.method3249(i_72_, 74, method3271(is_68_[i_96_] >> 8, aByteArrayArray7967[i][i_64_ + 1] - aByteArrayArray7958[i][i_64_ + 1]), i_102_);
						class276.aShort3500 = (short) i_101_;
					} else {
						int i_103_;
						if (is_67_ != null && i_73_ != 0) {
							i_103_ = 255 * is_67_[i_93_] / i_73_;
							if (i_103_ < 0) {
								i_103_ = 0;
							} else if (i_103_ > 255) {
								i_103_ = 255;
							}
						} else {
							i_103_ = 0;
						}
						class276.anInt3502 = Plane.method3249(i_72_, 79, method3271(is_68_[i_93_] >> 8, aByteArrayArray7967[i][i_64_] - aByteArrayArray7958[i][i_64_]), i_103_);
						if (class276.anInt3506 != 0) {
							class276.anInt3502 |= 255 - (aByteArrayArray7967[i][i_64_] - aByteArrayArray7958[i][i_64_]) << 25;
						}
						if (is_67_ != null && i_73_ != 0) {
							i_103_ = 255 * is_67_[i_94_] / i_73_;
							if (i_103_ < 0) {
								i_103_ = 0;
							} else if (i_103_ > 255) {
								i_103_ = 255;
							}
						} else {
							i_103_ = 0;
						}
						class276.anInt3507 = Plane.method3249(i_72_, 65, method3271(is_68_[i_94_] >> 8, aByteArrayArray7967[i + 1][i_64_] - aByteArrayArray7958[i + 1][i_64_]), i_103_);
						if (class276.anInt3506 != 0) {
							class276.anInt3507 |= 255 - (aByteArrayArray7967[i + 1][i_64_] - aByteArrayArray7958[i + 1][i_64_]) << 25;
						}
						if (is_67_ != null && i_73_ != 0) {
							i_103_ = 255 * is_67_[i_95_] / i_73_;
							if (i_103_ < 0) {
								i_103_ = 0;
							} else if (i_103_ > 255) {
								i_103_ = 255;
							}
						} else {
							i_103_ = 0;
						}
						class276.anInt3501 = Plane.method3249(i_72_, 35, method3271(is_68_[i_95_] >> 8, aByteArrayArray7967[i + 1][i_64_ + 1] - aByteArrayArray7958[i + 1][i_64_ + 1]), i_103_);
						if (class276.anInt3506 != 0) {
							class276.anInt3501 |= 255 - (aByteArrayArray7967[i + 1][i_64_ + 1] - aByteArrayArray7958[i + 1][i_64_ + 1]) << 25;
						}
						if (is_67_ != null && i_73_ != 0) {
							i_103_ = 255 * is_67_[i_96_] / i_73_;
							if (i_103_ < 0) {
								i_103_ = 0;
							} else if (i_103_ > 255) {
								i_103_ = 255;
							}
						} else {
							i_103_ = 0;
						}
						class276.anInt3504 = Plane.method3249(i_72_, 51, method3271(is_68_[i_96_] >> 8, aByteArrayArray7967[i][i_64_ + 1] - aByteArrayArray7958[i][i_64_ + 1]), i_103_);
						if (class276.anInt3506 != 0) {
							class276.anInt3504 |= 255 - (aByteArrayArray7967[i][i_64_ + 1] - aByteArrayArray7958[i][i_64_ + 1]) << 25;
						}
						class276.aShort3500 = (short) -1;
					}
					if (is_67_ != null) {
						class276.aShort3505 = (short) is_67_[i_95_];
						class276.aShort3499 = (short) is_67_[i_96_];
						class276.aShort3498 = (short) is_67_[i_94_];
						class276.aShort3508 = (short) is_67_[i_93_];
					}
					aClass276ArrayArray7968[i][i_64_] = class276;
				} else {
					Class358 class358 = new Class358();
					class358.aShort4447 = (short) is.length;
					class358.aShort4452 = (short) (is.length / 3);
					class358.aShortArray4453 = new short[class358.aShort4447];
					class358.aShortArray4454 = new short[class358.aShort4447];
					class358.aShortArray4451 = new short[class358.aShort4447];
					class358.anIntArray4446 = new int[class358.aShort4447];
					if (is_67_ != null) {
						class358.aShortArray4448 = new short[class358.aShort4447];
					}
					for (int i_104_ = 0; i_104_ < class358.aShort4447; i_104_++) {
						int i_105_ = is[i_104_];
						int i_106_ = is_66_[i_104_];
						int i_108_;
						if (i_105_ == 0 && i_106_ == 0) {
							i_108_ = aByteArrayArray7967[i][i_64_] - aByteArrayArray7958[i][i_64_];
						} else if (i_105_ == 0 && i_106_ == anInt3398) {
							i_108_ = aByteArrayArray7967[i][i_64_ + 1] - aByteArrayArray7958[i][i_64_ + 1];
						} else if (i_105_ == anInt3398 && i_106_ == anInt3398) {
							i_108_ = aByteArrayArray7967[i + 1][i_64_ + 1] - aByteArrayArray7958[i + 1][i_64_ + 1];
						} else if (i_105_ == anInt3398 && i_106_ == 0) {
							i_108_ = aByteArrayArray7967[i + 1][i_64_] - aByteArrayArray7958[i + 1][i_64_];
						} else {
							int i_109_ = (aByteArrayArray7967[i][i_64_] - aByteArrayArray7958[i][i_64_]) * (anInt3398 - i_105_) + (aByteArrayArray7967[i + 1][i_64_] - aByteArrayArray7958[i + 1][i_64_]) * i_105_;
							int i_110_ = (aByteArrayArray7967[i][i_64_ + 1] - aByteArrayArray7958[i][i_64_ + 1]) * (anInt3398 - i_105_) + (aByteArrayArray7967[i + 1][i_64_ + 1] - aByteArrayArray7958[i + 1][i_64_ + 1]) * i_105_;
							i_108_ = i_109_ * (anInt3398 - i_106_) + i_110_ * i_106_ >> 2 * anInt3410;
						}
						int i_111_ = (i << anInt3410) + i_105_;
						int i_112_ = (i_64_ << anInt3410) + i_106_;
						class358.aShortArray4453[i_104_] = (short) i_105_;
						class358.aShortArray4451[i_104_] = (short) i_106_;
						class358.aShortArray4454[i_104_] = (short) (this.method3260(i_112_, -117, i_111_) + (is_65_ != null ? is_65_[i_104_] : 0));
						if (i_108_ < 0) {
							i_108_ = 0;
						}
						if (is_68_[i_104_] == 0) {
							if (is_69_ != null) {
								class358.anIntArray4446[i_104_] = i_108_ << 25;
							} else {
								class358.anIntArray4446[i_104_] = 0;
							}
						} else {
							int i_113_ = 0;
							if (is_67_ != null) {
								int i_114_ = class358.aShortArray4448[i_104_] = (short) is_67_[i_104_];
								if (i_73_ != 0) {
									i_113_ = 255 * i_114_ / i_73_;
									if (i_113_ < 0) {
										i_113_ = 0;
									} else if (i_113_ > 255) {
										i_113_ = 255;
									}
								}
							}
							class358.anIntArray4446[i_104_] = Plane.method3249(i_72_, 22, method3271(is_68_[i_104_] >> 8, i_108_), i_113_);
							if (is_69_ != null) {
								class358.anIntArray4446[i_104_] |= i_108_ << 25;
							}
						}
					}
					boolean bool_115_ = false;
					for (int i_116_ = 0; i_116_ < class358.aShort4452; i_116_++) {
						if (is_70_[i_116_ * 3] != -1 && !aPureJavaToolkit7970.aD1543.method10(is_70_[i_116_ * 3], -8217).aBoolean1223) {
							bool_115_ = true;
						}
					}
					if (is_69_ != null) {
						class358.anIntArray4445 = new int[class358.aShort4452];
					}
					if (bool_115_) {
						class358.aShortArray4449 = new short[class358.aShort4452];
						class358.aShortArray4450 = new short[class358.aShort4452];
					}
					for (int i_117_ = 0; i_117_ < class358.aShort4452; i_117_++) {
						int i_118_ = i_117_ * 3;
						if (is_69_ != null && is_69_[i_118_] != 0) {
							class358.anIntArray4445[i_117_] = is_69_[i_118_] >> 8;
						}
						if (bool_115_) {
							int i_119_ = i_118_ + 1;
							int i_120_ = i_119_ + 1;
							boolean bool_121_ = false;
							boolean bool_122_ = true;
							int i_123_ = is_70_[i_118_];
							if (i_123_ == -1 || aPureJavaToolkit7970.aD1543.method10(i_123_, -8217).aBoolean1223) {
								bool_122_ = false;
							} else {
								bool_121_ = true;
							}
							i_123_ = is_70_[i_119_];
							if (i_123_ == -1 || aPureJavaToolkit7970.aD1543.method10(i_123_, -8217).aBoolean1223) {
								bool_122_ = false;
							} else {
								bool_121_ = true;
							}
							i_123_ = is_70_[i_120_];
							if (i_123_ == -1 || aPureJavaToolkit7970.aD1543.method10(i_123_, -8217).aBoolean1223) {
								bool_122_ = false;
							} else {
								bool_121_ = true;
							}
							if (bool_122_) {
								class358.aShortArray4449[i_117_] = (short) i_123_;
								class358.aShortArray4450[i_117_] = (short) is_71_[i_118_];
							} else {
								if (bool_121_) {
									i_123_ = is_70_[i_118_];
									if (i_123_ != -1 && !aPureJavaToolkit7970.aD1543.method10(i_123_, -8217).aBoolean1223) {
										class358.anIntArray4446[i_118_] = Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, aPureJavaToolkit7970.aD1543.method10(i_123_, -8217).aShort1221 & 0xffff) & 0xffff];
									}
									i_123_ = is_70_[i_119_];
									if (i_123_ != -1 && !aPureJavaToolkit7970.aD1543.method10(i_123_, -8217).aBoolean1223) {
										class358.anIntArray4446[i_119_] = Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, aPureJavaToolkit7970.aD1543.method10(i_123_, -8217).aShort1221 & 0xffff) & 0xffff];
									}
									i_123_ = is_70_[i_120_];
									if (i_123_ != -1 && !aPureJavaToolkit7970.aD1543.method10(i_123_, -8217).aBoolean1223) {
										class358.anIntArray4446[i_120_] = Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, aPureJavaToolkit7970.aD1543.method10(i_123_, -8217).aShort1221 & 0xffff) & 0xffff];
									}
								}
								class358.aShortArray4449[i_117_] = (short) -1;
							}
						}
					}
					aClass358ArrayArray7972[i][i_64_] = class358;
				}
			}
		}
	}
	
	private final boolean method3266(int i) {
		if ((anInt7969 & 0x8) == 0) {
			return false;
		}
		if (i == 4) {
			return true;
		}
		if (i == 8) {
			return true;
		}
        return i == 9;
    }
	
	private final void method3267(int i, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, boolean[][] bools, Class374 class374, Class185 class185, int[] is, int[] is_130_) {
		int i_131_ = (i_129_ - i_127_) * i_125_ / 256;
		int i_132_ = i_125_ >> 8;
		boolean bool = class374.aBoolean4615;
		aPureJavaToolkit7970.C(false);
		class185.aBoolean2226 = false;
		class185.aBoolean2212 = false;
		int i_133_ = i;
		int i_134_ = i_124_ + i_131_;
		for (int i_135_ = i_126_; i_135_ < i_128_; i_135_++) {
			for (int i_136_ = i_127_; i_136_ < i_129_; i_136_++) {
				if (bools[i_135_ - i_126_][i_136_ - i_127_]) {
					if (aClass100ArrayArray7965[i_135_][i_136_] != null) {
						Class100 class100 = aClass100ArrayArray7965[i_135_][i_136_];
						if (class100.aShort1294 != -1 && (class100.aByte1297 & 0x2) == 0 && class100.anInt1299 == -1) {
							int i_137_ = aPureJavaToolkit7970.method1500(class100.aShort1294);
							class185.method1865((float) (i_134_ - i_132_), (float) (i_134_ - i_132_), (float) i_134_, (float) (i_133_ + i_132_), (float) i_133_, (float) (i_133_ + i_132_), 100.0F, 100.0F, 100.0F, (float) Node_Sub18.method2607((byte) 31, class100.aShort1298 & 0xffff, i_137_), (float) Node_Sub18.method2607((byte) 31, class100.aShort1296 & 0xffff, i_137_), (float) Node_Sub18.method2607((byte) 31, class100.aShort1295 & 0xffff, i_137_));
							class185.method1865((float) i_134_, (float) i_134_, (float) (i_134_ - i_132_), (float) i_133_, (float) (i_133_ + i_132_), (float) i_133_, 100.0F, 100.0F, 100.0F, (float) Node_Sub18.method2607((byte) 31, class100.aShort1300 & 0xffff, i_137_), (float) Node_Sub18.method2607((byte) 31, class100.aShort1295 & 0xffff, i_137_), (float) Node_Sub18.method2607((byte) 31, class100.aShort1296 & 0xffff, i_137_));
						} else if (class100.anInt1299 == -1) {
							class185.method1865((float) (i_134_ - i_132_), (float) (i_134_ - i_132_), (float) i_134_, (float) (i_133_ + i_132_), (float) i_133_, (float) (i_133_ + i_132_), 100.0F, 100.0F, 100.0F, (float) (class100.aShort1298 & 0xffff), (float) (class100.aShort1296 & 0xffff), (float) (class100.aShort1295 & 0xffff));
							class185.method1865((float) i_134_, (float) i_134_, (float) (i_134_ - i_132_), (float) i_133_, (float) (i_133_ + i_132_), (float) i_133_, 100.0F, 100.0F, 100.0F, (float) (class100.aShort1300 & 0xffff), (float) (class100.aShort1295 & 0xffff), (float) (class100.aShort1296 & 0xffff));
						} else {
							int i_138_ = class100.anInt1299;
							class185.method1865((float) (i_134_ - i_132_), (float) (i_134_ - i_132_), (float) i_134_, (float) (i_133_ + i_132_), (float) i_133_, (float) (i_133_ + i_132_), 100.0F, 100.0F, 100.0F, (float) i_138_, (float) i_138_, (float) i_138_);
							class185.method1865((float) i_134_, (float) i_134_, (float) (i_134_ - i_132_), (float) i_133_, (float) (i_133_ + i_132_), (float) i_133_, 100.0F, 100.0F, 100.0F, (float) i_138_, (float) i_138_, (float) i_138_);
						}
					} else if (aClass81ArrayArray7978[i_135_][i_136_] != null) {
						Class81 class81 = aClass81ArrayArray7978[i_135_][i_136_];
						for (int i_139_ = 0; i_139_ < class81.aShort1106; i_139_++) {
							is[i_139_] = i_133_ + class81.aShortArray1098[i_139_] * i_132_ / anInt3398;
							is_130_[i_139_] = i_134_ - class81.aShortArray1107[i_139_] * i_132_ / anInt3398;
						}
						for (int i_140_ = 0; i_140_ < class81.aShort1097; i_140_++) {
							short s = class81.aShortArray1100[i_140_];
							short s_141_ = class81.aShortArray1105[i_140_];
							short s_142_ = class81.aShortArray1104[i_140_];
							int i_143_ = is[s];
							int i_144_ = is[s_141_];
							int i_145_ = is[s_142_];
							int i_146_ = is_130_[s];
							int i_147_ = is_130_[s_141_];
							int i_148_ = is_130_[s_142_];
							if (class81.anIntArray1103 != null && class81.anIntArray1103[i_140_] != -1) {
								int i_149_ = class81.anIntArray1103[i_140_];
								class185.method1865((float) i_146_, (float) i_147_, (float) i_148_, (float) i_143_, (float) i_144_, (float) i_145_, 100.0F, 100.0F, 100.0F, (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s], i_149_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_141_], i_149_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_142_], i_149_));
							} else if (class81.aShortArray1095 != null && class81.aShortArray1095[i_140_] != -1) {
								int i_150_ = aPureJavaToolkit7970.method1500(class81.aShortArray1095[i_140_]);
								class185.method1865((float) i_146_, (float) i_147_, (float) i_148_, (float) i_143_, (float) i_144_, (float) i_145_, 100.0F, 100.0F, 100.0F, (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s], i_150_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_141_], i_150_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_142_], i_150_));
							} else {
								int i_151_ = class81.anIntArray1101[i_140_];
								class185.method1865((float) i_146_, (float) i_147_, (float) i_148_, (float) i_143_, (float) i_144_, (float) i_145_, 100.0F, 100.0F, 100.0F, (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s], i_151_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_141_], i_151_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_142_], i_151_));
							}
						}
					}
				}
				i_134_ -= i_132_;
			}
			i_134_ = i_124_ + i_131_;
			i_133_ += i_132_;
		}
		class185.aBoolean2226 = true;
		aPureJavaToolkit7970.C(bool);
	}
	
	private final void method3268(int i, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, boolean[][] bools, Class374 class374, Class185 class185, int[] is, int[] is_158_) {
		int i_159_ = (i_157_ - i_155_) * i_153_ / 256;
		int i_160_ = i_153_ >> 8;
		boolean bool = class374.aBoolean4615;
		aPureJavaToolkit7970.C(false);
		class185.aBoolean2226 = false;
		class185.aBoolean2212 = false;
		int i_161_ = i;
		int i_162_ = i_152_ + i_159_;
		for (int i_163_ = i_154_; i_163_ < i_156_; i_163_++) {
			for (int i_164_ = i_155_; i_164_ < i_157_; i_164_++) {
				if (bools[i_163_ - i_154_][i_164_ - i_155_]) {
					if (aClass276ArrayArray7968 != null) {
						if (aClass276ArrayArray7968[i_163_][i_164_] != null) {
							Class276 class276 = aClass276ArrayArray7968[i_163_][i_164_];
							if (class276.aShort3500 != -1 && (class276.aByte3503 & 0x2) == 0 && class276.anInt3506 == 0) {
								int i_165_ = aPureJavaToolkit7970.method1500(class276.aShort3500);
								class185.method1865((float) (i_162_ - i_160_), (float) (i_162_ - i_160_), (float) i_162_, (float) (i_161_ + i_160_), (float) i_161_, (float) (i_161_ + i_160_), 100.0F, 100.0F, 100.0F, (float) Node_Sub18.method2607((byte) 31, class276.anInt3501, i_165_), (float) Node_Sub18.method2607((byte) 31, class276.anInt3504, i_165_), (float) Node_Sub18.method2607((byte) 31, class276.anInt3507, i_165_));
								class185.method1865((float) i_162_, (float) i_162_, (float) (i_162_ - i_160_), (float) i_161_, (float) (i_161_ + i_160_), (float) i_161_, 100.0F, 100.0F, 100.0F, (float) Node_Sub18.method2607((byte) 31, class276.anInt3502, i_165_), (float) Node_Sub18.method2607((byte) 31, class276.anInt3507, i_165_), (float) Node_Sub18.method2607((byte) 31, class276.anInt3504, i_165_));
							} else if (class276.anInt3506 == 0) {
								class185.method1850((float) (i_162_ - i_160_), (float) (i_162_ - i_160_), (float) i_162_, (float) (i_161_ + i_160_), (float) i_161_, (float) (i_161_ + i_160_), 100.0F, 100.0F, 100.0F, class276.anInt3501, class276.anInt3504, class276.anInt3507);
								class185.method1850((float) i_162_, (float) i_162_, (float) (i_162_ - i_160_), (float) i_161_, (float) (i_161_ + i_160_), (float) i_161_, 100.0F, 100.0F, 100.0F, class276.anInt3502, class276.anInt3507, class276.anInt3504);
							} else {
								int i_166_ = class276.anInt3506;
								class185.method1850((float) (i_162_ - i_160_), (float) (i_162_ - i_160_), (float) i_162_, (float) (i_161_ + i_160_), (float) i_161_, (float) (i_161_ + i_160_), 100.0F, 100.0F, 100.0F, Class249.method3086(class276.anInt3501 & ~0xffffff, i_166_, (byte) -56), Class249.method3086(class276.anInt3504 & ~0xffffff, i_166_, (byte) -56), Class249.method3086(class276.anInt3507 & ~0xffffff, i_166_, (byte) -56));
								class185.method1850((float) i_162_, (float) i_162_, (float) (i_162_ - i_160_), (float) i_161_, (float) (i_161_ + i_160_), (float) i_161_, 100.0F, 100.0F, 100.0F, Class249.method3086(class276.anInt3502 & ~0xffffff, i_166_, (byte) -56), Class249.method3086(class276.anInt3507 & ~0xffffff, i_166_, (byte) -56), Class249.method3086(class276.anInt3504 & ~0xffffff, i_166_, (byte) -56));
							}
						} else if (aClass358ArrayArray7972[i_163_][i_164_] != null) {
							Class358 class358 = aClass358ArrayArray7972[i_163_][i_164_];
							for (int i_167_ = 0; i_167_ < class358.aShort4447; i_167_++) {
								is[i_167_] = i_161_ + class358.aShortArray4453[i_167_] * i_160_ / anInt3398;
								is_158_[i_167_] = i_162_ - class358.aShortArray4451[i_167_] * i_160_ / anInt3398;
							}
							for (int i_168_ = 0; i_168_ < class358.aShort4452; i_168_++) {
								int i_169_ = i_168_ * 3;
								int i_170_ = i_169_ + 1;
								int i_171_ = i_170_ + 1;
								int i_172_ = is[i_169_];
								int i_173_ = is[i_170_];
								int i_174_ = is[i_171_];
								int i_175_ = is_158_[i_169_];
								int i_176_ = is_158_[i_170_];
								int i_177_ = is_158_[i_171_];
								if (class358.anIntArray4445 != null && class358.anIntArray4445[i_168_] != 0 && (class358.aShortArray4449 == null || class358.aShortArray4449 != null && class358.aShortArray4449[i_168_] == -1)) {
									int i_178_ = class358.anIntArray4445[i_168_];
									class185.method1850((float) i_175_, (float) i_176_, (float) i_177_, (float) i_172_, (float) i_173_, (float) i_174_, 100.0F, 100.0F, 100.0F, Class249.method3086(-16777216 - (class358.anIntArray4446[i_169_] & ~0xffffff), i_178_, (byte) -56), Class249.method3086(-16777216 - (class358.anIntArray4446[i_170_] & ~0xffffff), i_178_, (byte) -56), Class249.method3086(-16777216 - (class358.anIntArray4446[i_171_] & ~0xffffff), i_178_, (byte) -56));
								} else if (class358.aShortArray4449 != null && class358.aShortArray4449[i_168_] != -1) {
									int i_179_ = aPureJavaToolkit7970.method1500(class358.aShortArray4449[i_168_]);
									class185.method1865((float) i_175_, (float) i_176_, (float) i_177_, (float) i_172_, (float) i_173_, (float) i_174_, 100.0F, 100.0F, 100.0F, (float) i_179_, (float) i_179_, (float) i_179_);
								} else {
									class185.method1850((float) i_175_, (float) i_176_, (float) i_177_, (float) i_172_, (float) i_173_, (float) i_174_, 100.0F, 100.0F, 100.0F, class358.anIntArray4446[i_169_], class358.anIntArray4446[i_170_], class358.anIntArray4446[i_171_]);
								}
							}
						}
					} else if (aClass292ArrayArray7977[i_163_][i_164_] != null) {
						Class292 class292 = aClass292ArrayArray7977[i_163_][i_164_];
						for (int i_180_ = 0; i_180_ < class292.aShort3678; i_180_++) {
							is[i_180_] = i_161_ + class292.aShortArray3675[i_180_] * i_160_ / anInt3398;
							is_158_[i_180_] = i_162_ - class292.aShortArray3669[i_180_] * i_160_ / anInt3398;
						}
						for (int i_181_ = 0; i_181_ < class292.aShort3670; i_181_++) {
							int i_182_ = i_181_ * 3;
							int i_183_ = i_182_ + 1;
							int i_184_ = i_183_ + 1;
							int i_185_ = is[i_182_];
							int i_186_ = is[i_183_];
							int i_187_ = is[i_184_];
							int i_188_ = is_158_[i_182_];
							int i_189_ = is_158_[i_183_];
							int i_190_ = is_158_[i_184_];
							if (class292.anIntArray3677 != null && class292.anIntArray3677[i_181_] != 0) {
								int i_191_ = class292.anIntArray3677[i_181_];
								class185.method1850((float) i_188_, (float) i_189_, (float) i_190_, (float) i_185_, (float) i_186_, (float) i_187_, 100.0F, 100.0F, 100.0F, i_191_, i_191_, i_191_);
							} else {
								class185.method1850((float) i_188_, (float) i_189_, (float) i_190_, (float) i_185_, (float) i_186_, (float) i_187_, 100.0F, 100.0F, 100.0F, class292.anIntArray3674[i_182_], class292.anIntArray3674[i_183_], class292.anIntArray3674[i_184_]);
							}
						}
					}
				}
				i_162_ -= i_160_;
			}
			i_162_ = i_152_ + i_159_;
			i_161_ += i_160_;
		}
		class185.aBoolean2226 = true;
		aPureJavaToolkit7970.C(bool);
	}
	
	private final void method3269(int i, int i_192_, Class185 class185, int[] is, int[] is_193_, int[] is_194_, int[] is_195_, int i_196_) {
		Class100 class100 = aClass100ArrayArray7965[i][i_192_];
		if (class100 != null) {
			if ((class100.aByte1297 & 0x2) == 0) {
				if (i_196_ != 0) {
					if ((class100.aByte1297 & 0x4) != 0) {
						if ((i_196_ & 0x1) != 0) {
							return;
						}
					} else if ((i_196_ & 0x2) != 0) {
						return;
					}
				}
				int i_197_ = i * anInt3398;
				int i_198_ = i_197_ + anInt3398;
				int i_199_ = i_192_ * anInt3398;
				int i_200_ = i_199_ + anInt3398;
				float f;
				float f_201_;
				float f_202_;
				float f_203_;
				int i_204_;
				int i_205_;
				int i_206_;
				int i_207_;
				int i_208_;
				int i_209_;
				int i_210_;
				int i_211_;
				if ((class100.aByte1297 & 0x1) != 0) {
					int i_212_ = anIntArrayArray3407[i][i_192_];
					float f_213_ = aFloat7976 * (float) i_212_;
					if (anInt7963 == -1) {
						f = aFloat7979 + (aFloat7961 * (float) i_197_ + f_213_ + aFloat7962 * (float) i_199_);
						if (f <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_201_ = aFloat7979 + (aFloat7961 * (float) i_198_ + f_213_ + aFloat7962 * (float) i_199_);
						if (f_201_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_202_ = aFloat7979 + (aFloat7961 * (float) i_198_ + f_213_ + aFloat7962 * (float) i_200_);
						if (f_202_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_203_ = aFloat7979 + (aFloat7961 * (float) i_197_ + f_213_ + aFloat7962 * (float) i_200_);
						if (f_203_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
					} else {
						f = aFloat7979 + (aFloat7961 * (float) i_197_ + f_213_ + aFloat7962 * (float) i_199_);
						f_201_ = aFloat7979 + (aFloat7961 * (float) i_198_ + f_213_ + aFloat7962 * (float) i_199_);
						f_202_ = aFloat7979 + (aFloat7961 * (float) i_198_ + f_213_ + aFloat7962 * (float) i_200_);
						f_203_ = aFloat7979 + (aFloat7961 * (float) i_197_ + f_213_ + aFloat7962 * (float) i_200_);
					}
					float f_214_ = aFloat7966 * (float) i_212_;
					float f_215_ = aFloat7960 * (float) i_212_;
					if (anInt7963 == -1) {
						float f_216_ = aFloat7975 + (aFloat7974 * (float) i_197_ + f_214_ + aFloat7959 * (float) i_199_);
						i_204_ = class185.anInt2216 + (int) (f_216_ * (float) aPureJavaToolkit7970.anInt6785 / f);
						float f_217_ = aFloat7973 + (aFloat7971 * (float) i_197_ + f_215_ + aFloat7964 * (float) i_199_);
						i_205_ = class185.anInt2213 + (int) (f_217_ * (float) aPureJavaToolkit7970.anInt6763 / f);
						float f_218_ = aFloat7975 + (aFloat7974 * (float) i_198_ + f_214_ + aFloat7959 * (float) i_199_);
						i_206_ = class185.anInt2216 + (int) (f_218_ * (float) aPureJavaToolkit7970.anInt6785 / f_201_);
						float f_219_ = aFloat7973 + (aFloat7971 * (float) i_198_ + f_215_ + aFloat7964 * (float) i_199_);
						i_207_ = class185.anInt2213 + (int) (f_219_ * (float) aPureJavaToolkit7970.anInt6763 / f_201_);
						float f_220_ = aFloat7975 + (aFloat7974 * (float) i_198_ + f_214_ + aFloat7959 * (float) i_200_);
						i_208_ = class185.anInt2216 + (int) (f_220_ * (float) aPureJavaToolkit7970.anInt6785 / f_202_);
						float f_221_ = aFloat7973 + (aFloat7971 * (float) i_198_ + f_215_ + aFloat7964 * (float) i_200_);
						i_209_ = class185.anInt2213 + (int) (f_221_ * (float) aPureJavaToolkit7970.anInt6763 / f_202_);
						float f_222_ = aFloat7975 + (aFloat7974 * (float) i_197_ + f_214_ + aFloat7959 * (float) i_200_);
						i_210_ = class185.anInt2216 + (int) (f_222_ * (float) aPureJavaToolkit7970.anInt6785 / f_203_);
						float f_223_ = aFloat7973 + (aFloat7971 * (float) i_197_ + f_215_ + aFloat7964 * (float) i_200_);
						i_211_ = class185.anInt2213 + (int) (f_223_ * (float) aPureJavaToolkit7970.anInt6763 / f_203_);
					} else {
						float f_224_ = aFloat7975 + (aFloat7974 * (float) i_197_ + f_214_ + aFloat7959 * (float) i_199_);
						i_204_ = class185.anInt2216 + (int) (f_224_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_225_ = aFloat7973 + (aFloat7971 * (float) i_197_ + f_215_ + aFloat7964 * (float) i_199_);
						i_205_ = class185.anInt2213 + (int) (f_225_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_226_ = aFloat7975 + (aFloat7974 * (float) i_198_ + f_214_ + aFloat7959 * (float) i_199_);
						i_206_ = class185.anInt2216 + (int) (f_226_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_227_ = aFloat7973 + (aFloat7971 * (float) i_198_ + f_215_ + aFloat7964 * (float) i_199_);
						i_207_ = class185.anInt2213 + (int) (f_227_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_228_ = aFloat7975 + (aFloat7974 * (float) i_198_ + f_214_ + aFloat7959 * (float) i_200_);
						i_208_ = class185.anInt2216 + (int) (f_228_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_229_ = aFloat7973 + (aFloat7971 * (float) i_198_ + f_215_ + aFloat7964 * (float) i_200_);
						i_209_ = class185.anInt2213 + (int) (f_229_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_230_ = aFloat7975 + (aFloat7974 * (float) i_197_ + f_214_ + aFloat7959 * (float) i_200_);
						i_210_ = class185.anInt2216 + (int) (f_230_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_231_ = aFloat7973 + (aFloat7971 * (float) i_197_ + f_215_ + aFloat7964 * (float) i_200_);
						i_211_ = class185.anInt2213 + (int) (f_231_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
					}
				} else {
					int i_232_ = anIntArrayArray3407[i][i_192_];
					int i_233_ = anIntArrayArray3407[i + 1][i_192_];
					int i_234_ = anIntArrayArray3407[i + 1][i_192_ + 1];
					int i_235_ = anIntArrayArray3407[i][i_192_ + 1];
					if (anInt7963 == -1) {
						f = aFloat7979 + (aFloat7961 * (float) i_197_ + aFloat7976 * (float) i_232_ + aFloat7962 * (float) i_199_);
						if (f <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_201_ = aFloat7979 + (aFloat7961 * (float) i_198_ + aFloat7976 * (float) i_233_ + aFloat7962 * (float) i_199_);
						if (f_201_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_202_ = aFloat7979 + (aFloat7961 * (float) i_198_ + aFloat7976 * (float) i_234_ + aFloat7962 * (float) i_200_);
						if (f_202_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_203_ = aFloat7979 + (aFloat7961 * (float) i_197_ + aFloat7976 * (float) i_235_ + aFloat7962 * (float) i_200_);
						if (f_203_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						float f_236_ = aFloat7975 + (aFloat7974 * (float) i_197_ + aFloat7966 * (float) i_232_ + aFloat7959 * (float) i_199_);
						i_204_ = class185.anInt2216 + (int) (f_236_ * (float) aPureJavaToolkit7970.anInt6785 / f);
						float f_237_ = aFloat7973 + (aFloat7971 * (float) i_197_ + aFloat7960 * (float) i_232_ + aFloat7964 * (float) i_199_);
						i_205_ = class185.anInt2213 + (int) (f_237_ * (float) aPureJavaToolkit7970.anInt6763 / f);
						float f_238_ = aFloat7975 + (aFloat7974 * (float) i_198_ + aFloat7966 * (float) i_233_ + aFloat7959 * (float) i_199_);
						i_206_ = class185.anInt2216 + (int) (f_238_ * (float) aPureJavaToolkit7970.anInt6785 / f_201_);
						float f_239_ = aFloat7973 + (aFloat7971 * (float) i_198_ + aFloat7960 * (float) i_233_ + aFloat7964 * (float) i_199_);
						i_207_ = class185.anInt2213 + (int) (f_239_ * (float) aPureJavaToolkit7970.anInt6763 / f_201_);
						float f_240_ = aFloat7975 + (aFloat7974 * (float) i_198_ + aFloat7966 * (float) i_234_ + aFloat7959 * (float) i_200_);
						i_208_ = class185.anInt2216 + (int) (f_240_ * (float) aPureJavaToolkit7970.anInt6785 / f_202_);
						float f_241_ = aFloat7973 + (aFloat7971 * (float) i_198_ + aFloat7960 * (float) i_234_ + aFloat7964 * (float) i_200_);
						i_209_ = class185.anInt2213 + (int) (f_241_ * (float) aPureJavaToolkit7970.anInt6763 / f_202_);
						float f_242_ = aFloat7975 + (aFloat7974 * (float) i_197_ + aFloat7966 * (float) i_235_ + aFloat7959 * (float) i_200_);
						i_210_ = class185.anInt2216 + (int) (f_242_ * (float) aPureJavaToolkit7970.anInt6785 / f_203_);
						float f_243_ = aFloat7973 + (aFloat7971 * (float) i_197_ + aFloat7960 * (float) i_235_ + aFloat7964 * (float) i_200_);
						i_211_ = class185.anInt2213 + (int) (f_243_ * (float) aPureJavaToolkit7970.anInt6763 / f_203_);
					} else {
						f = aFloat7979 + (aFloat7961 * (float) i_197_ + aFloat7976 * (float) i_232_ + aFloat7962 * (float) i_199_);
						f_201_ = aFloat7979 + (aFloat7961 * (float) i_198_ + aFloat7976 * (float) i_233_ + aFloat7962 * (float) i_199_);
						f_202_ = aFloat7979 + (aFloat7961 * (float) i_198_ + aFloat7976 * (float) i_234_ + aFloat7962 * (float) i_200_);
						f_203_ = aFloat7979 + (aFloat7961 * (float) i_197_ + aFloat7976 * (float) i_235_ + aFloat7962 * (float) i_200_);
						float f_244_ = aFloat7975 + (aFloat7974 * (float) i_197_ + aFloat7966 * (float) i_232_ + aFloat7959 * (float) i_199_);
						i_204_ = class185.anInt2216 + (int) (f_244_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_245_ = aFloat7973 + (aFloat7971 * (float) i_197_ + aFloat7960 * (float) i_232_ + aFloat7964 * (float) i_199_);
						i_205_ = class185.anInt2213 + (int) (f_245_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_246_ = aFloat7975 + (aFloat7974 * (float) i_198_ + aFloat7966 * (float) i_233_ + aFloat7959 * (float) i_199_);
						i_206_ = class185.anInt2216 + (int) (f_246_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_247_ = aFloat7973 + (aFloat7971 * (float) i_198_ + aFloat7960 * (float) i_233_ + aFloat7964 * (float) i_199_);
						i_207_ = class185.anInt2213 + (int) (f_247_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_248_ = aFloat7975 + (aFloat7974 * (float) i_198_ + aFloat7966 * (float) i_234_ + aFloat7959 * (float) i_200_);
						i_208_ = class185.anInt2216 + (int) (f_248_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_249_ = aFloat7973 + (aFloat7971 * (float) i_198_ + aFloat7960 * (float) i_234_ + aFloat7964 * (float) i_200_);
						i_209_ = class185.anInt2213 + (int) (f_249_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_250_ = aFloat7975 + (aFloat7974 * (float) i_197_ + aFloat7966 * (float) i_235_ + aFloat7959 * (float) i_200_);
						i_210_ = class185.anInt2216 + (int) (f_250_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_251_ = aFloat7973 + (aFloat7971 * (float) i_197_ + aFloat7960 * (float) i_235_ + aFloat7964 * (float) i_200_);
						i_211_ = class185.anInt2213 + (int) (f_251_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
					}
				}
				if (anInt7963 == -1) {
					if ((i_208_ - i_210_) * (i_207_ - i_211_) - (i_209_ - i_211_) * (i_206_ - i_210_) > 0) {
						class185.aBoolean2217 = i_208_ < 0 || i_210_ < 0 || i_206_ < 0 || i_208_ > class185.anInt2222 || i_210_ > class185.anInt2222 || i_206_ > class185.anInt2222;
						if (class100.aShort1294 >= 0) {
							class185.method1859((float) i_209_, (float) i_211_, (float) i_207_, (float) i_208_, (float) i_210_, (float) i_206_, f_202_, f_203_, f_201_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | Class170.anIntArray2054[class100.aShort1298 & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class100.aShort1296 & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class100.aShort1295 & 0xffff] & 0xffffff, 0, 0, 0, 0, class100.aShort1294);
						} else {
							class185.method1865((float) i_209_, (float) i_211_, (float) i_207_, (float) i_208_, (float) i_210_, (float) i_206_, (float) (int) f_202_, (float) (int) f_203_, (float) (int) f_201_, (float) (class100.aShort1298 & 0xffff), (float) (class100.aShort1296 & 0xffff), (float) (class100.aShort1295 & 0xffff));
						}
					}
					if ((i_204_ - i_206_) * (i_211_ - i_207_) - (i_205_ - i_207_) * (i_210_ - i_206_) > 0) {
						class185.aBoolean2217 = i_204_ < 0 || i_206_ < 0 || i_210_ < 0 || i_204_ > class185.anInt2222 || i_206_ > class185.anInt2222 || i_210_ > class185.anInt2222;
						if (class100.aShort1294 >= 0) {
							class185.method1859((float) i_205_, (float) i_207_, (float) i_211_, (float) i_204_, (float) i_206_, (float) i_210_, f, f_201_, f_203_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | Class170.anIntArray2054[class100.aShort1300 & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class100.aShort1295 & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class100.aShort1296 & 0xffff] & 0xffffff, 0, 0, 0, 0, class100.aShort1294);
						} else {
							class185.method1865((float) i_205_, (float) i_207_, (float) i_211_, (float) i_204_, (float) i_206_, (float) i_210_, (float) (int) f, (float) (int) f_201_, (float) (int) f_203_, (float) (class100.aShort1300 & 0xffff), (float) (class100.aShort1295 & 0xffff), (float) (class100.aShort1296 & 0xffff));
						}
					}
				} else {
					if ((i_208_ - i_210_) * (i_207_ - i_211_) - (i_209_ - i_211_) * (i_206_ - i_210_) > 0) {
						class185.aBoolean2217 = i_208_ < 0 || i_210_ < 0 || i_206_ < 0 || i_208_ > class185.anInt2222 || i_210_ > class185.anInt2222 || i_206_ > class185.anInt2222;
						if (class100.aShort1294 >= 0) {
							class185.method1859((float) i_209_, (float) i_211_, (float) i_207_, (float) i_208_, (float) i_210_, (float) i_206_, f_202_, f_203_, f_201_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | Class170.anIntArray2054[class100.aShort1298 & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class100.aShort1296 & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class100.aShort1295 & 0xffff] & 0xffffff, 0, 0, 0, 0, class100.aShort1294);
						} else {
							class185.method1865((float) i_209_, (float) i_211_, (float) i_207_, (float) i_208_, (float) i_210_, (float) i_206_, (float) (int) f_202_, (float) (int) f_203_, (float) (int) f_201_, (float) (class100.aShort1298 & 0xffff), (float) (class100.aShort1296 & 0xffff), (float) (class100.aShort1295 & 0xffff));
						}
					}
					if ((i_204_ - i_206_) * (i_211_ - i_207_) - (i_205_ - i_207_) * (i_210_ - i_206_) > 0) {
						class185.aBoolean2217 = i_204_ < 0 || i_206_ < 0 || i_210_ < 0 || i_204_ > class185.anInt2222 || i_206_ > class185.anInt2222 || i_210_ > class185.anInt2222;
						if (class100.aShort1294 >= 0) {
							class185.method1859((float) i_205_, (float) i_207_, (float) i_211_, (float) i_204_, (float) i_206_, (float) i_210_, f, f_201_, f_203_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | Class170.anIntArray2054[class100.aShort1300 & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class100.aShort1295 & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class100.aShort1296 & 0xffff] & 0xffffff, 0, 0, 0, 0, class100.aShort1294);
						} else {
							class185.method1865((float) i_205_, (float) i_207_, (float) i_211_, (float) i_204_, (float) i_206_, (float) i_210_, (float) (int) f, (float) (int) f_201_, (float) (int) f_203_, (float) (class100.aShort1300 & 0xffff), (float) (class100.aShort1295 & 0xffff), (float) (class100.aShort1296 & 0xffff));
						}
					}
				}
			}
		} else {
			Class81 class81 = aClass81ArrayArray7978[i][i_192_];
			if (class81 != null) {
				if (i_196_ != 0) {
					if ((class81.aByte1108 & 0x4) != 0) {
						if ((i_196_ & 0x1) != 0) {
							return;
						}
					} else if ((i_196_ & 0x2) != 0) {
						return;
					}
				}
				if (anInt7963 == -1) {
					for (int i_252_ = 0; i_252_ < class81.aShort1106; i_252_++) {
						int i_253_ = class81.aShortArray1098[i_252_] + (i << anInt3410);
						short s = class81.aShortArray1099[i_252_];
						int i_254_ = class81.aShortArray1107[i_252_] + (i_192_ << anInt3410);
						float f = aFloat7979 + (aFloat7961 * (float) i_253_ + aFloat7976 * (float) s + aFloat7962 * (float) i_254_);
						if (f <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						float f_255_ = aFloat7975 + (aFloat7974 * (float) i_253_ + aFloat7966 * (float) s + aFloat7959 * (float) i_254_);
						float f_256_ = aFloat7973 + (aFloat7971 * (float) i_253_ + aFloat7960 * (float) s + aFloat7964 * (float) i_254_);
						is[i_252_] = class185.anInt2216 + (int) (f_255_ * (float) aPureJavaToolkit7970.anInt6785 / f);
						is_193_[i_252_] = class185.anInt2213 + (int) (f_256_ * (float) aPureJavaToolkit7970.anInt6763 / f);
						is_194_[i_252_] = (int) f;
					}
				} else {
					for (int i_257_ = 0; i_257_ < class81.aShort1106; i_257_++) {
						int i_258_ = class81.aShortArray1098[i_257_] + (i << anInt3410);
						short s = class81.aShortArray1099[i_257_];
						int i_259_ = class81.aShortArray1107[i_257_] + (i_192_ << anInt3410);
						float f = aFloat7979 + (aFloat7961 * (float) i_258_ + aFloat7976 * (float) s + aFloat7962 * (float) i_259_);
						float f_260_ = aFloat7975 + (aFloat7974 * (float) i_258_ + aFloat7966 * (float) s + aFloat7959 * (float) i_259_);
						float f_261_ = aFloat7973 + (aFloat7971 * (float) i_258_ + aFloat7960 * (float) s + aFloat7964 * (float) i_259_);
						is[i_257_] = class185.anInt2216 + (int) (f_260_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						is_193_[i_257_] = class185.anInt2213 + (int) (f_261_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						is_194_[i_257_] = (int) f;
					}
				}
				if (class81.aShortArray1095 != null) {
					if (anInt7963 == -1) {
						for (int i_262_ = 0; i_262_ < class81.aShort1097; i_262_++) {
							short s = class81.aShortArray1100[i_262_];
							short s_263_ = class81.aShortArray1105[i_262_];
							short s_264_ = class81.aShortArray1104[i_262_];
							int i_265_ = is[s];
							int i_266_ = is[s_263_];
							int i_267_ = is[s_264_];
							int i_268_ = is_193_[s];
							int i_269_ = is_193_[s_263_];
							int i_270_ = is_193_[s_264_];
							if ((i_265_ - i_266_) * (i_270_ - i_269_) - (i_268_ - i_269_) * (i_267_ - i_266_) > 0) {
								class185.aBoolean2217 = i_265_ < 0 || i_266_ < 0 || i_267_ < 0 || i_265_ > class185.anInt2222 || i_266_ > class185.anInt2222 || i_267_ > class185.anInt2222;
								short s_271_ = class81.aShortArray1095[i_262_];
								if (s_271_ != -1) {
									class185.method1859((float) i_268_, (float) i_269_, (float) i_270_, (float) i_265_, (float) i_266_, (float) i_267_, (float) is_194_[s], (float) is_194_[s_263_], (float) is_194_[s_264_], (float) class81.aShortArray1098[s] / (float) anInt3398, (float) class81.aShortArray1098[s_263_] / (float) anInt3398, (float) class81.aShortArray1098[s_264_] / (float) anInt3398, (float) class81.aShortArray1107[s] / (float) anInt3398, (float) class81.aShortArray1107[s_263_] / (float) anInt3398, (float) class81.aShortArray1107[s_264_] / (float) anInt3398, ~0xffffff | Class170.anIntArray2054[class81.aShortArray1102[s] & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class81.aShortArray1102[s_263_] & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class81.aShortArray1102[s_264_] & 0xffff] & 0xffffff, 0, 0, 0, 0, s_271_);
								} else {
									int i_272_ = class81.anIntArray1101[i_262_];
									if (i_272_ != -1) {
										class185.method1865((float) i_268_, (float) i_269_, (float) i_270_, (float) i_265_, (float) i_266_, (float) i_267_, (float) is_194_[s], (float) is_194_[s_263_], (float) is_194_[s_264_], (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s], i_272_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_263_], i_272_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_264_], i_272_));
									}
								}
							}
						}
					} else {
						for (int i_273_ = 0; i_273_ < class81.aShort1097; i_273_++) {
							short s = class81.aShortArray1100[i_273_];
							short s_274_ = class81.aShortArray1105[i_273_];
							short s_275_ = class81.aShortArray1104[i_273_];
							int i_276_ = is[s];
							int i_277_ = is[s_274_];
							int i_278_ = is[s_275_];
							int i_279_ = is_193_[s];
							int i_280_ = is_193_[s_274_];
							int i_281_ = is_193_[s_275_];
							if ((i_276_ - i_277_) * (i_281_ - i_280_) - (i_279_ - i_280_) * (i_278_ - i_277_) > 0) {
								class185.aBoolean2217 = i_276_ < 0 || i_277_ < 0 || i_278_ < 0 || i_276_ > class185.anInt2222 || i_277_ > class185.anInt2222 || i_278_ > class185.anInt2222;
								short s_282_ = class81.aShortArray1095[i_273_];
								if (s_282_ != -1) {
									class185.method1859((float) i_279_, (float) i_280_, (float) i_281_, (float) i_276_, (float) i_277_, (float) i_278_, (float) is_194_[s], (float) is_194_[s_274_], (float) is_194_[s_275_], (float) class81.aShortArray1098[s] / (float) anInt3398, (float) class81.aShortArray1098[s_274_] / (float) anInt3398, (float) class81.aShortArray1098[s_275_] / (float) anInt3398, (float) class81.aShortArray1107[s] / (float) anInt3398, (float) class81.aShortArray1107[s_274_] / (float) anInt3398, (float) class81.aShortArray1107[s_275_] / (float) anInt3398, ~0xffffff | Class170.anIntArray2054[class81.aShortArray1102[s] & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class81.aShortArray1102[s_274_] & 0xffff] & 0xffffff, ~0xffffff | Class170.anIntArray2054[class81.aShortArray1102[s_275_] & 0xffff] & 0xffffff, 0, 0, 0, 0, s_282_);
								} else {
									int i_283_ = class81.anIntArray1101[i_273_];
									if (i_283_ != -1) {
										class185.method1865((float) i_279_, (float) i_280_, (float) i_281_, (float) i_276_, (float) i_277_, (float) i_278_, (float) is_194_[s], (float) is_194_[s_274_], (float) is_194_[s_275_], (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s], i_283_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_274_], i_283_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_275_], i_283_));
									}
								}
							}
						}
					}
				} else {
					for (int i_284_ = 0; i_284_ < class81.aShort1097; i_284_++) {
						short s = class81.aShortArray1100[i_284_];
						short s_285_ = class81.aShortArray1105[i_284_];
						short s_286_ = class81.aShortArray1104[i_284_];
						int i_287_ = is[s];
						int i_288_ = is[s_285_];
						int i_289_ = is[s_286_];
						int i_290_ = is_193_[s];
						int i_291_ = is_193_[s_285_];
						int i_292_ = is_193_[s_286_];
						if ((i_287_ - i_288_) * (i_292_ - i_291_) - (i_290_ - i_291_) * (i_289_ - i_288_) > 0) {
							int i_293_ = class81.anIntArray1101[i_284_];
							if (i_293_ != -1) {
								class185.aBoolean2217 = i_287_ < 0 || i_288_ < 0 || i_289_ < 0 || i_287_ > class185.anInt2222 || i_288_ > class185.anInt2222 || i_289_ > class185.anInt2222;
								class185.method1865((float) i_290_, (float) i_291_, (float) i_292_, (float) i_287_, (float) i_288_, (float) i_289_, (float) is_194_[s], (float) is_194_[s_285_], (float) is_194_[s_286_], (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s], i_293_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_285_], i_293_), (float) Node_Sub18.method2607((byte) 31, class81.aShortArray1102[s_286_], i_293_));
							}
						}
					}
				}
			}
		}
	}
	
	final void method3259(int i, int i_294_, int i_295_, boolean[][] bools, boolean bool, int i_296_, int i_297_) {
		Class336_Sub2 class336_sub2 = aPureJavaToolkit7970.aClass336_Sub2_6788;
		anInt7963 = i_296_;
		aFloat7974 = class336_sub2.aFloat8580;
		aFloat7966 = class336_sub2.aFloat8571;
		aFloat7959 = class336_sub2.aFloat8566;
		aFloat7975 = class336_sub2.aFloat8583;
		aFloat7971 = class336_sub2.aFloat8578;
		aFloat7960 = class336_sub2.aFloat8561;
		aFloat7964 = class336_sub2.aFloat8558;
		aFloat7973 = class336_sub2.aFloat8579;
		aFloat7961 = class336_sub2.aFloat8577;
		aFloat7976 = class336_sub2.aFloat8567;
		aFloat7962 = class336_sub2.aFloat8584;
		aFloat7979 = class336_sub2.aFloat8589;
		for (int i_298_ = 0; i_298_ < i_295_ + i_295_; i_298_++) {
			for (int i_299_ = 0; i_299_ < i_295_ + i_295_; i_299_++) {
				if (bools[i_298_][i_299_]) {
					int i_300_ = i - i_295_ + i_298_;
					int i_301_ = i_294_ - i_295_ + i_299_;
					if (i_300_ >= 0 && i_300_ < anInt3408 && i_301_ >= 0 && i_301_ < anInt3404) {
						method3272(i_300_, i_301_, i_297_);
					}
				}
			}
		}
	}
	
	final void method3255(int i, int i_302_, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_, boolean[][] bools) {
		Class374 class374 = aPureJavaToolkit7970.method1494(Thread.currentThread());
		Class185 class185 = class374.aClass185_4627;
		class185.anInt2220 = 0;
		class185.aBoolean2217 = true;
		aPureJavaToolkit7970.ya();
		if (aClass276ArrayArray7968 != null || aClass292ArrayArray7977 != null) {
			method3268(i, i_302_, i_303_, i_304_, i_305_, i_306_, i_307_, bools, class374, class185, class374.anIntArray4632, class374.anIntArray4637);
		} else if (aClass100ArrayArray7965 != null) {
			method3267(i, i_302_, i_303_, i_304_, i_305_, i_306_, i_307_, bools, class374, class185, class374.anIntArray4632, class374.anIntArray4637);
		}
	}
	
	final void wa(r var_r, int i, int i_308_, int i_309_, int i_310_, boolean bool) {
		/* empty */
	}
	
	final void method3253(int i, int i_311_, int[] is, int[] is_312_, int[] is_313_, int[] is_314_, int[] is_315_, int[] is_316_, int[] is_317_, int[] is_318_, int[] is_319_, int[] is_320_, int[] is_321_, int i_322_, int i_323_, int i_324_, boolean bool) {
		if (aClass100ArrayArray7965 == null) {
			aClass100ArrayArray7965 = new Class100[anInt3408][anInt3404];
			aClass81ArrayArray7978 = new Class81[anInt3408][anInt3404];
		} else if (aClass276ArrayArray7968 != null || aClass292ArrayArray7977 != null) {
			throw new IllegalStateException();
		}
		boolean bool_325_ = false;
		if (is_318_.length == 2 && is_315_.length == 2 && (is_318_[0] == is_318_[1] || is_320_[0] != -1 && is_320_[0] == is_320_[1])) {
			bool_325_ = true;
			for (int i_326_ = 1; i_326_ < 2; i_326_++) {
				int i_327_ = is[is_315_[i_326_]];
				int i_328_ = is_313_[is_315_[i_326_]];
				if (i_327_ != 0 && i_327_ != anInt3398 || i_328_ != 0 && i_328_ != anInt3398) {
					bool_325_ = false;
					break;
				}
			}
		}
		if (!bool_325_) {
			Class81 class81 = new Class81();
			short s = (short) is.length;
			int i_329_ = (short) is_318_.length;
			class81.aShort1106 = s;
			class81.aShortArray1102 = new short[s];
			class81.aShortArray1098 = new short[s];
			class81.aShortArray1099 = new short[s];
			class81.aShortArray1107 = new short[s];
			for (int i_330_ = 0; i_330_ < s; i_330_++) {
				int i_331_ = is[i_330_];
				int i_332_ = is_313_[i_330_];
				if (i_331_ == 0 && i_332_ == 0) {
					class81.aShortArray1102[i_330_] = (short) (aByteArrayArray7967[i][i_311_] - aByteArrayArray7958[i][i_311_]);
				} else if (i_331_ == 0 && i_332_ == anInt3398) {
					class81.aShortArray1102[i_330_] = (short) (aByteArrayArray7967[i][i_311_ + 1] - aByteArrayArray7958[i][i_311_ + 1]);
				} else if (i_331_ == anInt3398 && i_332_ == anInt3398) {
					class81.aShortArray1102[i_330_] = (short) (aByteArrayArray7967[i + 1][i_311_ + 1] - aByteArrayArray7958[i + 1][i_311_ + 1]);
				} else if (i_331_ == anInt3398 && i_332_ == 0) {
					class81.aShortArray1102[i_330_] = (short) (aByteArrayArray7967[i + 1][i_311_] - aByteArrayArray7958[i + 1][i_311_]);
				} else {
					int i_333_ = (aByteArrayArray7967[i][i_311_] - aByteArrayArray7958[i][i_311_]) * (anInt3398 - i_331_) + (aByteArrayArray7967[i + 1][i_311_] - aByteArrayArray7958[i + 1][i_311_]) * i_331_;
					int i_334_ = (aByteArrayArray7967[i][i_311_ + 1] - aByteArrayArray7958[i][i_311_ + 1]) * (anInt3398 - i_331_) + (aByteArrayArray7967[i + 1][i_311_ + 1] - aByteArrayArray7958[i + 1][i_311_ + 1]) * i_331_;
					class81.aShortArray1102[i_330_] = (short) (i_333_ * (anInt3398 - i_332_) + i_334_ * i_332_ >> 2 * anInt3410);
				}
				int i_335_ = (i << anInt3410) + i_331_;
				int i_336_ = (i_311_ << anInt3410) + i_332_;
				class81.aShortArray1098[i_330_] = (short) i_331_;
				class81.aShortArray1107[i_330_] = (short) i_332_;
				class81.aShortArray1099[i_330_] = (short) (this.method3260(i_336_, -114, i_335_) + (is_312_ != null ? is_312_[i_330_] : 0));
				if (class81.aShortArray1102[i_330_] < 2) {
					class81.aShortArray1102[i_330_] = (short) 2;
				}
			}
			boolean bool_337_ = false;
			int i_338_ = 0;
			for (int i_339_ = 0; i_339_ < i_329_; i_339_++) {
				if (is_318_[i_339_] >= 0 || is_319_ != null && is_319_[i_339_] >= 0) {
					i_338_++;
				}
				int i_340_ = is_320_[i_339_];
				if (i_340_ != -1) {
					Class91 class91 = aPureJavaToolkit7970.aD1543.method10(i_340_, -8217);
					if (!class91.aBoolean1223) {
						bool_337_ = true;
						if (method3266(class91.aByte1214) || class91.aByte1211 != 0 || class91.aByte1203 != 0) {
							class81.aByte1108 |= 0x4;
						}
					}
				}
			}
			class81.anIntArray1101 = new int[i_338_];
			if (is_319_ != null) {
				class81.anIntArray1103 = new int[i_338_];
			}
			class81.aShortArray1100 = new short[i_338_];
			class81.aShortArray1105 = new short[i_338_];
			class81.aShortArray1104 = new short[i_338_];
			if (bool_337_) {
				class81.aShortArray1095 = new short[i_338_];
				class81.aShortArray1096 = new short[i_338_];
			}
			for (int i_341_ = 0; i_341_ < i_329_; i_341_++) {
				if (is_318_[i_341_] >= 0 || is_319_ != null && is_319_[i_341_] >= 0) {
					if (is_318_[i_341_] >= 0) {
						class81.anIntArray1101[class81.aShort1097] = Node_Sub15_Sub2.method2560(5310, is_318_[i_341_]);
					} else {
						class81.anIntArray1101[class81.aShort1097] = -1;
					}
					if (is_319_ != null) {
						if (is_319_[i_341_] != -1) {
							class81.anIntArray1103[class81.aShort1097] = Node_Sub15_Sub2.method2560(5310, is_319_[i_341_]);
						} else {
							class81.anIntArray1103[class81.aShort1097] = -1;
						}
					}
					class81.aShortArray1100[class81.aShort1097] = (short) is_315_[i_341_];
					class81.aShortArray1105[class81.aShort1097] = (short) is_316_[i_341_];
					class81.aShortArray1104[class81.aShort1097] = (short) is_317_[i_341_];
					if (bool_337_) {
						if (is_320_[i_341_] != -1 && !aPureJavaToolkit7970.aD1543.method10(is_320_[i_341_], -8217).aBoolean1223) {
							class81.aShortArray1095[class81.aShort1097] = (short) is_320_[i_341_];
							class81.aShortArray1096[class81.aShort1097] = (short) is_321_[i_341_];
						} else {
							class81.aShortArray1095[class81.aShort1097] = (short) -1;
						}
					}
					class81.aShort1097++;
				}
			}
			aClass81ArrayArray7978[i][i_311_] = class81;
		} else if (is_318_[0] >= 0 || is_319_ != null && is_319_[0] >= 0) {
			Class100 class100 = new Class100();
			int i_342_ = is_318_[0];
			int i_343_ = is_320_[0];
			if (is_319_ != null) {
				class100.anInt1299 = Node_Sub18.method2607((byte) 31, aByteArrayArray7967[i][i_311_] - aByteArrayArray7958[i][i_311_], Node_Sub15_Sub2.method2560(5310, is_319_[0]));
				if (i_342_ == -1) {
					class100.aByte1297 |= 0x2;
				}
			}
			if (anIntArrayArray3407[i][i_311_] == anIntArrayArray3407[i + 1][i_311_] && anIntArrayArray3407[i][i_311_] == anIntArrayArray3407[i + 1][i_311_ + 1] && anIntArrayArray3407[i][i_311_] == anIntArrayArray3407[i][i_311_ + 1]) {
				class100.aByte1297 |= 0x1;
			}
			Class91 class91 = null;
			if (i_343_ != -1) {
				class91 = aPureJavaToolkit7970.aD1543.method10(i_343_, -8217);
			}
			if (class91 != null && (class100.aByte1297 & 0x2) == 0 && !class91.aBoolean1223) {
				class100.aShort1300 = (short) (aByteArrayArray7967[i][i_311_] - aByteArrayArray7958[i][i_311_]);
				class100.aShort1295 = (short) (aByteArrayArray7967[i + 1][i_311_] - aByteArrayArray7958[i + 1][i_311_]);
				class100.aShort1298 = (short) (aByteArrayArray7967[i + 1][i_311_ + 1] - aByteArrayArray7958[i + 1][i_311_ + 1]);
				class100.aShort1296 = (short) (aByteArrayArray7967[i][i_311_ + 1] - aByteArrayArray7958[i][i_311_ + 1]);
				class100.aShort1294 = (short) i_343_;
				if (method3266(class91.aByte1214) || class91.aByte1211 != 0 || class91.aByte1203 != 0) {
					class100.aByte1297 |= 0x4;
				}
			} else {
				short s = Node_Sub15_Sub2.method2560(5310, i_342_);
				class100.aShort1300 = (short) Node_Sub18.method2607((byte) 31, aByteArrayArray7967[i][i_311_] - aByteArrayArray7958[i][i_311_], s);
				class100.aShort1295 = (short) Node_Sub18.method2607((byte) 31, aByteArrayArray7967[i + 1][i_311_] - aByteArrayArray7958[i + 1][i_311_], s);
				class100.aShort1298 = (short) Node_Sub18.method2607((byte) 31, aByteArrayArray7967[i + 1][i_311_ + 1] - aByteArrayArray7958[i + 1][i_311_ + 1], s);
				class100.aShort1296 = (short) Node_Sub18.method2607((byte) 31, aByteArrayArray7967[i][i_311_ + 1] - aByteArrayArray7958[i][i_311_ + 1], s);
				class100.aShort1294 = (short) -1;
			}
			aClass100ArrayArray7965[i][i_311_] = class100;
		}
	}
	
	final void ka(int i, int i_344_, int i_345_) {
		if (aByteArrayArray7958[i][i_344_] < i_345_) {
			aByteArrayArray7958[i][i_344_] = (byte) i_345_;
		}
	}
	
	private final void method3270(int i, int i_346_, boolean bool, Class374 class374, Class185 class185, int[] is, int[] is_347_, int[] is_348_, int[] is_349_, int i_350_) {
		Class276 class276 = aClass276ArrayArray7968[i][i_346_];
		if (class276 != null) {
			if ((class276.aByte3503 & 0x2) == 0) {
				if (i_350_ != 0) {
					if ((class276.aByte3503 & 0x4) != 0) {
						if ((i_350_ & 0x1) != 0) {
							return;
						}
					} else if ((i_350_ & 0x2) != 0) {
						return;
					}
				}
				int i_351_ = i * anInt3398;
				int i_352_ = i_351_ + anInt3398;
				int i_353_ = i_346_ * anInt3398;
				int i_354_ = i_353_ + anInt3398;
				int i_355_ = 0;
				int i_356_ = 0;
				int i_357_ = 0;
				int i_358_ = 0;
				float f;
				float f_359_;
				float f_360_;
				float f_361_;
				int i_362_;
				int i_363_;
				int i_364_;
				int i_365_;
				int i_366_;
				int i_367_;
				int i_368_;
				int i_369_;
				if ((class276.aByte3503 & 0x1) != 0 && !bool) {
					int i_370_ = anIntArrayArray3407[i][i_346_];
					float f_371_ = aFloat7976 * (float) i_370_;
					if (anInt7963 == -1) {
						f = aFloat7979 + (aFloat7961 * (float) i_351_ + f_371_ + aFloat7962 * (float) i_353_);
						if (f <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_359_ = aFloat7979 + (aFloat7961 * (float) i_352_ + f_371_ + aFloat7962 * (float) i_353_);
						if (f_359_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_360_ = aFloat7979 + (aFloat7961 * (float) i_352_ + f_371_ + aFloat7962 * (float) i_354_);
						if (f_360_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_361_ = aFloat7979 + (aFloat7961 * (float) i_351_ + f_371_ + aFloat7962 * (float) i_354_);
						if (f_361_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
					} else {
						f = aFloat7979 + (aFloat7961 * (float) i_351_ + f_371_ + aFloat7962 * (float) i_353_);
						f_359_ = aFloat7979 + (aFloat7961 * (float) i_352_ + f_371_ + aFloat7962 * (float) i_353_);
						f_360_ = aFloat7979 + (aFloat7961 * (float) i_352_ + f_371_ + aFloat7962 * (float) i_354_);
						f_361_ = aFloat7979 + (aFloat7961 * (float) i_351_ + f_371_ + aFloat7962 * (float) i_354_);
					}
					if (class374.aBoolean4621) {
						int i_372_ = (int) (f - (float) class374.anInt4618);
						if (i_372_ > 0) {
							i_355_ = i_372_;
							if (i_355_ > 255) {
								i_355_ = 255;
							}
						}
						i_372_ = (int) (f_359_ - (float) class374.anInt4618);
						if (i_372_ > 0) {
							i_356_ = i_372_;
							if (i_356_ > 255) {
								i_356_ = 255;
							}
						}
						i_372_ = (int) (f_360_ - (float) class374.anInt4618);
						if (i_372_ > 0) {
							i_357_ = i_372_;
							if (i_357_ > 255) {
								i_357_ = 255;
							}
						}
						i_372_ = (int) (f_361_ - (float) class374.anInt4618);
						if (i_372_ > 0) {
							i_358_ = i_372_;
							if (i_358_ > 255) {
								i_358_ = 255;
							}
						}
					}
					float f_373_ = aFloat7966 * (float) i_370_;
					float f_374_ = aFloat7960 * (float) i_370_;
					if (anInt7963 == -1) {
						float f_375_ = aFloat7975 + (aFloat7974 * (float) i_351_ + f_373_ + aFloat7959 * (float) i_353_);
						i_362_ = class185.anInt2216 + (int) (f_375_ * (float) aPureJavaToolkit7970.anInt6785 / f);
						float f_376_ = aFloat7973 + (aFloat7971 * (float) i_351_ + f_374_ + aFloat7964 * (float) i_353_);
						i_363_ = class185.anInt2213 + (int) (f_376_ * (float) aPureJavaToolkit7970.anInt6763 / f);
						float f_377_ = aFloat7975 + (aFloat7974 * (float) i_352_ + f_373_ + aFloat7959 * (float) i_353_);
						i_364_ = class185.anInt2216 + (int) (f_377_ * (float) aPureJavaToolkit7970.anInt6785 / f_359_);
						float f_378_ = aFloat7973 + (aFloat7971 * (float) i_352_ + f_374_ + aFloat7964 * (float) i_353_);
						i_365_ = class185.anInt2213 + (int) (f_378_ * (float) aPureJavaToolkit7970.anInt6763 / f_359_);
						float f_379_ = aFloat7975 + (aFloat7974 * (float) i_352_ + f_373_ + aFloat7959 * (float) i_354_);
						i_366_ = class185.anInt2216 + (int) (f_379_ * (float) aPureJavaToolkit7970.anInt6785 / f_360_);
						float f_380_ = aFloat7973 + (aFloat7971 * (float) i_352_ + f_374_ + aFloat7964 * (float) i_354_);
						i_367_ = class185.anInt2213 + (int) (f_380_ * (float) aPureJavaToolkit7970.anInt6763 / f_360_);
						float f_381_ = aFloat7975 + (aFloat7974 * (float) i_351_ + f_373_ + aFloat7959 * (float) i_354_);
						i_368_ = class185.anInt2216 + (int) (f_381_ * (float) aPureJavaToolkit7970.anInt6785 / f_361_);
						float f_382_ = aFloat7973 + (aFloat7971 * (float) i_351_ + f_374_ + aFloat7964 * (float) i_354_);
						i_369_ = class185.anInt2213 + (int) (f_382_ * (float) aPureJavaToolkit7970.anInt6763 / f_361_);
					} else {
						float f_383_ = aFloat7975 + (aFloat7974 * (float) i_351_ + f_373_ + aFloat7959 * (float) i_353_);
						i_362_ = class185.anInt2216 + (int) (f_383_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_384_ = aFloat7973 + (aFloat7971 * (float) i_351_ + f_374_ + aFloat7964 * (float) i_353_);
						i_363_ = class185.anInt2213 + (int) (f_384_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_385_ = aFloat7975 + (aFloat7974 * (float) i_352_ + f_373_ + aFloat7959 * (float) i_353_);
						i_364_ = class185.anInt2216 + (int) (f_385_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_386_ = aFloat7973 + (aFloat7971 * (float) i_352_ + f_374_ + aFloat7964 * (float) i_353_);
						i_365_ = class185.anInt2213 + (int) (f_386_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_387_ = aFloat7975 + (aFloat7974 * (float) i_352_ + f_373_ + aFloat7959 * (float) i_354_);
						i_366_ = class185.anInt2216 + (int) (f_387_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_388_ = aFloat7973 + (aFloat7971 * (float) i_352_ + f_374_ + aFloat7964 * (float) i_354_);
						i_367_ = class185.anInt2213 + (int) (f_388_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_389_ = aFloat7975 + (aFloat7974 * (float) i_351_ + f_373_ + aFloat7959 * (float) i_354_);
						i_368_ = class185.anInt2216 + (int) (f_389_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_390_ = aFloat7973 + (aFloat7971 * (float) i_351_ + f_374_ + aFloat7964 * (float) i_354_);
						i_369_ = class185.anInt2213 + (int) (f_390_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
					}
				} else {
					int i_391_ = anIntArrayArray3407[i][i_346_];
					int i_392_ = anIntArrayArray3407[i + 1][i_346_];
					int i_393_ = anIntArrayArray3407[i + 1][i_346_ + 1];
					int i_394_ = anIntArrayArray3407[i][i_346_ + 1];
					if (anInt7963 == -1) {
						f = aFloat7979 + (aFloat7961 * (float) i_351_ + aFloat7976 * (float) i_391_ + aFloat7962 * (float) i_353_);
						if (f <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_359_ = aFloat7979 + (aFloat7961 * (float) i_352_ + aFloat7976 * (float) i_392_ + aFloat7962 * (float) i_353_);
						if (f_359_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_360_ = aFloat7979 + (aFloat7961 * (float) i_352_ + aFloat7976 * (float) i_393_ + aFloat7962 * (float) i_354_);
						if (f_360_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						f_361_ = aFloat7979 + (aFloat7961 * (float) i_351_ + aFloat7976 * (float) i_394_ + aFloat7962 * (float) i_354_);
						if (f_361_ <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
					} else {
						f = aFloat7979 + (aFloat7961 * (float) i_351_ + aFloat7976 * (float) i_391_ + aFloat7962 * (float) i_353_);
						f_359_ = aFloat7979 + (aFloat7961 * (float) i_352_ + aFloat7976 * (float) i_392_ + aFloat7962 * (float) i_353_);
						f_360_ = aFloat7979 + (aFloat7961 * (float) i_352_ + aFloat7976 * (float) i_393_ + aFloat7962 * (float) i_354_);
						f_361_ = aFloat7979 + (aFloat7961 * (float) i_351_ + aFloat7976 * (float) i_394_ + aFloat7962 * (float) i_354_);
					}
					if (bool) {
						int i_395_ = (int) (f - (float) class374.anInt4618);
						if (i_395_ > 255) {
							i_395_ = 255;
						}
						if (i_395_ > 0) {
							i_355_ = i_395_;
							int i_396_ = class276.aShort3508 * i_395_ / 255;
							if (i_396_ > 0) {
								i_391_ -= i_396_;
							}
						}
						i_395_ = (int) (f_359_ - (float) class374.anInt4618);
						if (i_395_ > 255) {
							i_395_ = 255;
						}
						if (i_395_ > 0) {
							i_356_ = i_395_;
							int i_397_ = class276.aShort3498 * i_395_ / 255;
							if (i_397_ > 0) {
								i_392_ -= i_397_;
							}
						}
						i_395_ = (int) (f_360_ - (float) class374.anInt4618);
						if (i_395_ > 255) {
							i_395_ = 255;
						}
						if (i_395_ > 0) {
							i_357_ = i_395_;
							int i_398_ = class276.aShort3505 * i_395_ / 255;
							if (i_398_ > 0) {
								i_393_ -= i_398_;
							}
						}
						i_395_ = (int) (f_361_ - (float) class374.anInt4618);
						if (i_395_ > 255) {
							i_395_ = 255;
						}
						if (i_395_ > 0) {
							i_358_ = i_395_;
							int i_399_ = class276.aShort3499 * i_395_ / 255;
							if (i_399_ > 0) {
								i_394_ -= i_399_;
							}
						}
					} else if (class374.aBoolean4621) {
						int i_400_ = (int) (f - (float) class374.anInt4618);
						if (i_400_ > 0) {
							i_355_ = i_400_;
							if (i_355_ > 255) {
								i_355_ = 255;
							}
						}
						i_400_ = (int) (f_359_ - (float) class374.anInt4618);
						if (i_400_ > 0) {
							i_356_ = i_400_;
							if (i_356_ > 255) {
								i_356_ = 255;
							}
						}
						i_400_ = (int) (f_360_ - (float) class374.anInt4618);
						if (i_400_ > 0) {
							i_357_ = i_400_;
							if (i_357_ > 255) {
								i_357_ = 255;
							}
						}
						i_400_ = (int) (f_361_ - (float) class374.anInt4618);
						if (i_400_ > 0) {
							i_358_ = i_400_;
							if (i_358_ > 255) {
								i_358_ = 255;
							}
						}
					}
					if (anInt7963 == -1) {
						float f_401_ = aFloat7975 + (aFloat7974 * (float) i_351_ + aFloat7966 * (float) i_391_ + aFloat7959 * (float) i_353_);
						i_362_ = class185.anInt2216 + (int) (f_401_ * (float) aPureJavaToolkit7970.anInt6785 / f);
						float f_402_ = aFloat7973 + (aFloat7971 * (float) i_351_ + aFloat7960 * (float) i_391_ + aFloat7964 * (float) i_353_);
						i_363_ = class185.anInt2213 + (int) (f_402_ * (float) aPureJavaToolkit7970.anInt6763 / f);
						float f_403_ = aFloat7975 + (aFloat7974 * (float) i_352_ + aFloat7966 * (float) i_392_ + aFloat7959 * (float) i_353_);
						i_364_ = class185.anInt2216 + (int) (f_403_ * (float) aPureJavaToolkit7970.anInt6785 / f_359_);
						float f_404_ = aFloat7973 + (aFloat7971 * (float) i_352_ + aFloat7960 * (float) i_392_ + aFloat7964 * (float) i_353_);
						i_365_ = class185.anInt2213 + (int) (f_404_ * (float) aPureJavaToolkit7970.anInt6763 / f_359_);
						float f_405_ = aFloat7975 + (aFloat7974 * (float) i_352_ + aFloat7966 * (float) i_393_ + aFloat7959 * (float) i_354_);
						i_366_ = class185.anInt2216 + (int) (f_405_ * (float) aPureJavaToolkit7970.anInt6785 / f_360_);
						float f_406_ = aFloat7973 + (aFloat7971 * (float) i_352_ + aFloat7960 * (float) i_393_ + aFloat7964 * (float) i_354_);
						i_367_ = class185.anInt2213 + (int) (f_406_ * (float) aPureJavaToolkit7970.anInt6763 / f_360_);
						float f_407_ = aFloat7975 + (aFloat7974 * (float) i_351_ + aFloat7966 * (float) i_394_ + aFloat7959 * (float) i_354_);
						i_368_ = class185.anInt2216 + (int) (f_407_ * (float) aPureJavaToolkit7970.anInt6785 / f_361_);
						float f_408_ = aFloat7973 + (aFloat7971 * (float) i_351_ + aFloat7960 * (float) i_394_ + aFloat7964 * (float) i_354_);
						i_369_ = class185.anInt2213 + (int) (f_408_ * (float) aPureJavaToolkit7970.anInt6763 / f_361_);
					} else {
						float f_409_ = aFloat7975 + (aFloat7974 * (float) i_351_ + aFloat7966 * (float) i_391_ + aFloat7959 * (float) i_353_);
						i_362_ = class185.anInt2216 + (int) (f_409_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_410_ = aFloat7973 + (aFloat7971 * (float) i_351_ + aFloat7960 * (float) i_391_ + aFloat7964 * (float) i_353_);
						i_363_ = class185.anInt2213 + (int) (f_410_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_411_ = aFloat7975 + (aFloat7974 * (float) i_352_ + aFloat7966 * (float) i_392_ + aFloat7959 * (float) i_353_);
						i_364_ = class185.anInt2216 + (int) (f_411_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_412_ = aFloat7973 + (aFloat7971 * (float) i_352_ + aFloat7960 * (float) i_392_ + aFloat7964 * (float) i_353_);
						i_365_ = class185.anInt2213 + (int) (f_412_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_413_ = aFloat7975 + (aFloat7974 * (float) i_352_ + aFloat7966 * (float) i_393_ + aFloat7959 * (float) i_354_);
						i_366_ = class185.anInt2216 + (int) (f_413_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_414_ = aFloat7973 + (aFloat7971 * (float) i_352_ + aFloat7960 * (float) i_393_ + aFloat7964 * (float) i_354_);
						i_367_ = class185.anInt2213 + (int) (f_414_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						float f_415_ = aFloat7975 + (aFloat7974 * (float) i_351_ + aFloat7966 * (float) i_394_ + aFloat7959 * (float) i_354_);
						i_368_ = class185.anInt2216 + (int) (f_415_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						float f_416_ = aFloat7973 + (aFloat7971 * (float) i_351_ + aFloat7960 * (float) i_394_ + aFloat7964 * (float) i_354_);
						i_369_ = class185.anInt2213 + (int) (f_416_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
					}
				}
				boolean bool_417_ = class276.aShort3500 != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(class276.aShort3500, -8217).aByte1214);
				if (anInt7963 == -1) {
					int i_418_ = i_356_ + i_357_ + i_358_;
					if ((i_366_ - i_368_) * (i_365_ - i_369_) - (i_367_ - i_369_) * (i_364_ - i_368_) > 0) {
						class185.aBoolean2217 = i_366_ < 0 || i_368_ < 0 || i_364_ < 0 || i_366_ > class185.anInt2222 || i_368_ > class185.anInt2222 || i_364_ > class185.anInt2222;
						if (i_418_ < 765) {
							if (i_418_ > 0) {
								if (class276.aShort3500 >= 0) {
									int i_419_ = -16777216;
									if (bool_417_) {
										i_419_ = -1694498816;
									}
									class185.method1859((float) i_367_, (float) i_369_, (float) i_365_, (float) i_366_, (float) i_368_, (float) i_364_, f_360_, f_361_, f_359_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_419_ | class276.anInt3501 & 0xffffff, i_419_ | class276.anInt3504 & 0xffffff, i_419_ | class276.anInt3507 & 0xffffff, class374.anInt4611, i_357_, i_358_, i_356_, class276.aShort3500);
								} else {
									if (bool_417_) {
										class185.anInt2220 = 100;
									}
									class185.method1850((float) i_367_, (float) i_369_, (float) i_365_, (float) i_366_, (float) i_368_, (float) i_364_, (float) (int) f_360_, (float) (int) f_361_, (float) (int) f_359_, Class249.method3086(i_357_ << 24 | class374.anInt4611, class276.anInt3501, (byte) -56), Class249.method3086(i_358_ << 24 | class374.anInt4611, class276.anInt3504, (byte) -56), Class249.method3086(i_356_ << 24 | class374.anInt4611, class276.anInt3507, (byte) -56));
									class185.anInt2220 = 0;
								}
							} else if (class276.aShort3500 >= 0) {
								int i_420_ = -16777216;
								if (bool_417_) {
									i_420_ = -1694498816;
								}
								class185.method1859((float) i_367_, (float) i_369_, (float) i_365_, (float) i_366_, (float) i_368_, (float) i_364_, f_360_, f_361_, f_359_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_420_ | class276.anInt3501 & 0xffffff, i_420_ | class276.anInt3504 & 0xffffff, i_420_ | class276.anInt3507 & 0xffffff, 0, 0, 0, 0, class276.aShort3500);
							} else {
								if (bool_417_) {
									class185.anInt2220 = 100;
								}
								class185.method1850((float) i_367_, (float) i_369_, (float) i_365_, (float) i_366_, (float) i_368_, (float) i_364_, (float) (int) f_360_, (float) (int) f_361_, (float) (int) f_359_, class276.anInt3501, class276.anInt3504, class276.anInt3507);
								class185.anInt2220 = 0;
							}
						} else {
							class185.method1867((float) i_367_, (float) i_369_, (float) i_365_, (float) i_366_, (float) i_368_, (float) i_364_, (float) (int) f_360_, (float) (int) f_361_, (float) (int) f_359_, class374.anInt4611);
						}
					}
					i_418_ = i_355_ + i_356_ + i_358_;
					if ((i_362_ - i_364_) * (i_369_ - i_365_) - (i_363_ - i_365_) * (i_368_ - i_364_) > 0) {
						class185.aBoolean2217 = i_362_ < 0 || i_364_ < 0 || i_368_ < 0 || i_362_ > class185.anInt2222 || i_364_ > class185.anInt2222 || i_368_ > class185.anInt2222;
						if (i_418_ < 765) {
							if (bool_417_) {
								class185.anInt2220 = -1694498816;
							}
							if (i_418_ > 0) {
								if (class276.aShort3500 >= 0) {
									int i_421_ = -16777216;
									if (bool_417_) {
										i_421_ = -1694498816;
									}
									class185.method1859((float) i_363_, (float) i_365_, (float) i_369_, (float) i_362_, (float) i_364_, (float) i_368_, f, f_359_, f_361_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_421_ | class276.anInt3502 & 0xffffff, i_421_ | class276.anInt3507 & 0xffffff, i_421_ | class276.anInt3504 & 0xffffff, class374.anInt4611, i_355_, i_356_, i_358_, class276.aShort3500);
								} else {
									if (bool_417_) {
										class185.anInt2220 = 100;
									}
									class185.method1850((float) i_363_, (float) i_365_, (float) i_369_, (float) i_362_, (float) i_364_, (float) i_368_, (float) (int) f, (float) (int) f_359_, (float) (int) f_361_, Class249.method3086(i_355_ << 24 | class374.anInt4611, class276.anInt3502, (byte) -56), Class249.method3086(i_356_ << 24 | class374.anInt4611, class276.anInt3507, (byte) -56), Class249.method3086(i_358_ << 24 | class374.anInt4611, class276.anInt3504, (byte) -56));
									class185.anInt2220 = 0;
								}
							} else if (class276.aShort3500 >= 0) {
								int i_422_ = -16777216;
								if (bool_417_) {
									i_422_ = -1694498816;
								}
								class185.method1859((float) i_363_, (float) i_365_, (float) i_369_, (float) i_362_, (float) i_364_, (float) i_368_, f, f_359_, f_361_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_422_ | class276.anInt3502 & 0xffffff, i_422_ | class276.anInt3507 & 0xffffff, i_422_ | class276.anInt3504 & 0xffffff, 0, 0, 0, 0, class276.aShort3500);
							} else {
								if (bool_417_) {
									class185.anInt2220 = 100;
								}
								class185.method1850((float) i_363_, (float) i_365_, (float) i_369_, (float) i_362_, (float) i_364_, (float) i_368_, (float) (int) f, (float) (int) f_359_, (float) (int) f_361_, class276.anInt3502, class276.anInt3507, class276.anInt3504);
								class185.anInt2220 = 0;
							}
						} else {
							class185.method1867((float) i_363_, (float) i_365_, (float) i_369_, (float) i_362_, (float) i_364_, (float) i_368_, (float) (int) f, (float) (int) f_359_, (float) (int) f_361_, class374.anInt4611);
						}
					}
				} else {
					int i_423_ = i_356_ + i_357_ + i_358_;
					if ((i_366_ - i_368_) * (i_365_ - i_369_) - (i_367_ - i_369_) * (i_364_ - i_368_) > 0) {
						class185.aBoolean2217 = i_366_ < 0 || i_368_ < 0 || i_364_ < 0 || i_366_ > class185.anInt2222 || i_368_ > class185.anInt2222 || i_364_ > class185.anInt2222;
						if (i_423_ < 765) {
							if (bool_417_) {
								class185.anInt2220 = -1694498816;
							}
							if (i_423_ > 0) {
								if (class276.aShort3500 >= 0) {
									int i_424_ = -16777216;
									if (bool_417_) {
										i_424_ = -1694498816;
									}
									class185.method1859((float) i_367_, (float) i_369_, (float) i_365_, (float) i_366_, (float) i_368_, (float) i_364_, f_360_, f_361_, f_359_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_424_ | class276.anInt3501 & 0xffffff, i_424_ | class276.anInt3504 & 0xffffff, i_424_ | class276.anInt3507 & 0xffffff, class374.anInt4611, i_357_, i_358_, i_356_, class276.aShort3500);
								} else {
									if (bool_417_) {
										class185.anInt2220 = 100;
									}
									class185.method1850((float) i_367_, (float) i_369_, (float) i_365_, (float) i_366_, (float) i_368_, (float) i_364_, (float) (int) f_360_, (float) (int) f_361_, (float) (int) f_359_, Class249.method3086(i_357_ << 24 | class374.anInt4611, class276.anInt3501, (byte) -56), Class249.method3086(i_358_ << 24 | class374.anInt4611, class276.anInt3504, (byte) -56), Class249.method3086(i_356_ << 24 | class374.anInt4611, class276.anInt3507, (byte) -56));
									class185.anInt2220 = 0;
								}
							} else if (class276.aShort3500 >= 0) {
								int i_425_ = -16777216;
								if (bool_417_) {
									i_425_ = -1694498816;
								}
								class185.method1859((float) i_367_, (float) i_369_, (float) i_365_, (float) i_366_, (float) i_368_, (float) i_364_, f_360_, f_361_, f_359_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_425_ | class276.anInt3501 & 0xffffff, i_425_ | class276.anInt3504 & 0xffffff, i_425_ | class276.anInt3507 & 0xffffff, 0, 0, 0, 0, class276.aShort3500);
							} else {
								if (bool_417_) {
									class185.anInt2220 = 100;
								}
								class185.method1850((float) i_367_, (float) i_369_, (float) i_365_, (float) i_366_, (float) i_368_, (float) i_364_, (float) (int) f_360_, (float) (int) f_361_, (float) (int) f_359_, class276.anInt3501, class276.anInt3504, class276.anInt3507);
								class185.anInt2220 = 0;
							}
						} else {
							class185.method1867((float) i_367_, (float) i_369_, (float) i_365_, (float) i_366_, (float) i_368_, (float) i_364_, (float) (int) f_360_, (float) (int) f_361_, (float) (int) f_359_, class374.anInt4611);
						}
					}
					i_423_ = i_355_ + i_356_ + i_358_;
					if ((i_362_ - i_364_) * (i_369_ - i_365_) - (i_363_ - i_365_) * (i_368_ - i_364_) > 0) {
						class185.aBoolean2217 = i_362_ < 0 || i_364_ < 0 || i_368_ < 0 || i_362_ > class185.anInt2222 || i_364_ > class185.anInt2222 || i_368_ > class185.anInt2222;
						if (i_423_ < 765) {
							if (bool_417_) {
								class185.anInt2220 = -1694498816;
							}
							if (i_423_ > 0) {
								if (class276.aShort3500 >= 0) {
									int i_426_ = -16777216;
									if (bool_417_) {
										i_426_ = -1694498816;
									}
									class185.method1859((float) i_363_, (float) i_365_, (float) i_369_, (float) i_362_, (float) i_364_, (float) i_368_, f, f_359_, f_361_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_426_ | class276.anInt3502 & 0xffffff, i_426_ | class276.anInt3507 & 0xffffff, i_426_ | class276.anInt3504 & 0xffffff, class374.anInt4611, i_355_, i_356_, i_358_, class276.aShort3500);
								} else {
									if (bool_417_) {
										class185.anInt2220 = 100;
									}
									class185.method1850((float) i_363_, (float) i_365_, (float) i_369_, (float) i_362_, (float) i_364_, (float) i_368_, (float) (int) f, (float) (int) f_359_, (float) (int) f_361_, Class249.method3086(i_355_ << 24 | class374.anInt4611, class276.anInt3502, (byte) -56), Class249.method3086(i_356_ << 24 | class374.anInt4611, class276.anInt3507, (byte) -56), Class249.method3086(i_358_ << 24 | class374.anInt4611, class276.anInt3504, (byte) -56));
									class185.anInt2220 = 0;
								}
							} else if (class276.aShort3500 >= 0) {
								int i_427_ = -16777216;
								if (bool_417_) {
									i_427_ = -1694498816;
								}
								class185.method1859((float) i_363_, (float) i_365_, (float) i_369_, (float) i_362_, (float) i_364_, (float) i_368_, f, f_359_, f_361_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_427_ | class276.anInt3502 & 0xffffff, i_427_ | class276.anInt3507 & 0xffffff, i_427_ | class276.anInt3504 & 0xffffff, 0, 0, 0, 0, class276.aShort3500);
							} else {
								if (bool_417_) {
									class185.anInt2220 = 100;
								}
								class185.method1850((float) i_363_, (float) i_365_, (float) i_369_, (float) i_362_, (float) i_364_, (float) i_368_, (float) (int) f, (float) (int) f_359_, (float) (int) f_361_, class276.anInt3502, class276.anInt3507, class276.anInt3504);
								class185.anInt2220 = 0;
							}
						} else {
							class185.method1867((float) i_363_, (float) i_365_, (float) i_369_, (float) i_362_, (float) i_364_, (float) i_368_, (float) (int) f, (float) (int) f_359_, (float) (int) f_361_, class374.anInt4611);
						}
					}
				}
			}
		} else {
			Class358 class358 = aClass358ArrayArray7972[i][i_346_];
			if (class358 != null) {
				if (i_350_ != 0) {
					if ((class358.aByte4455 & 0x4) != 0) {
						if ((i_350_ & 0x1) != 0) {
							return;
						}
					} else if ((i_350_ & 0x2) != 0) {
						return;
					}
				}
				if (anInt7963 == -1) {
					for (int i_428_ = 0; i_428_ < class358.aShort4447; i_428_++) {
						int i_429_ = class358.aShortArray4453[i_428_] + (i << anInt3410);
						int i_430_ = class358.aShortArray4454[i_428_];
						int i_431_ = class358.aShortArray4451[i_428_] + (i_346_ << anInt3410);
						float f = aFloat7979 + (aFloat7961 * (float) i_429_ + aFloat7976 * (float) i_430_ + aFloat7962 * (float) i_431_);
						if (f <= (float) aPureJavaToolkit7970.anInt6798) {
							return;
						}
						is_349_[i_428_] = 0;
						if (bool) {
							int i_432_ = (int) (f - (float) class374.anInt4618);
							if (i_432_ > 255) {
								i_432_ = 255;
							}
							if (i_432_ > 0) {
								is_349_[i_428_] = i_432_;
								int i_433_ = class358.aShortArray4448[i_428_] * i_432_ / 255;
								if (i_433_ > 0) {
									i_430_ -= i_433_;
								}
							}
						} else if (class374.aBoolean4621) {
							int i_434_ = (int) (f - (float) class374.anInt4618);
							if (i_434_ > 0) {
								is_349_[i_428_] = i_434_;
								if (is_349_[i_428_] > 255) {
									is_349_[i_428_] = 255;
								}
							}
						}
						float f_435_ = aFloat7975 + (aFloat7974 * (float) i_429_ + aFloat7966 * (float) i_430_ + aFloat7959 * (float) i_431_);
						float f_436_ = aFloat7973 + (aFloat7971 * (float) i_429_ + aFloat7960 * (float) i_430_ + aFloat7964 * (float) i_431_);
						is[i_428_] = class185.anInt2216 + (int) (f_435_ * (float) aPureJavaToolkit7970.anInt6785 / f);
						is_347_[i_428_] = class185.anInt2213 + (int) (f_436_ * (float) aPureJavaToolkit7970.anInt6763 / f);
						is_348_[i_428_] = (int) f;
					}
				} else {
					for (int i_437_ = 0; i_437_ < class358.aShort4447; i_437_++) {
						int i_438_ = class358.aShortArray4453[i_437_] + (i << anInt3410);
						int i_439_ = class358.aShortArray4454[i_437_];
						int i_440_ = class358.aShortArray4451[i_437_] + (i_346_ << anInt3410);
						float f = aFloat7979 + (aFloat7961 * (float) i_438_ + aFloat7976 * (float) i_439_ + aFloat7962 * (float) i_440_);
						is_349_[i_437_] = 0;
						if (bool) {
							int i_441_ = anInt7963 - class374.anInt4618;
							if (i_441_ > 255) {
								i_441_ = 255;
							}
							if (i_441_ > 0) {
								is_349_[i_437_] = i_441_;
								int i_442_ = class358.aShortArray4448[i_437_] * i_441_ / 255;
								if (i_442_ > 0) {
									i_439_ -= i_442_;
								}
							}
						} else if (class374.aBoolean4621) {
							int i_443_ = anInt7963 - class374.anInt4618;
							if (i_443_ > 0) {
								is_349_[i_437_] = i_443_;
								if (is_349_[i_437_] > 255) {
									is_349_[i_437_] = 255;
								}
							}
						}
						float f_444_ = aFloat7975 + (aFloat7974 * (float) i_438_ + aFloat7966 * (float) i_439_ + aFloat7959 * (float) i_440_);
						float f_445_ = aFloat7973 + (aFloat7971 * (float) i_438_ + aFloat7960 * (float) i_439_ + aFloat7964 * (float) i_440_);
						is[i_437_] = class185.anInt2216 + (int) (f_444_ * (float) aPureJavaToolkit7970.anInt6785 / (float) anInt7963);
						is_347_[i_437_] = class185.anInt2213 + (int) (f_445_ * (float) aPureJavaToolkit7970.anInt6763 / (float) anInt7963);
						is_348_[i_437_] = (int) f;
					}
				}
				if (class358.aShortArray4449 != null) {
					if (anInt7963 == -1) {
						for (int i_446_ = 0; i_446_ < class358.aShort4452; i_446_++) {
							int i_447_ = i_446_ * 3;
							int i_448_ = i_447_ + 1;
							int i_449_ = i_448_ + 1;
							int i_450_ = is[i_447_];
							int i_451_ = is[i_448_];
							int i_452_ = is[i_449_];
							int i_453_ = is_347_[i_447_];
							int i_454_ = is_347_[i_448_];
							int i_455_ = is_347_[i_449_];
							int i_456_ = is_349_[i_447_] + is_349_[i_448_] + is_349_[i_449_];
							if ((i_450_ - i_451_) * (i_455_ - i_454_) - (i_453_ - i_454_) * (i_452_ - i_451_) > 0) {
								class185.aBoolean2217 = i_450_ < 0 || i_451_ < 0 || i_452_ < 0 || i_450_ > class185.anInt2222 || i_451_ > class185.anInt2222 || i_452_ > class185.anInt2222;
								short s = class358.aShortArray4449[i_446_];
								if (i_456_ < 765) {
									if (i_456_ > 0) {
										if (s != -1) {
											int i_457_ = -16777216;
											if (s != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(s, -8217).aByte1214)) {
												i_457_ = -1694498816;
											}
											class185.method1859((float) i_453_, (float) i_454_, (float) i_455_, (float) i_450_, (float) i_451_, (float) i_452_, (float) is_348_[i_447_], (float) is_348_[i_448_], (float) is_348_[i_449_], (float) class358.aShortArray4453[i_447_] / (float) anInt3398, (float) class358.aShortArray4453[i_448_] / (float) anInt3398, (float) class358.aShortArray4453[i_449_] / (float) anInt3398, (float) class358.aShortArray4451[i_447_] / (float) anInt3398, (float) class358.aShortArray4451[i_448_] / (float) anInt3398, (float) class358.aShortArray4451[i_449_] / (float) anInt3398, i_457_ | class358.anIntArray4446[i_447_] & 0xffffff, i_457_ | class358.anIntArray4446[i_448_] & 0xffffff, i_457_ | class358.anIntArray4446[i_449_] & 0xffffff, class374.anInt4611, is_349_[i_447_], is_349_[i_448_], is_349_[i_449_], s);
										} else if ((class358.anIntArray4446[i_447_] & 0xffffff) != 0) {
											if (s != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(s, -8217).aByte1214)) {
												class185.anInt2220 = -1694498816;
											}
											class185.method1850((float) i_453_, (float) i_454_, (float) i_455_, (float) i_450_, (float) i_451_, (float) i_452_, (float) is_348_[i_447_], (float) is_348_[i_448_], (float) is_348_[i_449_], Class249.method3086(is_349_[i_447_] << 24 | class374.anInt4611, class358.anIntArray4446[i_447_], (byte) -56), Class249.method3086(is_349_[i_448_] << 24 | class374.anInt4611, class358.anIntArray4446[i_448_], (byte) -56), Class249.method3086(is_349_[i_449_] << 24 | class374.anInt4611, class358.anIntArray4446[i_449_], (byte) -56));
											class185.anInt2220 = 0;
										}
									} else if (s != -1) {
										int i_458_ = -16777216;
										if (s != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(s, -8217).aByte1214)) {
											i_458_ = -1694498816;
										}
										class185.method1859((float) i_453_, (float) i_454_, (float) i_455_, (float) i_450_, (float) i_451_, (float) i_452_, (float) is_348_[i_447_], (float) is_348_[i_448_], (float) is_348_[i_449_], (float) class358.aShortArray4453[i_447_] / (float) anInt3398, (float) class358.aShortArray4453[i_448_] / (float) anInt3398, (float) class358.aShortArray4453[i_449_] / (float) anInt3398, (float) class358.aShortArray4451[i_447_] / (float) anInt3398, (float) class358.aShortArray4451[i_448_] / (float) anInt3398, (float) class358.aShortArray4451[i_449_] / (float) anInt3398, i_458_ | class358.anIntArray4446[i_447_] & 0xffffff, i_458_ | class358.anIntArray4446[i_448_] & 0xffffff, i_458_ | class358.anIntArray4446[i_449_] & 0xffffff, 0, 0, 0, 0, s);
									} else if ((class358.anIntArray4446[i_447_] & 0xffffff) != 0) {
										if (s != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(s, -8217).aByte1214)) {
											class185.anInt2220 = -1694498816;
										}
										class185.method1850((float) i_453_, (float) i_454_, (float) i_455_, (float) i_450_, (float) i_451_, (float) i_452_, (float) is_348_[i_447_], (float) is_348_[i_448_], (float) is_348_[i_449_], class358.anIntArray4446[i_447_], class358.anIntArray4446[i_448_], class358.anIntArray4446[i_449_]);
										class185.anInt2220 = 0;
									}
								} else {
									class185.method1867((float) i_453_, (float) i_454_, (float) i_455_, (float) i_450_, (float) i_451_, (float) i_452_, (float) is_348_[i_447_], (float) is_348_[i_448_], (float) is_348_[i_449_], class374.anInt4611);
								}
							}
						}
					} else {
						for (int i_459_ = 0; i_459_ < class358.aShort4452; i_459_++) {
							int i_460_ = i_459_ * 3;
							int i_461_ = i_460_ + 1;
							int i_462_ = i_461_ + 1;
							int i_463_ = is[i_460_];
							int i_464_ = is[i_461_];
							int i_465_ = is[i_462_];
							int i_466_ = is_347_[i_460_];
							int i_467_ = is_347_[i_461_];
							int i_468_ = is_347_[i_462_];
							int i_469_ = is_349_[i_460_] + is_349_[i_461_] + is_349_[i_462_];
							if ((i_463_ - i_464_) * (i_468_ - i_467_) - (i_466_ - i_467_) * (i_465_ - i_464_) > 0) {
								class185.aBoolean2217 = i_463_ < 0 || i_464_ < 0 || i_465_ < 0 || i_463_ > class185.anInt2222 || i_464_ > class185.anInt2222 || i_465_ > class185.anInt2222;
								short s = class358.aShortArray4449[i_459_];
								if (i_469_ < 765) {
									if (s != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(s, -8217).aByte1214)) {
										class185.anInt2220 = -1694498816;
									}
									if (i_469_ > 0) {
										if (s != -1) {
											int i_470_ = -16777216;
											if (s != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(s, -8217).aByte1214)) {
												i_470_ = -1694498816;
											}
											class185.method1859((float) i_466_, (float) i_467_, (float) i_468_, (float) i_463_, (float) i_464_, (float) i_465_, (float) is_348_[i_460_], (float) is_348_[i_461_], (float) is_348_[i_462_], (float) class358.aShortArray4453[i_460_] / (float) anInt3398, (float) class358.aShortArray4453[i_461_] / (float) anInt3398, (float) class358.aShortArray4453[i_462_] / (float) anInt3398, (float) class358.aShortArray4451[i_460_] / (float) anInt3398, (float) class358.aShortArray4451[i_461_] / (float) anInt3398, (float) class358.aShortArray4451[i_462_] / (float) anInt3398, i_470_ | class358.anIntArray4446[i_460_] & 0xffffff, i_470_ | class358.anIntArray4446[i_461_] & 0xffffff, i_470_ | class358.anIntArray4446[i_462_] & 0xffffff, class374.anInt4611, is_349_[i_460_], is_349_[i_461_], is_349_[i_462_], s);
										} else if ((class358.anIntArray4446[i_460_] & 0xffffff) != 0) {
											if (s != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(s, -8217).aByte1214)) {
												class185.anInt2220 = -1694498816;
											}
											class185.method1850((float) i_466_, (float) i_467_, (float) i_468_, (float) i_463_, (float) i_464_, (float) i_465_, (float) is_348_[i_460_], (float) is_348_[i_461_], (float) is_348_[i_462_], Class249.method3086(is_349_[i_460_] << 24 | class374.anInt4611, class358.anIntArray4446[i_460_], (byte) -56), Class249.method3086(is_349_[i_461_] << 24 | class374.anInt4611, class358.anIntArray4446[i_461_], (byte) -56), Class249.method3086(is_349_[i_462_] << 24 | class374.anInt4611, class358.anIntArray4446[i_462_], (byte) -56));
											class185.anInt2220 = 0;
										}
									} else if (s != -1) {
										int i_471_ = -16777216;
										if (s != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(s, -8217).aByte1214)) {
											i_471_ = -1694498816;
										}
										class185.method1859((float) i_466_, (float) i_467_, (float) i_468_, (float) i_463_, (float) i_464_, (float) i_465_, (float) is_348_[i_460_], (float) is_348_[i_461_], (float) is_348_[i_462_], (float) class358.aShortArray4453[i_460_] / (float) anInt3398, (float) class358.aShortArray4453[i_461_] / (float) anInt3398, (float) class358.aShortArray4453[i_462_] / (float) anInt3398, (float) class358.aShortArray4451[i_460_] / (float) anInt3398, (float) class358.aShortArray4451[i_461_] / (float) anInt3398, (float) class358.aShortArray4451[i_462_] / (float) anInt3398, i_471_ | class358.anIntArray4446[i_460_] & 0xffffff, i_471_ | class358.anIntArray4446[i_461_] & 0xffffff, i_471_ | class358.anIntArray4446[i_462_] & 0xffffff, 0, 0, 0, 0, s);
									} else if ((class358.anIntArray4446[i_460_] & 0xffffff) != 0) {
										if (s != -1 && method3266(aPureJavaToolkit7970.aD1543.method10(s, -8217).aByte1214)) {
											class185.anInt2220 = -1694498816;
										}
										class185.method1850((float) i_466_, (float) i_467_, (float) i_468_, (float) i_463_, (float) i_464_, (float) i_465_, (float) is_348_[i_460_], (float) is_348_[i_461_], (float) is_348_[i_462_], class358.anIntArray4446[i_460_], class358.anIntArray4446[i_461_], class358.anIntArray4446[i_462_]);
										class185.anInt2220 = 0;
									}
									class185.anInt2220 = 0;
								} else {
									class185.method1867((float) i_466_, (float) i_467_, (float) i_468_, (float) i_463_, (float) i_464_, (float) i_465_, (float) is_348_[i_460_], (float) is_348_[i_461_], (float) is_348_[i_462_], class374.anInt4611);
								}
							}
						}
					}
				} else {
					for (int i_472_ = 0; i_472_ < class358.aShort4452; i_472_++) {
						int i_473_ = i_472_ * 3;
						int i_474_ = i_473_ + 1;
						int i_475_ = i_474_ + 1;
						int i_476_ = is[i_473_];
						int i_477_ = is[i_474_];
						int i_478_ = is[i_475_];
						int i_479_ = is_347_[i_473_];
						int i_480_ = is_347_[i_474_];
						int i_481_ = is_347_[i_475_];
						int i_482_ = is_349_[i_473_] + is_349_[i_474_] + is_349_[i_475_];
						if ((i_476_ - i_477_) * (i_481_ - i_480_) - (i_479_ - i_480_) * (i_478_ - i_477_) > 0) {
							class185.aBoolean2217 = i_476_ < 0 || i_477_ < 0 || i_478_ < 0 || i_476_ > class185.anInt2222 || i_477_ > class185.anInt2222 || i_478_ > class185.anInt2222;
							if (i_482_ < 765) {
								if (i_482_ > 0) {
									if ((class358.anIntArray4446[i_473_] & 0xffffff) != 0) {
										class185.method1850((float) i_479_, (float) i_480_, (float) i_481_, (float) i_476_, (float) i_477_, (float) i_478_, (float) is_348_[i_473_], (float) is_348_[i_474_], (float) is_348_[i_475_], Plane.method3249(class374.anInt4611, 21, class358.anIntArray4446[i_473_], is_349_[i_473_]), Plane.method3249(class374.anInt4611, 80, class358.anIntArray4446[i_474_], is_349_[i_474_]), Plane.method3249(class374.anInt4611, 31, class358.anIntArray4446[i_475_], is_349_[i_475_]));
									}
								} else if ((class358.anIntArray4446[i_473_] & 0xffffff) != 0) {
									class185.method1850((float) i_479_, (float) i_480_, (float) i_481_, (float) i_476_, (float) i_477_, (float) i_478_, (float) is_348_[i_473_], (float) is_348_[i_474_], (float) is_348_[i_475_], class358.anIntArray4446[i_473_], class358.anIntArray4446[i_474_], class358.anIntArray4446[i_475_]);
								}
							} else {
								class185.method1867((float) i_479_, (float) i_480_, (float) i_481_, (float) i_476_, (float) i_477_, (float) i_478_, (float) is_348_[i_473_], (float) is_348_[i_474_], (float) is_348_[i_475_], class374.anInt4611);
							}
						}
					}
				}
			}
		}
	}
	
	private static final int method3271(int i, int i_483_) {
		int i_484_ = (i & 0xff0000) * i_483_ >> 23;
		if (i_484_ < 2) {
			i_484_ = 2;
		} else if (i_484_ > 253) {
			i_484_ = 253;
		}
		int i_485_ = (i & 0xff00) * i_483_ >> 15;
		if (i_485_ < 2) {
			i_485_ = 2;
		} else if (i_485_ > 253) {
			i_485_ = 253;
		}
		int i_486_ = (i & 0xff) * i_483_ >> 7;
		if (i_486_ < 2) {
			i_486_ = 2;
		} else if (i_486_ > 253) {
			i_486_ = 253;
		}
		return i_484_ << 16 | i_485_ << 8 | i_486_;
	}
	
	private final void method3272(int i, int i_487_, int i_488_) {
		Class374 class374 = aPureJavaToolkit7970.method1494(Thread.currentThread());
		class374.aClass185_4627.anInt2220 = 0;
		if (aClass276ArrayArray7968 != null) {
			method3270(i, i_487_, class374.aBoolean4617, class374, class374.aClass185_4627, class374.anIntArray4632, class374.anIntArray4637, class374.anIntArray4647, class374.anIntArray4650, i_488_);
		} else if (aClass100ArrayArray7965 != null) {
			method3269(i, i_487_, class374.aClass185_4627, class374.anIntArray4632, class374.anIntArray4637, class374.anIntArray4647, class374.anIntArray4650, i_488_);
		} else if (aClass292ArrayArray7977 != null) {
			method3265(i, i_487_, class374.aBoolean4617, class374, class374.aClass185_4627, class374.anIntArray4632, class374.anIntArray4637, class374.anIntArray4647, class374.anIntArray4650, i_488_);
		}
	}
	
	final r fa(int i, int i_489_, r var_r) {
		return null;
	}
}
