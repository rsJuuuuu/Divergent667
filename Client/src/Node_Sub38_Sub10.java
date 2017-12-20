/* Node_Sub38_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub10 extends Node_Sub38
{
	static int anInt10193;
	static int anInt10194;
	private int anInt10195 = 32768;
	static int anInt10196;
	static Index aClass302_10197;
	static int anInt10198;
	static int anInt10199;
	
	final int[][] method2778(int i, boolean bool) {
		anInt10194++;
		if (bool != true) {
			method2785(3);
		}
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int[] is_0_ = this.method2786(i, 0, 1);
			int[] is_1_ = this.method2786(i, 0, 2);
			int[] is_2_ = is[0];
			int[] is_3_ = is[1];
			int[] is_4_ = is[2];
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_5_++) {
				int i_6_ = (255 * is_0_[i_5_] & 0xff1df) >> 12;
				int i_7_ = is_1_[i_5_] * anInt10195 >> 12;
				int i_8_ = Class17.anIntArray277[i_6_] * i_7_ >> 12;
				int i_9_ = Class122.anIntArray1556[i_6_] * i_7_ >> 12;
				int i_10_ = Class303.anInt3824 & i_5_ - -(i_8_ >> 12);
				int i_11_ = r_Sub2.anInt11054 & (i_9_ >> 12) + i;
				int[][] is_12_ = this.method2777(-81, 0, i_11_);
				is_2_[i_5_] = is_12_[0][i_10_];
				is_3_[i_5_] = is_12_[1][i_10_];
				is_4_[i_5_] = is_12_[2][i_10_];
			}
		}
		return is;
	}
	
	static final void method2824(int i) {
		anInt10196++;
		Animable_Sub3_Sub1.aClass234_11017.method2146(-4756);
		for (int i_13_ = 0; i_13_ < 32; i_13_++)
			Class253.aLongArray3193[i_13_] = 0L;
		for (int i_14_ = i; i_14_ < 32; i_14_++)
			Class66_Sub2.aLongArray8997[i_14_] = 0L;
		Class22.anInt431 = 0;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		int i_15_ = i;
		do {
			if ((i_15_ ^ 0xffffffff) != -1) {
				if ((i_15_ ^ 0xffffffff) != -2) {
					break;
				}
			} else {
				anInt10195 = buffer.readUnsignedShort() << 4;
				break;
			}
			aBoolean7463 = buffer.readUnsignedByte() == 1;
		} while (false);
		if (bool != false) {
			aClass302_10197 = null;
		}
		anInt10193++;
	}
	
	public Node_Sub38_Sub10() {
		super(3, false);
	}
	
	final int[] method2775(int i, int i_16_) {
		anInt10198++;
		if (i < 107) {
			anInt10195 = -107;
		}
		int[] is = aClass146_7460.method1645(27356, i_16_);
		if (aClass146_7460.aBoolean1819) {
			int[] is_17_ = this.method2786(i_16_, 0, 1);
			int[] is_18_ = this.method2786(i_16_, 0, 2);
			for (int i_19_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
				int i_20_ = is_17_[i_19_] >> 4 & 0xff;
				int i_21_ = anInt10195 * is_18_[i_19_] >> 12;
				int i_22_ = Class17.anIntArray277[i_20_] * i_21_ >> 12;
				int i_23_ = Class122.anIntArray1556[i_20_] * i_21_ >> 12;
				int i_24_ = Class303.anInt3824 & i_19_ + (i_22_ >> 12);
				int i_25_ = i_16_ + (i_23_ >> 12) & r_Sub2.anInt11054;
				int[] is_26_ = this.method2786(i_25_, 0, 0);
				is[i_19_] = is_26_[i_24_];
			}
		}
		return is;
	}
	
	final void method2785(int i) {
		Node_Sub37.method2772((byte) 54);
		if (i == 7) {
			anInt10199++;
		}
	}
	
	public static void method2825(byte b) {
		if (b > -60) {
			aClass302_10197 = null;
		}
		aClass302_10197 = null;
	}
}
