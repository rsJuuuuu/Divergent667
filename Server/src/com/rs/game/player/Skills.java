package com.rs.game.player;

import com.rs.Settings;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Animation;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;
import com.rs.utils.stringUtils.TextUtils;

import java.io.Serializable;

public final class Skills implements Serializable {

    private static final long serialVersionUID = -7086829989489745985L;

    public static final int ATTACK = 0, DEFENCE = 1, STRENGTH = 2, HITPOINTS = 3, RANGE = 4, PRAYER = 5, MAGIC = 6,
            COOKING = 7, WOODCUTTING = 8, FLETCHING = 9, FISHING = 10, FIREMAKING = 11, CRAFTING = 12, SMITHING = 13,
            MINING = 14, HERBLORE = 15, AGILITY = 16, THIEVING = 17, SLAYER = 18, FARMING = 19, RUNECRAFTING = 20,
            CONSTRUCTION = 22, HUNTER = 21, SUMMONING = 23, DUNGEONEERING = 24;

    public static final String[] SKILL_NAME = {"Attack", "Defence", "Strength", "Hitpoints", "Range", "prayer",
            "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing",
            "Mining", "Herblore", "Agility", "Thieving", "Slayer", "Farming", "Runecrafting", "Hunter",
            "Construction", "Summoning", "Dungeoneering"};

    public short level[];
    private double xp[];
    private double xpCounter;

    private transient Player player;

    public Skills() {
        level = new short[25];
        xp = new double[25];
        for (int i = 0; i < level.length; i++) {
            level[i] = 1;
            xp[i] = 0;
        }
        level[3] = 10;
        xp[3] = 1184;
        level[HERBLORE] = 3;
        xp[HERBLORE] = 250;
    }

    public void restoreSkills() {
        for (int skill = 0; skill < level.length; skill++) {
            level[skill] = (short) getLevelForXp(skill);
            refresh(skill);
        }
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getLevel(int skill) {
        return level[skill];
    }

    public double getXp(int skill) {
        return xp[skill];
    }

    public int getCombatLevel() {
        int attack = getLevelForXp(0);
        int defence = getLevelForXp(1);
        int strength = getLevelForXp(2);
        int hp = getLevelForXp(3);
        int prayer = getLevelForXp(5);
        int ranged = getLevelForXp(4);
        int magic = getLevelForXp(6);
        int combatLevel = 3;
        combatLevel = (int) ((defence + hp + Math.floor(prayer / 2)) * 0.25) + 1;
        double melee = (attack + strength) * 0.325;
        double ranger = Math.floor(ranged * 1.5) * 0.325;
        double mage = Math.floor(magic * 1.5) * 0.325;
        if (melee >= ranger && melee >= mage) {
            combatLevel += melee;
        } else if (ranger >= melee && ranger >= mage) {
            combatLevel += ranger;
        } else if (mage >= melee && mage >= ranger) {
            combatLevel += mage;
        }
        return combatLevel;
    }

    public void set(int skill, int newLevel) {
        level[skill] = (short) newLevel;
        refresh(skill);
    }

    public int drainLevel(int skill, int drain) {
        int drainLeft = drain - level[skill];
        if (drainLeft < 0) {
            drainLeft = 0;
        }
        level[skill] -= drain;
        if (level[skill] < 0) {
            level[skill] = 0;
        }
        refresh(skill);
        return drainLeft;
    }

    /**
     * Drop players level to 1-percentage*actual level
     */
    public void drainLevelByPercentage(int skill, double percentage) {
        if (level[skill] > getLevelForXp(skill) * (1 - percentage)) {
            level[skill] = (short) (getLevelForXp(skill) * (1 - percentage));
        }
    }

    public int getCombatLevelWithSummoning() {
        return getCombatLevel() + getSummoningCombatLevel();
    }

    private int getSummoningCombatLevel() {
        return getLevelForXp(Skills.SUMMONING) / 8;
    }

    public void drainSummoning(int amt) {
        int level = getLevel(Skills.SUMMONING);
        if (level == 0) return;
        set(Skills.SUMMONING, amt > level ? 0 : level - amt);
    }

    public static int getXPForLevel(int level) {
        int points = 0;
        int output = 0;
        for (int lvl = 1; lvl <= level; lvl++) {
            points += Math.floor((double) lvl + 300.0 * Math.pow(2.0, (double) lvl / 7.0));
            if (lvl >= level) {
                return output;
            }
            output = (int) Math.floor(points / 4);
        }
        return 0;
    }

    public int getLevelForXp(int skill) {
        double exp = xp[skill];
        int points = 0;
        int output;
        for (int lvl = 1; lvl <= (skill == DUNGEONEERING ? 120 : 99); lvl++) {
            points += Math.floor((double) lvl + 300.0 * Math.pow(2.0, (double) lvl / 7.0));
            output = (int) Math.floor(points / 4);
            if ((output - 1) >= exp) {
                return lvl;
            }
        }
        return skill == DUNGEONEERING ? 120 : 99;
    }

    public void init() {
        for (int skill = 0; skill < level.length; skill++)
            refresh(skill);
        refreshXpCounter();
    }

    private void refreshXpCounter() {
        player.getPackets().sendConfig(1801, (int) (xpCounter * 10));
    }

    public void resetXpCounter() {
        xpCounter = 0;
        refreshXpCounter();
    }

    public void refresh(int skill) {
        player.getPackets().sendSkillLevel(skill);
    }

    public void addXp(int skill, double exp) {
        if (player.isLockXp()) return;
        player.getControllerManager().trackXP(skill, (int) exp);
        if (skill != ATTACK && skill != DEFENCE && skill != STRENGTH && skill != MAGIC && skill != RANGE
            && skill != HITPOINTS) exp *= Settings.SKILLING_XP_RATE;
        else exp *= Settings.COMBAT_XP_RATE;

        if (player.getAuraManager().usingWisdom()) exp *= 1.025;
        int oldLevel = getLevelForXp(skill);
        boolean can200m = xp[skill] < Settings.MAXIMUM_EXP;
        xp[skill] += exp;
        xpCounter += exp;
        refreshXpCounter();
        if (xp[skill] >= Settings.MAXIMUM_EXP) {
            xp[skill] = Settings.MAXIMUM_EXP;
            if (can200m) World.sendNewsMessage(TextUtils.formatPlayerNameForDisplay(
                    player.getDisplayName() + " has just reached " + "200m experience in " + SKILL_NAME[skill]));
        }
        int newLevel = getLevelForXp(skill);
        int levelDiff = newLevel - oldLevel;
        if (newLevel > oldLevel) {
            if (isMaxed()) {
                player.getBank().addItem(20767, 1, true);
                player.getBank().addItem(20768, 1, true);
            }
            level[skill] += levelDiff;
            player.getDialogueManager().startDialogue("LevelUp", skill);
            if (skill == HITPOINTS) player.heal(levelDiff * 10);
            if (skill == PRAYER) player.getPrayer().restorePrayer(levelDiff * 10);
            if (skill == SUMMONING || (skill >= ATTACK && skill <= MAGIC))
                player.getAppearance().generateAppearanceData();
        }
        refresh(skill);
    }

    private boolean isMaxed() {
        for (int i = 0; i < level.length; i++)
            if (getLevel(i) < 99) return false;
        return true;
    }

    public void addSkillXpRefresh(int skill, double xp) {
        this.xp[skill] += xp;
        level[skill] = (short) getLevelForXp(skill);
    }

    public void resetSkillNoRefresh(int skill) {
        xp[skill] = 0;
        level[skill] = 1;
    }

    public void resetAll() {
        for (int i = 0; i < xp.length; i++) {
            xp[i] = 0;
            refresh(i);
        }

    }

    public void setXp(int skill, double exp) {
        xp[skill] = exp;
        refresh(skill);
    }

    private void restoreSummoning() {
        level[SUMMONING] = (short) getLevelForXp(SUMMONING);
        refresh(SUMMONING);
    }

    public void renewSummoning() {
        if (level[SUMMONING] == getLevelForXp(SUMMONING)) {
            player.sendMessage("You already have full summoning points");
            return;
        }
        player.sendMessage("You feel the obelisk");
        player.setNextAnimation(new Animation(8502));
        player.setNextGraphics(new Graphics(1308));
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                restoreSummoning();
                player.sendMessage("...and renew your summoning points");
            }
        }, 2);
    }

    public int getTotalLevel() {
        int total = 0;
        for (int i = 0; i < 25; i++) {
            total += getLevelForXp(i);
        }
        return total;
    }
}
