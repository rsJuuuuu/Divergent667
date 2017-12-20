/* Node_Sub38_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Node_Sub38_Sub15 extends Node_Sub38
{
	private int anInt10252 = 0;
	private int anInt10253 = 0;
	private int anInt10254;
	static int anInt10255;
	private int anInt10256;
	static int anInt10257;
	private int anInt10258 = 4096;
	static int anInt10259 = Node_Sub38_Sub20.method2855(1600, (byte) -103);
	static int anInt10260;
	static byte[][][] aByteArrayArrayArray10261;
	static Class257 aClass257_10262 = new Class257(4, 3);
	static int anInt10263;
	
	public Node_Sub38_Sub15() {
		super(0, true);
		anInt10256 = 16;
		anInt10254 = 2000;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt10255++;
		int i_0_ = i;
	while_158_:
		do {
		while_157_:
			do {
			while_156_:
				do {
					do {
						if ((i_0_ ^ 0xffffffff) != -1) {
							if (i_0_ != 1) {
								if ((i_0_ ^ 0xffffffff) != -3) {
									if (i_0_ != 3) {
										if (i_0_ == 4) {
											break while_157_;
										}
										break while_158_;
									}
								} else {
									break;
								}
								break while_156_;
							}
						} else {
							anInt10253 = buffer.readUnsignedByte();
							break while_158_;
						}
						anInt10254 = buffer.readUnsignedShort();
						break while_158_;
					} while (false);
					anInt10256 = buffer.readUnsignedByte();
					break while_158_;
				} while (false);
				anInt10252 = buffer.readUnsignedShort();
				break while_158_;
			} while (false);
			anInt10258 = buffer.readUnsignedShort();
		} while (false);
		if (bool != false) {
			method2775(-52, 90);
		}
	}
	
	public static void method2838(int i) {
		if (i != 12893) {
			anInt10263 = 8;
		}
		aClass257_10262 = null;
		aByteArrayArrayArray10261 = null;
	}
	
	final int[] method2775(int i, int i_1_) {
		anInt10257++;
		int[] is = aClass146_7460.method1645(27356, i_1_);
		if (aClass146_7460.aBoolean1819) {
			int i_2_ = anInt10258 >> 1;
			int[][] is_3_ = aClass146_7460.method1642((byte) -46);
			Random random = new Random((long) anInt10253);
			for (int i_4_ = 0; anInt10254 > i_4_; i_4_++) {
				int i_5_ = (anInt10258 ^ 0xffffffff) < -1 ? anInt10252 - -Class330.method3838(-5208, anInt10258, random) - i_2_ : anInt10252;
				i_5_ = 0xff & i_5_ >> 4;
				int i_6_ = Class330.method3838(-5208, Class339_Sub7.anInt8728, random);
				int i_7_ = Class330.method3838(-5208, Node_Sub38_Sub1.anInt10083, random);
				int i_8_ = i_6_ + (Class17.anIntArray277[i_5_] * anInt10256 >> 12);
				int i_9_ = i_7_ + (anInt10256 * Class122.anIntArray1556[i_5_] >> 12);
				int i_10_ = -i_7_ + i_9_;
				int i_11_ = -i_6_ + i_8_;
				if (i_11_ != 0 || i_10_ != 0) {
					if (i_10_ < 0) {
						i_10_ = -i_10_;
					}
					if (i_11_ < 0) {
						i_11_ = -i_11_;
					}
					boolean bool = i_10_ > i_11_;
					if (bool) {
						int i_12_ = i_6_;
						int i_13_ = i_8_;
						i_6_ = i_7_;
						i_8_ = i_9_;
						i_7_ = i_12_;
						i_9_ = i_13_;
					}
					if ((i_6_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
						int i_14_ = i_6_;
						int i_15_ = i_7_;
						i_6_ = i_8_;
						i_8_ = i_14_;
						i_7_ = i_9_;
						i_9_ = i_15_;
					}
					int i_16_ = i_7_;
					int i_17_ = -i_6_ + i_8_;
					int i_18_ = -i_7_ + i_9_;
					int i_19_ = -i_17_ / 2;
					int i_20_ = 2048 / i_17_;
					int i_21_ = 1024 + -(Class330.method3838(-5208, 4096, random) >> 2);
					if ((i_18_ ^ 0xffffffff) > -1) {
						i_18_ = -i_18_;
					}
					int i_22_ = i_9_ > i_7_ ? 1 : -1;
					for (int i_23_ = i_6_; (i_23_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_23_++) {
						int i_24_ = i_20_ * (i_23_ - i_6_) + 1024 + i_21_;
						int i_25_ = Class303.anInt3824 & i_23_;
						int i_26_ = i_16_ & r_Sub2.anInt11054;
						if (!bool) {
							is_3_[i_25_][i_26_] = i_24_;
						} else {
							is_3_[i_26_][i_25_] = i_24_;
						}
						i_19_ += i_18_;
						if (i_19_ > 0) {
							i_16_ = i_22_ + i_16_;
							i_19_ = -i_17_ + i_19_;
						}
					}
				}
			}
		}
		if (i < 107) {
			anInt10258 = -21;
		}
		return is;
	}
	
	final void method2785(int i) {
		if (i != 7) {
			method2775(73, -102);
		}
		Node_Sub37.method2772((byte) 54);
		anInt10260++;
	}
}
