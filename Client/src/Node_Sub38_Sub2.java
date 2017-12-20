/* Node_Sub38_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub2 extends Node_Sub38
{
	static int anInt10091;
	static IncommingPacket aClass192_10092 = new IncommingPacket(64, 3);
	static int anInt10093;
	static int anInt10094;
	static int anInt10095;
	static int[] anIntArray10096 = { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };
	/*synthetic*/ static Class<?> aClass10097;
	
	static final boolean method2793(int i, String string) {
		anInt10094++;
		if (i != 1) {
			return true;
		}
		return Animable_Sub1_Sub1.method830(aClass10097 == null ? aClass10097 = method2795("Class304") : aClass10097, true, string);
	}
	
	final int[][] method2778(int i, boolean bool) {
		anInt10095++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (bool != true) {
			return null;
		}
		if (aClass348_7454.aBoolean4300) {
			int[] is_0_ = this.method2786(i, 0, 2);
			int[][] is_1_ = this.method2777(-114, 0, i);
			int[][] is_2_ = this.method2777(-109, 1, i);
			int[] is_3_ = is[0];
			int[] is_4_ = is[1];
			int[] is_5_ = is[2];
			int[] is_6_ = is_1_[0];
			int[] is_7_ = is_1_[1];
			int[] is_8_ = is_1_[2];
			int[] is_9_ = is_2_[0];
			int[] is_10_ = is_2_[1];
			int[] is_11_ = is_2_[2];
			for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_12_++) {
				int i_13_ = is_0_[i_12_];
				if ((i_13_ ^ 0xffffffff) != -4097) {
					if (i_13_ != 0) {
						int i_14_ = -i_13_ + 4096;
						is_3_[i_12_] = i_14_ * is_9_[i_12_] + is_6_[i_12_] * i_13_ >> 12;
						is_4_[i_12_] = is_10_[i_12_] * i_14_ + i_13_ * is_7_[i_12_] >> 12;
						is_5_[i_12_] = is_11_[i_12_] * i_14_ + i_13_ * is_8_[i_12_] >> 12;
					} else {
						is_3_[i_12_] = is_9_[i_12_];
						is_4_[i_12_] = is_10_[i_12_];
						is_5_[i_12_] = is_11_[i_12_];
					}
				} else {
					is_3_[i_12_] = is_6_[i_12_];
					is_4_[i_12_] = is_7_[i_12_];
					is_5_[i_12_] = is_8_[i_12_];
				}
			}
		}
		return is;
	}
	
	final int[] method2775(int i, int i_15_) {
		anInt10091++;
		int[] is = aClass146_7460.method1645(27356, i_15_);
		if (aClass146_7460.aBoolean1819) {
			int[] is_16_ = this.method2786(i_15_, 0, 0);
			int[] is_17_ = this.method2786(i_15_, 0, 1);
			int[] is_18_ = this.method2786(i_15_, 0, 2);
			for (int i_19_ = 0; i_19_ < Class339_Sub7.anInt8728; i_19_++) {
				int i_20_ = is_18_[i_19_];
				if ((i_20_ ^ 0xffffffff) != -4097) {
					if ((i_20_ ^ 0xffffffff) == -1) {
						is[i_19_] = is_17_[i_19_];
					} else {
						is[i_19_] = i_20_ * is_16_[i_19_] - -((-i_20_ + 4096) * is_17_[i_19_]) >> 12;
					}
				} else {
					is[i_19_] = is_16_[i_19_];
				}
			}
		}
		if (i <= 107) {
			anIntArray10096 = null;
		}
		return is;
	}
	
	public static void method2794(int i) {
		if (i != 0) {
			aClass192_10092 = null;
		}
		aClass192_10092 = null;
		anIntArray10096 = null;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt10093++;
		if (i == 0) {
			aBoolean7463 = buffer.readUnsignedByte() == 1;
		}
		if (bool != false) {
			anIntArray10096 = null;
		}
	}
	
	public Node_Sub38_Sub2() {
		super(3, false);
	}
	
	/*synthetic*/ static Class<?> method2795(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
