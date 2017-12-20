package com.rs.game.npc.combat.impl.boss.godwars;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Prayer;
import com.rs.game.world.*;
import com.rs.utils.Utils;

public class KrilTsutsarothCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{6203};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        if (Utils.getRandom(4) == 0) {
            switch (Utils.getRandom(8)) {
                case 0:
                    npc.setNextForceTalk(new ForceTalk("Attack them, you dogs!"));
                    break;
                case 1:
                    npc.setNextForceTalk(new ForceTalk("Forward!"));
                    break;
                case 2:
                    npc.setNextForceTalk(new ForceTalk("Death to Saradomin's dogs!"));
                    break;
                case 3:
                    npc.setNextForceTalk(new ForceTalk("Kill them, you cowards!"));
                    break;
                case 4:
                    npc.setNextForceTalk(new ForceTalk("The Dark One will have their souls!"));
                    npc.playSound(3229, 2);
                    break;
                case 5:
                    npc.setNextForceTalk(new ForceTalk("Zamorak curse them!"));
                    break;
                case 6:
                    npc.setNextForceTalk(new ForceTalk("Rend them limb from limb!"));
                    break;
                case 7:
                    npc.setNextForceTalk(new ForceTalk("No retreat!"));
                    break;
                case 8:
                    npc.setNextForceTalk(new ForceTalk("Flay them all!"));
                    break;
            }
        }
        int attackStyle = Utils.getRandom(2);
        switch (attackStyle) {
            case 0:// magic flame attack
                npc.setNextAnimation(new Animation(14962));
                npc.setNextGraphics(new Graphics(1210));
                for (Entity t : npc.getPossibleTargets()) {
                    delayHit(npc, 1, t, getMagicHit(npc, getRandomMaxHit(npc, 300, NpcCombatDefinitions.MAGIC, t)));
                    World.sendProjectile(npc, t, 1211, 41, 16, 41, 35, 16, 0);
                    if (Utils.getRandom(4) == 0) t.getPoison().makePoisoned(168);
                }
                break;
            case 1:// main attack
            case 2:// melee attack
                int damage = 463;// normal
                if (Utils.getRandom(3) == 0 && target instanceof Player
                    && (((Player) target).getPrayer().usingPrayer(Prayer.PrayerSpell.PROTECT_MELEE, Prayer.PrayerSpell.DEFLECT_MELEE))) {
                    Player player = (Player) target;
                    damage = 497;
                    npc.setNextForceTalk(new ForceTalk("YARRRRRRR!"));
                    player.getPrayer().drainPrayer((Math.round(damage / 20)));
                    player.setPrayerDelay(Utils.getRandom(5) + 5);
                    player.getPackets().sendGameMessage("K'ril Tsutsaroth slams through your protection prayer, leaving you feeling drained.");
                }
                npc.setNextAnimation(new Animation(damage <= 463 ? 14963 : 14968));
                delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, damage, NpcCombatDefinitions.MELEE, target)));
                break;
        }
        return defs.getAttackDelay();
    }
}
