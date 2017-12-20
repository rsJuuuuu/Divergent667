package com.rs.game.player.controllers.impl.minigames;

import com.rs.game.player.controllers.Controller;
import com.rs.game.world.WorldTile;

/**
 * Created by Peng on 9.3.2017 11:46.
 */
public class MinigameController extends Controller {

    @Override
    public void start() {

    }

    /**
     * Block all movement
     */
    @Override
    public boolean checkMovement(int movementType, WorldTile toTile) {
        return false;
    }
}
