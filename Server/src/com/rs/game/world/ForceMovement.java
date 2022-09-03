package com.rs.game.world;

public final class ForceMovement {

	public static final int NORTH = 0, EAST = 1, SOUTH = 2, WEST = 3;

	private final WorldTile toFirstTile;
	private final WorldTile toSecondTile;
	private final int firstTileTicketDelay;
	private final int secondTileTicketDelay;
	private final int direction;

	/*
	 * USE: moves to firsttile firstTileTicketDelay: the delay in game tickets
	 * between your tile and first tile the direction
	 */
	public ForceMovement(WorldTile toFirstTile, int firstTileTicketDelay,
						 int direction) {
		this(toFirstTile, firstTileTicketDelay, null, 0, direction);
	}

	/*
	 * USE: moves to first tile and from first tile to second tile
	 * firstTileTicketDelay: the delay in game tickets between your tile and
	 * first tile secondTileTicketDelay: the delay in game tickets between first
	 * tile and second tile the direction
	 */
	public ForceMovement(WorldTile toFirstTile, int firstTileTicketDelay,
						 WorldTile toSecondTile, int secondTileTicketDelay, int direction) {
		this.toFirstTile = toFirstTile;
		this.firstTileTicketDelay = firstTileTicketDelay;
		this.toSecondTile = toSecondTile;
		this.secondTileTicketDelay = secondTileTicketDelay;
		this.direction = direction;
	}

	public WorldTile getToFirstTile() {
		return toFirstTile;
	}

	public WorldTile getToSecondTile() {
		return toSecondTile;
	}

	public int getFirstTileTicketDelay() {
		return firstTileTicketDelay;
	}

	public int getSecondTileTicketDelay() {
		return secondTileTicketDelay;
	}

	public int getDirection() {
		return direction;
	}

}