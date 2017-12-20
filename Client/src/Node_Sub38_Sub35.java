/* Node_Sub38_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub35 extends Node_Sub38
{
	static int anInt10448;
	static int anInt10449;
	private int anInt10450;
	static int anInt10451;
	static Class312 aClass312_10452 = new Class312();
	private int anInt10453 = 0;
	static int anInt10454;
	static d aD10455;
	
	final int[] method2775(int i, int i_0_) {
		anInt10451++;
		int[] is = aClass146_7460.method1645(27356, i_0_);
		if (aClass146_7460.aBoolean1819) {
			int[] is_1_ = this.method2786(i_0_, 0, 0);
			for (int i_2_ = 0; i_2_ < Class339_Sub7.anInt8728; i_2_++) {
				int i_3_ = is_1_[i_2_];
				if ((i_3_ ^ 0xffffffff) > (anInt10453 ^ 0xffffffff)) {
					is[i_2_] = anInt10453;
				} else if ((anInt10450 ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
					is[i_2_] = anInt10450;
				} else {
					is[i_2_] = i_3_;
				}
			}
		}
		if (i < 107) {
			aD10455 = null;
		}
		return is;
	}
	
	public static void method2903(byte b) {
		aD10455 = null;
		aClass312_10452 = null;
		if (b >= -58) {
			method2903((byte) 105);
		}
	}
	
	public Node_Sub38_Sub35() {
		super(1, false);
		anInt10450 = 4096;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt10449++;
		int i_4_ = i;
	while_264_:
		do {
			do {
				if (i_4_ != 0) {
					if ((i_4_ ^ 0xffffffff) != -2) {
						if (i_4_ == 2) {
							break;
						}
						break while_264_;
					}
				} else {
					anInt10453 = buffer.readUnsignedShort();
					break while_264_;
				}
				anInt10450 = buffer.readUnsignedShort();
				break while_264_;
			} while (false);
			aBoolean7463 = buffer.readUnsignedByte() == 1;
		} while (false);
		if (bool != false) {
			method2778(0, true);
		}
	}
	
	final int[][] method2778(int i, boolean bool) {
		if (bool != true) {
			method2778(6, true);
		}
		anInt10448++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int[][] is_5_ = this.method2777(-110, 0, i);
			int[] is_6_ = is_5_[0];
			int[] is_7_ = is_5_[1];
			int[] is_8_ = is_5_[2];
			int[] is_9_ = is[0];
			int[] is_10_ = is[1];
			int[] is_11_ = is[2];
			for (int i_12_ = 0; i_12_ < Class339_Sub7.anInt8728; i_12_++) {
				int i_13_ = is_6_[i_12_];
				int i_14_ = is_7_[i_12_];
				int i_15_ = is_8_[i_12_];
				if ((anInt10453 ^ 0xffffffff) >= (i_13_ ^ 0xffffffff)) {
					if (anInt10450 >= i_13_) {
						is_9_[i_12_] = i_13_;
					} else {
						is_9_[i_12_] = anInt10450;
					}
				} else {
					is_9_[i_12_] = anInt10453;
				}
				if ((anInt10453 ^ 0xffffffff) < (i_14_ ^ 0xffffffff)) {
					is_10_[i_12_] = anInt10453;
				} else if ((i_14_ ^ 0xffffffff) < (anInt10450 ^ 0xffffffff)) {
					is_10_[i_12_] = anInt10450;
				} else {
					is_10_[i_12_] = i_14_;
				}
				if (anInt10453 <= i_15_) {
					if ((anInt10450 ^ 0xffffffff) <= (i_15_ ^ 0xffffffff)) {
						is_11_[i_12_] = i_15_;
					} else {
						is_11_[i_12_] = anInt10450;
					}
				} else {
					is_11_[i_12_] = anInt10453;
				}
			}
		}
		return is;
	}
}
