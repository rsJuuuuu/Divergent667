package com.rs.game.npc.impl.boss.corp;

import com.rs.game.npc.Npc;
import com.rs.game.world.Entity;
import com.rs.game.world.WorldTile;

@SuppressWarnings("serial")
public class CorporealBeast extends Npc {

    private DarkEnergyCore core;

    public CorporealBeast(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
        super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        System.out.println("created");
        setCapDamage(1000);
        setLureDelay(3000);
        setForceTargetDistance(64);
        setForceFollowClose(true);
    }

    public void spawnDarkEnergyCore() {
        if (core != null) return;
        core = new DarkEnergyCore(this);
    }

    public void removeDarkEnergyCore() {
        if (core == null) return;
        core.finish();
        core = null;
    }

    @Override
    public void processNPC() {
        super.processNPC();
        if (isDead()) return;
        int maxhp = getMaxHitPoints();
        if (maxhp > getHealth() && getPossibleTargets().isEmpty()) setHealth(maxhp);
    }

    @Override
    public void sendDeath(Entity source) {
        super.sendDeath(source);
        if (core != null) core.sendDeath(source);
    }

    @Override
    public double getMagePrayerMultiplier() {
        return 0.6;
    }

}
