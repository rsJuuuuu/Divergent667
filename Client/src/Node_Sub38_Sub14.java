/* Node_Sub38_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub14 extends Node_Sub38
{
	private int[] anIntArray10241 = new int[257];
	static int anInt10242;
	static int anInt10243;
	static IComponentDefinitions aWidget10244 = null;
	static int anInt10245;
	static int anInt10246;
	static int anInt10247;
	private int[][] anIntArrayArray10248;
	static int anInt10249;
	static int anInt10250;
	static int anInt10251;
	
	private final void method2833(int i, byte b) {
		anInt10243++;
	while_155_:
		do {
			if ((i ^ 0xffffffff) != -1) {
				int i_0_ = i;
			while_154_:
				do {
				while_153_:
					do {
					while_152_:
						do {
						while_151_:
							do {
								do {
									if (i_0_ != 1) {
										if ((i_0_ ^ 0xffffffff) != -3) {
											if (i_0_ != 3) {
												if ((i_0_ ^ 0xffffffff) != -5) {
													if ((i_0_ ^ 0xffffffff) != -6) {
														if (i_0_ != 6) {
															break while_154_;
														}
													} else {
														break while_152_;
													}
													break while_153_;
												}
											} else {
												break;
											}
											break while_151_;
										}
									} else {
										anIntArrayArray10248 = new int[2][4];
										anIntArrayArray10248[0][1] = 0;
										anIntArrayArray10248[0][3] = 0;
										anIntArrayArray10248[0][0] = 0;
										anIntArrayArray10248[0][2] = 0;
										anIntArrayArray10248[1][3] = 4096;
										anIntArrayArray10248[1][1] = 4096;
										anIntArrayArray10248[1][0] = 4096;
										anIntArrayArray10248[1][2] = 4096;
										break while_155_;
									}
									anIntArrayArray10248 = new int[8][4];
									anIntArrayArray10248[0][3] = 2361;
									anIntArrayArray10248[0][1] = 2650;
									anIntArrayArray10248[0][2] = 2602;
									anIntArrayArray10248[0][0] = 0;
									anIntArrayArray10248[1][1] = 2313;
									anIntArrayArray10248[1][3] = 1558;
									anIntArrayArray10248[1][0] = 2867;
									anIntArrayArray10248[1][2] = 1799;
									anIntArrayArray10248[2][3] = 1413;
									anIntArrayArray10248[2][0] = 3072;
									anIntArrayArray10248[2][2] = 1734;
									anIntArrayArray10248[2][1] = 2618;
									anIntArrayArray10248[3][2] = 1220;
									anIntArrayArray10248[3][3] = 947;
									anIntArrayArray10248[3][1] = 2296;
									anIntArrayArray10248[3][0] = 3276;
									anIntArrayArray10248[4][2] = 963;
									anIntArrayArray10248[4][1] = 2072;
									anIntArrayArray10248[4][3] = 722;
									anIntArrayArray10248[4][0] = 3481;
									anIntArrayArray10248[5][1] = 2730;
									anIntArrayArray10248[5][2] = 2152;
									anIntArrayArray10248[5][0] = 3686;
									anIntArrayArray10248[5][3] = 1766;
									anIntArrayArray10248[6][2] = 1060;
									anIntArrayArray10248[6][3] = 915;
									anIntArrayArray10248[6][0] = 3891;
									anIntArrayArray10248[6][1] = 2232;
									anIntArrayArray10248[7][2] = 1413;
									anIntArrayArray10248[7][0] = 4096;
									anIntArrayArray10248[7][3] = 1140;
									anIntArrayArray10248[7][1] = 1686;
									break while_155_;
								} while (false);
								anIntArrayArray10248 = new int[7][4];
								anIntArrayArray10248[0][2] = 0;
								anIntArrayArray10248[0][3] = 4096;
								anIntArrayArray10248[0][1] = 0;
								anIntArrayArray10248[0][0] = 0;
								anIntArrayArray10248[1][2] = 4096;
								anIntArrayArray10248[1][0] = 663;
								anIntArrayArray10248[1][1] = 0;
								anIntArrayArray10248[1][3] = 4096;
								anIntArrayArray10248[2][3] = 0;
								anIntArrayArray10248[2][0] = 1363;
								anIntArrayArray10248[2][2] = 4096;
								anIntArrayArray10248[2][1] = 0;
								anIntArrayArray10248[3][1] = 4096;
								anIntArrayArray10248[3][3] = 0;
								anIntArrayArray10248[3][0] = 2048;
								anIntArrayArray10248[3][2] = 4096;
								anIntArrayArray10248[4][0] = 2727;
								anIntArrayArray10248[4][3] = 0;
								anIntArrayArray10248[4][2] = 0;
								anIntArrayArray10248[4][1] = 4096;
								anIntArrayArray10248[5][2] = 0;
								anIntArrayArray10248[5][0] = 3411;
								anIntArrayArray10248[5][3] = 4096;
								anIntArrayArray10248[5][1] = 4096;
								anIntArrayArray10248[6][2] = 0;
								anIntArrayArray10248[6][3] = 4096;
								anIntArrayArray10248[6][1] = 0;
								anIntArrayArray10248[6][0] = 4096;
								break while_155_;
							} while (false);
							anIntArrayArray10248 = new int[6][4];
							anIntArrayArray10248[0][0] = 0;
							anIntArrayArray10248[0][1] = 0;
							anIntArrayArray10248[0][3] = 0;
							anIntArrayArray10248[0][2] = 0;
							anIntArrayArray10248[1][3] = 1493;
							anIntArrayArray10248[1][0] = 1843;
							anIntArrayArray10248[1][1] = 0;
							anIntArrayArray10248[1][2] = 0;
							anIntArrayArray10248[2][0] = 2457;
							anIntArrayArray10248[2][3] = 2939;
							anIntArrayArray10248[2][2] = 0;
							anIntArrayArray10248[2][1] = 0;
							anIntArrayArray10248[3][0] = 2781;
							anIntArrayArray10248[3][3] = 3565;
							anIntArrayArray10248[3][1] = 0;
							anIntArrayArray10248[3][2] = 1124;
							anIntArrayArray10248[4][3] = 4031;
							anIntArrayArray10248[4][2] = 3084;
							anIntArrayArray10248[4][1] = 546;
							anIntArrayArray10248[4][0] = 3481;
							anIntArrayArray10248[5][1] = 4096;
							anIntArrayArray10248[5][2] = 4096;
							anIntArrayArray10248[5][3] = 4096;
							anIntArrayArray10248[5][0] = 4096;
							break while_155_;
						} while (false);
						anIntArrayArray10248 = new int[16][4];
						anIntArrayArray10248[0][1] = 80;
						anIntArrayArray10248[0][0] = 0;
						anIntArrayArray10248[0][2] = 192;
						anIntArrayArray10248[0][3] = 321;
						anIntArrayArray10248[1][3] = 562;
						anIntArrayArray10248[1][1] = 321;
						anIntArrayArray10248[1][0] = 155;
						anIntArrayArray10248[1][2] = 449;
						anIntArrayArray10248[2][0] = 389;
						anIntArrayArray10248[2][3] = 803;
						anIntArrayArray10248[2][2] = 690;
						anIntArrayArray10248[2][1] = 578;
						anIntArrayArray10248[3][3] = 1140;
						anIntArrayArray10248[3][2] = 995;
						anIntArrayArray10248[3][0] = 671;
						anIntArrayArray10248[3][1] = 947;
						anIntArrayArray10248[4][2] = 1397;
						anIntArrayArray10248[4][0] = 897;
						anIntArrayArray10248[4][3] = 1509;
						anIntArrayArray10248[4][1] = 1285;
						anIntArrayArray10248[5][0] = 1175;
						anIntArrayArray10248[5][2] = 1429;
						anIntArrayArray10248[5][3] = 1413;
						anIntArrayArray10248[5][1] = 1525;
						anIntArrayArray10248[6][0] = 1368;
						anIntArrayArray10248[6][3] = 1333;
						anIntArrayArray10248[6][2] = 1461;
						anIntArrayArray10248[6][1] = 1734;
						anIntArrayArray10248[7][3] = 1702;
						anIntArrayArray10248[7][1] = 1413;
						anIntArrayArray10248[7][0] = 1507;
						anIntArrayArray10248[7][2] = 1525;
						anIntArrayArray10248[8][1] = 1108;
						anIntArrayArray10248[8][0] = 1736;
						anIntArrayArray10248[8][2] = 1590;
						anIntArrayArray10248[8][3] = 2056;
						anIntArrayArray10248[9][1] = 1766;
						anIntArrayArray10248[9][2] = 2056;
						anIntArrayArray10248[9][3] = 2666;
						anIntArrayArray10248[9][0] = 2088;
						anIntArrayArray10248[10][0] = 2355;
						anIntArrayArray10248[10][1] = 2409;
						anIntArrayArray10248[10][2] = 2586;
						anIntArrayArray10248[10][3] = 3276;
						anIntArrayArray10248[11][3] = 3228;
						anIntArrayArray10248[11][1] = 3116;
						anIntArrayArray10248[11][0] = 2691;
						anIntArrayArray10248[11][2] = 3148;
						anIntArrayArray10248[12][2] = 3710;
						anIntArrayArray10248[12][3] = 3196;
						anIntArrayArray10248[12][1] = 3806;
						anIntArrayArray10248[12][0] = 3031;
						anIntArrayArray10248[13][0] = 3522;
						anIntArrayArray10248[13][1] = 3437;
						anIntArrayArray10248[13][3] = 3019;
						anIntArrayArray10248[13][2] = 3421;
						anIntArrayArray10248[14][3] = 3228;
						anIntArrayArray10248[14][2] = 3148;
						anIntArrayArray10248[14][0] = 3727;
						anIntArrayArray10248[14][1] = 3116;
						anIntArrayArray10248[15][1] = 2377;
						anIntArrayArray10248[15][0] = 4096;
						anIntArrayArray10248[15][3] = 2746;
						anIntArrayArray10248[15][2] = 2505;
						break while_155_;
					} while (false);
					anIntArrayArray10248 = new int[4][4];
					anIntArrayArray10248[0][3] = 0;
					anIntArrayArray10248[0][2] = 4096;
					anIntArrayArray10248[0][0] = 2048;
					anIntArrayArray10248[0][1] = 0;
					anIntArrayArray10248[1][2] = 4096;
					anIntArrayArray10248[1][0] = 2867;
					anIntArrayArray10248[1][1] = 4096;
					anIntArrayArray10248[1][3] = 0;
					anIntArrayArray10248[2][1] = 4096;
					anIntArrayArray10248[2][0] = 3276;
					anIntArrayArray10248[2][2] = 4096;
					anIntArrayArray10248[2][3] = 0;
					anIntArrayArray10248[3][3] = 0;
					anIntArrayArray10248[3][2] = 0;
					anIntArrayArray10248[3][0] = 4096;
					anIntArrayArray10248[3][1] = 4096;
					break while_155_;
				} while (false);
				throw new RuntimeException("Invalid gradient preset");
			}
		} while (false);
		if (b <= -63) {
			/* empty */
		}
	}
	
	final int[][] method2778(int i, boolean bool) {
		anInt10245++;
		if (bool != true) {
			method2785(86);
		}
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int[] is_1_ = this.method2786(i, 0, 0);
			int[] is_2_ = is[0];
			int[] is_3_ = is[1];
			int[] is_4_ = is[2];
			for (int i_5_ = 0; Class339_Sub7.anInt8728 > i_5_; i_5_++) {
				int i_6_ = is_1_[i_5_] >> 4;
				if (i_6_ < 0) {
					i_6_ = 0;
				}
				if ((i_6_ ^ 0xffffffff) < -257) {
					i_6_ = 256;
				}
				i_6_ = anIntArray10241[i_6_];
				is_2_[i_5_] = Node_Sub30.method2723(16711680, i_6_) >> 12;
				is_3_[i_5_] = Node_Sub30.method2723(i_6_, 65280) >> 4;
				is_4_[i_5_] = Node_Sub30.method2723(i_6_, 255) << 4;
			}
		}
		return is;
	}
	
	public Node_Sub38_Sub14() {
		super(1, false);
	}
	
	static final Class41 method2834(byte b, String string, int i) {
		anInt10249++;
		Class41 class41;
		try {
			class41 = (Class41) Class.forName("Class41_Sub2").newInstance();
		} catch (Throwable throwable) {
			class41 = new Class41_Sub1();
		}
		class41.anInt624 = i;
		if (b >= -116) {
			return null;
		}
		class41.aString625 = string;
		return class41;
	}
	
	static final void method2835(byte b) {
		anInt10251++;
		Class96.aClass61_1272.method608(false);
		if (b <= 60) {
			method2837(-87);
		}
	}
	
	private final void method2836(byte b) {
		if (b <= 35) {
			anInt10242 = -40;
		}
		anInt10247++;
		int i = anIntArrayArray10248.length;
		if (i > 0) {
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -258; i_7_++) {
				int i_8_ = 0;
				int i_9_ = i_7_ << 4;
				for (int i_10_ = 0; i_10_ < i; i_10_++) {
					if (i_9_ < anIntArrayArray10248[i_10_][0]) {
						break;
					}
					i_8_++;
				}
				int i_11_;
				int i_12_;
				int i_13_;
				if ((i ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
					int[] is = anIntArrayArray10248[i_8_];
					if (i_8_ > 0) {
						int[] is_14_ = anIntArrayArray10248[-1 + i_8_];
						int i_15_ = (-is_14_[0] + i_9_ << 12) / (is[0] - is_14_[0]);
						int i_16_ = 4096 - i_15_;
						i_12_ = is_14_[3] * i_16_ + i_15_ * is[3] >> 12;
						i_11_ = is[2] * i_15_ - -(is_14_[2] * i_16_) >> 12;
						i_13_ = i_15_ * is[1] - -(is_14_[1] * i_16_) >> 12;
					} else {
						i_11_ = is[2];
						i_13_ = is[1];
						i_12_ = is[3];
					}
				} else {
					int[] is = anIntArrayArray10248[-1 + i];
					i_11_ = is[2];
					i_12_ = is[3];
					i_13_ = is[1];
				}
				i_13_ >>= 4;
				i_12_ >>= 4;
				i_11_ >>= 4;
				if ((i_12_ ^ 0xffffffff) <= -1) {
					if (i_12_ > 255) {
						i_12_ = 255;
					}
				} else {
					i_12_ = 0;
				}
				if (i_13_ < 0) {
					i_13_ = 0;
				} else if (i_13_ > 255) {
					i_13_ = 255;
				}
				if (i_11_ < 0) {
					i_11_ = 0;
				} else if (i_11_ > 255) {
					i_11_ = 255;
				}
				anIntArray10241[i_7_] = Node_Sub16.method2590(i_12_, Node_Sub16.method2590(i_13_ << 16, i_11_ << 8));
			}
		}
	}
	
	final void method2785(int i) {
		anInt10246++;
		if (anIntArrayArray10248 == null) {
			method2833(1, (byte) -86);
		}
		method2836((byte) 52);
		if (i != 7) {
			aWidget10244 = null;
		}
	}
	
	public static void method2837(int i) {
		aWidget10244 = null;
		if (i != 6) {
			anInt10242 = 52;
		}
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt10250++;
		if ((i ^ 0xffffffff) == -1) {
			int i_17_ = buffer.readUnsignedByte();
			if ((i_17_ ^ 0xffffffff) == -1) {
				anIntArrayArray10248 = new int[buffer.readUnsignedByte()][4];
				for (int i_18_ = 0; anIntArrayArray10248.length > i_18_; i_18_++) {
					anIntArrayArray10248[i_18_][0] = buffer.readUnsignedShort();
					anIntArrayArray10248[i_18_][1] = buffer.readUnsignedByte() << 4;
					anIntArrayArray10248[i_18_][2] = buffer.readUnsignedByte() << 4;
					anIntArrayArray10248[i_18_][3] = buffer.readUnsignedByte() << 4;
				}
			} else {
				method2833(i_17_, (byte) -96);
			}
		}
		if (bool != false) {
			anIntArrayArray10248 = null;
		}
	}
	
	static {
		anInt10242 = 0;
	}
}
