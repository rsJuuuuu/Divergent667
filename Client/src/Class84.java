/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class84
{
	static int anInt1129;
	static int anInt1130;
	static int anInt1131;
	static int anInt1132;
	protected int anInt1133;
	static int anInt1134;
	protected int anInt1135;
	static int[] anIntArray1136 = new int[13];
	static int anInt1137;
	protected int[][] clipMasks;
	protected int anInt1139;
	static int anInt1140;
	static int anInt1141;
	static int anInt1142;
	static int anInt1143;
	static Class61 aClass61_1144 = new Class61(64);
	static int anInt1145;
	protected int anInt1146;
	static int[] anIntArray1147;
	static String aString1148 = null;
	static int anInt1149;
	static int anInt1150;
	static int anInt1151;
	static int anInt1152;
	static int anInt1153;
	
	public static void method981(byte b) {
		aString1148 = null;
		aClass61_1144 = null;
		anIntArray1136 = null;
		anIntArray1147 = null;
	}
	
	final boolean method982(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		anInt1152++;
		if ((i_6_ ^ 0xffffffff) == -2) {
			if (i_2_ == i && i_5_ == i_3_) {
				return true;
			}
		} else if ((i_2_ ^ 0xffffffff) <= (i ^ 0xffffffff) && -1 + (i_6_ + i) >= i_2_ && i_3_ <= i_3_ && i_3_ <= -1 + (i_6_ + i_3_)) {
			return true;
		}
		i_3_ -= anInt1135;
		i_5_ -= anInt1135;
		i -= anInt1139;
		i_2_ -= anInt1139;
		if (i_6_ == 1) {
			if ((i_1_ ^ 0xffffffff) == -7 || i_1_ == 7) {
				if (i_1_ == 7) {
					i_4_ = 0x3 & i_4_ - -2;
				}
				if ((i_4_ ^ 0xffffffff) == -1) {
					if ((1 + i_2_ ^ 0xffffffff) == (i ^ 0xffffffff) && (i_3_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) && (0x80 & clipMasks[i][i_5_]) == 0) {
						return true;
					}
					if ((i ^ 0xffffffff) == (i_2_ ^ 0xffffffff) && i_5_ == -1 + i_3_ && (0x2 & clipMasks[i][i_5_] ^ 0xffffffff) == -1) {
						return true;
					}
				} else if (i_4_ == 1) {
					if (i == -1 + i_2_ && (i_3_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) && (clipMasks[i][i_5_] & 0x8 ^ 0xffffffff) == -1) {
						return true;
					}
					if (i_2_ == i && (-1 + i_3_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) && (clipMasks[i][i_5_] & 0x2 ^ 0xffffffff) == -1) {
						return true;
					}
				} else if ((i_4_ ^ 0xffffffff) == -3) {
					if ((i_2_ - 1 ^ 0xffffffff) == (i ^ 0xffffffff) && (i_5_ ^ 0xffffffff) == (i_3_ ^ 0xffffffff) && (clipMasks[i][i_5_] & 0x8 ^ 0xffffffff) == -1) {
						return true;
					}
					if (i_2_ == i && i_5_ == 1 + i_3_ && (0x20 & clipMasks[i][i_5_]) == 0) {
						return true;
					}
				} else if (i_4_ == 3) {
					if ((i ^ 0xffffffff) == (1 + i_2_ ^ 0xffffffff) && (i_3_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) && (clipMasks[i][i_5_] & 0x80 ^ 0xffffffff) == -1) {
						return true;
					}
					if (i_2_ == i && (1 + i_3_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) && (0x20 & clipMasks[i][i_5_] ^ 0xffffffff) == -1) {
						return true;
					}
				}
			}
			if ((i_1_ ^ 0xffffffff) == -9) {
				if (i_2_ == i && (1 + i_3_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) && (0x20 & clipMasks[i][i_5_] ^ 0xffffffff) == -1) {
					return true;
				}
				if ((i_2_ ^ 0xffffffff) == (i ^ 0xffffffff) && i_3_ + -1 == i_5_ && (clipMasks[i][i_5_] & 0x2 ^ 0xffffffff) == -1) {
					return true;
				}
				if ((i_2_ + -1 ^ 0xffffffff) == (i ^ 0xffffffff) && (i_5_ ^ 0xffffffff) == (i_3_ ^ 0xffffffff) && (0x8 & clipMasks[i][i_5_] ^ 0xffffffff) == -1) {
					return true;
				}
				if ((i ^ 0xffffffff) == (i_2_ - -1 ^ 0xffffffff) && i_3_ == i_5_ && (0x80 & clipMasks[i][i_5_]) == 0) {
					return true;
				}
			}
		} else {
			int i_7_ = i_6_ + i - 1;
			int i_8_ = -1 + i_5_ + i_6_;
			if (i_1_ == 6 || i_1_ == 7) {
				if ((i_1_ ^ 0xffffffff) == -8) {
					i_4_ = i_4_ + 2 & 0x3;
				}
				if (i_4_ != 0) {
					if ((i_4_ ^ 0xffffffff) == -2) {
						if (i == i_2_ - i_6_ && (i_5_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff) && i_3_ <= i_8_ && (clipMasks[i_7_][i_3_] & 0x8 ^ 0xffffffff) == -1) {
							return true;
						}
						if ((i_2_ ^ 0xffffffff) <= (i ^ 0xffffffff) && i_2_ <= i_7_ && i_5_ == -i_6_ + i_3_ && (clipMasks[i_2_][i_8_] & 0x2) == 0) {
							return true;
						}
					} else if (i_4_ != 2) {
						if (i_4_ == 3) {
							if ((i_2_ - -1 ^ 0xffffffff) == (i ^ 0xffffffff) && (i_3_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff) && i_3_ <= i_8_ && (0x80 & clipMasks[i][i_3_] ^ 0xffffffff) == -1) {
								return true;
							}
							if (i_2_ >= i && (i_2_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff) && i_5_ == i_3_ + 1 && (clipMasks[i_2_][i_5_] & 0x20 ^ 0xffffffff) == -1) {
								return true;
							}
						}
					} else {
						if (-i_6_ + i_2_ == i && (i_5_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff) && i_3_ <= i_8_ && (clipMasks[i_7_][i_3_] & 0x8 ^ 0xffffffff) == -1) {
							return true;
						}
						if ((i ^ 0xffffffff) >= (i_2_ ^ 0xffffffff) && (i_2_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff) && (i_5_ ^ 0xffffffff) == (1 + i_3_ ^ 0xffffffff) && (0x20 & clipMasks[i_2_][i_5_] ^ 0xffffffff) == -1) {
							return true;
						}
					}
				} else {
					if (i == i_2_ + 1 && i_5_ <= i_3_ && (i_8_ ^ 0xffffffff) <= (i_3_ ^ 0xffffffff) && (0x80 & clipMasks[i][i_3_] ^ 0xffffffff) == -1) {
						return true;
					}
					if ((i ^ 0xffffffff) >= (i_2_ ^ 0xffffffff) && i_2_ <= i_7_ && (i_3_ + -i_6_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) && (0x2 & clipMasks[i_2_][i_8_]) == 0) {
						return true;
					}
				}
			}
			if ((i_1_ ^ 0xffffffff) == -9) {
				if ((i_2_ ^ 0xffffffff) <= (i ^ 0xffffffff) && (i_2_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff) && (1 + i_3_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) && (0x20 & clipMasks[i_2_][i_5_] ^ 0xffffffff) == -1) {
					return true;
				}
				if ((i ^ 0xffffffff) >= (i_2_ ^ 0xffffffff) && i_2_ <= i_7_ && i_5_ == -i_6_ + i_3_ && (0x2 & clipMasks[i_2_][i_8_] ^ 0xffffffff) == -1) {
					return true;
				}
				if (i == i_2_ + -i_6_ && (i_3_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff) && i_3_ <= i_8_ && (clipMasks[i_7_][i_3_] & 0x8 ^ 0xffffffff) == -1) {
					return true;
				}
				if (i == 1 + i_2_ && (i_3_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff) && (i_8_ ^ 0xffffffff) <= (i_3_ ^ 0xffffffff) && (0x80 & clipMasks[i][i_3_]) == 0) {
					return true;
				}
			}
		}
		if (i_0_ != 25451) {
			method991(-108);
		}
		return false;
	}
	
	private final void method983(int i, int i_9_, int i_10_, boolean bool) {
		clipMasks[i_10_][i] = Node_Sub30.method2723(clipMasks[i_10_][i], i_9_ ^ 0xffffffff);
		anInt1130++;
		if (bool != true) {
			aClass61_1144 = null;
		}
	}
	
	final boolean method984(int i, int i_11_, byte b, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		anInt1145++;
		int i_19_ = i + i_13_;
		int i_20_ = i_12_ + i_17_;
		int i_22_ = i_18_ + i_14_;
		int i_23_ = i_16_ + i_11_;
		if (i_13_ != i_22_ || (0x2 & i_15_) != 0) {
			if ((i_14_ ^ 0xffffffff) != (i_19_ ^ 0xffffffff) || (i_15_ & 0x8 ^ 0xffffffff) != -1) {
				if (i_23_ == i_17_ && (0x1 & i_15_) == 0) {
					int i_24_ = i_13_ <= i_14_ ? i_14_ : i_13_;
					for (int i_25_ = i_22_ <= i_19_ ? i_22_ : i_19_; i_24_ < i_25_; i_24_++) {
						if ((clipMasks[-anInt1139 + i_24_][-anInt1135 + i_23_ - 1] & 0x2) == 0) {
							return true;
						}
					}
				} else if (i_20_ == i_11_ && (0x4 & i_15_ ^ 0xffffffff) == -1) {
					int i_26_ = (i_14_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff) ? i_13_ : i_14_;
					for (int i_27_ = (i_22_ ^ 0xffffffff) >= (i_19_ ^ 0xffffffff) ? i_22_ : i_19_; (i_27_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
						if ((0x20 & clipMasks[-anInt1139 + i_26_][i_11_ - anInt1135]) == 0) {
							return true;
						}
					}
				}
			} else {
				int i_28_ = i_17_ <= i_11_ ? i_11_ : i_17_;
				for (int i_29_ = (i_20_ ^ 0xffffffff) <= (i_23_ ^ 0xffffffff) ? i_23_ : i_20_; (i_29_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
					if ((0x80 & clipMasks[i_14_ - anInt1139][i_28_ + -anInt1135]) == 0) {
						return true;
					}
				}
			}
		} else {
			int i_30_ = i_11_ < i_17_ ? i_17_ : i_11_;
			for (int i_31_ = (i_20_ ^ 0xffffffff) <= (i_23_ ^ 0xffffffff) ? i_23_ : i_20_; i_30_ < i_31_; i_30_++) {
				if ((clipMasks[i_22_ + (-1 + -anInt1139)][-anInt1135 + i_30_] & 0x8) == 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	static final void method985(int i, Class343 class343, int i_32_) {
		anInt1132++;
		if (Class320_Sub27.aBoolean8465) {
			i = 0;
			Class320_Sub27.aBoolean8465 = false;
		}
		if (Class20_Sub1.aClass343_5509 == null || !Class20_Sub1.aClass343_5509.method3968((byte) 97, class343)) {
			Class20_Sub1.aClass343_5509 = class343;
			Class181.aLong2157 = Class313.method3650(false);
			Class312.anInt3955 = Class290_Sub4.anInt8100 = i;
			if ((Class312.anInt3955 ^ 0xffffffff) != -1) {
				Class44.aClass119_670 = Class245.aClass119_3085;
				Animable_Sub3_Sub1.aFloat11014 = Animable.aFloat5932;
				Class357.aFloat4439 = Class363.aFloat4502;
				Class188_Sub2_Sub2.anInt9360 = Class320_Sub20.anInt8402;
				Class113.aFloat1439 = Class39.aFloat580;
				Class44.aClass270_669 = Class229.aClass270_2733;
				Class284.aFloat3597 = Class69.aFloat944;
				Class191.anInt2353 = Class138.anInt1726;
				CacheNode_Sub17.aFloat8847 = CacheNode_Sub16_Sub2.aFloat11082;
				Class329.aFloat4117 = Node_Sub25.aFloat7236;
				Node_Sub52.anInt7644 = Node_Sub12.anInt5455;
				if (Class245.aClass119_3085 != null) {
					if (Class245.aClass119_3085.method1222((byte) 105)) {
						Class44.aClass119_670 = Class245.aClass119_3085.method1224((byte) 58);
						Class245.aClass119_3085 = Class44.aClass119_670;
					}
					if (Class245.aClass119_3085 != null && Class20_Sub1.aClass343_5509.aClass119_4238 != Class245.aClass119_3085) {
						Class245.aClass119_3085.method1220((byte) -35, Class20_Sub1.aClass343_5509.aClass119_4238);
					}
				}
			} else {
				CacheNode_Sub14.method2349((byte) 5);
			}
		}
		if (i_32_ != 1) {
			method985(9, null, -91);
		}
	}
	
	final void method986(int i, boolean bool, boolean bool_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		anInt1129++;
		i_34_ -= anInt1135;
		i_37_ -= anInt1139;
		if ((i_36_ ^ 0xffffffff) == -1) {
			if (i_35_ == 0) {
				method995(i_37_, i_34_, 128, 94);
				method995(-1 + i_37_, i_34_, 8, -104);
			}
			if ((i_35_ ^ 0xffffffff) == -2) {
				method995(i_37_, i_34_, 2, 98);
				method995(i_37_, i_34_ - -1, 32, 124);
			}
			if ((i_35_ ^ 0xffffffff) == -3) {
				method995(i_37_, i_34_, 8, -124);
				method995(1 + i_37_, i_34_, 128, -121);
			}
			if (i_35_ == 3) {
				method995(i_37_, i_34_, 32, -102);
				method995(i_37_, i_34_ - 1, 2, 5);
			}
		}
		if (i_36_ == 1 || (i_36_ ^ 0xffffffff) == -4) {
			if ((i_35_ ^ 0xffffffff) == -1) {
				method995(i_37_, i_34_, 1, -5);
				method995(i_37_ - 1, i_34_ - -1, 16, 64);
			}
			if (i_35_ == 1) {
				method995(i_37_, i_34_, 4, 3);
				method995(i_37_ + 1, 1 + i_34_, 64, -112);
			}
			if ((i_35_ ^ 0xffffffff) == -3) {
				method995(i_37_, i_34_, 16, 106);
				method995(i_37_ + 1, -1 + i_34_, 1, 63);
			}
			if (i_35_ == 3) {
				method995(i_37_, i_34_, 64, -103);
				method995(-1 + i_37_, -1 + i_34_, 4, 38);
			}
		}
		if (i_36_ == 2) {
			if ((i_35_ ^ 0xffffffff) == -1) {
				method995(i_37_, i_34_, 130, -116);
				method995(i_37_ - 1, i_34_, 8, 112);
				method995(i_37_, 1 + i_34_, 32, -99);
			}
			if (i_35_ == 1) {
				method995(i_37_, i_34_, 10, -126);
				method995(i_37_, i_34_ + 1, 32, -120);
				method995(i_37_ + 1, i_34_, 128, -106);
			}
			if ((i_35_ ^ 0xffffffff) == -3) {
				method995(i_37_, i_34_, 40, -124);
				method995(i_37_ + 1, i_34_, 128, 9);
				method995(i_37_, i_34_ + -1, 2, 60);
			}
			if (i_35_ == 3) {
				method995(i_37_, i_34_, 160, 73);
				method995(i_37_, -1 + i_34_, 2, 39);
				method995(i_37_ - 1, i_34_, 8, -127);
			}
		}
		if (bool) {
			if ((i_36_ ^ 0xffffffff) == -1) {
				if (i_35_ == 0) {
					method995(i_37_, i_34_, 65536, -105);
					method995(-1 + i_37_, i_34_, 4096, -10);
				}
				if ((i_35_ ^ 0xffffffff) == -2) {
					method995(i_37_, i_34_, 1024, -115);
					method995(i_37_, i_34_ + 1, 16384, 26);
				}
				if ((i_35_ ^ 0xffffffff) == -3) {
					method995(i_37_, i_34_, 4096, -110);
					method995(1 + i_37_, i_34_, 65536, -124);
				}
				if ((i_35_ ^ 0xffffffff) == -4) {
					method995(i_37_, i_34_, 16384, -119);
					method995(i_37_, i_34_ + -1, 1024, 121);
				}
			}
			if ((i_36_ ^ 0xffffffff) == -2 || i_36_ == 3) {
				if (i_35_ == 0) {
					method995(i_37_, i_34_, 512, 60);
					method995(i_37_ - 1, i_34_ + 1, 8192, -104);
				}
				if ((i_35_ ^ 0xffffffff) == -2) {
					method995(i_37_, i_34_, 2048, 51);
					method995(i_37_ - -1, 1 + i_34_, 32768, 84);
				}
				if ((i_35_ ^ 0xffffffff) == -3) {
					method995(i_37_, i_34_, 8192, -122);
					method995(1 + i_37_, i_34_ + -1, 512, -118);
				}
				if (i_35_ == 3) {
					method995(i_37_, i_34_, 32768, -99);
					method995(i_37_ - 1, -1 + i_34_, 2048, -104);
				}
			}
			if ((i_36_ ^ 0xffffffff) == -3) {
				if (i_35_ == 0) {
					method995(i_37_, i_34_, 66560, 63);
					method995(-1 + i_37_, i_34_, 4096, 2);
					method995(i_37_, i_34_ - -1, 16384, 56);
				}
				if ((i_35_ ^ 0xffffffff) == -2) {
					method995(i_37_, i_34_, 5120, -116);
					method995(i_37_, 1 + i_34_, 16384, -99);
					method995(1 + i_37_, i_34_, 65536, -127);
				}
				if (i_35_ == 2) {
					method995(i_37_, i_34_, 20480, -127);
					method995(1 + i_37_, i_34_, 65536, 6);
					method995(i_37_, -1 + i_34_, 1024, 10);
				}
				if (i_35_ == 3) {
					method995(i_37_, i_34_, 81920, 13);
					method995(i_37_, -1 + i_34_, 1024, 66);
					method995(-1 + i_37_, i_34_, 4096, -120);
				}
			}
		}
		if (bool_33_) {
			if (i_36_ == 0) {
				if ((i_35_ ^ 0xffffffff) == -1) {
					method995(i_37_, i_34_, 536870912, 30);
					method995(i_37_ - 1, i_34_, 33554432, 115);
				}
				if ((i_35_ ^ 0xffffffff) == -2) {
					method995(i_37_, i_34_, 8388608, -118);
					method995(i_37_, 1 + i_34_, 134217728, -1);
				}
				if (i_35_ == 2) {
					method995(i_37_, i_34_, 33554432, -102);
					method995(i_37_ + 1, i_34_, 536870912, -111);
				}
				if (i_35_ == 3) {
					method995(i_37_, i_34_, 134217728, -127);
					method995(i_37_, i_34_ + -1, 8388608, 34);
				}
			}
			if (i_36_ == 1 || (i_36_ ^ 0xffffffff) == -4) {
				if (i_35_ == 0) {
					method995(i_37_, i_34_, 4194304, -121);
					method995(-1 + i_37_, i_34_ + 1, 67108864, 74);
				}
				if ((i_35_ ^ 0xffffffff) == -2) {
					method995(i_37_, i_34_, 16777216, -109);
					method995(1 + i_37_, i_34_ - -1, 268435456, 104);
				}
				if ((i_35_ ^ 0xffffffff) == -3) {
					method995(i_37_, i_34_, 67108864, 31);
					method995(i_37_ - -1, -1 + i_34_, 4194304, -109);
				}
				if (i_35_ == 3) {
					method995(i_37_, i_34_, 268435456, 62);
					method995(i_37_ - 1, i_34_ + -1, 16777216, -102);
				}
			}
			if ((i_36_ ^ 0xffffffff) == -3) {
				if (i_35_ == 0) {
					method995(i_37_, i_34_, 545259520, -99);
					method995(-1 + i_37_, i_34_, 33554432, -107);
					method995(i_37_, i_34_ + 1, 134217728, 35);
				}
				if (i_35_ == 1) {
					method995(i_37_, i_34_, 41943040, 101);
					method995(i_37_, 1 + i_34_, 134217728, -123);
					method995(i_37_ - -1, i_34_, 536870912, -109);
				}
				if ((i_35_ ^ 0xffffffff) == -3) {
					method995(i_37_, i_34_, 167772160, 6);
					method995(i_37_ - -1, i_34_, 536870912, 35);
					method995(i_37_, -1 + i_34_, 8388608, 24);
				}
				if (i_35_ == 3) {
					method995(i_37_, i_34_, 671088640, 15);
					method995(i_37_, i_34_ + -1, 8388608, -121);
					method995(-1 + i_37_, i_34_, 33554432, 66);
				}
			}
		}
	}
	
	final void method987(int i, int i_39_, int i_40_, byte b, boolean bool, int i_41_, boolean bool_42_) {
		i_41_ -= anInt1139;
		i -= anInt1135;
		anInt1153++;
		if ((i_40_ ^ 0xffffffff) == -1) {
			if ((i_39_ ^ 0xffffffff) == -1) {
				method983(i, 128, i_41_, true);
				method983(i, 8, i_41_ + -1, true);
			}
			if (i_39_ == 1) {
				method983(i, 2, i_41_, true);
				method983(1 + i, 32, i_41_, true);
			}
			if ((i_39_ ^ 0xffffffff) == -3) {
				method983(i, 8, i_41_, true);
				method983(i, 128, 1 + i_41_, true);
			}
			if (i_39_ == 3) {
				method983(i, 32, i_41_, true);
				method983(-1 + i, 2, i_41_, true);
			}
		}
		if ((i_40_ ^ 0xffffffff) == -2 || i_40_ == 3) {
			if ((i_39_ ^ 0xffffffff) == -1) {
				method983(i, 1, i_41_, true);
				method983(i + 1, 16, -1 + i_41_, true);
			}
			if ((i_39_ ^ 0xffffffff) == -2) {
				method983(i, 4, i_41_, true);
				method983(i - -1, 64, i_41_ + 1, true);
			}
			if (i_39_ == 2) {
				method983(i, 16, i_41_, true);
				method983(-1 + i, 1, i_41_ + 1, true);
			}
			if (i_39_ == 3) {
				method983(i, 64, i_41_, true);
				method983(-1 + i, 4, -1 + i_41_, true);
			}
		}
		if (i_40_ == 2) {
			if ((i_39_ ^ 0xffffffff) == -1) {
				method983(i, 130, i_41_, true);
				method983(i, 8, -1 + i_41_, true);
				method983(1 + i, 32, i_41_, true);
			}
			if (i_39_ == 1) {
				method983(i, 10, i_41_, true);
				method983(i - -1, 32, i_41_, true);
				method983(i, 128, 1 + i_41_, true);
			}
			if ((i_39_ ^ 0xffffffff) == -3) {
				method983(i, 40, i_41_, true);
				method983(i, 128, i_41_ + 1, true);
				method983(-1 + i, 2, i_41_, true);
			}
			if (i_39_ == 3) {
				method983(i, 160, i_41_, true);
				method983(-1 + i, 2, i_41_, true);
				method983(i, 8, i_41_ - 1, true);
			}
		}
		if (bool_42_) {
			if (i_40_ == 0) {
				if ((i_39_ ^ 0xffffffff) == -1) {
					method983(i, 65536, i_41_, true);
					method983(i, 4096, -1 + i_41_, true);
				}
				if (i_39_ == 1) {
					method983(i, 1024, i_41_, true);
					method983(1 + i, 16384, i_41_, true);
				}
				if ((i_39_ ^ 0xffffffff) == -3) {
					method983(i, 4096, i_41_, true);
					method983(i, 65536, 1 + i_41_, true);
				}
				if ((i_39_ ^ 0xffffffff) == -4) {
					method983(i, 16384, i_41_, true);
					method983(i + -1, 1024, i_41_, true);
				}
			}
			if (i_40_ == 1 || (i_40_ ^ 0xffffffff) == -4) {
				if (i_39_ == 0) {
					method983(i, 512, i_41_, true);
					method983(1 + i, 8192, i_41_ - 1, true);
				}
				if ((i_39_ ^ 0xffffffff) == -2) {
					method983(i, 2048, i_41_, true);
					method983(i - -1, 32768, i_41_ - -1, true);
				}
				if ((i_39_ ^ 0xffffffff) == -3) {
					method983(i, 8192, i_41_, true);
					method983(i + -1, 512, 1 + i_41_, true);
				}
				if (i_39_ == 3) {
					method983(i, 32768, i_41_, true);
					method983(-1 + i, 2048, -1 + i_41_, true);
				}
			}
			if ((i_40_ ^ 0xffffffff) == -3) {
				if ((i_39_ ^ 0xffffffff) == -1) {
					method983(i, 66560, i_41_, true);
					method983(i, 4096, -1 + i_41_, true);
					method983(1 + i, 16384, i_41_, true);
				}
				if (i_39_ == 1) {
					method983(i, 5120, i_41_, true);
					method983(i - -1, 16384, i_41_, true);
					method983(i, 65536, 1 + i_41_, true);
				}
				if (i_39_ == 2) {
					method983(i, 20480, i_41_, true);
					method983(i, 65536, 1 + i_41_, true);
					method983(-1 + i, 1024, i_41_, true);
				}
				if ((i_39_ ^ 0xffffffff) == -4) {
					method983(i, 81920, i_41_, true);
					method983(i - 1, 1024, i_41_, true);
					method983(i, 4096, i_41_ - 1, true);
				}
			}
		}
		if (bool) {
			if ((i_40_ ^ 0xffffffff) == -1) {
				if ((i_39_ ^ 0xffffffff) == -1) {
					method983(i, 536870912, i_41_, true);
					method983(i, 33554432, i_41_ + -1, true);
				}
				if (i_39_ == 1) {
					method983(i, 8388608, i_41_, true);
					method983(i + 1, 134217728, i_41_, true);
				}
				if (i_39_ == 2) {
					method983(i, 33554432, i_41_, true);
					method983(i, 536870912, 1 + i_41_, true);
				}
				if ((i_39_ ^ 0xffffffff) == -4) {
					method983(i, 134217728, i_41_, true);
					method983(i + -1, 8388608, i_41_, true);
				}
			}
			if ((i_40_ ^ 0xffffffff) == -2 || i_40_ == 3) {
				if ((i_39_ ^ 0xffffffff) == -1) {
					method983(i, 4194304, i_41_, true);
					method983(1 + i, 67108864, i_41_ + -1, true);
				}
				if ((i_39_ ^ 0xffffffff) == -2) {
					method983(i, 16777216, i_41_, true);
					method983(i + 1, 268435456, 1 + i_41_, true);
				}
				if (i_39_ == 2) {
					method983(i, 67108864, i_41_, true);
					method983(i - 1, 4194304, i_41_ - -1, true);
				}
				if ((i_39_ ^ 0xffffffff) == -4) {
					method983(i, 268435456, i_41_, true);
					method983(i + -1, 16777216, i_41_ - 1, true);
				}
			}
			if (i_40_ == 2) {
				if (i_39_ == 0) {
					method983(i, 545259520, i_41_, true);
					method983(i, 33554432, -1 + i_41_, true);
					method983(i - -1, 134217728, i_41_, true);
				}
				if ((i_39_ ^ 0xffffffff) == -2) {
					method983(i, 41943040, i_41_, true);
					method983(i - -1, 134217728, i_41_, true);
					method983(i, 536870912, i_41_ + 1, true);
				}
				if (i_39_ == 2) {
					method983(i, 167772160, i_41_, true);
					method983(i, 536870912, 1 + i_41_, true);
					method983(-1 + i, 8388608, i_41_, true);
				}
				if ((i_39_ ^ 0xffffffff) == -4) {
					method983(i, 671088640, i_41_, true);
					method983(i - 1, 8388608, i_41_, true);
					method983(i, 33554432, i_41_ - 1, true);
				}
			}
		}
	}
	
	final boolean method988(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_) {
		anInt1150++;
		if ((i_48_ ^ 0xffffffff) < -2) {
			if (Class150_Sub2.method1659(i_46_, i_48_, i_47_, -119, i_50_, i_49_, i_51_, i, i_48_)) {
				return true;
			}
			return method984(i_48_, i, (byte) 123, i_48_, i_47_, i_46_, i_45_, i_49_, i_51_, i_50_);
		}
		if (i_44_ != -7734) {
			method997(-56, true, 111);
		}
		int i_52_ = i_50_ + i_46_ + -1;
		int i_53_ = i_49_ + i - 1;
		if (i_46_ <= i_47_ && (i_52_ ^ 0xffffffff) <= (i_47_ ^ 0xffffffff) && (i ^ 0xffffffff) >= (i_51_ ^ 0xffffffff) && i_51_ <= i_53_) {
			return true;
		}
		if ((i_47_ ^ 0xffffffff) == (i_46_ - 1 ^ 0xffffffff) && (i_51_ ^ 0xffffffff) <= (i ^ 0xffffffff) && i_51_ <= i_53_ && (0x8 & clipMasks[i_47_ + -anInt1139][-anInt1135 + i_51_]) == 0 && (0x8 & i_45_ ^ 0xffffffff) == -1) {
			return true;
		}
		if (i_47_ == 1 + i_52_ && (i ^ 0xffffffff) >= (i_51_ ^ 0xffffffff) && i_53_ >= i_51_ && (clipMasks[i_47_ - anInt1139][i_51_ + -anInt1135] & 0x80) == 0 && (i_45_ & 0x2) == 0) {
			return true;
		}
		if ((-1 + i ^ 0xffffffff) == (i_51_ ^ 0xffffffff) && i_47_ >= i_46_ && (i_47_ ^ 0xffffffff) >= (i_52_ ^ 0xffffffff) && (0x2 & clipMasks[i_47_ - anInt1139][-anInt1135 + i_51_] ^ 0xffffffff) == -1 && (0x4 & i_45_ ^ 0xffffffff) == -1) {
			return true;
		}
        return i_51_ == 1 + i_53_ && (i_47_ ^ 0xffffffff) <= (i_46_ ^ 0xffffffff) && (i_47_ ^ 0xffffffff) >= (i_52_ ^ 0xffffffff) && (0x20 & clipMasks[-anInt1139 + i_47_][-anInt1135 + i_51_]) == 0 && (0x1 & i_45_ ^ 0xffffffff) == -1;
    }
	
	final boolean method989(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
		anInt1140++;
		if ((i ^ 0xffffffff) != -2) {
			if (i_58_ >= i_57_ && (i_58_ ^ 0xffffffff) >= (i_57_ - -i - 1 ^ 0xffffffff) && (i_55_ ^ 0xffffffff) <= (i_55_ ^ 0xffffffff) && (-1 + i_55_ + i ^ 0xffffffff) <= (i_55_ ^ 0xffffffff)) {
				return true;
			}
		} else if (i_58_ == i_57_ && i_56_ == i_55_) {
			return true;
		}
		i_57_ -= anInt1139;
		i_55_ -= anInt1135;
		i_58_ -= anInt1139;
		i_56_ -= anInt1135;
		if (i_60_ != 2883842) {
			clipMasks = null;
		}
		if (i != 1) {
			int i_61_ = -1 + (i + i_57_);
			int i_62_ = -1 + i + i_56_;
			if ((i_54_ ^ 0xffffffff) == -1) {
				if (i_59_ != 0) {
					if ((i_59_ ^ 0xffffffff) == -2) {
						if (i_58_ >= i_57_ && i_61_ >= i_58_ && (i_55_ + 1 ^ 0xffffffff) == (i_56_ ^ 0xffffffff)) {
							return true;
						}
						if ((i_57_ ^ 0xffffffff) == (-i + i_58_ ^ 0xffffffff) && i_55_ >= i_56_ && (i_55_ ^ 0xffffffff) >= (i_62_ ^ 0xffffffff) && (clipMasks[i_61_][i_55_] & 0x2c0108 ^ 0xffffffff) == -1) {
							return true;
						}
						if (1 + i_58_ == i_57_ && (i_55_ ^ 0xffffffff) <= (i_56_ ^ 0xffffffff) && i_62_ >= i_55_ && (clipMasks[i_57_][i_55_] & 0x2c0180 ^ 0xffffffff) == -1) {
							return true;
						}
					} else if ((i_59_ ^ 0xffffffff) == -3) {
						if ((1 + i_58_ ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && i_56_ <= i_55_ && i_55_ <= i_62_) {
							return true;
						}
						if ((i_58_ ^ 0xffffffff) <= (i_57_ ^ 0xffffffff) && i_58_ <= i_61_ && i_56_ == i_55_ + 1 && (clipMasks[i_58_][i_56_] & 0x2c0120 ^ 0xffffffff) == -1) {
							return true;
						}
						if ((i_57_ ^ 0xffffffff) >= (i_58_ ^ 0xffffffff) && (i_61_ ^ 0xffffffff) <= (i_58_ ^ 0xffffffff) && i_55_ - i == i_56_ && (0x2c0102 & clipMasks[i_58_][i_62_] ^ 0xffffffff) == -1) {
							return true;
						}
					} else if ((i_59_ ^ 0xffffffff) == -4) {
						if ((i_58_ ^ 0xffffffff) <= (i_57_ ^ 0xffffffff) && (i_58_ ^ 0xffffffff) >= (i_61_ ^ 0xffffffff) && i_56_ == i_55_ + -i) {
							return true;
						}
						if ((i_57_ ^ 0xffffffff) == (-i + i_58_ ^ 0xffffffff) && i_55_ >= i_56_ && (i_55_ ^ 0xffffffff) >= (i_62_ ^ 0xffffffff) && (clipMasks[i_61_][i_55_] & 0x2c0108) == 0) {
							return true;
						}
						if (i_57_ == 1 + i_58_ && i_56_ <= i_55_ && i_62_ >= i_55_ && (0x2c0180 & clipMasks[i_57_][i_55_]) == 0) {
							return true;
						}
					}
				} else {
					if (-i + i_58_ == i_57_ && (i_55_ ^ 0xffffffff) <= (i_56_ ^ 0xffffffff) && i_55_ <= i_62_) {
						return true;
					}
					if (i_58_ >= i_57_ && (i_61_ ^ 0xffffffff) <= (i_58_ ^ 0xffffffff) && 1 + i_55_ == i_56_ && (clipMasks[i_58_][i_56_] & 0x2c0120) == 0) {
						return true;
					}
					if ((i_58_ ^ 0xffffffff) <= (i_57_ ^ 0xffffffff) && i_61_ >= i_58_ && (i_55_ + -i ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (clipMasks[i_58_][i_62_] & 0x2c0102 ^ 0xffffffff) == -1) {
						return true;
					}
				}
			}
			if (i_54_ == 2) {
				if ((i_59_ ^ 0xffffffff) != -1) {
					if (i_59_ != 1) {
						if (i_59_ == 2) {
							if (i_57_ == i_58_ + -i && i_55_ >= i_56_ && (i_62_ ^ 0xffffffff) <= (i_55_ ^ 0xffffffff) && (0x2c0108 & clipMasks[i_61_][i_55_] ^ 0xffffffff) == -1) {
								return true;
							}
							if (i_58_ >= i_57_ && (i_58_ ^ 0xffffffff) >= (i_61_ ^ 0xffffffff) && (1 + i_55_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (0x2c0120 & clipMasks[i_58_][i_56_] ^ 0xffffffff) == -1) {
								return true;
							}
							if (i_58_ - -1 == i_57_ && i_55_ >= i_56_ && i_62_ >= i_55_) {
								return true;
							}
							if ((i_58_ ^ 0xffffffff) <= (i_57_ ^ 0xffffffff) && (i_61_ ^ 0xffffffff) <= (i_58_ ^ 0xffffffff) && i_56_ == i_55_ + -i) {
								return true;
							}
						} else if ((i_59_ ^ 0xffffffff) == -4) {
							if ((-i + i_58_ ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && (i_55_ ^ 0xffffffff) <= (i_56_ ^ 0xffffffff) && (i_62_ ^ 0xffffffff) <= (i_55_ ^ 0xffffffff)) {
								return true;
							}
							if ((i_57_ ^ 0xffffffff) >= (i_58_ ^ 0xffffffff) && i_61_ >= i_58_ && (i_56_ ^ 0xffffffff) == (1 + i_55_ ^ 0xffffffff) && (0x2c0120 & clipMasks[i_58_][i_56_]) == 0) {
								return true;
							}
							if (i_57_ == i_58_ + 1 && (i_56_ ^ 0xffffffff) >= (i_55_ ^ 0xffffffff) && i_55_ <= i_62_ && (clipMasks[i_57_][i_55_] & 0x2c0180) == 0) {
								return true;
							}
							if (i_57_ <= i_58_ && (i_58_ ^ 0xffffffff) >= (i_61_ ^ 0xffffffff) && (i_56_ ^ 0xffffffff) == (i_55_ - i ^ 0xffffffff)) {
								return true;
							}
						}
					} else {
						if ((i_57_ ^ 0xffffffff) == (-i + i_58_ ^ 0xffffffff) && i_56_ <= i_55_ && i_55_ <= i_62_ && (clipMasks[i_61_][i_55_] & 0x2c0108 ^ 0xffffffff) == -1) {
							return true;
						}
						if (i_58_ >= i_57_ && i_61_ >= i_58_ && (i_56_ ^ 0xffffffff) == (i_55_ + 1 ^ 0xffffffff)) {
							return true;
						}
						if (1 + i_58_ == i_57_ && (i_56_ ^ 0xffffffff) >= (i_55_ ^ 0xffffffff) && i_62_ >= i_55_) {
							return true;
						}
						if ((i_57_ ^ 0xffffffff) >= (i_58_ ^ 0xffffffff) && i_61_ >= i_58_ && (i_55_ + -i ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (clipMasks[i_58_][i_62_] & 0x2c0102) == 0) {
							return true;
						}
					}
				} else {
					if (i_58_ + -i == i_57_ && (i_56_ ^ 0xffffffff) >= (i_55_ ^ 0xffffffff) && (i_55_ ^ 0xffffffff) >= (i_62_ ^ 0xffffffff)) {
						return true;
					}
					if ((i_58_ ^ 0xffffffff) <= (i_57_ ^ 0xffffffff) && i_61_ >= i_58_ && i_56_ == 1 + i_55_) {
						return true;
					}
					if (i_57_ == i_58_ - -1 && i_55_ >= i_56_ && (i_55_ ^ 0xffffffff) >= (i_62_ ^ 0xffffffff) && (clipMasks[i_57_][i_55_] & 0x2c0180 ^ 0xffffffff) == -1) {
						return true;
					}
					if ((i_58_ ^ 0xffffffff) <= (i_57_ ^ 0xffffffff) && i_58_ <= i_61_ && (i_56_ ^ 0xffffffff) == (-i + i_55_ ^ 0xffffffff) && (0x2c0102 & clipMasks[i_58_][i_62_]) == 0) {
						return true;
					}
				}
			}
			if ((i_54_ ^ 0xffffffff) == -10) {
				if (i_57_ <= i_58_ && i_58_ <= i_61_ && (1 + i_55_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (clipMasks[i_58_][i_56_] & 0x2c0120) == 0) {
					return true;
				}
				if (i_58_ >= i_57_ && i_61_ >= i_58_ && -i + i_55_ == i_56_ && (0x2c0102 & clipMasks[i_58_][i_62_] ^ 0xffffffff) == -1) {
					return true;
				}
				if ((i_57_ ^ 0xffffffff) == (-i + i_58_ ^ 0xffffffff) && i_55_ >= i_56_ && (i_62_ ^ 0xffffffff) <= (i_55_ ^ 0xffffffff) && (clipMasks[i_61_][i_55_] & 0x2c0108 ^ 0xffffffff) == -1) {
					return true;
				}
				if (i_58_ - -1 == i_57_ && (i_56_ ^ 0xffffffff) >= (i_55_ ^ 0xffffffff) && i_62_ >= i_55_ && (0x2c0180 & clipMasks[i_57_][i_55_]) == 0) {
					return true;
				}
			}
		} else {
			if (i_54_ == 0) {
				if (i_59_ != 0) {
					if ((i_59_ ^ 0xffffffff) == -2) {
						if ((i_58_ ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && i_55_ - -1 == i_56_) {
							return true;
						}
						if (-1 + i_58_ == i_57_ && (i_56_ ^ 0xffffffff) == (i_55_ ^ 0xffffffff) && (0x2c0108 & clipMasks[i_57_][i_56_]) == 0) {
							return true;
						}
						if ((i_57_ ^ 0xffffffff) == (i_58_ - -1 ^ 0xffffffff) && (i_55_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (clipMasks[i_57_][i_56_] & 0x2c0180 ^ 0xffffffff) == -1) {
							return true;
						}
					} else if (i_59_ == 2) {
						if (i_57_ == i_58_ - -1 && (i_56_ ^ 0xffffffff) == (i_55_ ^ 0xffffffff)) {
							return true;
						}
						if ((i_58_ ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && (i_56_ ^ 0xffffffff) == (1 + i_55_ ^ 0xffffffff) && (0x2c0120 & clipMasks[i_57_][i_56_]) == 0) {
							return true;
						}
						if ((i_58_ ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && -1 + i_55_ == i_56_ && (0x2c0102 & clipMasks[i_57_][i_56_]) == 0) {
							return true;
						}
					} else if ((i_59_ ^ 0xffffffff) == -4) {
						if (i_58_ == i_57_ && i_56_ == -1 + i_55_) {
							return true;
						}
						if ((i_57_ ^ 0xffffffff) == (i_58_ - 1 ^ 0xffffffff) && (i_55_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (clipMasks[i_57_][i_56_] & 0x2c0108) == 0) {
							return true;
						}
						if (i_57_ == i_58_ + 1 && i_55_ == i_56_ && (clipMasks[i_57_][i_56_] & 0x2c0180 ^ 0xffffffff) == -1) {
							return true;
						}
					}
				} else {
					if (i_57_ == i_58_ - 1 && (i_56_ ^ 0xffffffff) == (i_55_ ^ 0xffffffff)) {
						return true;
					}
					if (i_57_ == i_58_ && 1 + i_55_ == i_56_ && (0x2c0120 & clipMasks[i_57_][i_56_]) == 0) {
						return true;
					}
					if (i_58_ == i_57_ && i_56_ == i_55_ - 1 && (0x2c0102 & clipMasks[i_57_][i_56_]) == 0) {
						return true;
					}
				}
			}
			if ((i_54_ ^ 0xffffffff) == -3) {
				if ((i_59_ ^ 0xffffffff) != -1) {
					if ((i_59_ ^ 0xffffffff) != -2) {
						if ((i_59_ ^ 0xffffffff) == -3) {
							if (-1 + i_58_ == i_57_ && (i_55_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (clipMasks[i_57_][i_56_] & 0x2c0108 ^ 0xffffffff) == -1) {
								return true;
							}
							if (i_58_ == i_57_ && (1 + i_55_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (0x2c0120 & clipMasks[i_57_][i_56_] ^ 0xffffffff) == -1) {
								return true;
							}
							if (i_58_ + 1 == i_57_ && i_56_ == i_55_) {
								return true;
							}
							if (i_58_ == i_57_ && i_55_ - 1 == i_56_) {
								return true;
							}
						} else if (i_59_ == 3) {
							if ((i_58_ - 1 ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && i_56_ == i_55_) {
								return true;
							}
							if ((i_57_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff) && i_56_ == i_55_ + 1 && (0x2c0120 & clipMasks[i_57_][i_56_]) == 0) {
								return true;
							}
							if ((i_57_ ^ 0xffffffff) == (1 + i_58_ ^ 0xffffffff) && i_55_ == i_56_ && (clipMasks[i_57_][i_56_] & 0x2c0180 ^ 0xffffffff) == -1) {
								return true;
							}
							if ((i_58_ ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && (-1 + i_55_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff)) {
								return true;
							}
						}
					} else {
						if (i_57_ == i_58_ - 1 && i_56_ == i_55_ && (0x2c0108 & clipMasks[i_57_][i_56_]) == 0) {
							return true;
						}
						if (i_57_ == i_58_ && (i_56_ ^ 0xffffffff) == (i_55_ + 1 ^ 0xffffffff)) {
							return true;
						}
						if (i_57_ == 1 + i_58_ && (i_56_ ^ 0xffffffff) == (i_55_ ^ 0xffffffff)) {
							return true;
						}
						if (i_58_ == i_57_ && i_56_ == -1 + i_55_ && (clipMasks[i_57_][i_56_] & 0x2c0102 ^ 0xffffffff) == -1) {
							return true;
						}
					}
				} else {
					if ((i_57_ ^ 0xffffffff) == (-1 + i_58_ ^ 0xffffffff) && (i_55_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff)) {
						return true;
					}
					if ((i_58_ ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && i_56_ == i_55_ - -1) {
						return true;
					}
					if ((i_57_ ^ 0xffffffff) == (1 + i_58_ ^ 0xffffffff) && i_55_ == i_56_ && (0x2c0180 & clipMasks[i_57_][i_56_]) == 0) {
						return true;
					}
					if ((i_58_ ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && -1 + i_55_ == i_56_ && (0x2c0102 & clipMasks[i_57_][i_56_]) == 0) {
						return true;
					}
				}
			}
			if ((i_54_ ^ 0xffffffff) == -10) {
				if (i_58_ == i_57_ && 1 + i_55_ == i_56_ && (0x20 & clipMasks[i_57_][i_56_]) == 0) {
					return true;
				}
				if ((i_58_ ^ 0xffffffff) == (i_57_ ^ 0xffffffff) && i_55_ + -1 == i_56_ && (clipMasks[i_57_][i_56_] & 0x2) == 0) {
					return true;
				}
				if (-1 + i_58_ == i_57_ && (i_55_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (0x8 & clipMasks[i_57_][i_56_]) == 0) {
					return true;
				}
				if (1 + i_58_ == i_57_ && (i_55_ ^ 0xffffffff) == (i_56_ ^ 0xffffffff) && (clipMasks[i_57_][i_56_] & 0x80 ^ 0xffffffff) == -1) {
					return true;
				}
			}
		}
		return false;
	}
	
	final void method990(int i, int i_63_, int i_64_) {
		if (i_64_ != -17078) {
			aString1148 = null;
		}
		anInt1142++;
		i_63_ -= anInt1139;
		i -= anInt1135;
		clipMasks[i_63_][i] = Node_Sub16.method2590(clipMasks[i_63_][i], 2097152);
	}
	
	final void method991(int i) {
		anInt1143++;
		for (int i_65_ = 0; (anInt1133 ^ 0xffffffff) < (i_65_ ^ 0xffffffff); i_65_++) {
			for (int i_66_ = 0; (anInt1146 ^ 0xffffffff) < (i_66_ ^ 0xffffffff); i_66_++) {
				if (i_65_ != 0 && i_66_ != 0 && (i_65_ ^ 0xffffffff) > (-5 + anInt1133 ^ 0xffffffff) && anInt1146 - 5 > i_66_) {
					clipMasks[i_65_][i_66_] = 2097152;
				} else {
					clipMasks[i_65_][i_66_] = -1;
				}
			}
		}
		if (i >= -86) {
			method988(-4, -128, 38, 51, 96, -103, 64, 8, -26);
		}
	}
	
	final void method992(boolean bool, boolean bool_67_, byte b, int i, int i_68_, int i_69_, int i_70_, int i_71_) {
		anInt1134++;
		int i_72_ = 256;
		if (bool) {
			i_72_ |= 0x20000;
		}
		i_71_ -= anInt1135;
		i -= anInt1139;
		if ((i_70_ ^ 0xffffffff) == -2 || i_70_ == 3) {
			int i_73_ = i_68_;
			i_68_ = i_69_;
			i_69_ = i_73_;
		}
		if (bool_67_) {
			i_72_ |= 0x40000000;
		}
		int i_74_ = i;
		for (/**/; i_74_ < i_68_ + i; i_74_++) {
			if (i_74_ >= 0 && anInt1133 > i_74_) {
				for (int i_76_ = i_71_; i_71_ - -i_69_ > i_76_; i_76_++) {
					if ((i_76_ ^ 0xffffffff) <= -1 && (i_76_ ^ 0xffffffff) > (anInt1146 ^ 0xffffffff)) {
						method983(i_76_, i_72_, i_74_, true);
					}
				}
			}
		}
	}
	
	final void method993(int i, int i_77_, int i_78_) {
		if (i_78_ > -109) {
			anIntArray1147 = null;
		}
		i -= anInt1135;
		anInt1137++;
		i_77_ -= anInt1139;
		clipMasks[i_77_][i] = Node_Sub30.method2723(clipMasks[i_77_][i], -2097153);
	}
	
	final void method994(int i, int i_79_, int i_80_) {
		anInt1141++;
		i_79_ -= anInt1139;
		i -= anInt1135;
		clipMasks[i_79_][i] = Node_Sub16.method2590(clipMasks[i_79_][i], 262144);
	}
	
	private final void method995(int i, int i_82_, int i_83_, int i_84_) {
		clipMasks[i][i_82_] = Node_Sub16.method2590(clipMasks[i][i_82_], i_83_);
		anInt1131++;
	}
	
	final void method996(int i, int i_86_, int i_87_, int i_88_, boolean bool, int i_89_, boolean bool_90_) {
		anInt1151++;
		int i_91_ = 256;
		if (bool_90_) {
			i_91_ |= 0x20000;
		}
		if (bool) {
			i_91_ |= 0x40000000;
		}
		i_88_ -= anInt1135;
		if (i_87_ == 1) {
			i -= anInt1139;
			for (int i_92_ = i; (i_92_ ^ 0xffffffff) > (i + i_89_ ^ 0xffffffff); i_92_++) {
				if ((i_92_ ^ 0xffffffff) <= -1 && (anInt1133 ^ 0xffffffff) < (i_92_ ^ 0xffffffff)) {
					for (int i_93_ = i_88_; (i_86_ + i_88_ ^ 0xffffffff) < (i_93_ ^ 0xffffffff); i_93_++) {
						if (i_93_ >= 0 && (anInt1146 ^ 0xffffffff) < (i_93_ ^ 0xffffffff)) {
							method995(i_92_, i_93_, i_91_, i_87_ ^ ~0x63);
						}
					}
				}
			}
		}
	}
	
	final void method997(int i, boolean bool, int i_94_) {
		if (bool != true) {
			method989(-11, -28, 10, -29, 59, 57, 109, 80);
		}
		i -= anInt1135;
		i_94_ -= anInt1139;
		anInt1149++;
		clipMasks[i_94_][i] = Node_Sub30.method2723(clipMasks[i_94_][i], -262145);
	}
	
	Class84() {
		/* empty */
	}
	
	static {
		anIntArray1147 = new int[2];
	}
}
