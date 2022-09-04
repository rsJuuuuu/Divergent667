/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class324 {
	static IComponentDefinitions aWidget4085 = null;
	static int anInt4086;
	static int anInt4087;

	static final void processLocalUpdate(int playerIndex, Packet packet) {
		anInt4086++;
		boolean needMasksUpdate = packet.readBits(1) == 1;
		if (needMasksUpdate)
			Node_Sub23_Sub1.DECODE_MASKS_PLAYERS_INDEXES_LIST[Node_Sub9_Sub4.DECODE_MASKS_PLAYERS_COUNT++] = playerIndex;
		int opcode = packet.readBits(2);
		Player player = Class270_Sub2.LOCAL_PLAYERS[playerIndex];
		if (opcode == 0) {
			if (needMasksUpdate) {
				player.aBoolean11156 = false;
			} else { // removes player
				if (Class166.myPlayerIndex == playerIndex) {
					throw new RuntimeException("s:lr");
				}
				PlayerUpdateReference class323 = Class320_Sub10.aClass323Array8296[playerIndex] = new PlayerUpdateReference();
				class323.globalPositionHash = (player.plane << 28)
						+ ((Node_Sub53.gameSceneBaseX
								+ player.scenePositionXQueue[0] >> 6 << 14) - -(Class320_Sub4.gameSceneBaseY
								+ player.scenePositionYQueue[0] >> 6));
				if (player.anInt11180 == -1) {
					class323.anInt4079 = player.aClass99_10893
							.method1086(16383);
				} else {
					class323.anInt4079 = player.anInt11180;
				}
				class323.anInt4074 = player.faceEntity;
				class323.aBoolean4076 = player.aBoolean11157;
				class323.aBoolean4082 = player.aBoolean11135;
				if (player.anInt11164 > 0) {
					Class45.method462((byte) 49, player);
				}
				Class270_Sub2.LOCAL_PLAYERS[playerIndex] = null;
				if (packet.readBits(1) != 0) { // and updates if needed
					Class339_Sub5.processOutsideUpdate(playerIndex, packet,
							28460);
				}
			}
		} else if (opcode == 1) { // normal walk
			int i_2_ = packet.readBits(3);
			int x = player.scenePositionXQueue[0];
			int y = player.scenePositionYQueue[0];
			if (i_2_ == 0) {
				y--;
				x--;
			} else if (i_2_ == 1) {
				y--;
			} else if (i_2_ == 2) {
				y--;
				x++;
			} else if (i_2_ == 3) {
				x--;
			} else if (i_2_ == 4) {
				x++;
			} else if (i_2_ == 5) {
				y++;
				x--;
			} else if (i_2_ == 6) {
				y++;
			} else if (i_2_ == 7) {
				x++;
				y++;
			}
			if (needMasksUpdate) {
				player.anInt11160 = y;
				player.anInt11147 = x;
				player.aBoolean11156 = true;
			} else {
				player.method894(y, x, -9380,
						Class73.movementTypes[playerIndex]);
			}
		} else if (opcode == 2) { // run
			int i_5_ = packet.readBits(4);
			int i_6_ = player.scenePositionXQueue[0];
			int i_7_ = player.scenePositionYQueue[0];
			if (i_5_ == 0) {
				i_6_ -= 2;
				i_7_ -= 2;
			} else if (i_5_ == 1) {
				i_6_--;
				i_7_ -= 2;
			} else if (i_5_ == 2) {
				i_7_ -= 2;
			} else if (i_5_ == 3) {
				i_6_++;
				i_7_ -= 2;
			} else if (i_5_ == 4) {
				i_7_ -= 2;
				i_6_ += 2;
			} else if (i_5_ == 5) {
				i_7_--;
				i_6_ -= 2;
			} else if (i_5_ == 6) {
				i_6_ += 2;
				i_7_--;
			} else if (i_5_ == 7) {
				i_6_ -= 2;
			} else if (i_5_ == 8) {
				i_6_ += 2;
			} else if (i_5_ == 9) {
				i_6_ -= 2;
				i_7_++;
			} else if (i_5_ == 10) {
				i_6_ += 2;
				i_7_++;
			} else if (i_5_ == 11) {
				i_7_ += 2;
				i_6_ -= 2;
			} else if (i_5_ == 12) {
				i_7_ += 2;
				i_6_--;
			} else if (i_5_ == 13) {
				i_7_ += 2;
			} else if (i_5_ == 14) {
				i_7_ += 2;
				i_6_++;
			} else if (i_5_ == 15) {
				i_6_ += 2;
				i_7_ += 2;
			}
			if (needMasksUpdate) {
				player.anInt11147 = i_6_;
				player.anInt11160 = i_7_;
				player.aBoolean11156 = true;
			} else {
				player.method894(i_7_, i_6_, -9380,
						Class73.movementTypes[playerIndex]);
			}
		} else { // teleport
			int teleportType = packet.readBits(1);
			if (teleportType == 0) { // local teleport up to 16 diff
				int i_9_ = packet.readBits(12);
				int planeOffset = i_9_ >> 10;
				int xOffset = i_9_ >> 5 & 0x1f;
				if (xOffset > 15) { // because bit flags are
													// never negative
					xOffset -= 32;
				}
				int yOffset = 0x1f & i_9_;
				if (yOffset > 15) {
					yOffset -= 32;
				}
				int i_13_ = player.scenePositionXQueue[0] + xOffset;
				int i_14_ = yOffset + player.scenePositionYQueue[0];
				if (needMasksUpdate) {
					player.anInt11147 = i_13_;
					player.aBoolean11156 = true;
					player.anInt11160 = i_14_;
				} else {
					player.method894(i_14_, i_13_, -9380,
							Class73.movementTypes[playerIndex]);
				}
				player.plane = player.aByte5931 = (byte) (player.plane
						+ planeOffset & 0x3);
				if (Class238.method3021(i_14_, i_13_, -53)) {
					player.aByte5931++;
				}
				if (playerIndex == Class166.myPlayerIndex) {
					if (CacheNode_Sub20_Sub1.myPlayerPlane != player.plane) {
						Class194_Sub1.aBoolean6892 = true;
					}
					CacheNode_Sub20_Sub1.myPlayerPlane = player.plane;
				}
			} else { // teleport no limit diff
				int i_15_ = packet.readBits(30);
				int planeOffset = i_15_ >> 28;
				int xOffset = 0x3fff & i_15_ >> 14;
				int yOffset = i_15_ & 0x3fff;
				int i_19_ = -Node_Sub53.gameSceneBaseX
						+ (player.scenePositionXQueue[0]
								- -Node_Sub53.gameSceneBaseX - -xOffset & 0x3fff);
				int i_20_ = -Class320_Sub4.gameSceneBaseY
						+ (0x3fff & yOffset
								+ (player.scenePositionYQueue[0] + Class320_Sub4.gameSceneBaseY));
				if (needMasksUpdate) {
					player.aBoolean11156 = true;
					player.anInt11160 = i_20_;
					player.anInt11147 = i_19_;
				} else {
					player.method894(i_20_, i_19_, -9380,
							Class73.movementTypes[playerIndex]);
				}
				player.plane = player.aByte5931 = (byte) (0x3 & planeOffset
						+ player.plane);
				if (Class238.method3021(i_20_, i_19_, -108)) {
					player.aByte5931++;
				}
				/*
				 * //System.out.println("xOffset: "+xOffset);
				 * //System.out.println("yOffset: "+yOffset);
				 * //System.out.println("x: "+i_19_);
				 * //System.out.println("y: "+i_20_);
				 * //System.out.println("z: "+player.plane);
				 * //System.out.println(player.scenePositionXQueue[0]);
				 * //System.out.println(player.scenePositionYQueue[0]);
				 * //System.out.println("sceneBaseX: "+Node_Sub53.gameSceneBaseX);
				 * System
				 * .out.println("seceneBaseY: "+Class320_Sub4.gameSceneBaseY);
				 */
				if (playerIndex == Class166.myPlayerIndex) {
					CacheNode_Sub20_Sub1.myPlayerPlane = player.plane;
				}
			}
		}
	}

	public static void method3813(int i) {
		aWidget4085 = null;
		if (i != 10) {
			method3813(-58);
		}
	}
}
