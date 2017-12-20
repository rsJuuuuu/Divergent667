/* Actor - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Actor extends Mobile
{
	protected int anInt10815;
	static int anInt10816;
	protected int[] anIntArray10817 = null;
	static int anInt10818;
	protected int[] anIntArray10819 = new int[CacheNode_Sub4.aClass1_9466.anInt117];
	static int anInt10820;
	static int anInt10821;
	static int anInt10822;
	static Class257 aClass257_10823 = new Class257(6, 16);
	static int anInt10824;
	static int anInt10825;
	protected boolean aBoolean10826;
	static int anInt10827;
	static int anInt10828;
	protected int[] anIntArray10829;
	static int anInt10830;
	static int anInt10831;
	protected int anInt10832;
	static int anInt10833;
	static int anInt10834;
	protected int anInt10835;
	static int anInt10836;
	static int anInt10837;
	protected int faceEntity;
	static int anInt10839;
	static int anInt10840;
	static int anInt10841;
	protected int hpPercentage;
	static int anInt10843;
	protected int anInt10844 = 0;
	protected int[] anIntArray10845;
	static int anInt10846;
	static int anInt10847;
	protected int anInt10848;
	protected int anInt10849;
	private byte aByte10850;
	private int anInt10851;
	static int anInt10852;
	protected int anInt10853;
	static int anInt10854;
	protected int anInt10855;
	protected int anInt10856;
	protected int anInt10857;
	protected int index;
	static int anInt10859;
	protected Animator anAnimator10860;
	protected Class59 aClass59_10861;
	protected int anInt10862;
	protected int anInt10863;
	static int anInt10864;
	static int anInt10865;
	protected int[] anIntArray10866;
	protected boolean aBoolean10867;
	protected int[] anIntArray10868;
	protected int[] anIntArray10869;
	static int anInt10870;
	protected boolean aBoolean10871;
	protected int anInt10872;
	protected int[] anIntArray10873;
	protected int anInt10874;
	protected int anInt10875;
	protected Animator anAnimator10876;
	protected int anInt10877;
	protected byte aByte10878;
	protected int toFirstTileX;
	protected int anInt10880;
	protected int[] anIntArray10881;
	protected int anInt10882;
	protected int toFirstTileY;
	protected byte aByte10884;
	protected int forceMovementDirection;
	protected Class165[] aClass165Array10886;
	protected int toSecondTileTicketDelay;
	protected byte aByte10888;
	protected int anInt10889;
	protected int anInt10890;
	protected int toSecondTileY;
	protected int toFirstTileTicketDelay;
	protected Class99 aClass99_10893;
	protected AnimableAnimator_Sub1[] anAnimableAnimator_Sub1Array10894;
	protected int anInt10895;
	protected byte aByte10896;
	protected int toSecondTileX;
	private Class99 aClass99_10898;
	private Class99 aClass99_10899;
	protected int anInt10900;
	protected int anInt10901;
	protected EntityNode_Sub4 anEntityNode_Sub4_10902;
	protected boolean aBoolean10903;
	protected int anInt10904;
	protected byte[] movementTypeQueue;
	protected boolean aBoolean10906;
	protected int anInt10907;
	protected int[] scenePositionYQueue;
	protected DrawableModel[] aDrawableModelArray10909;
	protected int[] scenePositionXQueue;
	
	final void method847(int i) {
		if (aClass59_10861 != null && aClass59_10861.aString877 != null) {
			aClass59_10861.anInt871--;
			if ((aClass59_10861.anInt871 ^ 0xffffffff) == -1) {
				aClass59_10861.aString877 = null;
			}
		}
		anInt10816++;
		if (i != -1) {
			movementTypeQueue = null;
		}
	}
	
	final void method848(int i, int i_0_, GraphicsToolkit graphicstoolkit, Class259 class259, int i_1_, int i_2_, int i_3_) {
		if (i_3_ > -57) {
			anIntArray10873 = null;
		}
		anInt10828++;
		for (int i_4_ = 0; i_4_ < aClass165Array10886.length; i_4_++) {
			byte b = 0;
			if ((i_4_ ^ 0xffffffff) == -1) {
				b = (byte) 2;
			} else if (i_4_ != 1) {
				if ((i_4_ ^ 0xffffffff) == -3) {
					b = (byte) 1;
				} else if (i_4_ == 3) {
					b = (byte) 7;
				}
			} else {
				b = (byte) 5;
			}
			Class165 class165 = aClass165Array10886[i_4_];
			if (class165.graphicsId == -1 || class165.anAnimator2026.method242((byte) -77)) {
				aDrawableModelArray10909[i_4_ + 1] = null;
			} else {
				Class195 class195 = Class16.aClass101_228.method1090(86, class165.graphicsId);
				boolean bool = (class195.aByte2381 ^ 0xffffffff) == -4 && (i_2_ != 0 || i_0_ != 0);
				int i_5_ = i;
				if (!bool) {
					if ((class165.anInt2027 ^ 0xffffffff) != -1) {
						i_5_ |= 0x5;
					}
					if (class165.graphicsHeight != 0) {
						i_5_ |= 0x2;
					}
					if (class165.anInt2025 >= 0) {
						i_5_ |= 0x7;
					}
				} else {
					i_5_ |= 0x7;
				}
				DrawableModel drawablemodel = aDrawableModelArray10909[1 + i_4_] = class195.method1989(class165.anAnimator2026, b, i_5_, (byte) 87, graphicstoolkit);
				if (drawablemodel != null) {
					if ((class165.anInt2025 ^ 0xffffffff) <= -1 && class259.anIntArrayArray3273 != null && class259.anIntArrayArray3273[class165.anInt2025] != null) {
						int i_6_ = 0;
						int i_7_ = 0;
						int i_8_ = 0;
						if (class259.anIntArrayArray3273 != null && class259.anIntArrayArray3273[class165.anInt2025] != null) {
							i_7_ += class259.anIntArrayArray3273[class165.anInt2025][1];
							i_8_ += class259.anIntArrayArray3273[class165.anInt2025][2];
							i_6_ += class259.anIntArrayArray3273[class165.anInt2025][0];
						}
						if (class259.anIntArrayArray3249 != null && class259.anIntArrayArray3249[class165.anInt2025] != null) {
							i_7_ += class259.anIntArrayArray3249[class165.anInt2025][1];
							i_8_ += class259.anIntArrayArray3249[class165.anInt2025][2];
							i_6_ += class259.anIntArrayArray3249[class165.anInt2025][0];
						}
						if ((i_8_ ^ 0xffffffff) != -1 || i_6_ != 0) {
							int i_9_ = i_1_;
							if (anIntArray10881 != null && (anIntArray10881[class165.anInt2025] ^ 0xffffffff) != 0) {
								i_9_ = anIntArray10881[class165.anInt2025];
							}
							int i_10_ = -i_1_ + i_9_ + class165.anInt2027 * 2048 & 0x3fff;
							if (i_10_ != 0) {
								drawablemodel.a(i_10_);
							}
							int i_11_ = Class335.anIntArray4167[i_10_];
							int i_12_ = Class335.anIntArray4165[i_10_];
							int i_13_ = i_11_ * i_8_ + i_6_ * i_12_ >> 14;
							i_8_ = -(i_6_ * i_11_) + i_8_ * i_12_ >> 14;
							i_6_ = i_13_;
						}
						drawablemodel.H(i_6_, i_7_, i_8_);
					} else if (class165.anInt2027 != 0) {
						drawablemodel.a(class165.anInt2027 * 2048);
					}
					if (class165.graphicsHeight != 0) {
						drawablemodel.H(0, -class165.graphicsHeight << 2, 0);
					}
					if (bool) {
						if (anInt10872 != 0) {
							drawablemodel.FA(anInt10872);
						}
						if (anInt10862 != 0) {
							drawablemodel.VA(anInt10862);
						}
						if ((anInt10832 ^ 0xffffffff) != -1) {
							drawablemodel.H(0, anInt10832, 0);
						}
					}
				}
			}
		}
	}
	
	final void method845(int i) {
		anInt10865++;
		int i_14_ = (-1 + anInt10851 << 8) + 240;
		aShort9120 = (short) (-i_14_ + anInt5940 >> 9);
		aShort9119 = (short) (anInt5934 + -i_14_ >> 9);
		aShort9124 = (short) (anInt5940 + i_14_ >> 9);
		aShort9130 = (short) (anInt5934 + i_14_ >> 9);
	}
	
	final void method849(int i, int i_16_, boolean bool) {
		if (i_16_ > -27) {
			aClass99_10898 = null;
		}
		anInt10833++;
		Class259 class259 = method868((byte) -127);
		if (bool || (class259.anInt3258 ^ 0xffffffff) != -1 || anInt10890 != 0) {
			anInt10889 = i & 0x3fff;
			aClass99_10893.method1088((byte) 83, anInt10889);
		}
	}
	
	int method850(byte b) {
		anInt10864++;
		if (b < 46) {
			method867(-58);
		}
		Class259 class259 = method868((byte) -124);
		int i;
		if (class259.anInt3303 == -1) {
			if (anInt10875 != -32768) {
				i = -anInt10875;
			} else {
				i = 200;
			}
		} else {
			i = class259.anInt3303;
		}
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[plane][anInt5934 >> Class36.anInt549][anInt5940 >> Class36.anInt549];
		if (class261 != null && class261.anAnimable_Sub1_3317 != null) {
			return i - -class261.anAnimable_Sub1_3317.aShort9102;
		}
		return i;
	}
	
	final int method823(byte b) {
		if (b != -21) {
			return 44;
		}
		anInt10834++;
		return anInt10844;
	}
	
	public static void method851(int i) {
		aClass257_10823 = null;
		if (i != 21049) {
			aClass257_10823 = null;
		}
	}
	
	final int method817(int i) {
		if (i != 2) {
			return 16;
		}
		anInt10841++;
		if (anInt10875 == -32768) {
			return 0;
		}
		return anInt10875;
	}
	
	final void method852(int i, int i_17_, int hpPercentage, byte b, int i_19_, int i_20_, int i_21_, int i_22_) {
		anInt10843++;
		boolean bool = true;
		boolean bool_23_ = true;
		if (b > -111) {
			method870(null, (byte) 28, true, null, null);
		}
		for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (CacheNode_Sub4.aClass1_9466.anInt117 ^ 0xffffffff); i_24_++) {
			if ((i_20_ ^ 0xffffffff) > (anIntArray10829[i_24_] ^ 0xffffffff)) {
				bool = false;
			} else {
				bool_23_ = false;
			}
		}
		int i_25_ = -1;
		int i_26_ = -1;
		int i_27_ = 0;
		if (i_22_ >= 0) {
			Class255 class255 = Class296.aClass186_5429.method1875(i_22_, 1);
			i_26_ = class255.anInt3234;
			i_27_ = class255.anInt3231;
		}
		if (bool_23_) {
			if (i_26_ == -1) {
				return;
			}
			i_25_ = 0;
			int i_28_ = 0;
			if (i_26_ == 0) {
				i_28_ = anIntArray10829[0];
			} else if ((i_26_ ^ 0xffffffff) == -2) {
				i_28_ = anIntArray10819[0];
			}
			for (int i_29_ = 1; i_29_ < CacheNode_Sub4.aClass1_9466.anInt117; i_29_++) {
				if ((i_26_ ^ 0xffffffff) != -1) {
					if (i_26_ == 1 && (i_28_ ^ 0xffffffff) < (anIntArray10819[i_29_] ^ 0xffffffff)) {
						i_28_ = anIntArray10819[i_29_];
						i_25_ = i_29_;
					}
				} else if (i_28_ > anIntArray10829[i_29_]) {
					i_28_ = anIntArray10829[i_29_];
					i_25_ = i_29_;
				}
			}
			if (i_26_ == 1 && (i_28_ ^ 0xffffffff) <= (i_19_ ^ 0xffffffff)) {
				return;
			}
		} else {
			if (bool) {
				aByte10850 = (byte) 0;
			}
			for (int i_30_ = 0; CacheNode_Sub4.aClass1_9466.anInt117 > i_30_; i_30_++) {
				int i_31_ = aByte10850;
				aByte10850 = (byte) ((1 + aByte10850) % CacheNode_Sub4.aClass1_9466.anInt117);
				if (anIntArray10829[i_31_] <= i_20_) {
					i_25_ = i_31_;
					break;
				}
			}
		}
		if (i_25_ >= 0) {
			anIntArray10866[i_25_] = i_22_;
			anIntArray10819[i_25_] = i_19_;
			anIntArray10873[i_25_] = i_21_;
			anIntArray10868[i_25_] = i;
			anIntArray10829[i_25_] = i_27_ + (i_20_ - -i_17_);
			anIntArray10869[i_25_] = hpPercentage;
		}
	}
	
	int getSize(byte b) {
		anInt10820++;
		if (b <= 43) {
			method865(49, 56, -61, -114, 70, -70);
		}
		return anInt10851;
	}
	
	final int method854(int i) {
		anInt10827++;
		Class259 class259 = method868((byte) -125);
		int i_32_ = aClass99_10893.anInt1281;
		boolean bool;
		if ((class259.anInt3258 ^ 0xffffffff) != -1) {
			bool = aClass99_10893.method1089(anInt10889, class259.anInt3283, -21712, class259.anInt3258);
		} else {
			bool = aClass99_10893.method1089(anInt10889, anInt10890, -21712, anInt10890);
		}
		if (i < 34) {
			return 25;
		}
		int i_33_ = aClass99_10893.anInt1281 - i_32_;
		if (i_33_ != 0) {
			anInt10877++;
		} else {
			anInt10877 = 0;
			aClass99_10893.method1088((byte) 61, anInt10889);
		}
		if (!bool) {
			if (class259.anInt3278 != 0) {
				aClass99_10898.method1089(0, class259.anInt3284, -21712, class259.anInt3278);
			} else {
				aClass99_10898.method1088((byte) 73, 0);
			}
			if ((class259.anInt3272 ^ 0xffffffff) == -1) {
				aClass99_10899.method1088((byte) 122, 0);
			} else {
				aClass99_10899.method1089(0, class259.anInt3289, -21712, class259.anInt3272);
			}
		} else {
			if (class259.anInt3278 != 0) {
				if (i_33_ > 0) {
					aClass99_10898.method1089(class259.anInt3250, class259.anInt3284, -21712, class259.anInt3278);
				} else {
					aClass99_10898.method1089(-class259.anInt3250, class259.anInt3284, -21712, class259.anInt3278);
				}
			}
			if ((class259.anInt3272 ^ 0xffffffff) != -1) {
				aClass99_10899.method1089(class259.anInt3285, class259.anInt3289, -21712, class259.anInt3272);
			}
		}
		return i_33_;
	}
	
	abstract int method855(byte b);
	
	final void method856(byte b, int i) {
		anInt10859++;
		Class259 class259 = method868((byte) -127);
		if (class259.anInt3258 != 0 || anInt10890 != 0) {
			aClass99_10893.method1084(true);
			int i_35_ = i - aClass99_10893.anInt1281 & 0x3fff;
			if (i_35_ > 8192) {
				anInt10889 = -16384 + i_35_ + aClass99_10893.anInt1281;
			} else {
				anInt10889 = i_35_ + aClass99_10893.anInt1281;
			}
		}
	}
	
	final void method857(DrawableModel drawablemodel, boolean bool) {
		if (bool != false) {
			method867(43);
		}
		anInt10831++;
		int i = aClass99_10898.anInt1281;
		int i_36_ = aClass99_10899.anInt1281;
		if (i != 0 || (i_36_ ^ 0xffffffff) != -1) {
			int i_37_ = drawablemodel.fa() / 2;
			drawablemodel.H(0, -i_37_, 0);
			drawablemodel.VA(i & 0x3fff);
			drawablemodel.FA(0x3fff & i_36_);
			drawablemodel.H(0, i_37_, 0);
		}
	}
	
	final boolean method813(int i) {
		if (i != 0) {
			anInt10877 = -63;
		}
		anInt10854++;
		return aBoolean10903;
	}
	
	final boolean method858(int i, int i_38_, int i_39_) {
		anInt10837++;
		if (anIntArray10881 == null) {
			if (i_39_ == -1) {
				return true;
			}
			anIntArray10881 = new int[Class63.aClass363_922.anIntArray4508.length];
			for (int i_40_ = 0; Class63.aClass363_922.anIntArray4508.length > i_40_; i_40_++)
				anIntArray10881[i_40_] = -1;
		}
		Class259 class259 = method868((byte) -123);
		int i_41_ = i;
		if (class259.anIntArray3255 != null && (class259.anIntArray3255[i_38_] ^ 0xffffffff) < -1) {
			i_41_ = class259.anIntArray3255[i_38_];
		}
		if (i_39_ == -1) {
			if (anIntArray10881[i_38_] == -1) {
				return true;
			}
			int i_42_ = aClass99_10893.method1086(16383);
			int i_43_ = anIntArray10881[i_38_];
			int i_44_ = -i_43_ + i_42_;
			if (-i_41_ <= i_44_ && (i_41_ ^ 0xffffffff) <= (i_44_ ^ 0xffffffff)) {
				anIntArray10881[i_38_] = -1;
				for (int i_45_ = 0; (Class63.aClass363_922.anIntArray4508.length ^ 0xffffffff) < (i_45_ ^ 0xffffffff); i_45_++) {
					if (anIntArray10881[i_45_] != -1) {
						return true;
					}
				}
				anIntArray10881 = null;
				return true;
			}
			if ((i_44_ ^ 0xffffffff) < -1 && i_44_ <= 8192 || i_44_ <= -8192) {
				anIntArray10881[i_38_] = Node_Sub30.method2723(i_41_ + i_43_, 16383);
			} else {
				anIntArray10881[i_38_] = Node_Sub30.method2723(16383, -i_41_ + i_43_);
			}
			return false;
		}
		if ((anIntArray10881[i_38_] ^ 0xffffffff) == 0) {
			anIntArray10881[i_38_] = aClass99_10893.method1086(16383);
		}
		int i_46_ = anIntArray10881[i_38_];
		int i_47_ = i_39_ - i_46_;
		if ((i_47_ ^ 0xffffffff) <= (-i_41_ ^ 0xffffffff) && i_41_ >= i_47_) {
			anIntArray10881[i_38_] = i_39_;
			return true;
		}
		if (((i_47_ ^ 0xffffffff) >= -1 || i_47_ > 8192) && i_47_ > -8192) {
			anIntArray10881[i_38_] = Node_Sub30.method2723(16383, i_46_ + -i_41_);
		} else {
			anIntArray10881[i_38_] = Node_Sub30.method2723(i_46_ - -i_41_, 16383);
		}
		return false;
	}
	
	static final boolean method859(int i, int i_48_, int i_49_, Animable_Sub2 animable_sub2, int i_50_) {
		anInt10830++;
		if (!Class12.aBoolean194 || !Mobile_Sub1.aBoolean10959) {
			return false;
		}
		if (Class233.anInt2786 < 100) {
			return false;
		}
		if (!Class313.method3649(true, i_48_, i_50_, i)) {
			return false;
		}
		int i_51_ = i << Class36.anInt549;
		int i_52_ = i_48_ << Class36.anInt549;
		int i_53_ = Class320_Sub10.aPlaneArray8300[i_50_].method3251(i_48_, i, (byte) -118) - 1;
		int i_54_ = animable_sub2.method817(2) + i_53_;
		if (animable_sub2.aShort9110 == 1) {
			if (!Class99.method1087(i_51_, i_52_, i_54_, i_54_, i_53_, (byte) 89, i_52_, Class179.anInt2129 + i_52_, i_51_, i_51_)) {
				return false;
			}
			if (!Class99.method1087(i_51_, i_52_, i_54_, i_53_, i_53_, (byte) 89, i_52_ + Class179.anInt2129, i_52_ + Class179.anInt2129, i_51_, i_51_)) {
				return false;
			}
			Node_Sub52.anInt7651++;
			return true;
		}
		if ((animable_sub2.aShort9110 ^ 0xffffffff) == -3) {
			if (!Class99.method1087(i_51_ - -Class179.anInt2129, i_52_ - -Class179.anInt2129, i_54_, i_54_, i_53_, (byte) 89, i_52_ - -Class179.anInt2129, Class179.anInt2129 + i_52_, i_51_, i_51_)) {
				return false;
			}
			if (!Class99.method1087(i_51_ + Class179.anInt2129, i_52_ - -Class179.anInt2129, i_53_, i_54_, i_53_, (byte) 89, Class179.anInt2129 + i_52_, i_52_ + Class179.anInt2129, i_51_, i_51_ + Class179.anInt2129)) {
				return false;
			}
			Node_Sub52.anInt7651++;
			return true;
		}
		if ((animable_sub2.aShort9110 ^ 0xffffffff) == -5) {
			if (!Class99.method1087(Class179.anInt2129 + i_51_, i_52_, i_54_, i_54_, i_53_, (byte) 89, i_52_, Class179.anInt2129 + i_52_, i_51_ - -Class179.anInt2129, Class179.anInt2129 + i_51_)) {
				return false;
			}
			if (!Class99.method1087(i_51_ + Class179.anInt2129, i_52_, i_54_, i_53_, i_53_, (byte) 89, Class179.anInt2129 + i_52_, Class179.anInt2129 + i_52_, i_51_ - -Class179.anInt2129, Class179.anInt2129 + i_51_)) {
				return false;
			}
			Node_Sub52.anInt7651++;
			return true;
		}
		if ((animable_sub2.aShort9110 ^ 0xffffffff) == -9) {
			if (!Class99.method1087(Class179.anInt2129 + i_51_, i_52_, i_54_, i_54_, i_53_, (byte) 89, i_52_, i_52_, i_51_, i_51_)) {
				return false;
			}
			if (!Class99.method1087(Class179.anInt2129 + i_51_, i_52_, i_53_, i_54_, i_53_, (byte) 89, i_52_, i_52_, i_51_, i_51_ + Class179.anInt2129)) {
				return false;
			}
			Node_Sub52.anInt7651++;
			return true;
		}
		if ((animable_sub2.aShort9110 ^ 0xffffffff) == -17) {
			if (!Node_Sub25.method2653(Class135.anInt1692, i_54_, i_51_, i_49_ ^ 0x1036, Class135.anInt1692 + i_52_, i_53_, Class135.anInt1692)) {
				return false;
			}
			Node_Sub52.anInt7651++;
			return true;
		}
		if ((animable_sub2.aShort9110 ^ 0xffffffff) == -33) {
			if (!Node_Sub25.method2653(Class135.anInt1692, i_54_, i_51_ + Class135.anInt1692, 255, Class135.anInt1692 + i_52_, i_53_, Class135.anInt1692)) {
				return false;
			}
			Node_Sub52.anInt7651++;
			return true;
		}
		if ((animable_sub2.aShort9110 ^ 0xffffffff) == -65) {
			if (!Node_Sub25.method2653(Class135.anInt1692, i_54_, Class135.anInt1692 + i_51_, 255, i_52_, i_53_, Class135.anInt1692)) {
				return false;
			}
			Node_Sub52.anInt7651++;
			return true;
		}
		if ((animable_sub2.aShort9110 ^ 0xffffffff) == -129) {
			if (!Node_Sub25.method2653(Class135.anInt1692, i_54_, i_51_, i_49_ + -4042, i_52_, i_53_, Class135.anInt1692)) {
				return false;
			}
			Node_Sub52.anInt7651++;
			return true;
		}
        return i_49_ == 4297;
    }
	
	final void sendGraphics(int slot, int rotation, boolean bool, int settings, int i_57_, int id) {
		Class165 class165 = aClass165Array10886[slot];
		int i_60_ = class165.graphicsId;
		do {
			if ((id ^ 0xffffffff) != 0 && i_60_ != -1) {
				if (i_60_ == id) {
					Class195 class195 = Class16.aClass101_228.method1090(-120, id);
					if (class195.aBoolean2402 && (class195.anInt2394 ^ 0xffffffff) != 0) {
						Class48 class48 = Class18.aClass37_306.method395(class195.anInt2394, (byte) -88);
						int i_61_ = class48.anInt706;
						if ((i_61_ ^ 0xffffffff) != -1) {
							if ((i_61_ ^ 0xffffffff) != -3) {
								break;
							}
							class165.anAnimator2026.method251(true);
						}
						return;
					}
				} else {
					Class195 class195 = Class16.aClass101_228.method1090(-120, id);
					Class195 class195_62_ = Class16.aClass101_228.method1090(-96, i_60_);
					if (class195.anInt2394 != -1 && (class195_62_.anInt2394 ^ 0xffffffff) != 0) {
						Class48 class48 = Class18.aClass37_306.method395(class195.anInt2394, (byte) -97);
						Class48 class48_63_ = Class18.aClass37_306.method395(class195_62_.anInt2394, (byte) -116);
						if (class48.anInt710 < class48_63_.anInt710) {
							return;
						}
					}
				}
			}
		} while (false);
		int i_64_ = 0;
		if (id != -1 && !Class16.aClass101_228.method1090(-107, id).aBoolean2402) {
			i_64_ = 2;
		}
		class165.anInt2027 = rotation;
		class165.anInt2025 = i_57_;
		class165.graphicsId = id;
		class165.graphicsHeight = settings >> 16;
		if (id != -1 && bool) {
			i_64_ = 1;
		}
		class165.anAnimator2026.method228(id == -1 ? -1 : Class16.aClass101_228.method1090(72, id).anInt2394, settings & 0xffff, (byte) 114, i_64_, false);
	}
	
	final void method861(int i, int i_65_) {
		if (i != -1000) {
			method823((byte) -92);
		}
		anInt10851 = i_65_;
		anInt10870++;
	}
	
	abstract boolean method862(byte b);
	
	static final void method863(byte[][] bs, byte b, Class277_Sub1 class277_sub1) {
		anInt10821++;
		int i = bs.length;
		for (int i_66_ = 0; i > i_66_; i_66_++) {
			byte[] bs_67_ = bs[i_66_];
			if (bs_67_ != null) {
				BufferedStream buffer = new BufferedStream(bs_67_);
				int i_68_ = Class262_Sub1.MAP_REGION_HASHES[i_66_] >> 8;
				int i_69_ = 0xff & Class262_Sub1.MAP_REGION_HASHES[i_66_];
				int i_70_ = i_68_ * 64 - Node_Sub53.gameSceneBaseX;
				int i_71_ = -Class320_Sub4.gameSceneBaseY + i_69_ * 64;
				CacheNode_Sub16_Sub1.method2387((byte) -114);
				class277_sub1.method3337(buffer, i_71_, Class304.SCENE_CLIP_DATA_PLANES, Class320_Sub4.gameSceneBaseY, (byte) -120, Node_Sub53.gameSceneBaseX, i_70_);
				class277_sub1.method3351(i_71_, buffer, i_70_, Class93.aGraphicsToolkit1241, 17986);
			}
		}
		if (b != -74) {
			aClass257_10823 = null;
		}
		for (int i_72_ = 0; i_72_ < i; i_72_++) {
			int i_73_ = -Node_Sub53.gameSceneBaseX + 64 * (Class262_Sub1.MAP_REGION_HASHES[i_72_] >> 8);
			int i_74_ = -Class320_Sub4.gameSceneBaseY + 64 * (0xff & Class262_Sub1.MAP_REGION_HASHES[i_72_]);
			byte[] bs_75_ = bs[i_72_];
			if (bs_75_ == null && Class277.anInt3527 < 800) {
				CacheNode_Sub16_Sub1.method2387((byte) -114);
				class277_sub1.method3338(-1, 64, i_73_, 64, i_74_);
			}
		}
	}
	
	final void method864(int i, String string, boolean bool, int i_76_, int i_77_) {
		anInt10824++;
		if (aClass59_10861 == null) {
			aClass59_10861 = new Class59();
		}
		aClass59_10861.anInt874 = i_76_;
		aClass59_10861.anInt871 = aClass59_10861.anInt872 = i;
		aClass59_10861.anInt865 = i_77_;
		aClass59_10861.aString877 = string;
		if (bool != false) {
			method848(105, 96, null, null, 123, -75, 51);
		}
	}
	
	Actor(int i) {
		super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		anInt10835 = -1000;
		anInt10857 = 0;
		anInt10853 = 0;
		aBoolean10826 = true;
		aByte10850 = (byte) 0;
		anInt10851 = 1;
		anInt10863 = -1;
		anInt10849 = 0;
		anIntArray10829 = new int[CacheNode_Sub4.aClass1_9466.anInt117];
		aBoolean10867 = false;
		anIntArray10868 = new int[CacheNode_Sub4.aClass1_9466.anInt117];
		faceEntity = -1;
		anIntArray10873 = new int[CacheNode_Sub4.aClass1_9466.anInt117];
		anIntArray10869 = new int[CacheNode_Sub4.aClass1_9466.anInt117];
		aBoolean10871 = false;
		anIntArray10866 = new int[CacheNode_Sub4.aClass1_9466.anInt117];
		anInt10875 = -32768;
		anInt10874 = -1000;
		anAnimator10860 = new AnimableAnimator(this, false);
		anAnimator10876 = new AnimableAnimator(this, false);
		anInt10877 = 0;
		anInt10890 = 256;
		anInt10882 = -1;
		anInt10880 = 0;
		aByte10888 = (byte) 0;
		anInt10895 = -1;
		aClass99_10893 = new Class99();
		aClass99_10898 = new Class99();
		aClass99_10899 = new Class99();
		anInt10900 = 0;
		anInt10901 = 0;
		anInt10904 = 0;
		anInt10907 = 0;
		aBoolean10903 = false;
		aBoolean10906 = false;
		scenePositionYQueue = new int[i];
		scenePositionXQueue = new int[i];
		aClass165Array10886 = new Class165[4];
		movementTypeQueue = new byte[i];
		aDrawableModelArray10909 = new DrawableModel[5];
		for (int i_78_ = 0; (i_78_ ^ 0xffffffff) > -5; i_78_++)
			aClass165Array10886[i_78_] = new Class165(this);
		anAnimableAnimator_Sub1Array10894 = new AnimableAnimator_Sub1[Class63.aClass363_922.anIntArray4508.length];
	}
	
	final void method865(int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_) {
		anInt10840++;
		int i_84_ = aShort9130 + aShort9119 >> 1;
		int i_85_ = aShort9124 - -aShort9120 >> 1;
		int i_86_ = Class335.anIntArray4167[i];
		int i_87_ = Class335.anIntArray4165[i];
		int i_88_ = -i_81_ / 2;
		int i_89_ = -i_82_ / 2;
		int i_90_ = i_86_ * i_89_ + i_88_ * i_87_ >> 14;
		int i_91_ = i_89_ * i_87_ + -(i_88_ * i_86_) >> 14;
		int i_92_ = Class170.method1790(i_91_ + anInt5940, plane, (byte) 121, i_84_, i_85_, i_90_ + anInt5934);
		int i_93_ = i_81_ / 2;
		int i_94_ = -i_82_ / 2;
		int i_95_ = i_87_ * i_93_ + i_94_ * i_86_ >> 14;
		int i_96_ = -(i_86_ * i_93_) + i_87_ * i_94_ >> 14;
		int i_97_ = Class170.method1790(i_96_ + anInt5940, plane, (byte) 127, i_84_, i_85_, i_95_ + anInt5934);
		int i_98_ = -i_81_ / 2;
		int i_99_ = i_82_ / 2;
		int i_100_ = i_86_ * i_99_ + i_98_ * i_87_ >> 14;
		int i_101_ = i_99_ * i_87_ + -(i_98_ * i_86_) >> 14;
		int i_102_ = Class170.method1790(i_101_ + anInt5940, plane, (byte) 116, i_84_, i_85_, anInt5934 - -i_100_);
		int i_103_ = i_81_ / 2;
		int i_104_ = i_82_ / 2;
		int i_105_ = i_86_ * i_104_ + i_87_ * i_103_ >> 14;
		int i_106_ = i_104_ * i_87_ + -(i_103_ * i_86_) >> 14;
		int i_107_ = Class170.method1790(i_106_ + anInt5940, plane, (byte) 113, i_84_, i_85_, anInt5934 - -i_105_);
		int i_108_ = i_92_ < i_97_ ? i_92_ : i_97_;
		int i_109_ = i_107_ > i_102_ ? i_102_ : i_107_;
		int i_110_ = i_97_ >= i_107_ ? i_107_ : i_97_;
		anInt10872 = 0x3fff & (int) (2607.5945876176133 * Math.atan2((double) (-i_109_ + i_108_), (double) i_82_));
		int i_111_ = i_102_ > i_92_ ? i_92_ : i_102_;
		anInt10862 = (int) (Math.atan2((double) (i_111_ - i_110_), (double) i_81_) * 2607.5945876176133) & 0x3fff;
		if (i_83_ < -78) {
			if (anInt10872 != 0 && i_79_ != 0) {
				int i_112_ = -i_79_ + 16384;
				if ((anInt10872 ^ 0xffffffff) < -8193) {
					if (i_112_ > anInt10872) {
						anInt10872 = i_112_;
					}
				} else if ((anInt10872 ^ 0xffffffff) < (i_79_ ^ 0xffffffff)) {
					anInt10872 = i_79_;
				}
			}
			anInt10832 = i_107_ + i_92_;
			if (anInt10862 != 0 && (i_80_ ^ 0xffffffff) != -1) {
				int i_113_ = -i_80_ + 16384;
				if ((anInt10862 ^ 0xffffffff) < -8193) {
					if (i_113_ > anInt10862) {
						anInt10862 = i_113_;
					}
				} else if (i_80_ < anInt10862) {
					anInt10862 = i_80_;
				}
			}
			if (anInt10832 > i_97_ + i_102_) {
				anInt10832 = i_97_ + i_102_;
			}
			anInt10832 = -anInt5937 + (anInt10832 >> 1);
		}
	}
	
	public Actor() {
		this(10);
	}
	
	final void method866(int[] is, int[] is_114_, byte b) {
		anInt10818++;
		if (anIntArray10845 != null || is_114_ == null) {
			if (is_114_ == null) {
				anIntArray10845 = null;
				return;
			}
		} else {
			anIntArray10845 = new int[Class63.aClass363_922.anIntArray4508.length];
		}
		if (b <= 66) {
			anAnimator10860 = null;
		}
		for (int i = 0; (anIntArray10845.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			anIntArray10845[i] = -1;
		for (int i = 0; is_114_.length > i; i++) {
			int i_115_ = is[i];
			for (int i_116_ = 0; (i_116_ ^ 0xffffffff) > (anIntArray10845.length ^ 0xffffffff); i_116_++) {
				if ((i_115_ & 0x1 ^ 0xffffffff) != -1) {
					anIntArray10845[i_116_] = is_114_[i];
				}
				i_115_ >>= 1;
			}
		}
	}
	
	final void method867(int i) {
		anInt10852++;
		anInt10904 = 0;
		anInt10900 = 0;
		if (i != 536) {
			method852(-41, -53, 68, (byte) 3, 0, -125, -10, 112);
		}
	}
	
	protected final void finalize() {
		if (anEntityNode_Sub4_10902 != null) {
			anEntityNode_Sub4_10902.method953();
		}
		anInt10836++;
	}
	
	final Class259 method868(byte b) {
		if (b > -122) {
			return null;
		}
		anInt10822++;
		int i = method871(0);
		if ((i ^ 0xffffffff) == 0) {
			return Class342.aClass259_4233;
		}
		return InputStream_Sub2.aClass281_83.method3383((byte) 119, i);
	}
	
	final boolean method814(byte b) {
		anInt10846++;
		return false;
	}
	
	abstract Class59 method869(int i);
	
	final void method870(GraphicsToolkit graphicstoolkit, byte b, boolean bool, DrawableModel[] drawablemodels, Class336 class336) {
		if (bool) {
			if (anEntityNode_Sub4_10902 != null) {
				anEntityNode_Sub4_10902.method958((long) Class174.clientCycle);
			}
		} else {
			int i = 0;
			int i_117_ = 0;
			int i_118_ = 0;
			int i_119_ = 0;
			int i_120_ = -1;
			int i_121_ = -1;
			Class300[][] class300s = new Class300[drawablemodels.length][];
			Class218[][] class218s = new Class218[drawablemodels.length][];
			for (int i_122_ = 0; (drawablemodels.length ^ 0xffffffff) < (i_122_ ^ 0xffffffff); i_122_++) {
				if (drawablemodels[i_122_] != null) {
					drawablemodels[i_122_].method614(class336);
					class300s[i_122_] = drawablemodels[i_122_].method620();
					class218s[i_122_] = drawablemodels[i_122_].method618();
					if (class300s[i_122_] != null) {
						i_120_ = i_122_;
						i += class300s[i_122_].length;
						i_117_++;
					}
					if (class218s[i_122_] != null) {
						i_121_ = i_122_;
						i_119_++;
						i_118_ += class218s[i_122_].length;
					}
				}
			}
			if ((anEntityNode_Sub4_10902 == null || anEntityNode_Sub4_10902.aBoolean5972) && ((i_117_ ^ 0xffffffff) < -1 || i_119_ > 0)) {
				anEntityNode_Sub4_10902 = EntityNode_Sub4.method963(Class174.clientCycle, true);
			}
			if (anEntityNode_Sub4_10902 != null) {
				Class300[] class300s_123_;
				if (i_117_ != 1) {
					class300s_123_ = new Class300[i];
					int i_124_ = 0;
					for (int i_125_ = 0; (i_125_ ^ 0xffffffff) > (drawablemodels.length ^ 0xffffffff); i_125_++) {
						if (class300s[i_125_] != null) {
							Class311.method3605(class300s[i_125_], 0, class300s_123_, i_124_, class300s[i_125_].length);
							i_124_ += class300s[i_125_].length;
						}
					}
				} else {
					class300s_123_ = class300s[i_120_];
				}
				Class218[] class218s_127_;
				if ((i_119_ ^ 0xffffffff) == -2) {
					class218s_127_ = class218s[i_121_];
				} else {
					class218s_127_ = new Class218[i_118_];
					int i_128_ = 0;
					for (int i_129_ = 0; (i_129_ ^ 0xffffffff) > (drawablemodels.length ^ 0xffffffff); i_129_++) {
						if (class218s[i_129_] != null) {
							Class311.method3605(class218s[i_129_], 0, class218s_127_, i_128_, class218s[i_129_].length);
							i_128_ += class218s[i_129_].length;
						}
					}
				}
				anEntityNode_Sub4_10902.method952(graphicstoolkit, (long) Class174.clientCycle, class300s_123_, class218s_127_, false);
				aBoolean10906 = true;
			}
		}
		anInt10825++;
		if (b != 45) {
			method866(null, null, (byte) 57);
		}
		if (anEntityNode_Sub4_10902 != null) {
			anEntityNode_Sub4_10902.method967(plane, aShort9119, aShort9130, aShort9120, aShort9124);
		}
	}
	
	abstract int method871(int i);
}
