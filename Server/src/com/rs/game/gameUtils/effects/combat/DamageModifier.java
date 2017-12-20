package com.rs.game.gameUtils.effects.combat;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.player.Player;
import com.rs.game.world.Entity;

/**
 * Created by Peng on 1.1.2017 19:56.
 */
public class DamageModifier extends Effect {

    private double defaultModifier, playerModifier;
    private Hit.HitLook[] types;

    public DamageModifier(double defaultModifier, double playerModifier, Hit.HitLook... types) {
        this.defaultModifier = defaultModifier;
        this.playerModifier = playerModifier;
        this.types = types;
    }

    @Override
    public void processIncoming(Hit hit, Entity target) {
        if (hit.ignoreDamageModifier()) return;
        for (Hit.HitLook look : types) {
            if (look.equals(hit.getLook()))
                if (hit.getSource() instanceof Player) hit.setDamage((int) (hit.getDamage() * playerModifier));
                else hit.setDamage((int) (hit.getDamage() * defaultModifier));
        }
    }
}
