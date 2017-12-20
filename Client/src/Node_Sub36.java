/* Node_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub36 extends Node
{
	static int anInt7422;
	static int anInt7423;
	static int anInt7424;
	static int anInt7425;
	static int anInt7426;
	static int anInt7427;
	static IncommingPacket aClass192_7428 = new IncommingPacket(77, -2);
	static Animable[] anAnimableArray7429;
	
	static final void method2750(boolean bool, int i, int i_0_, int i_1_) {
		anInt7422++;
		int i_2_ = i_1_ - -Node_Sub53.gameSceneBaseX;
		int i_3_ = Class320_Sub4.gameSceneBaseY + i_0_;
		if (Class175.aClass261ArrayArrayArray2099 != null && (i_1_ ^ 0xffffffff) <= -1 && (i_0_ ^ 0xffffffff) <= -1 && i_1_ < Node_Sub54.GAME_SCENE_WDITH && Class377_Sub1.GAME_SCENE_HEIGHT > i_0_ && ((Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(bool) ^ 0xffffffff) != -1 || i == Class295.myPlayer.plane)) {
			long l = (long) (i_3_ << 14 | i << 28 | i_2_);
			Node_Sub11 node_sub11 = (Node_Sub11) Class266.aHashTable3380.method1518(3512, l);
			if (node_sub11 == null) {
				Class262_Sub22.method3211(i, i_1_, i_0_);
			} else {
				Node_Sub8 node_sub8 = (Node_Sub8) node_sub11.aClass312_7104.method3613(65280);
				if (node_sub8 == null) {
					Class262_Sub22.method3211(i, i_1_, i_0_);
				} else {
					Animable_Sub3_Sub1 animable_sub3_sub1 = (Animable_Sub3_Sub1) Class262_Sub22.method3211(i, i_1_, i_0_);
					if (animable_sub3_sub1 != null) {
						animable_sub3_sub1.anInt11010 = animable_sub3_sub1.anInt11007 = -1;
					} else {
						animable_sub3_sub1 = new Animable_Sub3_Sub1(i_1_ << 9, Class320_Sub10.aPlaneArray8300[i].method3251(i_0_, i_1_, (byte) -118), i_0_ << 9, i, i);
					}
					animable_sub3_sub1.anInt11003 = node_sub8.anInt7067;
					animable_sub3_sub1.anInt10996 = node_sub8.anInt7065;
				while_204_:
					do {
						Node_Sub8 node_sub8_4_;
						do {
							node_sub8_4_ = (Node_Sub8) node_sub11.aClass312_7104.method3620(16776960);
							if (node_sub8_4_ == null) {
								break while_204_;
							}
						} while (node_sub8_4_.anInt7065 == animable_sub3_sub1.anInt10996);
						animable_sub3_sub1.anInt11005 = node_sub8_4_.anInt7067;
						animable_sub3_sub1.anInt11010 = node_sub8_4_.anInt7065;
						for (;;) {
							Node_Sub8 node_sub8_5_ = (Node_Sub8) node_sub11.aClass312_7104.method3620(16776960);
							if (node_sub8_5_ == null) {
								break;
							}
							if (animable_sub3_sub1.anInt10996 != node_sub8_5_.anInt7065 && node_sub8_5_.anInt7065 != animable_sub3_sub1.anInt11010) {
								animable_sub3_sub1.anInt11001 = node_sub8_5_.anInt7067;
								animable_sub3_sub1.anInt11007 = node_sub8_5_.anInt7065;
							}
						}
					} while (false);
					int i_6_ = Node_Sub38_Sub7.method2809(i, -29754, 256 + (i_0_ << 9), (i_1_ << 9) - -256);
					animable_sub3_sub1.plane = (byte) i;
					animable_sub3_sub1.anInt5937 = i_6_;
					animable_sub3_sub1.aByte5931 = (byte) i;
					animable_sub3_sub1.anInt5940 = i_0_ << 9;
					animable_sub3_sub1.anInt11019 = 0;
					animable_sub3_sub1.anInt5934 = i_1_ << 9;
					if (Class238.method3021(i_0_, i_1_, 94)) {
						animable_sub3_sub1.aByte5931++;
					}
					StandardDrawableModel.method704(i, i_1_, i_0_, i_6_, animable_sub3_sub1);
				}
			}
		}
	}
	
	abstract void method2751(Node_Sub43 node_sub43, int i);
	
	static final void method2752(boolean bool, boolean bool_7_) {
		anInt7424++;
		Class213.aNode_Sub27_2512.method2690(59, 0, Class213.aNode_Sub27_2512.aClass320_Sub19_7277);
		Class213.aNode_Sub27_2512.method2690(95, 0, Class213.aNode_Sub27_2512.aClass320_Sub19_7301);
		Class213.aNode_Sub27_2512.method2690(105, 1, Class213.aNode_Sub27_2512.aClass320_Sub4_7302);
		Class213.aNode_Sub27_2512.method2690(27, 1, Class213.aNode_Sub27_2512.aClass320_Sub4_7304);
		Class213.aNode_Sub27_2512.method2690(120, 0, Class213.aNode_Sub27_2512.aClass320_Sub6_7267);
		Class213.aNode_Sub27_2512.method2690(123, 0, Class213.aNode_Sub27_2512.aClass320_Sub16_7316);
		Class213.aNode_Sub27_2512.method2690(64, 0, Class213.aNode_Sub27_2512.aClass320_Sub23_7290);
		Class213.aNode_Sub27_2512.method2690(118, 0, Class213.aNode_Sub27_2512.aClass320_Sub27_7266);
		Class213.aNode_Sub27_2512.method2690(112, 0, Class213.aNode_Sub27_2512.aClass320_Sub8_7280);
		Class213.aNode_Sub27_2512.method2690(37, 0, Class213.aNode_Sub27_2512.aClass320_Sub7_7308);
		Class213.aNode_Sub27_2512.method2690(32, 0, Class213.aNode_Sub27_2512.aClass320_Sub12_7282);
		Class213.aNode_Sub27_2512.method2690(25, 0, Class213.aNode_Sub27_2512.aClass320_Sub30_7275);
		Class213.aNode_Sub27_2512.method2690(92, 0, Class213.aNode_Sub27_2512.aClass320_Sub24_7317);
		Class213.aNode_Sub27_2512.method2690(30, 0, Class213.aNode_Sub27_2512.aClass320_Sub26_7269);
		Class213.aNode_Sub27_2512.method2690(44, 0, Class213.aNode_Sub27_2512.aClass320_Sub13_7284);
		Class213.aNode_Sub27_2512.method2690(95, 0, Class213.aNode_Sub27_2512.aClass320_Sub13_7283);
		Class213.aNode_Sub27_2512.method2690(111, 0, Class213.aNode_Sub27_2512.aClass320_Sub28_7305);
		Class213.aNode_Sub27_2512.method2690(30, 0, Class213.aNode_Sub27_2512.aClass320_Sub5_7297);
		Class213.aNode_Sub27_2512.method2690(59, 0, Class213.aNode_Sub27_2512.aClass320_Sub20_7306);
		Class213.aNode_Sub27_2512.method2690(92, 0, Class213.aNode_Sub27_2512.aClass320_Sub2_7272);
		Class204.method2030((byte) 125);
		Class213.aNode_Sub27_2512.method2690(110, 2, Class213.aNode_Sub27_2512.aClass320_Sub18_7303);
		Class213.aNode_Sub27_2512.method2690(92, 1, Class213.aNode_Sub27_2512.aClass320_Sub15_7273);
		Class320_Sub12.method3728(0);
		Class120.method1228(-125);
		Class152.aBoolean1942 = bool;
	}
	
	static final int method2753(byte b, Class68 class68) {
		anInt7426++;
		if (class68 == CacheNode_Sub19.aClass68_9621) {
			return 6407;
		}
		if (class68 == Class99.aClass68_1290) {
			return 6408;
		}
		if (class68 != Node_Sub52.aClass68_7639) {
			if (class68 != Class188_Sub2.aClass68_6875) {
				if (class68 != Class259.aClass68_3268) {
					if (class68 == Class262_Sub15_Sub1.aClass68_10521) {
						return 6145;
					}
				} else {
					return 6410;
				}
			} else {
				return 6409;
			}
		} else {
			return 6406;
		}
		if (b != -18) {
			aClass192_7428 = null;
		}
		throw new IllegalStateException();
	}
	
	static final void method2754(Animator animator, DrawableModel drawablemodel, Animator animator_8_, byte b) {
		if (animator.method247(29340) && animator_8_.method247(29340)) {
			Class48 class48 = animator.aClass48_233;
			Class48 class48_9_ = animator_8_.aClass48_233;
			drawablemodel.method615(animator_8_.anInt247, animator.aClass226_270.anInt2685, animator.aClass226_270.aCacheNode_Sub15_2687, animator_8_.aClass226_270.anInt2688, -65, animator.aClass226_270.anInt2688, animator_8_.aClass226_270.aCacheNode_Sub15_2687, animator.aClass226_270.aCacheNode_Sub15_2683, animator.anInt247, class48.aBoolean691 | class48_9_.aBoolean691, class48_9_.anIntArray707[animator_8_.anInt259], animator_8_.aClass226_270.aCacheNode_Sub15_2683, class48.aBooleanArray703, class48.anIntArray707[animator.anInt259], animator_8_.aClass226_270.anInt2685);
		}
		anInt7427++;
		if (b > -7) {
			anAnimableArray7429 = null;
		}
	}
	
	public static void method2755(byte b) {
		if (b != 91) {
			method2757(-124, 93, (byte) 67);
		}
		anAnimableArray7429 = null;
		aClass192_7428 = null;
	}
	
	abstract void method2756(BufferedStream buffer, int i);
	
	static final int method2757(int i, int i_10_, byte b) {
		anInt7425++;
		i_10_ = (0x7f & i) * i_10_ >> 7;
		if ((i_10_ ^ 0xffffffff) > -3) {
			i_10_ = 2;
		} else if ((i_10_ ^ 0xffffffff) < -127) {
			i_10_ = 126;
		}
		if (b > -29) {
			return 98;
		}
		return (0xff80 & i) + i_10_;
	}
}
