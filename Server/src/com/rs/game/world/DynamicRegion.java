package com.rs.game.world;

import com.rs.Settings;
import com.rs.cores.CoresManager;
import org.pmw.tinylog.Logger;

public class DynamicRegion extends Region {

    // int dynamicregion squares amt
    // Region[] array with the region squares
    // int[][] squaresBounds;

    private int[][][][] regionCoords;

    public DynamicRegion(int regionId) {
        super(regionId);
        checkLoadMap();
        // plane,x,y,(real x, real y,or real plane coord, or rotation)
        regionCoords = new int[4][8][8][4];
    }

    // override by static region to empty
    public void checkLoadMap() {
        if (getLoadMapStage() == 0) {
            setLoadMapStage(1);
            // lets use slow executor, if we take 1-3sec to load objects who
            // cares? what maters are the players on the loaded regions lul
            CoresManager.slowExecutor.execute(() -> {
                try {
                    setLoadMapStage(2);
                } catch (Throwable e) {
                    Logger.error(e);
                }
            });
        }
    }

    @Override
    public void addMapObject(WorldObject object, int x, int y) {

    }

    @Override
    public void setMask(int plane, int localX, int localY, int mask) {

    }

    /*
     * gets the real tile objects from real region
     */
    @Override
    public WorldObject[] getObjects(int plane, int localX, int localY) {
        int currentChunkX = localX / 8;
        int currentChunkY = localY / 8;
        int rotation = regionCoords[plane][currentChunkX][currentChunkY][3];
        int realChunkX = regionCoords[plane][currentChunkX][currentChunkY][0];
        int realChunkY = regionCoords[plane][currentChunkX][currentChunkY][1];
        if (realChunkX == 0 || realChunkY == 0) return null;
        int realRegionId = (((realChunkX / 8) << 8) + (realChunkY / 8));
        Region region = World.getRegion(realRegionId, true);
        if (region instanceof DynamicRegion) {
            if (Settings.DEBUG)
                Logger.info("DynamicRegion", "YOU CANT MAKE A REAL MAP AREA INTO A DYNAMIC REGION!, IT MAY DEADLOCK!");
            return null; // no information so that data not loaded
        }
        int realRegionOffsetX = (realChunkX - ((realChunkX / 8) * 8));
        int realRegionOffsetY = (realChunkY - ((realChunkY / 8) * 8));
        int posInChunkX = (localX - (currentChunkX * 8));
        int posInChunkY = (localY - (currentChunkY * 8));
        if (rotation != 0) {
            for (int rotate = 0; rotate < (4 - rotation); rotate++) {
                int fakeChunckX = posInChunkX;
                posInChunkX = posInChunkY;
                posInChunkY = 7 - fakeChunckX;
            }
        }
        int realLocalX = (realRegionOffsetX * 8) + posInChunkX;
        int realLocalY = (realRegionOffsetY * 8) + posInChunkY;
        return region.getObjects(plane, realLocalX, realLocalY);
    }

    // overrided by static region to get mask from needed region
    public int getMaskClipedOnly(int plane, int localX, int localY) {
        int currentChunkX = localX / 8;
        int currentChunkY = localY / 8;
        int rotation = regionCoords[plane][currentChunkX][currentChunkY][3];
        int realChunkX = regionCoords[plane][currentChunkX][currentChunkY][0];
        int realChunkY = regionCoords[plane][currentChunkX][currentChunkY][1];
        if (realChunkX == 0 || realChunkY == 0) return -1;
        int realRegionId = (((realChunkX / 8) << 8) + (realChunkY / 8));
        Region region = World.getRegion(realRegionId, true);
        if (region instanceof DynamicRegion) {
            if (Settings.DEBUG)
                Logger.info("Dynamic region", "YOU CANT MAKE A REAL MAP AREA INTO A DYNAMIC REGION!, IT MAY DEADLOCK!");
            return -1; // no information so that data not loaded
        }
        int realRegionOffsetX = (realChunkX - ((realChunkX / 8) * 8));
        int realRegionOffsetY = (realChunkY - ((realChunkY / 8) * 8));
        int posInChunkX = (localX - (currentChunkX * 8));
        int posInChunkY = (localY - (currentChunkY * 8));
        if (rotation != 0) {
            for (int rotate = 0; rotate < (4 - rotation); rotate++) {
                int fakeChunckX = posInChunkX;
                posInChunkX = posInChunkY;
                posInChunkY = 7 - fakeChunckX;
            }
        }
        int realLocalX = (realRegionOffsetX * 8) + posInChunkX;
        int realLocalY = (realRegionOffsetY * 8) + posInChunkY;
        return region.getMaskClipedOnly(regionCoords[plane][currentChunkX][currentChunkY][2], realLocalX, realLocalY);
    }

    @Override
    public int getRotation(int plane, int localX, int localY) {
        return regionCoords[plane][localX / 8][localY / 8][3];
    }

	/*
     * gets clip data from the original region part
	 */

    @Override
    public int getMask(int plane, int localX, int localY) {
        int currentChunkX = localX / 8;
        int currentChunkY = localY / 8;
        int rotation = regionCoords[plane][currentChunkX][currentChunkY][3];
        int realChunkX = regionCoords[plane][currentChunkX][currentChunkY][0];
        int realChunkY = regionCoords[plane][currentChunkX][currentChunkY][1];
        if (realChunkX == 0 || realChunkY == 0) return -1;
        int realRegionId = (((realChunkX / 8) << 8) + (realChunkY / 8));
        Region region = World.getRegion(realRegionId, true);
        if (region instanceof DynamicRegion) {
            if (Settings.DEBUG)
                Logger.info("Dynamic region", "YOU CANT MAKE A REAL MAP AREA INTO A DYNAMIC REGION!, IT MAY DEADLOCK!");
            return -1; // no information so that data not loaded
        }
        int realRegionOffsetX = (realChunkX - ((realChunkX / 8) * 8));
        int realRegionOffsetY = (realChunkY - ((realChunkY / 8) * 8));
        int posInChunkX = (localX - (currentChunkX * 8));
        int posInChunkY = (localY - (currentChunkY * 8));
        if (rotation != 0) {
            for (int rotate = 0; rotate < (4 - rotation); rotate++) {
                int fakeChunckX = posInChunkX;
                posInChunkX = posInChunkY;
                posInChunkY = 7 - fakeChunckX;
            }
        }
        int realLocalX = (realRegionOffsetX * 8) + posInChunkX;
        int realLocalY = (realRegionOffsetY * 8) + posInChunkY;
        return region.getMask(regionCoords[plane][currentChunkX][currentChunkY][2], realLocalX, realLocalY);
    }

    public int[][][][] getRegionCoords() {
        return regionCoords;
    }

    public void setRegionCoords(int[][][][] regionCoords) {
        this.regionCoords = regionCoords;
    }
}
