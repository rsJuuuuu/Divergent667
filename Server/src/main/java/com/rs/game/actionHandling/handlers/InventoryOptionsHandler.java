package com.rs.game.actionHandling.handlers;

import com.rs.Settings;
import com.rs.cores.WorldThread;
import com.rs.game.actionHandling.Handler;
import com.rs.game.item.Item;
import com.rs.game.item.ItemRecipes;
import com.rs.game.minigames.*;
import com.rs.game.player.content.skills.summoning.PouchData;
import com.rs.game.player.content.skills.summoning.SpecialAttack;
import com.rs.game.player.Equipment;
import com.rs.game.player.Inventory;
import com.rs.game.player.Player;
import com.rs.game.player.actions.Firemaking;
import com.rs.game.player.actions.Hunter;
import com.rs.game.player.actions.Hunter.HunterEquipment;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.actions.crafting.GemCutting;
import com.rs.game.player.actions.crafting.GemCutting.Gem;
import com.rs.game.player.actions.crafting.LeatherCrafting;
import com.rs.game.player.actions.fletching.Fletching;
import com.rs.game.player.actions.fletching.Fletching.Fletch;
import com.rs.game.player.actions.fletching.GemTipCutting;
import com.rs.game.player.actions.herblore.HerbCleaning;
import com.rs.game.player.actions.herblore.Herblore;
import com.rs.game.player.actions.prayer.Burying;
import com.rs.game.player.content.skills.summoning.Summoning;
import com.rs.game.player.content.Foods;
import com.rs.game.player.content.Pots;
import com.rs.game.player.content.skills.Runecrafting;
import com.rs.game.player.controllers.impl.Barrows;
import com.rs.game.player.info.SkillCapeCustomizer;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.*;
import com.rs.utils.Utils;
import com.rs.utils.stringUtils.TimeUtils;
import org.pmw.tinylog.Logger;

import java.util.List;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.registerInventoryListener;
import static com.rs.utils.Constants.*;

public class InventoryOptionsHandler implements Handler {

    private static void handleItemOption2(final Player player, Item item, int slotId) {
        int itemId = item.getId();
        if (Firemaking.isFiremaking(player, itemId)) return;
        if (itemId >= 5509 && itemId <= 5514) {
            int pouch = -1;
            if (itemId == 5509) pouch = 0;
            if (itemId == 5510) pouch = 1;
            if (itemId == 5512) pouch = 2;
            if (itemId == 5514) pouch = 3;
            Runecrafting.emptyPouch(player, pouch);
            player.stopAll(false);
        } else {
            if (player.isEquipDisabled()) return;
            long passedTime = TimeUtils.getTime() - WorldThread.LAST_CYCLE_CTM;
            WorldTasksManager.schedule(new WorldTask() {
                @Override
                public void run() {
                    List<Integer> slots = player.getSwitchItemCache();
                    int[] slot = new int[slots.size()];
                    for (int i = 0; i < slot.length; i++)
                        slot[i] = slots.get(i);
                    player.getSwitchItemCache().clear();
                    InterfaceHandler.sendWear(player, slot);
                    if (item.getId() != 4153) player.stopAll(false);
                }

            }, com.rs.game.player.actions.combat.SpecialAttack.isInstantSpecialAvailable(itemId) ? 0 :
                    passedTime >= 600 ? 0 : passedTime > 400 ? 1 : 0);
            if (player.getSwitchItemCache().contains(slotId)) return;
            player.getSwitchItemCache().add(slotId);
        }
    }

    private static void handleItemOption1(Player player, Item item, int slotId) {
        int itemId = item.getId();
        long time = TimeUtils.getTime();
        if (player.getStopDelay() >= time || player.getEmotesManager().getNextEmoteEnd() >= time) return;
        player.stopAll(false);

        if (Foods.eat(player, item, slotId)) return;
        if (Burying.bury(player, slotId)) return;

        if (itemId == 21776) {
            if (player.getInventory().numberOf(21776) < 100)
                player.sendMessage("You need 100 shards to make an orb of armadyl");
            else if (player.getInventory().numberOf(21776) == 100 || player.getInventory().getFreeSlots() > 0) {
                player.sendMessage("you make an orb of armadyl.");
                player.getInventory().removeItems(new Item(21776, 100));
                player.getInventory().addItem(21775, 1);
            }
        }

        if (itemId == 15098) {
            DiceGame.rollDice8(player);
            player.setNextAnimation(new Animation(11900));
            player.setNextGraphics(new Graphics(2075));
            return;
        }

        if (itemId == 2714) {
            EasyCasket.searchEasy(player);
            return;
        }
        if (itemId == 2802) {
            MedCasket.searchMed(player);
            return;
        }
        if (itemId == 3521) {
            HardCasket.searchHard(player);
            return;
        }

        if (itemId == 15707) {
            player.setNextGraphics(new Graphics(455));
            player.setFreezeDelay(8);
            Magic.normalTeleport(player, new WorldTile(3447, 3699, 0));
            player.getPackets().sendGameMessage("<col=ff0000>You Arrive at Daemonheim.");
            return;
        }
        if (!player.getControllerManager().handleItemOption1(player, slotId, itemId, item)) return;
        if (Pots.pot(player, item, slotId)) return;
        if (itemId >= 5509 && itemId <= 5514) {
            int pouch = -1;
            if (itemId == 5509) pouch = 0;
            if (itemId == 5510) pouch = 1;
            if (itemId == 5512) pouch = 2;
            if (itemId == 5514) pouch = 3;
            Runecrafting.fillPouch(player, pouch);
            return;
        }

        if (itemId == 299) {
            if (player.getStopDelay() > 0) return;
            if (World.getObject(new WorldTile(player), 10) != null) {
                player.getPackets().sendGameMessage("You cannot plant flowers here..");
                return;
            }
            final Player thePlayer = player;
            final double random = Utils.getRandomDouble(100);
            final WorldTile tile = new WorldTile(player);
            int flower = Utils.random(2980, 2987);
            if (random < 0.2) {
                flower = Utils.random(2987, 2989);
            }
            if (!player.addWalkSteps(player.getX() - 1, player.getY(), 1))
                if (!player.addWalkSteps(player.getX() + 1, player.getY(), 1))
                    if (!player.addWalkSteps(player.getX(), player.getY() + 1, 1))
                        player.addWalkSteps(player.getX(), player.getY() - 1, 1);
            player.getInventory().deleteItem(299, 1);
            final WorldObject flowerObject = new WorldObject(flower, 10, Utils.getRandom(4), tile.getX(), tile.getY()
                    , tile.getPlane());
            World.spawnTemporaryObject(flowerObject, 45000);
            player.setInfiniteStopDelay();
            WorldTasksManager.schedule(new WorldTask() {
                int step;

                @Override
                public void run() {
                    if (thePlayer.hasFinished()) stop();
                    if (step == 1) {
                        thePlayer.getDialogueManager().startDialogue("FlowerPickup", flowerObject);
                        thePlayer.setNextFaceWorldTile(tile);
                        thePlayer.stopAll();
                        stop();
                        player.resetStopDelay();
                    }
                    step++;
                }
            }, 0, 0);

        }

        if (itemId == 952) {// spade
            player.resetWalkSteps();
            if (Barrows.digToBrother(player)) {
                player.getControllerManager().startController("Barrows");
                return;
            }
            player.setNextAnimation(new Animation(830));
            player.getPackets().sendGameMessage("You find nothing.");
            return;
        }
        if (HerbCleaning.clean(player, item, slotId)) return;
        if (Magic.useTabTeleport(player, itemId)) return;
        if (itemId == AncientEffigies.SATED_ANCIENT_EFFIGY || itemId == AncientEffigies.GORGED_ANCIENT_EFFIGY
            || itemId == AncientEffigies.NOURISHED_ANCIENT_EFFIGY || itemId == AncientEffigies.STARVED_ANCIENT_EFFIGY)
            player.getDialogueManager().startDialogue("AncientEffigiesD", itemId);
        else if (itemId == 4155) player.getDialogueManager().startDialogue("EnchantedGemDialogue");
        else if (itemId == 1856) {// Information Book
            player.getInterfaceManager().sendInterface(275);
            player.getPackets().sendIComponentText(275, 2, Settings.SERVER_NAME);
            player.getPackets().sendIComponentText(275, 14, "To be added");
        } else if (itemId == HunterEquipment.BOX.getId()) // almost done
            player.getActionManager().setAction(new Hunter(HunterEquipment.BOX));
        else if (itemId == HunterEquipment.BIRD_SNARE.getId())
            player.getActionManager().setAction(new Hunter(HunterEquipment.BIRD_SNARE));
        if (Settings.DEBUG) Logger.info("Item Select:" + itemId + ", Slot Id:" + slotId);
    }

    /*
     * returns the other
     */
    public static Item contains(int id1, Item item1, Item item2) {
        if (item1.getId() == id1) return item2;
        if (item2.getId() == id1) return item1;
        return null;
    }

    public static boolean contains(int id1, int id2, Item... items) {
        boolean containsId1 = false;
        boolean containsId2 = false;
        for (Item item : items) {
            if (item.getId() == id1) containsId1 = true;
            else if (item.getId() == id2) containsId2 = true;
        }
        return containsId1 && containsId2;
    }

    public static void handleItemOnItem(final Player player, int interfaceId, int interfaceId2, int spellId, int
            itemUsedId, int itemUsedWithId, int toSlot, int fromSlot) {
        if (interfaceId == Inventory.INVENTORY_INTERFACE && (interfaceId2 == MODERN_SPELLBOOK
                                                             || interfaceId2 == ANCIENT_SPELLBOOK
                                                             || interfaceId2 == LUNAR_SPELLBOOK))
            Magic.handleMagicOnItem(player, spellId, itemUsedWithId, interfaceId2);
        if ((interfaceId2 == 747 || interfaceId2 == 662) && interfaceId == Inventory.INVENTORY_INTERFACE) {
            if (player.getFollower() != null) {
                player.getFollower().setSpecial(true);
                if (player.getFollower().getSpecialAttack() == SpecialAttack.ITEM) {
                    if (player.getFollower().hasSpecialOn()) player.getFollower().submitSpecial(toSlot);
                }
            }
            return;
        }
        if (ItemRecipes.checkItemOnItem(player, itemUsedId, itemUsedWithId)) return;
        if (interfaceId == Inventory.INVENTORY_INTERFACE && interfaceId == interfaceId2
            && !player.getInterfaceManager().containsInventoryInter()) {
            if (toSlot >= 28 || fromSlot >= 28) return;
            Item usedWith = player.getInventory().getItem(toSlot);
            Item itemUsed = player.getInventory().getItem(fromSlot);
            if (itemUsed == null || usedWith == null || itemUsed.getId() != itemUsedId
                || usedWith.getId() != itemUsedWithId) return;
            player.stopAll();
            if (!player.getControllerManager().canUseItemOnItem(itemUsed, usedWith)) return;
            Fletch fletch = Fletching.isFletching(usedWith, itemUsed);
            if (fletch != null) {
                player.getDialogueManager().startDialogue("FletchingD", fletch);
                return;
            }
            int[] products = Herblore.getProducts(itemUsed, usedWith);
            if (products != null) {
                player.getDialogueManager().startDialogue("HerbloreD", products, itemUsed, usedWith);
                return;
            }

            GemTipCutting.GemTips tips = GemTipCutting.findTips(itemUsedId, itemUsedWithId);
            if (tips != null) {
                GemTipCutting.cut(player, tips);
                return;
            }

            if (itemUsedId == 15086 && itemUsedWithId == 15086) {
                DiceGame.rollDice2(player);
                player.setNextAnimation(new Animation(11900));
                player.setNextGraphics(new Graphics(2072));
                return;
            }
            if (itemUsedId == 15088 && itemUsedWithId == 15088) {
                DiceGame.rollDice3(player);
                player.setNextAnimation(new Animation(11900));
                player.setNextGraphics(new Graphics(2074));
                return;
            }
            if (itemUsedId == 15090 && itemUsedWithId == 15090) {
                DiceGame.rollDice4(player);
                player.setNextAnimation(new Animation(11900));
                player.setNextGraphics(new Graphics(2071));
                return;
            }
            if (itemUsedId == 15092 && itemUsedWithId == 15092) {
                DiceGame.rollDice5(player);
                player.setNextAnimation(new Animation(11900));
                player.setNextGraphics(new Graphics(2070));
                return;
            }
            if (itemUsedId == 15094 && itemUsedWithId == 15094) {
                DiceGame.rollDice5(player);
                player.setNextAnimation(new Animation(11900));
                player.setNextGraphics(new Graphics(2073));
                return;
            }
            if (itemUsedId == 15096 && itemUsedWithId == 15096) {
                DiceGame.rollDice7(player);
                player.setNextAnimation(new Animation(11900));
                player.setNextGraphics(new Graphics(2068));
                return;
            }
            if (itemUsedId == 15100 && itemUsedWithId == 15100) {
                DiceGame.rollDice1(player);
                player.setNextAnimation(new Animation(11900));
                player.setNextGraphics(new Graphics(2069));
                return;
            }
            if (itemUsedId == 11864 && itemUsedWithId == 11864) {
                player.getInventory().deleteItem(11864, 1);
                player.getInventory().addItem(1065, 1);
                player.getInventory().addItem(1099, 1);
                player.getInventory().addItem(1135, 1);
                return;
            }
            if (itemUsedId == 11866 && itemUsedWithId == 11866) {
                player.getInventory().deleteItem(11866, 1);
                player.getInventory().addItem(2487, 1);
                player.getInventory().addItem(2493, 1);
                player.getInventory().addItem(2499, 1);
                return;
            }
            if (itemUsedId == 11868 && itemUsedWithId == 11868) {
                player.getInventory().deleteItem(11868, 1);
                player.getInventory().addItem(2489, 1);
                player.getInventory().addItem(2495, 1);
                player.getInventory().addItem(2501, 1);
                return;
            }
            if (itemUsedId == 11870 && itemUsedWithId == 11870) {
                player.getInventory().deleteItem(11870, 1);
                player.getInventory().addItem(2491, 1);
                player.getInventory().addItem(2497, 1);
                player.getInventory().addItem(2503, 1);
                return;
            }
            if (itemUsedId == 11872 && itemUsedWithId == 11872) {
                player.getInventory().deleteItem(11872, 1);
                player.getInventory().addItem(4089, 1);
                player.getInventory().addItem(4091, 1);
                player.getInventory().addItem(4093, 1);
                player.getInventory().addItem(4095, 1);
                player.getInventory().addItem(4097, 1);
                return;
            }
            if (itemUsedId == 11962 && itemUsedWithId == 11962) {
                player.getInventory().deleteItem(11962, 1);
                player.getInventory().addItem(4099, 1);
                player.getInventory().addItem(4101, 1);
                player.getInventory().addItem(4103, 1);
                player.getInventory().addItem(4105, 1);
                player.getInventory().addItem(4107, 1);
                return;
            }
            if (itemUsedId == 11960 && itemUsedWithId == 11960) {
                player.getInventory().deleteItem(11960, 1);
                player.getInventory().addItem(4109, 1);
                player.getInventory().addItem(4111, 1);
                player.getInventory().addItem(4113, 1);
                player.getInventory().addItem(4115, 1);
                player.getInventory().addItem(4117, 1);
                return;
            }
            if (itemUsed.getId() == LeatherCrafting.NEEDLE.getId()
                || usedWith.getId() == LeatherCrafting.NEEDLE.getId()) {
                if (LeatherCrafting.handleItemOnItem(player, itemUsed, usedWith)) {
                    return;
                }
            }
            if (Firemaking.isFiremaking(player, itemUsed, usedWith)) return;
            else if (contains(1755, Gem.OPAL.getUncut(), itemUsed, usedWith)) GemCutting.cut(player, Gem.OPAL);
            else if (contains(1755, Gem.JADE.getUncut(), itemUsed, usedWith)) GemCutting.cut(player, Gem.JADE);
            else if (contains(1755, Gem.RED_TOPAZ.getUncut(), itemUsed, usedWith))
                GemCutting.cut(player, Gem.RED_TOPAZ);
            else if (contains(1755, Gem.SAPPHIRE.getUncut(), itemUsed, usedWith)) GemCutting.cut(player, Gem.SAPPHIRE);
            else if (contains(1755, Gem.EMERALD.getUncut(), itemUsed, usedWith)) GemCutting.cut(player, Gem.EMERALD);
            else if (contains(1755, Gem.RUBY.getUncut(), itemUsed, usedWith)) GemCutting.cut(player, Gem.RUBY);
            else if (contains(1755, Gem.DIAMOND.getUncut(), itemUsed, usedWith)) GemCutting.cut(player, Gem.DIAMOND);
            else if (contains(1755, Gem.DRAGONSTONE.getUncut(), itemUsed, usedWith))
                GemCutting.cut(player, Gem.DRAGONSTONE);
            else if (contains(1755, Gem.ONYX.getUncut(), itemUsed, usedWith)) GemCutting.cut(player, Gem.ONYX);
            else player.getPackets().sendGameMessage("Nothing interesting happens.");
            if (Settings.DEBUG) Logger.info("Used:" + itemUsed.getId() + ", With:" + usedWith.getId());
        }
    }

    private static void handleItemOption3(Player player, Item item, int slotId) {
        int itemId = item.getId();
        long time = TimeUtils.getTime();
        if (player.getStopDelay() >= time || player.getEmotesManager().getNextEmoteEnd() >= time) return;
        player.stopAll(false);
        if (itemId == 20767 || itemId == 20769 || itemId == 20771) SkillCapeCustomizer.startCustomizing(player, itemId);
        else if (Equipment.getItemSlot(itemId) == Equipment.SLOT_AURA)
            player.getAuraManager().sendTimeRemaining(itemId);
    }

    private static void handleItemOption4(Player player, Item item, int slotId) {
        System.out.println("Option 4");
    }

    private static void handleItemOption5(Player player, Item item, int slotId) {
        System.out.println("Option 5");
    }

    private static void handleItemOption6(Player player, Item item, int slotId) {
        int itemId = item.getId();
        long time = TimeUtils.getTime();
        if (player.getStopDelay() >= time || player.getEmotesManager().getNextEmoteEnd() >= time) return;
        player.stopAll(false);
        PouchData data = PouchData.forPouchId(item.getId());
        if (data != null) Summoning.spawnFamiliar(player, data);
        else if (itemId <= 1712 && itemId >= 1706 || itemId >= 10354 && itemId <= 10362)
            player.getDialogueManager().startDialogue("Transportation", "Edgeville", new WorldTile(3087, 3496, 0),
                    "Karamja", new WorldTile(2918, 3176, 0), "Draynor Village", new WorldTile(3105, 3251, 0),
                    "Al " + "Kharid", new WorldTile(3293, 3163, 0), slotId);
        else if (itemId == 1704 || itemId == 10352) player.getPackets().sendGameMessage(
                "The amulet has ran out of charges. You need to recharge it if you " + "wish it use it once more.");
        else if (itemId >= 3853 && itemId <= 3867)
            player.getDialogueManager().startDialogue("Transportation", "Burthrope Games Room", new WorldTile(2880,
                    3559, 0), "Barbarian Outpost", new WorldTile(2519, 3571, 0), "Gamers' Grotto", new WorldTile
                    (2970, 9679, 0), "Corporeal Beast", new WorldTile(2886, 4377, 0), slotId);
    }

    private static void handleItemOption7(Player player, Item item, int slotId) {
        int itemId = item.getId();
        long time = System.currentTimeMillis();
        if (player.getStopDelay() >= time || player.getEmotesManager().getNextEmoteEnd() >= time) return;
        player.stopAll(false);
        if (item.getDefinitions().isDestroyItem()) {
            player.getDialogueManager().startDialogue("DestroyItemOption", slotId, item);
            return;
        }
        if (player.getCharges().degradeCompletly(item)) {
            return;
        }
        /*Pet.PetData data = Pet.PetData.forItem(itemId);
        if (data != null) {
            if (player.getPet() != null) {
                player.sendMessage("You already have a pet spawned, please dismiss it to spawn another.");
                return;
            }
            player.setPet(new Pet(player, data, new WorldTile(
                    player.getX() + 1, player.getY() + 1, player.getPlane()), 0, false));
            player.getInventory().deleteItem(slotId, item);
        } else {*/
            player.getInventory().deleteItem(slotId, item);
            World.addGroundItem(item, new WorldTile(player), player, false, 180, true);
            player.getPackets().sendSound(2739, 0, 1);
        //}
    }

    @Override
    public void register() {
        registerInventoryListener((player, item, slotId, buttonId) -> {
            switch (buttonId) {
                case CLICK_1:
                    handleItemOption1(player, item, slotId);
                    break;
                case CLICK_2:
                    handleItemOption2(player, item, slotId);
                    break;
                case CLICK_3:
                    handleItemOption3(player, item, slotId);
                    break;
                case CLICK_4:
                    handleItemOption4(player, item, slotId);
                    break;
                case CLICK_5:
                    handleItemOption5(player, item, slotId);
                    break;
                case CLICK_6:
                    handleItemOption6(player, item, slotId);
                    break;
                case CLICK_7:
                    handleItemOption7(player, item, slotId);
                    break;
                case EXAMINE:
                    player.getInventory().sendExamine(item);
                    break;
                default:
                    Logger.error("Unhandled inventory click: " + buttonId);
                    return DEFAULT;
            }
            return HANDLED;
        });
    }
}