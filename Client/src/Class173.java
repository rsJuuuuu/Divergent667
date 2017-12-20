/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class173
{
	static int anInt2081;
	static int anInt2082;
	static IncommingPacket aClass192_2083 = new IncommingPacket(36, 4);
	static int anInt2084;
	static String aString2085;
	static int anInt2086 = -1;
	static int anInt2087;
	static IncommingPacket aClass192_2088;
	static int anInt2089;
	static Index aClass302_2090;
	static int[] anIntArray2091 = new int[5];
	
	public static void method1798(int i) {
		anIntArray2091 = null;
		aString2085 = null;
		aClass192_2083 = null;
		if (i != 10675) {
			aString2085 = null;
		}
		aClass302_2090 = null;
		aClass192_2088 = null;
	}
	
	static final void method1799(boolean bool, String string, byte b) {
		anInt2082++;
		if (b != -96) {
			aClass192_2088 = null;
		}
		Class142.method1620(bool, -61, -1, -1, string);
	}
	
	static final void method1800(byte b, GLSprite[] glsprites) {
		@SuppressWarnings("unused")
		int i = 100 % ((63 - b) / 63);
		anInt2087 = glsprites.length;
		anInt2084++;
		Class105.aGLSpriteArray5194 = new GLSprite[anInt2087 + 10];
		Class290_Sub6.anIntArray8123 = new int[10 + anInt2087];
		Class311.method3605(glsprites, 0, Class105.aGLSpriteArray5194, 0, anInt2087);
		for (int i_0_ = 0; (anInt2087 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++)
			Class290_Sub6.anIntArray8123[i_0_] = Class105.aGLSpriteArray5194[i_0_].method1186();
		for (int i_1_ = anInt2087; i_1_ < Class105.aGLSpriteArray5194.length; i_1_++)
			Class290_Sub6.anIntArray8123[i_1_] = 12;
	}
	
	static final int method1801(String string, int i, byte[] bs, boolean bool, int i_2_, int i_3_) {
		anInt2081++;
		int i_4_ = -i_3_ + i;
		if (bool != true) {
			return 5;
		}
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
			int i_6_ = string.charAt(i_3_ + i_5_);
			if ((i_6_ ^ 0xffffffff) < -1 && i_6_ < 128 || (i_6_ ^ 0xffffffff) <= -161 && i_6_ <= 255) {
				bs[i_2_ + i_5_] = (byte) i_6_;
			} else if ((i_6_ ^ 0xffffffff) != -8365) {
				if ((i_6_ ^ 0xffffffff) != -8219) {
					if (i_6_ == 402) {
						bs[i_5_ + i_2_] = (byte) -125;
					} else if (i_6_ != 8222) {
						if (i_6_ != 8230) {
							if (i_6_ == 8224) {
								bs[i_5_ + i_2_] = (byte) -122;
							} else if (i_6_ != 8225) {
								if ((i_6_ ^ 0xffffffff) == -711) {
									bs[i_2_ - -i_5_] = (byte) -120;
								} else if (i_6_ != 8240) {
									if ((i_6_ ^ 0xffffffff) != -353) {
										if (i_6_ == 8249) {
											bs[i_2_ - -i_5_] = (byte) -117;
										} else if ((i_6_ ^ 0xffffffff) != -339) {
											if (i_6_ != 381) {
												if (i_6_ == 8216) {
													bs[i_5_ + i_2_] = (byte) -111;
												} else if ((i_6_ ^ 0xffffffff) != -8218) {
													if (i_6_ != 8220) {
														if ((i_6_ ^ 0xffffffff) != -8222) {
															if (i_6_ == 8226) {
																bs[i_5_ + i_2_] = (byte) -107;
															} else if ((i_6_ ^ 0xffffffff) == -8212) {
																bs[i_2_ + i_5_] = (byte) -106;
															} else if (i_6_ != 8212) {
																if ((i_6_ ^ 0xffffffff) == -733) {
																	bs[i_2_ - -i_5_] = (byte) -104;
																} else if (i_6_ != 8482) {
																	if ((i_6_ ^ 0xffffffff) == -354) {
																		bs[i_5_ + i_2_] = (byte) -102;
																	} else if ((i_6_ ^ 0xffffffff) == -8251) {
																		bs[i_5_ + i_2_] = (byte) -101;
																	} else if ((i_6_ ^ 0xffffffff) == -340) {
																		bs[i_2_ + i_5_] = (byte) -100;
																	} else if (i_6_ != 382) {
																		if (i_6_ != 376) {
																			bs[i_2_ + i_5_] = (byte) 63;
																		} else {
																			bs[i_5_ + i_2_] = (byte) -97;
																		}
																	} else {
																		bs[i_5_ + i_2_] = (byte) -98;
																	}
																} else {
																	bs[i_5_ + i_2_] = (byte) -103;
																}
															} else {
																bs[i_5_ + i_2_] = (byte) -105;
															}
														} else {
															bs[i_2_ - -i_5_] = (byte) -108;
														}
													} else {
														bs[i_2_ - -i_5_] = (byte) -109;
													}
												} else {
													bs[i_2_ - -i_5_] = (byte) -110;
												}
											} else {
												bs[i_2_ + i_5_] = (byte) -114;
											}
										} else {
											bs[i_2_ + i_5_] = (byte) -116;
										}
									} else {
										bs[i_5_ + i_2_] = (byte) -118;
									}
								} else {
									bs[i_5_ + i_2_] = (byte) -119;
								}
							} else {
								bs[i_5_ + i_2_] = (byte) -121;
							}
						} else {
							bs[i_2_ + i_5_] = (byte) -123;
						}
					} else {
						bs[i_2_ - -i_5_] = (byte) -124;
					}
				} else {
					bs[i_2_ + i_5_] = (byte) -126;
				}
			} else {
				bs[i_5_ + i_2_] = (byte) -128;
			}
		}
		return i_4_;
	}
	
	static {
		anInt2089 = -50;
		aClass192_2088 = new IncommingPacket(118, -2);
	}
}
