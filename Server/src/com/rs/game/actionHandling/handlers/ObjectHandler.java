package com.rs.game.actionHandling.handlers;

import com.rs.Settings;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.game.actionHandling.HandlerManager;
import com.rs.game.actionHandling.actions.ActionListener;
import com.rs.game.actionHandling.actions.ObjectListener;
import com.rs.game.item.Item;
import com.rs.game.item.ItemRecipes;
import com.rs.game.minigames.CastleWars;
import com.rs.game.player.*;
import com.rs.game.player.actions.Cooking;
import com.rs.game.player.actions.Cooking.Cookables;
import com.rs.game.player.actions.Hunter;
import com.rs.game.player.actions.Hunter.HunterNPC;
import com.rs.game.player.actions.Woodcutting;
import com.rs.game.player.actions.Woodcutting.TreeDefinitions;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.actions.combat.PlayerCombat;
import com.rs.game.player.actions.prayer.BonesOnAltar;
import com.rs.game.player.actions.smithing.Smithing.ForgingBar;
import com.rs.game.player.actions.smithing.Smithing.ForgingInterface;
import com.rs.game.player.content.Pickables;
import com.rs.game.player.content.skills.Thieving;
import com.rs.game.player.content.skills.construction.Furniture;
import com.rs.game.player.content.skills.construction.Rooms;
import com.rs.game.player.content.skills.farming.Seeds;
import com.rs.game.player.content.skills.summoning.Summoning;
import com.rs.game.player.controllers.impl.HouseController;
import com.rs.game.player.controllers.impl.Wilderness;
import com.rs.game.player.quests.QuestHandler;
import com.rs.game.world.*;
import com.rs.io.InputStream;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.utils.Utils;
import com.rs.utils.stringUtils.TimeUtils;
import org.pmw.tinylog.Logger;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.registerObjectAction;
import static com.rs.game.actionHandling.HandlerManager.registerObjectListener;
import static com.rs.game.player.actions.Woodcutting.TreeDefinitions.VINES;

public class ObjectHandler extends ActionHandler<Integer> {

    public static void handleClick(final Player player, int id, int x, int y, WorldPacketsDecoder.Packets packet) {
        final WorldTile tile = new WorldTile(x, y, player.getPlane());
        final int regionId = tile.getRegionId();
        if (!player.getMapRegionsIds().contains(regionId)) return;
        WorldObject mapObject = World.getRegion(regionId).getObject(id, tile);
        if (mapObject == null || mapObject.getId() != id) {
            if (player.isAtDynamicRegion() && World.getRotation(player.getPlane(), x, y) != 0) {
                ObjectDefinitions definitions = ObjectDefinitions.getObjectDefinitions(id);
                if (definitions.getSizeX() > 1 || definitions.getSizeY() > 1) {
                    for (int xs = 0;
                         xs < definitions.getSizeX() + 1 && (mapObject == null || mapObject.getId() != id); xs++) {
                        for (int ys = 0;
                             ys < definitions.getSizeY() + 1 && (mapObject == null || mapObject.getId() != id); ys++) {
                            tile.setLocation(x + xs, y + ys, tile.getPlane());
                            mapObject = World.getRegion(regionId).getObject(id, tile);
                        }
                    }
                }
            }
            if (mapObject == null || mapObject.getId() != id) return;

        }
        final WorldObject object = !player.isAtDynamicRegion() ? mapObject : new WorldObject(id, mapObject.getType(),
                mapObject.getRotation(), x, y, player.getPlane());
        if (player.isAtDynamicRegion()) {
            int rotation = object.getRotation();
            rotation += World.getRotation(player.getPlane(), x, y);
            if (rotation > 3) rotation -= 4;
            object.setRotation(rotation);
        }
        //TODO Come up with something better for this, work around for gnome swing.
        if (id == 43529) {
            player.resetWalkSteps();
            HandlerManager.objectHandler.processClick(player, id, optionForPacket(packet), packet, object);
            return;
        }
        switch (packet) {
            case OBJECT_EXAMINE:
                HandlerManager.objectHandler.processClick(player, id, optionForPacket(packet), packet, object);
                return;
            default:
                player.setRouteEvent(new RouteEvent(object, () -> HandlerManager.objectHandler.processClick(player,
                        id, optionForPacket(packet), packet, object)));
        }

    }

    private static void handleOption1(final Player player, WorldObject object) {
        ObjectDefinitions objectDef = object.getDefinitions();
        player.stopAll();
        player.setNextFaceWorldTile(new WorldTile(object.getCoordFaceX(objectDef.getSizeX(), objectDef.getSizeY(),
                object.getRotation()), object.getCoordFaceY(objectDef.getSizeX(), objectDef.getSizeY(), object
                .getRotation()), object.getPlane()));
        if (!player.getControllerManager().processObjectClick1(object)) return;
        if (CastleWars.handleObjects(player, object.getId())) return;
        HunterNPC hunterNpc = HunterNPC.forObjectId(object.getId());
        if (hunterNpc != null) {
            if (OwnedObjectManager.removeObject(player, object)) {
                player.setNextAnimation(hunterNpc.getEquipment().getPickUpAnimation());
                player.getInventory().addItem(hunterNpc.getItem(), 1);
                player.getInventory().addItem(hunterNpc.getEquipment().getId(), 1);
                player.getSkills().addXp(Skills.HUNTER, hunterNpc.getXp());
                player.setTrapAmount(player.getTrapAmount() - 1);
            } else {
                player.getPackets().sendGameMessage("This isn't your trap.");
            }
            return;
        } else {
            Hunter.HunterEquipment equipment;
            switch (object.getId()) {
                case 19175:
                    equipment = Hunter.HunterEquipment.BIRD_SNARE;
                    break;
                case 19187:
                    equipment = Hunter.HunterEquipment.BOX;
                    break;
                default:
                    equipment = null;
            }
            if (equipment != null) {
                if (OwnedObjectManager.removeObject(player, object)) {
                    player.sendMessage("You dismantle your trap.");
                    player.setNextAnimation(equipment.getPickUpAnimation());
                    player.getInventory().addItem(equipment.getId(), 1);
                    player.getSkills().addXp(Skills.HUNTER, 1);
                    player.setTrapAmount(player.getTrapAmount() - 1);
                    return;
                } else {
                    player.sendMessage("This isn't your trap.");
                    return;
                }
            }
        }
        if (Seeds.PatchGroup.isPatch(object.getId())) {
            player.getFarming().farmingAction(object);
            return;
        }
        if (Wilderness.isDitch(object.getId())) {
            player.getDialogueManager().startDialogue("WildernessDitch", object);
            return;
        }
        int hatId = player.getEquipment().getHatId();
        switch (object.getId()) {
            case 9319:
                if (player.getSkills().getLevel(Skills.AGILITY) >= (player.getPlane() == 0 ? 61 : 71))
                    Magic.ropeTeleport(player, new WorldTile(player.getX(), player.getY(), player.getPlane() + 1));
                else player.sendMessage("You need level " + (player.getPlane() == 0 ? 61 : 71) + "agility to " + "climb"
                                        + " this chain.");
                return;
            case 15478:
                player.startDialogue("POHPortal");
                return;
            case 9320:
                if (player.getSkills().getLevel(Skills.AGILITY) >= (player.getPlane() == 0 ? 61 : 71))
                    Magic.ropeTeleport(player, new WorldTile(player.getX(), player.getY(), player.getPlane() - 1));
                else player.sendMessage("You need level " + (player.getPlane() == 0 ? 61 : 71) + "agility to " + "climb"
                                        + " this chain.");
                return;
            case 36972:
                player.setNextAnimation(new Animation(712));
                player.setNextGraphics(new Graphics(624));
                player.getPackets().sendGameMessage("You pray to the gods");
                player.getInventory().deleteItem(536, 1);
                return;
            case 4158:
                player.setNextWorldTile(new WorldTile(3020, 9850, 0));
                return;
            case 28741:
                player.useStairs(828, new WorldTile(2207, 5346, 0), 1, 2);
                return;
            case 4495:
                player.useStairs(828, new WorldTile(3417, 3541, 2), 1, 2);
                return;
            case 4496:
                player.useStairs(828, new WorldTile(3412, 3541, 1), 1, 2);
                return;

            case 26933:
                player.useStairs(828, new WorldTile(3096, 9867, 0), 1, 2);
                return;
            case 20600:
                player.setNextWorldTile(new WorldTile(3077, 10058, 0));
                return;
            case 1746:
                player.setNextWorldTile(new WorldTile(2619, 9565, 0));
                player.getPackets().sendGameMessage("You fall from The Ladder into a Cavern.");
                return;
            case 42219:
                Magic.normalTeleport(player, new WorldTile(1887, 3178, 0));
                return;
            case 42220:
                Magic.normalTeleport(player, new WorldTile(3082, 3474, 0));
                return;
            case 30888:
                Magic.normalTeleport(player, new WorldTile(3068, 3860, 0));
                return;
            case 5276:
            case 42377:
            case 42378:
            case 42217:
            case 782:
            case 34752:
            case 4369:
                player.getDialogueManager().startDialogue("Banker", 553);
                return;
            case 9293:
                if (player.getSkills().getLevel(Skills.AGILITY) < 70) {
                    player.getPackets().sendGameMessage(
                            "You need an agility level of 70 to use this " + "obstacle" + ".", true);
                    return;
                }
                return;
            case 38811:
                if (object.getX() == 2971 && object.getY() == 4382 && object.getPlane() == 2)
                    player.getInterfaceManager().sendInterface(650);
                else if (object.getX() == 2918 && object.getY() == 4382 && object.getPlane() == 2) {
                    player.stopAll();
                    player.setNextWorldTile(new WorldTile(
                            player.getX() == 2921 ? 2917 : 2921, player.getY(), player.getPlane()));
                }
                return;
            case 37928:
                if (object.getX() == 2883 && object.getY() == 4370 && object.getPlane() == 0) {
                    player.stopAll();
                    player.setNextWorldTile(new WorldTile(3214, 3782, 0));
                    player.getControllerManager().startController("Wilderness");
                }
                return;
            case 18342:
                player.setNextWorldTile(new WorldTile(3071, 3651, 0));
                return;
            case 18341:
                player.setNextWorldTile(new WorldTile(3039, 3765, 0));
                return;
            case 20599:
                player.setNextWorldTile(new WorldTile(3037, 10171, 0));
                return;
            case 38815:
                if (object.getX() == 3209 && object.getY() == 3780 && object.getPlane() == 0) {
                    if (player.getSkills().getLevelForXp(Skills.WOODCUTTING) < 37
                        || player.getSkills().getLevelForXp(Skills.MINING) < 45
                        || player.getSkills().getLevelForXp(Skills.SUMMONING) < 23
                        || player.getSkills().getLevelForXp(Skills.FIREMAKING) < 47
                        || player.getSkills().getLevelForXp(Skills.PRAYER) < 55) {
                        player.getPackets().sendGameMessage("You need 23 Summoning, 37 Woodcutting, 45 " + "Mining, 47 "
                                                            + "Firemaking and 55 prayer to enter " + "this dungeon.");
                        return;
                    }
                    player.stopAll();
                    player.setNextWorldTile(new WorldTile(2885, 4372, 2));
                    player.getControllerManager().forceStop();
                }
                return;
            case 9369:
                player.getControllerManager().startController("FightPits");
                return;
            case 50205:
            case 28716:
                Summoning.sendInterface(player);
                return;
            case 1817:
                if (object.getX() == 2273 && object.getY() == 4680) // kbd lever
                    Magic.leverTeleport(player, new WorldTile(3067, 10254, 0));
                return;
            case 1816:
                if (object.getX() == 3067 && object.getY() == 10252)  // kbd out lever
                    Magic.leverTeleport(player, new WorldTile(2273, 4681, 0));
                return;
            case 9356:
                player.startDialogue("JadEnter");
                return;
            case 28779:
                player.startDialogue("BorkEnter");
                return;
            case 32015:
                if (object.getX() == 3069 && object.getY() == 10256) { // kbd stairs
                    player.useStairs(828, new WorldTile(3017, 3848, 0), 1, 2);
                    player.getControllerManager().startController("Wilderness");
                }
                return;
            case 25339:
                player.useStairs(828, new WorldTile(1778, 5346, 1), 1, 2);
                return;
            case 29355:
                player.useStairs(828, new WorldTile(3087, 3571, 0), 1, 2);
                return;
            case 28892:
                player.useStairs(828, new WorldTile(3293, 5480, 0), 1, 2);
                return;
            case 29358:
                player.useStairs(828, new WorldTile(3089, 9971, 0), 1, 2);
                return;
            case 28893:
                player.useStairs(828, new WorldTile(3248, 5490, 0), 1, 2);
                return;
            case 28714:
                player.useStairs(828, new WorldTile(3089, 3488, 0), 1, 2);
                return;
            case 28891:
                player.useStairs(828, new WorldTile(3183, 5470, 0), 1, 2);
                return;
            case 28782:
                player.useStairs(828, new WorldTile(3059, 3549, 0), 1, 2);
                return;
            case 25340:
                player.useStairs(828, new WorldTile(1778, 5346, 0), 1, 2);
                return;
            case 47231:
                player.useStairs(828, new WorldTile(1735, 5313, 1), 1, 2);
                return;
            case 47232:
                player.useStairs(828, new WorldTile(1660, 5257, 0), 1, 2);
                return;
            case 25336:
                player.useStairs(828, new WorldTile(1768, 5366, 1), 1, 2);
                return;
            case 39468:
                player.useStairs(828, new WorldTile(1745, 5325, 0), 1, 2);
                return;
            case 25337:
                player.useStairs(828, new WorldTile(1744, 5321, 1), 1, 2);
                return;
            case 1765:
                if (object.getX() == 3017 && object.getY() == 3849) {
                    player.stopAll();
                    player.setNextWorldTile(new WorldTile(3069, 10255, 0));
                    player.getControllerManager().forceStop();
                }
                return;
            case 5959:
                Magic.leverTeleport(player, new WorldTile(2539, 4712, 0));
                return;
            case 1814:
                Magic.leverTeleport(player, new WorldTile(3153, 3923, 0));
                return;
            case 1815:
                Magic.leverTeleport(player, Settings.START_PLAYER_LOCATION);
                return;
            case 5960:
                Magic.leverTeleport(player, new WorldTile(3090, 3956, 0));
                return;
        }

        switch (objectDef.name.toLowerCase()) {
            case "web":
                if (objectDef.containsOption(0, "Slash")) {
                    player.setNextAnimation(new Animation(PlayerCombat.getWeaponAttackEmote(player.getEquipment()
                            .getWeaponId(), player.getCombatDefinitions().getAttackStyle())));
                    slashWeb(player, object);
                }
                return;
            case "bank booth":
                if (objectDef.containsOption(0, "Use")) player.getBank().openBank();
                return;
            case "bank chest":
                if (objectDef.containsOption(0, "Use")) player.getBank().openBank();
            case "bank deposit box":
                if (objectDef.containsOption(0, "Deposit")) player.getBank().openDepositBox();
                return;
            case "bank":
            case "shantay chest":
                player.getBank().openBank();
                return;
            // Woodcutting start
            case "tree":
                if (objectDef.containsOption(0, "Chop down"))
                    player.getActionManager().setAction(new Woodcutting(object, TreeDefinitions.NORMAL));
                return;
            case "dead tree":
                if (objectDef.containsOption(0, "Chop down"))
                    player.getActionManager().setAction(new Woodcutting(object, TreeDefinitions.DEAD));
                return;
            case "oak":
                if (objectDef.containsOption(0, "Chop down"))
                    player.getActionManager().setAction(new Woodcutting(object, TreeDefinitions.OAK));
                return;
            case "willow":
                if (objectDef.containsOption(0, "Chop down"))
                    player.getActionManager().setAction(new Woodcutting(object, TreeDefinitions.WILLOW));
                return;
            case "maple tree":
                if (objectDef.containsOption(0, "Chop down"))
                    player.getActionManager().setAction(new Woodcutting(object, TreeDefinitions.MAPLE));
                return;
            case "ivy":
                if (objectDef.containsOption(0, "Chop"))
                    player.getActionManager().setAction(new Woodcutting(object, TreeDefinitions.IVY));
                return;
            case "yew":
                if (objectDef.containsOption(0, "Chop down"))
                    player.getActionManager().setAction(new Woodcutting(object, TreeDefinitions.YEW));
                return;
            case "magic tree":
                if (objectDef.containsOption(0, "Chop down"))
                    player.getActionManager().setAction(new Woodcutting(object, TreeDefinitions.MAGIC));
                return;
            case "cursed magic tree":
                if (objectDef.containsOption(0, "Chop down"))
                    player.getActionManager().setAction(new Woodcutting(object, TreeDefinitions.CURSED_MAGIC));
                return;
            // Woodcutting end
            case "small obelisk":
                if (objectDef.containsOption(0, "Renew-points")) player.getSkills().renewSummoning();
                return;
            case "gate":
            case "large door":
            case "metal door":
                if (object.getType() == 0 && objectDef.containsOption(0, "Open")) handleGate(player, object);
                return;
            case "door":
                if (object.getType() == 0 && (objectDef.containsOption(0, "Open")
                                              || objectDef.containsOption(0, "Unlock"))) handleDoor(player, object);
                return;
            case "ladder":
                handleLadder(player, object, 1);
                return;
            case "staircase":
                handleStaircases(player, object, 1);
                return;
            case "altar":
                if (objectDef.containsOption(0, "Pray-at") || objectDef.containsOption(0, "Pray"))
                    Prayer.useAltar(player);
                return;
            case "bandos altar":
            case "saradomin altar":
            case "zamorak altar":
            case "armadyl altar":
                if (player.canGwdAltar()) {
                    if (player.getAttackedByDelay() + 10000 > TimeUtils.getTime()) {
                        player.sendMessage("You can't do that in combat.");
                        return;
                    }
                    player.useGwdAltar();
                } else {
                    player.sendMessage("You can only use this altar once every 10 minutes.");
                }
                return;
            default:
                break;
        }
    }

    private static void slashWeb(Player player, WorldObject object) {
        if (Utils.getRandom(1) == 0) {
            World.spawnTemporaryObject(new WorldObject(object.getId()
                                                       + 1, object.getType(), object.getRotation(), object.getX(),
                    object.getY(), object.getPlane()), 60000, true);
            player.getPackets().sendGameMessage("You slash through the web!");
        } else player.getPackets().sendGameMessage("You fail to cut through the web.");
    }

    private static void handleOption2(final Player player, WorldObject object) {
        ObjectDefinitions objectDef = object.getDefinitions();
        player.stopAll();
        player.setNextFaceWorldTile(new WorldTile(object.getCoordFaceX(objectDef.getSizeX(), objectDef.getSizeY(),
                object.getRotation()), object.getCoordFaceY(objectDef.getSizeX(), objectDef.getSizeY(), object
                .getRotation()), object.getPlane()));
        if (!player.getControllerManager().processObjectClick2(object)) return;
        switch (object.getId()) {
            case 36786:
            case 42378:
            case 42377:
            case 42217:
            case 27663:
                player.getBank().openBank();
                return;
            case 34384:
            case 34383:
            case 14011:
            case 7053:
            case 34387:
            case 34386:
            case 34385:
                Thieving.handleStalls(player, object);
        }
        switch (objectDef.name.toLowerCase()) {
            case "furnace":
                player.startDialogue("SmeltingD", object);
                return;
            case "spinning wheel":
                player.startDialogue("SpinningD");
                return;
        }
        if (Pickables.handlePickable(player, object)) return;
        if (Seeds.PatchGroup.isPatch(object.getId())) player.getFarming().inspectPatch(object);
        else {
            switch (objectDef.name.toLowerCase()) {
                case "gate":
                case "metal door":
                    if (object.getType() == 0 && objectDef.containsOption(1, "Open")) handleGate(player, object);
                    break;
                case "door":
                    if (object.getType() == 0 && objectDef.containsOption(1, "Open")) handleDoor(player, object);
                    break;
                case "bank":
                case "bank chest":
                case "bank booth":
                case "counter":
                    if (objectDef.containsOption(1, "Bank")) player.getBank().openBank();
                    break;
                case "bandos altar":
                case "saradomin altar":
                case "zamorak altar":
                case "armadyl altar":
                    Magic.normalTeleport(player, Settings.START_PLAYER_LOCATION);
                    break;
                case "ladder":
                    handleLadder(player, object, 2);
                    break;
                case "staircase":
                    handleStaircases(player, object, 2);
                    break;
                default:
                    break;
            }
        }
    }

    private static void handleExamine(final Player player, WorldObject object) {
        player.getPackets().sendGameMessage("It's an " + object.getDefinitions().name + ". ");
        player.examinedObject = object;
        if (Settings.DEBUG) Logger.info("Examined " + object.toString());
        if (player.debug) player.sendMessage("Examined " + object.toString());
    }

    private static void handleOption3(final Player player, WorldObject object) {
        ObjectDefinitions objectDef = object.getDefinitions();
        player.stopAll();
        player.setNextFaceWorldTile(new WorldTile(object.getCoordFaceX(objectDef.getSizeX(), objectDef.getSizeY(),
                object.getRotation()), object.getCoordFaceY(objectDef.getSizeX(), objectDef.getSizeY(), object
                .getRotation()), object.getPlane()));
        if (!player.getControllerManager().processObjectClick3(object)) return;
        player.setNextFaceWorldTile(object);
        switch (objectDef.name.toLowerCase()) {
            case "gate":
            case "metal door":
                if (object.getType() == 0 && objectDef.containsOption(2, "Open")) handleGate(player, object);
                break;
            case "door":
                if (object.getType() == 0 && objectDef.containsOption(2, "Open")) handleDoor(player, object);
                break;
            case "ladder":
                handleLadder(player, object, 3);
                break;
            case "staircase":
                handleStaircases(player, object, 3);
                break;
            default:
                break;
        }
    }

    private static void handleOption5(final Player player, WorldObject object) {
        ObjectDefinitions objectDef = object.getDefinitions();
        player.stopAll();
        player.setNextFaceWorldTile(new WorldTile(object.getCoordFaceX(objectDef.getSizeX(), objectDef.getSizeY(),
                object.getRotation()), object.getCoordFaceY(objectDef.getSizeX(), objectDef.getSizeY(), object
                .getRotation()), object.getPlane()));
        if (!player.getControllerManager().processObjectClick5(object)) return;
        if (player.getControllerManager().getController() != null
            && player.getControllerManager().getController() instanceof HouseController) {
            if (objectDef.containsOption("build")) if (Furniture.isFurniture(player, object)) return;
            if (objectDef.containsOption("remove")) player.getHouse().removeObject(object);
            if (objectDef.name.equalsIgnoreCase("Door hotspot")) Rooms.openRoomCreationMenu(player, object);
        }

    }

    private static boolean handleGate(Player player, WorldObject object) {
        if (World.isSpawnedObject(object)) return false;
        if (object.getRotation() == 0) {

            boolean south = true;
            WorldObject otherDoor = World.getObject(new WorldTile(object.getX(),
                    object.getY() + 1, object.getPlane()), object.getType());
            if (otherDoor == null || otherDoor.getRotation() != object.getRotation()
                || otherDoor.getType() != object.getType()
                || !otherDoor.getDefinitions().name.equalsIgnoreCase(object.getDefinitions().name)) {
                otherDoor = World.getObject(new WorldTile(object.getX(),
                        object.getY() - 1, object.getPlane()), object.getType());
                if (otherDoor == null || otherDoor.getRotation() != object.getRotation()
                    || otherDoor.getType() != object.getType()
                    || !otherDoor.getDefinitions().name.equalsIgnoreCase(object.getDefinitions().name)) return false;
                south = false;
            }
            WorldObject openedDoor1 = new WorldObject(object.getId(), object.getType(),
                    object.getRotation() + 1, object.getX(), object.getY(), object.getPlane());
            WorldObject openedDoor2 = new WorldObject(otherDoor.getId(), otherDoor.getType(),
                    otherDoor.getRotation() + 1, otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
            if (south) {
                openedDoor1.moveLocation(-1, 0, 0);
                openedDoor1.setRotation(3);
                openedDoor2.moveLocation(-1, 0, 0);
            } else {
                openedDoor1.moveLocation(-1, 0, 0);
                openedDoor2.moveLocation(-1, 0, 0);
                openedDoor2.setRotation(3);
            }

            if (World.removeTemporaryObject(object, 60000, true)
                && World.removeTemporaryObject(otherDoor, 60000, true)) {
                player.faceObject(openedDoor1);
                World.spawnTemporaryObject(openedDoor1, 60000, true);
                World.spawnTemporaryObject(openedDoor2, 60000, true);
                return true;
            }
        } else if (object.getRotation() == 2) {

            boolean south = true;
            WorldObject otherDoor = World.getObject(new WorldTile(object.getX(),
                    object.getY() + 1, object.getPlane()), object.getType());
            if (otherDoor == null || otherDoor.getRotation() != object.getRotation()
                || otherDoor.getType() != object.getType()
                || !otherDoor.getDefinitions().name.equalsIgnoreCase(object.getDefinitions().name)) {
                otherDoor = World.getObject(new WorldTile(object.getX(),
                        object.getY() - 1, object.getPlane()), object.getType());
                if (otherDoor == null || otherDoor.getRotation() != object.getRotation()
                    || otherDoor.getType() != object.getType()
                    || !otherDoor.getDefinitions().name.equalsIgnoreCase(object.getDefinitions().name)) return false;
                south = false;
            }
            WorldObject openedDoor1 = new WorldObject(object.getId(), object.getType(),
                    object.getRotation() + 1, object.getX(), object.getY(), object.getPlane());
            WorldObject openedDoor2 = new WorldObject(otherDoor.getId(), otherDoor.getType(),
                    otherDoor.getRotation() + 1, otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
            if (south) {
                openedDoor1.moveLocation(1, 0, 0);
                openedDoor2.setRotation(1);
                openedDoor2.moveLocation(1, 0, 0);
            } else {
                openedDoor1.moveLocation(1, 0, 0);
                openedDoor1.setRotation(1);
                openedDoor2.moveLocation(1, 0, 0);
            }
            if (World.removeTemporaryObject(object, 60000, true)
                && World.removeTemporaryObject(otherDoor, 60000, true)) {
                player.faceObject(openedDoor1);
                World.spawnTemporaryObject(openedDoor1, 60000, true);
                World.spawnTemporaryObject(openedDoor2, 60000, true);
                return true;
            }
        } else if (object.getRotation() == 3) {

            boolean right = true;
            WorldObject otherDoor = World.getObject(new WorldTile(
                    object.getX() - 1, object.getY(), object.getPlane()), object.getType());
            if (otherDoor == null || otherDoor.getRotation() != object.getRotation()
                || otherDoor.getType() != object.getType()
                || !otherDoor.getDefinitions().name.equalsIgnoreCase(object.getDefinitions().name)) {
                otherDoor = World.getObject(new WorldTile(
                        object.getX() + 1, object.getY(), object.getPlane()), object.getType());
                if (otherDoor == null || otherDoor.getRotation() != object.getRotation()
                    || otherDoor.getType() != object.getType()
                    || !otherDoor.getDefinitions().name.equalsIgnoreCase(object.getDefinitions().name)) return false;
                right = false;
            }
            WorldObject openedDoor1 = new WorldObject(object.getId(), object.getType(),
                    object.getRotation() + 1, object.getX(), object.getY(), object.getPlane());
            WorldObject openedDoor2 = new WorldObject(otherDoor.getId(), otherDoor.getType(),
                    otherDoor.getRotation() + 1, otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
            if (right) {
                openedDoor1.moveLocation(0, -1, 0);
                openedDoor2.setRotation(0);
                openedDoor1.setRotation(2);
                openedDoor2.moveLocation(0, -1, 0);
            } else {
                openedDoor1.moveLocation(0, -1, 0);
                openedDoor1.setRotation(0);
                openedDoor2.setRotation(2);
                openedDoor2.moveLocation(0, -1, 0);
            }
            if (World.removeTemporaryObject(object, 60000, true)
                && World.removeTemporaryObject(otherDoor, 60000, true)) {
                player.faceObject(openedDoor1);
                World.spawnTemporaryObject(openedDoor1, 60000, true);
                World.spawnTemporaryObject(openedDoor2, 60000, true);
                return true;
            }
        } else if (object.getRotation() == 1) {

            boolean right = true;
            WorldObject otherDoor = World.getObject(new WorldTile(
                    object.getX() - 1, object.getY(), object.getPlane()), object.getType());
            if (otherDoor == null || otherDoor.getRotation() != object.getRotation()
                || otherDoor.getType() != object.getType()
                || !otherDoor.getDefinitions().name.equalsIgnoreCase(object.getDefinitions().name)) {
                otherDoor = World.getObject(new WorldTile(
                        object.getX() + 1, object.getY(), object.getPlane()), object.getType());
                if (otherDoor == null || otherDoor.getRotation() != object.getRotation()
                    || otherDoor.getType() != object.getType()
                    || !otherDoor.getDefinitions().name.equalsIgnoreCase(object.getDefinitions().name)) return false;
                right = false;
            }
            WorldObject openedDoor1 = new WorldObject(object.getId(), object.getType(),
                    object.getRotation() + 1, object.getX(), object.getY(), object.getPlane());
            WorldObject openedDoor2 = new WorldObject(otherDoor.getId(), otherDoor.getType(),
                    otherDoor.getRotation() + 1, otherDoor.getX(), otherDoor.getY(), otherDoor.getPlane());
            if (right) {
                openedDoor1.moveLocation(0, 1, 0);
                openedDoor1.setRotation(0);
                openedDoor2.moveLocation(0, 1, 0);
            } else {
                openedDoor1.moveLocation(0, 1, 0);
                openedDoor2.setRotation(0);
                openedDoor2.moveLocation(0, 1, 0);
            }
            if (World.removeTemporaryObject(object, 60000, true)
                && World.removeTemporaryObject(otherDoor, 60000, true)) {
                player.faceObject(openedDoor1);
                World.spawnTemporaryObject(openedDoor1, 60000, true);
                World.spawnTemporaryObject(openedDoor2, 60000, true);
                return true;
            }
        }
        return false;
    }

    private static boolean handleDoor(Player player, WorldObject object) {
        if (World.isSpawnedObject(object)) return false;
        WorldObject openedDoor = new WorldObject(object.getId(), object.getType(),
                object.getRotation() + 1, object.getX(), object.getY(), object.getPlane());
        if (object.getRotation() == 0) openedDoor.moveLocation(-1, 0, 0);
        else if (object.getRotation() == 1) openedDoor.moveLocation(0, 1, 0);
        else if (object.getRotation() == 2) openedDoor.moveLocation(1, 0, 0);
        else if (object.getRotation() == 3) openedDoor.moveLocation(0, -1, 0);
        if (World.removeTemporaryObject(object, 60000, true)) {
            player.faceObject(openedDoor);
            World.spawnTemporaryObject(openedDoor, 60000, true);
            return true;
        }
        return false;
    }

    private static boolean handleStaircases(Player player, WorldObject object, int optionId) {
        String option = object.getDefinitions().getOption(optionId);
        if (option.equalsIgnoreCase("Climb-up")) {
            if (player.getPlane() == 3) return false;
            player.useStairs(-1, new WorldTile(player.getX(), player.getY(), player.getPlane() + 1), 0, 1);
        } else if (option.equalsIgnoreCase("Climb-down")) {
            if (player.getPlane() == 0) return false;
            player.useStairs(-1, new WorldTile(player.getX(), player.getY(), player.getPlane() - 1), 0, 1);
        } else if (option.equalsIgnoreCase("Climb")) {
            if (player.getPlane() == 3 || player.getPlane() == 0) return false;
            player.getDialogueManager().startDialogue("ClimbNoEmoteStairs", new WorldTile(player.getX(), player.getY(),
                    player.getPlane() + 1), new WorldTile(player.getX(), player.getY(),
                    player.getPlane() - 1), "Go up the stairs.", "Go down the stairs.");
        } else return false;
        return false;
    }

    private static boolean handleLadder(Player player, WorldObject object, int optionId) {
        String option = object.getDefinitions().getOption(optionId);
        if (option.equalsIgnoreCase("Climb-up")) {
            if (player.getPlane() == 3) return false;
            player.useStairs(828, new WorldTile(player.getX(), player.getY(), player.getPlane() + 1), 1, 2);
        } else if (option.equalsIgnoreCase("Climb-down")) {
            if (player.getPlane() == 0) return false;
            player.useStairs(828, new WorldTile(player.getX(), player.getY(), player.getPlane() - 1), 1, 2);
        } else if (option.equalsIgnoreCase("Climb")) {
            if (player.getPlane() == 3 || player.getPlane() == 0) return false;
            player.getDialogueManager().startDialogue("ClimbEmoteStairs", new WorldTile(player.getX(), player.getY(),
                    player.getPlane() + 1), new WorldTile(player.getX(), player.getY(),
                    player.getPlane() - 1), "Climb up the ladder.", "Climb down the ladder.", 828);
        } else return false;
        return true;
    }

    public static void handleItemOnObject(final Player player, InputStream stream) {
        if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead()) return;
        long currentTime = TimeUtils.getTime();
        if (player.hasStopDelay() || player.getEmotesManager().getNextEmoteEnd() >= currentTime) return;

        stream.readUnsignedByteC();
        final int y = stream.readUnsignedShortLE();
        final int itemSlot = stream.readUnsignedShortLE();
        final int interfaceHash = stream.readIntLE();
        final int interfaceId = interfaceHash >> 16;
        final int itemId = stream.readUnsignedShortLE128();
        final int x = stream.readUnsignedShortLE();
        final int id = stream.readInt();
        final WorldTile tile = new WorldTile(x, y, player.getPlane());
        int regionId = tile.getRegionId();
        if (!player.getMapRegionsIds().contains(regionId)) return;
        WorldObject mapObject = World.getRegion(regionId).getObject(id, tile);
        if (mapObject == null || mapObject.getId() != id) return;
        final WorldObject object = !player.isAtDynamicRegion() ? mapObject : new WorldObject(id, mapObject.getType(),
                mapObject.getRotation(), x, y, player.getPlane());
        final Item item = player.getInventory().getItem(itemSlot);
        if (player.isDead() || Utils.getInterfaceDefinitionsSize() <= interfaceId) return;
        if (player.getStopDelay() > TimeUtils.getTime()) return;
        if (!player.getInterfaceManager().containsInterface(interfaceId)) return;
        if (item == null || item.getId() != itemId) return;
        player.stopAll(false); // false
        final ObjectDefinitions objectDef = object.getDefinitions();

        player.setRouteEvent(new RouteEvent(object, () -> {
            player.setNextFaceWorldTile(new WorldTile(object.getCoordFaceX(objectDef.getSizeX(), objectDef.getSizeY()
                    , object.getRotation()), object.getCoordFaceY(objectDef.getSizeX(), objectDef.getSizeY(), object
                    .getRotation()), object.getPlane()));
            if (interfaceId == Inventory.INVENTORY_INTERFACE) { // inventory
                if (ItemRecipes.checkObjectUse(player, itemId, object.getId())) return;

                if (BonesOnAltar.useBone(player, itemId, id)) return;
                if (QuestHandler.handleItemOnObject(player, itemId, id)) return;
                if (object.getDefinitions().name.equals("Anvil")) {
                    player.getTemporaryAttributes().put("itemUsed", itemId);
                    ForgingBar bar = ForgingBar.forId(itemId);
                    if (bar != null) ForgingInterface.sendSmithingInterface(player);
                } else if (object.getId() == 733 || object.getId() == 64729) {
                    player.setNextAnimation(new Animation(PlayerCombat.getWeaponAttackEmote(-1, 0)));
                    slashWeb(player, object);
                } else if (Seeds.PatchGroup.isPatch(object.getId())) player.getFarming().handleSeed(itemId, object);
                else if (objectDef.name.toLowerCase().contains("range")
                         || objectDef.name.toLowerCase().contains("stove") || id == 2732) {
                    Cookables cook = Cooking.isCookingSkill(item);
                    if (cook != null) {
                        player.getDialogueManager().startDialogue("CookingD", cook, object);
                    }
                } else {
                    player.getPackets().sendGameMessage("Nothing interesting happens.");
                    if (Settings.DEBUG) System.out.println("item on object: " + id);
                }

            }
        }));
    }

    @Override
    public int executeClick(Player player, WorldPacketsDecoder.Packets packet, ActionListener action, Object...
            params) {
        WorldObject object = (WorldObject) params[0];
        return ((ObjectListener) action).execute(player, object, optionForPacket(packet));
    }

    @Override
    public void init() {
        registerObjectAction(CLICK_1, (player, object, clickType) -> {
            player.startDialogue("SwapPrayersAndSpells");
            return RETURN;
        }, 33427);
        registerObjectListener(CLICK_1, (player, object, clickType) -> {
            handleOption1(player, object);
            return HANDLED;
        });
        registerObjectListener(CLICK_2, (player, object, clickType) -> {
            handleOption2(player, object);
            return HANDLED;
        });
        registerObjectListener(CLICK_3, (player, object, clickType) -> {
            handleOption3(player, object);
            return HANDLED;
        });
        registerObjectListener(CLICK_5, (player, object, clickType) -> {
            handleOption5(player, object);
            return HANDLED;
        });
        registerObjectListener(EXAMINE, (player, object, clickType) -> {
            handleExamine(player, object);
            return HANDLED;
        });

        registerObjectListener(CLICK_1, (player, object, clickType) -> {
            if (object.getDefinitions().name.equalsIgnoreCase("vines")) {
                player.getActionManager().setAction(new Woodcutting(object, VINES));
                return RETURN;
            }
            return DEFAULT;
        });

    }

    @Override
    boolean isGlobalKey(Integer key) {
        return key < 0;
    }
}