/* Class200_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class200_Sub1 extends Class200 implements Interface9
{
	static int anInt5134;
	static int anInt5135;
	static int anInt5136;
	static int anInt5137;
	static int anInt5138;
	static Class135 aClass135_5139 = new Class135();
	static float aFloat5140;
	static int anInt5141;
	static int anInt5142;
	static int anInt5143;
	private int anInt5144;
	static int anInt5145 = 0;
	static int anInt5146 = 1337;
	
	static final void method2013(byte b, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (i_6_ == i_5_ && i == i_4_ && i_3_ == i_7_ && i_1_ == i_2_) {
			Animable_Sub3.method921(1048576, i_7_, i_1_, i_6_, i_0_, i);
		} else {
			int i_8_ = i_6_;
			int i_9_ = i;
			int i_10_ = i_6_ * 3;
			int i_11_ = 3 * i;
			int i_12_ = 3 * i_5_;
			int i_13_ = i_4_ * 3;
			int i_14_ = 3 * i_3_;
			int i_15_ = 3 * i_2_;
			int i_16_ = -i_6_ + i_12_ + i_7_ - i_14_;
			int i_17_ = -i + (i_1_ + (-i_15_ - -i_13_));
			int i_18_ = -i_12_ + (i_14_ - i_12_ + i_10_);
			int i_19_ = -i_13_ + (i_15_ - (i_13_ + -i_11_));
			int i_20_ = -i_10_ + i_12_;
			int i_21_ = i_13_ + -i_11_;
			for (int i_22_ = 128; (i_22_ ^ 0xffffffff) >= -4097; i_22_ += 128) {
				int i_23_ = i_22_ * i_22_ >> 12;
				int i_24_ = i_23_ * i_22_ >> 12;
				int i_25_ = i_16_ * i_24_;
				int i_26_ = i_17_ * i_24_;
				int i_27_ = i_23_ * i_18_;
				int i_28_ = i_19_ * i_23_;
				int i_29_ = i_22_ * i_20_;
				int i_30_ = i_21_ * i_22_;
				int i_31_ = (i_27_ + (i_25_ + i_29_) >> 12) + i_6_;
				int i_32_ = i - -(i_28_ + (i_26_ + i_30_) >> 12);
				Animable_Sub3.method921(1048576, i_31_, i_32_, i_8_, i_0_, i_9_);
				i_8_ = i_31_;
				i_9_ = i_32_;
			}
		}
		anInt5142++;
		if (b >= -111) {
			aClass135_5139 = null;
		}
	}
	
	static final int method2014(int i, int i_33_) {
		anInt5136++;
		if (i != -30444) {
			anInt5145 = -44;
		}
		return i_33_ >>> 8;
	}
	
	public final int method21(int i) {
		anInt5137++;
		if (i != 23144) {
			return -9;
		}
		return anInt5144;
	}
	
	static final boolean method2015(int i, int i_34_, int i_35_, Class84 class84, int baseX, int i_37_, int baseY, int targetX, int targetY, int i_41_, int i_42_) {
		anInt5141++;
		int i_45_ = 64;
		int i_46_ = 64;
		int i_47_ = baseX + -i_45_;
		Node_Sub36_Sub2.anIntArrayArray10047[i_45_][i_46_] = 99;
		if (i_37_ != 11564) {
			aClass135_5139 = null;
		}
		int i_48_ = baseY - i_46_;
		Class262_Sub23.anIntArrayArray7892[i_45_][i_46_] = 0;
		int i_49_ = 0;
		int i_50_ = 0;
		Node_Sub39.routeFinderXArray[i_49_] = baseX;
		Class339_Sub6.routeFinderYArray[i_49_++] = baseY;
		int[][] is = class84.clipMasks;
		while (i_50_ != i_49_) {
			baseY = Class339_Sub6.routeFinderYArray[i_50_];
			baseX = Node_Sub39.routeFinderXArray[i_50_];
			int i_51_ = baseY + -class84.anInt1135;
			int i_52_ = baseX + -class84.anInt1139;
			i_50_ = i_50_ - -1 & 0xfff;
			i_46_ = baseY - i_48_;
			i_45_ = -i_47_ + baseX;
			int i_53_ = i_35_;
		while_96_:
			do {
			while_95_:
				do {
				while_94_:
					do {
					while_93_:
						do {
							do {
								if ((~i_53_) != 3) {
									if (i_53_ != -3) {
										if (i_53_ != -2) {
											if ((~i_53_) != 0) {
												if ((~i_53_) == -1 || (~i_53_) == -2 || (~i_53_) == -3 || (~i_53_) == -4 || i_53_ == 9) {
													break while_94_;
												}
												break while_95_;
											}
										} else {
											break;
										}
										break while_93_;
									}
								} else {
									if ((~targetX) == (~baseX) && baseY == targetY) {
										Class315.anInt4033 = baseX;
										Class219.anInt2623 = baseY;
										return true;
									}
									break while_96_;
								}
								if (Class150_Sub2.method1659(targetX, 1, baseX, -40, i, i_34_, baseY, targetY, 1)) {
									Class315.anInt4033 = baseX;
									Class219.anInt2623 = baseY;
									return true;
								}
								break while_96_;
							} while (false);
							if (class84.method984(1, targetY, (byte) -98, 1, baseX, targetX, i_42_, i_34_, baseY, i)) {
								Class219.anInt2623 = baseY;
								Class315.anInt4033 = baseX;
								return true;
							}
							break while_96_;
						} while (false);
						if (class84.method988(targetY, i_37_ + -19298, i_42_, targetX, baseX, 1, i_34_, i, baseY)) {
							Class219.anInt2623 = baseY;
							Class315.anInt4033 = baseX;
							return true;
						}
						break while_96_;
					} while (false);
					if (class84.method989(1, i_35_, targetY, baseY, baseX, targetX, i_41_, i_37_ ^ 0x2c2c2e)) {
						Class315.anInt4033 = baseX;
						Class219.anInt2623 = baseY;
						return true;
					}
					break while_96_;
				} while (false);
				if (class84.method982(baseX, 25451, i_35_, targetX, targetY, i_41_, baseY, 1)) {
					Class219.anInt2623 = baseY;
					Class315.anInt4033 = baseX;
					return true;
				}
			} while (false);
			i_53_ = Class262_Sub23.anIntArrayArray7892[i_45_][i_46_] + 1;
			if ((~i_45_) < -1 && Node_Sub36_Sub2.anIntArrayArray10047[i_45_ - 1][i_46_] == 0 && (is[i_52_ + -1][i_51_] & 0x42240000 ^ 0xffffffff) == -1) {
				Node_Sub39.routeFinderXArray[i_49_] = -1 + baseX;
				Class339_Sub6.routeFinderYArray[i_49_] = baseY;
				i_49_ = i_49_ - -1 & 0xfff;
				Node_Sub36_Sub2.anIntArrayArray10047[i_45_ + -1][i_46_] = 2;
				Class262_Sub23.anIntArrayArray7892[i_45_ - 1][i_46_] = i_53_;
			}
			if ((i_45_ ^ 0xffffffff) > -128 && Node_Sub36_Sub2.anIntArrayArray10047[i_45_ - -1][i_46_] == 0 && (is[i_52_ - -1][i_51_] & 0x60240000 ^ 0xffffffff) == -1) {
				Node_Sub39.routeFinderXArray[i_49_] = 1 + baseX;
				Class339_Sub6.routeFinderYArray[i_49_] = baseY;
				i_49_ = 0xfff & 1 + i_49_;
				Node_Sub36_Sub2.anIntArrayArray10047[i_45_ - -1][i_46_] = 8;
				Class262_Sub23.anIntArrayArray7892[1 + i_45_][i_46_] = i_53_;
			}
			if ((i_46_ ^ 0xffffffff) < -1 && (Node_Sub36_Sub2.anIntArrayArray10047[i_45_][-1 + i_46_] ^ 0xffffffff) == -1 && (is[i_52_][i_51_ - 1] & 0x40a40000) == 0) {
				Node_Sub39.routeFinderXArray[i_49_] = baseX;
				Class339_Sub6.routeFinderYArray[i_49_] = baseY + -1;
				i_49_ = 0xfff & i_49_ - -1;
				Node_Sub36_Sub2.anIntArrayArray10047[i_45_][-1 + i_46_] = 1;
				Class262_Sub23.anIntArrayArray7892[i_45_][i_46_ + -1] = i_53_;
			}
			if ((i_46_ ^ 0xffffffff) > -128 && Node_Sub36_Sub2.anIntArrayArray10047[i_45_][i_46_ + 1] == 0 && (is[i_52_][i_51_ - -1] & 0x48240000 ^ 0xffffffff) == -1) {
				Node_Sub39.routeFinderXArray[i_49_] = baseX;
				Class339_Sub6.routeFinderYArray[i_49_] = baseY - -1;
				Node_Sub36_Sub2.anIntArrayArray10047[i_45_][1 + i_46_] = 4;
				i_49_ = i_49_ - -1 & 0xfff;
				Class262_Sub23.anIntArrayArray7892[i_45_][i_46_ - -1] = i_53_;
			}
			if (i_45_ > 0 && (i_46_ ^ 0xffffffff) < -1 && Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_45_][i_46_ + -1] == 0 && (is[-1 + i_52_][i_51_ + -1] & 0x43a40000 ^ 0xffffffff) == -1 && (0x42240000 & is[i_52_ + -1][i_51_] ^ 0xffffffff) == -1 && (is[i_52_][-1 + i_51_] & 0x40a40000) == 0) {
				Node_Sub39.routeFinderXArray[i_49_] = baseX - 1;
				Class339_Sub6.routeFinderYArray[i_49_] = baseY - 1;
				Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_45_][i_46_ + -1] = 3;
				i_49_ = i_49_ - -1 & 0xfff;
				Class262_Sub23.anIntArrayArray7892[-1 + i_45_][i_46_ - 1] = i_53_;
			}
			if ((i_45_ ^ 0xffffffff) > -128 && i_46_ > 0 && Node_Sub36_Sub2.anIntArrayArray10047[i_45_ + 1][-1 + i_46_] == 0 && (is[i_52_ - -1][i_51_ - 1] & 0x60e40000) == 0 && (is[1 + i_52_][i_51_] & 0x60240000) == 0 && (is[i_52_][-1 + i_51_] & 0x40a40000 ^ 0xffffffff) == -1) {
				Node_Sub39.routeFinderXArray[i_49_] = baseX - -1;
				Class339_Sub6.routeFinderYArray[i_49_] = -1 + baseY;
				Node_Sub36_Sub2.anIntArrayArray10047[1 + i_45_][i_46_ - 1] = 9;
				i_49_ = 0xfff & i_49_ - -1;
				Class262_Sub23.anIntArrayArray7892[1 + i_45_][-1 + i_46_] = i_53_;
			}
			if ((i_45_ ^ 0xffffffff) < -1 && (i_46_ ^ 0xffffffff) > -128 && (Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_45_][1 + i_46_] ^ 0xffffffff) == -1 && (0x4e240000 & is[-1 + i_52_][1 + i_51_]) == 0 && (is[-1 + i_52_][i_51_] & 0x42240000 ^ 0xffffffff) == -1 && (is[i_52_][i_51_ + 1] & 0x48240000 ^ 0xffffffff) == -1) {
				Node_Sub39.routeFinderXArray[i_49_] = -1 + baseX;
				Class339_Sub6.routeFinderYArray[i_49_] = baseY + 1;
				Node_Sub36_Sub2.anIntArrayArray10047[-1 + i_45_][1 + i_46_] = 6;
				i_49_ = 0xfff & i_49_ + 1;
				Class262_Sub23.anIntArrayArray7892[i_45_ - 1][1 + i_46_] = i_53_;
			}
			if (i_45_ < 127 && (i_46_ ^ 0xffffffff) > -128 && (Node_Sub36_Sub2.anIntArrayArray10047[1 + i_45_][i_46_ - -1] ^ 0xffffffff) == -1 && (is[1 + i_52_][i_51_ - -1] & 0x78240000) == 0 && (0x60240000 & is[i_52_ + 1][i_51_] ^ 0xffffffff) == -1 && (0x48240000 & is[i_52_][i_51_ + 1] ^ 0xffffffff) == -1) {
				Node_Sub39.routeFinderXArray[i_49_] = 1 + baseX;
				Class339_Sub6.routeFinderYArray[i_49_] = baseY + 1;
				Node_Sub36_Sub2.anIntArrayArray10047[i_45_ + 1][i_46_ + 1] = 12;
				i_49_ = i_49_ + 1 & 0xfff;
				Class262_Sub23.anIntArrayArray7892[1 + i_45_][1 + i_46_] = i_53_;
			}
		}
		Class219.anInt2623 = baseY;
		Class315.anInt4033 = baseX;
		return false;
	}
	
	public final long method23(int i) {
		if (i != 28552) {
			anInt5145 = -8;
		}
		anInt5143++;
		return aBuffer2440.getAddress();
	}
	
	Class200_Sub1(GLToolkit gltoolkit, int i, byte[] bs, int i_54_) {
		super(gltoolkit, bs, i_54_);
		anInt5144 = i;
	}
	
	public final int method24(int i) {
		if (i != 29121) {
			method2015(116, 53, 94, null, 85, -76, -28, 74, 91, 33, 61);
		}
		anInt5138++;
		return 0;
	}
	
	public static void method2016(int i) {
		@SuppressWarnings("unused")
		int i_55_ = -35 % ((i - -73) / 44);
		aClass135_5139 = null;
	}
	
	public final void method22(byte[] bs, int i, int i_56_, byte b) {
		this.method2012(bs, i);
		if (b == 74) {
			anInt5134++;
			anInt5144 = i_56_;
		}
	}
	
	Class200_Sub1(GLToolkit gltoolkit, int i, jaclib.memory.Buffer buffer) {
		super(gltoolkit, buffer);
		anInt5144 = i;
	}
	
	static final int method2017(int i, Index class302) {
		anInt5135++;
		int i_57_ = i;
		if (class302.method3510(Class89.anInt1197, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Node_Sub38_Sub20.anInt10313, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Class41.anInt626, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Class162.anInt2004, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Class347.anInt4281, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Node_Sub9_Sub5.anInt9767, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Class169_Sub1.anInt8787, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Node_Sub21.anInt7186, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(OutcommingPacket.anInt4045, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Class163.anInt2019, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Class289.anInt3645, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Class320_Sub3.anInt8225, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Node_Sub38_Sub32.anInt10436, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(Class153.anInt1943, (byte) 63)) {
			i_57_++;
		}
		if (class302.method3510(CacheNode_Sub18.anInt9603, (byte) 63)) {
			i_57_++;
		}
		return i_57_;
	}
}
