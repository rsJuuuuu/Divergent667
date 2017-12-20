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

import java.util.HashMap;

/**
 * Created by Peng on 2.1.2017 23:25.
 */
public class StatDrainEffect extends Effect {

    private int[] skills;

    private int projectileId;

    private double initial, boostCap;

    private boolean leech;

    private Animation animation;
    private Graphics startGfx, endGfx;

    private HashMap<Integer, Double> stats = new HashMap<>();

    /**
     * Sap curse
     */
    public StatDrainEffect(int projectileId, int startGfxId, int endGfxId, int... skillIds) {
        leech = false;
        this.skills = skillIds;
        this.animation = new Animation(12569);
        this.startGfx = new Graphics(startGfxId);
        this.endGfx = new Graphics(endGfxId);
        this.projectileId = projectileId;
        for (int skillId : skillIds) {
            stats.put(skillId, initial);
        }
    }

    /**
     * Leech curse
     */
    public StatDrainEffect(int projectileId, int endGfxId, int skillId) {
        leech = true;
        this.initial = 0.05;
        this.boostCap = 0.10;
        this.skills = new int[]{skillId};
        this.animation = new Animation(12575);
        this.startGfx = null;
        this.endGfx = new Graphics(endGfxId);
        this.projectileId = projectileId;
        stats.put(skillId, initial);
    }

    private void boost() {
        for (int skillId : skills) {
            if (!stats.containsKey(skillId)) {
                stats.put(skillId, 0.1);
                return;
            }
            double toDrain = getAvailableBoost(skillId);
            if (toDrain == 0.0) return;
            stats.put(skillId, stats.get(skillId) + toDrain);
        }
    }

    private double getAvailableBoost(int skillId) {
        if (stats.get(skillId) < boostCap) {
            if (boostCap - 0.1 <= stats.get(skillId)) return boostCap - stats.get(skillId);
            return 0.1;
        }
        return 0;
    }

    @Override
    public void processDealtHit(Hit hit, Entity target) {
        if (!(hit.getSource() instanceof Player) || !(target instanceof Player)) return;
        Player p2 = (Player) hit.getSource();
        boolean drained = false;
        if (Utils.getRandom(4) == 0) {
            for (int skillId : skills)
                if (target.getLeechedEffect().drain(skillId, initial != 0)) drained = true;
        }
        if (!drained) {
            p2.getPackets().sendGameMessage(
                    "Your opponent has been weakened so much that your " + (leech ? "leech" : "sap") + " curse"
                    + " has no effect.", true);
        } else if (leech) boost();

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

    @Override
    public double getCombatModifier(int skillId) {
        if (!stats.containsKey(skillId)) return 1;
        return 1 + stats.get(skillId);
    }
}
