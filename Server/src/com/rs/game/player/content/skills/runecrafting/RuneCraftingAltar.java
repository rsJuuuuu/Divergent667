package com.rs.game.player.content.skills.runecrafting;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.world.Animation;
import com.rs.game.world.Graphics;
import com.rs.game.world.WorldTile;

import static com.rs.game.player.content.skills.runecrafting.RuneConfigs.Rune.*;
import static com.rs.utils.Constants.*;

/**
 * Created by Peng on 10.2.2017 14:58.
 */
public enum RuneCraftingAltar {
    AIR_ALTAR(2478, new int[]{2452, 7139}, AIR, AIR_TIARA, AIR_TALISMAN, AIR_TALISMAN_STAFF, new WorldTile(2841, 4829)),
    MIND_ALTAR(2479, new int[]{2453, 7140}, MIND, MIND_TIARA, MIND_TALISMAN, MIND_TALISMAN_STAFF, new WorldTile(2792,
            4827)),
    WATER_ALTAR(2480, new int[]{2454, 7137}, WATER, WATER_TIARA, WATER_TALISMAN, WATER_TALISMAN_STAFF, new WorldTile
            (3482, 4838)),
    EARTH_ALTAR(2481, new int[]{2455, 7130}, EARTH, EARTH_TIARA, EARTH_TALISMAN, EARTH_TALISMAN_STAFF, new WorldTile
            (2655, 4830)),
    FIRE_ALTAR(2482, new int[]{2456, 7129}, FIRE, FIRE_TIARA, FIRE_TALISMAN, FIRE_TALISMAN_STAFF, new WorldTile(2574,
            4848)),
    BODY_ALTAR(2483, new int[]{2457, 7131}, BODY, BODY_TIARA, BODY_TALISMAN, BODY_TALISMAN_STAFF, new WorldTile(2522,
            4839)),
    COSMIC_ALTAR(2484, new int[]{7132}, COSMIC, COSMIC_TIARA, COSMIC_TALISMAN, COSMIC_TALISMAN_STAFF, new WorldTile(2162,
            4833)),
    CHAOS_ALTAR(2487, new int[]{7134}, CHAOS, CHAOS_TIARA, CHAOS_TALISMAN, CHAOS_TALISMAN_STAFF, new WorldTile(2281, 4837)),
    NATURE_ALTAR(2486, new int[]{7133}, NATURE, NATURE_TIARA, NATURE_TALISMAN, NATURE_TALISMAN_STAFF, new WorldTile(2400,
            4835)),
    LAW_ALTAR(2485, new int[]{7135}, LAW, LAW_TIARA, LAW_TALISMAN, LAW_TALISMAN_STAFF, new WorldTile(2464, 4818)),
    DEATH_ALTAR(2488, new int[]{7136}, DEATH, DEATH_TIARA, DEATH_TALISMAN, DEATH_TALISMAN_STAFF, new WorldTile(2208, 4830)),
    BLOOD_ALTAR(30624, new int[]{7141}, BLOOD, BLOOD_TIARA, BLOOD_TALISMAN, BLOOD_TALISMAN_STAFF, new WorldTile(2468,
            4889, 1)),
    ASTRAL_ALTAR(17010, new int[]{}, ASTRAL, ASTRAL_TIARA, -1, -1, new WorldTile(2153, 3868));

    private int altarId, tiaraId, talismanId, staffId;
    private int[] enterIds;
    RuneConfigs.Rune rune;
    WorldTile teleTile;

    RuneCraftingAltar(int altarId, int[] enterIds, RuneConfigs.Rune rune, int tiaraId, int talismanId, int staffId,
                      WorldTile teleTile) {
        this.altarId = altarId;
        this.enterIds = enterIds;
        this.rune = rune;
        this.tiaraId = tiaraId;
        this.talismanId = talismanId;
        this.staffId = staffId;
        this.teleTile = teleTile;

    }

    boolean checkRequirements(Player player) {
        if (!RequirementsManager.hasRequirement(player, Skills.RUNECRAFTING, rune.getLevel(), "to craft this rune"))
            return false;
        if (RequirementsManager.carryingAnyOf(player, talismanId, tiaraId, staffId, OMNI_TALISMAN, OMNI_TIARA,
                OMNI_TALISMAN_STAFF))
            return true;
        player.sendMessage("You need a talisman to craft this rune.");
        return false;
    }

    public void enterAltar(Player player) {
        player.sendMessage("A mysterious force grabs hold of you.");
        Magic.objectTeleport(player, teleTile);
    }

    public boolean craftRunes(Player player) {
        if (!checkRequirements(player)) return false;
        int runes = player.getInventory().getItems().getNumberOf(PURE_ESSENCE);
        if (runes > 0) player.getInventory().deleteItem(PURE_ESSENCE, runes);
        if (!rune.requiresPureEssence()) {
            int normalEss = player.getInventory().getItems().getNumberOf(RUNE_ESSENCE);
            if (normalEss > 0) {
                player.getInventory().deleteItem(RUNE_ESSENCE, normalEss);
                runes += normalEss;
            }
        }
        if (runes == 0) {
            player.getDialogueManager().startDialogue("SimpleMessage",
                    "You don't have any " + (rune.requiresPureEssence() ? "pure" : "rune") + " essence.");
            return true;
        }
        player.getSkills().addXp(Skills.RUNECRAFTING, rune.getExp() * runes);

        player.setNextGraphics(new Graphics(186));
        player.setNextAnimation(new Animation(791));
        player.addStopDelay(5);
        player.getInventory().addItem(rune.getId(), runes);
        player.getPackets().sendGameMessage("You bind the temple's power into the "
                                            + ItemDefinitions.getItemDefinitions(rune.getId()).getName().toLowerCase()
                                            + "s.");
        return true;
    }

    public int getAltarId() {
        return altarId;
    }

    public int[] getEnterIds() {
        return enterIds;
    }
}
