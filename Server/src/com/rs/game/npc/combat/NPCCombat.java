package com.rs.game.npc.combat;

import com.rs.game.npc.Npc;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.impl.boss.godwars.zaros.Nex;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.world.*;
import com.rs.utils.MapAreas;
import com.rs.utils.Utils;
import com.rs.utils.game.CombatUtils;
import com.rs.utils.stringUtils.TimeUtils;

public final class NPCCombat {

    private Npc npc;
    private int combatDelay;
    private Entity target;

    public NPCCombat(Npc npc) {
        this.npc = npc;
    }

    public int getCombatDelay() {
        return combatDelay;
    }

    /*
     * returns if under combat
     */
    public boolean process() {
        if (combatDelay > 0) combatDelay--;
        if (target != null) {
            if (!checkAll()) {
                removeTarget();
                return false;
            }
            if (combatDelay <= 0) combatDelay = combatAttack();
            return true;
        }
        return false;
    }

    /*
     * return combatDelay
     */
    private int combatAttack() {
        Entity target = this.target; // prevents multithread issues
        if (target == null) return 0;
        if (npc.getFreezeDelay() >= TimeUtils.getTime()) return 0;
        NpcCombatDefinitions defs = npc.getCombatDefinitions();
        int attackStyle = defs.getAttackStyle();
        int maxDistance =
                attackStyle == NpcCombatDefinitions.MELEE || attackStyle == NpcCombatDefinitions.SPECIAL2 ? 0 : 7;
        if ((!(npc instanceof Nex)) && !npc.clippedProjectile(target, maxDistance == 0)) return 0;
        int distanceX = target.getX() - npc.getX();
        int distanceY = target.getY() - npc.getY();
        int size = npc.getSize();
        /*
         * if(npc.hasWalkSteps()) maxDistance += 1;
		 */
        if (distanceX > size + maxDistance || distanceX < -1 - maxDistance || distanceY > size + maxDistance
            || distanceY < -1 - maxDistance) {
            return 0;
        }
        addAttackedByDelay(target);
        return CombatScriptsHandler.specialAttack(npc, target);
    }

    void doDefenceEmote(Entity target) {
        target.setNextAnimationNoPriority(new Animation(CombatUtils.getDefenceEmote(target)));
    }

    public Entity getTarget() {
        return target;
    }

    void addAttackedByDelay(Entity target) {
        target.setAttackedBy(npc);
        target.setAttackedByDelay(
                TimeUtils.getTime() + npc.getCombatDefinitions().getAttackDelay() * 600 + 600); // 8seconds
    }

    public void setTarget(Entity target) {
        this.target = target;
        npc.setNextFaceEntity(target);
        if (!checkAll()) {
            removeTarget();
        }
    }

    public boolean checkAll() {
        Entity target = this.target; // prevents multithread issues
        if (target == null) return false;
        if (npc.isDead() || npc.hasFinished() || npc.isForceWalking() || target.isDead() || target.hasFinished())
            return false;
        if (npc.getFreezeDelay() >= TimeUtils.getTime()) return true; // if freeze cant move ofc
        int distanceX = npc.getX() - npc.getSpawnTile().getX();
        int distanceY = npc.getY() - npc.getSpawnTile().getY();
        int size = npc.getSize();
        int maxDistance = 32;
        if (!npc.isCantFollowUnderCombat() && !(npc instanceof Follower)) {

            if (npc.getMapAreaNameHash() != -1) {
                // if out his area
                if (!MapAreas.isAtArea(npc.getMapAreaNameHash(), npc) || (!npc.canBeAttackFromOutOfArea()
                                                                          && !MapAreas.isAtArea(npc
                        .getMapAreaNameHash(), target))) {
                    npc.forceWalkRespawnTile();
                    return false;
                }
            } else if (distanceX > size + maxDistance || distanceX < -1 - maxDistance || distanceY > size + maxDistance
                       || distanceY < -1 - maxDistance) {
                // if more than 64 distance from respawn place
                npc.forceWalkRespawnTile();
                return false;
            }
        }
        maxDistance = 16;
        distanceX = target.getX() - npc.getX();
        distanceY = target.getY() - npc.getY();
        if (npc.getPlane() != target.getPlane() || distanceX > size + maxDistance || distanceX < -1 - maxDistance
            || distanceY > size + maxDistance || distanceY < -1 - maxDistance)
            return false; // if target distance higher 16
        // checks for no multi area :)
        if (npc instanceof Follower) {
            Follower follower = (Follower) npc;
            if (!follower.canAttack(target)) return false;
        } else {
            if (!npc.isForceMultiAttacked()) {
                if (!target.isAtMultiArea() || !npc.isAtMultiArea()) {
                    if (npc.getAttackedBy() != target && npc.getAttackedByDelay() > System.currentTimeMillis())
                        return false;
                    if (target.getAttackedBy() != npc && target.getAttackedByDelay() > System.currentTimeMillis())
                        return false;
                }
            }
        }
        if (!npc.isCantFollowUnderCombat()) {
            if (distanceX < size && distanceX > -1 && distanceY < size && distanceY > -1) {
                npc.resetWalkSteps();
                if (!npc.addWalkSteps(target.getX() + 1, npc.getY())) {
                    npc.resetWalkSteps();
                    if (!npc.addWalkSteps(target.getX() - size - 1, npc.getY())) {
                        npc.resetWalkSteps();
                        if (!npc.addWalkSteps(target.getX(), npc.getY() + 1)) {
                            npc.resetWalkSteps();
                            if (!npc.addWalkSteps(target.getX(), npc.getY() - size - 1)) {
                                return true;
                            }
                        }
                    }
                }
                return true;
            }
            int attackStyle = npc.getCombatDefinitions().getAttackStyle();
            if (npc instanceof Nex) {
                Nex nex = (Nex) npc;
                maxDistance = nex.isFollowTarget() ? 0 : 7;
                if (nex.getFlyTime() == 0 && (distanceX > size + maxDistance || distanceX < -1 - maxDistance
                                              || distanceY > size + maxDistance || distanceY < -1 - maxDistance)) {
                    npc.resetWalkSteps();
                    npc.addWalkStepsInteract(target.getX(), target.getY(), 2, size, true);
                    if (!npc.hasWalkSteps()) {
                        int[][] dirs = Utils.getCoordOffsetsNear(size);
                        for (int dir = 0; dir < dirs[0].length; dir++) {
                            final WorldTile tile = new WorldTile(new WorldTile(
                                    target.getX() + dirs[0][dir], target.getY() + dirs[1][dir], target.getPlane()));
                            if (World.canMoveNPC(tile.getPlane(), tile.getX(), tile.getY(), size)) { // if found done
                                nex.setFlyTime(4);
                                npc.setNextForceMovement(new ForceMovement(new WorldTile(npc), 0, tile, 1, Utils
                                        .getMoveDirection(
                                        tile.getX() - npc.getX(), tile.getY() - npc.getY())));
                                npc.setNextAnimation(new Animation(6985));
                                npc.setNextWorldTile(tile);
                                return true;
                            }
                        }
                    }
                    return true;
                } else
                    // if doesnt need to move more stop moving
                    npc.resetWalkSteps();
            } else {
                maxDistance = npc.isForceFollowClose() ? 0 : (attackStyle == NpcCombatDefinitions.MELEE
                                                              || attackStyle == NpcCombatDefinitions.SPECIAL2) ? 0 : 7;
                // is far from target, moves to it till can attack
                if ((!npc.clippedProjectile(target, maxDistance == 0)) || distanceX > size + maxDistance
                    || distanceX < -1 - maxDistance || distanceY > size + maxDistance || distanceY < -1 - maxDistance) {
                    npc.resetWalkSteps();
                    npc.addWalkStepsInteract(target.getX(), target.getY(), 2, size, true);
                    return true;
                } else
                    // if doesnt need to move more stop moving
                    npc.resetWalkSteps();
                // if under target, moves

            }
        }
        return true;

    }

    public void addCombatDelay(int delay) {
        combatDelay += delay;
    }

    public void setCombatDelay(int delay) {
        combatDelay = delay;
    }

    public boolean underCombat() {
        return target != null;
    }

    public void removeTarget() {
        this.target = null;
        npc.setNextFaceEntity(null);
    }

    public void reset() {
        combatDelay = 0;
        target = null;
    }

}
