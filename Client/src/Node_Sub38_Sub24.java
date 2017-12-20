/* Node_Sub38_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub24 extends Node_Sub38
{
	static int anInt10348;
	static int anInt10349;
	private Class144[] aClass144Array10350;
	static int anInt10351;
	static int[] anIntArray10352 = { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	static int anInt10353;
	static int anInt10354;
	static int anInt10355;
	static GLSprite[] aGLSpriteArray10356;
	
	public static void method2867(int i) {
		aGLSpriteArray10356 = null;
		anIntArray10352 = null;
		if (i != -24055) {
			aGLSpriteArray10356 = null;
		}
	}
	
	final int[] method2775(int i, int i_0_) {
		anInt10351++;
		if (i < 107) {
			aGLSpriteArray10356 = null;
		}
		int[] is = aClass146_7460.method1645(27356, i_0_);
		if (aClass146_7460.aBoolean1819) {
			method2870(0, aClass146_7460.method1642((byte) 123));
		}
		return is;
	}
	
	static final void method2868(int i, int i_1_, int i_2_, int i_3_) {
		anInt10355++;
		i_1_ <<= 3;
		i_3_ <<= 3;
		i_2_ <<= i;
		if (Class320_Sub22.anInt8415 == 2) {
			OutcommingPacket.anInt4050 = i_3_;
			Class48.anInt704 = i_1_;
			Class170.anInt2053 = i_2_;
		}
		Class257.aFloat3243 = (float) i_3_;
		Node_Sub12.aFloat5450 = (float) i_2_;
		Class169_Sub4.method1787((byte) -19);
		Node_Sub25_Sub1.aBoolean9950 = true;
	}
	
	static final Class124 method2869(int i, int i_4_) {
		anInt10354++;
		Class124[] class124s = Class144_Sub3.method1635((byte) -68);
		if (i_4_ >= -94) {
			anIntArray10352 = null;
		}
		Class124[] class124s_5_ = class124s;
		for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (class124s_5_.length ^ 0xffffffff); i_6_++) {
			Class124 class124 = class124s_5_[i_6_];
			if (i == class124.anInt1602) {
				return class124;
			}
		}
		return null;
	}
	
	private final void method2870(int i, int[][] is) {
		anInt10353++;
		int i_7_ = Class339_Sub7.anInt8728;
		int i_8_ = Node_Sub38_Sub1.anInt10083;
		Class188_Sub1_Sub2.method1897(1, is);
		Class52.method544(r_Sub2.anInt11054, 0, Class303.anInt3824, i, (byte) -125);
		if (aClass144Array10350 != null) {
			for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (aClass144Array10350.length ^ 0xffffffff); i_9_++) {
				Class144 class144 = aClass144Array10350[i_9_];
				int i_10_ = class144.anInt1785;
				int i_11_ = class144.anInt1787;
				if (i_10_ >= 0) {
					if (i_11_ < 0) {
						class144.method1626(i_7_, i_8_, 3);
					} else {
						class144.method1630(i_8_, i ^ 0xffffffff, i_7_);
					}
				} else if ((i_11_ ^ 0xffffffff) <= -1) {
					class144.method1629(i_8_, -12850, i_7_);
				}
			}
		}
	}
	
	final int[][] method2778(int i, boolean bool) {
		if (bool != true) {
			return null;
		}
		anInt10348++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int i_12_ = Class339_Sub7.anInt8728;
			int i_13_ = Node_Sub38_Sub1.anInt10083;
			int[][] is_14_ = new int[i_13_][i_12_];
			int[][][] is_15_ = aClass348_7454.method3982(0);
			method2870(0, is_14_);
			for (int i_16_ = 0; i_16_ < Node_Sub38_Sub1.anInt10083; i_16_++) {
				int[] is_17_ = is_14_[i_16_];
				int[][] is_18_ = is_15_[i_16_];
				int[] is_19_ = is_18_[0];
				int[] is_20_ = is_18_[1];
				int[] is_21_ = is_18_[2];
				for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_22_++) {
					int i_23_ = is_17_[i_22_];
					is_21_[i_22_] = Node_Sub30.method2723(i_23_, 255) << 4;
					is_20_[i_22_] = Node_Sub30.method2723(i_23_, 65280) >> 4;
					is_19_[i_22_] = Node_Sub30.method2723(i_23_ >> 12, 4080);
				}
			}
		}
		return is;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		if (i != 0) {
			if ((i ^ 0xffffffff) == -2) {
				aBoolean7463 = buffer.readUnsignedByte() == 1;
			}
		} else {
			aClass144Array10350 = new Class144[buffer.readUnsignedByte()];
			int i_24_ = 0;
		while_220_:
			for (/**/; (aClass144Array10350.length ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
				int i_25_ = buffer.readUnsignedByte();
				int i_26_ = i_25_;
			while_218_:
				do {
					do {
						if (i_26_ != 0) {
							if ((i_26_ ^ 0xffffffff) != -2) {
								if (i_26_ != 2) {
									if ((i_26_ ^ 0xffffffff) != -4) {
										continue while_220_;
									}
								} else {
									break;
								}
								break while_218_;
							}
						} else {
							aClass144Array10350[i_24_] = Class163.method1734(buffer, (byte) -72);
							continue while_220_;
						}
						aClass144Array10350[i_24_] = Node_Sub31.method2727(buffer, (byte) 120);
						continue while_220_;
					} while (false);
					aClass144Array10350[i_24_] = Class83.method801((byte) -30, buffer);
					continue while_220_;
				} while (false);
				aClass144Array10350[i_24_] = Class194_Sub1.method1966((byte) -115, buffer);
			}
		}
		anInt10349++;
		if (bool != false) {
			method2780(false, null, -67);
		}
	}
	
	public Node_Sub38_Sub24() {
		super(0, true);
	}
}
