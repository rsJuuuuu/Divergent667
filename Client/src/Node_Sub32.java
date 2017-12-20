/* Node_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub32 extends Node
{
	static IncommingPacket aClass192_7376 = new IncommingPacket(58, 6);
	static boolean aBoolean7377;
	static String aString7378;
	static boolean aBoolean7379 = false;
	static int cachedNPCcsCount = 0;
	protected int anInt7381;
	static long aLong7382;
	static int anInt7383;
	static int anInt7384;
	static long aLong7385;
	
	static final void method2729(boolean bool) {
		anInt7384++;
		for (int i = 0; (NpcDefinition.anInt2885 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			GLXToolkit.aClass54Array9292[i] = null;
		NpcDefinition.anInt2885 = 0;
		for (int i = 0; i < Class159.anInt1995; i++) {
			for (int i_0_ = 0; Class328.anInt4115 > i_0_; i_0_++) {
				for (int i_1_ = 0; i_1_ < Node_Sub50.anInt7623; i_1_++) {
					Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_1_][i_0_];
					if (class261 != null) {
						if (class261.aShort3313 > 0) {
							class261.aShort3313 *= -1;
						}
						if ((class261.aShort3318 ^ 0xffffffff) < -1) {
							class261.aShort3318 *= -1;
						}
					}
				}
			}
		}
		for (int i = 0; Class159.anInt1995 > i; i++) {
			for (int i_2_ = 0; Class328.anInt4115 > i_2_; i_2_++) {
				for (int i_3_ = 0; (Node_Sub50.anInt7623 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
					Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_3_][i_2_];
					if (class261 != null) {
						boolean bool_4_ = Class175.aClass261ArrayArrayArray2099[0][i_3_][i_2_] != null && Class175.aClass261ArrayArrayArray2099[0][i_3_][i_2_].aClass261_3310 != null;
						if ((class261.aShort3318 ^ 0xffffffff) > -1) {
							int i_5_ = i_2_;
							int i_6_ = i_2_;
							int i_7_ = i;
							int i_8_ = i;
							Class261 class261_9_ = Class175.aClass261ArrayArrayArray2099[i][i_3_][i_5_ - 1];
							int i_10_ = Node_Sub38_Sub37.aPlaneArray10466[i].method3251(i_2_, i_3_, (byte) -118);
							for (/**/; (i_5_ ^ 0xffffffff) < -1 && class261_9_ != null && class261_9_.aShort3318 < 0 && class261.aShort3318 == class261_9_.aShort3318 && (class261.aShort3322 ^ 0xffffffff) == (class261_9_.aShort3322 ^ 0xffffffff); class261_9_ = Class175.aClass261ArrayArrayArray2099[i][i_3_][-1 + i_5_]) {
								if ((Node_Sub38_Sub37.aPlaneArray10466[i].method3251(i_5_ - 1, i_3_, (byte) -118) ^ 0xffffffff) != (i_10_ ^ 0xffffffff)) {
									break;
								}
								if (i_5_ - 1 > 0 && i_10_ != Node_Sub38_Sub37.aPlaneArray10466[i].method3251(i_5_ + -2, i_3_, (byte) -118)) {
									break;
								}
								i_5_--;
							}
							for (class261_9_ = Class175.aClass261ArrayArrayArray2099[i][i_3_][i_6_ - -1]; Node_Sub50.anInt7623 > i_6_ && class261_9_ != null && class261_9_.aShort3318 < 0 && class261.aShort3318 == class261_9_.aShort3318 && class261.aShort3322 == class261_9_.aShort3322; class261_9_ = Class175.aClass261ArrayArrayArray2099[i][i_3_][1 + i_6_]) {
								if (i_10_ != Node_Sub38_Sub37.aPlaneArray10466[i].method3251(i_6_ + 1, i_3_, (byte) -118)) {
									break;
								}
								if (Node_Sub50.anInt7623 > i_6_ + 1 && (i_10_ ^ 0xffffffff) != (Node_Sub38_Sub37.aPlaneArray10466[i].method3251(2 + i_6_, i_3_, (byte) -118) ^ 0xffffffff)) {
									break;
								}
								i_6_++;
							}
							int i_11_ = i_8_ - i_7_ - -1;
							int i_12_ = Node_Sub38_Sub37.aPlaneArray10466[bool_4_ ? 1 + i_7_ : i_7_].method3251(i_5_, i_3_, (byte) -118);
							int i_13_ = i_12_ + class261.aShort3318 * i_11_;
							int i_14_ = Node_Sub38_Sub37.aPlaneArray10466[!bool_4_ ? i_7_ : i_7_ - -1].method3251(1 + i_6_, i_3_, (byte) -118);
							int i_15_ = i_14_ - -(class261.aShort3318 * i_11_);
							int i_16_ = i_3_ << Class36.anInt549;
							int i_17_ = i_5_ << Class36.anInt549;
							int i_18_ = (i_6_ << Class36.anInt549) + Class179.anInt2129;
							GLXToolkit.aClass54Array9292[NpcDefinition.anInt2885++] = new Class54(1, i_8_, class261.aShort3322 + i_16_, i_16_ - -class261.aShort3322, class261.aShort3322 + i_16_, class261.aShort3322 + i_16_, i_12_, i_14_, i_15_, i_13_, i_17_, i_18_, i_18_, i_17_);
							for (int i_19_ = i_7_; (i_8_ ^ 0xffffffff) <= (i_19_ ^ 0xffffffff); i_19_++) {
								for (int i_20_ = i_5_; (i_6_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff); i_20_++)
									Class175.aClass261ArrayArrayArray2099[i_19_][i_3_][i_20_].aShort3318 *= -1;
							}
						}
						if (class261.aShort3313 < 0) {
							int i_21_ = i_3_;
							int i_22_ = i_3_;
							int i_23_ = i;
							int i_24_ = i;
							Class261 class261_25_ = Class175.aClass261ArrayArrayArray2099[i][-1 + i_21_][i_2_];
							int i_26_ = Node_Sub38_Sub37.aPlaneArray10466[i].method3251(i_2_, i_3_, (byte) -118);
							for (/**/; i_21_ > 0 && class261_25_ != null && class261_25_.aShort3313 < 0 && class261_25_.aShort3313 == class261.aShort3313 && class261_25_.aShort3320 == class261.aShort3320; class261_25_ = Class175.aClass261ArrayArrayArray2099[i][i_21_ - 1][i_2_]) {
								if (i_26_ != Node_Sub38_Sub37.aPlaneArray10466[i].method3251(i_2_, -1 + i_21_, (byte) -118)) {
									break;
								}
								if (-1 + i_21_ > 0 && (i_26_ ^ 0xffffffff) != (Node_Sub38_Sub37.aPlaneArray10466[i].method3251(i_2_, i_21_ + -2, (byte) -118) ^ 0xffffffff)) {
									break;
								}
								i_21_--;
							}
							for (class261_25_ = Class175.aClass261ArrayArrayArray2099[i][1 + i_22_][i_2_]; i_22_ < Class328.anInt4115 && class261_25_ != null && class261_25_.aShort3313 < 0 && (class261.aShort3313 ^ 0xffffffff) == (class261_25_.aShort3313 ^ 0xffffffff) && class261.aShort3320 == class261_25_.aShort3320; class261_25_ = Class175.aClass261ArrayArrayArray2099[i][1 + i_22_][i_2_]) {
								if ((Node_Sub38_Sub37.aPlaneArray10466[i].method3251(i_2_, 1 + i_22_, (byte) -118) ^ 0xffffffff) != (i_26_ ^ 0xffffffff)) {
									break;
								}
								if (1 + i_22_ < Class328.anInt4115 && (i_26_ ^ 0xffffffff) != (Node_Sub38_Sub37.aPlaneArray10466[i].method3251(i_2_, i_22_ + 2, (byte) -118) ^ 0xffffffff)) {
									break;
								}
								i_22_++;
							}
							int i_27_ = 1 + i_24_ + -i_23_;
							int i_28_ = Node_Sub38_Sub37.aPlaneArray10466[bool_4_ ? 1 + i_23_ : i_23_].method3251(i_2_, i_21_, (byte) -118);
							int i_29_ = i_27_ * class261.aShort3313 + i_28_;
							int i_30_ = Node_Sub38_Sub37.aPlaneArray10466[bool_4_ ? 1 + i_23_ : i_23_].method3251(i_2_, 1 + i_22_, (byte) -118);
							int i_31_ = class261.aShort3313 * i_27_ + i_30_;
							int i_32_ = i_21_ << Class36.anInt549;
							int i_33_ = Class179.anInt2129 + (i_22_ << Class36.anInt549);
							int i_34_ = i_2_ << Class36.anInt549;
							GLXToolkit.aClass54Array9292[NpcDefinition.anInt2885++] = new Class54(2, i_24_, i_32_, i_33_, i_33_, i_32_, i_28_, i_30_, i_31_, i_29_, i_34_ + class261.aShort3320, class261.aShort3320 + i_34_, class261.aShort3320 + i_34_, class261.aShort3320 + i_34_);
							for (int i_35_ = i_23_; (i_24_ ^ 0xffffffff) <= (i_35_ ^ 0xffffffff); i_35_++) {
								for (int i_36_ = i_21_; i_22_ >= i_36_; i_36_++)
									Class175.aClass261ArrayArrayArray2099[i_35_][i_36_][i_2_].aShort3313 *= -1;
							}
						}
					}
				}
			}
		}
		Class239.aBoolean2930 = bool;
	}
	
	public static void method2730(int i) {
		aString7378 = null;
		if (i > -76) {
			method2731(true, 82, -55L, -127, 90, null, 19, false, 52, null, 60L, (byte) 71, true);
		}
		aClass192_7376 = null;
	}
	
	static final void method2731(boolean bool, int i, long l, int i_37_, int i_38_, String string, int i_39_, boolean bool_40_, int i_41_, String string_42_, long l_43_, byte b, boolean bool_44_) {
		anInt7383++;
		if (!Class213.aBoolean2510 && Class315.anInt4035 < 500) {
			i_41_ = i_41_ != -1 ? i_41_ : Class239.anInt2928;
			CacheNode_Sub13 cachenode_sub13 = new CacheNode_Sub13(string, string_42_, i_41_, i_39_, i, l, i_37_, i_38_, bool_40_, bool, l_43_, bool_44_);
			Client.method114((byte) -109, cachenode_sub13);
			if (b != -18) {
				aString7378 = null;
			}
		}
	}
	
	public Node_Sub32() {
		/* empty */
	}
	
	Node_Sub32(int i) {
		anInt7381 = i;
	}
	
	static {
		aBoolean7377 = false;
		aLong7385 = 0L;
	}
}
