package com.rs.game.gameUtils.events;

import com.rs.game.world.Entity;
import com.rs.game.world.WorldTile;

/**
 * Created by Peng on 27.1.2017 22:31.
 */
public interface EntityAtTileEvent {
    void process(Entity entity, WorldTile tile);
}
