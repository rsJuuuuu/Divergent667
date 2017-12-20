/* Node_Sub38_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub20 extends Node_Sub38
{
	static int anInt10297;
	static int anInt10298;
	private int anInt10299;
	static int anInt10300;
	static int anInt10301;
	static int anInt10302;
	private int anInt10303 = 4096;
	static int anInt10304;
	static int anInt10305;
	private int anInt10306 = 12288;
	private int anInt10307;
	static int anInt10308;
	static java.awt.Canvas aCanvas10309;
	static int anInt10310;
	private int anInt10311;
	private int anInt10312;
	static int anInt10313;
	private int anInt10314;
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		if (bool != false) {
			anInt10298 = -73;
		}
		int i_0_ = i;
	while_191_:
		do {
		while_190_:
			do {
			while_189_:
				do {
				while_188_:
					do {
					while_187_:
						do {
							do {
								if (i_0_ != 0) {
									if (i_0_ != 1) {
										if (i_0_ != 2) {
											if (i_0_ != 3) {
												if (i_0_ != 4) {
													if (i_0_ != 5) {
														if ((i_0_ ^ 0xffffffff) == -7) {
															break while_190_;
														}
														break while_191_;
													}
												} else {
													break while_188_;
												}
												break while_189_;
											}
										} else {
											break;
										}
										break while_187_;
									}
								} else {
									anInt10312 = buffer.readUnsignedShort();
									break while_191_;
								}
								anInt10314 = buffer.readUnsignedShort();
								break while_191_;
							} while (false);
							anInt10307 = buffer.readUnsignedShort();
							break while_191_;
						} while (false);
						anInt10311 = buffer.readUnsignedShort();
						break while_191_;
					} while (false);
					anInt10306 = buffer.readUnsignedShort();
					break while_191_;
				} while (false);
				anInt10303 = buffer.readUnsignedShort();
				break while_191_;
			} while (false);
			anInt10299 = buffer.readUnsignedShort();
		} while (false);
		anInt10304++;
	}
	
	public Node_Sub38_Sub20() {
		super(0, true);
		anInt10299 = 8192;
		anInt10307 = 0;
		anInt10311 = 2048;
		anInt10312 = 2048;
		anInt10314 = 0;
	}
	
	final void method2785(int i) {
		Node_Sub37.method2772((byte) 54);
		if (i == 7) {
			anInt10300++;
		}
	}
	
	public static void method2852(int i) {
		if (i == -9200) {
			aCanvas10309 = null;
		}
	}
	
	private final boolean method2853(int i, int i_1_, int i_2_) {
		anInt10297++;
		int i_3_ = (i + -i_1_) * anInt10306 >> 12;
		if (i_2_ != 3857) {
			method2780(false, null, -68);
		}
		int i_4_ = Class17.anIntArray277[255 * i_3_ >> 12 & 0xff];
		i_4_ = (i_4_ << 12) / anInt10306;
		i_4_ = (i_4_ << 12) / anInt10299;
		i_4_ = anInt10303 * i_4_ >> 12;
        return !((i + i_1_ ^ 0xffffffff) <= (i_4_ ^ 0xffffffff) || -i_4_ >= i_1_ + i);
    }
	
	final int[] method2775(int i, int i_5_) {
		if (i < 107) {
			return null;
		}
		anInt10302++;
		int[] is = aClass146_7460.method1645(27356, i_5_);
		if (aClass146_7460.aBoolean1819) {
			int i_6_ = Node_Sub25_Sub1.anIntArray9941[i_5_] + -2048;
			for (int i_7_ = 0; Class339_Sub7.anInt8728 > i_7_; i_7_++) {
				int i_8_ = CacheNode_Sub3.anIntArray9442[i_7_] + -2048;
				int i_9_ = anInt10312 + i_8_;
				i_9_ = i_9_ < -2048 ? 4096 + i_9_ : i_9_;
				i_9_ = (i_9_ ^ 0xffffffff) < -2049 ? -4096 + i_9_ : i_9_;
				int i_10_ = anInt10314 + i_6_;
				i_10_ = (i_10_ ^ 0xffffffff) <= 2047 ? i_10_ : i_10_ + 4096;
				i_10_ = i_10_ <= 2048 ? i_10_ : -4096 + i_10_;
				int i_11_ = anInt10307 + i_8_;
				i_11_ = (i_11_ ^ 0xffffffff) > 2047 ? 4096 + i_11_ : i_11_;
				i_11_ = (i_11_ ^ 0xffffffff) < -2049 ? i_11_ - 4096 : i_11_;
				int i_12_ = i_6_ - -anInt10311;
				i_12_ = i_12_ < -2048 ? 4096 + i_12_ : i_12_;
				i_12_ = i_12_ <= 2048 ? i_12_ : -4096 + i_12_;
				is[i_7_] = !method2853(i_10_, i_9_, 3857) && !method2854(504017132, i_11_, i_12_) ? 0 : 4096;
			}
		}
		return is;
	}
	
	private final boolean method2854(int i, int i_13_, int i_14_) {
		anInt10308++;
		if (i != 504017132) {
			return true;
		}
		int i_15_ = anInt10306 * (i_13_ + i_14_) >> 12;
		int i_16_ = Class17.anIntArray277[0xff & i_15_ * 255 >> 12];
		i_16_ = (i_16_ << 12) / anInt10306;
		i_16_ = (i_16_ << 12) / anInt10299;
		i_16_ = i_16_ * anInt10303 >> 12;
        return !((-i_13_ + i_14_ ^ 0xffffffff) <= (i_16_ ^ 0xffffffff) || (-i_16_ ^ 0xffffffff) <= (-i_13_ + i_14_ ^ 0xffffffff));
    }
	
	static final int method2855(int i, byte b) {
		anInt10301++;
		int i_17_ = 0;
		if ((i ^ 0xffffffff) > -1 || i >= 65536) {
			i >>>= 16;
			i_17_ += 16;
		}
		if (i >= 256) {
			i_17_ += 8;
			i >>>= 8;
		}
		if ((i ^ 0xffffffff) <= -17) {
			i_17_ += 4;
			i >>>= 4;
		}
		if ((i ^ 0xffffffff) <= -5) {
			i_17_ += 2;
			i >>>= 2;
		}
		if (b > -47) {
			decodeReceivedMapRegions(7);
		}
		if (i >= 1) {
			i >>>= 1;
			i_17_++;
		}
		return i_17_ + i;
	}
	
	static final boolean method2856(int i, Class84 class84, int i_18_, int i_19_, int routeType, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		anInt10305++;
		int i_28_ = i_18_;
		int i_29_ = i_21_;
		int i_30_ = 64;
		int i_31_ = 64;
		int i_32_ = -i_30_ + i_18_;
		Node_Sub36_Sub2.anIntArrayArray10047[i_30_][i_31_] = 99;
		int i_33_ = -i_31_ + i_21_;
		Class262_Sub23.anIntArrayArray7892[i_30_][i_31_] = 0;
		int i_34_ = 0;
		Node_Sub39.routeFinderXArray[i_34_] = i_28_;
		int i_35_ = 0;
		Class339_Sub6.routeFinderYArray[i_34_++] = i_29_;
		int[][] is = class84.clipMasks;
	while_203_:
		while ((i_34_ ^ 0xffffffff) != (i_35_ ^ 0xffffffff)) {
			i_29_ = Class339_Sub6.routeFinderYArray[i_35_];
			i_28_ = Node_Sub39.routeFinderXArray[i_35_];
			i_35_ = 1 + i_35_ & 0xfff;
			i_31_ = -i_33_ + i_29_;
			i_30_ = i_28_ + -i_32_;
			int i_36_ = i_28_ - class84.anInt1139;
			int i_37_ = i_29_ + -class84.anInt1135;
			int i_38_ = routeType;
		while_195_:
			do {
			while_194_:
				do {
				while_193_:
					do {
					while_192_:
						do {
							do {
								if (i_38_ != -4) {
									if ((i_38_ ^ 0xffffffff) != 2) {
										if (i_38_ != -2) {
											if ((i_38_ ^ 0xffffffff) != 0) {
												if (i_38_ == 0 || i_38_ == 1 || (i_38_ ^ 0xffffffff) == -3 || (i_38_ ^ 0xffffffff) == -4 || (i_38_ ^ 0xffffffff) == -10) {
													break while_193_;
												}
												break while_194_;
											}
										} else {
											break;
										}
										break while_192_;
									}
								} else {
									if ((i_28_ ^ 0xffffffff) == (i_23_ ^ 0xffffffff) && i_24_ == i_29_) {
										Class219.anInt2623 = i_29_;
										Class315.anInt4033 = i_28_;
										return true;
									}
									break while_195_;
								}
								if (Class150_Sub2.method1659(i_23_, i_25_, i_28_, i_26_ ^ 0x11, i_19_, i_27_, i_29_, i_24_, i_25_)) {
									Class219.anInt2623 = i_29_;
									Class315.anInt4033 = i_28_;
									return true;
								}
								break while_195_;
							} while (false);
							if (class84.method984(i_25_, i_24_, (byte) -93, i_25_, i_28_, i_23_, i_22_, i_27_, i_29_, i_19_)) {
								Class219.anInt2623 = i_29_;
								Class315.anInt4033 = i_28_;
								return true;
							}
							break while_195_;
						} while (false);
						if (class84.method988(i_24_, i_26_ ^ 0x1e35, i_22_, i_23_, i_28_, i_25_, i_27_, i_19_, i_29_)) {
							Class219.anInt2623 = i_29_;
							Class315.anInt4033 = i_28_;
							return true;
						}
						break while_195_;
					} while (false);
					if (class84.method989(i_25_, routeType, i_24_, i_29_, i_28_, i_23_, i, 2883842)) {
						Class219.anInt2623 = i_29_;
						Class315.anInt4033 = i_28_;
						return true;
					}
					break while_195_;
				} while (false);
				if (class84.method982(i_28_, 25451, routeType, i_23_, i_24_, i, i_29_, i_25_)) {
					Class219.anInt2623 = i_29_;
					Class315.anInt4033 = i_28_;
					return true;
				}
			} while (false);
			i_38_ = Class262_Sub23.anIntArrayArray7892[i_30_][i_31_] - -1;
		while_196_:
			do {
				if ((i_30_ ^ 0xffffffff) < -1 && (Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_30_][i_31_] ^ 0xffffffff) == -1 && (0x43a40000 & is[i_36_ + -1][i_37_] ^ 0xffffffff) == -1 && (0x4e240000 & is[i_36_ - 1][-1 + (i_25_ + i_37_)] ^ 0xffffffff) == -1) {
					for (int i_39_ = 1; i_39_ < i_25_ + -1; i_39_++) {
						if ((0x4fa40000 & is[-1 + i_36_][i_37_ + i_39_] ^ 0xffffffff) != -1) {
							break while_196_;
						}
					}
					Node_Sub39.routeFinderXArray[i_34_] = i_28_ - 1;
					Class339_Sub6.routeFinderYArray[i_34_] = i_29_;
					i_34_ = i_34_ + 1 & 0xfff;
					Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_30_][i_31_] = 2;
					Class262_Sub23.anIntArrayArray7892[i_30_ - 1][i_31_] = i_38_;
				}
			} while (false);
		while_197_:
			do {
				if (128 - i_25_ > i_30_ && (Node_Sub36_Sub2.anIntArrayArray10047[i_30_ - -1][i_31_] ^ 0xffffffff) == -1 && (is[i_36_ - -i_25_][i_37_] & 0x60e40000 ^ 0xffffffff) == -1 && (0x78240000 & is[i_36_ - -i_25_][-1 + (i_37_ + i_25_)]) == 0) {
					for (int i_40_ = 1; i_25_ - 1 > i_40_; i_40_++) {
						if ((is[i_25_ + i_36_][i_40_ + i_37_] & 0x78e40000) != 0) {
							break while_197_;
						}
					}
					Node_Sub39.routeFinderXArray[i_34_] = 1 + i_28_;
					Class339_Sub6.routeFinderYArray[i_34_] = i_29_;
					Node_Sub36_Sub2.anIntArrayArray10047[i_30_ - -1][i_31_] = 8;
					i_34_ = i_34_ + 1 & 0xfff;
					Class262_Sub23.anIntArrayArray7892[i_30_ - -1][i_31_] = i_38_;
				}
			} while (false);
		while_198_:
			do {
				if ((i_31_ ^ 0xffffffff) < -1 && Node_Sub36_Sub2.anIntArrayArray10047[i_30_][i_31_ - 1] == 0 && (0x43a40000 & is[i_36_][-1 + i_37_]) == 0 && (is[i_36_ + (i_25_ - 1)][-1 + i_37_] & 0x60e40000) == 0) {
					for (int i_41_ = 1; -1 + i_25_ > i_41_; i_41_++) {
						if ((is[i_41_ + i_36_][-1 + i_37_] & 0x63e40000 ^ 0xffffffff) != -1) {
							break while_198_;
						}
					}
					Node_Sub39.routeFinderXArray[i_34_] = i_28_;
					Class339_Sub6.routeFinderYArray[i_34_] = i_29_ + -1;
					i_34_ = 0xfff & 1 + i_34_;
					Node_Sub36_Sub2.anIntArrayArray10047[i_30_][i_31_ - 1] = 1;
					Class262_Sub23.anIntArrayArray7892[i_30_][i_31_ + -1] = i_38_;
				}
			} while (false);
		while_199_:
			do {
				if (128 - i_25_ > i_31_ && Node_Sub36_Sub2.anIntArrayArray10047[i_30_][1 + i_31_] == 0 && (is[i_36_][i_37_ - -i_25_] & 0x4e240000 ^ 0xffffffff) == -1 && (is[i_36_ - (-i_25_ + 1)][i_25_ + i_37_] & 0x78240000 ^ 0xffffffff) == -1) {
					for (int i_42_ = 1; (i_25_ + -1 ^ 0xffffffff) < (i_42_ ^ 0xffffffff); i_42_++) {
						if ((is[i_42_ + i_36_][i_25_ + i_37_] & 0x7e240000) != 0) {
							break while_199_;
						}
					}
					Node_Sub39.routeFinderXArray[i_34_] = i_28_;
					Class339_Sub6.routeFinderYArray[i_34_] = 1 + i_29_;
					i_34_ = 1 + i_34_ & 0xfff;
					Node_Sub36_Sub2.anIntArrayArray10047[i_30_][i_31_ + 1] = 4;
					Class262_Sub23.anIntArrayArray7892[i_30_][i_31_ - -1] = i_38_;
				}
			} while (false);
		while_200_:
			do {
				if (i_30_ > 0 && i_31_ > 0 && (Node_Sub36_Sub2.anIntArrayArray10047[i_30_ + -1][-1 + i_31_] ^ 0xffffffff) == -1 && (is[-1 + i_36_][i_37_ + -1] & 0x43a40000) == 0) {
					for (int i_43_ = 1; i_43_ < i_25_; i_43_++) {
						if ((0x4fa40000 & is[-1 + i_36_][i_43_ + (i_37_ + -1)] ^ 0xffffffff) != -1 || (0x63e40000 & is[i_36_ + -1 - -i_43_][i_37_ - 1]) != 0) {
							break while_200_;
						}
					}
					Node_Sub39.routeFinderXArray[i_34_] = i_28_ + -1;
					Class339_Sub6.routeFinderYArray[i_34_] = -1 + i_29_;
					Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_30_][-1 + i_31_] = 3;
					i_34_ = 0xfff & i_34_ + 1;
					Class262_Sub23.anIntArrayArray7892[i_30_ - 1][-1 + i_31_] = i_38_;
				}
			} while (false);
		while_201_:
			do {
				if ((128 - i_25_ ^ 0xffffffff) < (i_30_ ^ 0xffffffff) && (i_31_ ^ 0xffffffff) < -1 && (Node_Sub36_Sub2.anIntArrayArray10047[1 + i_30_][i_31_ + -1] ^ 0xffffffff) == -1 && (0x60e40000 & is[i_36_ + i_25_][i_37_ + -1] ^ 0xffffffff) == -1) {
					for (int i_44_ = 1; i_44_ < i_25_; i_44_++) {
						if ((0x78e40000 & is[i_36_ + i_25_][i_44_ + (-1 + i_37_)]) != 0 || (is[i_44_ + i_36_][i_37_ - 1] & 0x63e40000) != 0) {
							break while_201_;
						}
					}
					Node_Sub39.routeFinderXArray[i_34_] = 1 + i_28_;
					Class339_Sub6.routeFinderYArray[i_34_] = -1 + i_29_;
					Node_Sub36_Sub2.anIntArrayArray10047[i_30_ - -1][-1 + i_31_] = 9;
					i_34_ = 1 + i_34_ & 0xfff;
					Class262_Sub23.anIntArrayArray7892[i_30_ + 1][i_31_ + -1] = i_38_;
				}
			} while (false);
		while_202_:
			do {
				if (i_30_ > 0 && i_31_ < 128 + -i_25_ && Node_Sub36_Sub2.anIntArrayArray10047[i_30_ - 1][1 + i_31_] == 0 && (0x4e240000 & is[-1 + i_36_][i_25_ + i_37_] ^ 0xffffffff) == -1) {
					for (int i_45_ = 1; (i_45_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff); i_45_++) {
						if ((is[i_36_ - 1][i_37_ + i_45_] & 0x4fa40000) != 0 || (is[i_45_ + (i_36_ - 1)][i_25_ + i_37_] & 0x7e240000) != 0) {
							break while_202_;
						}
					}
					Node_Sub39.routeFinderXArray[i_34_] = i_28_ - 1;
					Class339_Sub6.routeFinderYArray[i_34_] = i_29_ + 1;
					Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_30_][i_31_ - -1] = 6;
					i_34_ = 0xfff & 1 + i_34_;
					Class262_Sub23.anIntArrayArray7892[i_30_ - 1][i_31_ + 1] = i_38_;
				}
			} while (false);
			if (i_30_ < -i_25_ + 128 && (i_31_ ^ 0xffffffff) > (-i_25_ + 128 ^ 0xffffffff) && Node_Sub36_Sub2.anIntArrayArray10047[1 + i_30_][1 + i_31_] == 0 && (is[i_25_ + i_36_][i_25_ + i_37_] & 0x78240000 ^ 0xffffffff) == -1) {
				for (int i_46_ = 1; i_25_ > i_46_; i_46_++) {
					if ((0x7e240000 & is[i_46_ + i_36_][i_37_ - -i_25_] ^ 0xffffffff) != -1 || (0x78e40000 & is[i_36_ - -i_25_][i_37_ - -i_46_]) != 0) {
						continue while_203_;
					}
				}
				Node_Sub39.routeFinderXArray[i_34_] = 1 + i_28_;
				Class339_Sub6.routeFinderYArray[i_34_] = i_29_ + 1;
				Node_Sub36_Sub2.anIntArrayArray10047[i_30_ - -1][1 + i_31_] = 12;
				i_34_ = i_34_ + 1 & 0xfff;
				Class262_Sub23.anIntArrayArray7892[1 + i_30_][1 + i_31_] = i_38_;
			}
		}
		if (i_26_ != -1) {
			anInt10298 = -65;
		}
		Class219.anInt2623 = i_29_;
		Class315.anInt4033 = i_28_;
		return false;
	}
	
	static final void decodeReceivedMapRegions(int i) {
		anInt10310++;
		Class61.anInt898 = 0;
		Packet packet = Class218.aClass123_2566.aPacket1570;
		int gameSceneSize = packet.readUnsignedByteC();
		boolean forceRefresh = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
		int gameSceneBaseRegionX = packet.readUnsignedShortLE();
		int gameSceneBaseRegionY = packet.readUnsignedShort();
		Class95.method1066(-111);
		Animable_Sub2.updateGameSceneSize(gameSceneSize);
		int i_50_ = (Class218.aClass123_2566.anInt1581 + -packet.offset) / 16;
		//System.out.println(gameSceneBaseRegionX+", "+gameSceneBaseRegionY+", "+gameSceneSize+", "+i_50_);
		Class15.XTEA_KEYS = new int[i_50_][4];
		for (int count = 0; count < i_50_; count++) {
			for (int index = 0; (index ^ 0xffffffff) > -5; index++)
				Class15.XTEA_KEYS[count][index] = packet.readInt();
		}
		Class194.aByteArrayArray2373 = null;
		Class188_Sub1_Sub1.aByteArrayArray9334 = new byte[i_50_][];
		FileOnDisk.aByteArrayArray1331 = new byte[i_50_][];
		Class144.anIntArray1789 = new int[i_50_];
		Class320_Sub6.aByteArrayArray8263 = new byte[i_50_][];
		StandardPlane.anIntArray7980 = new int[i_50_];
		Class42.anIntArray645 = new int[i_50_];
		ProducingGraphicsBuffer.anIntArray9895 = new int[i_50_];
		Class204.anIntArray2460 = null;
		if (i > -2) {
			anInt10313 = 30;
		}
		Class262_Sub1.MAP_REGION_HASHES = new int[i_50_];
		Class320_Sub18.aByteArrayArray8378 = new byte[i_50_][];
		i_50_ = 0;
		for (int thisRegionX = (-(Node_Sub54.GAME_SCENE_WDITH >> 4) + gameSceneBaseRegionX) / 8; ((Node_Sub54.GAME_SCENE_WDITH >> 4) + gameSceneBaseRegionX) / 8 >= thisRegionX; thisRegionX++) {
			for (int thisRegionY = (-(Class377_Sub1.GAME_SCENE_HEIGHT >> 4) + gameSceneBaseRegionY) / 8; (thisRegionY ^ 0xffffffff) >= ((gameSceneBaseRegionY + (Class377_Sub1.GAME_SCENE_HEIGHT >> 4)) / 8 ^ 0xffffffff); thisRegionY++) {
				Class262_Sub1.MAP_REGION_HASHES[i_50_] = (thisRegionX << 8) + thisRegionY;
				StandardPlane.anIntArray7980[i_50_] = Animable_Sub1_Sub1.aClass302_10618.method3519("m" + thisRegionX + "_" + thisRegionY, (byte) 33);
				Class144.anIntArray1789[i_50_] = Animable_Sub1_Sub1.aClass302_10618.method3519("l" + thisRegionX + "_" + thisRegionY, (byte) 19);
				Class42.anIntArray645[i_50_] = Animable_Sub1_Sub1.aClass302_10618.method3519("um" + thisRegionX + "_" + thisRegionY, (byte) 87);
				ProducingGraphicsBuffer.anIntArray9895[i_50_] = Animable_Sub1_Sub1.aClass302_10618.method3519("ul" + thisRegionX + "_" + thisRegionY, (byte) 109);
				i_50_++;
			}
		}
		Class364.method4057(forceRefresh, gameSceneBaseRegionX, 12, gameSceneBaseRegionY, (byte) -36);
	}
}
