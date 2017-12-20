/* Node_Sub38_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub5 extends Node_Sub38
{
	static int anInt10119;
	static int anInt10120;
	private int anInt10121 = 4096;
	private int anInt10122;
	static Class228 aClass228_10123;
	static int anInt10124;
	static boolean aBoolean10125 = false;
	private int anInt10126 = 4096;
	private int[] anIntArray10127;
	static int anInt10128;
	private int anInt10129 = 409;
	static boolean aBoolean10130;
	static int[] anIntArray10131;
	
	static final byte[] method2801(int i, Object object, int i_0_, int i_1_) {
		anInt10124++;
		if (object == null) {
			return null;
		}
		if (object instanceof byte[]) {
			byte[] bs = (byte[]) object;
			return Class310.method3593(i_1_, i, true, bs);
		}
		if (i_0_ != 1) {
			return null;
		}
		if (object instanceof Class201) {
			Class201 class201 = (Class201) object;
			return class201.method2020((byte) 104, i, i_1_);
		}
		throw new IllegalArgumentException();
	}
	
	public Node_Sub38_Sub5() {
		super(1, false);
		anIntArray10127 = new int[3];
		anInt10122 = 4096;
	}
	
	final int[][] method2778(int i, boolean bool) {
		anInt10120++;
		if (bool != true) {
			return null;
		}
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int[][] is_2_ = this.method2777(-93, 0, i);
			int[] is_3_ = is_2_[0];
			int[] is_4_ = is_2_[1];
			int[] is_5_ = is_2_[2];
			int[] is_6_ = is[0];
			int[] is_7_ = is[1];
			int[] is_8_ = is[2];
			for (int i_9_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
				int i_10_ = is_3_[i_9_];
				int i_11_ = -anIntArray10127[0] + i_10_;
				if ((i_11_ ^ 0xffffffff) > -1) {
					i_11_ = -i_11_;
				}
				if (i_11_ > anInt10129) {
					is_6_[i_9_] = i_10_;
					is_7_[i_9_] = is_4_[i_9_];
					is_8_[i_9_] = is_5_[i_9_];
				} else {
					int i_12_ = is_4_[i_9_];
					i_11_ = -anIntArray10127[1] + i_12_;
					if ((i_11_ ^ 0xffffffff) > -1) {
						i_11_ = -i_11_;
					}
					if ((i_11_ ^ 0xffffffff) < (anInt10129 ^ 0xffffffff)) {
						is_6_[i_9_] = i_10_;
						is_7_[i_9_] = i_12_;
						is_8_[i_9_] = is_5_[i_9_];
					} else {
						int i_13_ = is_5_[i_9_];
						i_11_ = i_13_ - anIntArray10127[2];
						if (i_11_ < 0) {
							i_11_ = -i_11_;
						}
						if (anInt10129 < i_11_) {
							is_6_[i_9_] = i_10_;
							is_7_[i_9_] = i_12_;
							is_8_[i_9_] = i_13_;
						} else {
							is_6_[i_9_] = i_10_ * anInt10121 >> 12;
							is_7_[i_9_] = anInt10126 * i_12_ >> 12;
							is_8_[i_9_] = i_13_ * anInt10122 >> 12;
						}
					}
				}
			}
		}
		return is;
	}
	
	static final void method2802(int i, boolean bool, int i_14_, int i_15_, int i_16_) {
		if ((Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) ^ 0xffffffff) == -1) {
			Class262_Sub23.method3212(false, 1295);
		} else {
			CacheNode_Sub8.anInt9493 = Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false);
			Class22.method300(0, true, true);
		}
		anInt10128++;
		Class369.aBoolean4555 = bool;
		IOException_Sub1.anInt84 = i_14_;
		Class262_Sub8.anInt7756 = i_15_;
		Class20.method282(i);
		if (i_16_ != -11493) {
			aBoolean10125 = false;
		}
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		int i_17_ = i;
	while_10_:
		do {
		while_9_:
			do {
			while_8_:
				do {
					do {
						if ((i_17_ ^ 0xffffffff) != -1) {
							if (i_17_ != 1) {
								if (i_17_ != 2) {
									if (i_17_ != 3) {
										if (i_17_ == 4) {
											break while_9_;
										}
										break while_10_;
									}
								} else {
									break;
								}
								break while_8_;
							}
						} else {
							anInt10129 = buffer.readUnsignedShort();
							break while_10_;
						}
						anInt10122 = buffer.readUnsignedShort();
						break while_10_;
					} while (false);
					anInt10126 = buffer.readUnsignedShort();
					break while_10_;
				} while (false);
				anInt10121 = buffer.readUnsignedShort();
				break while_10_;
			} while (false);
			int i_18_ = buffer.read24BitInteger();
			anIntArray10127[1] = Node_Sub30.method2723(i_18_ >> 4, 4080);
			anIntArray10127[2] = Node_Sub30.method2723(i_18_, 255) >> 12;
			anIntArray10127[0] = Node_Sub30.method2723(i_18_, 16711680) << 4;
		} while (false);
		if (bool != false) {
			method2802(-43, false, 13, 77, 8);
		}
		anInt10119++;
	}
	
	public static void method2803(int i) {
		anIntArray10131 = null;
		aClass228_10123 = null;
		@SuppressWarnings("unused")
		int i_19_ = 92 / ((i - 25) / 56);
	}
	
	static {
		aClass228_10123 = new Class228();
		aBoolean10130 = false;
		anIntArray10131 = new int[] { 16, 32, 64, 128 };
	}
}
