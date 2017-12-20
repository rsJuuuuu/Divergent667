package com.rs.game.player;

import com.rs.game.Hit;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.gameUtils.effects.combat.CombatModifier;
import com.rs.game.gameUtils.effects.combat.DamageModifier;
import com.rs.game.gameUtils.effects.combat.DeflectEffect;
import com.rs.game.gameUtils.effects.combat.HealthTrigger;
import com.rs.game.gameUtils.effects.prayer.*;
import com.rs.game.gameUtils.events.EntityEvent;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Animation;
import com.rs.game.world.Graphics;
import com.rs.utils.game.CombatUtils;
import org.pmw.tinylog.Logger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

import static com.rs.game.player.InterfaceManager.GameInterface.PRAYER_BOOK;
import static com.rs.utils.Constants.BonusType.PRAYER_BONUS;
import static com.rs.utils.Constants.CURSE_PRAYERS;
import static com.rs.utils.Constants.NORMAL_PRAYERS;

/**
 * Created by Peng on 30.12.2016 23:01.
 */

public class Prayer implements Serializable {

    public enum PrayerSpell {
        THICK_SKIN(0, 1, 1, 1.0 / 1.2, new CombatModifier(Skills.DEFENCE, 0.05)),
        BURST_OF_STRENGTH(1, 2, 4, 1.0 / 1.2, new CombatModifier(Skills.STRENGTH, 0.05)),
        CLARITY_OF_THOUGHT(2, 4, 7, 1.0 / 1.2, new CombatModifier(Skills.ATTACK, 0.05)),
        SHARP_EYE(3, 262144, 8, 1.0 / 1.2, new CombatModifier(Skills.RANGE, 0.05)),
        MYSTIC_WILL(4, 524288, 9, 1.0 / 1.2, new CombatModifier(Skills.MAGIC, 0.05)),
        ROCK_SKIN(5, 8, 10, 1.0 / 6.0, new CombatModifier(Skills.DEFENCE, 0.10)),
        SUPERHUMAN_STRENGTH(6, 16, 13, 1.0 / 0.6, new CombatModifier(Skills.STRENGTH, 0.10)),
        IMPROVED_REFLEXES(7, 32, 16, 1.0 / 0.6, new CombatModifier(Skills.ATTACK, 0.10)),
        HAWK_EYE(11, 1048576, 26, 1.0 / 0.6, new CombatModifier(Skills.RANGE, 0.10)),
        MYSTIC_LORE(12, 2097152, 27, 1.0 / 0.6, new CombatModifier(Skills.MAGIC, 0.10)),
        STEEL_SKIN(13, 512, 28, 1.0 / 0.3, new CombatModifier(Skills.DEFENCE, 0.15)),
        ULTIMATE_STRENGTH(14, 1024, 31, 1.0 / 0.3, new CombatModifier(Skills.STRENGTH, 0.15)),
        INCREDIBLE_REFLEXES(15, 2048, 34, 1.0 / 0.3, new CombatModifier(Skills.ATTACK, 0.15)),
        EAGLE_EYE(20, 4194304, 44, 1.0 / 0.3, new CombatModifier(Skills.RANGE, 0.15)),
        MYSTIC_MIGHT(21, 8388608, 45, 1.0 / 0.3, new CombatModifier(Skills.MAGIC, 0.15)),
        RAPID_RESTORE(8, 64, 19, 1.0 / 3.6),
        RAPID_HEAL(9, 128, 22, 1.0 / 1.8),
        PROTECT_ITEM(10, 256, 25, 1.0 / 1.8),
        PROTECT_SUMMONING(16, 16777216, 8, 35, 1.0 / 0.3, new SummoningProtect()),
        PROTECT_MAGIC(17, 4096, 3, 37, 1.0 / 0.3, new DamageModifier(0.0, 0.6, Hit.HitLook.MAGIC_DAMAGE)),
        PROTECT_MISSILES(18, 8192, 2, 40, 1.0 / 0.3, new DamageModifier(0.0, 0.6, Hit.HitLook.RANGE_DAMAGE)),
        PROTECT_MELEE(19, 16384, 1, 43, 1.0 / 0.3, new DamageModifier(0.0, 0.6, Hit.HitLook.MELEE_DAMAGE)),
        RETRIBUTION(22, 32768, 4, 46, 1.0 / 1.2, new WrathEffect(3, 437, 438, 439, 2.5)),
        REDEMPTION(23, 65536, 6, 49, 1.0 / 0.6, new HealthTrigger(0.1, entity -> {
            if (entity instanceof Player) {
                Player player = (Player) entity;
                player.heal((int) Math.floor((((Player) entity).getSkills().getLevelForXp(Skills.PRAYER) * 2.5)));
                player.setNextGraphics(new Graphics(436));
                player.getSkills().set(Skills.PRAYER, 0);
                player.getPrayer().setPrayerPoints(0);
            }
        })),
        SMITE(24, 131072, 5, 52, 1.0 / 0.18, new Smite(0.25)),
        CHIVALRY(25, 33554432, 60, 1.0
                                   / 1.18, new CombatModifier(Skills.ATTACK, 0.15), new CombatModifier(Skills
                .STRENGTH, 0.18), new CombatModifier(Skills.DEFENCE, 0.2)),
        PIETY(27, 67108864, 70, 1.0
                                / 0.15, new CombatModifier(Skills.ATTACK, 0.20), new CombatModifier(Skills.STRENGTH,
                0.23), new CombatModifier(Skills.DEFENCE, 0.25)),
        RAPID_RENEWAL(26, 134217728, 65, 1.0 / 0.24),
        RIGOUR(28, 536870912, 74,
                1.0 / 0.2, new CombatModifier(Skills.RANGE, 0.20), new CombatModifier(Skills.DEFENCE, 0.25)),
        AUGURY(29, 268435456, 77,
                1.0 / 0.18, new CombatModifier(Skills.MAGIC, 0.20), new CombatModifier(Skills.DEFENCE, 0.25)),
        PROTECT_ITEM_CURSE(0, 50, 10 / 18.0, entity -> {
            entity.setNextAnimation(new Animation(12567));
            entity.setNextGraphics(new Graphics(2213));
        }),
        SAP_WARRIOR(1, 50,
                1.0 / 2.6, new StatDrainEffect(2215, 2214, 2216, Skills.ATTACK, Skills.STRENGTH, Skills.DEFENCE)),
        SAP_RANGER(2, 52, 1.0 / 2.6, new StatDrainEffect(2218, 2217, 2219, Skills.RANGE, Skills.DEFENCE)),
        SAP_MAGE(3, 54, 1.0 / 2.6, new StatDrainEffect(2221, 2220, 2222, Skills.MAGIC, Skills.DEFENCE)),
        SAP_SPIRIT(4, 56, 1 / 0.24, new OtherDrainEffect(2224, 2223, 2224, true)),
        BERSERKER(5, 59, 1.0 / 1.8, entity -> {
            entity.setNextAnimation(new Animation(12589));
            entity.setNextGraphics(new Graphics(2266));
        }),
        DEFLECT_SUMMONING(6, 62, 10.0 / 3.0, 16, new SummoningProtect()),
        DEFLECT_MAGIC(7, 65, 10.0
                             / 3.0, 14, new DamageModifier(0.0, 0.6, Hit.HitLook.MAGIC_DAMAGE), new DeflectEffect
                (0.1, 2228, Hit.HitLook.MAGIC_DAMAGE)),
        DEFLECT_MISSILES(8, 68, 10.0
                                / 3.0, 15, new DamageModifier(0.0, 0.6, Hit.HitLook.RANGE_DAMAGE), new DeflectEffect
                (0.1, 2229, Hit.HitLook.RANGE_DAMAGE)),
        DEFLECT_MELEE(9, 71, 10.0
                             / 3.0, 13, new DamageModifier(0.0, 0.6, Hit.HitLook.MELEE_DAMAGE), new DeflectEffect
                (0.1, 2230, Hit.HitLook.MELEE_DAMAGE)),
        LEECH_ATTACK(10, 74, 10.0 / 3.6, new StatDrainEffect(2231, 2232, Skills.ATTACK)),
        LEECH_RANGED(11, 76, 10.0 / 3.6, new StatDrainEffect(2236, 2238, Skills.RANGE)),
        LEECH_MAGIC(12, 78, 10.0 / 3.6, new StatDrainEffect(2240, 2242, Skills.MAGIC)),
        LEECH_DEFENCE(13, 80, 10.0 / 3.6, new StatDrainEffect(2244, 2246, Skills.DEFENCE)),
        LEECH_STRENGTH(14, 82, 10.0 / 3.6, new StatDrainEffect(2248, 2250, Skills.STRENGTH)),
        LEECH_ENERGY(15, 84, 1 / 0.36, new OtherDrainEffect(2252, 2251, false)),
        LEECH_SPECIAL(16, 86, 1 / 0.36, new OtherDrainEffect(2256, 2255, true)),
        WRATH(17, 89, 10.0 / 12.0, 20, new WrathEffect(5, 2259, 2261, 2260, 2.5)),
        SOUL_SPLIT(18, 92, 10.0 / 2.0, 21, new Smite(0.20), new HealthDrainEffect(0.2, true)),
        TURMOIL(19, 95, 10.0 / 2.0, entity -> {
            entity.setNextAnimation(new Animation(12565));
            entity.setNextGraphics(new Graphics(2226));
        }, new TurmoilEffect());

        private int slot, enabledValue, level, book, overheadValue = 0;
        private double drain;
        private Effect[] effects;
        private EntityEvent activateEvent;

        /**
         * Normal prayers constructor (requires enabled value)
         */
        PrayerSpell(int slot, int enabledValue, int level, double drain, Effect... effects) {
            this.slot = slot;
            this.enabledValue = enabledValue;
            this.level = level;
            this.book = NORMAL_PRAYERS;
            this.drain = drain;
            this.effects = effects;
        }

        /**
         * Normal prayers with overhead icon
         */
        PrayerSpell(int slot, int enabledValue, int overheadValue, int level, double drain, Effect... effects) {
            this.slot = slot;
            this.enabledValue = enabledValue;
            this.level = level;
            this.book = NORMAL_PRAYERS;
            this.drain = drain;
            this.effects = effects;
            this.overheadValue = overheadValue;
        }

        /**
         * Curses constructor
         */
        PrayerSpell(int slot, int level, double drain, Effect... effects) {
            this.slot = slot;
            this.enabledValue = -1;
            this.level = level;
            this.book = CURSE_PRAYERS;
            this.drain = drain;
            this.effects = effects;
        }

        /**
         * Curses constructor
         */
        PrayerSpell(int slot, int level, double drain, EntityEvent activateEvent, Effect... effects) {
            this.slot = slot;
            this.enabledValue = -1;
            this.level = level;
            this.book = CURSE_PRAYERS;
            this.drain = drain;
            this.effects = effects;
            this.activateEvent = activateEvent;
        }

        /**
         * Curses with overhead icons
         */
        PrayerSpell(int slot, int level, double drain, int overheadValue, Effect... effects) {
            this.slot = slot;
            this.enabledValue = -1;
            this.level = level;
            this.book = CURSE_PRAYERS;
            this.drain = drain;
            this.effects = effects;
            this.overheadValue = overheadValue;
        }

        public static PrayerSpell forId(int slotId, int book) {
            for (PrayerSpell prayer : PrayerSpell.values())
                if (prayer.book == book && prayer.slot == slotId) return prayer;
            return null;
        }
    }

    enum PrayerGroup {
        DEFENCE_PRAYERS(PrayerSpell.THICK_SKIN, PrayerSpell.ROCK_SKIN, PrayerSpell.ROCK_SKIN, PrayerSpell.CHIVALRY,
                PrayerSpell.PIETY),
        STRENGTH_PRAYERS(PrayerSpell.BURST_OF_STRENGTH, PrayerSpell.SUPERHUMAN_STRENGTH, PrayerSpell
                .ULTIMATE_STRENGTH, PrayerSpell.CHIVALRY, PrayerSpell.PIETY, PrayerSpell.SAP_WARRIOR, PrayerSpell
                .TURMOIL),
        ATTACK_PRAYERS(PrayerSpell.CLARITY_OF_THOUGHT, PrayerSpell.IMPROVED_REFLEXES, PrayerSpell
                .INCREDIBLE_REFLEXES, PrayerSpell.CHIVALRY, PrayerSpell.PIETY, PrayerSpell.SAP_WARRIOR, PrayerSpell
                .TURMOIL),
        RANGED_PRAYERS(PrayerSpell.SHARP_EYE, PrayerSpell.HAWK_EYE, PrayerSpell.EAGLE_EYE, PrayerSpell.RIGOUR,
                PrayerSpell.SAP_RANGER, PrayerSpell.TURMOIL),
        MAGIC_PRAYERS(PrayerSpell.MYSTIC_WILL, PrayerSpell.MYSTIC_LORE, PrayerSpell.MYSTIC_MIGHT, PrayerSpell.AUGURY,
                PrayerSpell.SAP_MAGE, PrayerSpell.TURMOIL),
        OTHER_PROTECTION_PRAYERS(PrayerSpell.PROTECT_ITEM, PrayerSpell.PROTECT_ITEM_CURSE),
        OVERHEAD_PRAYERS(PrayerSpell.RETRIBUTION, PrayerSpell.SMITE, PrayerSpell.PROTECT_MAGIC, PrayerSpell
                .PROTECT_MISSILES, PrayerSpell.PROTECT_MELEE, PrayerSpell.REDEMPTION, PrayerSpell.DEFLECT_MAGIC,
                PrayerSpell.DEFLECT_MISSILES, PrayerSpell.DEFLECT_MELEE, PrayerSpell.WRATH, PrayerSpell.SOUL_SPLIT),
        OVERHEAD_EXCEPTIONS(PrayerSpell.PROTECT_SUMMONING, PrayerSpell.RETRIBUTION, PrayerSpell.SMITE, PrayerSpell
                .REDEMPTION, PrayerSpell.DEFLECT_SUMMONING, PrayerSpell.WRATH, PrayerSpell.SOUL_SPLIT);

        private ArrayList<PrayerSpell> members;

        PrayerGroup(PrayerSpell... members) {
            this.members = new ArrayList<>();
            Collections.addAll(this.members, members);
        }

        public static ArrayList<PrayerGroup> getGroups(PrayerSpell prayer) {
            ArrayList<PrayerGroup> groups = new ArrayList<>();
            for (PrayerGroup group : PrayerGroup.values()) {
                if (group.members.contains(prayer)) groups.add(group);
            }
            return groups;
        }
    }

    private static final long serialVersionUID = -2082861520556582824L;

    private transient boolean settingQuickPrayers;
    private transient boolean usingQuickPrayers;

    private transient Player player;

    private transient ArrayList<PrayerSpell> activePrayers = new ArrayList<>();

    private int prayerPoints;
    private boolean ancientCurses;
    private ArrayList<PrayerSpell> quickPrayers = new ArrayList<>();
    private ArrayList<PrayerSpell> quickCurses = new ArrayList<>();

    public Prayer() {
        prayerPoints = 10;
    }

    public void toggleSettingQuickPrayers() {
        settingQuickPrayers = !settingQuickPrayers;
        refreshConfigs();
        if (settingQuickPrayers) player.getPackets().sendGlobalConfig(168, 6);
    }

    public void toggleQuickPrayers() {
        if (settingQuickPrayers) toggleSettingQuickPrayers();
        closeAllPrayers();
        if (!usingQuickPrayers) {
            if (getPrayerBook() == NORMAL_PRAYERS) {
                if (quickPrayers.isEmpty()) {
                    player.sendMessage("Please set some quick prayers to get started.");
                    return;
                }
                for (PrayerSpell prayer : quickPrayers)
                    togglePrayer(prayer);
            } else {
                if (quickCurses.isEmpty()) {
                    player.sendMessage("Please set some quick curses to get started.");
                    return;
                }
                for (PrayerSpell prayer : quickCurses)
                    togglePrayer(prayer);
            }
        }
        usingQuickPrayers = !usingQuickPrayers;
        refreshConfigs();
    }

    public void togglePrayer(int slotId) {
        PrayerSpell spell = PrayerSpell.forId(slotId, getPrayerBook());
        if (spell == null) {
            Logger.warn("Invalid prayer: book: " + getPrayerBook() + " slot: " + slotId + ".");
            return;
        }
        togglePrayer(spell);
    }

    private void removePrayer(PrayerSpell spell) {
        if (settingQuickPrayers) {
            if (ancientCurses) quickCurses.remove(spell);
            else quickPrayers.remove(spell);
        } else activePrayers.remove(spell);
    }

    private void addPrayer(PrayerSpell spell) {
        if (settingQuickPrayers) {
            if (ancientCurses) quickCurses.add(spell);
            else quickPrayers.add(spell);
        } else {
            if (spell.activateEvent != null) spell.activateEvent.process(player);
            activePrayers.add(spell);
        }
    }

    private boolean containsPrayer(PrayerSpell spell) {
        if (settingQuickPrayers) {
            if (ancientCurses) return quickCurses.contains(spell);
            else return quickPrayers.contains(spell);
        } else return activePrayers.contains(spell);
    }

    private ArrayList<PrayerSpell> getActiveList() {
        if (settingQuickPrayers) {
            if (ancientCurses) return quickCurses;
            else return quickPrayers;
        } else return activePrayers;
    }

    private void togglePrayer(PrayerSpell spell) {
        if (containsPrayer(spell)) removePrayer(spell);
        else {
            if (ancientCurses)
                if (!RequirementsManager.hasRequirement(player, Skills.DEFENCE, 28, "use curses", false)) return;
            if (!RequirementsManager.hasRequirement(player, Skills.PRAYER, spell.level, "activate this prayer", false))
                return;
            if (spell == PrayerSpell.PIETY)
                if (!RequirementsManager.hasRequirement(player, Skills.DEFENCE, 70, "activate this prayer", false))
                    return;
            if (spell == PrayerSpell.CHIVALRY)
                if (!RequirementsManager.hasRequirement(player, Skills.DEFENCE, 65, "activate this prayer", false))
                    return;

            //close the prayers that can't be active with this prayer
            ArrayList<PrayerGroup> groupsToClose = PrayerGroup.getGroups(spell);
            for (PrayerGroup group : groupsToClose)
                for (PrayerSpell prayer : group.members)
                    removePrayer(prayer);
            if (getPrayerBook() == CURSE_PRAYERS) {
                if (spell.name().toLowerCase().contains("leech")) {
                    for (PrayerSpell prayer : PrayerSpell.values())
                        if (prayer.name().toLowerCase().contains("sap")
                            || prayer.name().toLowerCase().contains("turmoil")) removePrayer(prayer);
                } else if (spell.name().toLowerCase().contains("sap")) {
                    for (PrayerSpell prayer : PrayerSpell.values())
                        if (prayer.name().toLowerCase().contains("leech")
                            || prayer.name().toLowerCase().contains("turmoil")) removePrayer(prayer);
                } else if (spell.name().toLowerCase().contains("turmoil")) {
                    for (PrayerSpell prayer : PrayerSpell.values())
                        if (prayer.name().toLowerCase().contains("leech")
                            || prayer.name().toLowerCase().contains("sap")) removePrayer(prayer);
                }

            }
            addPrayer(spell);
        }
        if (!settingQuickPrayers && spell.overheadValue != 0) player.getAppearance().generateAppearanceData();
        refreshConfigs();
    }

    private void updateStats() {
        player.getPackets().sendConfigByFile(6857, (int) (29 + CombatUtils.getCombatModifier(player, Skills.ATTACK)));
        player.getPackets().sendConfigByFile(6858, (int) (29 + CombatUtils.getCombatModifier(player, Skills.STRENGTH)));
        player.getPackets().sendConfigByFile(6859, (int) (29 + CombatUtils.getCombatModifier(player, Skills.DEFENCE)));
        player.getPackets().sendConfigByFile(6860, (int) (29 + CombatUtils.getCombatModifier(player, Skills.RANGE)));
        player.getPackets().sendConfigByFile(6861, (int) (29 + CombatUtils.getCombatModifier(player, Skills.MAGIC)));
    }

    private void refreshConfigs() {
        int value = 0;
        for (PrayerSpell prayer : getActiveList()) {
            if (prayer.book == CURSE_PRAYERS) value += Math.pow(2, prayer.slot);
            else value += prayer.enabledValue;
        }
        player.getPackets().sendConfig(ancientCurses ? (settingQuickPrayers ? 1587 : 1582) : (settingQuickPrayers ?
                                                                                                      1397 : 1395),
                value);
        player.getPackets().sendConfig(1584, ancientCurses ? 1 : 0);
        player.getPackets().sendGlobalConfig(181, settingQuickPrayers ? 1 : 0);
        player.getPackets().sendGlobalConfig(182, usingQuickPrayers ? 1 : 0);
        unlockPrayerBookButtons();
        updateStats();
        refreshPrayerPoints();
    }

    void refreshPrayerPoints() {
        player.getPackets().sendConfig(2382, prayerPoints);
    }

    public void reset() {
        closeAllPrayers();
        prayerPoints = player.getSkills().getLevelForXp(Skills.PRAYER) * 10;
        refreshPrayerPoints();
    }

    void closeAllPrayers() {
        activePrayers.clear();
        player.getPackets().sendGlobalConfig(182, 0);
        player.getPackets().sendConfig(ancientCurses ? 1582 : 1395, 0);
        player.getAppearance().generateAppearanceData();
        refreshConfigs();
    }

    private static boolean drainTick = true;

    void processPrayer() {
        if (activePrayers.size() == 0) return;
        drainTick = !drainTick;
        if (drainTick) {
            int prayerBonus = player.getCombatDefinitions().getBonuses()[PRAYER_BONUS.getId()];
            double toDrain = (getTotalDrain() - prayerBonus * 0.1 / 3 * getTotalDrain()) * 0.6 * 2;
            drainPrayer((int) toDrain);
        }
        if (!hasPrayerPoints()) closeAllPrayers();
    }

    /**
     * @return drain/second
     */
    private double getTotalDrain() {
        double drain = 0;
        for (PrayerSpell prayer : activePrayers) {
            drain += prayer.drain;
        }
        return drain;
    }

    /**
     * Check if we can keep praying
     */
    private boolean hasPrayerPoints() {
        if (prayerPoints <= 0) {
            player.getPackets().sendSound(2672, 0, 1);
            player.getPackets().sendGameMessage("Please recharge your prayer at an altar.");
            return false;
        }
        return true;
    }

    public void init() {
        refreshConfigs();
    }

    void unlockPrayerBookButtons() {
        player.getPackets().sendUnlockIComponentOptionSlots(271, settingQuickPrayers ? 42 : 8, 0, 29, 0);
    }

    public void setPrayerBook(boolean ancientCurses) {
        closeAllPrayers();
        this.ancientCurses = ancientCurses;
        player.getInterfaceManager().openInterfaces(PRAYER_BOOK);
        refreshConfigs();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void drainPrayer(int amount) {
        if ((prayerPoints - amount) >= 0) prayerPoints -= amount;
        else prayerPoints = 0;
        refreshPrayerPoints();
    }

    public void drainPrayerToHalf() {
        if (prayerPoints > 0) {
            prayerPoints = prayerPoints / 2;
            refreshPrayerPoints();
        }
    }

    public void restorePrayer(int amount) {
        int maxPrayer = player.getSkills().getLevelForXp(Skills.PRAYER) * 10;
        if ((prayerPoints + amount) <= maxPrayer) prayerPoints += amount;
        else prayerPoints = maxPrayer;
        refreshPrayerPoints();
    }

    public ArrayList<Effect> getPrayerEffects() {
        ArrayList<Effect> effects = new ArrayList<>();
        for (PrayerSpell prayer : activePrayers) Collections.addAll(effects, prayer.effects);
        return effects;
    }

    public boolean isSettingQuickPrayers() {
        return settingQuickPrayers;
    }

    public boolean isAncientCurses() {
        return ancientCurses;
    }

    public boolean usingPrayer(PrayerSpell... prayers) {
        for (PrayerSpell prayer : prayers)
            if (activePrayers.contains(prayer)) return true;
        return false;
    }

    private int getPrayerBook() {
        return ancientCurses ? CURSE_PRAYERS : NORMAL_PRAYERS;
    }

    public void setPrayerPoints(int prayerPoints) {
        this.prayerPoints = prayerPoints;
    }

    public int getPrayerPoints() {
        return prayerPoints;
    }

    int getOverheadValue() {
        int value = -1;
        for (PrayerSpell prayer : activePrayers) {
            if (activePrayers.contains(PrayerSpell.DEFLECT_SUMMONING)) {
                if (prayer == PrayerSpell.DEFLECT_MAGIC) value += 3;
                else if (prayer == PrayerSpell.DEFLECT_MISSILES) value += 2;
                else if (prayer == PrayerSpell.DEFLECT_MELEE) value += 1;
                else value += prayer.overheadValue;
            } else value += prayer.overheadValue;
        }
        return value;
    }

    public static void useAltar(Player player) {
        final int maxPrayer = player.getSkills().getLevelForXp(Skills.PRAYER) * 10;
        if (player.getPrayer().getPrayerPoints() < maxPrayer) {
            player.addStopDelay(5);
            player.getPackets().sendGameMessage("You pray to the gods...", true);
            player.setNextAnimation(new Animation(645));
            WorldTasksManager.schedule(new WorldTask() {
                @Override
                public void run() {
                    player.getPrayer().restorePrayer(maxPrayer);
                    player.getPackets().sendGameMessage("...and recharged your prayer.", true);
                }
            }, 2);
        } else {
            player.getPackets().sendGameMessage("You already have full prayer.", true);
        }
    }

}
