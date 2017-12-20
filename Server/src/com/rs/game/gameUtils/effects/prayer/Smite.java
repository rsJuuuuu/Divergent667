package com.rs.game.gameUtils.effects.prayer;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.player.Player;
import com.rs.game.world.Entity;

/**
 * Created by Peng on 1.1.2017 23:38.
 */
public class Smite extends Effect {

    private double drain;

    public Smite(double drain) {
        this.drain = drain;
    }

    @Override
    public void processDealtHit(Hit hit, Entity target) {
        if (target instanceof Player) {
            int drain = (int) (hit.getDamage() * this.drain);
            if (drain > 0) ((Player) target).getPrayer().drainPrayer(drain);
        }
    }
}
