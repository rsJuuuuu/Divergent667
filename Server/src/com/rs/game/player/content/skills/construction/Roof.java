package com.rs.game.player.content.skills.construction;

import com.rs.game.world.RegionBuilder;

enum Roof {
    ROOF1(233, 634, RegionBuilder.NORTH, RegionBuilder.SOUTH),
    ROOF2(235, 634, RegionBuilder.NORTH, RegionBuilder.EAST, RegionBuilder.SOUTH),
    ROOF3(236, 633, RegionBuilder.NORTH, RegionBuilder.EAST, RegionBuilder.SOUTH, RegionBuilder.WEST);
    private int chunkX, chunkY;
    private int[] dirs;

    Roof(int chunkX, int chunkY, int... dirs) {
        this.chunkX = chunkX;
        this.chunkY = chunkY;
        this.dirs = dirs;
    }

    public boolean containsDir(int dir) {
        for (int containedDir : dirs) {
            if (dir == containedDir) return true;
        }
        return false;
    }

    public int getChunkX() {
        return chunkX;
    }

    public int getChunkY() {
        return chunkY;
    }

    public int[] getDirs() {
        return dirs;
    }

    public static Roof getRoof(int surroundingRooms) {
        switch (surroundingRooms) {
            case 1:
                return ROOF1;
            case 2:
            case 3:
                return ROOF2;
            case 4:
                return ROOF3;
        }
        return ROOF1;
    }

}
