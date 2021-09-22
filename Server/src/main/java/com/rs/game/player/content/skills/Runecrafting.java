package com.rs.game.player.content.skills;

import com.rs.Settings;
import com.rs.game.actionHandling.Handler;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.content.skills.runecrafting.RuneCraftingAltar;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.registerObjectAction;
import static com.rs.utils.Constants.*;

public final class Runecrafting implements Handler {

    private final static int[] LEVEL_REQ = {1, 25, 50, 75};

    public static boolean isTiara(int id) {
        return id == AIR_TIARA || id == MIND_TIARA || id == WATER_TIARA || id == BODY_TIARA || id == EARTH_TIARA
               || id == FIRE_TIARA || id == COSMIC_TIARA || id == NATURE_TIARA || id == CHAOS_TIARA || id == LAW_TIARA
               || id == DEATH_TIARA || id == BLOOD_TIARA || id == SOUL_TIARA || id == ASTRAL_TIARA || id == OMNI_TIARA;
    }

    public static void checkPouch(Player p, int i) {
        if (i < 0) return;
        p.getPackets().sendGameMessage(

                "This pouch has " + p.getPouches()[i] + " rune essences in it.", false);
    }

    private static final int[] POUCH_SIZE = {3, 6, 9, 12};

    public static void fillPouch(Player p, int i) {
        if (i < 0) return;
        if (LEVEL_REQ[i] > p.getSkills().getLevel(Skills.RUNECRAFTING)) {
            p.getPackets().sendGameMessage(
                    "You need a runecrafting level of " + LEVEL_REQ[i] + " to fill this pouch.", false);
            return;
        }
        int essenceToAdd = POUCH_SIZE[i] - p.getPouches()[i];
        if (essenceToAdd > p.getInventory().getItems().getNumberOf(1436))
            essenceToAdd = p.getInventory().getItems().getNumberOf(1436);
        if (essenceToAdd > POUCH_SIZE[i] - p.getPouches()[i]) essenceToAdd = POUCH_SIZE[i] - p.getPouches()[i];
        if (essenceToAdd > 0) {
            p.getInventory().deleteItem(1436, essenceToAdd);
            p.getPouches()[i] += essenceToAdd;
        }
        if (!p.getInventory().containsOneItem(1436)) {
            p.getPackets().sendGameMessage("You don't have any essence with you.", false);
            return;
        }
        if (essenceToAdd == 0) {
            p.getPackets().sendGameMessage("Your pouch is full.", false);
        }
    }

    public static void emptyPouch(Player p, int i) {
        if (i < 0) return;
        int toAdd = p.getPouches()[i];
        if (toAdd > p.getInventory().getFreeSlots()) toAdd = p.getInventory().getFreeSlots();
        if (toAdd > 0) {
            p.getInventory().addItem(1436, toAdd);
            p.getPouches()[i] -= toAdd;
        }
        if (toAdd == 0) {
            p.getPackets().sendGameMessage("Your pouch has no essence left in it.", false);
        }
    }

    private static final int[] ALTAR_PORTALS = new int[]{2465,2466, 2467, 2468,2469,2470,2471,2474,2472,2473,2475,2477};

    @Override
    public void register() {
        for (RuneCraftingAltar altar : RuneCraftingAltar.values()) {
            registerObjectAction(CLICK_1, (player, object, clickType) -> {
                if (altar.craftRunes(player)) return RETURN;
                return HANDLED;
            }, altar.getAltarId());
            registerObjectAction(CLICK_1, (player, object, clickType) -> {
                altar.enterAltar(player);
                return RETURN;
            }, altar.getEnterIds());
        }
        registerObjectAction(CLICK_1, (player, object, clickType) -> {
            Magic.objectTeleport(player, Settings.START_PLAYER_LOCATION);
            return RETURN;
        }, ALTAR_PORTALS);
    }
}