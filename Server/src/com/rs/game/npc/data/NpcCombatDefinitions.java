package com.rs.game.npc.data;

import com.rs.utils.fxUtils.propertyItems.IntegerItem;

/**
 * Created by Peng on 19.11.2016 11:55.
 */
public class NpcCombatDefinitions {
    public static final int MELEE = 0;
    public static final int RANGE = 1;
    public static final int MAGIC = 2;
    public static final int SPECIAL = 3;
    public static final int SPECIAL2 = 4; // follows no distance
    public static final int PASSIVE = 0;
    public static final int AGGRESSIVE = 1;

    private int hp;
    private int attA;
    private int defA;
    private int deathA;
    private int attD;
    private int deathD;
    private int spawnD;
    private int max;
    private int attS;
    private int attG;
    private int attP;
    private int aggT;

    public NpcCombatDefinitions(int hitpoints, int attackAnimation, int defenceAnimation, int deathAnimation, int attackDelay, int deathDelay, int respawnDelay, int maxHit, int attackStyle, int attackGfx, int attackProjectile, int aggressionType) {
        this.hp = hitpoints;
        this.attA = attackAnimation;
        this.defA = defenceAnimation;
        this.deathA = deathAnimation;
        this.attD = attackDelay;
        this.deathD = deathDelay;
        this.spawnD = respawnDelay;
        this.max = maxHit;
        this.attS = attackStyle;
        this.attG = attackGfx;
        this.attP = attackProjectile;
        this.aggT = aggressionType;
    }

    public int getSpawnDelay() {
        return spawnD;
    }

    public int getDeathEmote() {
        return deathA;
    }

    public int getDefenceEmote() {
        return defA;
    }

    public int getAttackEmote() {
        return attA;
    }

    public int getAttackGfx() {
        return attG;
    }

    public int getAgressivenessType() {
        return aggT;
    }

    public int getAttackProjectile() {
        return attP;
    }

    public int getAttackStyle() {
        return attS;
    }

    public int getAttackDelay() {
        return attD;
    }

    public int getMaxHit() {
        return max;
    }

    public int getHealth() {
        return hp;
    }

    public int getDeathDelay() {
        return deathD;
    }

    @Override
    public String toString() {
        return "NpcCombatDefinitions{" + "hp=" + hp + ", attA=" + attA
               + ", defA=" + defA + ", deathA=" + deathA + ", attD="
               + attD + ", deathD=" + deathD + ", spawnD=" + spawnD + ", max=" + max
               + ", attS=" + attS + ", attG=" + attG + ", attP=" + attP
               + ", aggT=" + aggT + '}';
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttA(int attA) {
        this.attA = attA;
    }

    public void setDefA(int defA) {
        this.defA = defA;
    }

    public void setDeathA(int deathA) {
        this.deathA = deathA;
    }

    public void setAttD(int attD) {
        this.attD = attD;
    }

    public void setDeathD(int deathD) {
        this.deathD = deathD;
    }

    public void setSpawnD(int spawnD) {
        this.spawnD = spawnD;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setAttS(int attS) {
        this.attS = attS;
    }

    public void setAttG(int attG) {
        this.attG = attG;
    }

    public void setAttP(int attP) {
        this.attP = attP;
    }

    public void setAggT(int aggT) {
        this.aggT = aggT;
    }
}
