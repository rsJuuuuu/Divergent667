package com.rs.game.npc.impl.boss;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.combat.DamageBlockEffect;
import com.rs.game.npc.Npc;
import com.rs.game.world.WorldTile;

/**
 * Created by Peng on 10.2.2017 21:29.
 */
public class DagannothKing extends Npc {

    public DagannothKing(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean
            spawned) {
        super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        switch (id) {
            case 2883:
                addEffect(new DamageBlockEffect(Hit.HitLook.RANGE_DAMAGE));
                break;
            case 2881:
                addEffect(new DamageBlockEffect(Hit.HitLook.MAGIC_DAMAGE));
                break;
            case 2882:
                addEffect(new DamageBlockEffect(Hit.HitLook.MELEE_DAMAGE));
        }
    }

}
