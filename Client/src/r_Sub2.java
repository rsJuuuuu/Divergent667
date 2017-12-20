/* r_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class r_Sub2 extends r
{
	static int anInt11053;
	static int anInt11054;
	protected int anInt11055;
	static IncommingPacket aClass192_11056;
	protected int anInt11057;
	protected byte[] aByteArray11058;
	static int anInt11059;
	static int anInt11060;
	static int anInt11061;
	static int anInt11062;
	static Class253[] aClass253Array11063 = new Class253[100];
	protected int anInt11064;
	static int anInt11065;
	static int anInt11066;
	protected int anInt11067;
	
	final void method2370(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt11062++;
		int i_6_ = 0;
		if ((i_2_ ^ 0xffffffff) != (i_0_ ^ 0xffffffff)) {
			i_6_ = (i_1_ + -i << 16) / (-i_0_ + i_2_);
		}
		if (i_5_ >= 36) {
			int i_7_ = 0;
			if ((i_3_ ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
				i_7_ = (i_4_ - i_1_ << 16) / (i_3_ + -i_2_);
			}
			int i_8_ = 0;
			if (i_0_ != i_3_) {
				i_8_ = (-i_4_ + i << 16) / (-i_3_ + i_0_);
			}
			if ((i_0_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff) && (i_0_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff)) {
				if ((i_3_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
					i_4_ = i <<= 16;
					if (i_0_ < 0) {
						i -= i_6_ * i_0_;
						i_4_ -= i_0_ * i_8_;
						i_0_ = 0;
					}
					i_1_ <<= 16;
					if (i_2_ < 0) {
						i_1_ -= i_2_ * i_7_;
						i_2_ = 0;
					}
					if ((i_0_ == i_2_ || (i_6_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)) && ((i_0_ ^ 0xffffffff) != (i_2_ ^ 0xffffffff) || (i_8_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff))) {
						i_3_ -= i_2_;
						i_2_ -= i_0_;
						i_0_ *= anInt11057;
						while (--i_2_ >= 0) {
							Class262_Sub16.method3196(i_4_ >> 16, aByteArray11058, i_0_, (byte) -24, 0, i >> 16);
							i += i_6_;
							i_0_ += anInt11057;
							i_4_ += i_8_;
						}
						while ((--i_3_ ^ 0xffffffff) <= -1) {
							Class262_Sub16.method3196(i_4_ >> 16, aByteArray11058, i_0_, (byte) -24, 0, i_1_ >> 16);
							i_0_ += anInt11057;
							i_4_ += i_8_;
							i_1_ += i_7_;
						}
					} else {
						i_3_ -= i_2_;
						i_2_ -= i_0_;
						i_0_ = anInt11057 * i_0_;
						while (--i_2_ >= 0) {
							Class262_Sub16.method3196(i >> 16, aByteArray11058, i_0_, (byte) -24, 0, i_4_ >> 16);
							i_4_ += i_8_;
							i_0_ += anInt11057;
							i += i_6_;
						}
						while (--i_3_ >= 0) {
							Class262_Sub16.method3196(i_1_ >> 16, aByteArray11058, i_0_, (byte) -24, 0, i_4_ >> 16);
							i_0_ += anInt11057;
							i_1_ += i_7_;
							i_4_ += i_8_;
						}
					}
				} else {
					i_1_ = i <<= 16;
					i_4_ <<= 16;
					if ((i_0_ ^ 0xffffffff) > -1) {
						i -= i_6_ * i_0_;
						i_1_ -= i_8_ * i_0_;
						i_0_ = 0;
					}
					if (i_3_ < 0) {
						i_4_ -= i_7_ * i_3_;
						i_3_ = 0;
					}
					if ((i_0_ ^ 0xffffffff) != (i_3_ ^ 0xffffffff) && (i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff) || (i_3_ ^ 0xffffffff) == (i_0_ ^ 0xffffffff) && i_7_ > i_6_) {
						i_2_ -= i_3_;
						i_3_ -= i_0_;
						i_0_ *= anInt11057;
						while (--i_3_ >= 0) {
							Class262_Sub16.method3196(i >> 16, aByteArray11058, i_0_, (byte) -24, 0, i_1_ >> 16);
							i_1_ += i_8_;
							i += i_6_;
							i_0_ += anInt11057;
						}
						while (--i_2_ >= 0) {
							Class262_Sub16.method3196(i >> 16, aByteArray11058, i_0_, (byte) -24, 0, i_4_ >> 16);
							i_0_ += anInt11057;
							i_4_ += i_7_;
							i += i_6_;
						}
					} else {
						i_2_ -= i_3_;
						i_3_ -= i_0_;
						i_0_ *= anInt11057;
						while (--i_3_ >= 0) {
							Class262_Sub16.method3196(i_1_ >> 16, aByteArray11058, i_0_, (byte) -24, 0, i >> 16);
							i += i_6_;
							i_1_ += i_8_;
							i_0_ += anInt11057;
						}
						while ((--i_2_ ^ 0xffffffff) <= -1) {
							Class262_Sub16.method3196(i_4_ >> 16, aByteArray11058, i_0_, (byte) -24, 0, i >> 16);
							i_4_ += i_7_;
							i += i_6_;
							i_0_ += anInt11057;
						}
					}
				}
			} else if (i_2_ > i_3_) {
				if (i_0_ < i_2_) {
					i_1_ = i_4_ <<= 16;
					i <<= 16;
					if ((i_3_ ^ 0xffffffff) > -1) {
						i_1_ -= i_3_ * i_7_;
						i_4_ -= i_8_ * i_3_;
						i_3_ = 0;
					}
					if (i_0_ < 0) {
						i -= i_0_ * i_6_;
						i_0_ = 0;
					}
					if (i_8_ > i_7_) {
						i_2_ -= i_0_;
						i_0_ -= i_3_;
						i_3_ = anInt11057 * i_3_;
						while (--i_0_ >= 0) {
							Class262_Sub16.method3196(i_4_ >> 16, aByteArray11058, i_3_, (byte) -24, 0, i_1_ >> 16);
							i_1_ += i_7_;
							i_3_ += anInt11057;
							i_4_ += i_8_;
						}
						while (--i_2_ >= 0) {
							Class262_Sub16.method3196(i >> 16, aByteArray11058, i_3_, (byte) -24, 0, i_1_ >> 16);
							i += i_6_;
							i_1_ += i_7_;
							i_3_ += anInt11057;
						}
					} else {
						i_2_ -= i_0_;
						i_0_ -= i_3_;
						i_3_ = anInt11057 * i_3_;
						while (--i_0_ >= 0) {
							Class262_Sub16.method3196(i_1_ >> 16, aByteArray11058, i_3_, (byte) -24, 0, i_4_ >> 16);
							i_3_ += anInt11057;
							i_4_ += i_8_;
							i_1_ += i_7_;
						}
						while ((--i_2_ ^ 0xffffffff) <= -1) {
							Class262_Sub16.method3196(i_1_ >> 16, aByteArray11058, i_3_, (byte) -24, 0, i >> 16);
							i_1_ += i_7_;
							i += i_6_;
							i_3_ += anInt11057;
						}
					}
				} else {
					i = i_4_ <<= 16;
					if ((i_3_ ^ 0xffffffff) > -1) {
						i_4_ -= i_3_ * i_8_;
						i -= i_3_ * i_7_;
						i_3_ = 0;
					}
					i_1_ <<= 16;
					if ((i_2_ ^ 0xffffffff) > -1) {
						i_1_ -= i_2_ * i_6_;
						i_2_ = 0;
					}
					if ((i_8_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff)) {
						i_0_ -= i_2_;
						i_2_ -= i_3_;
						i_3_ = anInt11057 * i_3_;
						while (--i_2_ >= 0) {
							Class262_Sub16.method3196(i_4_ >> 16, aByteArray11058, i_3_, (byte) -24, 0, i >> 16);
							i_3_ += anInt11057;
							i += i_7_;
							i_4_ += i_8_;
						}
						while (--i_0_ >= 0) {
							Class262_Sub16.method3196(i_4_ >> 16, aByteArray11058, i_3_, (byte) -24, 0, i_1_ >> 16);
							i_1_ += i_6_;
							i_3_ += anInt11057;
							i_4_ += i_8_;
						}
					} else {
						i_0_ -= i_2_;
						i_2_ -= i_3_;
						i_3_ *= anInt11057;
						while ((--i_2_ ^ 0xffffffff) <= -1) {
							Class262_Sub16.method3196(i >> 16, aByteArray11058, i_3_, (byte) -24, 0, i_4_ >> 16);
							i += i_7_;
							i_4_ += i_8_;
							i_3_ += anInt11057;
						}
						while ((--i_0_ ^ 0xffffffff) <= -1) {
							Class262_Sub16.method3196(i_1_ >> 16, aByteArray11058, i_3_, (byte) -24, 0, i_4_ >> 16);
							i_1_ += i_6_;
							i_4_ += i_8_;
							i_3_ += anInt11057;
						}
					}
				}
			} else if (i_3_ < i_0_) {
				i = i_1_ <<= 16;
				if ((i_2_ ^ 0xffffffff) > -1) {
					i_1_ -= i_2_ * i_7_;
					i -= i_2_ * i_6_;
					i_2_ = 0;
				}
				i_4_ <<= 16;
				if ((i_3_ ^ 0xffffffff) > -1) {
					i_4_ -= i_3_ * i_8_;
					i_3_ = 0;
				}
				if (i_2_ != i_3_ && (i_6_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff) || i_2_ == i_3_ && (i_6_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
					i_0_ -= i_3_;
					i_3_ -= i_2_;
					i_2_ *= anInt11057;
					while (--i_3_ >= 0) {
						Class262_Sub16.method3196(i_1_ >> 16, aByteArray11058, i_2_, (byte) -24, 0, i >> 16);
						i += i_6_;
						i_1_ += i_7_;
						i_2_ += anInt11057;
					}
					while (--i_0_ >= 0) {
						Class262_Sub16.method3196(i_4_ >> 16, aByteArray11058, i_2_, (byte) -24, 0, i >> 16);
						i_4_ += i_8_;
						i_2_ += anInt11057;
						i += i_6_;
					}
				} else {
					i_0_ -= i_3_;
					i_3_ -= i_2_;
					i_2_ *= anInt11057;
					while ((--i_3_ ^ 0xffffffff) <= -1) {
						Class262_Sub16.method3196(i >> 16, aByteArray11058, i_2_, (byte) -24, 0, i_1_ >> 16);
						i_1_ += i_7_;
						i_2_ += anInt11057;
						i += i_6_;
					}
					while (--i_0_ >= 0) {
						Class262_Sub16.method3196(i >> 16, aByteArray11058, i_2_, (byte) -24, 0, i_4_ >> 16);
						i_2_ += anInt11057;
						i += i_6_;
						i_4_ += i_8_;
					}
				}
			} else {
				i_4_ = i_1_ <<= 16;
				if ((i_2_ ^ 0xffffffff) > -1) {
					i_4_ -= i_2_ * i_6_;
					i_1_ -= i_2_ * i_7_;
					i_2_ = 0;
				}
				i <<= 16;
				if (i_0_ < 0) {
					i -= i_0_ * i_8_;
					i_0_ = 0;
				}
				if ((i_7_ ^ 0xffffffff) >= (i_6_ ^ 0xffffffff)) {
					i_3_ -= i_0_;
					i_0_ -= i_2_;
					i_2_ = anInt11057 * i_2_;
					while ((--i_0_ ^ 0xffffffff) <= -1) {
						Class262_Sub16.method3196(i_4_ >> 16, aByteArray11058, i_2_, (byte) -24, 0, i_1_ >> 16);
						i_1_ += i_7_;
						i_2_ += anInt11057;
						i_4_ += i_6_;
					}
					while ((--i_3_ ^ 0xffffffff) <= -1) {
						Class262_Sub16.method3196(i >> 16, aByteArray11058, i_2_, (byte) -24, 0, i_1_ >> 16);
						i += i_8_;
						i_1_ += i_7_;
						i_2_ += anInt11057;
					}
				} else {
					i_3_ -= i_0_;
					i_0_ -= i_2_;
					i_2_ = anInt11057 * i_2_;
					while (--i_0_ >= 0) {
						Class262_Sub16.method3196(i_1_ >> 16, aByteArray11058, i_2_, (byte) -24, 0, i_4_ >> 16);
						i_4_ += i_6_;
						i_2_ += anInt11057;
						i_1_ += i_7_;
					}
					while ((--i_3_ ^ 0xffffffff) <= -1) {
						Class262_Sub16.method3196(i_1_ >> 16, aByteArray11058, i_2_, (byte) -24, 0, i >> 16);
						i_1_ += i_7_;
						i += i_8_;
						i_2_ += anInt11057;
					}
				}
			}
		}
	}
	
	static final Frame method2371(int i, SignLink signlink, int i_9_, int i_10_, int i_11_, int i_12_) {
		anInt11060++;
		if (!signlink.method3640(i_9_ + 28892)) {
			return null;
		}
		if (i == 0) {
			Class244[] class244s = Node_Sub38_Sub34.method2901(signlink, true);
			if (class244s == null) {
				return null;
			}
			boolean bool = false;
			for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (class244s.length ^ 0xffffffff); i_13_++) {
				if (class244s[i_13_].anInt3084 == i_11_ && class244s[i_13_].anInt3078 == i_10_ && (i_12_ == 0 || (class244s[i_13_].anInt3077 ^ 0xffffffff) == (i_12_ ^ 0xffffffff)) && (!bool || class244s[i_13_].anInt3079 > i)) {
					bool = true;
					i = class244s[i_13_].anInt3079;
				}
			}
			if (!bool) {
				return null;
			}
		}
		Class241 class241 = signlink.method3627(i, i_10_, -1071975440, i_11_, i_12_);
		while (class241.anInt2953 == 0)
			Class262_Sub22.method3208(10L, false);
		Frame frame = (Frame) class241.anObject2956;
		if (frame == null) {
			return null;
		}
		if (i_9_ != -28769) {
			method2376(45);
		}
		if ((class241.anInt2953 ^ 0xffffffff) == -3) {
			Node_Sub25_Sub4.method2679(signlink, 0, frame);
			return null;
		}
		return frame;
	}
	
	final void method2372(int i, int i_14_, byte b, int i_15_, int i_16_) {
		anInt11057 = i + -i_16_;
		anInt11064 = i_16_;
		anInt11055 = i_15_ + -i_14_;
		anInt11061++;
		anInt11067 = i_14_;
	}
	
	final boolean method2373(int i, int i_18_, int i_19_) {
		anInt11053++;
		if (i_18_ != 0) {
			return true;
		}
        return (i * i_19_ ^ 0xffffffff) >= (aByteArray11058.length ^ 0xffffffff);
    }
	
	final void method2374(int i) {
		anInt11065++;
		int i_20_ = -1;
		int i_21_ = aByteArray11058.length + i;
		while ((i_21_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff)) {
			aByteArray11058[++i_20_] = (byte) 0;
			aByteArray11058[++i_20_] = (byte) 0;
			aByteArray11058[++i_20_] = (byte) 0;
			aByteArray11058[++i_20_] = (byte) 0;
			aByteArray11058[++i_20_] = (byte) 0;
			aByteArray11058[++i_20_] = (byte) 0;
			aByteArray11058[++i_20_] = (byte) 0;
			aByteArray11058[++i_20_] = (byte) 0;
		}
		while ((i_20_ ^ 0xffffffff) > (-1 + aByteArray11058.length ^ 0xffffffff))
			aByteArray11058[++i_20_] = (byte) 0;
	}
	
	static final void method2375(boolean bool, byte b, Actor actor) {
		anInt11059++;
		int i = -1;
		if (b != -49) {
			aClass192_11056 = null;
		}
		int i_22_ = 0;
		if ((actor.toFirstTileTicketDelay ^ 0xffffffff) < (Class174.clientCycle ^ 0xffffffff)) {
			Class238.method3020(b + 49, actor);
		} else if ((Class174.clientCycle ^ 0xffffffff) < (actor.toSecondTileTicketDelay ^ 0xffffffff)) {
			Node_Sub20.method2614(true, actor, bool);
			i = Class275.anInt5412;
			i_22_ = Class320_Sub23.anInt8431;
		} else {
			Class186.method1870((byte) 69, actor);
		}
		if ((actor.anInt5934 ^ 0xffffffff) > -513 || (actor.anInt5940 ^ 0xffffffff) > -513 || (Node_Sub54.GAME_SCENE_WDITH * 512 + -512 ^ 0xffffffff) >= (actor.anInt5934 ^ 0xffffffff) || (actor.anInt5940 ^ 0xffffffff) <= (Class377_Sub1.GAME_SCENE_HEIGHT * 512 - 512 ^ 0xffffffff)) {
			actor.anAnimator10876.method249(true, -1);
			for (int i_23_ = 0; i_23_ < actor.aClass165Array10886.length; i_23_++) {
				actor.aClass165Array10886[i_23_].graphicsId = -1;
				actor.aClass165Array10886[i_23_].anAnimator2026.method249(true, -1);
			}
			actor.toFirstTileTicketDelay = 0;
			i = -1;
			actor.toSecondTileTicketDelay = 0;
			actor.anIntArray10817 = null;
			i_22_ = 0;
			actor.anInt5934 = actor.scenePositionXQueue[0] * 512 - -(actor.getSize((byte) 97) * 256);
			actor.anInt5940 = actor.scenePositionYQueue[0] * 512 - -(actor.getSize((byte) 113) * 256);
			actor.method867(536);
		}
		if (actor == Class295.myPlayer && ((actor.anInt5934 ^ 0xffffffff) > -6145 || actor.anInt5940 < 6144 || (actor.anInt5934 ^ 0xffffffff) <= (-6144 + 512 * Node_Sub54.GAME_SCENE_WDITH ^ 0xffffffff) || (-6144 + Class377_Sub1.GAME_SCENE_HEIGHT * 512 ^ 0xffffffff) >= (actor.anInt5940 ^ 0xffffffff))) {
			actor.anAnimator10876.method249(true, -1);
			for (int i_24_ = 0; i_24_ < actor.aClass165Array10886.length; i_24_++) {
				actor.aClass165Array10886[i_24_].graphicsId = -1;
				actor.aClass165Array10886[i_24_].anAnimator2026.method249(true, -1);
			}
			actor.toFirstTileTicketDelay = 0;
			actor.toSecondTileTicketDelay = 0;
			actor.anIntArray10817 = null;
			i_22_ = 0;
			i = -1;
			actor.anInt5934 = 512 * actor.scenePositionXQueue[0] + 256 * actor.getSize((byte) 69);
			actor.anInt5940 = actor.scenePositionYQueue[0] * 512 + 256 * actor.getSize((byte) 49);
			actor.method867(536);
		}
		int i_25_ = Class59.method586(-32769, actor);
		Class76.method769(actor, true);
		Class352.method4009(i, i_25_, i_22_, -1, actor);
		Class372.method4103(65, actor, i);
		Class34.method370(actor, (byte) 38);
	}
	
	static final void method2376(int i) {
		Node_Sub24.method2650(false, -14651);
		anInt11066++;
		Node_Sub29_Sub2.anInt10015 = 0;
		boolean bool = true;
		for (int i_26_ = 0; (Class188_Sub1_Sub1.aByteArrayArray9334.length ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
			if (StandardPlane.anIntArray7980[i_26_] != -1 && Class188_Sub1_Sub1.aByteArrayArray9334[i_26_] == null) {
				Class188_Sub1_Sub1.aByteArrayArray9334[i_26_] = Animable_Sub1_Sub1.aClass302_10618.method3524(false, 0, StandardPlane.anIntArray7980[i_26_]);
				if (Class188_Sub1_Sub1.aByteArrayArray9334[i_26_] == null) {
					Node_Sub29_Sub2.anInt10015++;
					bool = false;
				}
			}
			if (Class144.anIntArray1789[i_26_] != -1 && FileOnDisk.aByteArrayArray1331[i_26_] == null) {
				FileOnDisk.aByteArrayArray1331[i_26_] = Animable_Sub1_Sub1.aClass302_10618.method3512(Class15.XTEA_KEYS[i_26_], 0, -114, Class144.anIntArray1789[i_26_]);
				if (FileOnDisk.aByteArrayArray1331[i_26_] == null) {
					bool = false;
					Node_Sub29_Sub2.anInt10015++;
				}
			}
			if (Class42.anIntArray645[i_26_] != -1 && Class320_Sub6.aByteArrayArray8263[i_26_] == null) {
				Class320_Sub6.aByteArrayArray8263[i_26_] = Animable_Sub1_Sub1.aClass302_10618.method3524(false, 0, Class42.anIntArray645[i_26_]);
				if (Class320_Sub6.aByteArrayArray8263[i_26_] == null) {
					Node_Sub29_Sub2.anInt10015++;
					bool = false;
				}
			}
			if (ProducingGraphicsBuffer.anIntArray9895[i_26_] != -1 && Class320_Sub18.aByteArrayArray8378[i_26_] == null) {
				Class320_Sub18.aByteArrayArray8378[i_26_] = Animable_Sub1_Sub1.aClass302_10618.method3524(false, 0, ProducingGraphicsBuffer.anIntArray9895[i_26_]);
				if (Class320_Sub18.aByteArrayArray8378[i_26_] == null) {
					Node_Sub29_Sub2.anInt10015++;
					bool = false;
				}
			}
			if (Class204.anIntArray2460 != null && Class194.aByteArrayArray2373[i_26_] == null && (Class204.anIntArray2460[i_26_] ^ 0xffffffff) != 0) {
				Class194.aByteArrayArray2373[i_26_] = Animable_Sub1_Sub1.aClass302_10618.method3512(Class15.XTEA_KEYS[i_26_], 0, 118, Class204.anIntArray2460[i_26_]);
				if (Class194.aByteArrayArray2373[i_26_] == null) {
					Node_Sub29_Sub2.anInt10015++;
					bool = false;
				}
			}
		}
		if (Class262_Sub15_Sub1.aClass224_10520 == null) {
			if (Class92.aCacheNode_Sub11_1233 != null && r_Sub1.aClass302_11047.method3516(Class92.aCacheNode_Sub11_1233.aString9537 + "_staticelements", -73)) {
				if (r_Sub1.aClass302_11047.method3527(Class92.aCacheNode_Sub11_1233.aString9537 + "_staticelements", 0)) {
					Class262_Sub15_Sub1.aClass224_10520 = Class152.method1695(Class101.aBoolean1313, 0, r_Sub1.aClass302_11047, Class92.aCacheNode_Sub11_1233.aString9537 + "_staticelements");
				} else {
					bool = false;
					Node_Sub29_Sub2.anInt10015++;
				}
			} else {
				Class262_Sub15_Sub1.aClass224_10520 = new Class224(0);
			}
		}
		if (!bool) {
			Class118.anInt5407 = 1;
		} else {
			bool = true;
			Node_Sub2.anInt6937 = 0;
			for (int i_27_ = 0; (Class188_Sub1_Sub1.aByteArrayArray9334.length ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
				byte[] bs = FileOnDisk.aByteArrayArray1331[i_27_];
				if (bs != null) {
					int i_28_ = (Class262_Sub1.MAP_REGION_HASHES[i_27_] >> 8) * 64 - Node_Sub53.gameSceneBaseX;
					int i_29_ = 64 * (Class262_Sub1.MAP_REGION_HASHES[i_27_] & 0xff) + -Class320_Sub4.gameSceneBaseY;
					if ((Class61.anInt898 ^ 0xffffffff) != -1) {
						i_28_ = 10;
						i_29_ = 10;
					}
					bool &= Class118.method1175(bs, -1, i_28_, Node_Sub54.GAME_SCENE_WDITH, i_29_, Class377_Sub1.GAME_SCENE_HEIGHT);
				}
				bs = Class320_Sub18.aByteArrayArray8378[i_27_];
				if (bs != null) {
					int i_30_ = (Class262_Sub1.MAP_REGION_HASHES[i_27_] >> 8) * 64 + -Node_Sub53.gameSceneBaseX;
					int i_31_ = -Class320_Sub4.gameSceneBaseY + (0xff & Class262_Sub1.MAP_REGION_HASHES[i_27_]) * 64;
					if (Class61.anInt898 != 0) {
						i_31_ = 10;
						i_30_ = 10;
					}
					bool &= Class118.method1175(bs, -1, i_30_, Node_Sub54.GAME_SCENE_WDITH, i_31_, Class377_Sub1.GAME_SCENE_HEIGHT);
				}
			}
			if (!bool) {
				Class118.anInt5407 = 2;
			} else {
				if ((Class118.anInt5407 ^ 0xffffffff) != -1) {
					Class169_Sub3.method1779(Class93.aGraphicsToolkit1241, Class22.loading_translation.method297(Class35.language) + "<br>(100%)", true, Class169_Sub3.aClass357_8820, StandardSprite.aClass52_8945, -16777216);
				}
				CacheNode_Sub16_Sub1.method2387((byte) -114);
				Node_Sub36_Sub2.method2761((byte) 125);
				Class30.method343(-126);
				boolean bool_33_ = false;
				if (Class93.aGraphicsToolkit1241.z() && Class213.aNode_Sub27_2512.aClass320_Sub26_7269.method3779(false) == 2) {
					for (int i_34_ = 0; (Class188_Sub1_Sub1.aByteArrayArray9334.length ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
						if (Class320_Sub18.aByteArrayArray8378[i_34_] != null || Class320_Sub6.aByteArrayArray8263[i_34_] != null) {
							bool_33_ = true;
							break;
						}
					}
				}
				int i_35_;
				if ((Class213.aNode_Sub27_2512.aClass320_Sub16_7316.method3744(false) ^ 0xffffffff) == -2) {
					i_35_ = CacheNode_Sub15.anIntArray9586[Node_Sub38_Sub25.CURRENT_GAME_SCENE_SIZE];
				} else {
					i_35_ = CacheNode_Sub14.anIntArray9575[Node_Sub38_Sub25.CURRENT_GAME_SCENE_SIZE];
				}
				if (Class93.aGraphicsToolkit1241.p()) {
					i_35_++;
				}
				AbstractToolkit.method1267(Class93.aGraphicsToolkit1241, Class244.anInt3081, 9, 4, Node_Sub54.GAME_SCENE_WDITH, Class377_Sub1.GAME_SCENE_HEIGHT, i_35_, bool_33_, Class93.aGraphicsToolkit1241.e() > 0);
				Class262_Sub16.method3195(Node_Sub9_Sub5.anInt9766);
				if (Node_Sub9_Sub5.anInt9766 == 0) {
					Node_Sub10.method2540(null);
				} else {
					Node_Sub10.method2540(CacheNode_Sub18.aClass52_9609);
				}
				for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > -5; i_36_++)
					Class304.SCENE_CLIP_DATA_PLANES[i_36_].method991(-119);
				Class163.method1738(-1096);
				PlayerUpdateReference.method3808(false, -1);
				Class262_Sub17.method3197(0);
				Class59.aBoolean867 = false;
				CacheNode_Sub16_Sub1.method2387((byte) -114);
				System.gc();
				Node_Sub24.method2650(true, -14651);
				Node_Sub9_Sub5.method2528(1390489120);
				Class237.anInt2906 = Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3730(false);
				Class339_Sub6.aBoolean8715 = Class201.anInt2446 >= 96;
				Class34.aBoolean532 = Class213.aNode_Sub27_2512.aClass320_Sub26_7269.method3779(false) == 2;
				Class163.aBoolean2015 = Class213.aNode_Sub27_2512.aClass320_Sub24_7317.method3773(false) == 1;
				Class256.anInt3237 = (Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) ^ 0xffffffff) == -2 ? -1 : Class94.anInt1249;
				Class382.aBoolean5254 = Class213.aNode_Sub27_2512.aClass320_Sub23_7290.method3770(false) == 1;
				Class169_Sub2_Sub1.aBoolean10563 = Class213.aNode_Sub27_2512.aClass320_Sub30_7275.method3796(false) == 1;
				Node_Sub38_Sub1.aClass277_Sub1_10084 = new Class277_Sub1(4, Node_Sub54.GAME_SCENE_WDITH, Class377_Sub1.GAME_SCENE_HEIGHT, false);
				if (Class61.anInt898 == 0) {
					Actor.method863(Class188_Sub1_Sub1.aByteArrayArray9334, (byte) -74, Node_Sub38_Sub1.aClass277_Sub1_10084);
				} else {
					Class368.method4078(Class188_Sub1_Sub1.aByteArrayArray9334, (byte) -119, Node_Sub38_Sub1.aClass277_Sub1_10084);
				}
				Class290_Sub2.method3426(Node_Sub54.GAME_SCENE_WDITH >> 4, (byte) 119, Class377_Sub1.GAME_SCENE_HEIGHT >> 4);
				Class89.method1022(false);
				if (bool_33_) {
					Node_Sub38_Sub17.method2842(true);
					Class270_Sub1.aClass277_Sub1_8028 = new Class277_Sub1(1, Node_Sub54.GAME_SCENE_WDITH, Class377_Sub1.GAME_SCENE_HEIGHT, true);
					if ((Class61.anInt898 ^ 0xffffffff) == -1) {
						Actor.method863(Class320_Sub6.aByteArrayArray8263, (byte) -74, Class270_Sub1.aClass277_Sub1_8028);
						Node_Sub24.method2650(true, -14651);
					} else {
						Class368.method4078(Class320_Sub6.aByteArrayArray8263, (byte) -116, Class270_Sub1.aClass277_Sub1_8028);
						Node_Sub24.method2650(true, -14651);
					}
					Class270_Sub1.aClass277_Sub1_8028.method3343(Node_Sub38_Sub1.aClass277_Sub1_10084.anIntArrayArrayArray3520[0], (byte) 119, 0);
					Class270_Sub1.aClass277_Sub1_8028.method3339(-2, null, Class93.aGraphicsToolkit1241, null);
					Node_Sub38_Sub17.method2842(false);
				}
				Node_Sub38_Sub1.aClass277_Sub1_10084.method3339(-2, bool_33_ ? Class270_Sub1.aClass277_Sub1_8028.anIntArrayArrayArray3520 : null, Class93.aGraphicsToolkit1241, Class304.SCENE_CLIP_DATA_PLANES);
				if ((Class61.anInt898 ^ 0xffffffff) != -1) {
					Node_Sub24.method2650(true, -14651);
					CacheNode_Sub7.method2317(FileOnDisk.aByteArrayArray1331, (byte) -122, Node_Sub38_Sub1.aClass277_Sub1_10084);
				} else {
					Node_Sub24.method2650(true, -14651);
					Class178.method1811(31269, FileOnDisk.aByteArrayArray1331, Node_Sub38_Sub1.aClass277_Sub1_10084);
					if (Class194.aByteArrayArray2373 != null) {
						Class201.method2019(32273);
					}
				}
				Node_Sub36_Sub2.method2761((byte) 125);
				if (Class201.anInt2446 < 96) {
					Class189.method1934((byte) 17);
				}
				Node_Sub24.method2650(true, -14651);
				Node_Sub38_Sub1.aClass277_Sub1_10084.method3346((byte) 75, Class93.aGraphicsToolkit1241, bool_33_ ? Class368.aPlaneArray4548[0] : null, null);
				Node_Sub38_Sub1.aClass277_Sub1_10084.method3356(false, Class93.aGraphicsToolkit1241, (byte) 83);
				Node_Sub24.method2650(true, -14651);
				if (bool_33_) {
					Node_Sub38_Sub17.method2842(true);
					Node_Sub24.method2650(true, -14651);
					if ((Class61.anInt898 ^ 0xffffffff) != -1) {
						CacheNode_Sub7.method2317(Class320_Sub18.aByteArrayArray8378, (byte) -92, Class270_Sub1.aClass277_Sub1_8028);
					} else {
						Class178.method1811(31269, Class320_Sub18.aByteArrayArray8378, Class270_Sub1.aClass277_Sub1_8028);
					}
					Node_Sub36_Sub2.method2761((byte) 125);
					Node_Sub24.method2650(true, -14651);
					Class270_Sub1.aClass277_Sub1_8028.method3346((byte) 75, Class93.aGraphicsToolkit1241, null, Node_Sub38_Sub37.aPlaneArray10466[0]);
					Class270_Sub1.aClass277_Sub1_8028.method3356(true, Class93.aGraphicsToolkit1241, (byte) 83);
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub17.method2842(false);
				}
				Class115.method1159(-122);
				int i_37_ = Node_Sub38_Sub1.aClass277_Sub1_10084.anInt8046;
				if (i_37_ > CacheNode_Sub20_Sub1.myPlayerPlane) {
					i_37_ = CacheNode_Sub20_Sub1.myPlayerPlane;
				}
				if (CacheNode_Sub20_Sub1.myPlayerPlane - 1 > i_37_) {
					i_37_ = -1 + CacheNode_Sub20_Sub1.myPlayerPlane;
				}
				if (Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) != 0) {
					CacheNode_Sub1.method2280(0);
				} else {
					CacheNode_Sub1.method2280(i_37_);
				}
				for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > -5; i_38_++) {
					for (int i_39_ = 0; i_39_ < Node_Sub54.GAME_SCENE_WDITH; i_39_++) {
						for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff); i_40_++)
							Node_Sub36.method2750(false, i_38_, i_40_, i_39_);
					}
				}
				Class46.method471(-1);
				CacheNode_Sub16_Sub1.method2387((byte) -114);
				Class109.method1127(false);
				Node_Sub36_Sub2.method2761((byte) 125);
				Class239.method3022(false);
				if (Node_Sub29.aFrame7344 != null && Class218.aClass123_2566.aClass365_1557 != null && Class151.anInt1843 == 12) {
					Animable_Sub3.anInt9139++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class169_Sub3.aClass318_8808, Class218.aClass123_2566.anIsaacCipher1571);
					node_sub13.aPacket7113.writeInt(1057001181);
					Class218.aClass123_2566.sendPacket(126, node_sub13);
				}
				if ((Class61.anInt898 ^ 0xffffffff) == -1) {
					int i_41_ = (-(Node_Sub54.GAME_SCENE_WDITH >> 4) + Player.anInt11178) / 8;
					int i_42_ = (Player.anInt11178 - -(Node_Sub54.GAME_SCENE_WDITH >> 4)) / 8;
					int i_43_ = (-(Class377_Sub1.GAME_SCENE_HEIGHT >> 4) + Class277.anInt3527) / 8;
					int i_44_ = ((Class377_Sub1.GAME_SCENE_HEIGHT >> 4) + Class277.anInt3527) / 8;
					for (int i_45_ = i_41_ - 1; i_42_ + 1 >= i_45_; i_45_++) {
						for (int i_46_ = i_43_ - 1; (1 + i_44_ ^ 0xffffffff) <= (i_46_ ^ 0xffffffff); i_46_++) {
							if ((i_45_ ^ 0xffffffff) > (i_41_ ^ 0xffffffff) || i_45_ > i_42_ || (i_46_ ^ 0xffffffff) > (i_43_ ^ 0xffffffff) || (i_44_ ^ 0xffffffff) > (i_46_ ^ 0xffffffff)) {
								Animable_Sub1_Sub1.aClass302_10618.method3531("m" + i_45_ + "_" + i_46_, -18758);
								Animable_Sub1_Sub1.aClass302_10618.method3531("l" + i_45_ + "_" + i_46_, -18758);
							}
						}
					}
				}
				if ((Class151.anInt1843 ^ 0xffffffff) != -5) {
					if ((Class151.anInt1843 ^ 0xffffffff) == -9) {
						Class48.method478(7, (byte) 108);
					} else if ((Class151.anInt1843 ^ 0xffffffff) == -11) {
						Class48.method478(9, (byte) 113);
					} else {
						Class48.method478(11, (byte) 105);
						if (Class218.aClass123_2566.aClass365_1557 != null) {
							Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class91.aClass318_1220, Class218.aClass123_2566.anIsaacCipher1571);
							Class218.aClass123_2566.sendPacket(127, node_sub13);
						}
					}
				} else {
					Class48.method478(3, (byte) 109);
				}
				Class365_Sub1.method4070(-122);
				CacheNode_Sub16_Sub1.method2387((byte) -114);
				Node_Sub38_Sub10.method2824(0);
				Class194_Sub1.aBoolean6892 = true;
				if (Class19.aBoolean313) {
					Node_Sub7.method2422((byte) 43, "Took: " + (-Class366.aLong4528 + Class313.method3650(false)) + "ms");
					Class19.aBoolean313 = false;
				}
			}
		}
	}
	
	public static void method2377(byte b) {
		aClass192_11056 = null;
		aClass253Array11063 = null;
		if (b <= 55) {
			anInt11054 = 2;
		}
	}
	
	r_Sub2(GLToolkit gltoolkit, int i, int i_47_) {
		aByteArray11058 = new byte[i * i_47_];
	}
	
	static {
		aClass192_11056 = new IncommingPacket(8, 6);
	}
}
