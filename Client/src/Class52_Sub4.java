/* Class52_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52_Sub4 extends Class52
{
	private byte[][] aByteArrayArray5574;
	private int[] anIntArray5575;
	private int[] anIntArray5576;
	private int[] anIntArray5577;
	private int[] anIntArray5578;
	private PureJavaToolkit aPureJavaToolkit5579;
	
	private final void method550(byte[] bs, int[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, aa var_aa, int i_9_, int i_10_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is_11_ = var_aa_Sub1.anIntArray5487;
		int[] is_12_ = var_aa_Sub1.anIntArray5488;
		int i_13_ = i_6_ - aPureJavaToolkit5579.anInt6767;
		int i_14_ = i_7_;
		if (i_10_ > i_14_) {
			i_14_ = i_10_;
			i_1_ += (i_10_ - i_7_) * aPureJavaToolkit5579.anInt6789;
			i_0_ += (i_10_ - i_7_) * i_8_;
		}
		int i_15_ = i_10_ + is_11_.length < i_7_ + i_3_ ? i_10_ + is_11_.length : i_7_ + i_3_;
		for (int i_16_ = i_14_; i_16_ < i_15_; i_16_++) {
			int i_17_ = is_11_[i_16_ - i_10_] + i_9_;
			int i_18_ = is_12_[i_16_ - i_10_];
			int i_19_ = i_2_;
			if (i_13_ > i_17_) {
				int i_20_ = i_13_ - i_17_;
				if (i_20_ >= i_18_) {
					i_0_ += i_2_ + i_5_;
					i_1_ += i_2_ + i_4_;
					continue;
				}
				i_18_ -= i_20_;
			} else {
				int i_21_ = i_17_ - i_13_;
				if (i_21_ >= i_2_) {
					i_0_ += i_2_ + i_5_;
					i_1_ += i_2_ + i_4_;
					continue;
				}
				i_0_ += i_21_;
				i_19_ -= i_21_;
				i_1_ += i_21_;
			}
			int i_22_ = 0;
			if (i_19_ < i_18_) {
				i_18_ = i_19_;
			} else {
				i_22_ = i_19_ - i_18_;
			}
			for (int i_23_ = -i_18_; i_23_ < 0; i_23_++) {
				int i_24_ = bs[i_0_++] & 0xff;
				if (i_24_ != 0) {
					int i_25_ = ((i & 0xff00ff) * i_24_ & ~0xff00ff) + ((i & 0xff00) * i_24_ & 0xff0000) >> 8;
					i_24_ = 256 - i_24_;
					int i_26_ = is[i_1_];
					is[i_1_++] = (((i_26_ & 0xff00ff) * i_24_ & ~0xff00ff) + ((i_26_ & 0xff00) * i_24_ & 0xff0000) >> 8) + i_25_;
				} else {
					i_1_++;
				}
			}
			i_0_ += i_22_ + i_5_;
			i_1_ += i_22_ + i_4_;
		}
	}
	
	Class52_Sub4(PureJavaToolkit purejavatoolkit, Class357 class357, Class383[] class383s, int[] is, int[] is_27_) {
		super(purejavatoolkit, class357);
		aPureJavaToolkit5579 = purejavatoolkit;
		aPureJavaToolkit5579 = purejavatoolkit;
		anIntArray5576 = is;
		anIntArray5577 = is_27_;
		aByteArrayArray5574 = new byte[class383s.length][];
		anIntArray5578 = new int[class383s.length];
		anIntArray5575 = new int[class383s.length];
		for (int i = 0; i < class383s.length; i++) {
			Class383 class383 = class383s[i];
			if (class383.aByteArray4905 != null) {
				aByteArrayArray5574[i] = class383.aByteArray4905;
			} else {
				byte[] bs = class383.aByteArray4903;
				byte[] bs_28_ = aByteArrayArray5574[i] = new byte[bs.length];
				for (int i_29_ = 0; i_29_ < bs.length; i_29_++)
					bs_28_[i_29_] = (byte) (bs[i_29_] == 0 ? 0 : -1);
			}
			anIntArray5578[i] = class383.anInt4898;
			anIntArray5575[i] = class383.anInt4902;
		}
	}
	
	final void method526(char c, int i, int i_30_, int i_31_, boolean bool, aa var_aa, int i_32_, int i_33_) {
		if (var_aa == null) {
			fa(c, i, i_30_, i_31_, bool);
		} else {
			i += anIntArray5575[c];
			i_30_ += anIntArray5578[c];
			int i_34_ = anIntArray5576[c];
			int i_35_ = anIntArray5577[c];
			int i_36_ = aPureJavaToolkit5579.anInt6789;
			int i_37_ = i + i_30_ * i_36_;
			int i_38_ = i_36_ - i_34_;
			int i_39_ = 0;
			int i_40_ = 0;
			if (i_30_ < aPureJavaToolkit5579.anInt6760) {
				int i_41_ = aPureJavaToolkit5579.anInt6760 - i_30_;
				i_35_ -= i_41_;
				i_30_ = aPureJavaToolkit5579.anInt6760;
				i_40_ += i_41_ * i_34_;
				i_37_ += i_41_ * i_36_;
			}
			if (i_30_ + i_35_ > aPureJavaToolkit5579.anInt6772) {
				i_35_ -= i_30_ + i_35_ - aPureJavaToolkit5579.anInt6772;
			}
			if (i < aPureJavaToolkit5579.anInt6767) {
				int i_42_ = aPureJavaToolkit5579.anInt6767 - i;
				i_34_ -= i_42_;
				i = aPureJavaToolkit5579.anInt6767;
				i_40_ += i_42_;
				i_37_ += i_42_;
				i_39_ += i_42_;
				i_38_ += i_42_;
			}
			if (i + i_34_ > aPureJavaToolkit5579.anInt6778) {
				int i_43_ = i + i_34_ - aPureJavaToolkit5579.anInt6778;
				i_34_ -= i_43_;
				i_39_ += i_43_;
				i_38_ += i_43_;
			}
			if (i_34_ > 0 && i_35_ > 0) {
				method550(aByteArrayArray5574[c], aPureJavaToolkit5579.anIntArray6787, i_31_, i_40_, i_37_, i_34_, i_35_, i_38_, i_39_, i, i_30_, anIntArray5576[c], var_aa, i_32_, i_33_);
			}
		}
	}
	
	private final void method551(byte[] bs, int[] is, int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
		for (int i_50_ = -i_47_; i_50_ < 0; i_50_++) {
			for (int i_51_ = -i_46_; i_51_ < 0; i_51_++) {
				int i_52_ = bs[i_44_++] & 0xff;
				if (i_52_ != 0) {
					int i_53_ = ((i & 0xff00ff) * i_52_ & ~0xff00ff) + ((i & 0xff00) * i_52_ & 0xff0000) >> 8;
					i_52_ = 256 - i_52_;
					int i_54_ = is[i_45_];
					is[i_45_++] = (((i_54_ & 0xff00ff) * i_52_ & ~0xff00ff) + ((i_54_ & 0xff00) * i_52_ & 0xff0000) >> 8) + i_53_;
				} else {
					i_45_++;
				}
			}
			i_45_ += i_48_;
			i_44_ += i_49_;
		}
	}
	
	final void fa(char c, int i, int i_55_, int i_56_, boolean bool) {
		i += anIntArray5575[c];
		i_55_ += anIntArray5578[c];
		int i_57_ = anIntArray5576[c];
		int i_58_ = anIntArray5577[c];
		int i_59_ = aPureJavaToolkit5579.anInt6789;
		int i_60_ = i + i_55_ * i_59_;
		int i_61_ = i_59_ - i_57_;
		int i_62_ = 0;
		int i_63_ = 0;
		if (i_55_ < aPureJavaToolkit5579.anInt6760) {
			int i_64_ = aPureJavaToolkit5579.anInt6760 - i_55_;
			i_58_ -= i_64_;
			i_55_ = aPureJavaToolkit5579.anInt6760;
			i_63_ += i_64_ * i_57_;
			i_60_ += i_64_ * i_59_;
		}
		if (i_55_ + i_58_ > aPureJavaToolkit5579.anInt6772) {
			i_58_ -= i_55_ + i_58_ - aPureJavaToolkit5579.anInt6772;
		}
		if (i < aPureJavaToolkit5579.anInt6767) {
			int i_65_ = aPureJavaToolkit5579.anInt6767 - i;
			i_57_ -= i_65_;
			i = aPureJavaToolkit5579.anInt6767;
			i_63_ += i_65_;
			i_60_ += i_65_;
			i_62_ += i_65_;
			i_61_ += i_65_;
		}
		if (i + i_57_ > aPureJavaToolkit5579.anInt6778) {
			int i_66_ = i + i_57_ - aPureJavaToolkit5579.anInt6778;
			i_57_ -= i_66_;
			i_62_ += i_66_;
			i_61_ += i_66_;
		}
		if (i_57_ > 0 && i_58_ > 0) {
			method551(aByteArrayArray5574[c], aPureJavaToolkit5579.anIntArray6787, i_56_, i_63_, i_60_, i_57_, i_58_, i_61_, i_62_);
		}
	}
}
