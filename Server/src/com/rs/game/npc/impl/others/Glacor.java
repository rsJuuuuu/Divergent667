package com.rs.game.npc.impl.others;

import com.rs.cores.CoresManager;
import com.rs.game.*;
import com.rs.game.Hit.HitLook;
import com.rs.game.npc.Npc;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.utils.Utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("serial")
public final class Glacor extends Npc {

    private boolean[] demonPrayer;
    private int fixedCombatType;
    private int[] cachedDamage;
    private int shieldTimer;
    private int fixedAmount;
    private int prayerTimer;

    public Glacor(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
        super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        demonPrayer = new boolean[3];
        cachedDamage = new int[3];
        shieldTimer = 0;
        switchPrayers(0);
    }

    public void switchPrayers(int type) {
        resetPrayerTimer();
    }

    private void resetPrayerTimer() {
        prayerTimer = 16;
    }

    @Override
    public void processNPC() {
        super.processNPC();
        if (isDead()) return;
        if (Utils.getRandom(40) <= 2) sendRandomProjectile();
        if (getCombat().process()) {// no point in processing
            for (int i = 0; i < cachedDamage.length; i++) {
                if (cachedDamage[i] >= 310) {
                    cachedDamage = new int[3];
                }
            }
        }
        for (int i = 0; i < cachedDamage.length; i++) {
            if (cachedDamage[i] >= 310) {
                cachedDamage = new int[3];
            }
        }
    }

    @Override
    public void handleIngoingHit(final Hit hit) {
        int type = 0;
        super.handleIngoingHit(hit);
        if (hit.getSource() instanceof Player) {// Armadyl Battlestaff
            Player player = (Player) hit.getSource();
            if ((player.getEquipment().getWeaponId() == 21777 || player.getEquipment().getWeaponId() == 2104)
                && hit.getLook() == HitLook.MAGIC_DAMAGE && hit.getDamage() > 0) {
                shieldTimer = 120;
                player.getPackets().sendGameMessage("The monster is weakened by your weapon.");
            }
        }
        if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
            if (demonPrayer[0]) {
                hit.setDamage(0);
            } else {
                cachedDamage[0] += hit.getDamage();
            }
        } else if (hit.getLook() == HitLook.MELEE_DAMAGE) {
            type = 1;
            if (demonPrayer[1]) {
                hit.setDamage(0);
            } else {
                cachedDamage[1] += hit.getDamage();
            }
        } else if (hit.getLook() == HitLook.RANGE_DAMAGE) {
            type = 2;
            if (demonPrayer[2]) {
                hit.setDamage(0);
            } else {
                cachedDamage[2] += hit.getDamage();
            }
        } else if (hit.getLook() == HitLook.MISSED) {
            cachedDamage[type] += 20;
        } else {
            cachedDamage[Utils.getRandom(2)] += 20;// random
        }
    }

    @Override
    public void sendDeath(Entity source) {
        final NpcCombatDefinitions defs = getCombatDefinitions();
        resetWalkSteps();
        getCombat().removeTarget();
        setNextAnimation(null);
        shieldTimer = 0;
        WorldTasksManager.schedule(new WorldTask() {
            int loop;

            @Override
            public void run() {
                if (loop == 0) {
                    handleDeath();
                    setNextAnimation(new Animation(defs.getDeathEmote()));
                } else if (loop >= defs.getDeathDelay()) {
                    reset();
                    setLocation(getSpawnTile());
                    finish();
                    setSpawnTask();
                    stop();
                }
                loop++;
            }
        }, 0, 1);
    }

    private void sendRandomProjectile() {
        WorldTile tile = new WorldTile(getX() + Utils.random(7), getY() + Utils.random(7), getPlane());
        setNextAnimation(new Animation(412));
        World.sendProjectile(this, tile, 1887, 34, 16, 40, 35, 16, 0);
        for (int regionId : getMapRegionsIds()) {
            List<Integer> playerIndexes = World.getRegion(regionId).getPlayerIndexes();
            if (playerIndexes != null) {
                for (int npcIndex : playerIndexes) {
                    Player player = World.getPlayers().get(npcIndex);
                    if (player == null || player.isDead() || player.hasFinished() || !player.isRunning()
                        || !player.withinDistance(tile, 3)) continue;
                    player.getPackets().sendGameMessage("The monster's magical attack splashes on you.");
                    player.applyHit(new Hit(this, 281, HitLook.MAGIC_DAMAGE, 1));
                }
            }
        }
    }

    @Override
    public void setSpawnTask() {
        if (!hasFinished()) {
            reset();
            setLocation(getSpawnTile());
            finish();
        }
        final Npc npc = this;
        CoresManager.slowExecutor.schedule(() -> {
            setFinished(false);
            World.addNPC(npc);
            npc.setLastRegionId(0);
            World.updateEntityRegion(npc);
            loadMapRegions();
            checkMultiArea();
            shieldTimer = 0;
            fixedCombatType = 0;
            fixedAmount = 0;
        }, getCombatDefinitions().getSpawnDelay() * 600, TimeUnit.MILLISECONDS);
    } //Your re-spawn time on them.

    public static boolean atTD(WorldTile tile) {
        return (tile.getX() >= 2560 && tile.getX() <= 2630) && (tile.getY() >= 5710 && tile.getY() <= 5753);
    }

    public int getFixedCombatType() {
        return fixedCombatType;
    }

    public void setFixedCombatType(int fixedCombatType) {
        this.fixedCombatType = fixedCombatType;
    }

    public int getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(int fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

}