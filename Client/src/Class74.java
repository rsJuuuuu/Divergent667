/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class74
{
	private static int anInt993;
	private static int anInt994;
	private static int anInt995;
	private static int anInt996;
	private static int[] anIntArray997;
	private static int anInt998;
	private static int anInt999;
	private static int anInt1000;
	
	private static final void method753() {
		anInt995 = 0;
	}
	
	private static final boolean method754(int i) {
		int i_0_ = anInt994;
		int i_1_ = anInt993;
		int i_2_ = anInt1000;
		int i_3_;
		for (/**/; i_1_ >= i_0_; i_1_ = i_3_) {
			anInt1000 = ++i_2_;
			if (i_2_ >= i) {
				return false;
			}
			i_3_ = anInt998;
			for (/**/; i_0_ < anInt995; i_0_ += 4) {
				int i_4_ = anIntArray997[i_0_ + 1];
				if (i_2_ < i_4_) {
					break;
				}
				int i_5_ = anIntArray997[i_0_];
				int i_6_ = anIntArray997[i_0_ + 2];
				int i_7_ = anIntArray997[i_0_ + 3];
				int i_8_ = (i_6_ - i_5_ << 16) / (i_7_ - i_4_);
				int i_9_ = (i_5_ << 16) + 32768;
				anIntArray997[i_0_] = i_9_;
				anIntArray997[i_0_ + 2] = i_8_;
			}
			for (int i_10_ = i_3_; i_10_ < i_0_; i_10_ += 4) {
				int i_11_ = anIntArray997[i_10_ + 3];
				if (i_2_ >= i_11_) {
					anIntArray997[i_10_] = anIntArray997[i_3_];
					anIntArray997[i_10_ + 1] = anIntArray997[i_3_ + 1];
					anIntArray997[i_10_ + 2] = anIntArray997[i_3_ + 2];
					anIntArray997[i_10_ + 3] = anIntArray997[i_3_ + 3];
					i_3_ += 4;
				}
			}
			if (i_3_ == anInt995) {
				anInt995 = 0;
				return false;
			}
			method759(i_3_, i_0_);
			anInt998 = i_3_;
			anInt994 = i_0_;
		}
		anInt996 = anIntArray997[i_1_] >> 16;
		anInt999 = anIntArray997[i_1_ + 4] >> 16;
		anIntArray997[i_1_] += anIntArray997[i_1_ + 2];
		anIntArray997[i_1_ + 4] += anIntArray997[i_1_ + 6];
		i_1_ += 8;
		anInt993 = i_1_;
		return true;
	}
	
	static final void method755(GraphicsToolkit graphicstoolkit, int[] is, int i) {
		method760(graphicstoolkit, is, 0, is.length, i, null, null);
	}
	
	private static final void method756(int i, int i_12_) {
		if (i_12_ > i + 4) {
			int i_13_ = i;
			int i_14_ = anIntArray997[i_13_];
			int i_15_ = anIntArray997[i_13_ + 1];
			int i_16_ = anIntArray997[i_13_ + 2];
			int i_17_ = anIntArray997[i_13_ + 3];
			for (int i_18_ = i + 4; i_18_ < i_12_; i_18_ += 4) {
				int i_19_ = anIntArray997[i_18_ + 1];
				if (i_19_ < i_15_) {
					anIntArray997[i_13_] = anIntArray997[i_18_];
					anIntArray997[i_13_ + 1] = i_19_;
					anIntArray997[i_13_ + 2] = anIntArray997[i_18_ + 2];
					anIntArray997[i_13_ + 3] = anIntArray997[i_18_ + 3];
					i_13_ += 4;
					anIntArray997[i_18_] = anIntArray997[i_13_];
					anIntArray997[i_18_ + 1] = anIntArray997[i_13_ + 1];
					anIntArray997[i_18_ + 2] = anIntArray997[i_13_ + 2];
					anIntArray997[i_18_ + 3] = anIntArray997[i_13_ + 3];
				}
			}
			anIntArray997[i_13_] = i_14_;
			anIntArray997[i_13_ + 1] = i_15_;
			anIntArray997[i_13_ + 2] = i_16_;
			anIntArray997[i_13_ + 3] = i_17_;
			method756(i, i_13_);
			method756(i_13_ + 4, i_12_);
		}
	}
	
	public static void method757() {
		anIntArray997 = null;
	}
	
	private static final void method758(int[] is, int i, int i_20_) {
		int i_21_ = anInt995 + (i_20_ << 1);
		if (anIntArray997 == null || anIntArray997.length < i_21_) {
			int[] is_22_ = new int[i_21_];
			for (int i_23_ = 0; i_23_ < anInt995; i_23_++)
				is_22_[i_23_] = anIntArray997[i_23_];
			anIntArray997 = is_22_;
		}
		i_20_ += i;
		int i_24_ = i_20_ - 2;
		for (int i_25_ = i; i_25_ < i_20_; i_25_ += 2) {
			int i_26_ = is[i_24_ + 1];
			int i_27_ = is[i_25_ + 1];
			if (i_26_ < i_27_) {
				anIntArray997[anInt995++] = is[i_24_];
				anIntArray997[anInt995++] = i_26_;
				anIntArray997[anInt995++] = is[i_25_];
				anIntArray997[anInt995++] = i_27_;
			} else if (i_27_ < i_26_) {
				anIntArray997[anInt995++] = is[i_25_];
				anIntArray997[anInt995++] = i_27_;
				anIntArray997[anInt995++] = is[i_24_];
				anIntArray997[anInt995++] = i_26_;
			}
			i_24_ = i_25_;
		}
	}
	
	private static final void method759(int i, int i_28_) {
		for (/**/; i_28_ >= i + 8; i_28_ -= 4) {
			boolean bool = true;
			for (int i_29_ = i + 4; i_29_ < i_28_; i_29_ += 4) {
				int i_30_ = anIntArray997[i_29_ - 4];
				int i_31_ = anIntArray997[i_29_];
				if (i_30_ > i_31_) {
					bool = false;
					anIntArray997[i_29_ - 4] = i_31_;
					anIntArray997[i_29_] = i_30_;
					i_30_ = anIntArray997[i_29_ - 2];
					anIntArray997[i_29_ - 2] = anIntArray997[i_29_ + 2];
					anIntArray997[i_29_ + 2] = i_30_;
					i_30_ = anIntArray997[i_29_ - 1];
					anIntArray997[i_29_ - 1] = anIntArray997[i_29_ + 3];
					anIntArray997[i_29_ + 3] = i_30_;
				}
			}
			if (bool) {
				break;
			}
		}
	}
	
	private static final void method760(GraphicsToolkit graphicstoolkit, int[] is, int i, int i_32_, int i_33_, int[] is_34_, int[] is_35_) {
		int[] is_36_ = new int[4];
		graphicstoolkit.K(is_36_);
		if (is_34_ != null && is_36_[3] - is_36_[1] != is_34_.length) {
			throw new IllegalStateException();
		}
		method753();
		method758(is, i, i_32_);
		method762(is_36_[1]);
		while (method754(is_36_[3])) {
			int i_37_ = anInt996;
			int i_38_ = anInt999;
			int i_39_ = anInt1000;
			if (is_34_ != null) {
				int i_40_ = i_39_ - is_36_[1];
				if (i_37_ < is_34_[i_40_] + is_36_[0]) {
					i_37_ = is_34_[i_40_] + is_36_[0];
				}
				if (i_38_ > is_34_[i_40_] + is_35_[i_40_] + is_36_[0]) {
					i_38_ = is_34_[i_40_] + is_35_[i_40_] + is_36_[0];
				}
				if (i_38_ - i_37_ <= 0) {
					continue;
				}
			}
			graphicstoolkit.U(i_37_, i_39_, i_38_ - i_37_, i_33_, 1);
		}
	}
	
	static final void method761(GraphicsToolkit graphicstoolkit, int[] is, int i, int[] is_41_, int[] is_42_) {
		method760(graphicstoolkit, is, 0, is.length, i, is_41_, is_42_);
	}
	
	private static final void method762(int i) {
		if (anInt995 < 0) {
			anInt998 = anInt994 = anInt993 = 0;
			anInt1000 = 2147483646;
		} else {
			method756(0, anInt995);
			int i_43_ = anIntArray997[1];
			if (i_43_ < i) {
				i_43_ = i;
			}
			int i_44_ = 0;
			int i_45_;
			for (i_45_ = 0; i_45_ < anInt995; i_45_ += 4) {
				int i_46_ = anIntArray997[i_45_ + 1];
				if (i_43_ < i_46_) {
					break;
				}
				int i_47_ = anIntArray997[i_45_];
				int i_48_ = anIntArray997[i_45_ + 2];
				int i_49_ = anIntArray997[i_45_ + 3];
				int i_50_ = (i_48_ - i_47_ << 16) / (i_49_ - i_46_);
				int i_51_ = (i_47_ << 16) + 32768;
				anIntArray997[i_45_] = i_51_ + (i_43_ - i_46_) * i_50_;
				anIntArray997[i_45_ + 2] = i_50_;
			}
			anInt998 = i_44_;
			anInt994 = i_45_;
			anInt993 = i_45_;
			anInt1000 = i_43_ - 1;
		}
	}
}
