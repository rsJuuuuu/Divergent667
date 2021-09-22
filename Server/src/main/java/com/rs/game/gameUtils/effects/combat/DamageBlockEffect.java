package com.rs.game.gameUtils.effects.combat;

import com.rs.game.Hit;
import com.rs.game.player.Player;
import com.rs.game.world.Entity;

/**
 * Created by Peng on 10.2.2017 21:33.
 */
public class DamageBlockEffect extends DamageModifier {

    public DamageBlockEffect(Hit.HitLook... types) {
        super(0, 0, types);
    }

    @Override
    public void processIncoming(Hit hit, Entity target) {
        super.processIncoming(hit, target);
        if (hit.getDamage() == 0) {
            if (hit.getSource() instanceof Player) {
                ((Player) hit.getSource()).sendMessage(
                        "You can't damage this npc with " + hit.getLook().name().toLowerCase() + ".");
            }
        }
    }
}