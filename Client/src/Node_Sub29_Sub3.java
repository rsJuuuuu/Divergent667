/* Node_Sub29_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub29_Sub3 extends Node_Sub29
{
	static int anInt10021;
	static int anInt10022;
	static int anInt10023;
	static int anInt10024;
	static int anInt10025;
	static short aShort10026;
	static short aShort10027 = 256;
	
	Node_Sub29_Sub3(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
		super(i, i_0_, i_1_, i_2_, i_3_, f);
	}
	
	static final void method2717(int i, boolean bool) {
		Class13.method209(bool, Class320_Sub15.WINDOWS_PANE_ID, -104, Class205.screenHeight, Class360.screenWidth);
		if (i != 1) {
			aShort10026 = (short) 59;
		}
		anInt10023++;
	}
	
	static final Class371 method2718(int i) {
		anInt10025++;
		if (i != -27615) {
			return null;
		}
		return Node_Sub23_Sub1.method2638(1, (byte) -77);
	}
	
	final void method2712(byte b, float f) {
		aFloat7339 = f;
		if (b > 55) {
			anInt10024++;
		}
	}
	
	static final byte[][][] method2719(int i, int i_4_) {
		anInt10022++;
		byte[][][] bs = new byte[8][4][];
		int i_5_ = i_4_;
		int i_6_ = i_4_;
		byte[] bs_7_ = new byte[i_6_ * i_5_];
		int i_8_ = 0;
		for (int i_9_ = 0; i_6_ > i_9_; i_9_++) {
			for (int i_10_ = 0; (i_5_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
				if (i_10_ <= i_9_) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[0][0] = bs_7_;
		bs_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_11_ = i_6_ + -1; i_11_ >= 0; i_11_--) {
			for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_12_++) {
				if ((i_12_ ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[0][1] = bs_7_;
		bs_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_13_++) {
			for (int i_14_ = 0; i_5_ > i_14_; i_14_++) {
				if (i_14_ >= i_13_) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[0][2] = bs_7_;
		bs_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_15_ = i_6_ - 1; i_15_ >= 0; i_15_--) {
			for (int i_16_ = 0; (i_5_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				if ((i_16_ ^ 0xffffffff) <= (i_15_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[0][3] = bs_7_;
		bs_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_17_ = -1 + i_6_; i_17_ >= 0; i_17_--) {
			for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_18_++) {
				if ((i_18_ ^ 0xffffffff) >= (i_17_ >> 1 ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[1][0] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_19_ = 0; i_6_ > i_19_; i_19_++) {
			for (int i_20_ = 0; i_5_ > i_20_; i_20_++) {
				if (i_8_ < 0 || (bs_7_.length ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)) {
					i_8_++;
				} else {
					if ((i_19_ << 1 ^ 0xffffffff) >= (i_20_ ^ 0xffffffff)) {
						bs_7_[i_8_] = (byte) -1;
					}
					i_8_++;
				}
			}
		}
		bs[1][1] = bs_7_;
		bs_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_21_ = 0; (i_6_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
			for (int i_22_ = -1 + i_5_; i_22_ >= 0; i_22_--) {
				if (i_22_ <= i_21_ >> 1) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[1][2] = bs_7_;
		bs_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_23_ = -1 + i_6_; i_23_ >= 0; i_23_--) {
			for (int i_24_ = -1 + i_5_; i_24_ >= 0; i_24_--) {
				if ((i_24_ ^ 0xffffffff) <= (i_23_ << 1 ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[1][3] = bs_7_;
		bs_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_25_ = i_6_ + -1; (i_25_ ^ 0xffffffff) <= -1; i_25_--) {
			for (int i_26_ = i_5_ - 1; (i_26_ ^ 0xffffffff) <= -1; i_26_--) {
				if (i_25_ >> 1 >= i_26_) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[2][0] = bs_7_;
		bs_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_27_ = i_6_ - 1; i_27_ >= 0; i_27_--) {
			for (int i_28_ = 0; i_5_ > i_28_; i_28_++) {
				if ((i_27_ << 1 ^ 0xffffffff) >= (i_28_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[2][1] = bs_7_;
		bs_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_29_ = 0; i_29_ < i_6_; i_29_++) {
			for (int i_30_ = 0; (i_5_ ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++) {
				if ((i_30_ ^ 0xffffffff) >= (i_29_ >> 1 ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[2][2] = bs_7_;
		bs_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_31_ = 0; i_6_ > i_31_; i_31_++) {
			for (int i_32_ = i_5_ - 1; (i_32_ ^ 0xffffffff) <= -1; i_32_--) {
				if (i_31_ << 1 <= i_32_) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[2][3] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_33_ = i_6_ - 1; i_33_ >= 0; i_33_--) {
			for (int i_34_ = 0; (i_5_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
				if ((i_33_ >> 1 ^ 0xffffffff) >= (i_34_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[3][0] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_6_ * i_5_];
		for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_35_++) {
			for (int i_36_ = 0; i_5_ > i_36_; i_36_++) {
				if (i_36_ <= i_35_ << 1) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[3][1] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_37_ = 0; i_37_ < i_6_; i_37_++) {
			for (int i_38_ = i_5_ - 1; i_38_ >= 0; i_38_--) {
				if ((i_37_ >> 1 ^ 0xffffffff) >= (i_38_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[3][2] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_6_ * i_5_];
		for (int i_39_ = -1 + i_6_; i_39_ >= 0; i_39_--) {
			for (int i_40_ = -1 + i_5_; (i_40_ ^ 0xffffffff) <= -1; i_40_--) {
				if (i_40_ <= i_39_ << 1) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[3][3] = bs_7_;
		bs_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_41_ = -1 + i_6_; (i_41_ ^ 0xffffffff) <= -1; i_41_--) {
			for (int i_42_ = i_5_ - 1; (i_42_ ^ 0xffffffff) <= -1; i_42_--) {
				if (i_41_ >> 1 <= i_42_) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[4][0] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_43_ = i_6_ - 1; i_43_ >= 0; i_43_--) {
			for (int i_44_ = 0; i_44_ < i_5_; i_44_++) {
				if (i_44_ <= i_43_ << 1) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[4][1] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_45_ = 0; (i_6_ ^ 0xffffffff) < (i_45_ ^ 0xffffffff); i_45_++) {
			for (int i_46_ = 0; i_5_ > i_46_; i_46_++) {
				if (i_46_ >= i_45_ >> 1) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[4][2] = bs_7_;
		bs_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_47_ = 0; (i_6_ ^ 0xffffffff) < (i_47_ ^ 0xffffffff); i_47_++) {
			for (int i_48_ = -1 + i_5_; i_48_ >= 0; i_48_--) {
				if ((i_47_ << 1 ^ 0xffffffff) <= (i_48_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[4][3] = bs_7_;
		bs_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		int i_49_ = 0;
		if (i != -7499) {
			method2718(-50);
		}
		for (/**/; (i_6_ ^ 0xffffffff) < (i_49_ ^ 0xffffffff); i_49_++) {
			for (int i_50_ = 0; i_50_ < i_5_; i_50_++) {
				if (i_50_ <= i_5_ / 2) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[5][0] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_51_ = 0; (i_51_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_51_++) {
			for (int i_52_ = 0; (i_5_ ^ 0xffffffff) < (i_52_ ^ 0xffffffff); i_52_++) {
				if ((i_6_ / 2 ^ 0xffffffff) <= (i_51_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[5][1] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_6_ * i_5_];
		for (int i_53_ = 0; i_6_ > i_53_; i_53_++) {
			for (int i_54_ = 0; i_5_ > i_54_; i_54_++) {
				if (i_5_ / 2 <= i_54_) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[5][2] = bs_7_;
		bs_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_55_ = 0; (i_55_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_55_++) {
			for (int i_56_ = 0; i_56_ < i_5_; i_56_++) {
				if (i_6_ / 2 <= i_55_) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[5][3] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_6_ * i_5_];
		for (int i_57_ = 0; (i_57_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_57_++) {
			for (int i_58_ = 0; (i_5_ ^ 0xffffffff) < (i_58_ ^ 0xffffffff); i_58_++) {
				if ((i_57_ + -(i_6_ / 2) ^ 0xffffffff) <= (i_58_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[6][0] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_59_ = -1 + i_6_; (i_59_ ^ 0xffffffff) <= -1; i_59_--) {
			for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_60_++) {
				if (i_60_ <= -(i_6_ / 2) + i_59_) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[6][1] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_6_ * i_5_];
		for (int i_61_ = i_6_ + -1; (i_61_ ^ 0xffffffff) <= -1; i_61_--) {
			for (int i_62_ = i_5_ + -1; (i_62_ ^ 0xffffffff) <= -1; i_62_--) {
				if ((i_62_ ^ 0xffffffff) >= (i_61_ + -(i_6_ / 2) ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[6][2] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_63_++) {
			for (int i_64_ = i_5_ - 1; i_64_ >= 0; i_64_--) {
				if (i_63_ - i_6_ / 2 >= i_64_) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[6][3] = bs_7_;
		bs_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_65_ = 0; (i_65_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_65_++) {
			for (int i_66_ = 0; i_66_ < i_5_; i_66_++) {
				if ((i_65_ - i_6_ / 2 ^ 0xffffffff) >= (i_66_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[7][0] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_67_ = i_6_ - 1; (i_67_ ^ 0xffffffff) <= -1; i_67_--) {
			for (int i_68_ = 0; i_68_ < i_5_; i_68_++) {
				if (i_68_ >= i_67_ + -(i_6_ / 2)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[7][1] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_69_ = -1 + i_6_; i_69_ >= 0; i_69_--) {
			for (int i_70_ = -1 + i_5_; (i_70_ ^ 0xffffffff) <= -1; i_70_--) {
				if ((i_70_ ^ 0xffffffff) <= (-(i_6_ / 2) + i_69_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[7][2] = bs_7_;
		i_8_ = 0;
		bs_7_ = new byte[i_5_ * i_6_];
		for (int i_71_ = 0; i_6_ > i_71_; i_71_++) {
			for (int i_72_ = i_5_ - 1; (i_72_ ^ 0xffffffff) <= -1; i_72_--) {
				if ((i_72_ ^ 0xffffffff) <= (-(i_6_ / 2) + i_71_ ^ 0xffffffff)) {
					bs_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		bs[7][3] = bs_7_;
		return bs;
	}
	
	final void method2706(int i, int i_73_, int i_74_, int i_75_) {
		anInt7342 = i_73_;
		anInt7340 = i_74_;
		if (i != 4752) {
			aShort10026 = (short) -106;
		}
		anInt10021++;
		anInt7346 = i_75_;
	}
	
	static {
		aShort10026 = (short) 205;
	}
}
