package com.rs.game.gameUtils.effects.prayer;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.world.Entity;

/**
 * Created by Peng on 2.1.2017 22:59.
 */
public class SummoningProtect extends Effect {

    @Override
    public void processIncoming(Hit hit, Entity target) {
        if (hit.getSource() instanceof Follower) hit.setDamage((int) (0.6 * hit.getDamage()));
    }
}
