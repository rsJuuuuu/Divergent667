/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class364
{
	protected int anInt4511;
	static boolean aBoolean4512;
	static Class273[] aClass273Array4513;
	static int anInt4514 = 0;
	private int anInt4515;
	protected Class239 aClass239_4516;
	static int anInt4517;
	static int anInt4518;
	protected int anInt4519;
	static int anInt4520;
	static int anInt4521;
	
	static final void method4057(boolean bool, int i, int i_0_, int i_1_, byte b) {
		if (aa.anInt101 == 4) {
			aa.anInt101 = 0;
			Class200_Sub2.anInt4935 = -1;
		}
		anInt4521++;
		if (bool || (Player.anInt11178 ^ 0xffffffff) != (i ^ 0xffffffff) || Class277.anInt3527 != i_1_ || Class94.anInt1249 != CacheNode_Sub20_Sub1.myPlayerPlane && Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) != 1) {
			Class277.anInt3527 = i_1_;
			Player.anInt11178 = i;
			Class94.anInt1249 = CacheNode_Sub20_Sub1.myPlayerPlane;
			if (Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) == 1) {
				Class94.anInt1249 = 0;
			}
			Class48.method478(i_0_, (byte) 97);
			Class169_Sub3.method1779(Class93.aGraphicsToolkit1241, Class22.loading_translation.method297(Class35.language), true, Class169_Sub3.aClass357_8820, StandardSprite.aClass52_8945, -16777216);
			int i_2_ = Node_Sub53.gameSceneBaseX;
			Node_Sub53.gameSceneBaseX = 8 * (-(Node_Sub54.GAME_SCENE_WDITH >> 4) + Player.anInt11178);
			int i_3_ = Class320_Sub4.gameSceneBaseY;
			Class320_Sub4.gameSceneBaseY = (Class277.anInt3527 + -(Class377_Sub1.GAME_SCENE_HEIGHT >> 4)) * 8;
			Class92.aCacheNode_Sub11_1233 = Class20.method288(Player.anInt11178 * 8, Class277.anInt3527 * 8);
			Class262_Sub15_Sub1.aClass224_10520 = null;
			int i_4_ = Node_Sub53.gameSceneBaseX + -i_2_;
			int i_5_ = Class320_Sub4.gameSceneBaseY - i_3_;
			if ((i_0_ ^ 0xffffffff) != -13) {
				boolean bool_6_ = false;
				Node_Sub25_Sub3.localNPCsCount = 0;
				int i_7_ = (-1 + Node_Sub54.GAME_SCENE_WDITH) * 512;
				int i_8_ = Class377_Sub1.GAME_SCENE_HEIGHT * 512 + -512;
				for (int i_9_ = 0; (Node_Sub32.cachedNPCcsCount ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
					Node_Sub41 node_sub41 = Class314.LocalNPCs[i_9_];
					if (node_sub41 != null) {
						Npc npc = node_sub41.aNpc7518;
						npc.anInt5940 -= i_5_ * 512;
						npc.anInt5934 -= 512 * i_4_;
						if ((npc.anInt5934 ^ 0xffffffff) <= -1 && (i_7_ ^ 0xffffffff) <= (npc.anInt5934 ^ 0xffffffff) && npc.anInt5940 >= 0 && i_8_ >= npc.anInt5940) {
							boolean bool_10_ = true;
							for (int i_11_ = 0; (npc.scenePositionXQueue.length ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
								npc.scenePositionXQueue[i_11_] -= i_4_;
								npc.scenePositionYQueue[i_11_] -= i_5_;
								if (npc.scenePositionXQueue[i_11_] < 0 || npc.scenePositionXQueue[i_11_] >= Node_Sub54.GAME_SCENE_WDITH || npc.scenePositionYQueue[i_11_] < 0 || Class377_Sub1.GAME_SCENE_HEIGHT <= npc.scenePositionYQueue[i_11_]) {
									bool_10_ = false;
								}
							}
							if (!bool_10_) {
								npc.method879(null, true);
								bool_6_ = true;
								node_sub41.method2160((byte) 29);
							} else {
								Class54.LocalNPCsIndexes[Node_Sub25_Sub3.localNPCsCount++] = npc.index;
							}
						} else {
							npc.method879(null, true);
							bool_6_ = true;
							node_sub41.method2160((byte) 29);
						}
					}
				}
				if (bool_6_) {
					Node_Sub32.cachedNPCcsCount = Class12.aHashTable187.method1519((byte) -90);
					Class12.aHashTable187.method1523((byte) -125, Class314.LocalNPCs);
				}
			} else {
				for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (Node_Sub32.cachedNPCcsCount ^ 0xffffffff); i_12_++) {
					Node_Sub41 node_sub41 = Class314.LocalNPCs[i_12_];
					if (node_sub41 != null) {
						Npc npc = node_sub41.aNpc7518;
						for (int i_13_ = 0; (npc.scenePositionXQueue.length ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
							npc.scenePositionXQueue[i_13_] -= i_4_;
							npc.scenePositionYQueue[i_13_] -= i_5_;
						}
						npc.anInt5934 -= 512 * i_4_;
						npc.anInt5940 -= i_5_ * 512;
					}
				}
			}
			if (b != -36) {
				method4058(-108);
			}
			for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -2049; i_14_++) {
				Player player = Class270_Sub2.LOCAL_PLAYERS[i_14_];
				if (player != null) {
					for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (player.scenePositionXQueue.length ^ 0xffffffff); i_15_++) {
						player.scenePositionXQueue[i_15_] -= i_4_;
						player.scenePositionYQueue[i_15_] -= i_5_;
					}
					player.anInt5940 -= 512 * i_5_;
					player.anInt5934 -= i_4_ * 512;
				}
			}
			Class223[] class223s = Class320_Sub24.cachedHintIcons;
			for (int i_16_ = 0; i_16_ < class223s.length; i_16_++) {
				Class223 class223 = class223s[i_16_];
				if (class223 != null) {
					class223.anInt2653 -= 512 * i_5_;
					class223.anInt2662 -= 512 * i_4_;
				}
			}
			for (Node_Sub19 node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3613(b + 65316); node_sub19 != null; node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3620(b ^ ~0xffff23)) {
				node_sub19.anInt7171 -= i_4_;
				node_sub19.anInt7161 -= i_5_;
				if (Class61.anInt898 != 4 && (node_sub19.anInt7171 < 0 || node_sub19.anInt7161 < 0 || (node_sub19.anInt7171 ^ 0xffffffff) <= (Node_Sub54.GAME_SCENE_WDITH ^ 0xffffffff) || node_sub19.anInt7161 >= Class377_Sub1.GAME_SCENE_HEIGHT)) {
					node_sub19.method2160((byte) 60);
				}
			}
			for (Node_Sub19 node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3613(65280); node_sub19 != null; node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3620(b ^ ~0xffff23)) {
				node_sub19.anInt7161 -= i_5_;
				node_sub19.anInt7171 -= i_4_;
				if (Class61.anInt898 != 4 && (node_sub19.anInt7171 < 0 || node_sub19.anInt7161 < 0 || node_sub19.anInt7171 >= Node_Sub54.GAME_SCENE_WDITH || node_sub19.anInt7161 >= Class377_Sub1.GAME_SCENE_HEIGHT)) {
					node_sub19.method2160((byte) 105);
				}
			}
			if (Class61.anInt898 != 4) {
				for (Node_Sub11 node_sub11 = (Node_Sub11) Class266.aHashTable3380.method1516(false); node_sub11 != null; node_sub11 = (Node_Sub11) Class266.aHashTable3380.method1520(b ^ ~0x78)) {
					int i_17_ = (int) (0x3fffL & node_sub11.aLong2797);
					int i_18_ = i_17_ - Node_Sub53.gameSceneBaseX;
					int i_19_ = (int) (node_sub11.aLong2797 >> 14 & 0x3fffL);
					int i_20_ = i_19_ + -Class320_Sub4.gameSceneBaseY;
					if (i_18_ < 0 || (i_20_ ^ 0xffffffff) > -1 || i_18_ >= Node_Sub54.GAME_SCENE_WDITH || (i_20_ ^ 0xffffffff) <= (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff)) {
						node_sub11.method2160((byte) 66);
					}
				}
			}
			if (Class359.anInt4467 != 0) {
				Node_Sub15_Sub4.anInt9798 -= i_5_;
				Class359.anInt4467 -= i_4_;
			}
			Class199.method2010((byte) 120);
			if ((i_0_ ^ 0xffffffff) == -13) {
				if ((Class320_Sub22.anInt8415 ^ 0xffffffff) != -5) {
					Class367.anInt4541 = Class368.anInt4551 = -1;
					Class320_Sub22.anInt8415 = 1;
				} else {
					Class234.anInt2792 -= i_4_ * 512;
					Class25.anInt444 -= i_5_ * 512;
					Node_Sub19.anInt7173 -= i_5_ * 512;
					Mobile_Sub4.anInt10987 -= 512 * i_4_;
				}
			} else {
				Class238.anInt2911 -= i_4_;
				Renderer.anInt3663 -= i_4_;
				Node_Sub38_Sub38.anInt10490 -= i_5_;
				Node_Sub10.anInt7079 -= i_5_ * 512;
				Class98.anInt5061 -= i_4_ * 512;
				Class10.anInt174 -= i_5_;
				if (Math.abs(i_4_) > Node_Sub54.GAME_SCENE_WDITH || (Math.abs(i_5_) ^ 0xffffffff) < (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff)) {
					Class120.method1228(-97);
				}
			}
			Class281.method3384((byte) -83);
			Node_Sub18.method2606(126);
			Class20_Sub1.aHashTable5508.method1517(false);
			Class270.aClass312_3477.method3614(-601);
			Class226.aClass103_2684.method1112((byte) -118);
			Node_Sub15_Sub2.method2561(1993405383);
		}
	}
	
	public static void method4058(int i) {
		aClass273Array4513 = null;
		int i_21_ = 56 / ((-43 - i) / 47);
	}
	
	private final void method4059(BufferedStream buffer, int i, int i_22_) {
		if (i < 45) {
			anInt4511 = 118;
		}
		if ((i_22_ ^ 0xffffffff) != -2) {
			if ((i_22_ ^ 0xffffffff) == -3) {
				anInt4511 = buffer.readUnsignedByte();
				anInt4519 = buffer.readUnsignedByte();
			}
		} else {
			anInt4515 = buffer.readUnsignedShort();
		}
		anInt4518++;
	}
	
	final synchronized Class383 method4060(byte b) {
		anInt4517++;
		Class383 class383 = (Class383) aClass239_4516.aClass61_2925.method607((long) anInt4515, 0);
		if (class383 != null) {
			return class383;
		}
		if (b <= 68) {
			anInt4519 = 105;
		}
		class383 = Class383.method4194(aClass239_4516.aClass302_2918, anInt4515, 0);
		if (class383 != null) {
			aClass239_4516.aClass61_2925.method601(class383, 25566, (long) anInt4515);
		}
		return class383;
	}
	
	final void method4061(BufferedStream buffer, int i) {
		if (i != 0) {
			method4059(null, 90, -110);
		}
		anInt4520++;
		for (;;) {
			int i_23_ = buffer.readUnsignedByte();
			if (i_23_ == 0) {
				break;
			}
			method4059(buffer, i + 110, i_23_);
		}
	}
}
