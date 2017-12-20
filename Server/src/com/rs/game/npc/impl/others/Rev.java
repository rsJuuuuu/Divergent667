package com.rs.game.npc.impl.others;

import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.npc.Npc;
import com.rs.game.world.WorldTile;

public class Rev extends Npc {

    public Rev(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
        super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        setLureDelay(0);
        setCapDamage(300);
        setForceMultiAttacked(true);
    }

    @Override
    public double getMagePrayerMultiplier() {
        return 0.2;
    }

    @Override
    public double getRangePrayerMultiplier() {
        return 0.2;
    }

    @Override
    public double getMeleePrayerMultiplier() {
        return 0.2;
    }

    @Override
    public void handleIngoingHit(Hit hit) {
        if (hit.getLook() != HitLook.MELEE_DAMAGE && hit.getLook() != HitLook.RANGE_DAMAGE && hit.getLook() !=
                HitLook.MAGIC_DAMAGE)
            return;
        super.handleIngoingHit(hit);
        if (hit.getSource() != null) {
            int recoil = (int) (hit.getDamage() * 0.01);
            if (recoil > 0) hit.getSource().applyHit(new Hit(this, recoil, HitLook.REFLECTED_DAMAGE));
        }
    }
}
