package com.rs.game.npc.combat;

import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.npc.Npc;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.impl.boss.godwars.zaros.Nex;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.combat.PlayerCombat;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.utils.Utils;
import com.rs.utils.game.CombatUtils;

import static com.rs.utils.Constants.BonusType.*;

public abstract class CombatScript {

    /*
     * Returns ids and names
     */
    public abstract Object[] getKeys();

    /*
     * Returns Move Delay
     */
    public abstract int attack(Npc npc, Entity target);

    public static void delayHit(Npc npc, int delay, final Entity target, final Hit... hits) {

        npc.getCombat().addAttackedByDelay(target);
        WorldTasksManager.schedule(new WorldTask() {

            @Override
            public void run() {
                for (Hit hit : hits) {
                    Npc npc = (Npc) hit.getSource();
                    if (npc.isDead() || npc.hasFinished() || target.isDead() || target.hasFinished()) return;
                    target.applyHit(hit);
                    npc.getCombat().doDefenceEmote(target);
                    if (!(npc instanceof Nex) && hit.getLook() == HitLook.MAGIC_DAMAGE && hit.getDamage() == 0)
                        target.setNextGraphics(new Graphics(85, 0, 100));
                    if (target instanceof Player) {
                        Player p2 = (Player) target;
                        if (p2.getCombatDefinitions().isAutoRetaliate() && !p2.getActionManager().hasSkillWorking()
                            && !p2.hasWalkSteps()) {
                            p2.closeInterfaces();
                            p2.getActionManager().setAction(new PlayerCombat(npc));
                        }
                    } else {
                        Npc n = (Npc) target;
                        if (!n.isUnderCombat() || n.canBeAttackedByAutoRelatie()) n.setTarget(npc);
                    }

                }
            }

        }, delay);
    }

    public static Hit getRangeHit(Npc npc, int damage) {
        return new Hit(npc, damage, HitLook.RANGE_DAMAGE);
    }

    public static Hit getMagicHit(Npc npc, int damage) {
        return new Hit(npc, damage, HitLook.MAGIC_DAMAGE);
    }

    public static Hit getRegularHit(Npc npc, int damage) {
        return new Hit(npc, damage, HitLook.REGULAR_DAMAGE);
    }

    public static Hit getMeleeHit(Npc npc, int damage) {
        return new Hit(npc, damage, HitLook.MELEE_DAMAGE);
    }

    public static int getRandomMaxHit(Npc npc, int maxHit, int attackStyle, Entity target) {
        int[] bonuses = npc.getBonuses();
        double att = bonuses == null ? 0 : attackStyle == NpcCombatDefinitions.RANGE ? bonuses[RANGE_ATTACK.getId()] :
                attackStyle
                == NpcCombatDefinitions.MAGIC ? bonuses[MAGIC_ATTACK.getId()] : bonuses[STAB_ATTACK.getId()];
        double def;
        if (target instanceof Player) {
            Player p2 = (Player) target;
            def = p2.getSkills().getLevel(Skills.DEFENCE) + (attackStyle == NpcCombatDefinitions.RANGE ? 1.25 :
                                                                     attackStyle
                                                                     == NpcCombatDefinitions.MAGIC ? 2.0 : 1.0)
                                                            * p2.getCombatDefinitions().getBonuses()[attackStyle
                                                                                                     ==
                                                                                                     NpcCombatDefinitions.RANGE ? RANGE_DEF.getId() :
                    attackStyle == NpcCombatDefinitions.MAGIC ? MAGIC_DEF.getId() : STAB_DEF.getId()];
            def *= CombatUtils.getCombatModifier(p2, Skills.DEFENCE);
        } else {
            Npc n = (Npc) target;
            def = n.getBonuses() == null ? 0 : n.getBonuses()[
                    attackStyle == NpcCombatDefinitions.RANGE ? RANGE_DEF.getId() :
                            attackStyle == NpcCombatDefinitions.MAGIC ? MAGIC_DEF.getId() : STAB_DEF.getId()];
        }
        double prob = att / def;
        if (prob > 0.90) // max, 90% prob hit so even lvl 138 can miss at lvl 3
            prob = 0.90;
        else if (prob < 0.05) // minimun 5% so even lvl 3 can hit lvl 138
            prob = 0.05;
        if (prob < Math.random()) return 0;
        return Utils.getRandom(maxHit);
    }

}
