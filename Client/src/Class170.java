/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class170
{
	protected int anInt2047;
	static int anInt2048;
	static int anInt2049;
	static int anInt2050;
	static OutcommingPacket aClass318_2051 = new OutcommingPacket(64, 8);
	static int anInt2052;
	static int anInt2053;
	static int[] anIntArray2054;
	static int anInt2055;
	static int anInt2056 = 0;
	
	static final void method1788() {
		for (int i = Class320_Sub12.anInt8327; i < Class159.anInt1995; i++) {
			for (int i_0_ = 0; i_0_ < Class328.anInt4115; i_0_++) {
				for (int i_1_ = 0; i_1_ < Node_Sub50.anInt7623; i_1_++) {
					Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_0_][i_1_];
					if (class261 != null) {
						Animable_Sub2 animable_sub2 = class261.anAnimable_Sub2_3314;
						Animable_Sub2 animable_sub2_2_ = class261.anAnimable_Sub2_3308;
						if (animable_sub2 != null && animable_sub2.method821(0)) {
							Class336_Sub3.method3901(animable_sub2, i, i_0_, i_1_, 1, 1);
							if (animable_sub2_2_ != null && animable_sub2_2_.method821(0)) {
								Class336_Sub3.method3901(animable_sub2_2_, i, i_0_, i_1_, 1, 1);
								animable_sub2_2_.method816(0, false, CacheNode_Sub18.aGraphicsToolkit9607, 0, (byte) 126, 0, animable_sub2);
								animable_sub2_2_.method811(27811);
							}
							animable_sub2.method811(27811);
						}
						for (Class256 class256 = class261.aClass256_3312; class256 != null; class256 = class256.aClass256_3238) {
							Mobile mobile = class256.aMobile3239;
							if (mobile != null && mobile.method821(0)) {
								Class336_Sub3.method3901(mobile, i, i_0_, i_1_, mobile.aShort9130 - mobile.aShort9119 + 1, mobile.aShort9124 - mobile.aShort9120 + 1);
								mobile.method811(27811);
							}
						}
						Animable_Sub1 animable_sub1 = class261.anAnimable_Sub1_3317;
						if (animable_sub1 != null && animable_sub1.method821(0)) {
							Class134_Sub3.method1583(animable_sub1, i, i_0_, i_1_);
							animable_sub1.method811(27811);
						}
					}
				}
			}
		}
	}
	
	Class170(int i, int i_3_) {
		anInt2047 = i_3_;
	}
	
	static final void method1789(int i) {
		anInt2050++;
		int i_4_ = 0;
		if (Class213.aNode_Sub27_2512 != null) {
			i_4_ = Class213.aNode_Sub27_2512.aClass320_Sub18_7303.method3749(false);
		}
		if (i >= -4) {
			anInt2056 = 0;
		}
		if (i_4_ == 2) {
			int i_5_ = (Class36.anInt542 ^ 0xffffffff) >= -801 ? Class36.anInt542 : 800;
			Class270_Sub1.anInt8033 = (-i_5_ + Class36.anInt542) / 2;
			Class360.screenWidth = i_5_;
			int i_6_ = CacheNode_Sub3.anInt9441 <= 600 ? CacheNode_Sub3.anInt9441 : 600;
			Class131.anInt5447 = 0;
			Class205.screenHeight = i_6_;
		} else if (i_4_ != 1) {
			Class131.anInt5447 = 0;
			Class205.screenHeight = CacheNode_Sub3.anInt9441;
			Class360.screenWidth = Class36.anInt542;
			Class270_Sub1.anInt8033 = 0;
		} else {
			int i_7_ = Class36.anInt542 <= 1024 ? Class36.anInt542 : 1024;
			Class360.screenWidth = i_7_;
			int i_8_ = (CacheNode_Sub3.anInt9441 ^ 0xffffffff) >= -769 ? CacheNode_Sub3.anInt9441 : 768;
			Class270_Sub1.anInt8033 = (Class36.anInt542 - i_7_) / 2;
			Class205.screenHeight = i_8_;
			Class131.anInt5447 = 0;
		}
	}
	
	static final int method1790(int i, int i_9_, byte b, int i_10_, int i_11_, int i_12_) {
		anInt2049++;
		if (b < 107) {
			method1791((byte) 40);
		}
		if (Class320_Sub10.aPlaneArray8300 == null) {
			return 0;
		}
		if ((i_9_ ^ 0xffffffff) > -4) {
			int i_13_ = i_12_ >> 9;
			int i_14_ = i >> 9;
			if (i_10_ < 0 || i_11_ < 0 || Node_Sub54.GAME_SCENE_WDITH + -1 < i_10_ || (-1 + Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff) > (i_11_ ^ 0xffffffff)) {
				return 0;
			}
			if (i_13_ < 1 || (i_14_ ^ 0xffffffff) > -2 || (i_13_ ^ 0xffffffff) < (Node_Sub54.GAME_SCENE_WDITH + -1 ^ 0xffffffff) || i_14_ > -1 + Class377_Sub1.GAME_SCENE_HEIGHT) {
				return 0;
			}
			boolean bool = (CacheNode_Sub11.aByteArrayArrayArray9550[1][i_12_ >> 9][i >> 9] & 0x2 ^ 0xffffffff) != -1;
			if ((0x1ff & i_12_) == 0) {
				boolean bool_15_ = (0x2 & CacheNode_Sub11.aByteArrayArrayArray9550[1][-1 + i_13_][i >> 9] ^ 0xffffffff) != -1;
				boolean bool_16_ = (CacheNode_Sub11.aByteArrayArrayArray9550[1][i_13_][i >> 9] & 0x2) != 0;
				if (bool_15_ == !bool_16_) {
					bool = (0x2 & CacheNode_Sub11.aByteArrayArrayArray9550[1][i_10_][i_11_]) != 0;
				}
			}
			if ((0x1ff & i ^ 0xffffffff) == -1) {
				boolean bool_17_ = (0x2 & CacheNode_Sub11.aByteArrayArrayArray9550[1][i_12_ >> 9][i_14_ + -1] ^ 0xffffffff) != -1;
				boolean bool_18_ = (CacheNode_Sub11.aByteArrayArrayArray9550[1][i_12_ >> 9][i_14_] & 0x2) != 0;
				if (!bool_18_ != !bool_17_) {
					bool = (0x2 & CacheNode_Sub11.aByteArrayArrayArray9550[1][i_10_][i_11_]) != 0;
				}
			}
			if (bool) {
				i_9_++;
			}
		}
		return Class320_Sub10.aPlaneArray8300[i_9_].method3260(i, -119, i_12_);
	}
	
	public final String toString() {
		anInt2048++;
		throw new IllegalStateException();
	}
	
	public static void method1791(byte b) {
		aClass318_2051 = null;
		anIntArray2054 = null;
		@SuppressWarnings("unused")
		int i = -10 / ((b - -71) / 54);
	}
}
