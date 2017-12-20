/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class78
{
	protected int anInt1022;
	protected Node_Sub45_Sub1 aNode_Sub45_Sub1_1023;
	static int anInt1024;
	protected Node_Sub9_Sub2 aNode_Sub9_Sub2_1025;
	protected int anInt1026;
	protected byte aByte1027;
	protected int anInt1028;
	static int anInt1029;
	static int[] anIntArray1030 = new int[2];
	static int[] anIntArray1031 = new int[8];
	static int anInt1032;
	static Index aClass302_1033;
	protected int anInt1034;
	protected Node_Sub49 aNode_Sub49_1035;
	protected int anInt1036;
	static int anInt1037;
	protected int anInt1038;
	protected Class65 aClass65_1039;
	static int anInt1040;
	protected Animable anAnimable1041;
	
	static final void method776(int i, int i_0_, int i_1_, GraphicsToolkit graphicstoolkit) {
		anInt1029++;
		if ((i_1_ ^ 0xffffffff) <= -1 && (i ^ 0xffffffff) <= -1 && (ClanChat.anInt764 ^ 0xffffffff) != -1 && Class150_Sub2.anInt8955 != 0) {
			int i_2_;
			int i_3_;
			int i_4_;
			int i_5_;
			Class336 class336;
			int i_6_;
			int i_7_;
			if (Class71.aBoolean967) {
				Class379.method4159(3, false);
				class336 = graphicstoolkit.n();
				int[] is = graphicstoolkit.Y();
				i_4_ = is[1];
				i_2_ = is[2];
				i_3_ = is[3];
				i_5_ = is[0];
				i_6_ = Class132.method1564(12447, false) + i_1_;
				i_7_ = Node_Sub36_Sub4.method2764(-1, false) + i;
			} else {
				graphicstoolkit.DA(Class97.anInt1279, IComponentDefinitions.anInt4859, ClanChat.anInt764, Class150_Sub2.anInt8955);
				i_2_ = ClanChat.anInt764;
				i_3_ = Class150_Sub2.anInt8955;
				i_4_ = IComponentDefinitions.anInt4859;
				i_5_ = Class97.anInt1279;
				graphicstoolkit.KA(Class385.anInt4913, Node_Sub14.anInt7119, ClanChat.anInt764, Class150_Sub2.anInt8955);
				class336 = graphicstoolkit.y();
				class336.method3864(Class339_Sub6.anInt8694, Class231.anInt2764, Class194_Sub3.anInt6907, Class320_Sub23.anInt8434, Node_Sub15_Sub5.anInt9806, Class375.anInt4657);
				i_6_ = i_1_;
				graphicstoolkit.a(class336);
				i_7_ = i;
			}
			Class377_Sub1.method4130(true, -10385);
			if ((i_3_ ^ 0xffffffff) == -1) {
				i_3_ = 1;
			}
			if ((i_2_ ^ 0xffffffff) == -1) {
				i_2_ = 1;
			}
			if (Node_Sub38_Sub37.aPlaneArray10466 != null && (!Class87.removeWalkHere || (0x40 & Class200_Sub2.anInt4943) != 0)) {
				int i_8_ = -1;
				int i_9_ = -1;
				int i_10_ = graphicstoolkit.i();
				int i_11_ = graphicstoolkit.XA();
				int i_12_;
				int i_13_;
				int i_14_;
				int i_15_;
				if (!Node_Sub15_Sub10.aBoolean9850) {
					i_14_ = (-i_4_ + i_7_) * i_10_ / i_3_;
					i_13_ = i_11_ * (-i_5_ + i_6_) / i_2_;
					i_12_ = (-i_5_ + i_6_) * i_10_ / i_2_;
					i_15_ = (-i_4_ + i_7_) * i_11_ / i_3_;
				} else {
					i_12_ = i_13_ = Class308.anInt3912 * (i_6_ - i_5_) / i_2_;
					i_14_ = i_15_ = Class308.anInt3912 * (-i_4_ + i_7_) / i_3_;
				}
				int[] is = { i_12_, i_14_, i_10_ };
				int[] is_16_ = { i_13_, i_15_, i_11_ };
				class336.method3855(is);
				class336.method3855(is_16_);
				float f = CacheNode_Sub20_Sub1.method2412((byte) 56, (float) is[0], (float) is_16_[2], 4, (float) is[2], (float) is_16_[1], (float) is[1], (float) is_16_[0]);
				if (f > 0.0F) {
					int i_17_ = is_16_[0] + -is[0];
					int i_18_ = is_16_[2] + -is[2];
					int i_19_ = (int) ((float) is[0] + f * (float) i_17_);
					int i_20_ = (int) ((float) is[2] + f * (float) i_18_);
					i_8_ = i_19_ + (Class295.myPlayer.getSize((byte) 111) - 1 << 8) >> 9;
					i_9_ = i_20_ - -(-1 + Class295.myPlayer.getSize((byte) 102) << 8) >> 9;
					int i_21_ = Class295.myPlayer.plane;
					if ((i_21_ ^ 0xffffffff) > -4 && (0x2 & CacheNode_Sub11.aByteArrayArrayArray9550[1][i_19_ >> 9][i_20_ >> 9] ^ 0xffffffff) != -1) {
						i_21_++;
					}
				}
				if (i_8_ != -1 && i_9_ != -1) {
					if (!Class87.removeWalkHere || (0x40 & Class200_Sub2.anInt4943 ^ 0xffffffff) == -1) {
						if (Class377_Sub1.showFaceHere) {
							Node_Sub32.method2731(false, -1, 0L, i_8_, i_9_, Class22.aClass22_390.method297(Class35.language), 11, true, -1, "", (long) (i_9_ | i_8_ << 0), (byte) -18, true);
						}
						Node_Sub32.method2731(false, -1, 0L, i_8_, i_9_, Class173.aString2085, 58, true, Class173.anInt2086, "", (long) (i_9_ | i_8_ << 0), (byte) -18, true);
						InputStream_Sub1.anInt76++;
					} else {
						IComponentDefinitions widget = Node_Sub3.method2169(i_0_ ^ ~0x64, Class46.anInt681, Node_Sub15_Sub9.anInt9839);
						if (widget != null) {
							Node_Sub32.method2731(false, -1, 0L, i_8_, i_9_, Class84.aString1148, 21, true, Class201.anInt2444, " ->", (long) (i_8_ << 0 | i_9_), (byte) -18, true);
						} else {
							Node_Sub38_Sub23.method2863(-19316);
						}
					}
				}
			}
			if (Class71.aBoolean967) {
				Class258.method3127((byte) 122);
			}
			for (int i_22_ = i_0_; (i_22_ ^ 0xffffffff) > ((Class71.aBoolean967 ? 2 : 1) ^ 0xffffffff); i_22_++) {
				boolean bool = i_22_ == 0;
				Class179 class179 = !bool ? Class7.aClass179_157 : Node_Sub36_Sub3.aClass179_10058;
				int i_23_ = i_1_;
				int i_24_ = i;
				if (Class71.aBoolean967) {
					Class379.method4159(3, bool);
					i_23_ += Class132.method1564(i_0_ ^ 0x309f, bool);
					i_24_ += Node_Sub36_Sub4.method2764(i_0_ + -1, bool);
				}
				Class103 class103 = class179.aClass103_2124;
				for (EntityNode_Sub6 entitynode_sub6 = (EntityNode_Sub6) class103.method1113((byte) -113); entitynode_sub6 != null; entitynode_sub6 = (EntityNode_Sub6) class103.method1108(115)) {
					if ((Node_Sub25_Sub1.aBoolean9952 || (entitynode_sub6.anAnimable5990.plane ^ 0xffffffff) == (Class295.myPlayer.plane ^ 0xffffffff)) && entitynode_sub6.method971(graphicstoolkit, (byte) 126, i_24_, i_23_)) {
						int i_27_;
						int i_28_;
						if (!(entitynode_sub6.anAnimable5990 instanceof Mobile)) {
							i_28_ = entitynode_sub6.anAnimable5990.anInt5940 >> 9;
							i_27_ = entitynode_sub6.anAnimable5990.anInt5934 >> 9;
						} else {
							i_27_ = ((Mobile) entitynode_sub6.anAnimable5990).aShort9119;
							i_28_ = ((Mobile) entitynode_sub6.anAnimable5990).aShort9120;
						}
						if (entitynode_sub6.anAnimable5990 instanceof Player) {
							Player player = (Player) entitynode_sub6.anAnimable5990;
							int i_29_ = player.getSize((byte) 50);
							if ((0x1 & i_29_) == 0 && (0x1ff & player.anInt5934) == 0 && (0x1ff & player.anInt5940) == 0 || (0x1 & i_29_) == 1 && (0x1ff & player.anInt5934) == 256 && (player.anInt5940 & 0x1ff) == 256) {
								int i_30_ = player.anInt5934 - (-1 + player.getSize((byte) 79) << 8);
								int i_31_ = player.anInt5940 - (player.getSize((byte) 61) + -1 << 8);
								for (int i_32_ = 0; (Node_Sub25_Sub3.localNPCsCount ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++) {
									Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) Class54.LocalNPCsIndexes[i_32_]);
									if (node_sub41 != null) {
										Npc npc = node_sub41.aNpc7518;
										if ((Class174.clientCycle ^ 0xffffffff) != (npc.anInt10863 ^ 0xffffffff) && npc.aBoolean10826) {
											int i_33_ = npc.anInt5934 - (-1 + npc.aNpcDefinition11122.anInt2811 << 8);
											int i_34_ = -(-1 + npc.aNpcDefinition11122.anInt2811 << 8) + npc.anInt5940;
											if ((i_30_ ^ 0xffffffff) >= (i_33_ ^ 0xffffffff) && npc.aNpcDefinition11122.anInt2811 <= -(-i_30_ + i_33_ >> 9) + player.getSize((byte) 126) && i_34_ >= i_31_ && (npc.aNpcDefinition11122.anInt2811 ^ 0xffffffff) >= (player.getSize((byte) 121) - (-i_31_ + i_34_ >> 9) ^ 0xffffffff)) {
												Class352.drawNPCOptions((entitynode_sub6.anAnimable5990.plane ^ 0xffffffff) != (Class295.myPlayer.plane ^ 0xffffffff), npc);
												npc.anInt10863 = Class174.clientCycle;
											}
										}
									}
								}
								int i_35_ = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
								int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
								for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff); i_36_++) {
									Player player_37_ = Class270_Sub2.LOCAL_PLAYERS[is[i_36_]];
									if (player_37_ != null && player_37_.anInt10863 != Class174.clientCycle && player_37_ != player && player_37_.aBoolean10826) {
										int i_38_ = player_37_.anInt5934 + -(player_37_.getSize((byte) 123) - 1 << 8);
										int i_39_ = player_37_.anInt5940 + -(player_37_.getSize((byte) 67) + -1 << 8);
										if (i_38_ >= i_30_ && player_37_.getSize((byte) 71) <= -(i_38_ + -i_30_ >> 9) + player.getSize((byte) 110) && (i_39_ ^ 0xffffffff) <= (i_31_ ^ 0xffffffff) && player_37_.getSize((byte) 79) <= -(i_39_ + -i_31_ >> 9) + player.getSize((byte) 100)) {
											Class223.drawPlayerOptions(entitynode_sub6.anAnimable5990.plane != Class295.myPlayer.plane, player_37_, -15052);
											player_37_.anInt10863 = Class174.clientCycle;
										}
									}
								}
							}
							if ((Class174.clientCycle ^ 0xffffffff) == (player.anInt10863 ^ 0xffffffff)) {
								continue;
							}
							Class223.drawPlayerOptions((Class295.myPlayer.plane ^ 0xffffffff) != (entitynode_sub6.anAnimable5990.plane ^ 0xffffffff), player, -15052);
							player.anInt10863 = Class174.clientCycle;
						}
						if (entitynode_sub6.anAnimable5990 instanceof Npc) {
							Npc npc = (Npc) entitynode_sub6.anAnimable5990;
							if (npc.aNpcDefinition11122 != null) {
								if ((npc.aNpcDefinition11122.anInt2811 & 0x1 ^ 0xffffffff) == -1 && (0x1ff & npc.anInt5934 ^ 0xffffffff) == -1 && (0x1ff & npc.anInt5940) == 0 || (0x1 & npc.aNpcDefinition11122.anInt2811 ^ 0xffffffff) == -2 && (0x1ff & npc.anInt5934) == 256 && (0x1ff & npc.anInt5940) == 256) {
									int i_40_ = npc.anInt5934 - (-1 + npc.aNpcDefinition11122.anInt2811 << 8);
									int i_41_ = npc.anInt5940 - (npc.aNpcDefinition11122.anInt2811 + -1 << 8);
									for (int i_42_ = 0; (Node_Sub25_Sub3.localNPCsCount ^ 0xffffffff) < (i_42_ ^ 0xffffffff); i_42_++) {
										Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) Class54.LocalNPCsIndexes[i_42_]);
										if (node_sub41 != null) {
											Npc npc_43_ = node_sub41.aNpc7518;
											if (npc_43_.anInt10863 != Class174.clientCycle && npc_43_ != npc && npc_43_.aBoolean10826) {
												int i_44_ = -(npc_43_.aNpcDefinition11122.anInt2811 - 1 << 8) + npc_43_.anInt5934;
												int i_45_ = npc_43_.anInt5940 + -(npc_43_.aNpcDefinition11122.anInt2811 - 1 << 8);
												if ((i_40_ ^ 0xffffffff) >= (i_44_ ^ 0xffffffff) && (-(-i_40_ + i_44_ >> 9) + npc.aNpcDefinition11122.anInt2811 ^ 0xffffffff) <= (npc_43_.aNpcDefinition11122.anInt2811 ^ 0xffffffff) && (i_45_ ^ 0xffffffff) <= (i_41_ ^ 0xffffffff) && (npc_43_.aNpcDefinition11122.anInt2811 ^ 0xffffffff) >= (-(-i_41_ + i_45_ >> 9) + npc.aNpcDefinition11122.anInt2811 ^ 0xffffffff)) {
													Class352.drawNPCOptions(Class295.myPlayer.plane != entitynode_sub6.anAnimable5990.plane, npc_43_);
													npc_43_.anInt10863 = Class174.clientCycle;
												}
											}
										}
									}
									int i_46_ = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
									int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
									for (int i_47_ = 0; i_46_ > i_47_; i_47_++) {
										Player player = Class270_Sub2.LOCAL_PLAYERS[is[i_47_]];
										if (player != null && (player.anInt10863 ^ 0xffffffff) != (Class174.clientCycle ^ 0xffffffff) && player.aBoolean10826) {
											int i_48_ = player.anInt5934 + -(player.getSize((byte) 125) + -1 << 8);
											int i_49_ = player.anInt5940 - (-1 + player.getSize((byte) 76) << 8);
											if ((i_40_ ^ 0xffffffff) >= (i_48_ ^ 0xffffffff) && player.getSize((byte) 98) <= -(i_48_ - i_40_ >> 9) + npc.aNpcDefinition11122.anInt2811 && i_41_ <= i_49_ && (player.getSize((byte) 127) ^ 0xffffffff) >= (-(i_49_ - i_41_ >> 9) + npc.aNpcDefinition11122.anInt2811 ^ 0xffffffff)) {
												Class223.drawPlayerOptions(Class295.myPlayer.plane != entitynode_sub6.anAnimable5990.plane, player, i_0_ ^ ~0x3acb);
												player.anInt10863 = Class174.clientCycle;
											}
										}
									}
								}
								if ((Class174.clientCycle ^ 0xffffffff) == (npc.anInt10863 ^ 0xffffffff)) {
									continue;
								}
								Class352.drawNPCOptions((Class295.myPlayer.plane ^ 0xffffffff) != (entitynode_sub6.anAnimable5990.plane ^ 0xffffffff), npc);
								npc.anInt10863 = Class174.clientCycle;
							}
						}
						if (entitynode_sub6.anAnimable5990 instanceof Animable_Sub3_Sub1) {
							int i_50_ = i_27_ - -Node_Sub53.gameSceneBaseX;
							int i_51_ = Class320_Sub4.gameSceneBaseY + i_28_;
							Node_Sub11 node_sub11 = (Node_Sub11) Class266.aHashTable3380.method1518(3512, (long) (i_51_ << 14 | entitynode_sub6.anAnimable5990.plane << 28 | i_50_));
							if (node_sub11 != null) {
								int i_52_ = 0;
								for (Node_Sub8 node_sub8 = (Node_Sub8) node_sub11.aClass312_7104.method3622((byte) -60); node_sub8 != null; node_sub8 = (Node_Sub8) node_sub11.aClass312_7104.method3623((byte) 106)) {
									ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(node_sub8.anInt7065, 14434);
									if (Class87.removeWalkHere && (Class295.myPlayer.plane ^ 0xffffffff) == (entitynode_sub6.anAnimable5990.plane ^ 0xffffffff)) {
										Class267 class267 = Class324.anInt4087 != -1 ? Class188_Sub2_Sub2.aClass36_9366.method394(Class324.anInt4087, -89) : null;
										if ((0x1 & Class200_Sub2.anInt4943 ^ 0xffffffff) != -1 && (class267 == null || (itemdefinition.method1678(Class324.anInt4087, class267.anInt3443, 10247) ^ 0xffffffff) != (class267.anInt3443 ^ 0xffffffff))) {
											Class120.anInt1518++;
											Node_Sub32.method2731(false, -1, (long) node_sub8.anInt7065, i_27_, i_28_, Class84.aString1148, 17, true, Class201.anInt2444, Class66.aString5177 + " -> <col=ff9040>" + itemdefinition.aString1860, (long) i_52_, (byte) -18, false);
										}
									}
									if ((entitynode_sub6.anAnimable5990.plane ^ 0xffffffff) == (Class295.myPlayer.plane ^ 0xffffffff)) {
										String[] strings = itemdefinition.aStringArray1920;
										for (int i_53_ = -1 + strings.length; i_53_ >= 0; i_53_--) {
											if (strings[i_53_] != null) {
												int i_54_ = 0;
												int i_55_ = Class230_Sub1.anInt9013;
												if ((i_53_ ^ 0xffffffff) == -1) {
													i_54_ = 25;
												}
												if (i_53_ == 1) {
													i_54_ = 5;
												}
												if ((i_53_ ^ 0xffffffff) == -3) {
													i_54_ = 50;
												}
												if ((i_53_ ^ 0xffffffff) == -4) {
													i_54_ = 6;
												}
												if (i_53_ == 4) {
													i_54_ = 45;
												}
												if (i_53_ == 5) {
													i_54_ = 1007;
												}
												if ((i_53_ ^ 0xffffffff) == (itemdefinition.anInt1908 ^ 0xffffffff)) {
													i_55_ = itemdefinition.anInt1889;
												}
												if ((i_53_ ^ 0xffffffff) == (itemdefinition.anInt1849 ^ 0xffffffff)) {
													i_55_ = itemdefinition.anInt1851;
												}
												Class369.anInt4559++;
												Node_Sub32.method2731(false, -1, (long) node_sub8.anInt7065, i_27_, i_28_, strings[i_53_], i_54_, true, i_55_, "<col=ff9040>" + itemdefinition.aString1860, (long) i_52_, (byte) -18, false);
											}
										}
									}
									i_52_++;
								}
							}
						}
						if (entitynode_sub6.anAnimable5990 instanceof Interface19) {
							Interface19 interface19 = (Interface19) entitynode_sub6.anAnimable5990;
							ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(interface19.method72(-32136), 102);
							if (objectdefinition.anIntArray2984 != null) {
								objectdefinition = objectdefinition.method3038(13, Class24.aClass275_442);
							}
							if (objectdefinition != null) {
								if (Class87.removeWalkHere && Class295.myPlayer.plane == entitynode_sub6.anAnimable5990.plane) {
									Class267 class267 = (Class324.anInt4087 ^ 0xffffffff) != 0 ? Class188_Sub2_Sub2.aClass36_9366.method394(Class324.anInt4087, -95) : null;
									if ((Class200_Sub2.anInt4943 & 0x4) != 0 && (class267 == null || objectdefinition.method3053(class267.anInt3443, 11, Class324.anInt4087) != class267.anInt3443)) {
										Class126.anInt1616++;
										Node_Sub32.method2731(false, -1, Animable_Sub4_Sub1.method929(interface19, i_28_, i_27_, true), i_27_, i_28_, Class84.aString1148, 60, true, Class201.anInt2444, Class66.aString5177 + " -> <col=00ffff>" + objectdefinition.aString2999, (long) interface19.hashCode(), (byte) -18, false);
									}
								}
								if (Class295.myPlayer.plane == entitynode_sub6.anAnimable5990.plane) {
									String[] strings = objectdefinition.aStringArray2980;
									if (strings != null) {
										for (int i_56_ = strings.length - 1; (i_56_ ^ 0xffffffff) <= -1; i_56_--) {
											if (strings[i_56_] != null) {
												int i_57_ = 0;
												int i_58_ = Class230_Sub1.anInt9013;
												if (i_56_ == 0) {
													i_57_ = 19;
												}
												if ((i_56_ ^ 0xffffffff) == -2) {
													i_57_ = 13;
												}
												if (i_56_ == 2) {
													i_57_ = 46;
												}
												if (i_56_ == 3) {
													i_57_ = 8;
												}
												if ((i_56_ ^ 0xffffffff) == -5) {
													i_57_ = 1010;
												}
												if ((i_56_ ^ 0xffffffff) == (objectdefinition.anInt2987 ^ 0xffffffff)) {
													i_58_ = objectdefinition.anInt3008;
												}
												if (i_56_ == 5) {
													i_57_ = 1008;
												}
												if (objectdefinition.anInt3038 == i_56_) {
													i_58_ = objectdefinition.anInt3013;
												}
												Node_Sub32.method2731(false, -1, Animable_Sub4_Sub1.method929(interface19, i_28_, i_27_, true), i_27_, i_28_, strings[i_56_], i_57_, true, i_58_, "<col=00ffff>" + objectdefinition.aString2999, (long) interface19.hashCode(), (byte) -18, false);
												Class40.anInt618++;
											}
										}
									}
								}
							}
						}
					}
				}
				if (Class71.aBoolean967) {
					Class258.method3127((byte) 122);
				}
			}
			Class377_Sub1.method4130(false, -10385);
		}
	}
	
	final boolean method777(byte b) {
		anInt1037++;
		if (b != -9) {
			method777((byte) 66);
		}
        return !(aByte1027 != 2 && (aByte1027 ^ 0xffffffff) != -4);
    }
	
	static final boolean method778(int i, int i_59_, int i_60_, boolean bool, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_) {
		anInt1040++;
		int fromSceneX = Class295.myPlayer.scenePositionXQueue[0];
		int fromSceneY = Class295.myPlayer.scenePositionYQueue[0];
		if ((fromSceneX ^ 0xffffffff) > -1 || fromSceneX >= Node_Sub54.GAME_SCENE_WDITH || (fromSceneY ^ 0xffffffff) > -1 || (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff) >= (fromSceneY ^ 0xffffffff)) {
			return false;
		}
		if (i_61_ < 0 || (Node_Sub54.GAME_SCENE_WDITH ^ 0xffffffff) >= (i_61_ ^ 0xffffffff) || (i_59_ ^ 0xffffffff) > -1 || i_59_ >= Class377_Sub1.GAME_SCENE_HEIGHT) {
			return false;
		}
		int steps = Class275.calculateRoute(fromSceneX, fromSceneY, i_61_, i_59_, Class295.myPlayer.getSize((byte) 107), i_63_, bool, i_65_, i_60_, i_62_, i, Class304.SCENE_CLIP_DATA_PLANES[Class295.myPlayer.plane], Class328_Sub1.calculatedScenePositionXs, Class258.calculatedScenePositionYs, (byte) -41);
		if (steps < 1) {
			return false;
		}
		Class359.anInt4467 = Class328_Sub1.calculatedScenePositionXs[-1 + steps];
		Node_Sub15_Sub4.anInt9798 = Class258.calculatedScenePositionYs[steps - 1];
		Class144.aBoolean1791 = false;
		NpcDefinition.method3002((byte) 97);
		return true;
	}
	
	static final void method779(int i, int i_70_, byte b) {
		anInt1032++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 5, (long) i);
		cachenode_sub2.method2288(0);
		if (b != -36) {
			aClass302_1033 = null;
		}
		cachenode_sub2.anInt9434 = i_70_;
	}
	
	static final void method780(long l, int i, GraphicsToolkit graphicstoolkit) {
		CacheNode_Sub12.anInt9555 = Class280.anInt3570;
		anInt1024++;
		Class228.anInt2719 = i;
		za_Sub2.anInt10514 = 0;
		Class280.anInt3570 = 0;
		long l_71_ = Class313.method3650(false);
		for (EntityNode_Sub4 entitynode_sub4 = (EntityNode_Sub4) Animable_Sub2.aClass103_9116.method1113((byte) -128); entitynode_sub4 != null; entitynode_sub4 = (EntityNode_Sub4) Animable_Sub2.aClass103_9116.method1108(109)) {
			if (entitynode_sub4.method962(graphicstoolkit, l)) {
				za_Sub2.anInt10514++;
			}
		}
		if (Class327.aBoolean5347 && (l % 100L ^ 0xffffffffffffffffL) == -1L) {
			//System.out.println("Particle system count: " + Animable_Sub2.aClass103_9116.method1107(-1) + ", running: " + za_Sub2.anInt10514);
			//System.out.println("Emitters: " + Class228.anInt2719 + " Particles: " + Class280.anInt3570 + ". Time taken: " + (-l_71_ + Class313.method3650(false)) + "ms");
		}
	}
	
	public static void method781(boolean bool) {
		anIntArray1030 = null;
		if (bool != true) {
			method779(-3, 113, (byte) 76);
		}
		anIntArray1031 = null;
		aClass302_1033 = null;
	}
	
	Class78(byte b, int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, Animable animable) {
		anInt1026 = i_76_;
		aByte1027 = b;
		anInt1038 = i;
		anInt1022 = i_73_;
		anInt1036 = i_75_;
		anInt1028 = i_72_;
		anAnimable1041 = animable;
		anInt1034 = i_74_;
	}
}
