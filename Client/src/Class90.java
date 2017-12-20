/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class90
{
	private static Class231 aClass231_1201 = new Class231();
	
	static final int method1023(byte[] bs, int i, byte[] bs_0_, int i_1_, int i_2_) {
		synchronized (aClass231_1201) {
			aClass231_1201.aByteArray2745 = bs_0_;
			aClass231_1201.anInt2744 = i_2_;
			aClass231_1201.aByteArray2752 = bs;
			aClass231_1201.anInt2734 = 0;
			aClass231_1201.anInt2760 = i;
			aClass231_1201.anInt2767 = 0;
			aClass231_1201.anInt2739 = 0;
			aClass231_1201.anInt2749 = 0;
			aClass231_1201.anInt2753 = 0;
			method1024(aClass231_1201);
			i -= aClass231_1201.anInt2760;
			aClass231_1201.aByteArray2745 = null;
			aClass231_1201.aByteArray2752 = null;
			return i;
		}
	}
	
	private static final void method1024(Class231 class231) {
		int i = 0;
		int[] is = null;
		int[] is_20_ = null;
		int[] is_21_ = null;
		class231.anInt2766 = 1;
		if (Class55.anIntArray834 == null) {
			Class55.anIntArray834 = new int[class231.anInt2766 * 100000];
		}
		boolean bool_22_ = true;
		while (bool_22_) {
			byte b = method1031(class231);
			if (b == 23) {
				break;
			}
			b = method1031(class231);
			b = method1031(class231);
			b = method1031(class231);
			b = method1031(class231);
			b = method1031(class231);
			b = method1031(class231);
			b = method1031(class231);
			b = method1031(class231);
			b = method1031(class231);
			b = method1030(class231);
			class231.anInt2737 = 0;
			int i_23_ = method1031(class231);
			class231.anInt2737 = class231.anInt2737 << 8 | i_23_ & 0xff;
			i_23_ = method1031(class231);
			class231.anInt2737 = class231.anInt2737 << 8 | i_23_ & 0xff;
			i_23_ = method1031(class231);
			class231.anInt2737 = class231.anInt2737 << 8 | i_23_ & 0xff;
			for (int i_24_ = 0; i_24_ < 16; i_24_++) {
				b = method1030(class231);
                class231.aBooleanArray2743[i_24_] = b == 1;
			}
			for (int i_25_ = 0; i_25_ < 256; i_25_++)
				class231.aBooleanArray2738[i_25_] = false;
			for (int i_26_ = 0; i_26_ < 16; i_26_++) {
				if (class231.aBooleanArray2743[i_26_]) {
					for (int i_27_ = 0; i_27_ < 16; i_27_++) {
						b = method1030(class231);
						if (b == 1) {
							class231.aBooleanArray2738[i_26_ * 16 + i_27_] = true;
						}
					}
				}
			}
			method1029(class231);
			int i_28_ = class231.anInt2755 + 2;
			int i_29_ = method1028(3, class231);
			int i_30_ = method1028(15, class231);
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
				int i_32_ = 0;
				for (;;) {
					b = method1030(class231);
					if (b == 0) {
						break;
					}
					i_32_++;
				}
				class231.aByteArray2741[i_31_] = (byte) i_32_;
			}
			byte[] bs = new byte[6];
			for (byte b_33_ = 0; b_33_ < i_29_; b_33_++)
				bs[b_33_] = b_33_;
			for (int i_34_ = 0; i_34_ < i_30_; i_34_++) {
				byte b_35_ = class231.aByteArray2741[i_34_];
				byte b_36_ = bs[b_35_];
				for (/**/; b_35_ > 0; b_35_--)
					bs[b_35_] = bs[b_35_ - 1];
				bs[0] = b_36_;
				class231.aByteArray2757[i_34_] = b_36_;
			}
			for (int i_37_ = 0; i_37_ < i_29_; i_37_++) {
				int i_38_ = method1028(5, class231);
				for (int i_39_ = 0; i_39_ < i_28_; i_39_++) {
					for (;;) {
						b = method1030(class231);
						if (b == 0) {
							break;
						}
						b = method1030(class231);
						if (b == 0) {
							i_38_++;
						} else {
							i_38_--;
						}
					}
					class231.aByteArrayArray2748[i_37_][i_39_] = (byte) i_38_;
				}
			}
			for (int i_40_ = 0; i_40_ < i_29_; i_40_++) {
				int i_41_ = 32;
				byte b_42_ = 0;
				for (int i_43_ = 0; i_43_ < i_28_; i_43_++) {
					if (class231.aByteArrayArray2748[i_40_][i_43_] > b_42_) {
						b_42_ = class231.aByteArrayArray2748[i_40_][i_43_];
					}
					if (class231.aByteArrayArray2748[i_40_][i_43_] < i_41_) {
						i_41_ = class231.aByteArrayArray2748[i_40_][i_43_];
					}
				}
				method1025(class231.anIntArrayArray2754[i_40_], class231.anIntArrayArray2762[i_40_], class231.anIntArrayArray2768[i_40_], class231.aByteArrayArray2748[i_40_], i_41_, b_42_, i_28_);
				class231.anIntArray2740[i_40_] = i_41_;
			}
			int i_44_ = class231.anInt2755 + 1;
			int i_45_ = -1;
			int i_46_ = 0;
			for (int i_47_ = 0; i_47_ <= 255; i_47_++)
				class231.anIntArray2735[i_47_] = 0;
			int i_48_ = 4095;
			for (int i_49_ = 15; i_49_ >= 0; i_49_--) {
				for (int i_50_ = 15; i_50_ >= 0; i_50_--) {
					class231.aByteArray2758[i_48_] = (byte) (i_49_ * 16 + i_50_);
					i_48_--;
				}
				class231.anIntArray2746[i_49_] = i_48_ + 1;
			}
			int i_51_ = 0;
			if (i_46_ == 0) {
				i_45_++;
				i_46_ = 50;
				byte b_52_ = class231.aByteArray2757[i_45_];
				i = class231.anIntArray2740[b_52_];
				is = class231.anIntArrayArray2754[b_52_];
				is_21_ = class231.anIntArrayArray2768[b_52_];
				is_20_ = class231.anIntArrayArray2762[b_52_];
			}
			i_46_--;
			int i_53_ = i;
			int i_54_;
			int i_55_;
			for (i_55_ = method1028(i_53_, class231); i_55_ > is[i_53_]; i_55_ = i_55_ << 1 | i_54_) {
				i_53_++;
				i_54_ = method1030(class231);
			}
			int i_56_ = is_21_[i_55_ - is_20_[i_53_]];
			while (i_56_ != i_44_) {
				if (i_56_ == 0 || i_56_ == 1) {
					int i_57_ = -1;
					int i_58_ = 1;
					do {
						if (i_56_ == 0) {
							i_57_ += i_58_;
						} else if (i_56_ == 1) {
							i_57_ += 2 * i_58_;
						}
						i_58_ *= 2;
						if (i_46_ == 0) {
							i_45_++;
							i_46_ = 50;
							byte b_59_ = class231.aByteArray2757[i_45_];
							i = class231.anIntArray2740[b_59_];
							is = class231.anIntArrayArray2754[b_59_];
							is_21_ = class231.anIntArrayArray2768[b_59_];
							is_20_ = class231.anIntArrayArray2762[b_59_];
						}
						i_46_--;
						i_53_ = i;
						for (i_55_ = method1028(i_53_, class231); i_55_ > is[i_53_]; i_55_ = i_55_ << 1 | i_54_) {
							i_53_++;
							i_54_ = method1030(class231);
						}
						i_56_ = is_21_[i_55_ - is_20_[i_53_]];
					} while (i_56_ == 0 || i_56_ == 1);
					i_57_++;
					i_23_ = class231.aByteArray2765[class231.aByteArray2758[class231.anIntArray2746[0]] & 0xff];
					class231.anIntArray2735[i_23_ & 0xff] += i_57_;
					for (/**/; i_57_ > 0; i_57_--) {
						Class55.anIntArray834[i_51_] = i_23_ & 0xff;
						i_51_++;
					}
				} else {
					int i_60_ = i_56_ - 1;
					if (i_60_ < 16) {
						int i_61_ = class231.anIntArray2746[0];
						b = class231.aByteArray2758[i_61_ + i_60_];
						for (/**/; i_60_ > 3; i_60_ -= 4) {
							int i_62_ = i_61_ + i_60_;
							class231.aByteArray2758[i_62_] = class231.aByteArray2758[i_62_ - 1];
							class231.aByteArray2758[i_62_ - 1] = class231.aByteArray2758[i_62_ - 2];
							class231.aByteArray2758[i_62_ - 2] = class231.aByteArray2758[i_62_ - 3];
							class231.aByteArray2758[i_62_ - 3] = class231.aByteArray2758[i_62_ - 4];
						}
						for (/**/; i_60_ > 0; i_60_--)
							class231.aByteArray2758[i_61_ + i_60_] = class231.aByteArray2758[i_61_ + i_60_ - 1];
						class231.aByteArray2758[i_61_] = b;
					} else {
						int i_63_ = i_60_ / 16;
						int i_64_ = i_60_ % 16;
						int i_65_ = class231.anIntArray2746[i_63_] + i_64_;
						b = class231.aByteArray2758[i_65_];
						for (/**/; i_65_ > class231.anIntArray2746[i_63_]; i_65_--)
							class231.aByteArray2758[i_65_] = class231.aByteArray2758[i_65_ - 1];
						class231.anIntArray2746[i_63_]++;
						for (/**/; i_63_ > 0; i_63_--) {
							class231.anIntArray2746[i_63_]--;
							class231.aByteArray2758[class231.anIntArray2746[i_63_]] = class231.aByteArray2758[class231.anIntArray2746[i_63_ - 1] + 16 - 1];
						}
						class231.anIntArray2746[0]--;
						class231.aByteArray2758[class231.anIntArray2746[0]] = b;
						if (class231.anIntArray2746[0] == 0) {
							int i_66_ = 4095;
							for (int i_67_ = 15; i_67_ >= 0; i_67_--) {
								for (int i_68_ = 15; i_68_ >= 0; i_68_--) {
									class231.aByteArray2758[i_66_] = class231.aByteArray2758[class231.anIntArray2746[i_67_] + i_68_];
									i_66_--;
								}
								class231.anIntArray2746[i_67_] = i_66_ + 1;
							}
						}
					}
					class231.anIntArray2735[class231.aByteArray2765[b & 0xff] & 0xff]++;
					Class55.anIntArray834[i_51_] = class231.aByteArray2765[b & 0xff] & 0xff;
					i_51_++;
					if (i_46_ == 0) {
						i_45_++;
						i_46_ = 50;
						byte b_69_ = class231.aByteArray2757[i_45_];
						i = class231.anIntArray2740[b_69_];
						is = class231.anIntArrayArray2754[b_69_];
						is_21_ = class231.anIntArrayArray2768[b_69_];
						is_20_ = class231.anIntArrayArray2762[b_69_];
					}
					i_46_--;
					i_53_ = i;
					for (i_55_ = method1028(i_53_, class231); i_55_ > is[i_53_]; i_55_ = i_55_ << 1 | i_54_) {
						i_53_++;
						i_54_ = method1030(class231);
					}
					i_56_ = is_21_[i_55_ - is_20_[i_53_]];
				}
			}
			class231.anInt2742 = 0;
			class231.aByte2736 = (byte) 0;
			class231.anIntArray2763[0] = 0;
			for (int i_70_ = 1; i_70_ <= 256; i_70_++)
				class231.anIntArray2763[i_70_] = class231.anIntArray2735[i_70_ - 1];
			for (int i_71_ = 1; i_71_ <= 256; i_71_++)
				class231.anIntArray2763[i_71_] += class231.anIntArray2763[i_71_ - 1];
			for (int i_72_ = 0; i_72_ < i_51_; i_72_++) {
				i_23_ = (byte) (Class55.anIntArray834[i_72_] & 0xff);
				Class55.anIntArray834[class231.anIntArray2763[i_23_ & 0xff]] |= i_72_ << 8;
				class231.anIntArray2763[i_23_ & 0xff]++;
			}
			class231.anInt2756 = Class55.anIntArray834[class231.anInt2737] >> 8;
			class231.anInt2759 = 0;
			class231.anInt2756 = Class55.anIntArray834[class231.anInt2756];
			class231.anInt2751 = (byte) (class231.anInt2756 & 0xff);
			class231.anInt2756 >>= 8;
			class231.anInt2759++;
			class231.anInt2747 = i_51_;
			method1026(class231);
            bool_22_ = class231.anInt2759 == class231.anInt2747 + 1 && class231.anInt2742 == 0;
		}
	}
	
	private static final void method1025(int[] is, int[] is_73_, int[] is_74_, byte[] bs, int i, int i_75_, int i_76_) {
		int i_77_ = 0;
		for (int i_78_ = i; i_78_ <= i_75_; i_78_++) {
			for (int i_79_ = 0; i_79_ < i_76_; i_79_++) {
				if (bs[i_79_] == i_78_) {
					is_74_[i_77_] = i_79_;
					i_77_++;
				}
			}
		}
		for (int i_80_ = 0; i_80_ < 23; i_80_++)
			is_73_[i_80_] = 0;
		for (int i_81_ = 0; i_81_ < i_76_; i_81_++)
			is_73_[bs[i_81_] + 1]++;
		for (int i_82_ = 1; i_82_ < 23; i_82_++)
			is_73_[i_82_] += is_73_[i_82_ - 1];
		for (int i_83_ = 0; i_83_ < 23; i_83_++)
			is[i_83_] = 0;
		int i_84_ = 0;
		for (int i_85_ = i; i_85_ <= i_75_; i_85_++) {
			i_84_ += is_73_[i_85_ + 1] - is_73_[i_85_];
			is[i_85_] = i_84_ - 1;
			i_84_ <<= 1;
		}
		for (int i_86_ = i + 1; i_86_ <= i_75_; i_86_++)
			is_73_[i_86_] = (is[i_86_ - 1] + 1 << 1) - is_73_[i_86_];
	}
	
	private static final void method1026(Class231 class231) {
		byte b = class231.aByte2736;
		int i = class231.anInt2742;
		int i_87_ = class231.anInt2759;
		int i_88_ = class231.anInt2751;
		int[] is = Class55.anIntArray834;
		int i_89_ = class231.anInt2756;
		byte[] bs = class231.aByteArray2752;
		int i_90_ = class231.anInt2734;
		int i_91_ = class231.anInt2760;
		int i_92_ = i_91_;
		int i_93_ = class231.anInt2747 + 1;
	while_81_:
		for (;;) {
			if (i > 0) {
				for (;;) {
					if (i_91_ == 0) {
						break while_81_;
					}
					if (i == 1) {
						break;
					}
					bs[i_90_] = b;
					i--;
					i_90_++;
					i_91_--;
				}
				if (i_91_ == 0) {
					i = 1;
					break;
				}
				bs[i_90_] = b;
				i_90_++;
				i_91_--;
			}
			for (;;) {
				if (i_87_ == i_93_) {
					i = 0;
					break while_81_;
				}
				b = (byte) i_88_;
				i_89_ = is[i_89_];
				int i_94_ = (byte) i_89_;
				i_89_ >>= 8;
				i_87_++;
				if (i_94_ != i_88_) {
					i_88_ = i_94_;
					if (i_91_ == 0) {
						i = 1;
						break while_81_;
					}
					bs[i_90_] = b;
					i_90_++;
					i_91_--;
				} else {
					if (i_87_ != i_93_) {
						break;
					}
					if (i_91_ == 0) {
						i = 1;
						break while_81_;
					}
					bs[i_90_] = b;
					i_90_++;
					i_91_--;
				}
			}
			i = 2;
			i_89_ = is[i_89_];
			int i_95_ = (byte) i_89_;
			i_89_ >>= 8;
			if (++i_87_ != i_93_) {
				if (i_95_ != i_88_) {
					i_88_ = i_95_;
				} else {
					i = 3;
					i_89_ = is[i_89_];
					i_95_ = (byte) i_89_;
					i_89_ >>= 8;
					if (++i_87_ != i_93_) {
						if (i_95_ != i_88_) {
							i_88_ = i_95_;
						} else {
							i_89_ = is[i_89_];
							i_95_ = (byte) i_89_;
							i_89_ >>= 8;
							i_87_++;
							i = (i_95_ & 0xff) + 4;
							i_89_ = is[i_89_];
							i_88_ = (byte) i_89_;
							i_89_ >>= 8;
							i_87_++;
						}
					}
				}
			}
		}
		class231.anInt2753 += i_92_ - i_91_;
		class231.aByte2736 = b;
		class231.anInt2742 = i;
		class231.anInt2759 = i_87_;
		class231.anInt2751 = i_88_;
		Class55.anIntArray834 = is;
		class231.anInt2756 = i_89_;
		class231.aByteArray2752 = bs;
		class231.anInt2734 = i_90_;
		class231.anInt2760 = i_91_;
	}
	
	public static void method1027() {
		aClass231_1201 = null;
	}
	
	private static final int method1028(int i, Class231 class231) {
		for (;;) {
			if (class231.anInt2767 >= i) {
				int i_97_ = class231.anInt2739 >> class231.anInt2767 - i & (1 << i) - 1;
				class231.anInt2767 -= i;
				return i_97_;
			}
			class231.anInt2739 = class231.anInt2739 << 8 | class231.aByteArray2745[class231.anInt2744] & 0xff;
			class231.anInt2767 += 8;
			class231.anInt2744++;
			class231.anInt2749++;
		}
	}
	
	private static final void method1029(Class231 class231) {
		class231.anInt2755 = 0;
		for (int i = 0; i < 256; i++) {
			if (class231.aBooleanArray2738[i]) {
				class231.aByteArray2765[class231.anInt2755] = (byte) i;
				class231.anInt2755++;
			}
		}
	}
	
	private static final byte method1030(Class231 class231) {
		return (byte) method1028(1, class231);
	}
	
	private static final byte method1031(Class231 class231) {
		return (byte) method1028(8, class231);
	}
}
