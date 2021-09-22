package com.rs.utils.areas;

import com.rs.game.world.WorldTile;

/**
 * Created by Peng on 14.10.2016.
 */
public abstract class Area {

    /**
     * Does this area contain these coordinates
     * @param x x
     * @param y y
     * @param z z
     * @return if inside
     */
    public abstract boolean contains(int x, int y, int z);

    public abstract boolean check(int tileX, int tileY, int firstX, int firstY, int scndX, int scndY);

    /**
     * Is this tile within the area
     * @param tile the tile
     * @return if inside
     */
    public boolean contains(WorldTile tile){
        return contains(tile.getX(), tile.getY(), tile.getPlane());
    }
}
