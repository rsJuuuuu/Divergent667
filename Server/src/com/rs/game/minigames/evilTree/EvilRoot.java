package com.rs.game.minigames.evilTree;

import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;

/**
 * Created by Peng on 28.11.2016 17:43.
 */
public class EvilRoot extends WorldObject {

    private boolean alive = false;

    private  EvilTree parent;

    EvilRoot(EvilTree parent, WorldTile tile) {
        super(TreeManager.EVIL_ROOT_ID, 10, 0, tile.getX(), tile.getY(), tile.getPlane());
        this.parent = parent;
    }

    /**
     * Make this root visible
     */
    public void spawn() {
        alive = true;
        World.spawnObject(this, true);
    }

    /**
     * It's time for this root to die
     */
    void die() {
        World.removeSpawnedObject(this, true);
        alive = false;
    }

    /**
     * Get hit
     */
    boolean processDamaged() {
        return parent.killRoot(this);

    }

    /**
     * Are we still alive?
     */
    boolean isAlive() {
        return alive;
    }

}
