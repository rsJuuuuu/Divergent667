package com.rs.game.world;

import com.rs.Settings;
import com.rs.utils.Utils;

import java.io.Serializable;

public class WorldTile implements Serializable {

    private static final long serialVersionUID = -6567346497259686765L;

    private short x, y;
    private byte plane;

    public WorldTile(int x, int y, int plane) {
        this.x = (short) x;
        this.y = (short) y;
        this.plane = (byte) plane;
    }

    public final WorldTile getLocation() {
        return new WorldTile(x, y, plane);
    }

    public WorldTile(WorldTile tile) {
        this.x = tile.x;
        this.y = tile.y;
        this.plane = tile.plane;
    }

    public WorldTile(WorldTile tile, int randomize) {
        this.x = (short) (tile.x + Utils.getRandom(randomize * 2) - randomize);
        this.y = (short) (tile.y + Utils.getRandom(randomize * 2) - randomize);
        this.plane = tile.plane;
    }

    public WorldTile(int x, int y) {
        this(x, y, 0);
    }

    public void moveLocation(int xOffset, int yOffset, int planeOffset) {
        x += xOffset;
        y += yOffset;
        plane += planeOffset;
    }

    public final void setLocation(WorldTile tile) {
        setLocation(tile.x, tile.y, tile.plane);
    }

    public final void setLocation(int x, int y, int plane) {
        this.x = (short) x;
        this.y = (short) y;
        this.plane = (byte) plane;
    }

    public int getX() {
        return x;
    }

    public int getXInRegion() {
        return x & 0x3F;
    }

    public int getYInRegion() {
        return y & 0x3F;
    }

    public int getY() {
        return y;
    }

    public int getXInChunk() {
        return x & 0x7;
    }

    public int getYInChunk() {
        return y & 0x7;
    }

    public int getPlane() {
        if (plane > 3) return 3;
        return plane;
    }

    public int getChunkX() {
        return (x >> 3);
    }

    public int getChunkY() {
        return (y >> 3);
    }

    public int getRegionX() {
        return (x >> 6);
    }

    public int getRegionY() {
        return (y >> 6);
    }

    public int getRegionId() {
        return ((getRegionX() << 8) + getRegionY());
    }

    public int getLocalX(WorldTile tile, int mapSize) {
        return x - 8 * (tile.getChunkX() - (Settings.MAP_SIZES[mapSize] >> 4));
    }

    public int getLocalY(WorldTile tile, int mapSize) {
        return y - 8 * (tile.getChunkY() - (Settings.MAP_SIZES[mapSize] >> 4));
    }

    public int getLocalX(WorldTile tile) {
        return getLocalX(tile, 0);
    }

    public int getLocalY(WorldTile tile) {
        return getLocalY(tile, 0);
    }

    public int getLocalX() {
        return getLocalX(this);
    }

    public int getLocalY() {
        return getLocalY(this);
    }

    public int get18BitsLocationHash() {
        return getRegionY() + (getRegionX() << 8) + (plane << 16);
    }

    public int get30BitsLocationHash() {
        return y + (x << 14) + (plane << 28);
    }

    public boolean withinDistance(WorldTile tile, int distance) {
        if (tile.plane != plane) return false;
        int deltaX = tile.x - x, deltaY = tile.y - y;
        return deltaX <= distance && deltaX >= -distance && deltaY <= distance && deltaY >= -distance;
    }

    @Override
    public String toString() {
        return "WorldTile{" + "x=" + x + ", y=" + y + ", plane=" + plane + '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + plane;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        WorldTile other = (WorldTile) obj;
        if (plane != other.plane) return false;
        return x == other.x && y == other.y;
    }

    public boolean withinDistance(WorldTile tile) {
        if (tile.plane != plane) return false;
        return Math.abs(tile.x - x) <= 15 && Math.abs(tile.y - y) <= 15;
    }

    public int getCoordFaceX(int sizeX) {
        return getCoordFaceX(sizeX, -1, -1);
    }

    public static int getCoordFaceX(int x, int sizeX, int sizeY, int rotation) {
        return x + ((rotation == 1 || rotation == 3 ? sizeY : sizeX) - 1) / 2;
    }

    public static int getCoordFaceY(int y, int sizeX, int sizeY, int rotation) {
        return y + ((rotation == 1 || rotation == 3 ? sizeX : sizeY) - 1) / 2;
    }

    public int getCoordFaceX(int sizeX, int sizeY, int rotation) {
        return x + ((rotation == 1 || rotation == 3 ? sizeY : sizeX) - 1) / 2;
    }

    public int getCoordFaceY(int sizeY) {
        return getCoordFaceY(-1, sizeY, -1);
    }

    public int getCoordFaceY(int sizeX, int sizeY, int rotation) {
        return y + ((rotation == 1 || rotation == 3 ? sizeX : sizeY) - 1) / 2;
    }

}
