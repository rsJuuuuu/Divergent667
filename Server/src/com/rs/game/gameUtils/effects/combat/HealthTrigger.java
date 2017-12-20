package com.rs.game.gameUtils.effects.combat;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.world.Entity;
import com.rs.game.gameUtils.events.EntityEvent;

import static com.rs.utils.Constants.LOW_PRIORITY;

/**
 * Created by Peng on 1.1.2017 23:02.
 */
public class HealthTrigger extends Effect {

    private EntityEvent event;
    private double triggerHealth;

    public HealthTrigger(double triggerHealth, EntityEvent event) {
        this.triggerHealth = triggerHealth;
        this.event = event;
    }

    @Override
    public void processIncoming(Hit hit, Entity target) {
        if (target.isDead()) return;
        if (target.getHealth() / target.getMaxHitPoints() < triggerHealth) event.process(target);
    }

    @Override
    public int getPriority() {
        return LOW_PRIORITY;
    }
}
