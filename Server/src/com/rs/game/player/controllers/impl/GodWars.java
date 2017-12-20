package com.rs.game.player.controllers.impl;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.npc.Npc;
import com.rs.game.npc.impl.boss.godwars.GodWarFaction;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.controllers.Controller;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Animation;
import com.rs.game.world.ForceMovement;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.utils.areas.Rectangle;

import static com.rs.game.player.actions.smithing.Smithing.HAMMER;
import static com.rs.utils.Constants.*;

public class GodWars extends Controller {

    private static final int REQUIRED_KC = 20;

    private int zamorakKillCount = 0;
    private int bandosKillCount = 0;
    private int saradominKillCount = 0;
    private int armadylKillCount = 0;

    @Override
    public void start() {
        sendInterfaces();
        player.setAtMultiArea(true);
    }

    public boolean logout() {
        return false;
    }

    public boolean login() {
        sendInterfaces();
        return false;
    }

    @Override
    public void sendInterfaces() {
        player.getInterfaceManager().sendTab(player.getInterfaceManager().hasResizableScreen() ? 9 : 8, getInterface());
        refreshKills();
    }

    private void refreshKills() {
        player.getPackets().sendIComponentText(getInterface(), 8, "" + armadylKillCount);
        player.getPackets().sendIComponentText(getInterface(), 9, "" + bandosKillCount);
        player.getPackets().sendIComponentText(getInterface(), 10, "" + saradominKillCount);
        player.getPackets().sendIComponentText(getInterface(), 11, "" + zamorakKillCount);
    }

    private int getInterface() {
        // zamorak area 599
        // zamorak boss area 598
        return 601;
    }

    @Override
    public boolean processNPCDeath(Npc npc) {
        if (npc instanceof GodWarFaction) {
            switch (((GodWarFaction) npc).getFaction()) {
                case BANDOS_FACTION:
                    bandosKillCount++;
                    break;
                case SARADOMIN_FACTION:
                    saradominKillCount++;
                    break;
                case ZAMORAK_FACTION:
                    zamorakKillCount++;
                    break;
                case ARMADYL_FACTION:
                    armadylKillCount++;
                    break;
            }
            refreshKills();
        }
        return true;
    }

    private void bangDoor() {
        if (!player.getInventory().containsOneItem(HAMMER))
            player.sendMessage("You need a hammer to bang on this door.");
        else if (RequirementsManager.hasRequirement(player, Skills.STRENGTH, 70, "bang on this door")) {
            player.setNextAnimation(new Animation(7002));
            player.addStopDelay(1);
            player.addWalkSteps(player.getX() > 2850 ? 2850 : 2851, 5333, -1, false);
        }
    }

    private void flyCrossbow() {
        if (!RequirementsManager.hasRequirement(player, Skills.RANGE, 70, "to cross here", false)) return;
        if (ItemDefinitions.getItemDefinitions(player.getEquipment().getWeaponId()) == null)
            player.sendMessage("You need to equip a crossbow to cross here");
        else {
            String itemName = ItemDefinitions.getItemDefinitions(player.getEquipment().getWeaponId()).getName()
                    .toLowerCase();
            if (!itemName.contains("crossbow") && !itemName.contains("c'bow")
                || player.getEquipment().getAmmoId() != 9419) {
                player.sendMessage("You need to equip a crossbow and a mithril grapple to cross here");
            } else {
                player.addStopDelay(1);
                player.setNextAnimation(new Animation(7081));
                final WorldTile toTile = new WorldTile(player.getX(),
                        player.getY() > 5273 ? 5269 : 5279, player.getPlane());
                WorldTasksManager.schedule(new WorldTask() {
                    @Override
                    public void run() {
                        WorldTasksManager.schedule(new WorldTask() {
                            @Override
                            public void run() {
                                player.setNextWorldTile(toTile);
                            }
                        }, 1);
                        player.setNextForceMovement(new ForceMovement(toTile, 1,
                                player.getY() > 5273 ? ForceMovement.SOUTH : ForceMovement.NORTH));
                    }
                }, 2);
            }
        }
    }

    private void crossRiver() {
        if (!RequirementsManager.hasRequirement(player, Skills.HITPOINTS, 70, "cross this river")) return;
        Magic.objectTeleport(player, new WorldTile(2885, player.getY() > 5335 ? 5330 : 5346, player.getPlane()));
    }

    private void climbRock() {
        if (!player.getInventory().containsOneItem(954)) {
            player.sendMessage("You need a rope to cross here.");
            return;
        }
        if (RequirementsManager.hasRequirement(player, Skills.AGILITY, 70, "cross here", false)) {
            if (player.getPlane() == 2) Magic.ropeTeleport(player, new WorldTile(2915, 5300, 1));
            else Magic.ropeTeleport(player, new WorldTile(2920, 5274, 0));
        }
    }

    private void enterGraardor() {
        if (player.getX() > 2863) player.sendMessage("You can't open the door from this side.");
        else if (hasKillCount(player, bandosKillCount, "Bandos")) {
            bandosKillCount -= REQUIRED_KC;
            player.addStopDelay(1);
            player.addWalkSteps(2864, 5354, -1, false);
            refreshKills();
        }
    }

    private void enterArmadyl() {
        if (player.getY() > 5295) player.sendMessage("You can't open the door from this side.");
        else if (hasKillCount(player, armadylKillCount, "Armadyl")) {
            armadylKillCount -= REQUIRED_KC;
            player.addStopDelay(1);
            player.addWalkSteps(2839, 5296, -1, false);
            refreshKills();
        }
    }

    private void enterZamorak() {
        if (player.getY() < 5332) player.sendMessage("You can't open the door from this side.");
        else if (hasKillCount(player, zamorakKillCount, "Zamorak")) {
            zamorakKillCount -= REQUIRED_KC;
            player.addStopDelay(1);
            player.addWalkSteps(2925, 5331, -1, false);
            refreshKills();
        }
    }

    private void enterSaradomin() {
        if (player.getX() < 2908) player.sendMessage("You can't open the door from this side.");
        else if (hasKillCount(player, saradominKillCount, "Saradomin")) {
            saradominKillCount -= REQUIRED_KC;
            player.addStopDelay(1);
            player.addWalkSteps(2907, 5265, -1, false);
            refreshKills();
        }
    }

    private boolean hasKillCount(Player player, int kc, String god) {
        if (kc < REQUIRED_KC) player.sendMessage("You need a " + god + " kill count of " + REQUIRED_KC + " to enter.");
        else return true;
        return false;
    }

    @Override
    public boolean processObjectClick1(WorldObject object) {
        switch (object.getId()) {
            case 26384:
                bangDoor();
                break;
            case 26425:
                enterGraardor();
                break;
            case 26303:
                flyCrossbow();
                break;
            case 26426:
                enterArmadyl();
                break;
            case 31845:
                crossRiver();
                break;
            case 26428:
                enterZamorak();
                break;
            case 26444:
            case 26445:
                climbRock();
                break;
            case 26427:
                enterSaradomin();
                break;
        }
        return true;
    }

    @Override
    public void moved() {
        if (!atGodwars(player)) remove();
    }

    @Override
    public boolean sendDeath() {
        remove();
        return true;
    }

    @Override
    public void magicTeleported(int type) {
        remove();
    }

    @Override
    public void forceClose() {
        remove();
    }

    public void remove() {
        player.getPackets().closeInterface(player.getInterfaceManager().hasResizableScreen() ? 9 : 8);
        removeController();
    }

    private static final Rectangle GOD_WARS_AREA = new Rectangle(2942, 5247, 2816, 5375);

    public static boolean atGodwars(WorldTile tile) {
        return GOD_WARS_AREA.contains(tile);
    }

}
