package com.rs.game.gameUtils.effects.prayer;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;

/**
 * Created by Peng on 3.1.2017 16:39.
 */
public class HealthDrainEffect extends Effect {

    private boolean soulSplit;
    private double percentage;

    public HealthDrainEffect(double percentage, boolean soulSplit) {
        this.soulSplit = soulSplit;
        this.percentage = percentage;
    }

    @Override
    public void processDealtHit(Hit hit, Entity target) {
        hit.getSource().heal(hit.getDamage() / 5);
        if (!soulSplit) return;
        if (hit.getDamage() > 0) World.sendProjectile(hit.getSource(), target, 2263, 11, 11, 20, 5, 0, 0);
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                target.setNextGraphics(new Graphics(2264));
                if (hit.getDamage() > 0) World.sendProjectile(target, hit.getSource(), 2263, 11, 11, 20, 5, 0, 0);
            }
        }, 1);
    }
}
