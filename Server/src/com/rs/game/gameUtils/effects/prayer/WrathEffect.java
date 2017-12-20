package com.rs.game.gameUtils.effects.prayer;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.utils.Utils;

import java.util.List;

/**
 * Created by Peng on 1.1.2017 21:20.
 */
public class WrathEffect extends Effect {

    private int size;
    private int projectileId;
    private Graphics centerGraphics;
    private Graphics surroundingGraphics;
    private double prayerMultiplier;

    public WrathEffect(int size, int centerGfx, int projectileId, int surroundingGfx, double prayerMultiplier) {
        this.size = size;
        this.prayerMultiplier = prayerMultiplier;
        this.projectileId = projectileId;
        centerGraphics = new Graphics(centerGfx);
        surroundingGraphics = new Graphics(surroundingGfx);
    }

    @Override
    public void processDeath(Entity entity, Entity source) {
        if (source == null || source.equals(entity)) return;
        entity.setNextGraphics(centerGraphics);
        Player entityAsPlayer;
        if (entity instanceof Player) {
            entityAsPlayer = (Player) entity;
            if (entity.isAtMultiArea()) {
                for (int regionId : entity.getMapRegionsIds()) {
                    List<Integer> playersIndexes = World.getRegion(regionId).getPlayerIndexes();
                    if (playersIndexes != null) {
                        for (int playerIndex : playersIndexes) {
                            Player player = World.getPlayers().get(playerIndex);
                            if (player == null || !player.hasStarted() || player.isDead() || player.hasFinished()
                                || !player.withinDistance(entity, 1)
                                || !entityAsPlayer.getControllerManager().canHit(player)) continue;
                            player.applyHit(new Hit(entity, Utils.getRandom((int) (
                                    entityAsPlayer.getSkills().getLevelForXp(Skills.PRAYER)
                                    * prayerMultiplier)), Hit.HitLook.REGULAR_DAMAGE));
                        }
                    }
                    List<Integer> npcIndexes = World.getRegion(regionId).getNPCsIndexes();
                    if (npcIndexes != null) {
                        for (int npcIndex : npcIndexes) {
                            Npc npc = World.getNPCs().get(npcIndex);
                            if (npc == null || npc.isDead() || npc.hasFinished() || !npc.withinDistance(entity, 1)
                                || !npc.getDefinitions().hasAttackOption()
                                || !entityAsPlayer.getControllerManager().canHit(npc)) continue;
                            npc.applyHit(new Hit(entity, Utils.getRandom((int) (
                                    entityAsPlayer.getSkills().getLevelForXp(Skills.PRAYER)
                                    * prayerMultiplier)), Hit.HitLook.REGULAR_DAMAGE));
                        }
                    }
                }
            } else {
                if (!source.equals(entity) && !source.isDead() && !source.hasFinished()
                    && source.withinDistance(entity, 1)) source.applyHit(new Hit(entity, Utils.getRandom((int) (
                        entityAsPlayer.getSkills().getLevelForXp(Skills.PRAYER)
                        * prayerMultiplier)), Hit.HitLook.REGULAR_DAMAGE));
            }
        }
        //make gfx appear in size x size area (ignore middle)
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                for (int x = -(size - 1) / 2; x < (size - 1) / 2 + 1; x++)
                    for (int y = -(size - 1) / 2; y < (size - 1) / 2 + 1; y++)
                        if (x != 0 || y != 0) {
                            World.sendProjectile(entity,entity, new WorldTile(
                                    entity.getX() + x, entity.getY() + y, entity.getPlane()),projectileId,  35, 0, 20, 5, 5, 0);
                        }
                WorldTasksManager.schedule(new WorldTask() {
                    @Override
                    public void run() {
                        for (int x = -(size - 1) / 2; x < (size - 1) / 2 + 1; x++)
                            for (int y = -(size - 1) / 2; y < (size - 1) / 2 + 1; y++)
                                if (x != 0 || y != 0) World.sendGraphics(entity, surroundingGraphics, new WorldTile(
                                        entity.getX() + x, entity.getY() + y, entity.getPlane()));
                    }
                });

            }
        });
    }
}
