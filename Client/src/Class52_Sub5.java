/* Class52_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52_Sub5 extends Class52
{
	private PureJavaToolkit aPureJavaToolkit5580;
	private int[] anIntArray5581;
	private int[] anIntArray5582;
	private int[] anIntArray5583;
	private int[] anIntArray5584;
	private byte[][] aByteArrayArray5585;
	
	private final void method552(byte[] bs, int[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, aa var_aa, int i_9_, int i_10_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is_11_ = var_aa_Sub1.anIntArray5487;
		int[] is_12_ = var_aa_Sub1.anIntArray5488;
		int i_13_ = i_7_;
		if (i_10_ > i_13_) {
			i_13_ = i_10_;
			i_1_ += (i_10_ - i_7_) * aPureJavaToolkit5580.anInt6789;
			i_0_ += (i_10_ - i_7_) * i_8_;
		}
		int i_14_ = i_10_ + is_11_.length < i_7_ + i_3_ ? i_10_ + is_11_.length : i_7_ + i_3_;
		for (int i_15_ = i_13_; i_15_ < i_14_; i_15_++) {
			int i_16_ = i_9_ + is_11_[i_15_ - i_10_];
			int i_17_ = is_12_[i_15_ - i_10_];
			int i_18_ = i_2_;
			if (i_6_ > i_16_) {
				int i_19_ = i_6_ - i_16_;
				if (i_19_ >= i_17_) {
					i_0_ += i_2_ + i_5_;
					i_1_ += i_2_ + i_4_;
					continue;
				}
				i_17_ -= i_19_;
			} else {
				int i_20_ = i_16_ - i_6_;
				if (i_20_ >= i_2_) {
					i_0_ += i_2_ + i_5_;
					i_1_ += i_2_ + i_4_;
					continue;
				}
				i_0_ += i_20_;
				i_18_ -= i_20_;
				i_1_ += i_20_;
			}
			int i_21_ = 0;
			if (i_18_ < i_17_) {
				i_17_ = i_18_;
			} else {
				i_21_ = i_18_ - i_17_;
			}
			for (int i_22_ = 0; i_22_ < i_17_; i_22_++) {
				if (bs[i_0_++] != 0) {
					is[i_1_++] = i;
				} else {
					i_1_++;
				}
			}
			i_0_ += i_21_ + i_5_;
			i_1_ += i_21_ + i_4_;
		}
	}
	
	Class52_Sub5(PureJavaToolkit purejavatoolkit, Class357 class357, Class383[] class383s, int[] is, int[] is_23_) {
		super(purejavatoolkit, class357);
		aPureJavaToolkit5580 = purejavatoolkit;
		anIntArray5583 = is;
		anIntArray5581 = is_23_;
		aByteArrayArray5585 = new byte[class383s.length][];
		anIntArray5584 = new int[class383s.length];
		anIntArray5582 = new int[class383s.length];
		for (int i = 0; i < class383s.length; i++) {
			aByteArrayArray5585[i] = class383s[i].aByteArray4903;
			anIntArray5584[i] = class383s[i].anInt4898;
			anIntArray5582[i] = class383s[i].anInt4902;
		}
	}
	
	private final void method553(byte[] bs, int[] is, int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, aa var_aa, int i_33_, int i_34_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is_35_ = var_aa_Sub1.anIntArray5487;
		int[] is_36_ = var_aa_Sub1.anIntArray5488;
		int i_37_ = i_30_ - aPureJavaToolkit5580.anInt6767;
		int i_38_ = i_31_;
		if (i_34_ > i_38_) {
			i_38_ = i_34_;
			i_25_ += (i_34_ - i_31_) * aPureJavaToolkit5580.anInt6789;
			i_24_ += (i_34_ - i_31_) * i_32_;
		}
		int i_39_ = i_34_ + is_35_.length < i_31_ + i_27_ ? i_34_ + is_35_.length : i_31_ + i_27_;
		int i_40_ = i >>> 24;
		int i_41_ = 255 - i_40_;
		for (int i_42_ = i_38_; i_42_ < i_39_; i_42_++) {
			int i_43_ = is_35_[i_42_ - i_34_] + i_33_;
			int i_44_ = is_36_[i_42_ - i_34_];
			int i_45_ = i_26_;
			if (i_37_ > i_43_) {
				int i_46_ = i_37_ - i_43_;
				if (i_46_ >= i_44_) {
					i_24_ += i_26_ + i_29_;
					i_25_ += i_26_ + i_28_;
					continue;
				}
				i_44_ -= i_46_;
			} else {
				int i_47_ = i_43_ - i_37_;
				if (i_47_ >= i_26_) {
					i_24_ += i_26_ + i_29_;
					i_25_ += i_26_ + i_28_;
					continue;
				}
				i_24_ += i_47_;
				i_45_ -= i_47_;
				i_25_ += i_47_;
			}
			int i_48_ = 0;
			if (i_45_ < i_44_) {
				i_44_ = i_45_;
			} else {
				i_48_ = i_45_ - i_44_;
			}
			for (int i_49_ = -i_44_; i_49_ < 0; i_49_++) {
				if (bs[i_24_++] != 0) {
					int i_50_ = ((i & 0xff00ff) * i_40_ & ~0xff00ff) + ((i & 0xff00) * i_40_ & 0xff0000) >> 8;
					int i_51_ = is[i_25_];
					is[i_25_++] = (((i_51_ & 0xff00ff) * i_41_ & ~0xff00ff) + ((i_51_ & 0xff00) * i_41_ & 0xff0000) >> 8) + i_50_;
				} else {
					i_25_++;
				}
			}
			i_24_ += i_48_ + i_29_;
			i_25_ += i_48_ + i_28_;
		}
	}
	
	final void fa(char c, int i, int i_52_, int i_53_, boolean bool) {
		i += anIntArray5582[c];
		i_52_ += anIntArray5584[c];
		int i_54_ = anIntArray5583[c];
		int i_55_ = anIntArray5581[c];
		int i_56_ = aPureJavaToolkit5580.anInt6789;
		int i_57_ = i + i_52_ * i_56_;
		int i_58_ = i_56_ - i_54_;
		int i_59_ = 0;
		int i_60_ = 0;
		if (i_52_ < aPureJavaToolkit5580.anInt6760) {
			int i_61_ = aPureJavaToolkit5580.anInt6760 - i_52_;
			i_55_ -= i_61_;
			i_52_ = aPureJavaToolkit5580.anInt6760;
			i_60_ += i_61_ * i_54_;
			i_57_ += i_61_ * i_56_;
		}
		if (i_52_ + i_55_ > aPureJavaToolkit5580.anInt6772) {
			i_55_ -= i_52_ + i_55_ - aPureJavaToolkit5580.anInt6772;
		}
		if (i < aPureJavaToolkit5580.anInt6767) {
			int i_62_ = aPureJavaToolkit5580.anInt6767 - i;
			i_54_ -= i_62_;
			i = aPureJavaToolkit5580.anInt6767;
			i_60_ += i_62_;
			i_57_ += i_62_;
			i_59_ += i_62_;
			i_58_ += i_62_;
		}
		if (i + i_54_ > aPureJavaToolkit5580.anInt6778) {
			int i_63_ = i + i_54_ - aPureJavaToolkit5580.anInt6778;
			i_54_ -= i_63_;
			i_59_ += i_63_;
			i_58_ += i_63_;
		}
		if (i_54_ > 0 && i_55_ > 0) {
			if ((i_53_ & ~0xffffff) == -16777216) {
				method555(aByteArrayArray5585[c], aPureJavaToolkit5580.anIntArray6787, i_53_, i_60_, i_57_, i_54_, i_55_, i_58_, i_59_);
			} else if ((i_53_ & ~0xffffff) != 0) {
				method554(aByteArrayArray5585[c], aPureJavaToolkit5580.anIntArray6787, i_53_, i_60_, i_57_, i_54_, i_55_, i_58_, i_59_);
			}
		}
	}
	
	final void method526(char c, int i, int i_64_, int i_65_, boolean bool, aa var_aa, int i_66_, int i_67_) {
		if (var_aa == null) {
			fa(c, i, i_64_, i_65_, bool);
		} else {
			i += anIntArray5582[c];
			i_64_ += anIntArray5584[c];
			int i_68_ = anIntArray5583[c];
			int i_69_ = anIntArray5581[c];
			int i_70_ = aPureJavaToolkit5580.anInt6789;
			int i_71_ = i + i_64_ * i_70_;
			int i_72_ = i_70_ - i_68_;
			int i_73_ = 0;
			int i_74_ = 0;
			if (i_64_ < aPureJavaToolkit5580.anInt6760) {
				int i_75_ = aPureJavaToolkit5580.anInt6760 - i_64_;
				i_69_ -= i_75_;
				i_64_ = aPureJavaToolkit5580.anInt6760;
				i_74_ += i_75_ * i_68_;
				i_71_ += i_75_ * i_70_;
			}
			if (i_64_ + i_69_ > aPureJavaToolkit5580.anInt6772) {
				i_69_ -= i_64_ + i_69_ - aPureJavaToolkit5580.anInt6772;
			}
			if (i < aPureJavaToolkit5580.anInt6767) {
				int i_76_ = aPureJavaToolkit5580.anInt6767 - i;
				i_68_ -= i_76_;
				i = aPureJavaToolkit5580.anInt6767;
				i_74_ += i_76_;
				i_71_ += i_76_;
				i_73_ += i_76_;
				i_72_ += i_76_;
			}
			if (i + i_68_ > aPureJavaToolkit5580.anInt6778) {
				int i_77_ = i + i_68_ - aPureJavaToolkit5580.anInt6778;
				i_68_ -= i_77_;
				i_73_ += i_77_;
				i_72_ += i_77_;
			}
			if (i_68_ > 0 && i_69_ > 0) {
				if ((i_65_ & ~0xffffff) == -16777216) {
					method552(aByteArrayArray5585[c], aPureJavaToolkit5580.anIntArray6787, i_65_, i_74_, i_71_, i_68_, i_69_, i_72_, i_73_, i, i_64_, anIntArray5583[c], var_aa, i_66_, i_67_);
				} else {
					method553(aByteArrayArray5585[c], aPureJavaToolkit5580.anIntArray6787, i_65_, i_74_, i_71_, i_68_, i_69_, i_72_, i_73_, i, i_64_, anIntArray5583[c], var_aa, i_66_, i_67_);
				}
			}
		}
	}
	
	private final void method554(byte[] bs, int[] is, int i, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_) {
		int i_84_ = i >>> 24;
		int i_85_ = 255 - i_84_;
		for (int i_86_ = -i_81_; i_86_ < 0; i_86_++) {
			for (int i_87_ = -i_80_; i_87_ < 0; i_87_++) {
				if (bs[i_78_++] != 0) {
					int i_88_ = ((i & 0xff00ff) * i_84_ & ~0xff00ff) + ((i & 0xff00) * i_84_ & 0xff0000) >> 8;
					int i_89_ = is[i_79_];
					is[i_79_++] = (((i_89_ & 0xff00ff) * i_85_ & ~0xff00ff) + ((i_89_ & 0xff00) * i_85_ & 0xff0000) >> 8) + i_88_;
				} else {
					i_79_++;
				}
			}
			i_79_ += i_82_;
			i_78_ += i_83_;
		}
	}
	
	private final void method555(byte[] bs, int[] is, int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_) {
		int i_96_ = -(i_92_ >> 2);
		i_92_ = -(i_92_ & 0x3);
		for (int i_97_ = -i_93_; i_97_ < 0; i_97_++) {
			for (int i_98_ = i_96_; i_98_ < 0; i_98_++) {
				if (bs[i_90_++] != 0) {
					is[i_91_++] = i;
				} else {
					i_91_++;
				}
				if (bs[i_90_++] != 0) {
					is[i_91_++] = i;
				} else {
					i_91_++;
				}
				if (bs[i_90_++] != 0) {
					is[i_91_++] = i;
				} else {
					i_91_++;
				}
				if (bs[i_90_++] != 0) {
					is[i_91_++] = i;
				} else {
					i_91_++;
				}
			}
			for (int i_99_ = i_92_; i_99_ < 0; i_99_++) {
				if (bs[i_90_++] != 0) {
					is[i_91_++] = i;
				} else {
					i_91_++;
				}
			}
			i_91_ += i_94_;
			i_90_ += i_95_;
		}
	}
}
