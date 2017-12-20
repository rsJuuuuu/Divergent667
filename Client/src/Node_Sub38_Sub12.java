/* Node_Sub38_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub12 extends Node_Sub38
{
	private int anInt10224;
	static int anInt10225 = 765;
	static int anInt10226;
	static int anInt10227;
	static int anInt10228;
	private int anInt10229 = 1;
	static int anInt10230;
	static int anInt10231;
	
	final int[][] method2778(int i, boolean bool) {
		anInt10231++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (bool != true) {
			return null;
		}
		if (aClass348_7454.aBoolean4300) {
			int i_0_ = anInt10229 - (-anInt10229 + -1);
			int i_1_ = 65536 / i_0_;
			int i_2_ = 1 + (anInt10224 + anInt10224);
			int i_3_ = 65536 / i_2_;
			int[][][] is_4_ = new int[i_0_][][];
			for (int i_5_ = -anInt10229 + i; (i + anInt10229 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff); i_5_++) {
				int[][] is_6_ = this.method2777(-104, 0, r_Sub2.anInt11054 & i_5_);
				int[][] is_7_ = new int[3][Class339_Sub7.anInt8728];
				int i_8_ = 0;
				int i_9_ = 0;
				int i_10_ = 0;
				int[] is_11_ = is_6_[0];
				int[] is_12_ = is_6_[1];
				int[] is_13_ = is_6_[2];
				for (int i_14_ = -anInt10224; (i_14_ ^ 0xffffffff) >= (anInt10224 ^ 0xffffffff); i_14_++) {
					int i_15_ = i_14_ & Class303.anInt3824;
					i_10_ += is_13_[i_15_];
					i_8_ += is_11_[i_15_];
					i_9_ += is_12_[i_15_];
				}
				int[] is_16_ = is_7_[0];
				int[] is_17_ = is_7_[1];
				int[] is_18_ = is_7_[2];
				int i_19_ = 0;
				while (Class339_Sub7.anInt8728 > i_19_) {
					is_16_[i_19_] = i_8_ * i_3_ >> 16;
					is_17_[i_19_] = i_9_ * i_3_ >> 16;
					is_18_[i_19_] = i_3_ * i_10_ >> 16;
					int i_20_ = Class303.anInt3824 & i_19_ + -anInt10224;
					i_19_++;
					i_9_ -= is_12_[i_20_];
					i_10_ -= is_13_[i_20_];
					i_8_ -= is_11_[i_20_];
					i_20_ = Class303.anInt3824 & i_19_ + anInt10224;
					i_8_ += is_11_[i_20_];
					i_10_ += is_13_[i_20_];
					i_9_ += is_12_[i_20_];
				}
				is_4_[-i + (anInt10229 + i_5_)] = is_7_;
			}
			int[] is_21_ = is[0];
			int[] is_22_ = is[1];
			int[] is_23_ = is[2];
			for (int i_24_ = 0; i_24_ < Class339_Sub7.anInt8728; i_24_++) {
				int i_25_ = 0;
				int i_26_ = 0;
				int i_27_ = 0;
				for (int i_28_ = 0; (i_0_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
					int[][] is_29_ = is_4_[i_28_];
					i_25_ += is_29_[0][i_24_];
					i_26_ += is_29_[1][i_24_];
					i_27_ += is_29_[2][i_24_];
				}
				is_21_[i_24_] = i_1_ * i_25_ >> 16;
				is_22_[i_24_] = i_1_ * i_26_ >> 16;
				is_23_[i_24_] = i_27_ * i_1_ >> 16;
			}
		}
		return is;
	}
	
	static final Animable_Sub2 method2830(int i, int i_30_, int i_31_) {
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_30_][i_31_];
		if (class261 == null) {
			return null;
		}
		return class261.anAnimable_Sub2_3314;
	}
	
	final int[] method2775(int i, int i_32_) {
		anInt10227++;
		int[] is = aClass146_7460.method1645(27356, i_32_);
		if (aClass146_7460.aBoolean1819) {
			int i_33_ = anInt10229 + anInt10229 - -1;
			int i_34_ = 65536 / i_33_;
			int i_35_ = 1 + (anInt10224 + anInt10224);
			int i_36_ = 65536 / i_35_;
			int[][] is_37_ = new int[i_33_][];
			for (int i_38_ = i_32_ + -anInt10229; i_32_ - -anInt10229 >= i_38_; i_38_++) {
				int[] is_39_ = this.method2786(i_38_ & r_Sub2.anInt11054, 0, 0);
				int[] is_40_ = new int[Class339_Sub7.anInt8728];
				int i_41_ = 0;
				for (int i_42_ = -anInt10224; i_42_ <= anInt10224; i_42_++)
					i_41_ += is_39_[i_42_ & Class303.anInt3824];
				int i_43_ = 0;
				while (i_43_ < Class339_Sub7.anInt8728) {
					is_40_[i_43_] = i_36_ * i_41_ >> 16;
					i_41_ -= is_39_[Class303.anInt3824 & -anInt10224 + i_43_];
					i_43_++;
					i_41_ += is_39_[i_43_ + anInt10224 & Class303.anInt3824];
				}
				is_37_[i_38_ + (anInt10229 - i_32_)] = is_40_;
			}
			for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_44_++) {
				int i_45_ = 0;
				for (int i_46_ = 0; (i_33_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++)
					i_45_ += is_37_[i_46_][i_44_];
				is[i_44_] = i_45_ * i_34_ >> 16;
			}
		}
		if (i < 107) {
			method2775(-16, 56);
		}
		return is;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		if (bool == false) {
			anInt10226++;
			int i_47_ = i;
		while_149_:
			do {
				do {
					if (i_47_ != 0) {
						if ((i_47_ ^ 0xffffffff) != -2) {
							if (i_47_ == 2) {
								break;
							}
							break while_149_;
						}
					} else {
						anInt10224 = buffer.readUnsignedByte();
						return;
					}
					anInt10229 = buffer.readUnsignedByte();
					return;
				} while (false);
				aBoolean7463 = (buffer.readUnsignedByte() ^ 0xffffffff) == -2;
			} while (false);
		}
	}
	
	public Node_Sub38_Sub12() {
		super(1, false);
		anInt10224 = 1;
	}
}
