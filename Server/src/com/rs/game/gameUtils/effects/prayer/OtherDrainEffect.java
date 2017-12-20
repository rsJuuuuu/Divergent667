package com.rs.game.gameUtils.effects.prayer;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;
import com.rs.utils.Utils;

/**
 * Created by Peng on 2.1.2017 23:25.
 */
public class OtherDrainEffect extends Effect {

    private int projectileId;

    private boolean leech;
    private boolean spec;

    private Animation animation;
    private Graphics startGfx, endGfx;

    /**
     * Sap curse
     */
    public OtherDrainEffect(int projectileId, int startGfxId, int endGfxId, boolean spec) {
        leech = false;
        this.spec = spec;
        this.animation = new Animation(12569);
        this.startGfx = new Graphics(startGfxId);
        this.endGfx = new Graphics(endGfxId);
        this.projectileId = projectileId;
    }

    /**
     * Leech curse
     */
    public OtherDrainEffect(int projectileId, int endGfxId, boolean spec) {
        leech = true;
        this.spec = spec;
        this.animation = new Animation(12575);
        this.startGfx = null;
        this.endGfx = new Graphics(endGfxId);
        this.projectileId = projectileId;
    }

    @Override
    public void processDealtHit(Hit hit, Entity target) {
        if (!(hit.getSource() instanceof Player) || !(target instanceof Player)) return;
        Player p2 = (Player) hit.getSource();
        Player p1 = (Player) target;
        if (Utils.getRandom(4) == 0) {
            if (spec) {
                if (p1.getCombatDefinitions().getSpecialAttackPercentage() > 0) {
                    p1.getCombatDefinitions().decreaseSpecial(10);
                    if (leech) p2.getCombatDefinitions().restoreSpecialAttack(10);
                }
            } else {
                if (p1.getRunEnergy() > 0) {
                    p1.drainRunEnergy(10);
                    if (leech) p2.restoreRunEnergy(10);
                }
            }
        }

        p2.setNextAnimation(animation);
        if (!leech) p2.setNextGraphics(startGfx);
        World.sendProjectile(p2, target, projectileId, 35, 35, 20, 5, 0, 0);
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                target.setNextGraphics(endGfx);
            }
        }, 1);
    }
}
