/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class76
{
	static int anInt1009;
	static int anInt1010;
	static int anInt1011 = 0;
	static int anInt1012;
	static int anInt1013;
	static int anInt1014;
	static int anInt1015;
	
	static final void method767(boolean bool, CacheNode cachenode, CacheNode cachenode_0_) {
		if (cachenode.aCacheNode7036 != null) {
			cachenode.method2275(-127);
		}
		anInt1010++;
		cachenode.aCacheNode7036 = cachenode_0_.aCacheNode7036;
		cachenode.aCacheNode7035 = cachenode_0_;
		cachenode.aCacheNode7036.aCacheNode7035 = cachenode;
		cachenode.aCacheNode7035.aCacheNode7036 = cachenode;
		if (bool != false) {
			method767(true, null, null);
		}
	}
	
	static final void method768(int i) {
		anInt1015++;
		if (i == -147) {
			for (int i_1_ = 0; i_1_ < 5; i_1_++)
				Plane.aBooleanArray3401[i_1_] = false;
			Class328_Sub1.anInt8501 = Class98.anInt5061;
			Class320_Sub17.anInt8371 = Node_Sub10.anInt7079;
			Class123.anInt1568 = Class170.anInt2053;
			Class109.anInt1367 = -1;
			Class179.anInt2127 = OutcommingPacket.anInt4050;
			Class367.anInt4541 = Class368.anInt4551 = -1;
			Class203.anInt2452 = -1;
			Node_Sub15_Sub4.anInt9801 = Class174.clientCycle;
			Node_Sub13.anInt7116 = 0;
			Node_Sub24.anInt7229 = 0;
			Class320_Sub22.anInt8415 = 5;
			Node_Sub38_Sub12.anInt10228 = Class190.anInt2331;
		}
	}
	
	static final void method769(Actor actor, boolean bool) {
		anInt1012++;
		if (actor.anIntArray10845 != null || actor.anIntArray10881 != null) {
			boolean bool_2_ = bool;
			for (int i = 0; actor.anIntArray10845.length > i; i++) {
				int i_3_ = -1;
				if (actor.anIntArray10845 != null) {
					i_3_ = actor.anIntArray10845[i];
				}
				if (i_3_ == -1) {
					if (!actor.method858(256, i, -1)) {
						bool_2_ = false;
					}
				} else {
					bool_2_ = false;
					int i_6_;
					int i_7_;
					if ((i_3_ & ~0x3fffffff) != -1073741824) {
						if ((0x8000 & i_3_ ^ 0xffffffff) != -1) {
							int i_8_ = i_3_ & 0x7fff;
							Player player = Class270_Sub2.LOCAL_PLAYERS[i_8_];
							if (player == null) {
								actor.method858(256, i, -1);
								continue;
							}
							i_7_ = -player.anInt5940 + actor.anInt5940;
							i_6_ = actor.anInt5934 + -player.anInt5934;
						} else {
							Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) i_3_);
							if (node_sub41 != null) {
								Npc npc = node_sub41.aNpc7518;
								i_7_ = actor.anInt5940 - npc.anInt5940;
								i_6_ = actor.anInt5934 - npc.anInt5934;
							} else {
								actor.method858(256, i, -1);
								continue;
							}
						}
					} else {
						int i_9_ = 0xfffffff & i_3_;
						int i_10_ = i_9_ >> 14;
						i_6_ = actor.anInt5934 - (256 + 512 * (-Node_Sub53.gameSceneBaseX + i_10_));
						int i_11_ = i_9_ & 0x3fff;
						i_7_ = -256 + (-(512 * (i_11_ - Class320_Sub4.gameSceneBaseY)) + actor.anInt5940);
					}
					if ((i_6_ ^ 0xffffffff) != -1 || (i_7_ ^ 0xffffffff) != -1) {
						actor.method858(256, i, 0x3fff & (int) (Math.atan2((double) i_6_, (double) i_7_) * 2607.5945876176133));
					}
				}
			}
			if (bool_2_) {
				actor.anIntArray10845 = null;
				actor.anIntArray10881 = null;
			}
		}
	}
	
	static final void method770(int i, int i_12_, int i_13_) {
		anInt1014++;
		if (i < 113) {
			method767(false, null, null);
		}
		if (CacheNode_Sub15.method2379(7015, i_13_)) {
			Client.method115(Class134_Sub3.aWidgetArrayArray9035[i_13_], 5204, i_12_);
		}
	}
	
	static final IComponentDefinitions method771(byte b, int i) {
		if (b != 107) {
			method770(108, 116, -70);
		}
		anInt1009++;
		int i_14_ = i >> 16;
		int i_15_ = i & 0xffff;
		if (Class134_Sub3.aWidgetArrayArray9035[i_14_] == null || Class134_Sub3.aWidgetArrayArray9035[i_14_][i_15_] == null) {
			boolean bool = CacheNode_Sub15.method2379(b + 6908, i_14_);
			if (!bool) {
				return null;
			}
		}
		return Class134_Sub3.aWidgetArrayArray9035[i_14_][i_15_];
	}
}
