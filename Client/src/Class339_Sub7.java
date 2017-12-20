/* Class339_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class339_Sub7 extends Class339
{
	private Class145 aClass145_8716;
	private boolean aBoolean8717 = false;
	static GLSprite aGLSprite8718;
	static int anInt8719;
	static int anInt8720;
	static int anInt8721;
	static int anInt8722;
	static int anInt8723;
	static int anInt8724;
	static int anInt8725;
	static IncommingPacket INCOMMING_PACKET_67 = new IncommingPacket(67, 3);
	private boolean aBoolean8727 = false;
	static int anInt8728;
	static int rights = 0;
	private Class301 aClass301_8730;
	
	final boolean method3922(byte b) {
		anInt8721++;
		if (b >= -44) {
			method3918(3);
		}
		return aBoolean8717;
	}
	
	final void method3917(Class169 class169, int i, int i_0_) {
		if (!aBoolean8727) {
			aGLToolkit4202.method1444(-2, class169);
			aGLToolkit4202.method1434((byte) -78, i);
		}
		if (i_0_ != -28289) {
			anInt8728 = -121;
		}
		anInt8722++;
	}
	
	static final void method3942(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool) {
		anInt8720++;
		int i_6_ = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
		Node_Sub37.anInt7445 = 0;
		int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
		int i_7_;
		if ((aa.anInt101 ^ 0xffffffff) != -4) {
			i_7_ = Node_Sub25_Sub3.localNPCsCount + i_6_;
		} else {
			i_7_ = Class121.aClass206Array1529.length;
		}
		for (int i_8_ = 0; (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
			NpcDefinition npcdefinition = null;
			Actor actor;
			if ((aa.anInt101 ^ 0xffffffff) != -4) {
				if ((i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
					actor = Class270_Sub2.LOCAL_PLAYERS[is[i_8_]];
				} else {
					actor = ((Node_Sub41) Class12.aHashTable187.method1518(3512, (long) Class54.LocalNPCsIndexes[-i_6_ + i_8_])).aNpc7518;
					npcdefinition = ((Npc) actor).aNpcDefinition11122;
					if (npcdefinition.anIntArray2827 != null) {
						npcdefinition = npcdefinition.method2999(65535, Class24.aClass275_442);
						if (npcdefinition == null) {
							continue;
						}
					}
				}
				if ((actor.anInt10857 ^ 0xffffffff) > -1 || actor.anInt10815 != Class110.anInt1412 && Class295.myPlayer.plane != actor.plane) {
					continue;
				}
			} else {
				Class206 class206 = Class121.aClass206Array1529[i_8_];
				if (!class206.aBoolean2472) {
					continue;
				}
				actor = class206.method2037(-89);
				if ((Class110.anInt1412 ^ 0xffffffff) != (actor.anInt10815 ^ 0xffffffff)) {
					continue;
				}
				if (class206.anInt2462 >= 0) {
					npcdefinition = ((Npc) actor).aNpcDefinition11122;
					if (npcdefinition.anIntArray2827 != null) {
						npcdefinition = npcdefinition.method2999(65535, Class24.aClass275_442);
						if (npcdefinition == null) {
							continue;
						}
					}
				}
			}
			Class381.method4173(i_2_, i_3_, actor, (byte) -93, i_5_ >> 1, actor.method850((byte) 77), i_1_ >> 1);
			if ((Class119.anIntArray1516[0] ^ 0xffffffff) <= -1) {
				if (actor.method862((byte) -93)) {
					Class59 class59 = actor.method869(-3109);
					if (class59 != null && (Node_Sub37.anInt7445 ^ 0xffffffff) > (Node_Sub36_Sub2.anInt10042 ^ 0xffffffff)) {
						Node_Sub36_Sub2.anIntArray10052[Node_Sub37.anInt7445] = Class262_Sub15_Sub1.aClass357_10524.method4033((byte) -6, class59.method587(-102)) / 2;
						Node_Sub36_Sub2.anIntArray10051[Node_Sub37.anInt7445] = Class119.anIntArray1516[0];
						Node_Sub36_Sub2.anIntArray10050[Node_Sub37.anInt7445] = Class119.anIntArray1516[1];
						Node_Sub36_Sub2.aClass59Array10044[Node_Sub37.anInt7445] = class59;
						Node_Sub37.anInt7445++;
					}
				}
				int yCoord = i - -Class119.anIntArray1516[1];
				if (actor.aBoolean10826 || (Class174.clientCycle ^ 0xffffffff) <= (actor.anInt10874 ^ 0xffffffff)) {
					yCoord -= Math.max(Class262_Sub15_Sub1.aClass357_10524.anInt4434, Class320_Sub5.aGLSpriteArray8254[0].getYOffset());
				} else {
					int i_10_ = -1;
					int i_11_ = 1;
					if (npcdefinition != null) {
						i_10_ = npcdefinition.anInt2878;
						if (i_10_ == -1) {
							i_10_ = actor.method868((byte) -127).anInt3290;
						}
					} else {
						Player player = Class270_Sub2.LOCAL_PLAYERS[is[i_8_]];
						i_10_ = actor.method868((byte) -123).anInt3290;
						if (player.aBoolean11157) {
							i_11_ = 2;
						}
					}
					GLSprite[] glsprites = Class320_Sub5.aGLSpriteArray8254;
					if ((i_10_ ^ 0xffffffff) != 0) {
						GLSprite[] glsprites_12_ = (GLSprite[]) Class125.aClass61_1609.method607((long) i_10_, 0);
						if (glsprites_12_ == null) {
							Class383[] class383s = Class383.method4187(Node_Sub38_Sub39.aClass302_10500, i_10_, 0);
							if (class383s != null) {
								glsprites_12_ = new GLSprite[class383s.length];
								for (int i_13_ = 0; (class383s.length ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++)
									glsprites_12_[i_13_] = Class93.aGraphicsToolkit1241.a(class383s[i_13_], true);
								Class125.aClass61_1609.method601(glsprites_12_, 25566, (long) i_10_);
							}
						}
						if (glsprites_12_ != null && glsprites_12_.length >= 2) {
							glsprites = glsprites_12_;
						}
					}
					if ((i_11_ ^ 0xffffffff) <= (glsprites.length ^ 0xffffffff)) {
						i_11_ = 1;
					}
					GLSprite greenHpBar = glsprites[0];
					GLSprite glsprite_14_ = glsprites[i_11_];
                    yCoord -= Math.max(Class262_Sub15_Sub1.aClass357_10524.anInt4434, greenHpBar.getYOffset());
					int xCoord = Class119.anIntArray1516[0] + (i_4_ + -(greenHpBar.method1193() >> 1));
					int fillLength = greenHpBar.method1193() * actor.hpPercentage / 255;
					int height = greenHpBar.getYOffset();
					if (actor.hpPercentage > 0 && (~fillLength) > -3) {
						fillLength = 2;
					}//health bar part

					greenHpBar.setPosition(xCoord, yCoord); //moves the red bar
					Class93.aGraphicsToolkit1241.T(xCoord, yCoord, fillLength + xCoord, yCoord - -height);
					glsprite_14_.setPosition(xCoord, yCoord);
					Class93.aGraphicsToolkit1241.KA(i_4_, i, i_1_ + i_4_, i + i_5_);
					Class362.method4053(yCoord, height + yCoord, xCoord, (byte) 90, greenHpBar.method1197() + xCoord);
				}
				yCoord -= 2;
				if (!actor.aBoolean10826) {
					if (actor.anInt10835 > Class174.clientCycle) {
						GLSprite glsprite = Class24.aGLSpriteArray443[!actor.aBoolean10871 ? 0 : 2];
						GLSprite glsprite_18_ = Class24.aGLSpriteArray443[!actor.aBoolean10871 ? 1 : 3];
						int i_19_ = -1;
						if (actor instanceof Npc) {
							i_19_ = npcdefinition.anInt2826;
							if (i_19_ == -1) {
								i_19_ = actor.method868((byte) -125).anInt3292;
							}
						} else {
							i_19_ = actor.method868((byte) -125).anInt3292;
						}
						if (i_19_ != -1) {
							GLSprite[] glsprites = (GLSprite[]) Node_Sub51.aClass61_7628.method607((long) i_19_, 0);
							if (glsprites == null) {
								Class383[] class383s = Class383.method4187(Node_Sub38_Sub39.aClass302_10500, i_19_, 0);
								if (class383s != null) {
									glsprites = new GLSprite[class383s.length];
									for (int i_20_ = 0; (class383s.length ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++)
										glsprites[i_20_] = Class93.aGraphicsToolkit1241.a(class383s[i_20_], true);
									Node_Sub51.aClass61_7628.method601(glsprites, 25566, (long) i_19_);
								}
							}
							if (glsprites != null && glsprites.length == 4) {
								glsprite = glsprites[actor.aBoolean10871 ? 2 : 0];
								glsprite_18_ = glsprites[!actor.aBoolean10871 ? 1 : 3];
							}
						}
						int i_21_ = actor.anInt10835 + -Class174.clientCycle;
						int i_22_;
						if ((actor.anInt10856 ^ 0xffffffff) > (i_21_ ^ 0xffffffff)) {
							i_21_ -= actor.anInt10856;
							int i_23_ = actor.anInt10848 != 0 ? (actor.anInt10855 + -i_21_) / actor.anInt10848 * actor.anInt10848 : 0;
							i_22_ = glsprite.method1193() * i_23_ / actor.anInt10855;
						} else {
							i_22_ = glsprite.method1193();
						}
						int i_24_ = glsprite.getYOffset();
						yCoord -= i_24_;
						int i_25_ = Class119.anIntArray1516[0] + (i_4_ + -(glsprite.method1193() >> 1));
						glsprite.setPosition(i_25_, yCoord);
						Class93.aGraphicsToolkit1241.T(i_25_, yCoord, i_22_ + i_25_, yCoord + i_24_);
						glsprite_18_.setPosition(i_25_, yCoord);
						Class93.aGraphicsToolkit1241.KA(i_4_, i, i_4_ + i_1_, i + i_5_);
						Class362.method4053(yCoord, i_24_ + yCoord, i_25_, (byte) 56, glsprite.method1197() + i_25_);
						yCoord -= 2;
					}
					if (npcdefinition == null) {
						Player player = (Player) actor;
						if (player.skullId != -1) {
							GLSprite glsprite = Class238.aGLSpriteArray2912[player.skullId];
							yCoord -= glsprite.getYOffset();
							glsprite.setPosition(Class119.anIntArray1516[0] + i_4_ - 12, yCoord);
							Class362.method4053(yCoord, glsprite.method1186() + yCoord, Class119.anIntArray1516[0] + (i_4_ + -12), (byte) 107, Class119.anIntArray1516[0] + (i_4_ + -12) + glsprite.method1197());
							yCoord -= 2;
						}
						if (player.prayIconId != -1) {
							GLSprite glsprite = ReferenceTable.aGLSpriteArray284[player.prayIconId];
							yCoord -= glsprite.getYOffset();
							glsprite.setPosition(i_4_ + Class119.anIntArray1516[0] + -12, yCoord);
							Class362.method4053(yCoord, yCoord + glsprite.method1186(), Class119.anIntArray1516[0] + (i_4_ + -12), (byte) -27, -12 + (Class119.anIntArray1516[0] + i_4_) - -glsprite.method1197());
							yCoord -= 2;
						}
					} else if (npcdefinition.anInt2806 >= 0 && ReferenceTable.aGLSpriteArray284.length > npcdefinition.anInt2806) {
						GLSprite glsprite = ReferenceTable.aGLSpriteArray284[npcdefinition.anInt2806];
						yCoord -= glsprite.getYOffset();
						glsprite.setPosition(i_4_ - -Class119.anIntArray1516[0] + -(glsprite.method1193() >> 1), yCoord);
						Class362.method4053(yCoord, glsprite.method1186() + yCoord, i_4_ + Class119.anIntArray1516[0] - (glsprite.method1193() >> 1), (byte) -48, Class119.anIntArray1516[0] + (i_4_ + -(glsprite.method1193() >> 1) - -glsprite.method1197()));
						yCoord -= 2;
					}
				}
				if (actor instanceof Player) {
					if ((i_8_ ^ 0xffffffff) <= -1) {
						int i_26_ = 0;
						Class223[] class223s = Class320_Sub24.cachedHintIcons;
						for (int i_27_ = 0; (class223s.length ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
							Class223 class223 = class223s[i_27_];
							if (class223 != null && class223.anInt2654 == 10 && class223.anInt2658 == is[i_8_]) {
								GLSprite glsprite = Class19.aGLSpriteArray312[class223.anInt2659];
								if ((i_26_ ^ 0xffffffff) > (glsprite.getYOffset() ^ 0xffffffff)) {
									i_26_ = glsprite.getYOffset();
								}
								glsprite.setPosition(-12 + Class119.anIntArray1516[0] + i_4_, yCoord - glsprite.getYOffset());
								Class362.method4053(yCoord + -glsprite.getYOffset(), yCoord - glsprite.getYOffset() - -glsprite.method1186(), -12 + (i_4_ + Class119.anIntArray1516[0]), (byte) 126, Class119.anIntArray1516[0] + (i_4_ - 12) - -glsprite.method1197());
							}
						}
						if ((i_26_ ^ 0xffffffff) < -1) {
							yCoord -= i_26_ + 2;
						}
					}
				} else {
					int i_28_ = 0;
					Class223[] class223s = Class320_Sub24.cachedHintIcons;
					for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (class223s.length ^ 0xffffffff); i_29_++) {
						Class223 class223 = class223s[i_29_];
						if (class223 != null && class223.anInt2654 == 1 && (Class54.LocalNPCsIndexes[-i_6_ + i_8_] ^ 0xffffffff) == (class223.anInt2658 ^ 0xffffffff)) {
							GLSprite glsprite = Class19.aGLSpriteArray312[class223.anInt2659];
							if ((glsprite.getYOffset() ^ 0xffffffff) < (i_28_ ^ 0xffffffff)) {
								i_28_ = glsprite.getYOffset();
							}
							boolean bool_30_;
							if (class223.anInt2651 == 0) {
								bool_30_ = true;
							} else {
								int i_31_ = 1000 * Node_Sub15_Sub10.method2578((byte) -124) / class223.anInt2651 / 2;
								bool_30_ = (i_31_ ^ 0xffffffff) < (Class174.clientCycle % (i_31_ * 2) ^ 0xffffffff);
							}
							if (bool_30_) {
								glsprite.setPosition(-12 + (Class119.anIntArray1516[0] + i_4_), -glsprite.getYOffset() + yCoord);
								Class362.method4053(-glsprite.getYOffset() + yCoord, -glsprite.getYOffset() + (yCoord - -glsprite.method1186()), i_4_ - -Class119.anIntArray1516[0] + -12, (byte) 118, i_4_ + Class119.anIntArray1516[0] - (12 - glsprite.method1197()));
							}
						}
					}
					if (i_28_ > 0) {
						yCoord -= 2 + i_28_;
					}
				}
				int i_32_ = 0;
				for (/**/; (CacheNode_Sub4.aClass1_9466.anInt117 ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++) {
					int i_33_ = actor.anIntArray10829[i_32_];
					int i_34_ = actor.anIntArray10866[i_32_];
					Class255 class255 = null;
					int i_35_ = 0;
					if (i_34_ >= 0) {
						if (Class174.clientCycle >= i_33_) {
							continue;
						}
						class255 = Class296.aClass186_5429.method1875(actor.anIntArray10866[i_32_], 1);
						i_35_ = class255.anInt3231;
					} else if (i_33_ < 0) {
						continue;
					}
					int i_36_ = actor.anIntArray10873[i_32_];
					Class255 class255_37_ = null;
					if (i_36_ >= 0) {
						class255_37_ = Class296.aClass186_5429.method1875(i_36_, 1);
					}
					if ((-i_35_ + i_33_ ^ 0xffffffff) >= (Class174.clientCycle ^ 0xffffffff)) {
						int hpPercentage = actor.anIntArray10869[i_32_];
						if (hpPercentage >= 0) {
							actor.anInt10874 = 300 + Class174.clientCycle;
							actor.hpPercentage = hpPercentage;
							actor.anIntArray10869[i_32_] = -1;
						}
						if (class255 == null) {
							actor.anIntArray10829[i_32_] = -1;
						} else {
							int i_39_ = actor.method850((byte) 85) / 2;
							Class381.method4173(i_2_, i_3_, actor, (byte) -99, i_5_ >> 1, i_39_, i_1_ >> 1);
							if (Class119.anIntArray1516[0] > -1) {
								Class119.anIntArray1516[0] += CacheNode_Sub4.aClass1_9466.anIntArray119[i_32_];
								Class119.anIntArray1516[1] += CacheNode_Sub4.aClass1_9466.anIntArray108[i_32_];
								Object object = null;
								Object object_40_ = null;
								Object object_41_ = null;
								Object object_42_ = null;
								int i_43_ = 0;
								int i_44_ = 0;
								int i_45_ = 0;
								int i_46_ = 0;
								int i_47_ = 0;
								int i_48_ = 0;
								int i_49_ = 0;
								int i_50_ = 0;
								GLSprite glsprite = null;
								GLSprite glsprite_51_ = null;
								GLSprite glsprite_52_ = null;
								GLSprite glsprite_53_ = null;
								int i_54_ = 0;
								int i_55_ = 0;
								int i_56_ = 0;
								int i_57_ = 0;
								int i_58_ = 0;
								int i_59_ = 0;
								int i_60_ = 0;
								int i_61_ = 0;
								GLSprite glsprite_62_ = class255.method3114(0, Class93.aGraphicsToolkit1241);
								int i_63_ = 0;
								if (glsprite_62_ != null) {
									i_43_ = glsprite_62_.method1193();
									int i_64_ = glsprite_62_.getYOffset();
									glsprite_62_.method1187(Class290_Sub3.anIntArray8077);
									if (i_63_ < i_64_) {
										i_63_ = i_64_;
									}
									i_47_ = Class290_Sub3.anIntArray8077[0];
								}
								GLSprite glsprite_65_ = class255.method3111(Class93.aGraphicsToolkit1241, -1);
								if (glsprite_65_ != null) {
									i_44_ = glsprite_65_.method1193();
									int i_66_ = glsprite_65_.getYOffset();
									if ((i_66_ ^ 0xffffffff) < (i_63_ ^ 0xffffffff)) {
										i_63_ = i_66_;
									}
									glsprite_65_.method1187(Class290_Sub3.anIntArray8077);
									i_48_ = Class290_Sub3.anIntArray8077[0];
								}
								GLSprite glsprite_67_ = class255.method3112(80, Class93.aGraphicsToolkit1241);
								if (glsprite_67_ != null) {
									i_45_ = glsprite_67_.method1193();
									int i_68_ = glsprite_67_.getYOffset();
									if ((i_68_ ^ 0xffffffff) < (i_63_ ^ 0xffffffff)) {
										i_63_ = i_68_;
									}
									glsprite_67_.method1187(Class290_Sub3.anIntArray8077);
									i_49_ = Class290_Sub3.anIntArray8077[0];
								}
								GLSprite glsprite_69_ = class255.method3113(Class93.aGraphicsToolkit1241, (byte) -95);
								if (glsprite_69_ != null) {
									i_46_ = glsprite_69_.method1193();
									int i_70_ = glsprite_69_.getYOffset();
									glsprite_69_.method1187(Class290_Sub3.anIntArray8077);
									if (i_70_ > i_63_) {
										i_63_ = i_70_;
									}
									i_50_ = Class290_Sub3.anIntArray8077[0];
								}
								if (class255_37_ != null) {
									glsprite = class255_37_.method3114(0, Class93.aGraphicsToolkit1241);
									if (glsprite != null) {
										i_54_ = glsprite.method1193();
										int i_71_ = glsprite.getYOffset();
										if ((i_63_ ^ 0xffffffff) > (i_71_ ^ 0xffffffff)) {
											i_63_ = i_71_;
										}
										glsprite.method1187(Class290_Sub3.anIntArray8077);
										i_58_ = Class290_Sub3.anIntArray8077[0];
									}
									glsprite_51_ = class255_37_.method3111(Class93.aGraphicsToolkit1241, -1);
									if (glsprite_51_ != null) {
										i_55_ = glsprite_51_.method1193();
										int i_72_ = glsprite_51_.getYOffset();
										if ((i_72_ ^ 0xffffffff) < (i_63_ ^ 0xffffffff)) {
											i_63_ = i_72_;
										}
										glsprite_51_.method1187(Class290_Sub3.anIntArray8077);
										i_59_ = Class290_Sub3.anIntArray8077[0];
									}
									glsprite_52_ = class255_37_.method3112(70, Class93.aGraphicsToolkit1241);
									if (glsprite_52_ != null) {
										i_56_ = glsprite_52_.method1193();
										int i_73_ = glsprite_52_.getYOffset();
										glsprite_52_.method1187(Class290_Sub3.anIntArray8077);
										if ((i_63_ ^ 0xffffffff) > (i_73_ ^ 0xffffffff)) {
											i_63_ = i_73_;
										}
										i_60_ = Class290_Sub3.anIntArray8077[0];
									}
									glsprite_53_ = class255_37_.method3113(Class93.aGraphicsToolkit1241, (byte) -110);
									if (glsprite_53_ != null) {
										i_57_ = glsprite_53_.method1193();
										int i_74_ = glsprite_53_.getYOffset();
										glsprite_53_.method1187(Class290_Sub3.anIntArray8077);
										if ((i_63_ ^ 0xffffffff) > (i_74_ ^ 0xffffffff)) {
											i_63_ = i_74_;
										}
										i_61_ = Class290_Sub3.anIntArray8077[0];
									}
								}
								Class52 class52 = CacheNode_Sub18.aClass52_9609;
								Class52 class52_75_ = CacheNode_Sub18.aClass52_9609;
								Class357 class357 = Class85.aClass357_1159;
								Class357 class357_76_ = Class85.aClass357_1159;
								int i_77_ = class255.anInt3235;
								if (i_77_ >= 0) {
									Class52 class52_78_ = Class171.method1792(true, true, i_77_, -116, Class93.aGraphicsToolkit1241);
									Class357 class357_79_ = Class150_Sub2.method1660((byte) 126, i_77_, Class93.aGraphicsToolkit1241);
									if (class52_78_ != null && class357_79_ != null) {
										class357 = class357_79_;
										class52 = class52_78_;
									}
								}
								if (class255_37_ != null) {
									i_77_ = class255_37_.anInt3235;
									if ((i_77_ ^ 0xffffffff) <= -1) {
										Class52 class52_80_ = Class171.method1792(true, true, i_77_, -112, Class93.aGraphicsToolkit1241);
										Class357 class357_81_ = Class150_Sub2.method1660((byte) -81, i_77_, Class93.aGraphicsToolkit1241);
										if (class52_80_ != null && class357_81_ != null) {
											class357_76_ = class357_81_;
											class52_75_ = class52_80_;
										}
									}
								}
								Object object_82_ = null;
								String string = null;
								boolean bool_83_ = false;
								int i_84_ = 0;
								String string_85_ = class255.method3117(actor.anIntArray10819[i_32_], true);
								int i_86_ = class357.method4033((byte) -6, string_85_);
								if (class255_37_ != null) {
									string = class255_37_.method3117(actor.anIntArray10868[i_32_], true);
									i_84_ = class357_76_.method4033((byte) -6, string);
								}
								int i_87_ = 0;
								if (i_44_ > 0) {
									i_87_ = i_86_ / i_44_ + 1;
								}
								int i_88_ = 0;
								if (class255_37_ != null && (i_55_ ^ 0xffffffff) < -1) {
									i_88_ = i_84_ / i_55_ - -1;
								}
								int i_89_ = 0;
								int i_90_ = i_89_;
								if (i_43_ > 0) {
									i_89_ += i_43_;
								}
								i_89_ += 2;
								int i_91_ = i_89_;
								if ((i_45_ ^ 0xffffffff) < -1) {
									i_89_ += i_45_;
								}
								int i_92_ = i_89_;
								int i_93_ = i_89_;
								if ((i_44_ ^ 0xffffffff) < -1) {
									int i_94_ = i_87_ * i_44_;
									i_89_ += i_94_;
									i_93_ += (i_94_ + -i_86_) / 2;
								} else {
									i_89_ += i_86_;
								}
								int i_95_ = i_89_;
								if ((i_46_ ^ 0xffffffff) < -1) {
									i_89_ += i_46_;
								}
								int i_96_ = 0;
								int i_97_ = 0;
								int i_98_ = 0;
								int i_99_ = 0;
								int i_100_ = 0;
								if (class255_37_ != null) {
									i_89_ += 2;
									i_96_ = i_89_;
									if (i_54_ > 0) {
										i_89_ += i_54_;
									}
									i_89_ += 2;
									i_97_ = i_89_;
									if ((i_56_ ^ 0xffffffff) < -1) {
										i_89_ += i_56_;
									}
									i_100_ = i_89_;
									i_98_ = i_89_;
									if (i_55_ <= 0) {
										i_89_ += i_84_;
									} else {
										int i_101_ = i_88_ * i_55_;
										i_100_ += (i_101_ - i_84_) / 2;
										i_89_ += i_101_;
									}
									i_99_ = i_89_;
									if (i_57_ > 0) {
										i_89_ += i_57_;
									}
								}
								int i_102_ = -Class174.clientCycle + actor.anIntArray10829[i_32_];
								int i_103_ = class255.anInt3223 + -(class255.anInt3223 * i_102_ / class255.anInt3231);
								int i_104_ = -class255.anInt3230 - -(i_102_ * class255.anInt3230 / class255.anInt3231);
								int i_105_ = i_4_ + (Class119.anIntArray1516[0] + -(i_89_ >> 1)) - -i_103_;
								int i_106_ = Class119.anIntArray1516[1] + i - (12 - i_104_);
								int i_107_ = i_106_;
								int i_108_ = i_106_ - -i_63_;
								int i_109_ = class255.anInt3214 + (i_106_ - -15);
								int i_110_ = -class357.anInt4434 + i_109_;
								if ((i_110_ ^ 0xffffffff) > (i_107_ ^ 0xffffffff)) {
									i_107_ = i_110_;
								}
								int i_111_ = class357.anInt4442 + i_109_;
								if (i_108_ < i_111_) {
									i_108_ = i_111_;
								}
								int i_112_ = 0;
								if (class255_37_ != null) {
									i_112_ = class255_37_.anInt3214 + i_106_ + 15;
									int i_113_ = i_112_ - class357_76_.anInt4434;
									int i_114_ = i_112_ - -class357_76_.anInt4442;
									if ((i_107_ ^ 0xffffffff) < (i_113_ ^ 0xffffffff)) {
										i_107_ = i_113_;
									}
									if ((i_108_ ^ 0xffffffff) > (i_114_ ^ 0xffffffff)) {
										i_108_ = i_114_;
									}
								}
								int i_115_ = 255;
								if (class255.anInt3215 >= 0) {
									i_115_ = (i_102_ << 8) / (class255.anInt3231 - class255.anInt3215);
								}
								if (i_115_ >= 0 && i_115_ < 255) {
									int i_116_ = i_115_ << 24;
									int i_117_ = 0xffffff | i_116_;
									if (glsprite_62_ != null) {
										glsprite_62_.method1191(-i_47_ + (i_105_ + i_90_), i_106_, 0, i_117_, 1);
									}
									if (glsprite_67_ != null) {
										glsprite_67_.method1191(-i_49_ + (i_91_ + i_105_), i_106_, 0, i_117_, 1);
									}
									if (glsprite_65_ != null) {
										for (int i_118_ = 0; (i_118_ ^ 0xffffffff) > (i_87_ ^ 0xffffffff); i_118_++)
											glsprite_65_.method1191(i_92_ + i_105_ - (i_48_ - i_44_ * i_118_), i_106_, 0, i_117_, 1);
									}
									if (glsprite_69_ != null) {
										glsprite_69_.method1191(-i_50_ + (i_105_ + i_95_), i_106_, 0, i_117_, 1);
									}
									class52.method538(i_105_ + i_93_, i_109_, string_85_, 0, 1, i_116_ | class255.anInt3229);
									if (class255_37_ != null) {
										if (glsprite != null) {
											glsprite.method1191(i_96_ + i_105_ - i_58_, i_106_, 0, i_117_, 1);
										}
										if (glsprite_52_ != null) {
											glsprite_52_.method1191(i_105_ + i_97_ + -i_60_, i_106_, 0, i_117_, 1);
										}
										if (glsprite_51_ != null) {
											for (int i_119_ = 0; i_88_ > i_119_; i_119_++)
												glsprite_51_.method1191(-i_59_ + (i_105_ + (i_98_ - -(i_55_ * i_119_))), i_106_, 0, i_117_, 1);
										}
										if (glsprite_53_ != null) {
											glsprite_53_.method1191(-i_61_ + (i_105_ + i_99_), i_106_, 0, i_117_, 1);
										}
										class52_75_.method538(i_100_ + i_105_, i_112_, string, 0, 1, class255_37_.anInt3229 | i_116_);
									}
								} else {
									if (glsprite_62_ != null) {
										glsprite_62_.setPosition(i_90_ + i_105_ - i_47_, i_106_);
									}
									if (glsprite_67_ != null) {
										glsprite_67_.setPosition(i_105_ - (-i_91_ - -i_49_), i_106_);
									}
									if (glsprite_65_ != null) {
										for (int i_120_ = 0; i_87_ > i_120_; i_120_++)
											glsprite_65_.setPosition(i_44_ * i_120_ + i_92_ + i_105_ + -i_48_, i_106_);
									}
									if (glsprite_69_ != null) {
										glsprite_69_.setPosition(-i_50_ + (i_95_ + i_105_), i_106_);
									}
									class52.method538(i_105_ + i_93_, i_109_, string_85_, 0, 1, class255.anInt3229 | ~0xffffff);
									if (class255_37_ != null) {
										if (glsprite != null) {
											glsprite.setPosition(i_96_ + (i_105_ + -i_58_), i_106_);
										}
										if (glsprite_52_ != null) {
											glsprite_52_.setPosition(-i_60_ + (i_105_ - -i_97_), i_106_);
										}
										if (glsprite_51_ != null) {
											for (int i_121_ = 0; i_121_ < i_88_; i_121_++)
												glsprite_51_.setPosition(i_105_ + i_98_ - i_59_ - -(i_55_ * i_121_), i_106_);
										}
										if (glsprite_53_ != null) {
											glsprite_53_.setPosition(i_99_ + i_105_ - i_61_, i_106_);
										}
										class52_75_.method538(i_100_ + i_105_, i_112_, string, 0, 1, class255_37_.anInt3229 | ~0xffffff);
									}
								}
								Class362.method4053(i_107_, i_108_ - -1, i_105_, (byte) -118, i_89_ + i_105_);
							}
						}
					}
				}
			}
		}
		int i_122_ = 0;
		if (bool != true) {
			method3942(115, -101, -110, 47, 32, 102, false);
		}
		for (/**/; (~i_122_) > (~Class99.anInt1286); i_122_++) {
			int i_123_ = Class171.anIntArray2070[i_122_];
			Actor actor;
			if (i_123_ < 2048) {
				actor = Class270_Sub2.LOCAL_PLAYERS[i_123_];
			} else {
				actor = ((Node_Sub41) Class12.aHashTable187.method1518(3512, (long) (-2048 + i_123_))).aNpc7518;
			}
			int i_124_ = Node_Sub15_Sub4.anIntArray9802[i_122_];
			Actor actor_125_;
			if (i_124_ < 2048) {
				actor_125_ = Class270_Sub2.LOCAL_PLAYERS[i_124_];
			} else {
				actor_125_ = ((Node_Sub41) Class12.aHashTable187.method1518(3512, (long) (i_124_ - 2048))).aNpc7518;
			}
			Class212.method2054((byte) -124, i_4_, actor, i_3_, actor_125_, i_5_, i_1_, i_2_, i, --actor.anInt10853);
		}
		int i_126_ = Class262_Sub15_Sub1.aClass357_10524.anInt4434 + Class262_Sub15_Sub1.aClass357_10524.anInt4442 - -2;
		for (int i_127_ = 0; (i_127_ ^ 0xffffffff) > (Node_Sub37.anInt7445 ^ 0xffffffff); i_127_++) {
			int i_128_ = Node_Sub36_Sub2.anIntArray10051[i_127_];
			int i_129_ = Node_Sub36_Sub2.anIntArray10050[i_127_];
			int i_130_ = Node_Sub36_Sub2.anIntArray10052[i_127_];
			boolean bool_131_ = true;
			while (bool_131_) {
				bool_131_ = false;
				for (int i_132_ = 0; i_127_ > i_132_; i_132_++) {
					if ((i_129_ + 2 ^ 0xffffffff) < (-i_126_ + Node_Sub36_Sub2.anIntArray10050[i_132_] ^ 0xffffffff) && (i_129_ + -i_126_ ^ 0xffffffff) > (Node_Sub36_Sub2.anIntArray10050[i_132_] - -2 ^ 0xffffffff) && (Node_Sub36_Sub2.anIntArray10051[i_132_] - -Node_Sub36_Sub2.anIntArray10052[i_132_] ^ 0xffffffff) < (i_128_ - i_130_ ^ 0xffffffff) && i_128_ - -i_130_ > Node_Sub36_Sub2.anIntArray10051[i_132_] + -Node_Sub36_Sub2.anIntArray10052[i_132_] && i_129_ > -i_126_ + Node_Sub36_Sub2.anIntArray10050[i_132_]) {
						i_129_ = -i_126_ + Node_Sub36_Sub2.anIntArray10050[i_132_];
						bool_131_ = true;
					}
				}
			}
			Node_Sub36_Sub2.anIntArray10050[i_127_] = i_129_;
			String string = Node_Sub36_Sub2.aClass59Array10044[i_127_].method587(70);
			int i_133_ = Class262_Sub15_Sub1.aClass357_10524.method4033((byte) -6, string);
			int i_134_ = i_128_ + i_4_;
			int i_135_ = i_129_ + i - Class262_Sub15_Sub1.aClass357_10524.anInt4434;
			int i_136_ = i_133_ + i_134_;
			int i_137_ = Class262_Sub15_Sub1.aClass357_10524.anInt4442 + (i + i_129_);
			if ((Class134_Sub1.anInt9014 ^ 0xffffffff) == -1) {
				int i_138_ = 16776960;
				int i_139_ = Node_Sub36_Sub2.aClass59Array10044[i_127_].method589(63);
				if ((i_139_ ^ 0xffffffff) > -7) {
					i_138_ = Class312.anIntArray3968[i_139_];
				}
				if (i_139_ == 6) {
					i_138_ = (Class110.anInt1412 % 20 ^ 0xffffffff) > -11 ? 16711680 : 16776960;
				}
				if ((i_139_ ^ 0xffffffff) == -8) {
					i_138_ = Class110.anInt1412 % 20 >= 10 ? 65535 : 255;
				}
				if (i_139_ == 8) {
					i_138_ = Class110.anInt1412 % 20 >= 10 ? 8454016 : 45056;
				}
				if ((i_139_ ^ 0xffffffff) == -10) {
					int i_140_ = 150 + -(Node_Sub36_Sub2.aClass59Array10044[i_127_].method592((byte) -66) * 150 / Node_Sub36_Sub2.aClass59Array10044[i_127_].method585(-1));
					if ((i_140_ ^ 0xffffffff) > -51) {
						i_138_ = i_140_ * 1280 + 16711680;
					} else if (i_140_ < 100) {
						i_138_ = -(i_140_ * 327680) - -33160960;
					} else if ((i_140_ ^ 0xffffffff) > -151) {
						i_138_ = 65280 + (i_140_ * 5 - 500);
					}
				}
				if (i_139_ == 10) {
					int i_141_ = -(Node_Sub36_Sub2.aClass59Array10044[i_127_].method592((byte) -57) * 150 / Node_Sub36_Sub2.aClass59Array10044[i_127_].method585(-1)) + 150;
					if ((i_141_ ^ 0xffffffff) <= -51) {
						if (i_141_ < 100) {
							i_138_ = 16711935 - (i_141_ - 50) * 327680;
						} else if (i_141_ < 150) {
							i_138_ = 500 + -(5 * i_141_) + -32768000 + (327680 * i_141_ + 255);
						}
					} else {
						i_138_ = 16711680 - -(i_141_ * 5);
					}
				}
				if (i_139_ == 11) {
					int i_142_ = -(Node_Sub36_Sub2.aClass59Array10044[i_127_].method592((byte) -39) * 150 / Node_Sub36_Sub2.aClass59Array10044[i_127_].method585(-1)) + 150;
					if (i_142_ < 50) {
						i_138_ = 16777215 + -(i_142_ * 327685);
					} else if ((i_142_ ^ 0xffffffff) > -101) {
						i_138_ = -16384250 - (-(i_142_ * 327685) - 65280);
					} else if (i_142_ < 150) {
						i_138_ = 16777215 + -((i_142_ - 100) * 327680);
					}
				}
				int i_143_ = ~0xffffff | i_138_;
				int i_144_ = Node_Sub36_Sub2.aClass59Array10044[i_127_].method590(127);
				if ((i_144_ ^ 0xffffffff) == -1) {
					Class262_Sub4.aClass52_7721.method537(-16777216, (byte) 107, i_128_ + i_4_, string, i_129_ + i, i_143_);
					i_136_ -= i_133_ >> 1;
					i_134_ -= i_133_ >> 1;
				}
				if (i_144_ == 1) {
					i_137_ += 5;
					Class262_Sub4.aClass52_7721.method542(5, i_143_, Class110.anInt1412, string, i_4_ - -i_128_, i_129_ + i, -16777216);
					i_136_ -= i_133_ >> 1;
					i_134_ -= i_133_ >> 1;
					i_135_ -= 5;
				}
				if (i_144_ == 2) {
					i_135_ -= 5;
					Class262_Sub4.aClass52_7721.method541(-16777216, Class110.anInt1412, string, i_4_ - -i_128_, i_143_, i + i_129_, 16777215);
					i_137_ += 5;
					i_134_ -= 5 + (i_133_ >> 1);
					i_136_ -= -5 + (i_133_ >> 1);
				}
				if (i_144_ == 3) {
					int i_145_ = 150 + -(Node_Sub36_Sub2.aClass59Array10044[i_127_].method592((byte) -61) * 150 / Node_Sub36_Sub2.aClass59Array10044[i_127_].method585(-1));
					i_134_ -= i_133_ >> 1;
					i_137_ += 7;
					i_135_ -= 7;
					i_136_ -= i_133_ >> 1;
					Class262_Sub4.aClass52_7721.method527(i_145_, i_128_ + i_4_, Class110.anInt1412, i + i_129_, i_143_, string, -16777216, -1072);
				}
				if ((i_144_ ^ 0xffffffff) == -5) {
					int i_146_ = -(Node_Sub36_Sub2.aClass59Array10044[i_127_].method592((byte) -49) * 150 / Node_Sub36_Sub2.aClass59Array10044[i_127_].method585(-1)) + 150;
					int i_147_ = (Class262_Sub15_Sub1.aClass357_10524.method4033((byte) -6, string) + 100) * i_146_ / 150;
					Class93.aGraphicsToolkit1241.T(-50 + (i_4_ - -i_128_), i, 50 + (i_128_ + i_4_), i - -i_5_);
					i_134_ += -i_147_ + 50;
					i_136_ += 50 + -i_147_;
					Class262_Sub4.aClass52_7721.method538(-i_147_ + (i_4_ - -i_128_ - -50), i_129_ + i, string, -16777216, 1, i_143_);
					Class93.aGraphicsToolkit1241.KA(i_4_, i, i_4_ + i_1_, i_5_ + i);
				}
				if ((i_144_ ^ 0xffffffff) == -6) {
					int i_148_ = -(150 * Node_Sub36_Sub2.aClass59Array10044[i_127_].method592((byte) -125) / Node_Sub36_Sub2.aClass59Array10044[i_127_].method585(-1)) + 150;
					int i_149_ = 0;
					if ((i_148_ ^ 0xffffffff) > -26) {
						i_149_ = -25 + i_148_;
					} else if ((i_148_ ^ 0xffffffff) < -126) {
						i_149_ = i_148_ + -125;
					}
					int i_150_ = Class262_Sub15_Sub1.aClass357_10524.anInt4442 + Class262_Sub15_Sub1.aClass357_10524.anInt4434;
					Class93.aGraphicsToolkit1241.T(i_4_, i + (i_129_ - (i_150_ - -1)), i_1_ + i_4_, 5 + (i_129_ + i));
					i_137_ += i_149_;
					i_134_ -= i_133_ >> 1;
					i_136_ -= i_133_ >> 1;
					i_135_ += i_149_;
					Class262_Sub4.aClass52_7721.method537(-16777216, (byte) 110, i_4_ - -i_128_, string, i_149_ + i_129_ + i, i_143_);
					Class93.aGraphicsToolkit1241.KA(i_4_, i, i_4_ + i_1_, i + i_5_);
				}
			} else {
				Class262_Sub4.aClass52_7721.method537(-16777216, (byte) 115, i_128_ + i_4_, string, i - -i_129_, -256);
				i_134_ -= i_133_ >> 1;
				i_136_ -= i_133_ >> 1;
			}
			Class362.method4053(i_135_, 1 + i_137_, i_134_, (byte) -110, i_136_ - -1);
		}
	}
	
	final void method3919(int i, int i_151_, int i_152_) {
		if (aBoolean8727) {
			int i_153_ = 1 << (i_152_ & 0x3);
			float f = (float) (1 << ((0x3e & i_152_) >> 3)) / 32.0F;
			int i_154_ = 0xffff & i_151_;
			float f_155_ = (float) ((i_151_ & 0x30aa7) >> 16) / 8.0F;
			float f_156_ = (float) (i_151_ >> 19 & 0xf) / 16.0F;
			float f_157_ = (float) ((0x7bf0a08 & i_151_) >> 23) / 16.0F;
			int i_158_ = (i_151_ & 0x7d255c5e) >> 27;
			long l = aClass145_8716.aLong1795;
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) (aGLToolkit4202.anInt6605 * i_153_ % 40000) / 40000.0F);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) i_154_);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_155_);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(l, "waveIntensity"), f_157_, f_156_);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "waveExponent"), (float) i_158_);
		}
		if (i != -13437) {
			method3943((byte) 44);
		}
		anInt8724++;
	}
	
	public static void method3943(byte b) {
		aGLSprite8718 = null;
		int i = 54 % ((-77 - b) / 41);
		INCOMMING_PACKET_67 = null;
	}
	
	final void method3918(int i) {
		if (aBoolean8727) {
			aGLToolkit4202.method1457(33984, 1);
			aGLToolkit4202.method1444(-2, null);
			aGLToolkit4202.method1457(33984, 0);
			aGLToolkit4202.method1444(-2, null);
			OpenGL.glUseProgramObjectARB(0L);
			aBoolean8727 = false;
		}
		if (i == 20937) {
			anInt8719++;
		}
	}
	
	final void method3920(int i, boolean bool) {
		anInt8725++;
		if (i != -1) {
			aBoolean8727 = false;
		}
	}
	
	Class339_Sub7(GLToolkit gltoolkit, Class301 class301) {
		super(gltoolkit);
		aClass301_8730 = class301;
		if (aClass301_8730.aClass169_Sub3_3778 != null && aGLToolkit4202.aBoolean6725 && aGLToolkit4202.aBoolean6738) {
			Class210 class210 = Class134.method1568("uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", aGLToolkit4202, -399874888, 35633);
			Class210 class210_159_ = Class134.method1568("varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n", aGLToolkit4202, -399874888, 35632);
			aClass145_8716 = Class290_Sub4.method3431(aGLToolkit4202, 0, new Class210[] { class210, class210_159_ });
			aBoolean8717 = aClass145_8716 != null;
		}
	}
	
	final void method3923(boolean bool, int i) {
		anInt8723++;
		if (i == 0) {
			Class169_Sub1 class169_sub1 = aGLToolkit4202.method1406((byte) -122);
			if (aBoolean8717 && class169_sub1 != null) {
				float f = 1.0F + (1.0F - Math.abs(aGLToolkit4202.aFloatArray6664[1])) * 2.0F;
				aGLToolkit4202.method1457(33984, 1);
				aGLToolkit4202.method1444(-2, class169_sub1);
				aGLToolkit4202.method1457(33984, 0);
				aGLToolkit4202.method1444(-2, aClass301_8730.aClass169_Sub3_3778);
				long l = aClass145_8716.aLong1795;
				OpenGL.glUseProgramObjectARB(l);
				OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
				OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
				OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -aGLToolkit4202.aFloatArray6664[0], -aGLToolkit4202.aFloatArray6664[1], -aGLToolkit4202.aFloatArray6664[2]);
				OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), f * aGLToolkit4202.aFloat6734, aGLToolkit4202.aFloat6707 * f, aGLToolkit4202.aFloat6672 * f, 1.0F);
				OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), 64.0F + 928.0F * Math.abs(aGLToolkit4202.aFloatArray6664[1]));
				aBoolean8727 = true;
			}
		}
	}
}
