package com.rs.game.minigames.pestControl.npcs;

import com.rs.game.Hit;
import com.rs.game.minigames.pestControl.PestControl;
import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.world.WorldTile;

/**
 * Created by Peng on 21.2.2017 22:29.
 */
public class PestMonster extends Npc {

    public PestMonster(int id, WorldTile tile) {
        super(id, tile, -1, true);
    }

    @Override
    public void applyHit(Hit hit) {
        if(hit.getSource() instanceof Player){
            PestControl.addDamage((Player) hit.getSource(), hit.getDamage());
        }
        super.applyHit(hit);
    }
}
