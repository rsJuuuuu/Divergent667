package com.rs.game.gameUtils.effects;

import com.rs.game.Hit;
import com.rs.game.player.Player;
import com.rs.game.world.Entity;

import static com.rs.utils.Constants.DEFAULT_PRIORITY;

/**
 * Created by Peng on 30.12.2016 23:09.
 */
public class Effect {

    public int getPriority() {
        return DEFAULT_PRIORITY;
    }

    public double getCombatModifier(int skillId) {
        return 1.0;
    }

    public double getCombatModifier(Player player, int skillId) {
        return 1.0;
    }

    public void processIncoming(Hit hit, Entity target) {
    }

    public void processDealtHit(Hit hit, Entity target) {
    }

    public void processDeath(Entity target, Entity killer) {

    }

}
