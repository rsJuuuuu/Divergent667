package com.rs.game.npc.impl.boss.kalph;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.combat.DamageModifier;
import com.rs.game.npc.Npc;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.*;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class KalphiteQueen extends Npc {

    private static final double PROTECT_MODIFIER = 0.2;

    public KalphiteQueen(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean
            spawned) {
        super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        if (id == 1158)
            addEffect(new DamageModifier(PROTECT_MODIFIER, PROTECT_MODIFIER, Hit.HitLook.MAGIC_DAMAGE, Hit.HitLook
                    .RANGE_DAMAGE));
        else if (id == 1160)
            addEffect(new DamageModifier(PROTECT_MODIFIER, PROTECT_MODIFIER, Hit.HitLook.MELEE_DAMAGE));
        setLureDelay(0);
    }

    @Override
    public ArrayList<Entity> getPossibleTargets() {
        ArrayList<Entity> possibleTarget = new ArrayList<>();
        for (int regionId : getMapRegionsIds()) {
            List<Integer> playerIndexes = World.getRegion(regionId).getPlayerIndexes();
            if (playerIndexes != null) {
                for (int npcIndex : playerIndexes) {
                    Player player = World.getPlayers().get(npcIndex);
                    if (player == null || player.isDead() || player.hasFinished() || !player.isRunning()
                        || !player.withinDistance(this, 64) || ((!isAtMultiArea() || !player.isAtMultiArea())
                                                                && player.getAttackedBy() != this
                                                                && player.getAttackedByDelay() > TimeUtils.getTime())
                        || !clippedProjectile(player, false)) continue;
                    possibleTarget.add(player);
                }
            }
        }
        return possibleTarget;
    }

    @Override
    public void sendDeath(final Entity source) {
        final Npc n = this;
        final NpcCombatDefinitions definitions = getCombatDefinitions();
        resetWalkSteps();
        getCombat().removeTarget();
        setNextAnimation(null);
        WorldTasksManager.schedule(new WorldTask() {
            int loop;

            @Override
            public void run() {
                if (loop == 0) {
                    if (getId() != 1158) handleDeath();
                    setNextAnimation(new Animation(definitions.getDeathEmote()));
                } else if (loop >= definitions.getDeathDelay()) {
                    if (getId() == 1158) {
                        setCantInteract(true);
                        transformIntoNPC(1160);
                        setNextGraphics(new Graphics(1055));
                        setNextAnimation(new Animation(6270));
                        WorldTasksManager.schedule(new WorldTask() {
                            @Override
                            public void run() {
                                reset();
                                clearEffects();
                                addEffect(new DamageModifier(PROTECT_MODIFIER, PROTECT_MODIFIER, Hit.HitLook
                                        .MELEE_DAMAGE));
                                setCantInteract(false);
                            }
                        }, 5);
                    } else {
                        reset();
                        setLocation(getSpawnTile());
                        finish();
                        if (!isSpawned()) setSpawnTask();
                        transformIntoNPC(1158);
                    }
                    stop();
                }
                loop++;
            }
        }, 0, 1);
    }
}
