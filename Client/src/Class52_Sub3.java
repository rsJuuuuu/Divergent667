/* Class52_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52_Sub3 extends Class52
{
	private int[] anIntArray5567;
	private byte[][] aByteArrayArray5568;
	private int[] anIntArray5569;
	private int[] anIntArray5570;
	private PureJavaToolkit aPureJavaToolkit5571;
	private int[] anIntArray5572;
	private int[] anIntArray5573;
	
	final void method526(char c, int i, int i_0_, int i_1_, boolean bool, aa var_aa, int i_2_, int i_3_) {
		if (var_aa == null) {
			fa(c, i, i_0_, i_1_, bool);
		} else {
			i += anIntArray5570[c];
			i_0_ += anIntArray5573[c];
			int i_4_ = anIntArray5572[c];
			int i_5_ = anIntArray5567[c];
			int i_6_ = aPureJavaToolkit5571.anInt6789;
			int i_7_ = i + i_0_ * i_6_;
			int i_8_ = i_6_ - i_4_;
			int i_9_ = 0;
			int i_10_ = 0;
			if (i_0_ < aPureJavaToolkit5571.anInt6760) {
				int i_11_ = aPureJavaToolkit5571.anInt6760 - i_0_;
				i_5_ -= i_11_;
				i_0_ = aPureJavaToolkit5571.anInt6760;
				i_10_ += i_11_ * i_4_;
				i_7_ += i_11_ * i_6_;
			}
			if (i_0_ + i_5_ > aPureJavaToolkit5571.anInt6772) {
				i_5_ -= i_0_ + i_5_ - aPureJavaToolkit5571.anInt6772;
			}
			if (i < aPureJavaToolkit5571.anInt6767) {
				int i_12_ = aPureJavaToolkit5571.anInt6767 - i;
				i_4_ -= i_12_;
				i = aPureJavaToolkit5571.anInt6767;
				i_10_ += i_12_;
				i_7_ += i_12_;
				i_9_ += i_12_;
				i_8_ += i_12_;
			}
			if (i + i_4_ > aPureJavaToolkit5571.anInt6778) {
				int i_13_ = i + i_4_ - aPureJavaToolkit5571.anInt6778;
				i_4_ -= i_13_;
				i_9_ += i_13_;
				i_8_ += i_13_;
			}
			if (i_4_ > 0 && i_5_ > 0) {
				if (bool) {
					method549(aByteArrayArray5568[c], aPureJavaToolkit5571.anIntArray6787, i_1_, i_10_, i_7_, i_4_, i_5_, i_8_, i_9_, i, i_0_, anIntArray5572[c], var_aa, i_2_, i_3_);
				} else {
					method548(aByteArrayArray5568[c], aPureJavaToolkit5571.anIntArray6787, anIntArray5569, i_1_, i_10_, i_7_, i_4_, i_5_, i_8_, i_9_, i, i_0_, anIntArray5572[c], var_aa, i_2_, i_3_);
				}
			}
		}
	}
	
	private final void method546(byte[] bs, int[] is, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		int i_20_ = -(i_16_ >> 2);
		i_16_ = -(i_16_ & 0x3);
		for (int i_21_ = -i_17_; i_21_ < 0; i_21_++) {
			for (int i_22_ = i_20_; i_22_ < 0; i_22_++) {
				if (bs[i_14_++] != 0) {
					is[i_15_++] = i;
				} else {
					i_15_++;
				}
				if (bs[i_14_++] != 0) {
					is[i_15_++] = i;
				} else {
					i_15_++;
				}
				if (bs[i_14_++] != 0) {
					is[i_15_++] = i;
				} else {
					i_15_++;
				}
				if (bs[i_14_++] != 0) {
					is[i_15_++] = i;
				} else {
					i_15_++;
				}
			}
			for (int i_23_ = i_16_; i_23_ < 0; i_23_++) {
				if (bs[i_14_++] != 0) {
					is[i_15_++] = i;
				} else {
					i_15_++;
				}
			}
			i_15_ += i_18_;
			i_14_ += i_19_;
		}
	}
	
	private final void method547(byte[] bs, int[] is, int[] is_24_, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		int i_30_ = -(i_26_ >> 2);
		i_26_ = -(i_26_ & 0x3);
		boolean bool = false;
		for (int i_31_ = -i_27_; i_31_ < 0; i_31_++) {
			for (int i_32_ = i_30_; i_32_ < 0; i_32_++) {
				int i_33_;
				if ((i_33_ = bs[i++]) != 0) {
					is[i_25_++] = is_24_[i_33_ & 0xff];
				} else {
					i_25_++;
				}
				if ((i_33_ = bs[i++]) != 0) {
					is[i_25_++] = is_24_[i_33_ & 0xff];
				} else {
					i_25_++;
				}
				if ((i_33_ = bs[i++]) != 0) {
					is[i_25_++] = is_24_[i_33_ & 0xff];
				} else {
					i_25_++;
				}
				if ((i_33_ = bs[i++]) != 0) {
					is[i_25_++] = is_24_[i_33_ & 0xff];
				} else {
					i_25_++;
				}
			}
			for (int i_34_ = i_26_; i_34_ < 0; i_34_++) {
				int i_35_;
				if ((i_35_ = bs[i++]) != 0) {
					is[i_25_++] = is_24_[i_35_ & 0xff];
				} else {
					i_25_++;
				}
			}
			i_25_ += i_28_;
			i += i_29_;
		}
	}
	
	private final void method548(byte[] bs, int[] is, int[] is_36_, int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, aa var_aa, int i_46_, int i_47_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is_48_ = var_aa_Sub1.anIntArray5487;
		int[] is_49_ = var_aa_Sub1.anIntArray5488;
		int i_50_ = i_43_ - aPureJavaToolkit5571.anInt6767;
		int i_51_ = i_44_;
		if (i_47_ > i_51_) {
			i_51_ = i_47_;
			i_38_ += (i_47_ - i_44_) * aPureJavaToolkit5571.anInt6789;
			i_37_ += (i_47_ - i_44_) * i_45_;
		}
		int i_52_ = i_47_ + is_48_.length < i_44_ + i_40_ ? i_47_ + is_48_.length : i_44_ + i_40_;
		boolean bool = false;
		for (int i_53_ = i_51_; i_53_ < i_52_; i_53_++) {
			int i_54_ = is_48_[i_53_ - i_47_] + i_46_;
			int i_55_ = is_49_[i_53_ - i_47_];
			int i_56_ = i_39_;
			if (i_50_ > i_54_) {
				int i_57_ = i_50_ - i_54_;
				if (i_57_ >= i_55_) {
					i_37_ += i_39_ + i_42_;
					i_38_ += i_39_ + i_41_;
					continue;
				}
				i_55_ -= i_57_;
			} else {
				int i_58_ = i_54_ - i_50_;
				if (i_58_ >= i_39_) {
					i_37_ += i_39_ + i_42_;
					i_38_ += i_39_ + i_41_;
					continue;
				}
				i_37_ += i_58_;
				i_56_ -= i_58_;
				i_38_ += i_58_;
			}
			int i_59_ = 0;
			if (i_56_ < i_55_) {
				i_55_ = i_56_;
			} else {
				i_59_ = i_56_ - i_55_;
			}
			for (int i_60_ = -i_55_; i_60_ < 0; i_60_++) {
				int i_61_;
				if ((i_61_ = bs[i_37_++]) != 0) {
					is[i_38_++] = is_36_[i_61_ & 0xff];
				} else {
					i_38_++;
				}
			}
			i_37_ += i_59_ + i_42_;
			i_38_ += i_59_ + i_41_;
		}
	}
	
	private final void method549(byte[] bs, int[] is, int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, aa var_aa, int i_71_, int i_72_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is_73_ = var_aa_Sub1.anIntArray5487;
		int[] is_74_ = var_aa_Sub1.anIntArray5488;
		int i_75_ = i_68_ - aPureJavaToolkit5571.anInt6767;
		int i_76_ = i_69_;
		if (i_72_ > i_76_) {
			i_76_ = i_72_;
			i_63_ += (i_72_ - i_69_) * aPureJavaToolkit5571.anInt6789;
			i_62_ += (i_72_ - i_69_) * i_70_;
		}
		int i_77_ = i_72_ + is_73_.length < i_69_ + i_65_ ? i_72_ + is_73_.length : i_69_ + i_65_;
		for (int i_78_ = i_76_; i_78_ < i_77_; i_78_++) {
			int i_79_ = is_73_[i_78_ - i_72_] + i_71_;
			int i_80_ = is_74_[i_78_ - i_72_];
			int i_81_ = i_64_;
			if (i_75_ > i_79_) {
				int i_82_ = i_75_ - i_79_;
				if (i_82_ >= i_80_) {
					i_62_ += i_64_ + i_67_;
					i_63_ += i_64_ + i_66_;
					continue;
				}
				i_80_ -= i_82_;
			} else {
				int i_83_ = i_79_ - i_75_;
				if (i_83_ >= i_64_) {
					i_62_ += i_64_ + i_67_;
					i_63_ += i_64_ + i_66_;
					continue;
				}
				i_62_ += i_83_;
				i_81_ -= i_83_;
				i_63_ += i_83_;
			}
			int i_84_ = 0;
			if (i_81_ < i_80_) {
				i_80_ = i_81_;
			} else {
				i_84_ = i_81_ - i_80_;
			}
			for (int i_85_ = -i_80_; i_85_ < 0; i_85_++) {
				if (bs[i_62_++] != 0) {
					is[i_63_++] = i;
				} else {
					i_63_++;
				}
			}
			i_62_ += i_84_ + i_62_;
			i_63_ += i_84_ + i_66_;
		}
	}
	
	final void fa(char c, int i, int i_86_, int i_87_, boolean bool) {
		i += anIntArray5570[c];
		i_86_ += anIntArray5573[c];
		int i_88_ = anIntArray5572[c];
		int i_89_ = anIntArray5567[c];
		int i_90_ = aPureJavaToolkit5571.anInt6789;
		int i_91_ = i + i_86_ * i_90_;
		int i_92_ = i_90_ - i_88_;
		int i_93_ = 0;
		int i_94_ = 0;
		if (i_86_ < aPureJavaToolkit5571.anInt6760) {
			int i_95_ = aPureJavaToolkit5571.anInt6760 - i_86_;
			i_89_ -= i_95_;
			i_86_ = aPureJavaToolkit5571.anInt6760;
			i_94_ += i_95_ * i_88_;
			i_91_ += i_95_ * i_90_;
		}
		if (i_86_ + i_89_ > aPureJavaToolkit5571.anInt6772) {
			i_89_ -= i_86_ + i_89_ - aPureJavaToolkit5571.anInt6772;
		}
		if (i < aPureJavaToolkit5571.anInt6767) {
			int i_96_ = aPureJavaToolkit5571.anInt6767 - i;
			i_88_ -= i_96_;
			i = aPureJavaToolkit5571.anInt6767;
			i_94_ += i_96_;
			i_91_ += i_96_;
			i_93_ += i_96_;
			i_92_ += i_96_;
		}
		if (i + i_88_ > aPureJavaToolkit5571.anInt6778) {
			int i_97_ = i + i_88_ - aPureJavaToolkit5571.anInt6778;
			i_88_ -= i_97_;
			i_93_ += i_97_;
			i_92_ += i_97_;
		}
		if (i_88_ > 0 && i_89_ > 0) {
			if (bool) {
				method546(aByteArrayArray5568[c], aPureJavaToolkit5571.anIntArray6787, i_87_, i_94_, i_91_, i_88_, i_89_, i_92_, i_93_);
			} else {
				method547(aByteArrayArray5568[c], aPureJavaToolkit5571.anIntArray6787, anIntArray5569, i_94_, i_91_, i_88_, i_89_, i_92_, i_93_);
			}
		}
	}
	
	Class52_Sub3(PureJavaToolkit purejavatoolkit, Class357 class357, Class383[] class383s, int[] is, int[] is_98_) {
		super(purejavatoolkit, class357);
		aPureJavaToolkit5571 = purejavatoolkit;
		aPureJavaToolkit5571 = purejavatoolkit;
		anIntArray5572 = is;
		anIntArray5567 = is_98_;
		aByteArrayArray5568 = new byte[class383s.length][];
		anIntArray5573 = new int[class383s.length];
		anIntArray5570 = new int[class383s.length];
		for (int i = 0; i < class383s.length; i++) {
			aByteArrayArray5568[i] = class383s[i].aByteArray4903;
			anIntArray5573[i] = class383s[i].anInt4898;
			anIntArray5570[i] = class383s[i].anInt4902;
		}
		anIntArray5569 = class383s[0].anIntArray4904;
	}
}
