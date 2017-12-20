/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class34
{
	static OutcommingPacket pingPacket = new OutcommingPacket(85, 2);
	static int anInt529;
	static int anInt530;
	static boolean aBoolean531 = true;
	static boolean aBoolean532 = false;
	static int anInt533;
	
	static final Class345 method367(int i, Model model, int i_0_, int[] is) {
		anInt533++;
		int[] is_1_ = null;
		int[] is_2_ = null;
		int[] is_3_ = null;
		float[][] fs = null;
		if (i <= 59) {
			return null;
		}
		if (model.aByteArray2610 != null) {
			int i_4_ = model.anInt2611;
			int[] is_5_ = new int[i_4_];
			int[] is_6_ = new int[i_4_];
			int[] is_7_ = new int[i_4_];
			int[] is_8_ = new int[i_4_];
			int[] is_9_ = new int[i_4_];
			int[] is_10_ = new int[i_4_];
			for (int i_11_ = 0; i_11_ < i_4_; i_11_++) {
				is_5_[i_11_] = 2147483647;
				is_6_[i_11_] = -2147483647;
				is_7_[i_11_] = 2147483647;
				is_8_[i_11_] = -2147483647;
				is_9_[i_11_] = 2147483647;
				is_10_[i_11_] = -2147483647;
			}
			is_3_ = new int[i_4_];
			fs = new float[i_4_][];
			for (int i_12_ = 0; i_12_ < i_0_; i_12_++) {
				int i_13_ = is[i_12_];
				if ((model.aByteArray2610[i_13_] ^ 0xffffffff) != 0) {
					int i_14_ = 0xff & model.aByteArray2610[i_13_];
					for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -4; i_15_++) {
						short s;
						if ((i_15_ ^ 0xffffffff) != -1) {
							if ((i_15_ ^ 0xffffffff) == -2) {
								s = model.aShortArray2583[i_13_];
							} else {
								s = model.aShortArray2589[i_13_];
							}
						} else {
							s = model.aShortArray2600[i_13_];
						}
						int i_16_ = model.anIntArray2616[s];
						int i_17_ = model.anIntArray2576[s];
						int i_18_ = model.anIntArray2574[s];
						if (i_16_ < is_5_[i_14_]) {
							is_5_[i_14_] = i_16_;
						}
						if (i_16_ > is_6_[i_14_]) {
							is_6_[i_14_] = i_16_;
						}
						if ((is_7_[i_14_] ^ 0xffffffff) < (i_17_ ^ 0xffffffff)) {
							is_7_[i_14_] = i_17_;
						}
						if (i_17_ > is_8_[i_14_]) {
							is_8_[i_14_] = i_17_;
						}
						if ((is_9_[i_14_] ^ 0xffffffff) < (i_18_ ^ 0xffffffff)) {
							is_9_[i_14_] = i_18_;
						}
						if (i_18_ > is_10_[i_14_]) {
							is_10_[i_14_] = i_18_;
						}
					}
				}
			}
			is_1_ = new int[i_4_];
			is_2_ = new int[i_4_];
			for (int i_19_ = 0; i_19_ < i_4_; i_19_++) {
				byte b = model.aByteArray2586[i_19_];
				if (b > 0) {
					is_1_[i_19_] = (is_5_[i_19_] + is_6_[i_19_]) / 2;
					is_2_[i_19_] = (is_7_[i_19_] + is_8_[i_19_]) / 2;
					is_3_[i_19_] = (is_10_[i_19_] + is_9_[i_19_]) / 2;
					float f;
					float f_20_;
					float f_21_;
					if ((b ^ 0xffffffff) == -2) {
						int i_22_ = model.anIntArray2603[i_19_];
						f = 64.0F / (float) model.anIntArray2588[i_19_];
						if (i_22_ != 0) {
							if (i_22_ <= 0) {
								f_20_ = 1.0F;
								f_21_ = (float) -i_22_ / 1024.0F;
							} else {
								f_21_ = 1.0F;
								f_20_ = (float) i_22_ / 1024.0F;
							}
						} else {
							f_21_ = 1.0F;
							f_20_ = 1.0F;
						}
					} else if ((b ^ 0xffffffff) == -3) {
						f = 64.0F / (float) model.anIntArray2588[i_19_];
						f_20_ = 64.0F / (float) model.anIntArray2593[i_19_];
						f_21_ = 64.0F / (float) model.anIntArray2603[i_19_];
					} else {
						f_21_ = (float) model.anIntArray2603[i_19_] / 1024.0F;
						f = (float) model.anIntArray2588[i_19_] / 1024.0F;
						f_20_ = (float) model.anIntArray2593[i_19_] / 1024.0F;
					}
					fs[i_19_] = Class262_Sub15.method3189(f_21_, f, f_20_, model.aShortArray2613[i_19_], model.aShortArray2604[i_19_], 8, Node_Sub30.method2723(model.aByteArray2609[i_19_], 255), model.aShortArray2577[i_19_]);
				}
			}
		}
		return new Class345(is_1_, is_2_, is_3_, fs);
	}
	
	abstract void method368(int i, int i_23_);
	
	abstract int method369(byte b, int i);
	
	public Class34() {
		/* empty */
	}
	
	static final void method370(Actor actor, byte b) {
		anInt530++;
		Animator animator = actor.anAnimator10860;
		if (animator.method245(-128) && animator.method248(-110, 1) && animator.method238(-76)) {
			if (actor.aBoolean10867) {
				animator.method249(true, actor.method868((byte) -125).method3128(false));
				actor.aBoolean10867 = animator.method245(-125);
			}
			animator.method235(0);
		}
		int i = 0;
		if (b <= 14) {
			pingPacket = null;
		}
		for (/**/; i < actor.aClass165Array10886.length; i++) {
			if ((actor.aClass165Array10886[i].graphicsId ^ 0xffffffff) != 0) {
				Animator animator_24_ = actor.aClass165Array10886[i].anAnimator2026;
				if (animator_24_.method242((byte) -77)) {
					Class195 class195 = Class16.aClass101_228.method1090(-121, actor.aClass165Array10886[i].graphicsId);
					Class48 class48 = animator_24_.method243((byte) -24);
					if (class195.aBoolean2402) {
						if (class48.anInt698 == 3) {
							if (actor.anInt10900 > 0 && (Class174.clientCycle ^ 0xffffffff) <= (actor.toFirstTileTicketDelay ^ 0xffffffff) && actor.toSecondTileTicketDelay < Class174.clientCycle) {
								animator_24_.method249(true, -1);
								actor.aClass165Array10886[i].graphicsId = -1;
								continue;
							}
						} else if (class48.anInt698 == 1 && (actor.anInt10900 ^ 0xffffffff) < -1 && actor.toFirstTileTicketDelay <= Class174.clientCycle && (Class174.clientCycle ^ 0xffffffff) < (actor.toSecondTileTicketDelay ^ 0xffffffff)) {
							continue;
						}
					}
				}
				if (animator_24_.method248(-86, 1) && animator_24_.method238(-22)) {
					animator_24_.method249(true, -1);
					actor.aClass165Array10886[i].graphicsId = -1;
				}
			}
		}
		Animator animator_25_ = actor.anAnimator10876;
		do {
			if (animator_25_.method245(-127)) {
				Class48 class48 = animator_25_.method243((byte) -24);
				if (class48.anInt698 == 3) {
					if ((actor.anInt10900 ^ 0xffffffff) < -1 && actor.toFirstTileTicketDelay <= Class174.clientCycle && Class174.clientCycle > actor.toSecondTileTicketDelay) {
						actor.anIntArray10817 = null;
						animator_25_.method249(true, -1);
						break;
					}
				} else if ((class48.anInt698 ^ 0xffffffff) == -2) {
					if ((actor.anInt10900 ^ 0xffffffff) < -1 && Class174.clientCycle >= actor.toFirstTileTicketDelay && actor.toSecondTileTicketDelay < Class174.clientCycle) {
						animator_25_.method227(1, -10);
						break;
					}
					animator_25_.method227(0, -82);
				}
				if (animator_25_.method248(-98, 1) && animator_25_.method238(-67)) {
					actor.anIntArray10817 = null;
					animator_25_.method249(true, -1);
				}
			}
		} while (false);
		for (int i_26_ = 0; (actor.anAnimableAnimator_Sub1Array10894.length ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
			AnimableAnimator_Sub1 animableanimator_sub1 = actor.anAnimableAnimator_Sub1Array10894[i_26_];
			if (animableanimator_sub1 != null) {
				if ((animableanimator_sub1.anInt9094 ^ 0xffffffff) < -1) {
					animableanimator_sub1.anInt9094--;
				} else if (animableanimator_sub1.method248(-116, 1) && animableanimator_sub1.method238(-71)) {
					actor.anAnimableAnimator_Sub1Array10894[i_26_] = null;
				}
			}
		}
	}
	
	static final void method371(int i, int i_27_, byte b) {
		anInt529++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 15, 0L);
		cachenode_sub2.method2288(0);
		if (b < -64) {
			cachenode_sub2.anInt9434 = i_27_;
			cachenode_sub2.anInt9432 = i;
		}
	}
	
	public static void method372(byte b) {
		if (b == -72) {
			pingPacket = null;
		}
	}
	
	abstract byte[] method373(int i, byte b);
	
	abstract ReferenceTable method374(byte b);
}
