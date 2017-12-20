package com.rs.game.player;

import com.rs.Settings;
import com.rs.game.Hit;
import com.rs.game.world.World;
import com.rs.io.OutputStream;
import com.rs.utils.Utils;

import java.security.MessageDigest;

public final class LocalPlayerUpdate {

	private Player player;

	private Player[] localPlayers;
	private int[] localPlayersIndexes;
	private int localPlayersIndexesCount;

	private int[] outPlayersIndexes;
	private int outPlayersIndexesCount;

	private int[] regionHashes;

	private byte[][] cachedAppearanceHashes;
	private int totalRenderDataSentLength;

	public Player[] getLocalPlayers() {
		return localPlayers;
	}

	public boolean needAppearanceUpdate(int index, byte[] hash) {
        return !(totalRenderDataSentLength > ((Settings.PACKET_SIZE_LIMIT - 500) / 2)
                || hash == null) && (cachedAppearanceHashes[index] == null || !MessageDigest.isEqual(cachedAppearanceHashes[index], hash));
    }

	public LocalPlayerUpdate(Player player) {
		this.player = player;
		localPlayers = new Player[2048];
		localPlayersIndexes = new int[Settings.PLAYERS_LIMIT];
		outPlayersIndexes = new int[2048];
		regionHashes = new int[2048];
		cachedAppearanceHashes = new byte[Settings.PLAYERS_LIMIT][];
	}

	public void init(OutputStream stream) {
		stream.initBitAccess();
		stream.writeBits(30, player.get30BitsLocationHash());
		localPlayers[player.getIndex()] = player;
		localPlayersIndexes[localPlayersIndexesCount++] = player.getIndex();
		for (int playerIndex = 1; playerIndex < 2048; playerIndex++) {
			if (playerIndex == player.getIndex())
				continue;
			Player player = World.getPlayers().get(playerIndex);
			stream.writeBits(18, regionHashes[playerIndex] = player == null ? 0
					: player.get18BitsLocationHash());
			outPlayersIndexes[outPlayersIndexesCount++] = playerIndex;

		}
		stream.finishBitAccess();
	}

	private boolean needsRemove(Player p) {
		return (p.hasFinished() || !player.withinDistance(p));
	}

	private boolean needsAdd(Player p) {
		return p != null && !p.hasFinished() && player.withinDistance(p);
	}

	private void updateRegionHash(OutputStream stream, int oldHash, int newHash) {
		int oldX = (oldHash & 0xff72) >> 8;
		int oldY = 0xff & oldHash;
		int oldPlane = oldHash >> 16;
		int newX = (newHash & 0xff72) >> 8;
		int newY = 0xff & newHash;
		int newPlane = newHash >> 16;
		int planeOffset = newPlane - oldPlane;
		if (oldX == newX && oldY == newY) {
			stream.writeBits(2, 1);
			stream.writeBits(2, planeOffset);
		} else if (Math.abs(newX - oldX) <= 1 && Math.abs(newY - oldY) <= 1) {
			int opcode;
			int dx = newX - oldX;
			int dy = newY - oldY;
			if (dx == -1 && dy == -1)
				opcode = 0;
			else if (dx == 1 && dy == -1)
				opcode = 2;
			else if (dx == -1 && dy == 1)
				opcode = 5;
			else if (dx == 1 && dy == 1)
				opcode = 7;
			else if (dy == -1)
				opcode = 1;
			else if (dx == -1)
				opcode = 3;
			else if (dx == 1)
				opcode = 4;
			else
				opcode = 6;
			stream.writeBits(2, 2);
			stream.writeBits(5, (planeOffset << 3) + (opcode & 0x7));
		} else {
			int xOffset = newX - oldX;
			int yOffset = newY - oldY;
			stream.writeBits(2, 3);
			stream.writeBits(18, (yOffset & 0xff) + ((xOffset & 0xff) << 8)
					+ (planeOffset << 16));
		}
	}

	private void processOutsidePlayers(OutputStream stream,
			OutputStream updateBlockData) {
		stream.initBitAccess();
		int skip = 0;
		for (int i = 0; i < outPlayersIndexesCount; i++) {
			int playerIndex = outPlayersIndexes[i];
			if (skip > 0) {
				skip--;
				continue;
			}
			Player p = World.getPlayers().get(playerIndex);
			if (needsAdd(p)) {
				stream.writeBits(1, 1);
				stream.writeBits(2, 0); // request add
				int hash = p.get18BitsLocationHash();
				if (hash == regionHashes[playerIndex])
					stream.writeBits(1, 0);
				else {
					stream.writeBits(1, 1);
					updateRegionHash(stream, regionHashes[playerIndex], hash);
					regionHashes[playerIndex] = hash;
				}
				stream.writeBits(6, p.getXInRegion());
				stream.writeBits(6, p.getYInRegion());
				boolean needappearanceUpdate = needAppearanceUpdate(
						p.getIndex(), p.getAppearance()
								.getMD5AppearanceDataHash());
				appendUpdateBlock(p, updateBlockData, needappearanceUpdate,
						true);
				stream.writeBits(1, 1);
				localPlayers[p.getIndex()] = p;
			} else {
				int hash = p == null ? regionHashes[playerIndex] : p
						.get18BitsLocationHash();
				if (p != null && hash != regionHashes[playerIndex]) {
					stream.writeBits(1, 1);
					updateRegionHash(stream, regionHashes[playerIndex], hash);
					regionHashes[playerIndex] = hash;
				} else {
					stream.writeBits(1, 0); // no update needed
					for (int i2 = i + 1; i2 < outPlayersIndexesCount; i2++) {
						int p2Index = outPlayersIndexes[i2];
						Player p2 = World.getPlayers().get(p2Index);
						if (needsAdd(p2)
								|| (p2 != null && p2.get18BitsLocationHash() != regionHashes[p2Index]))
							break;
						skip++;
					}
					skipPlayers(stream, skip);
				}
			}
		}
		stream.finishBitAccess();
	}

	private void processLocalPlayers(OutputStream stream,
			OutputStream updateBlockData) {
		stream.initBitAccess();
		int skip = 0;
		for (int i = 0; i < localPlayersIndexesCount; i++) {
			int playerIndex = localPlayersIndexes[i];
			if (skip > 0) {
				skip--;
				continue;
			}
			Player p = localPlayers[playerIndex];
			if (needsRemove(p)) {
				stream.writeBits(1, 1); // needs update
				stream.writeBits(1, 0); // no masks update needeed
				stream.writeBits(2, 0); // request remove
				regionHashes[playerIndex] = p.getLastWorldTile() == null ? p.get18BitsLocationHash() : p.getLastWorldTile().get18BitsLocationHash();
				int hash = p.get18BitsLocationHash();
				if (hash == regionHashes[playerIndex])
					stream.writeBits(1, 0);
				else {
					stream.writeBits(1, 1);
					updateRegionHash(stream, regionHashes[playerIndex],
							hash);
					regionHashes[playerIndex] = hash;
				}
				localPlayers[playerIndex] = null;
			} else {
				boolean needAppearanceUpdate = needAppearanceUpdate(
						p.getIndex(), p.getAppearance()
								.getMD5AppearanceDataHash());
				boolean needUpdate = p.needMasksUpdate() || needAppearanceUpdate;
				if (needUpdate)
					appendUpdateBlock(p, updateBlockData, needAppearanceUpdate,
							false);
				if (p.hasTeleported()) {
					stream.writeBits(1, 1); // needs update
					stream.writeBits(1, needUpdate ? 1 : 0);
					stream.writeBits(2, 3);
					int xOffset = p.getX() - p.getLastWorldTile().getX();
					int yOffset = p.getY() - p.getLastWorldTile().getY();
					int planeOffset = p.getPlane()
							- p.getLastWorldTile().getPlane();
					if (Math.abs(p.getX() - p.getLastWorldTile().getX()) <= 14 //14 for safe
							&& Math.abs(p.getY() - p.getLastWorldTile().getY()) <= 14) { //14 for safe
						stream.writeBits(1, 0);
						if (xOffset < 0) // viewport used to be 15 now 16
							xOffset += 32;
						if (yOffset < 0)
							yOffset += 32;
						stream.writeBits(12, yOffset + (xOffset << 5)
								+ (planeOffset << 10));
					} else {
						stream.writeBits(1, 1);
						stream.writeBits(30, (yOffset & 0x3fff)
								+ ((xOffset & 0x3fff) << 14)
								+ ((planeOffset & 0x3) << 28));
					}
				} else if (p.getNextWalkDirection() != -1) {
					int dx = Utils.DIRECTION_DELTA_X[p.getNextWalkDirection()];
					int dy = Utils.DIRECTION_DELTA_Y[p.getNextWalkDirection()];
					boolean running;
					int opcode;
					if (p.getNextRunDirection() != -1) {
						dx += Utils.DIRECTION_DELTA_X[p.getNextRunDirection()];
						dy += Utils.DIRECTION_DELTA_Y[p.getNextRunDirection()];
						opcode = Utils.getPlayerRunningDirection(dx, dy);
						if (opcode == -1) {
							running = false;
							opcode = Utils.getPlayerWalkingDirection(dx, dy);
						} else
							running = true;
					} else {
						running = false;
						opcode = Utils.getPlayerWalkingDirection(dx, dy);
					}
					stream.writeBits(1, 1);
					if((dx == 0 && dy == 0)) {
						stream.writeBits(1, 1); //quick fix
						stream.writeBits(2, 0);
						if (!needUpdate) //hasnt been sent yet
							appendUpdateBlock(p, updateBlockData, needAppearanceUpdate,false);
					}else {
						stream.writeBits(1, needUpdate ? 1 : 0);
						stream.writeBits(2, running ? 2 : 1);
						stream.writeBits(running ? 4 : 3, opcode);
					}
				} else if (needUpdate) {
					stream.writeBits(1, 1); // needs update
					stream.writeBits(1, 1);
					stream.writeBits(2, 0);
				} else { // skip
					stream.writeBits(1, 0); // no update needed
					for (int i2 = i + 1; i2 < localPlayersIndexesCount; i2++) {
						int p2Index = localPlayersIndexes[i2];
						Player p2 = localPlayers[p2Index];
						if (needsRemove(p2)
								|| p2.hasTeleported()
								|| p2.getNextWalkDirection() != -1
								|| (p2.needMasksUpdate() || needAppearanceUpdate(
										p2.getIndex(), p2.getAppearance()
												.getMD5AppearanceDataHash())))
							break;
						skip++;
					}
					skipPlayers(stream, skip);
				}

			}
		}
		stream.finishBitAccess();
	}

	private void skipPlayers(OutputStream stream, int amount) {
		stream.writeBits(2, amount == 0 ? 0 : amount > 255 ? 3
				: (amount > 31 ? 2 : 1));
		if (amount > 0)
			stream.writeBits(amount > 255 ? 11 : (amount > 31 ? 8 : 5), amount);
	}

	private void appendUpdateBlock(Player p, OutputStream data,
			boolean needappearanceUpdate, boolean added) {
		int maskData = 0;
		if (p.getNextAnimation() != null)
			maskData |= 0x40;
		if (p.getNextGraphics3() != null)
			maskData |= 0x40000;
		if (p.getTemporaryMoveType() != 0)
			maskData |= 0x200;
		if (p.getNextGraphics4() != null)
			maskData |= 0x80000;
		if (!p.getNextHits().isEmpty())
			maskData |= 0x4;
		if (needappearanceUpdate)
			maskData |= 0x8;
		if (p.getNextForceTalk() != null)
			maskData |= 0x4000;
		if (added || p.isUpdateMovementType())
			maskData |= 0x1;
		if (p.getNextFaceEntity() != -2
				|| (added && p.getLastFaceEntity() != -1))
			maskData |= 0x10;
		if (p.getNextForceMovement() != null)
			maskData |= 0x1000;
		if (added
				|| (p.getNextFaceWorldTile() != null
						&& p.getNextRunDirection() == -1 && p
						.getNextWalkDirection() == -1))
			maskData |= 0x20;
		if (p.getNextGraphics1() != null)
			maskData |= 0x2;
		if (p.getNextGraphics2() != null)
			maskData |= 0x100;
		if (maskData >= 256)
			maskData |= 0x80;
		if (maskData >= 65536)
			maskData |= 0x800;
		data.writeByte(maskData);
		if (maskData >= 256)
			data.writeByte(maskData >> 8);
		if (maskData >= 65536)
			data.writeByte(maskData >> 16);
		if (p.getNextAnimation() != null)
			applyAnimationMask(p, data);
		if (p.getNextGraphics3() != null)
			applyGraphicsMask3(p, data);
		if (p.getTemporaryMoveType() != 0)
			applyTemporaryMoveTypeMask(p, data);
		if (p.getNextGraphics4() != null)
			applyGraphicsMask4(p, data);
		if (!p.getNextHits().isEmpty())
			applyHitsMask(p, data);
		if (needappearanceUpdate)
			applyAppearanceMask(p, data);
		if (p.getNextForceTalk() != null)
			applyForceTalkMask(p, data);
		if (added || p.isUpdateMovementType())
			applyMoveTypeMask(p, data);
		if (p.getNextFaceEntity() != -2
				|| (added && p.getLastFaceEntity() != -1))
			applyFaceEntityMask(p, data);
		if (p.getNextForceMovement() != null)
			applyForceMovementMask(p, data);
		if (added
				|| (p.getNextFaceWorldTile() != null
						&& p.getNextRunDirection() == -1 && p
						.getNextWalkDirection() == -1))
			applyFaceDirectionMask(p, data);
		if (p.getNextGraphics1() != null)
			applyGraphicsMask1(p, data);
		if (p.getNextGraphics2() != null)
			applyGraphicsMask2(p, data);
	}

	private void applyForceTalkMask(Player p, OutputStream data) {
		data.writeString(p.getNextForceTalk().getText());
	}

	private void applyHitsMask(Player p, OutputStream data) {
		int count = p.getNextHits().size();
		data.writeByte(count);
		if (count > 0) {
			int hp = p.getHealth();
			int maxHp = p.getMaxHitPoints();
			if (hp > maxHp)
				hp = maxHp;
			int hpBarPercentage = (hp == 0 || maxHp == 0) ? 0 : (hp * 255 / maxHp);
			for (Hit hit : p.getNextHits()) {
				boolean interactingWith = hit.interactingWith(player, p);
				if (hit.missed() && !interactingWith)
					data.writeSmart(32766);
				else {
					if (hit.getSoaking() != null) {
						data.writeSmart(32767);
						data.writeSmart(hit.getMark(player, p));
						data.writeSmart(hit.getDamage());
						data.writeSmart(hit.getSoaking().getMark(player, p));
						data.writeSmart(hit.getSoaking().getDamage());
					} else {
						data.writeSmart(hit.getMark(player, p));
						data.writeSmart(hit.getDamage());
					}
				}
				data.writeSmart(hit.getDelay());
				data.writeByteC(hpBarPercentage);
			}
		}
	}

	private void applyFaceEntityMask(Player p, OutputStream data) {
		data.writeShort128(p.getNextFaceEntity() == -2 ? p.getLastFaceEntity()
				: p.getNextFaceEntity());
	}

	private void applyFaceDirectionMask(Player p, OutputStream data) {
		data.writeShort(p.getDirection()); // also works as face tile as dir
											// calced on setnextfacetile
	}

	private void applyMoveTypeMask(Player p, OutputStream data) {
		data.write128Byte(p.getRun() ? 2 : 1);
	}

	private void applyTemporaryMoveTypeMask(Player p, OutputStream data) {
		data.writeByteC(p.getTemporaryMoveType());
	}

	private void applyGraphicsMask1(Player p, OutputStream data) {
		data.writeShort(p.getNextGraphics1().getId());
		data.writeIntLE(p.getNextGraphics1().getSettingsHash());
		data.writeByte128(p.getNextGraphics1().getSettings2Hash());
	}

	private void applyGraphicsMask2(Player p, OutputStream data) {
		data.writeShortLE128(p.getNextGraphics2().getId());
		data.writeIntV2(p.getNextGraphics2().getSettingsHash());
		data.writeByteC(p.getNextGraphics2().getSettings2Hash());
	}

	private void applyGraphicsMask3(Player p, OutputStream data) {
		data.writeShortLE128(p.getNextGraphics3().getId());
		data.writeIntV2(p.getNextGraphics3().getSettingsHash());
		data.writeByteC(p.getNextGraphics3().getSettings2Hash());
	}

	private void applyGraphicsMask4(Player p, OutputStream data) {
		data.writeShortLE(p.getNextGraphics4().getId());
		data.writeIntV2(p.getNextGraphics4().getSettingsHash());
		data.writeByteC(p.getNextGraphics4().getSettings2Hash());
	}

	private void applyAnimationMask(Player p, OutputStream data) {
		for (int id : p.getNextAnimation().getIds())
			data.writeShortLE(id);
		data.writeByte128(p.getNextAnimation().getSpeed());
	}

	private void applyAppearanceMask(Player p, OutputStream data) {
		byte[] renderData = p.getAppearance().getAppearanceData();
		totalRenderDataSentLength += renderData.length;
		cachedAppearanceHashes[p.getIndex()] = p.getAppearance()
				.getMD5AppearanceDataHash();
		data.write128Byte(renderData.length);
		data.writeBytes(renderData);

	}

	private void applyForceMovementMask(Player p, OutputStream data) {
		data.write128Byte(p.getNextForceMovement().getToFirstTile().getX()
				- p.getX());
		data.writeByte(p.getNextForceMovement().getToFirstTile().getY()
				- p.getY());
		data.writeByte128(p.getNextForceMovement().getToSecondTile() == null ? 0
				: p.getNextForceMovement().getToSecondTile().getX() - p.getX());
		data.writeByte128(p.getNextForceMovement().getToSecondTile() == null ? 0
				: p.getNextForceMovement().getToSecondTile().getY() - p.getY());
		data.writeShortLE(p.getNextForceMovement().getFirstTileTicketDelay() * 30);
		data.writeShortLE128(p.getNextForceMovement().getToSecondTile() == null ? 0
				: p.getNextForceMovement().getSecondTileTicketDelay() * 30);
		data.writeByte128(p.getNextForceMovement().getDirection());
	}

	public OutputStream createPacketAndProcess() {
		OutputStream stream = new OutputStream();
		OutputStream updateBlockData = new OutputStream();
		stream.writePacketVarShort(69);
		processLocalPlayers(stream, updateBlockData);
		processOutsidePlayers(stream, updateBlockData);
		stream.writeBytes(updateBlockData.getBuffer(), 0,
				updateBlockData.getOffset());
		stream.endPacketVarShort();
		totalRenderDataSentLength = 0;
		localPlayersIndexesCount = 0;
		outPlayersIndexesCount = 0;
		for (int playerIndex = 1; playerIndex < 2048; playerIndex++) {
			Player player = localPlayers[playerIndex];
			if (player == null)
				outPlayersIndexes[outPlayersIndexesCount++] = playerIndex;
			else
				localPlayersIndexes[localPlayersIndexesCount++] = playerIndex;
		}
		return stream;
	}
	
}