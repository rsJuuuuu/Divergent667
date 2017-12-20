package com.rs.game.gameUtils.events;

import com.rs.game.world.Entity;

/**
 * Created by Peng on 1.1.2017 23:04.
 */
public interface EntityEvent {
    void process(Entity entity);
}
