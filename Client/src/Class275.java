/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class275 implements Interface17
{
	static int anInt5412;
	static int anInt5413;
	static int anInt5414;
	static int anInt5415;
	static int anInt5416;
	protected int[] CONFIG_VALUES;
	static int anInt5418;
	static Class312 aClass312_5419 = new Class312();
	private HashTable aHashTable5420 = new HashTable(128);
	private int[] anIntArray5421 = new int[Class188_Sub2_Sub1.aClass229_9354.anInt2723];
	static int anInt5422;
	static int anInt5423;
	static int anInt5424;
	static int anInt5425;
	static int anInt5426;
	
	final void method3328(int i, int i_0_, int i_1_) {
		anInt5426++;
		if (i > -18) {
			anIntArray5421 = null;
		}
		CONFIG_VALUES[i_0_] = i_1_;
		Node_Sub44 node_sub44 = (Node_Sub44) aHashTable5420.method1518(3512, (long) i_0_);
		if (node_sub44 != null) {
			node_sub44.aLong7550 = Class313.method3650(false) + 500L;
		} else {
			node_sub44 = new Node_Sub44(500L + Class313.method3650(false));
			aHashTable5420.method1515((long) i_0_, node_sub44, -124);
		}
	}
	
	public final int method64(int i, byte b) {
		anInt5413++;
		ConfigDefinitions class70 = IOException_Sub1.aClass128_85.getConfigDefinitions(i);
		int i_2_ = class70.anInt950;
		if (b != -42) {
			aHashTable5420 = null;
		}
		int i_3_ = class70.anInt946;
		int i_4_ = class70.anInt948;
		int i_5_ = Class141.anIntArray1750[-i_3_ + i_4_];
		return CONFIG_VALUES[i_2_] >> i_3_ & i_5_;
	}
	
	final void method3329(byte b) {
		anInt5425++;
		for (int i = 0; Class188_Sub2_Sub1.aClass229_9354.anInt2723 > i; i++) {
			Class293 class293 = Class188_Sub2_Sub1.aClass229_9354.method2123(16, i);
			if (class293 != null && class293.anInt3682 == 0) {
				anIntArray5421[i] = 0;
				CONFIG_VALUES[i] = 0;
			}
		}
		if (b == -114) {
			aHashTable5420 = new HashTable(128);
		}
	}
	
	final void method3330(byte b, int i, int i_6_) {
		if (b == 38) {
			anInt5423++;
			ConfigDefinitions class70 = IOException_Sub1.aClass128_85.getConfigDefinitions(i_6_);
			int i_7_ = class70.anInt950;
			int i_8_ = class70.anInt946;
			int i_9_ = class70.anInt948;
			int i_10_ = Class141.anIntArray1750[-i_8_ + i_9_];
			if ((i ^ 0xffffffff) > -1 || (i_10_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
				i = 0;
			}
			i_10_ <<= i_8_;
			method3328(-45, i_7_, (i_10_ ^ 0xffffffff) & CONFIG_VALUES[i_7_] | i_10_ & i << i_8_);
		}
	}
	
	public final int method65(int value, int i_11_) {
		return CONFIG_VALUES[value];
	}
	
	public static void method3331(int i) {
		if (i != -1) {
			aClass312_5419 = null;
		}
		aClass312_5419 = null;
	}
	//routeType
	//-1 follow
	//-4 walk
	static final int calculateRoute(int startX, int startY, int toX, int toY, int size, int routeType, boolean alternativeRoute, int targetSizeX, int targetSizeY, int i_14_, int i_22_, Class84 planeClipData, int[] calculatedPositionXsArray, int[] calculatedPositionYsArray, byte junk) {
		anInt5418++;
		for (int i_23_ = 0; i_23_ < 128; i_23_++) {
			for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -129; i_24_++) {
				Node_Sub36_Sub2.anIntArrayArray10047[i_23_][i_24_] = 0;
				Class262_Sub23.anIntArrayArray7892[i_23_][i_24_] = 99999999;
			}
		}
		boolean bool_25_;
		if (size == 1) {
			bool_25_ = Class200_Sub1.method2015(targetSizeX, targetSizeY, routeType, planeClipData, startX, 11564, startY, toX, toY, i_22_, i_14_);
		} else if (size == 2) {
			bool_25_ = Node_Sub16.method2593(i_14_, startX, targetSizeY, toX, i_22_, routeType, targetSizeX, toY, false, startY, planeClipData);
		} else {
			bool_25_ = Node_Sub38_Sub20.method2856(i_22_, planeClipData, startX, targetSizeX, routeType, startY, i_14_, toX, toY, size, -1, targetSizeY);
		}
		int i_26_ = startX + -64;
		int i_27_ = -64 + startY;
		int i_28_ = Class315.anInt4033;
		int i_29_ = Class219.anInt2623;
		if (!bool_25_) {
			if (!alternativeRoute) {
				return -1;
			}
			int i_30_ = 2147483647;
			int i_31_ = 2147483647;
			int i_32_ = 10;
			for (int i_33_ = toX - i_32_; toX - -i_32_ >= i_33_; i_33_++) {
				for (int i_34_ = toY + -i_32_; i_34_ <= i_32_ + toY; i_34_++) {
					int i_35_ = i_33_ + -i_26_;
					int i_36_ = -i_27_ + i_34_;
					if (i_35_ >= 0 && (i_36_ ^ 0xffffffff) <= -1 && i_35_ < 128 && (i_36_ ^ 0xffffffff) > -129 && Class262_Sub23.anIntArrayArray7892[i_35_][i_36_] < 100) {
						int i_37_ = 0;
						if ((i_33_ ^ 0xffffffff) <= (toX ^ 0xffffffff)) {
							if (-1 + (toX - -targetSizeX) < i_33_) {
								i_37_ = -toX + -targetSizeX - (-1 - i_33_);
							}
						} else {
							i_37_ = -i_33_ + toX;
						}
						int i_38_ = 0;
						if ((i_34_ ^ 0xffffffff) > (toY ^ 0xffffffff)) {
							i_38_ = toY + -i_34_;
						} else if (targetSizeY + toY + -1 < i_34_) {
							i_38_ = 1 - (targetSizeY + (toY - i_34_));
						}
						int i_39_ = i_37_ * i_37_ - -(i_38_ * i_38_);
						if (i_39_ < i_30_ || (i_39_ ^ 0xffffffff) == (i_30_ ^ 0xffffffff) && (i_31_ ^ 0xffffffff) < (Class262_Sub23.anIntArrayArray7892[i_35_][i_36_] ^ 0xffffffff)) {
							i_29_ = i_34_;
							i_28_ = i_33_;
							i_30_ = i_39_;
							i_31_ = Class262_Sub23.anIntArrayArray7892[i_35_][i_36_];
						}
					}
				}
			}
			if ((i_30_ ^ 0xffffffff) == -2147483648) {
				return -1;
			}
		}
		if ((startX ^ 0xffffffff) == (i_28_ ^ 0xffffffff) && (i_29_ ^ 0xffffffff) == (startY ^ 0xffffffff)) {
			return 0;
		}
		int i_40_ = 0;
		Node_Sub39.routeFinderXArray[i_40_] = i_28_;
		Class339_Sub6.routeFinderYArray[i_40_++] = i_29_;
		int i_42_;
		int i_41_ = i_42_ = Node_Sub36_Sub2.anIntArrayArray10047[-i_26_ + i_28_][-i_27_ + i_29_];
		while (i_28_ != startX || startY != i_29_) {
			if (i_41_ != i_42_) {
				i_42_ = i_41_;
				Node_Sub39.routeFinderXArray[i_40_] = i_28_;
				Class339_Sub6.routeFinderYArray[i_40_++] = i_29_;
			}
			if ((0x2 & i_41_ ^ 0xffffffff) != -1) {
				i_28_++;
			} else if ((0x8 & i_41_ ^ 0xffffffff) != -1) {
				i_28_--;
			}
			if ((i_41_ & 0x1 ^ 0xffffffff) == -1) {
				if ((i_41_ & 0x4) != 0) {
					i_29_--;
				}
			} else {
				i_29_++;
			}
			i_41_ = Node_Sub36_Sub2.anIntArrayArray10047[i_28_ - i_26_][i_29_ + -i_27_];
		}
		if (junk != -41) {
			aClass312_5419 = null;
		}
		int i_43_ = 0;
		while (i_40_-- > 0) {
			calculatedPositionXsArray[i_43_] = Node_Sub39.routeFinderXArray[i_40_];
			calculatedPositionYsArray[i_43_++] = Class339_Sub6.routeFinderYArray[i_40_];
			if ((i_43_ ^ 0xffffffff) <= (calculatedPositionXsArray.length ^ 0xffffffff)) {
				break;
			}
		}
		return i_43_;
	}
	
	final void method3333(int i, int i_44_, int i_45_) {
		anInt5422++;
		ConfigDefinitions class70 = IOException_Sub1.aClass128_85.getConfigDefinitions(i_44_);
		int i_46_ = class70.anInt950;
		int i_47_ = class70.anInt946;
		int i_48_ = class70.anInt948;
		if (i_45_ != -1) {
			anInt5412 = -83;
		}
		int i_49_ = Class141.anIntArray1750[-i_47_ + i_48_];
		if (i < 0 || i > i_49_) {
			i = 0;
		}
		i_49_ <<= i_47_;
		method3335((byte) -97, i_46_, i << i_47_ & i_49_ | anIntArray5421[i_46_] & (i_49_ ^ 0xffffffff));
	}
	
	final int method3334(int i, boolean bool) {
		anInt5424++;
		long l = Class313.method3650(false);
		Node_Sub44 node_sub44 = !bool ? (Node_Sub44) aHashTable5420.method1520(95) : (Node_Sub44) aHashTable5420.method1516(false);
		for (/**/; node_sub44 != null; node_sub44 = (Node_Sub44) aHashTable5420.method1520(100)) {
			if ((0x3fffffffffffffffL & node_sub44.aLong7550) < l) {
				if ((0x4000000000000000L & node_sub44.aLong7550) != 0L) {
					int i_51_ = (int) node_sub44.aLong2797;
					CONFIG_VALUES[i_51_] = anIntArray5421[i_51_];
					node_sub44.method2160((byte) 95);
					return i_51_;
				}
				node_sub44.method2160((byte) 115);
			}
		}
		return -1;
	}
	
	final void method3335(byte b, int i, int i_52_) {
		anInt5415++;
		anIntArray5421[i] = i_52_;
		Node_Sub44 node_sub44 = (Node_Sub44) aHashTable5420.method1518(3512, (long) i);
		if (node_sub44 == null) {
			node_sub44 = new Node_Sub44(4611686018427387905L);
			aHashTable5420.method1515((long) i, node_sub44, -126);
		} else if (node_sub44.aLong7550 != 4611686018427387905L) {
			node_sub44.aLong7550 = Class313.method3650(false) - -500L | 0x4000000000000000L;
		}
	}
	
	public Class275() {
		CONFIG_VALUES = new int[Class188_Sub2_Sub1.aClass229_9354.anInt2723];
	}
	
	static final int method3336(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_) {
		anInt5416++;
		if ((0x1 & i_56_ ^ 0xffffffff) == -2) {
			int i_60_ = i_57_;
			i_57_ = i_55_;
			i_55_ = i_60_;
		}
		i &= 0x3;
		if (i == 0) {
			return i_54_;
		}
		if (i == 1) {
			return 1 - (i_57_ - 7) - i_58_;
		}
		if (i == 2) {
			return -i_55_ + 1 + -i_54_ + 7;
		}
		return i_58_;
	}
}
