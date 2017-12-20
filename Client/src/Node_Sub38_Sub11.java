/* Node_Sub38_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Node_Sub38_Sub11 extends Node_Sub38
{
	static int anInt10200;
	private int anInt10201 = 204;
	static int anInt10202;
	private int[][] anIntArrayArray10203;
	private int anInt10204;
	private int anInt10205;
	private int anInt10206;
	static int anInt10207;
	private int anInt10208;
	private int anInt10209;
	private int[] anIntArray10210;
	private int anInt10211;
	static int anInt10212;
	private int anInt10213 = 1024;
	static int anInt10214;
	static long aLong10215;
	static int anInt10216;
	static int[] anIntArray10217 = new int[32];
	static int[] anIntArray10218 = new int[4096];
	private int anInt10219;
	private int anInt10220;
	static OutcommingPacket aClass318_10221 = new OutcommingPacket(36, -1);
	private int anInt10222;
	private int[][] anIntArrayArray10223;
	
	static final void method2826(boolean bool, double d) {
		anInt10214++;
		Class113.aClass336_1440.method3857(Class225.aClass336_2678);
		if (bool == true) {
			Class113.aClass336_1440.method3863(0, 0, (int) d);
			Class44.aGraphicsToolkit668.a(Class113.aClass336_1440);
		}
	}
	
	private final void method2827(int i) {
		anInt10202++;
		Random random = new Random((long) anInt10204);
		anInt10206 = 4096 / anInt10222;
		anInt10219 = 4096 / anInt10204;
		anInt10211 = anInt10205 / 2;
		int i_0_ = anInt10206 / 2;
		anIntArrayArray10203 = new int[anInt10204][anInt10222 - -1];
		if (i != 25428) {
			anIntArray10218 = null;
		}
		anIntArray10210 = new int[anInt10204 + 1];
		int i_1_ = anInt10219 / 2;
		anIntArrayArray10223 = new int[anInt10204][anInt10222];
		anIntArray10210[0] = 0;
		for (int i_2_ = 0; anInt10204 > i_2_; i_2_++) {
			if (i_2_ > 0) {
				int i_3_ = anInt10219;
				int i_4_ = (Class330.method3838(-5208, 4096, random) + -2048) * anInt10201 >> 12;
				i_3_ += i_4_ * i_1_ >> 12;
				anIntArray10210[i_2_] = anIntArray10210[i_2_ + -1] - -i_3_;
			}
			anIntArrayArray10203[i_2_][0] = 0;
			for (int i_5_ = 0; (anInt10222 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				if ((i_5_ ^ 0xffffffff) < -1) {
					int i_6_ = anInt10206;
					int i_7_ = (Class330.method3838(-5208, 4096, random) + -2048) * anInt10220 >> 12;
					i_6_ += i_0_ * i_7_ >> 12;
					anIntArrayArray10203[i_2_][i_5_] = i_6_ + anIntArrayArray10203[i_2_][i_5_ - 1];
				}
				anIntArrayArray10223[i_2_][i_5_] = anInt10209 > 0 ? 4096 - Class330.method3838(Node_Sub19.method2612(i, -30468), anInt10209, random) : 4096;
			}
			anIntArrayArray10203[i_2_][anInt10222] = 4096;
		}
		anIntArray10210[anInt10204] = 4096;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		int i_8_ = i;
	while_148_:
		do {
		while_147_:
			do {
			while_146_:
				do {
				while_145_:
					do {
					while_144_:
						do {
						while_143_:
							do {
								do {
									if ((i_8_ ^ 0xffffffff) != -1) {
										if ((i_8_ ^ 0xffffffff) != -2) {
											if (i_8_ != 2) {
												if (i_8_ != 3) {
													if (i_8_ != 4) {
														if (i_8_ != 5) {
															if ((i_8_ ^ 0xffffffff) != -7) {
																if ((i_8_ ^ 0xffffffff) != -8) {
																	break while_148_;
																}
															} else {
																break while_146_;
															}
															break while_147_;
														}
													} else {
														break while_144_;
													}
													break while_145_;
												}
											} else {
												break;
											}
											break while_143_;
										}
									} else {
										anInt10222 = buffer.readUnsignedByte();
										break while_148_;
									}
									anInt10204 = buffer.readUnsignedByte();
									break while_148_;
								} while (false);
								anInt10220 = buffer.readUnsignedShort();
								break while_148_;
							} while (false);
							anInt10201 = buffer.readUnsignedShort();
							break while_148_;
						} while (false);
						anInt10213 = buffer.readUnsignedShort();
						break while_148_;
					} while (false);
					anInt10208 = buffer.readUnsignedShort();
					break while_148_;
				} while (false);
				anInt10205 = buffer.readUnsignedShort();
				break while_148_;
			} while (false);
			anInt10209 = buffer.readUnsignedShort();
		} while (false);
		if (bool != false) {
			aClass318_10221 = null;
		}
		anInt10216++;
	}
	
	final void method2785(int i) {
		if (i != 7) {
			method2780(true, null, 83);
		}
		method2827(i + 25421);
		anInt10200++;
	}
	
	static final boolean method2828(int i, int i_9_) {
		if (i_9_ != 0) {
			method2828(116, -108);
		}
		anInt10207++;
        return !(i != 0 && i != 1 && i != 2);
    }
	
	public Node_Sub38_Sub11() {
		super(0, true);
		anInt10205 = 81;
		anInt10209 = 1024;
		anInt10208 = 0;
		anInt10204 = 8;
		anInt10220 = 409;
		anInt10222 = 4;
	}
	
	final int[] method2775(int i, int i_10_) {
		anInt10212++;
		if (i < 107) {
			anIntArray10217 = null;
		}
		int[] is = aClass146_7460.method1645(27356, i_10_);
		if (aClass146_7460.aBoolean1819) {
			int i_11_ = 0;
			int i_12_;
			for (i_12_ = anInt10208 + Node_Sub25_Sub1.anIntArray9941[i_10_]; i_12_ < 0; i_12_ += 4096) {
				/* empty */
			}
			for (/**/; (i_12_ ^ 0xffffffff) < -4097; i_12_ -= 4096) {
				/* empty */
			}
			for (/**/; (i_11_ ^ 0xffffffff) > (anInt10204 ^ 0xffffffff); i_11_++) {
				if ((anIntArray10210[i_11_] ^ 0xffffffff) < (i_12_ ^ 0xffffffff)) {
					break;
				}
			}
			int i_13_ = i_11_ + -1;
			boolean bool = (0x1 & i_11_) == 0;
			int i_14_ = anIntArray10210[i_11_];
			int i_15_ = anIntArray10210[i_11_ - 1];
			if ((anInt10211 + i_15_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff) && i_12_ < -anInt10211 + i_14_) {
				for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_16_++) {
					int i_17_ = 0;
					int i_18_ = !bool ? -anInt10213 : anInt10213;
					int i_19_;
					for (i_19_ = CacheNode_Sub3.anIntArray9442[i_16_] + (i_18_ * anInt10206 >> 12); (i_19_ ^ 0xffffffff) > -1; i_19_ += 4096) {
						/* empty */
					}
					for (/**/; i_19_ > 4096; i_19_ -= 4096) {
						/* empty */
					}
					for (/**/; (i_17_ ^ 0xffffffff) > (anInt10222 ^ 0xffffffff); i_17_++) {
						if ((anIntArrayArray10203[i_13_][i_17_] ^ 0xffffffff) < (i_19_ ^ 0xffffffff)) {
							break;
						}
					}
					int i_20_ = i_17_ - 1;
					int i_21_ = anIntArrayArray10203[i_13_][i_17_];
					int i_22_ = anIntArrayArray10203[i_13_][i_20_];
					if (i_19_ > anInt10211 + i_22_ && (i_19_ ^ 0xffffffff) > (i_21_ + -anInt10211 ^ 0xffffffff)) {
						is[i_16_] = anIntArrayArray10223[i_13_][i_20_];
					} else {
						is[i_16_] = 0;
					}
				}
			} else {
				Class311.method3604(is, 0, Class339_Sub7.anInt8728, 0);
			}
		}
		return is;
	}
	
	public static void method2829(byte b) {
		@SuppressWarnings("unused")
		int i = 109 / ((47 - b) / 38);
		anIntArray10217 = null;
		anIntArray10218 = null;
		aClass318_10221 = null;
	}
}
