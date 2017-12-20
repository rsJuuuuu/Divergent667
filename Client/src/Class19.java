/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class19
{
	static int anInt311;
	static GLSprite[] aGLSpriteArray312;
	static boolean aBoolean313 = false;
	
	public static void method267(byte b) {
		if (b != -21) {
			method268(18, null, 78, null, -58);
		}
		aGLSpriteArray312 = null;
	}
	
	static final void method268(int i, GraphicsToolkit graphicstoolkit, int i_0_, IComponentDefinitions widget, int i_1_) {
		if (i_0_ != 128) {
			method268(17, null, -51, null, 40);
		}
		anInt311++;
		Class127 class127 = widget.method4145(graphicstoolkit, i_0_ + -127);
		if (class127 != null) {
			aa var_aa = class127.anAa1639;
			graphicstoolkit.KA(i_1_, i, i_1_ + widget.anInt4809, i - -widget.anInt4695);
			if ((Class262_Sub20.anInt7861 ^ 0xffffffff) == -3 || (Class262_Sub20.anInt7861 ^ 0xffffffff) == -6 || Class10.aGLSprite172 == null) {
				graphicstoolkit.A(-16777216, var_aa, i_1_, i);
			} else {
				int i_2_;
				int i_3_;
				int i_4_;
				int i_5_;
				if ((Class320_Sub22.anInt8415 ^ 0xffffffff) != -5) {
					i_3_ = -(Node_Sub15_Sub13.anInt9870 * 16) + 4096;
					i_2_ = 0x3fff & (int) -Node_Sub12.aFloat5450 + Mobile_Sub1.anInt10960;
					i_5_ = Class295.myPlayer.anInt5934;
					i_4_ = Class295.myPlayer.anInt5940;
				} else {
					i_2_ = (int) -Node_Sub12.aFloat5450 & 0x3fff;
					i_3_ = 4096;
					i_4_ = Node_Sub19.anInt7173;
					i_5_ = Class234.anInt2792;
				}
				int i_6_ = -(Node_Sub54.GAME_SCENE_WDITH * 2) + 208 + (48 + i_5_ / 128);
				int i_7_ = -(i_4_ / 128) + 4 * Class377_Sub1.GAME_SCENE_HEIGHT + 48 - (Class377_Sub1.GAME_SCENE_HEIGHT - 104) * 2;
				Class10.aGLSprite172.method1179((float) i_1_ + (float) widget.anInt4809 / 2.0F, (float) widget.anInt4695 / 2.0F + (float) i, (float) i_6_, (float) i_7_, i_3_, i_2_ << 2, var_aa, i_1_, i);
				for (Node_Sub32 node_sub32 = (Node_Sub32) Node_Sub47.aClass312_7558.method3613(65280); node_sub32 != null; node_sub32 = (Node_Sub32) Node_Sub47.aClass312_7558.method3620(16776960)) {
					int i_8_ = node_sub32.anInt7381;
					int i_9_ = (Class262_Sub15_Sub1.aClass224_10520.anIntArray2668[i_8_] >> 14 & 0x3fff) + -Node_Sub53.gameSceneBaseX;
					int i_10_ = (0x3fff & Class262_Sub15_Sub1.aClass224_10520.anIntArray2668[i_8_]) + -Class320_Sub4.gameSceneBaseY;
					int i_11_ = 4 * i_9_ + 2 + -(i_5_ / 128);
					int i_12_ = 4 * i_10_ - (-2 - -(i_4_ / 128));
					Class329.method3834(i_12_, i_0_ ^ ~0xf7, i_1_, var_aa, graphicstoolkit, Class262_Sub15_Sub1.aClass224_10520.anIntArray2669[i_8_], i, i_11_, widget);
				}
				for (int i_13_ = 0; (Class283.anInt3590 ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
					int i_14_ = 2 + (Class298.anIntArray3741[i_13_] * 4 + -(i_5_ / 128));
					int i_15_ = Class184.anIntArray2203[i_13_] * 4 + 2 + -(i_4_ / 128);
					ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(Class281.anIntArray3579[i_13_], i_0_ + -23);
					if (objectdefinition.anIntArray2984 != null) {
						objectdefinition = objectdefinition.method3038(13, Class24.aClass275_442);
						if (objectdefinition == null || (objectdefinition.anInt2994 ^ 0xffffffff) == 0) {
							continue;
						}
					}
					Class329.method3834(i_15_, -124, i_1_, var_aa, graphicstoolkit, objectdefinition.anInt2994, i, i_14_, widget);
				}
				for (Node_Sub11 node_sub11 = (Node_Sub11) Class266.aHashTable3380.method1516(false); node_sub11 != null; node_sub11 = (Node_Sub11) Class266.aHashTable3380.method1520(i_0_ ^ 0xe6)) {
					int i_16_ = (int) (0x3L & node_sub11.aLong2797 >> 28);
					if ((Class346.anInt4278 ^ 0xffffffff) == (i_16_ ^ 0xffffffff)) {
						int i_17_ = (int) (node_sub11.aLong2797 & 0x3fffL) + -Node_Sub53.gameSceneBaseX;
						int i_18_ = (int) (node_sub11.aLong2797 >> 14 & 0x3fffL) - Class320_Sub4.gameSceneBaseY;
						int i_19_ = -(i_5_ / 128) + (4 * i_17_ + 2);
						int i_20_ = -(i_4_ / 128) + (2 + 4 * i_18_);
						Class4.method171((byte) -116, i, var_aa, Node_Sub38_Sub24.aGLSpriteArray10356[0], i_20_, i_19_, widget, i_1_);
					}
				}
				for (int i_21_ = 0; i_21_ < Node_Sub25_Sub3.localNPCsCount; i_21_++) {
					Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) Class54.LocalNPCsIndexes[i_21_]);
					if (node_sub41 != null) {
						Npc npc = node_sub41.aNpc7518;
						if (npc.method873((byte) -107) && npc.plane == Class295.myPlayer.plane) {
							NpcDefinition npcdefinition = npc.aNpcDefinition11122;
							if (npcdefinition != null && npcdefinition.anIntArray2827 != null) {
								npcdefinition = npcdefinition.method2999(65535, Class24.aClass275_442);
							}
							if (npcdefinition != null && npcdefinition.aBoolean2879 && npcdefinition.aBoolean2854) {
								int i_22_ = npc.anInt5934 / 128 + -(i_5_ / 128);
								int i_23_ = -(i_4_ / 128) + npc.anInt5940 / 128;
								if ((npcdefinition.anInt2849 ^ 0xffffffff) == 0) {
									Class4.method171((byte) -116, i, var_aa, Node_Sub38_Sub24.aGLSpriteArray10356[1], i_23_, i_22_, widget, i_1_);
								} else {
									Class329.method3834(i_23_, -122, i_1_, var_aa, graphicstoolkit, npcdefinition.anInt2849, i, i_22_, widget);
								}
							}
						}
					}
				}
				int i_24_ = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
				int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
				for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
					Player player = Class270_Sub2.LOCAL_PLAYERS[is[i_25_]];
					if (player != null && player.method886((byte) 58) && !player.aBoolean11131 && Class295.myPlayer != player && player.plane == Class295.myPlayer.plane) {
						int i_26_ = player.anInt5934 / 128 + -(i_5_ / 128);
						int i_27_ = player.anInt5940 / 128 - i_4_ / 128;
						boolean bool = false;
						for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > (Node_Sub38_Sub14.anInt10242 ^ 0xffffffff); i_28_++) {
							if (player.username.equals(Class262_Sub12.aStringArray7793[i_28_]) && Class202.anIntArray2448[i_28_] != 0) {
								bool = true;
								break;
							}
						}
						boolean bool_29_ = false;
						for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (Node_Sub38_Sub37.anInt10473 ^ 0xffffffff); i_30_++) {
							if (player.username.equals(Class50.aClass211Array782[i_30_].aString2506)) {
								bool_29_ = true;
								break;
							}
						}
						boolean bool_31_ = false;
						if (Class295.myPlayer.anInt11134 != 0 && (player.anInt11134 ^ 0xffffffff) != -1 && Class295.myPlayer.anInt11134 == player.anInt11134) {
							bool_31_ = true;
						}
						if (player.aBoolean11157) {
							Class4.method171((byte) -116, i, var_aa, Node_Sub38_Sub24.aGLSpriteArray10356[6], i_27_, i_26_, widget, i_1_);
						} else if (!bool_31_) {
							if (player.aBoolean11135) {
								Class4.method171((byte) -116, i, var_aa, Node_Sub38_Sub24.aGLSpriteArray10356[7], i_27_, i_26_, widget, i_1_);
							} else if (bool) {
								Class4.method171((byte) -116, i, var_aa, Node_Sub38_Sub24.aGLSpriteArray10356[3], i_27_, i_26_, widget, i_1_);
							} else if (!bool_29_) {
								Class4.method171((byte) -116, i, var_aa, Node_Sub38_Sub24.aGLSpriteArray10356[2], i_27_, i_26_, widget, i_1_);
							} else {
								Class4.method171((byte) -116, i, var_aa, Node_Sub38_Sub24.aGLSpriteArray10356[5], i_27_, i_26_, widget, i_1_);
							}
						} else {
							Class4.method171((byte) -116, i, var_aa, Node_Sub38_Sub24.aGLSpriteArray10356[4], i_27_, i_26_, widget, i_1_);
						}
					}
				}
				Class223[] class223s = Class320_Sub24.cachedHintIcons;
				for (int i_32_ = 0; class223s.length > i_32_; i_32_++) {
					Class223 class223 = class223s[i_32_];
					if (class223 != null && class223.anInt2654 != 0 && (Class174.clientCycle % 20 ^ 0xffffffff) > -11) {
						if ((class223.anInt2654 ^ 0xffffffff) == -2) {
							Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) class223.anInt2658);
							if (node_sub41 != null) {
								Npc npc = node_sub41.aNpc7518;
								int i_33_ = -(i_5_ / 128) + npc.anInt5934 / 128;
								int i_34_ = npc.anInt5940 / 128 + -(i_4_ / 128);
								CacheNode_Sub8.method2318(i_33_, i_1_, (byte) 124, 360000L, var_aa, class223.anInt2659, i, i_34_, widget);
							}
						}
						if (class223.anInt2654 == 2) {
							int i_35_ = class223.anInt2662 / 128 + -(i_5_ / 128);
							int i_36_ = class223.anInt2653 / 128 - i_4_ / 128;
							long l = (long) (class223.anInt2655 << 7);
							l *= l;
							CacheNode_Sub8.method2318(i_35_, i_1_, (byte) 124, l, var_aa, class223.anInt2659, i, i_36_, widget);
						}
						if (class223.anInt2654 == 10 && (class223.anInt2658 ^ 0xffffffff) <= -1 && class223.anInt2658 < Class270_Sub2.LOCAL_PLAYERS.length) {
							Player player = Class270_Sub2.LOCAL_PLAYERS[class223.anInt2658];
							if (player != null) {
								int i_37_ = player.anInt5934 / 128 + -(i_5_ / 128);
								int i_38_ = -(i_4_ / 128) + player.anInt5940 / 128;
								CacheNode_Sub8.method2318(i_37_, i_1_, (byte) 124, 360000L, var_aa, class223.anInt2659, i, i_38_, widget);
							}
						}
					}
				}
				if (Class320_Sub22.anInt8415 != 4) {
					if (Class359.anInt4467 != 0) {
						int i_39_ = -(i_5_ / 128) + (2 + 4 * Class359.anInt4467) - -(2 * (-1 + Class295.myPlayer.getSize((byte) 50)));
						int i_40_ = -(i_4_ / 128) + 4 * Node_Sub15_Sub4.anInt9798 + (2 - (2 + -(Class295.myPlayer.getSize((byte) 127) * 2)));
						Class4.method171((byte) -116, i, var_aa, Node_Sub53.aGLSpriteArray7666[Class144.aBoolean1791 ? 1 : 0], i_40_, i_39_, widget, i_1_);
					}
					if (!Class295.myPlayer.aBoolean11131) {
						graphicstoolkit.method1239(3, 3, i - -(widget.anInt4695 / 2) - 1, (byte) 116, widget.anInt4809 / 2 + i_1_ + -1, -1);
					}
				}
			}
		}
	}
}
