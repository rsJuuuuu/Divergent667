/* PlayerDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PlayerDefinition
{
	static int anInt3424;
	static int anInt3425;
	static int anInt3426;
	static int anInt3427;
	static int anInt3428;
	private int anInt3429;
	protected int[] anIntArray3430;
	private TemporaryItemDefinition[] aClass38Array3431;
	static int anInt3432;
	static int anInt3433;
	protected boolean aBoolean3434;
	private int[] anIntArray3435;
	private long aLong3436;
	static int anInt3437;
	static int anInt3438;
	protected int toNPCId = -1;
	private long aLong3440;
	static int anInt3441;
	
	private final void method3276(int i) {
		anInt3425++;
		long[] ls = CacheNode_Sub20.aLongArray9626;
		aLong3440 = -1L;
		aLong3440 = ls[(int) ((aLong3440 ^ (long) (anInt3429 >> 8)) & 0xffL)] ^ aLong3440 >>> 8;
		aLong3440 = aLong3440 >>> 8 ^ ls[(int) (((long) anInt3429 ^ aLong3440) & 0xffL)];
		if (i != 21428) {
			anIntArray3430 = null;
		}
		for (int i_0_ = 0; anIntArray3435.length > i_0_; i_0_++) {
			aLong3440 = ls[(int) (0xffL & (aLong3440 ^ (long) (anIntArray3435[i_0_] >> 24)))] ^ aLong3440 >>> 8;
			aLong3440 = ls[(int) (0xffL & ((long) (anIntArray3435[i_0_] >> 16) ^ aLong3440))] ^ aLong3440 >>> 8;
			aLong3440 = aLong3440 >>> 8 ^ ls[(int) (0xffL & (aLong3440 ^ (long) (anIntArray3435[i_0_] >> 8)))];
			aLong3440 = aLong3440 >>> 8 ^ ls[(int) ((aLong3440 ^ (long) anIntArray3435[i_0_]) & 0xffL)];
		}
		if (aClass38Array3431 != null) {
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (aClass38Array3431.length ^ 0xffffffff); i_1_++) {
				if (aClass38Array3431[i_1_] != null) {
					int[] is;
					int[] is_2_;
					if (!aBoolean3434) {
						is = aClass38Array3431[i_1_].anIntArray564;
						is_2_ = aClass38Array3431[i_1_].maleWornModelIds;
					} else {
						is = aClass38Array3431[i_1_].anIntArray568;
						is_2_ = aClass38Array3431[i_1_].femaleWornModelIds;
					}
					if (is_2_ != null) {
						for (int i_3_ = 0; i_3_ < is_2_.length; i_3_++) {
							aLong3440 = aLong3440 >>> 8 ^ ls[(int) (0xffL & ((long) (is_2_[i_3_] >> 8) ^ aLong3440))];
							aLong3440 = ls[(int) (((long) is_2_[i_3_] ^ aLong3440) & 0xffL)] ^ aLong3440 >>> 8;
						}
					}
					if (is != null) {
						for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_4_++) {
							aLong3440 = aLong3440 >>> 8 ^ ls[(int) (0xffL & (aLong3440 ^ (long) (is[i_4_] >> 8)))];
							aLong3440 = aLong3440 >>> 8 ^ ls[(int) ((aLong3440 ^ (long) is[i_4_]) & 0xffL)];
						}
					}
					if (aClass38Array3431[i_1_].modifiedModelColors != null) {
						for (int i_5_ = 0; (aClass38Array3431[i_1_].modifiedModelColors.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
							aLong3440 = aLong3440 >>> 8 ^ ls[(int) (((long) (aClass38Array3431[i_1_].modifiedModelColors[i_5_] >> 8) ^ aLong3440) & 0xffL)];
							aLong3440 = aLong3440 >>> 8 ^ ls[(int) (0xffL & ((long) aClass38Array3431[i_1_].modifiedModelColors[i_5_] ^ aLong3440))];
						}
					}
					if (aClass38Array3431[i_1_].modifiedTextureColors != null) {
						for (int i_6_ = 0; (aClass38Array3431[i_1_].modifiedTextureColors.length ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
							aLong3440 = aLong3440 >>> 8 ^ ls[(int) (0xffL & (aLong3440 ^ (long) (aClass38Array3431[i_1_].modifiedTextureColors[i_6_] >> 8)))];
							aLong3440 = ls[(int) (((long) aClass38Array3431[i_1_].modifiedTextureColors[i_6_] ^ aLong3440) & 0xffL)] ^ aLong3440 >>> 8;
						}
					}
				}
			}
		}
		for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -11; i_7_++)
			aLong3440 = aLong3440 >>> 8 ^ ls[(int) (0xffL & ((long) anIntArray3430[i_7_] ^ aLong3440))];
		aLong3440 = ls[(int) (0xffL & ((long) (aBoolean3434 ? 1 : 0) ^ aLong3440))] ^ aLong3440 >>> 8;
	}
	
	static final Class77[] method3277(int i) {
		anInt3432++;
		if (i != 12247) {
			return null;
		}
		return new Class77[] { Animable_Sub4_Sub2.aClass77_10805, Class67.aClass77_930, Class260.aClass77_5225 };
	}
	
	final void method3278(int[] is, int[] is_8_, TemporaryItemDefinition[] class38s, int i, int i_9_, boolean bool, byte b) {
		aClass38Array3431 = class38s;
		anIntArray3430 = is;
		aBoolean3434 = bool;
		if (anInt3429 != i_9_) {
			anInt3429 = i_9_;
		}
		anInt3437++;
		anIntArray3435 = is_8_;
		toNPCId = i;
		method3276(21428);
	}
	
	final DrawableModel method3279(Class86 class86, Animator animator, int i, boolean bool, Class281 class281, Class37 class37, int i_11_, int[] is, Class363 class363, Class181 class181, GraphicsToolkit graphicstoolkit, Class279 class279, Animator[] animators, int i_12_, Animator animator_13_, Interface17 interface17) {
		anInt3438++;
		if (toNPCId != -1) {
			return class279.getNPCDefinitions(toNPCId, (byte) 107).prepareModel(interface17, graphicstoolkit, class281, (byte) -115, animator, i_12_, is, null, animator_13_, i_11_, animators);
		}
		int i_14_ = i_11_;
		long l = aLong3440;
		int[] is_15_ = anIntArray3435;
		boolean bool_16_ = false;
		if (i <= 46) {
			return null;
		}
		boolean bool_17_ = false;
		if (animator != null) {
			Class48 class48 = animator.method243((byte) -24);
			if (class48 != null && (class48.anInt716 >= 0 || (class48.anInt713 ^ 0xffffffff) <= -1)) {
				is_15_ = new int[anIntArray3435.length];
				for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > (is_15_.length ^ 0xffffffff); i_18_++)
					is_15_[i_18_] = anIntArray3435[i_18_];
				if (class48.anInt716 >= 0 && (class363.anInt4506 ^ 0xffffffff) != 0) {
					if ((class48.anInt716 ^ 0xffffffff) == -65536) {
						is_15_[class363.anInt4506] = 0;
						for (int i_19_ = 0; (class363.anIntArray4501.length ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++)
							is_15_[class363.anIntArray4501[i_19_]] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_15_[class363.anInt4506] = Node_Sub16.method2590(class48.anInt716, 1073741824);
						for (int i_20_ = 0; class363.anIntArray4501.length > i_20_; i_20_++)
							is_15_[class363.anIntArray4501[i_20_]] = 0;
						l ^= (long) is_15_[class363.anInt4506] << 32;
					}
					bool_16_ = true;
				}
				if ((class48.anInt713 ^ 0xffffffff) <= -1 && class363.anInt4504 != -1) {
					bool_17_ = true;
					if (class48.anInt713 != 65535) {
						is_15_[class363.anInt4504] = Node_Sub16.method2590(class48.anInt713, 1073741824);
						for (int i_21_ = 0; i_21_ < class363.anIntArray4507.length; i_21_++)
							is_15_[class363.anIntArray4507[i_21_]] = 0;
						l ^= (long) is_15_[class363.anInt4504];
					} else {
						is_15_[class363.anInt4504] = 0;
						for (int i_22_ = 0; (class363.anIntArray4507.length ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++)
							is_15_[class363.anIntArray4507[i_22_]] = 0;
						l ^= 0xffffffffL;
					}
				}
			}
		}
		boolean bool_23_ = false;
		int i_24_ = animators == null ? 0 : animators.length;
		for (int i_25_ = 0; i_24_ > i_25_; i_25_++) {
			if (animators[i_25_] != null) {
				i_14_ |= animators[i_25_].method237((byte) -128);
				bool_23_ = true;
			}
		}
		if (animator != null) {
			i_14_ |= animator.method237((byte) -127);
			bool_23_ = true;
		}
		if (animator_13_ != null) {
			bool_23_ = true;
			i_14_ |= animator_13_.method237((byte) -126);
		}
		boolean bool_26_ = false;
		if (is != null) {
			for (int i_27_ = 0; i_27_ < is.length; i_27_++) {
				if ((is[i_27_] ^ 0xffffffff) != 0) {
					bool_26_ = true;
					i_14_ |= 0x20;
				}
			}
		}
		DrawableModel drawablemodel;
		synchronized (Node_Sub36_Sub4.aClass61_10065) {
			drawablemodel = (DrawableModel) Node_Sub36_Sub4.aClass61_10065.method607(l, 0);
		}
		Class259 class259 = null;
		if ((anInt3429 ^ 0xffffffff) != 0) {
			class259 = class281.method3383((byte) 102, anInt3429);
		}
		if (drawablemodel == null || (graphicstoolkit.b(drawablemodel.ua(), i_14_) ^ 0xffffffff) != -1) {
			if (drawablemodel != null) {
				i_14_ = graphicstoolkit.c(i_14_, drawablemodel.ua());
			}
			int i_28_ = i_14_;
			boolean bool_29_ = false;
			for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (is_15_.length ^ 0xffffffff); i_30_++) {
				int i_31_ = is_15_[i_30_];
				TemporaryItemDefinition class38 = null;
				boolean bool_32_ = false;
				if (bool_16_) {
					if (class363.anInt4506 != i_30_) {
						for (int i_33_ = 0; (class363.anIntArray4501.length ^ 0xffffffff) < (i_33_ ^ 0xffffffff); i_33_++) {
							if ((i_30_ ^ 0xffffffff) == (class363.anIntArray4501[i_33_] ^ 0xffffffff)) {
								bool_32_ = true;
								break;
							}
						}
					} else {
						bool_32_ = true;
					}
				}
				if (bool_17_) {
					if (class363.anInt4504 != i_30_) {
						for (int i_34_ = 0; (class363.anIntArray4507.length ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
							if (class363.anIntArray4507[i_34_] == i_30_) {
								bool_32_ = true;
								break;
							}
						}
					} else {
						bool_32_ = true;
					}
				}
				if ((i_31_ & 0x40000000) == 0) {
					if ((~0x7fffffff & i_31_) != 0 && !class181.method1825(i_31_ & 0x3fffffff, (byte) 119).method3229(0)) {
						bool_29_ = true;
					}
				} else {
					if (!bool_32_ && aClass38Array3431 != null && aClass38Array3431[i_30_] != null) {
						class38 = aClass38Array3431[i_30_];
					}
					if (!class86.method1010(0x3fffffff & i_31_, 14434).method1686(aBoolean3434, class38, 110)) {
						bool_29_ = true;
					}
				}
			}
			if (bool_29_) {
				if ((aLong3436 ^ 0xffffffffffffffffL) != 0L) {
					synchronized (Node_Sub36_Sub4.aClass61_10065) {
						drawablemodel = (DrawableModel) Node_Sub36_Sub4.aClass61_10065.method607(aLong3436, 0);
					}
				}
				if (drawablemodel == null || graphicstoolkit.b(drawablemodel.ua(), i_14_) != 0) {
					return null;
				}
			} else {
				Model[] models = new Model[is_15_.length];
				for (int i_35_ = 0; (is_15_.length ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
					int i_36_ = is_15_[i_35_];
					TemporaryItemDefinition class38 = null;
					boolean bool_37_ = i_35_ == 5 && bool_16_ || i_35_ == 3 && bool_17_;
					if ((i_36_ & 0x40000000) == 0) {
						if ((~0x7fffffff & i_36_) != 0) {
							Model model = class181.method1825(0x3fffffff & i_36_, (byte) 101).method3231(0);
							if (model != null) {
								models[i_35_] = model;
							}
						}
					} else {
						if (!bool_37_ && aClass38Array3431 != null && aClass38Array3431[i_35_] != null) {
							class38 = aClass38Array3431[i_35_];
						}
						Model model = class86.method1010(0x3fffffff & i_36_, 14434).method1683(class38, aBoolean3434, -114);
						if (model != null) {
							models[i_35_] = model;
						}
					}
				}
				if (class259 != null && class259.anIntArrayArray3273 != null) {
					for (int i_38_ = 0; class259.anIntArrayArray3273.length > i_38_; i_38_++) {
						if (models[i_38_] != null) {
							int i_39_ = 0;
							int i_40_ = 0;
							int i_41_ = 0;
							int i_42_ = 0;
							int i_43_ = 0;
							int i_44_ = 0;
							if (class259.anIntArrayArray3273[i_38_] != null) {
								i_40_ = class259.anIntArrayArray3273[i_38_][1];
								i_41_ = class259.anIntArrayArray3273[i_38_][2];
								i_44_ = class259.anIntArrayArray3273[i_38_][5] << 3;
								i_39_ = class259.anIntArrayArray3273[i_38_][0];
								i_43_ = class259.anIntArrayArray3273[i_38_][4] << 3;
								i_42_ = class259.anIntArrayArray3273[i_38_][3] << 3;
							}
							if ((i_42_ ^ 0xffffffff) != -1 || i_43_ != 0 || (i_44_ ^ 0xffffffff) != -1) {
								models[i_38_].method2085(i_44_, i_42_, -120, i_43_);
							}
							if (i_39_ != 0 || i_40_ != 0 || i_41_ != 0) {
								models[i_38_].method2082(i_39_, i_40_, 105, i_41_);
							}
						}
					}
				}
				i_28_ |= 0x4000;
				Model model = new Model(models, models.length);
				drawablemodel = graphicstoolkit.a(model, i_28_, Class157.anInt1972, 64, 850);
				for (int i_45_ = 0; i_45_ < 10; i_45_++) {
					for (int i_46_ = 0; (i_46_ ^ 0xffffffff) > (Class45.aShortArrayArray5265[i_45_].length ^ 0xffffffff); i_46_++) {
						if (Class117_Sub2.aShortArrayArrayArray5151[i_45_][i_46_].length > anIntArray3430[i_45_]) {
							drawablemodel.ia(Class45.aShortArrayArray5265[i_45_][i_46_], Class117_Sub2.aShortArrayArrayArray5151[i_45_][i_46_][anIntArray3430[i_45_]]);
						}
					}
				}
				if (bool) {
					drawablemodel.s(i_14_);
					synchronized (Node_Sub36_Sub4.aClass61_10065) {
						Node_Sub36_Sub4.aClass61_10065.method601(drawablemodel, 25566, l);
					}
					aLong3436 = l;
				}
			}
		}
		DrawableModel drawablemodel_47_ = drawablemodel.method633((byte) 4, i_14_, true);
		if (!bool_23_ && !bool_26_) {
			return drawablemodel_47_;
		}
		Class336[] class336s = null;
		if (class259 != null) {
			class336s = class259.method3131(3, graphicstoolkit);
		}
		if (bool_26_ && class336s != null) {
			for (int i_48_ = 0; (i_48_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_48_++) {
				if (class336s[i_48_] != null) {
					drawablemodel_47_.method630(class336s[i_48_], 1 << i_48_, true);
				}
			}
		}
		int i_49_ = 0;
		int i_50_ = 1;
		while ((i_49_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff)) {
			if (animators[i_49_] != null) {
				animators[i_49_].method246(i_50_, 0, true, drawablemodel_47_);
			}
			i_49_++;
			i_50_ <<= 1;
		}
		if (bool_26_) {
			for (int i_51_ = 0; is.length > i_51_; i_51_++) {
				if ((is[i_51_] ^ 0xffffffff) != 0) {
					int i_52_ = -i_12_ + is[i_51_];
					i_52_ &= 0x3fff;
					Class336 class336 = graphicstoolkit.y();
					class336.method3860(i_52_);
					drawablemodel_47_.method630(class336, 1 << i_51_, false);
				}
			}
		}
		if (bool_26_ && class336s != null) {
			for (int i_53_ = 0; (i_53_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_53_++) {
				if (class336s[i_53_] != null) {
					drawablemodel_47_.method630(class336s[i_53_], 1 << i_53_, false);
				}
			}
		}
		if (animator != null && animator_13_ != null) {
			Node_Sub36.method2754(animator, drawablemodel_47_, animator_13_, (byte) -109);
		} else if (animator != null) {
			animator.method225(0, drawablemodel_47_, 0);
		} else if (animator_13_ != null) {
			animator_13_.method225(0, drawablemodel_47_, 0);
		}
		return drawablemodel_47_;
	}
	
	final void method3280(int i, boolean bool) {
		aBoolean3434 = bool;
		anInt3441++;
		if (i == 26328) {
			method3276(21428);
		}
	}
	
	final void method3281(int i, byte b, Class181 class181, int i_54_) {
		anInt3424++;
		int i_55_ = Node.anIntArray2802[i_54_];
		if (class181.method1825(i, (byte) 120) != null) {
			if (b <= 93) {
				method3277(110);
			}
			anIntArray3435[i_55_] = Node_Sub16.method2590(-2147483648, i);
			method3276(21428);
		}
	}
	
	final void method3282(int i, int i_56_, byte b) {
		anInt3433++;
		if (b < -35) {
			anIntArray3430[i] = i_56_;
			method3276(21428);
		}
	}
	
	final DrawableModel method3283(Animator animator, int i, int i_57_, Class37 class37, GraphicsToolkit graphicstoolkit, byte b, Class181 class181, int i_58_, int i_59_) {
		anInt3427++;
		int i_60_ = animator == null ? i_59_ : i_59_ | animator.method237((byte) -127);
		long l = (long) i | ((long) i_57_ << 32 | (long) (i_58_ << 16));
		DrawableModel drawablemodel;
		synchronized (CacheNode_Sub3.aClass61_9446) {
			drawablemodel = (DrawableModel) CacheNode_Sub3.aClass61_9446.method607(l, 0);
		}
		if (drawablemodel == null || graphicstoolkit.b(drawablemodel.ua(), i_60_) != 0) {
			if (drawablemodel != null) {
				i_60_ = graphicstoolkit.c(i_60_, drawablemodel.ua());
			}
			int i_61_ = i_60_;
			Model[] models = new Model[3];
			int i_62_ = 0;
			if (!class181.method1825(i, (byte) 102).method3228(true) || !class181.method1825(i_58_, (byte) 109).method3228(true) || !class181.method1825(i_57_, (byte) 107).method3228(true)) {
				return null;
			}
			Model model = class181.method1825(i, (byte) 110).method3227((byte) 13);
			if (model != null) {
				models[i_62_++] = model;
			}
			model = class181.method1825(i_58_, (byte) 121).method3227((byte) 90);
			if (model != null) {
				models[i_62_++] = model;
			}
			model = class181.method1825(i_57_, (byte) 112).method3227((byte) 41);
			if (model != null) {
				models[i_62_++] = model;
			}
			i_61_ |= 0x4000;
			model = new Model(models, i_62_);
			drawablemodel = graphicstoolkit.a(model, i_61_, Class157.anInt1972, 64, 768);
			for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > -11; i_63_++) {
				for (int i_64_ = 0; Class45.aShortArrayArray5265[i_63_].length > i_64_; i_64_++) {
					if (anIntArray3430[i_63_] < Class117_Sub2.aShortArrayArrayArray5151[i_63_][i_64_].length) {
						drawablemodel.ia(Class45.aShortArrayArray5265[i_63_][i_64_], Class117_Sub2.aShortArrayArrayArray5151[i_63_][i_64_][anIntArray3430[i_63_]]);
					}
				}
			}
			drawablemodel.s(i_60_);
			synchronized (CacheNode_Sub3.aClass61_9446) {
				CacheNode_Sub3.aClass61_9446.method601(drawablemodel, 25566, l);
			}
		}
		if (animator == null) {
			return drawablemodel;
		}
		drawablemodel = drawablemodel.method633((byte) 4, i_60_, true);
		animator.method225(0, drawablemodel, 0);
		return drawablemodel;
	}
	
	final void method3284(byte b, int i, int i_66_, Class86 class86) {
		anInt3426++;
		if (i == -1) {
			anIntArray3435[i_66_] = 0;
		} else if (class86.method1010(i, 14434) != null) {
			anIntArray3435[i_66_] = Node_Sub16.method2590(i, 1073741824);
			method3276(21428);
		}
	}
	
	final DrawableModel prepareModelToInterface(Class181 class181, byte b, Class37 class37, Interface17 interface17, Animator animator, Class86 class86, Class279 class279, GraphicsToolkit graphicstoolkit, int i) {
		anInt3428++;
		if ((toNPCId ^ 0xffffffff) != 0) {
			return class279.getNPCDefinitions(toNPCId, (byte) 107).prepareModelToInterface(i, animator, null, 412761072, graphicstoolkit, interface17);
		}
		int i_68_ = animator == null ? i : i | animator.method237((byte) -126);
		DrawableModel drawablemodel;
		synchronized (CacheNode_Sub3.aClass61_9446) {
			drawablemodel = (DrawableModel) CacheNode_Sub3.aClass61_9446.method607(aLong3440, b + 82);
		}
		if (drawablemodel == null || (graphicstoolkit.b(drawablemodel.ua(), i_68_) ^ 0xffffffff) != -1) {
			if (drawablemodel != null) {
				i_68_ = graphicstoolkit.c(i_68_, drawablemodel.ua());
			}
			int i_69_ = i_68_;
			boolean bool = false;
			for (int i_70_ = 0; anIntArray3435.length > i_70_; i_70_++) {
				int i_71_ = anIntArray3435[i_70_];
				TemporaryItemDefinition class38 = null;
				if ((i_71_ & 0x40000000 ^ 0xffffffff) != -1) {
					if (aClass38Array3431 != null && aClass38Array3431[i_70_] != null) {
						class38 = aClass38Array3431[i_70_];
					}
					if (!class86.method1010(0x3fffffff & i_71_, 14434).method1692(b ^ ~0x51, class38, aBoolean3434)) {
						bool = true;
					}
				} else if ((~0x7fffffff & i_71_) != 0 && !class181.method1825(0x3fffffff & i_71_, (byte) 109).method3228(true)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			Model[] models = new Model[anIntArray3435.length];
			int i_72_ = 0;
			for (int i_73_ = 0; anIntArray3435.length > i_73_; i_73_++) {
				int i_74_ = anIntArray3435[i_73_];
				TemporaryItemDefinition class38 = null;
				if ((i_74_ & 0x40000000) != 0) {
					if (aClass38Array3431 != null && aClass38Array3431[i_73_] != null) {
						class38 = aClass38Array3431[i_73_];
					}
					Model model = class86.method1010(i_74_ & 0x3fffffff, 14434).method1685(aBoolean3434, class38, -116);
					if (model != null) {
						models[i_72_++] = model;
					}
				} else if ((~0x7fffffff & i_74_ ^ 0xffffffff) != -1) {
					Model model = class181.method1825(0x3fffffff & i_74_, (byte) 117).method3227((byte) 29);
					if (model != null) {
						models[i_72_++] = model;
					}
				}
			}
			Model model = new Model(models, i_72_);
			i_69_ |= 0x4000;
			drawablemodel = graphicstoolkit.a(model, i_69_, Class157.anInt1972, 64, 768);
			for (int i_75_ = 0; i_75_ < 10; i_75_++) {
				for (int i_76_ = 0; i_76_ < Class45.aShortArrayArray5265[i_75_].length; i_76_++) {
					if (anIntArray3430[i_75_] < Class117_Sub2.aShortArrayArrayArray5151[i_75_][i_76_].length) {
						drawablemodel.ia(Class45.aShortArrayArray5265[i_75_][i_76_], Class117_Sub2.aShortArrayArrayArray5151[i_75_][i_76_][anIntArray3430[i_75_]]);
					}
				}
			}
			drawablemodel.s(i_68_);
			synchronized (CacheNode_Sub3.aClass61_9446) {
				CacheNode_Sub3.aClass61_9446.method601(drawablemodel, 25566, aLong3440);
			}
		}
		if (animator == null) {
			return drawablemodel;
		}
		if (b != -82) {
			method3282(122, 89, (byte) -50);
		}
		DrawableModel drawablemodel_77_ = drawablemodel.method633((byte) 4, i_68_, true);
		animator.method225(0, drawablemodel_77_, 0);
		return drawablemodel_77_;
	}
}
