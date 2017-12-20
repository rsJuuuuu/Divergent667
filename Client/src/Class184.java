/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class184
{
	protected int anInt2188 = -1;
	static Class158 aClass158_2189;
	private int[] anIntArray2190;
	private int[] anIntArray2191;
	static int anInt2192;
	private int[][] anIntArrayArray2193;
	private HashTable aHashTable2194;
	private int[] anIntArray2195;
	static int anInt2196;
	static long[] aLongArray2197;
	private String[] aStringArray2198;
	private int[] anIntArray2199;
	private int[] anIntArray2200;
	private String[] aStringArray2201;
	private String aString2202;
	static int[] anIntArray2203 = new int[1000];
	private int[] anIntArray2204;
	static int anInt2205;
	static int anInt2206;
	private int[] anIntArray2207;
	private int[][] anIntArrayArray2208;
	private int[] anIntArray2209;
	private int[][] anIntArrayArray2210;
	private String aString2211;
	
	final void method1843(int i) {
		if (i != -18) {
			anIntArray2204 = null;
		}
		anInt2196++;
		if (aString2202 == null) {
			aString2202 = aString2211;
		}
	}
	
	static final int method1844(int i, int i_0_) {
		if (Class146.aShortArrayArray1802 != null) {
			return Class146.aShortArrayArray1802[i][i_0_] & 0xffff;
		}
		return 0;
	}
	
	private final void method1845(int i, BufferedStream buffer, byte b) {
		if (b < 46) {
			aClass158_2189 = null;
		}
		if ((i ^ 0xffffffff) != -2) {
			if ((i ^ 0xffffffff) != -3) {
				if ((i ^ 0xffffffff) == -4) {
					int i_1_ = buffer.readUnsignedByte();
					anIntArrayArray2208 = new int[i_1_][3];
					for (int i_2_ = 0; (i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
						anIntArrayArray2208[i_2_][0] = buffer.readUnsignedShort();
						anIntArrayArray2208[i_2_][1] = buffer.readInt();
						anIntArrayArray2208[i_2_][2] = buffer.readInt();
					}
				} else if ((i ^ 0xffffffff) != -5) {
					if (i != 5) {
						if ((i ^ 0xffffffff) != -7) {
							if (i != 7) {
								if (i != 8) {
									if ((i ^ 0xffffffff) != -10) {
										if (i == 10) {
											int i_3_ = buffer.readUnsignedByte();
											anIntArray2209 = new int[i_3_];
											for (int i_4_ = 0; i_3_ > i_4_; i_4_++)
												anIntArray2209[i_4_] = buffer.readInt();
										} else if ((i ^ 0xffffffff) != -13) {
											if (i != 13) {
												if ((i ^ 0xffffffff) != -15) {
													if (i == 15) {
														buffer.readUnsignedShort();
													} else if ((i ^ 0xffffffff) == -18) {
														anInt2188 = buffer.readUnsignedShort();
													} else if ((i ^ 0xffffffff) != -19) {
														if (i != 19) {
															if ((i ^ 0xffffffff) == -250) {
																int i_5_ = buffer.readUnsignedByte();
																if (aHashTable2194 == null) {
																	int i_6_ = Class320_Sub19.method3753(i_5_, -729073628);
																	aHashTable2194 = new HashTable(i_6_);
																}
																for (int i_7_ = 0; i_5_ > i_7_; i_7_++) {
																	boolean bool = buffer.readUnsignedByte() == 1;
																	int i_8_ = buffer.read24BitInteger();
																	Node node;
																	if (!bool) {
																		node = new Node_Sub32(buffer.readInt());
																	} else {
																		node = new Node_Sub18(buffer.readString());
																	}
																	aHashTable2194.method1515((long) i_8_, node, -126);
																}
															}
														} else {
															int i_9_ = buffer.readUnsignedByte();
															anIntArray2204 = new int[i_9_];
															aStringArray2198 = new String[i_9_];
															anIntArray2195 = new int[i_9_];
															anIntArray2190 = new int[i_9_];
															for (int i_10_ = 0; (i_9_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
																anIntArray2204[i_10_] = buffer.readInt();
																anIntArray2195[i_10_] = buffer.readInt();
																anIntArray2190[i_10_] = buffer.readInt();
																aStringArray2198[i_10_] = buffer.readString();
															}
														}
													} else {
														int i_11_ = buffer.readUnsignedByte();
														aStringArray2201 = new String[i_11_];
														anIntArray2200 = new int[i_11_];
														anIntArray2199 = new int[i_11_];
														anIntArray2191 = new int[i_11_];
														for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_12_++) {
															anIntArray2200[i_12_] = buffer.readInt();
															anIntArray2191[i_12_] = buffer.readInt();
															anIntArray2199[i_12_] = buffer.readInt();
															aStringArray2201[i_12_] = buffer.readString();
														}
													}
												} else {
													int i_13_ = buffer.readUnsignedByte();
													anIntArrayArray2210 = new int[i_13_][2];
													for (int i_14_ = 0; (i_13_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
														anIntArrayArray2210[i_14_][0] = buffer.readUnsignedByte();
														anIntArrayArray2210[i_14_][1] = buffer.readUnsignedByte();
													}
												}
											} else {
												int i_15_ = buffer.readUnsignedByte();
												anIntArray2207 = new int[i_15_];
												for (int i_16_ = 0; (i_15_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++)
													anIntArray2207[i_16_] = buffer.readUnsignedShort();
											}
										} else {
											buffer.readInt();
										}
									} else {
										buffer.readUnsignedByte();
									}
								}
							} else {
								buffer.readUnsignedByte();
							}
						} else {
							buffer.readUnsignedByte();
						}
					} else {
						buffer.readUnsignedShort();
					}
				} else {
					int i_17_ = buffer.readUnsignedByte();
					anIntArrayArray2193 = new int[i_17_][3];
					for (int i_18_ = 0; (i_17_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
						anIntArrayArray2193[i_18_][0] = buffer.readUnsignedShort();
						anIntArrayArray2193[i_18_][1] = buffer.readInt();
						anIntArrayArray2193[i_18_][2] = buffer.readInt();
					}
				}
			} else {
				aString2202 = buffer.method2180((byte) 125);
			}
		} else {
			aString2211 = buffer.method2180((byte) 99);
		}
		anInt2206++;
	}
	
	static final String method1846(int i, byte[] bs, int i_19_, byte b) {
		if (b > -100) {
			aClass158_2189 = null;
		}
		anInt2192++;
		char[] cs = new char[i_19_];
		int i_20_ = 0;
		for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
			int i_22_ = 0xff & bs[i_21_ + i];
			if (i_22_ != 0) {
				if (i_22_ >= 128 && i_22_ < 160) {
					int i_23_ = Class204.aCharArray2455[-128 + i_22_];
					if (i_23_ == 0) {
						i_23_ = 63;
					}
					i_22_ = i_23_;
				}
				cs[i_20_++] = (char) i_22_;
			}
		}
		return new String(cs, 0, i_20_);
	}
	
	final void method1847(BufferedStream buffer, int i) {
		for (;;) {
			int i_24_ = buffer.readUnsignedByte();
			if (i_24_ == 0) {
				break;
			}
			method1845(i_24_, buffer, (byte) 100);
		}
		if (i == 6991) {
			anInt2205++;
		}
	}
	
	public static void method1848(int i) {
		aClass158_2189 = null;
		if (i != 0) {
			aClass158_2189 = null;
		}
		aLongArray2197 = null;
		anIntArray2203 = null;
	}
	
	static {
		aClass158_2189 = new Class158();
	}
}
