package com.rs.game.actionHandling.handlers;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.actionHandling.HandlerManager;
import com.rs.game.actionHandling.actions.ActionListener;
import com.rs.game.actionHandling.actions.InterfaceListener;
import com.rs.game.item.Item;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Equipment;
import com.rs.game.player.Player;
import com.rs.game.player.actions.Rest;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.actions.smithing.Smithing.ForgingInterface;
import com.rs.game.player.content.shops.Shop;
import com.rs.game.player.content.skills.Runecrafting;
import com.rs.game.player.content.skills.summoning.SpecialAttack;
import com.rs.game.player.content.skills.summoning.Summoning;
import com.rs.game.player.controllers.impl.DuelController;
import com.rs.game.player.dialogues.SkillsDialogue;
import com.rs.game.player.info.PlayerLook;
import com.rs.game.player.info.RanksManager;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.player.info.SkillCapeCustomizer;
import com.rs.game.world.WorldTile;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.utils.game.itemUtils.ItemExamines;
import com.rs.utils.game.itemUtils.PriceUtils;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.HashMap;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.registerInterfaceListener;
import static com.rs.utils.Constants.BonusType.*;

public class InterfaceHandler extends ActionHandler<Integer> {

    /**
     * Holds data for the interface action for easier managing
     */
    private static class InterfaceAction {
        int interfaceId;
        int componentId;
        int slotId;
        int slotId2;

        InterfaceAction(int interfaceId, int componentId, int slotId, int slotId2) {
            this.interfaceId = interfaceId;
            this.componentId = componentId;
            this.slotId = slotId;
            this.slotId2 = slotId2;
        }

        @Override
        public String toString() {
            return "InterfaceAction{" + "interfaceId=" + interfaceId + ", componentId=" + componentId + ", slotId="
                   + slotId + ", slotId2=" + slotId2 + '}';
        }
    }

    public void init() {
        registerInterfaceListener((player, componentId, slotId, slotId2, buttonId, interfaceId) -> handleButtons
                (player, interfaceId, componentId, slotId, slotId2, buttonId));
    }

    @Override
    boolean isGlobalKey(Integer key) {
        return key < 0;
    }

    public static void handleClick(final Player player, int interfaceId, int componentId, int slotId, int slotId2,
                                   WorldPacketsDecoder.Packets packet) {
        HandlerManager.interfaceHandler.processClick(player, interfaceId, optionForPacket(packet), packet, new
                InterfaceAction(interfaceId, componentId, slotId, slotId2));
    }

    @Override
    public int executeClick(Player player, WorldPacketsDecoder.Packets packet, ActionListener action, Object...
            params) {
        InterfaceAction interAction = (InterfaceAction) params[0];
        int componentId = interAction.componentId;
        int slotId = interAction.slotId;
        int slotId2 = interAction.slotId2;
        int interfaceId = interAction.interfaceId;
        return ((InterfaceListener) action).execute(player, componentId, slotId, slotId2, optionForPacket(packet),
                interfaceId);
    }

    public void openWorldMap(Player player) {
        if (player.getInterfaceManager().containsScreenInter()
            || player.getInterfaceManager().containsInventoryInter()) {
            player.getPackets().sendGameMessage("Please finish what you're doing before opening the world map.");
            return;
        }
        player.getPackets().sendWindowsPane(755, 0);
        int posHash = player.getX() << 14 | player.getY();
        player.getPackets().sendGlobalConfig(622, posHash);
        player.getPackets().sendGlobalConfig(674, posHash);
    }

    private static void handleButton1(final Player player, int interfaceId, int componentId, int slotId, int slotId2) {
        switch (interfaceId) {
            case 336:
                player.getTrade().addItem(player, slotId, 1);
                break;
            case 335:
                if (componentId == 34) player.getPackets().sendGameMessage(
                        "A " + (new Item(slotId2, 1)).getDefinitions().getName().toLowerCase() + "'s value is "
                        + PriceUtils.getPrice(slotId2) + " gold.");
                if (componentId == 31) player.getTrade().removeItem(player, slotId, 1);

                if (componentId == 18 || componentId == 12) {
                    player.getTrade().tradeFailed();
                } else if (componentId == 16) player.getTrade().acceptPressed(player);
                break;
            case 334:
                if (componentId == 22) {
                    player.getTrade().tradeFailed();
                } else if (componentId == 21) player.getTrade().acceptPressed(player);
                break;
            case 300:
                ForgingInterface.handleIComponents(player, componentId);
                break;
            case 916:
                SkillsDialogue.handleSetQuantityButtons(player, componentId);
                break;
            case 640:
                if (componentId == 18 || componentId == 22) {
                    player.getTemporaryAttributes().put("WillDuelFriendly", true);
                    player.getPackets().sendConfig(283, 67108864);
                } else if (componentId == 19 || componentId == 21) {
                    player.getTemporaryAttributes().put("WillDuelFriendly", false);
                    player.getPackets().sendConfig(283, 134217728);
                } else if (componentId == 20) {
                    DuelController.challenge(player);
                }
                break;
            case 650:
                if (componentId == 17) {
                    player.stopAll();
                    player.setNextWorldTile(new WorldTile(2974, 4384, 2));
                    player.getControllerManager().startController("CorpBeastController");
                } else if (componentId == 18) player.closeInterfaces();
                break;
            case 742:
                if (componentId == 46) // close
                    player.stopAll();
                break;
            case 743:
                if (componentId == 20) // close
                    player.stopAll();
                break;
            case 741:
                if (componentId == 9) // close
                    player.stopAll();
                break;
            case 767:
                if (componentId == 10) player.getBank().openBank();
                break;
            case 20:
                SkillCapeCustomizer.handleSkillCapeCustomizer(player, componentId);
                break;
            case 1056:
                if (componentId == 102) player.getInterfaceManager().sendInterface(917);
                break;
            case 900:
                PlayerLook.handleMageMakeOverButtons(player, componentId);
                break;
            case 1028:
                PlayerLook.handleCharacterCustomizingButtons(player, componentId);
                break;
            case 1079:
                player.closeInterfaces();
                break;
        }

    }

    private static void handleButton2(final Player player, int interfaceId, int componentId, int slotId, int slotId2) {
        switch (interfaceId) {
            case 336:
                player.getTrade().addItem(player, slotId, 5);
                break;
            case 335:
                if (componentId == 31) player.getTrade().removeItem(player, slotId, 5);
                break;
            case 206:
                if (componentId == 15) player.getPriceCheckManager().removeItem(slotId, 5);
                break;
            case 207:
                if (componentId == 0) player.getPriceCheckManager().addItem(slotId, 5);
                break;
            case 665:
                if (componentId == 0) player.getFollower().getBob().addItem(slotId, 5);
                break;
            case 671:
                if (componentId == 27) player.getFollower().getBob().removeItem(slotId, 5);
                break;
            case 750:
                if (componentId == 1) {
                    if (player.isResting()) {
                        player.stopAll();
                        return;
                    }
                    long currentTime = TimeUtils.getTime();
                    if (player.getEmotesManager().getNextEmoteEnd() >= currentTime) {
                        player.getPackets().sendGameMessage("You can't rest while performing an emote.");
                        return;
                    }
                    if (player.getStopDelay() >= currentTime) {
                        player.getPackets().sendGameMessage("You can't rest while performing an action.");
                        return;
                    }
                    player.stopAll();
                    player.getActionManager().setAction(new Rest());
                }
                break;

        }

    }

    private static void handleButton3(final Player player, int interfaceId, int componentId, int slotId, int slotId2) {
        switch (interfaceId) {
            case 187:
                if (componentId == 1) player.getMusicsManager().addToPlayList(slotId / 2);
                break;
            case 336:
                player.getTrade().addItem(player, slotId, 10);
                break;
            case 335:
                if (componentId == 31) {
                    player.getTrade().removeItem(player, slotId, 10);
                }
                break;
            case 206:
                if (componentId == 15) player.getPriceCheckManager().removeItem(slotId, 10);
                break;
            case 207:
                if (componentId == 0) player.getPriceCheckManager().addItem(slotId, 10);
                break;
            case 665:
                if (componentId == 0) player.getFollower().getBob().addItem(slotId, 10);
                break;
            case 671:
                if (componentId == 27) player.getFollower().getBob().removeItem(slotId, 10);
                break;
        }
    }

    private static void handleButton4(final Player player, int interfaceId, int componentId, int slotId, int slotId2) {
        switch (interfaceId) {
            case 187:
                if (componentId == 1) player.getMusicsManager().removeFromPlayList(slotId / 2);
                break;
            case 336:
                player.getTrade().addItem(player, slotId, 0x7fffffff);
                break;
            case 335:
                if (componentId == 31) player.getTrade().removeItem(player, slotId, 0x7fffffff);
                break;
            case 206:
                if (componentId == 15) player.getPriceCheckManager().removeItem(slotId, Integer.MAX_VALUE);
                break;
            case 207:
                if (componentId == 0) player.getPriceCheckManager().addItem(slotId, Integer.MAX_VALUE);
                break;
            case 665:
                if (componentId == 0) player.getFollower().getBob().addItem(slotId, Integer.MAX_VALUE);
                break;
            case 671:
                if (componentId == 27) player.getFollower().getBob().removeItem(slotId, Integer.MAX_VALUE);
                break;
        }
    }

    private static void handleButton5(final Player player, int interfaceId, int componentId, int slotId, int slotId2) {
        switch (interfaceId) {
            case 336:
                if (componentId == 0) player.getTemporaryAttributes().put("offerX", slotId);
                player.getPackets().sendRunScript(108, "Enter Amount:");
                break;
            case 335:
                if (componentId == 31) {
                    player.getTemporaryAttributes().put("removeX", slotId);
                    player.getPackets().sendRunScript(108, "Enter Amount:");
                }
                break;
            case 206:
                if (componentId == 15) {
                    player.getTemporaryAttributes().put("pc_item_X_Slot", slotId);
                    player.getTemporaryAttributes().put("pc_isRemove", Boolean.TRUE);
                    player.getPackets().sendRunScript(108, "Enter Amount:");
                }
                break;
            case 207:
                if (componentId == 0) {
                    player.getTemporaryAttributes().put("pc_item_X_Slot", slotId);
                    player.getTemporaryAttributes().remove("pc_isRemove");
                    player.getPackets().sendRunScript(108, "Enter Amount:");
                }
                break;
            case 665:
                if (componentId == 0) {
                    player.getTemporaryAttributes().put("bob_item_X_Slot", slotId);
                    player.getTemporaryAttributes().remove("bob_isRemove");
                    player.getPackets().sendRunScript(108, "Enter Amount:");
                }
                break;

            case 671:
                if (componentId == 27) {
                    player.getTemporaryAttributes().put("bob_item_X_Slot", slotId);
                    player.getTemporaryAttributes().put("bob_isRemove", Boolean.TRUE);
                    player.getPackets().sendRunScript(108, "Enter Amount:");
                }
                break;

        }
    }

    private static void handleButton7(final Player player, int interfaceId, int componentId, int slotId, int slotId2) {
        switch (interfaceId) {
            case 548:
                switch (componentId) {
                    case 0:
                        player.getSkills().resetXpCounter();
                        break;
                }
            case 746:
                switch (componentId) {
                    case 229:
                        player.getSkills().resetXpCounter();
                        break;
                }
                break;
        }
    }

    private static void handleButton8(final Player player, int interfaceId, int componentId, int slotId, int slotId2) {
        switch (interfaceId) {
            case 336:
                switch (componentId) {
                    case 34:
                        player.getBank().sendExamine(slotId2);
                        break;
                }
            case 747:
                if (componentId == 7) Follower.selectLeftOption(player);
                break;
        }

    }

    private static void handleButton9(final Player player, int interfaceId, int componentId, int slotId, int slotId2) {
        switch (interfaceId) {
            case 336:
                player.getPackets().sendGameMessage(
                        "A " + (new Item(slotId2, 1)).getDefinitions().getName().toLowerCase() + "'s value is "
                        + PriceUtils.getPrice(slotId2) + "gold.");
                break;
            case 335:
                if (componentId == 31) player.getPackets().sendGameMessage(
                        "A " + (new Item(slotId2, 1)).getDefinitions().getName().toLowerCase() + "'s value is "
                        + PriceUtils.getPrice(slotId2) + "gold.");
            case 207:
            case 665:
                if (componentId == 0) {
                    player.getInventory().sendExamine(slotId);
                }
                break;
            case 747:
                if (player.getFollower() == null) return;
                if (componentId == 10 || componentId == 19) player.getFollower().call();
                else if (componentId == 11 || componentId == 20) player.getDialogueManager().startDialogue("DismissD");
                else if (componentId == 13 || componentId == 22) player.getFollower().renewFamiliar();
                else if (componentId == 12 || componentId == 21) player.getFollower().takeBob();
                else if (componentId == 9 || componentId == 18) player.getFollower().sendFollowerDetails();
                else if (componentId == 17) {
                    if (player.getFollower().getSpecialAttack() == SpecialAttack.CLICK)
                        player.getFollower().setSpecial(true);
                    if (player.getFollower().hasSpecialOn()) player.getFollower().submitSpecial(player);
                }
                break;
        }
    }

    private static void handleButton10(final Player player, int interfaceId, int componentId, int slotId, int slotId2) {
        switch (interfaceId) {
            case 667:
                displayEquipmentStats(player, slotId2);
                break;
        }
    }

    private static int handleButtons(final Player player, int interfaceId, int componentId, int slotId, int slotId2,
                                     int buttonId) {
        if (!player.getControllerManager().processButtonClick(interfaceId, componentId, slotId, buttonId))
            return HANDLED;

        //external button handles
        switch (interfaceId) {
            case 631:
            case 628:
            case 626:
            case 637:
            case 639:
                player.getDuelConfigurations().
                        processButtonClick(player, interfaceId, componentId, slotId, buttonId);
                break;
            case 751:
                if (componentId == 25) {
                    if (buttonId == CLICK_2) player.getFriendsIgnores().setPrivateStatus(0);
                    else if (buttonId == CLICK_3) player.getFriendsIgnores().setPrivateStatus(1);
                    else if (buttonId == CLICK_4) player.getFriendsIgnores().setPrivateStatus(2);
                }
                break;
            case 1108:
            case 1109:
                player.getFriendsIgnores().
                        handleFriendChatButtons(interfaceId, componentId, buttonId);
                break;
            case 192:
                if (componentId == 2) player.getCombatDefinitions().switchDefensiveCasting();
                else if (componentId == 7) player.getCombatDefinitions().switchShowCombatSpells();
                else if (componentId == 9) player.getCombatDefinitions().switchShowTeleportSkillSpells();
                else if (componentId == 11) player.getCombatDefinitions().switchShowMiscellaneousSpells();
                else if (componentId == 13) player.getCombatDefinitions().switchShowSkillSpells();
                else if (componentId >= 15 & componentId <= 17)
                    player.getCombatDefinitions().setSortSpellBook(componentId - 15);
                else Magic.processSpell(player, componentId);
                break;
            case 193:
                switch (componentId) {
                    case 18:
                        player.getCombatDefinitions().switchDefensiveCasting();
                        break;
                    case 5:
                        player.getCombatDefinitions().switchShowCombatSpells();
                        break;
                    case 7:
                        player.getCombatDefinitions().switchShowTeleportSkillSpells();
                        break;
                    case 9:
                    case 10:
                    case 11:
                        player.getCombatDefinitions().setSortSpellBook(componentId - 9);
                        break;
                    default:
                        Magic.processSpell(player, componentId);
                        break;
                }
                break;
            case 430:
                if (componentId == 5) player.getCombatDefinitions().switchShowCombatSpells();
                else if (componentId == 7) player.getCombatDefinitions().switchShowTeleportSkillSpells();
                else if (componentId == 9) player.getCombatDefinitions().switchShowMiscellaneousSpells();
                else if (componentId >= 11 & componentId <= 13)
                    player.getCombatDefinitions().setSortSpellBook(componentId - 11);
                else if (componentId == 20) player.getCombatDefinitions().switchDefensiveCasting();
                else Magic.processSpell(player, componentId);
                break;
            case 672:
                if (componentId == 16) {
                    if (buttonId == CLICK_1) Summoning.createPouch(player, slotId2, 1);
                    else if (buttonId == CLICK_2) Summoning.createPouch(player, slotId2, 5);
                    else if (buttonId == CLICK_3) Summoning.createPouch(player, slotId2, 10);
                    else if (buttonId == CLICK_4) Summoning.createPouch(player, slotId2, 28);
                    else if (buttonId == CLICK_5) Summoning.createPouch(player, slotId2, 28);// x
                    else if (buttonId == CLICK_6) {
                        player.getPackets().sendGameMessage("You currently need "
                                                            + ItemDefinitions.getItemDefinitions(slotId2)
                                                                    .getCreateItemRequirements());
                    }
                } else if (componentId == 19 && buttonId == 14) {
                    Summoning.infuseScrolls(player);
                }
                break;
            case 666:
                if (componentId == 16) {
                    if (buttonId == CLICK_1) {
                        Summoning.transformScrolls(player, slotId2, 1);
                    } else if (buttonId == CLICK_2) {
                        Summoning.transformScrolls(player, slotId2, 5);
                    } else if (buttonId == CLICK_3) {
                        Summoning.transformScrolls(player, slotId2, 10);
                    } else if (buttonId == CLICK_4) {
                        Summoning.transformScrolls(player, slotId2, Integer.MAX_VALUE);
                    }
                } else if (componentId == 18 && buttonId == 14) {
                    Summoning.infusePouches(player);
                }
                break;
            case 387:
                if (player.getInterfaceManager().containsInventoryInter()) return DEFAULT;
                if (componentId == 8) InterfaceHandler.sendRemove(player, Equipment.SLOT_HAT);
                else if (componentId == 11) {
                    if (buttonId == CLICK_5) {
                        int capeId = player.getEquipment().getCapeId();
                        if (capeId == 20769 || capeId == 20771) SkillCapeCustomizer.startCustomizing(player, capeId);
                    } else if (buttonId == CLICK_2) {
                        int capeId = player.getEquipment().getCapeId();
                        if (capeId == 20767) SkillCapeCustomizer.startCustomizing(player, capeId);
                    } else if (buttonId == CLICK_1) InterfaceHandler.sendRemove(player, Equipment.SLOT_CAPE);
                    else if (buttonId == CLICK_8) player.getEquipment().sendExamine(Equipment.SLOT_CAPE);
                } else if (componentId == 14) {
                    int amuletId = player.getEquipment().getAmuletId();
                    if (buttonId == CLICK_2) {
                        if (amuletId <= 1712 && amuletId >= 1706 || amuletId >= 10354 && amuletId <= 10361) {
                            if (Magic.itemTeleport(player, new WorldTile(3087, 3496, 0))) {
                                Item amulet = player.getEquipment().getItem(Equipment.SLOT_AMULET);
                                if (amulet != null) {
                                    amulet.setId(amulet.getId() + (amuletId > 2000 ? 2 : -2));
                                    player.getEquipment().refresh(Equipment.SLOT_AMULET);
                                }
                            }
                        } else if (amuletId == 1704 || amuletId == 10352) player.getPackets().sendGameMessage(
                                "The amulet has ran out of charges. You need to " + "recharge it if you wish it use it "
                                + "once more.");
                    } else if (buttonId == CLICK_3) {
                        if (amuletId <= 1712 && amuletId >= 1706 || amuletId >= 10354 && amuletId <= 10361) {
                            if (Magic.itemTeleport(player, new WorldTile(2918, 3176, 0))) {
                                Item amulet = player.getEquipment().getItem(Equipment.SLOT_AMULET);
                                if (amulet != null) {
                                    amulet.setId(amulet.getId() - 2);
                                    player.getEquipment().refresh(Equipment.SLOT_AMULET);
                                }
                            }
                        }
                    } else if (buttonId == CLICK_4) {
                        if (amuletId <= 1712 && amuletId >= 1706 || amuletId >= 10354 && amuletId <= 10361) {
                            if (Magic.itemTeleport(player, new WorldTile(3105, 3251, 0))) {
                                Item amulet = player.getEquipment().getItem(Equipment.SLOT_AMULET);
                                if (amulet != null) {
                                    amulet.setId(amulet.getId() - 2);
                                    player.getEquipment().refresh(Equipment.SLOT_AMULET);
                                }
                            }
                        }
                    } else if (buttonId == CLICK_5) {
                        if (amuletId <= 1712 && amuletId >= 1706 || amuletId >= 10354 && amuletId <= 10361) {
                            if (Magic.itemTeleport(player, new WorldTile(3293, 3163, 0))) {
                                Item amulet = player.getEquipment().getItem(Equipment.SLOT_AMULET);
                                if (amulet != null) {
                                    amulet.setId(amulet.getId() - 2);
                                    player.getEquipment().refresh(Equipment.SLOT_AMULET);
                                }
                            }
                        }
                    } else if (buttonId == CLICK_1) InterfaceHandler.sendRemove(player, Equipment.SLOT_AMULET);
                    else if (buttonId == CLICK_8) player.getEquipment().sendExamine(Equipment.SLOT_AMULET);
                } else if (componentId == 17) InterfaceHandler.sendRemove(player, Equipment.SLOT_WEAPON);
                else if (componentId == 20) InterfaceHandler.sendRemove(player, Equipment.SLOT_CHEST);
                else if (componentId == 23) InterfaceHandler.sendRemove(player, Equipment.SLOT_SHIELD);
                else if (componentId == 26) InterfaceHandler.sendRemove(player, Equipment.SLOT_LEGS);
                else if (componentId == 29) InterfaceHandler.sendRemove(player, Equipment.SLOT_HANDS);
                else if (componentId == 32) InterfaceHandler.sendRemove(player, Equipment.SLOT_FEET);
                else if (componentId == 35) InterfaceHandler.sendRemove(player, Equipment.SLOT_RING);
                else if (componentId == 38) InterfaceHandler.sendRemove(player, Equipment.SLOT_ARROWS);
                else if (componentId == 50) {
                    if (buttonId == CLICK_4) {
                        InterfaceHandler.sendRemove(player, Equipment.SLOT_AURA);
                        player.getAuraManager().removeAura();
                    } else if (buttonId == CLICK_8) player.getEquipment().sendExamine(Equipment.SLOT_AURA);
                    else if (buttonId == CLICK_2) player.getAuraManager().activate();
                    else if (buttonId == CLICK_3) player.getAuraManager().sendAuraRemainingTime();
                } else if (componentId == 45) {
                    player.stopAll();
                    player.getInterfaceManager().sendInterface(17);
                } else if (componentId == 39) openEquipmentBonuses(player, false);
                else if (componentId == 42) {
                    if (player.getInterfaceManager().containsScreenInter()) {
                        player.getPackets().sendGameMessage(
                                "Please finish what you're doing before opening the " + "price" + " checker.");
                        return HANDLED;
                    }
                    player.stopAll();
                    player.getPriceCheckManager().initPriceCheck();
                }
                break;
            case 449:
                if (componentId == 1) {
                    Shop shop = (Shop) player.getTemporaryAttributes().get("Shop");
                    if (shop == null) return HANDLED;
                    shop.sendInventory(player);
                } else if (componentId == 21) {
                    Shop shop = (Shop) player.getTemporaryAttributes().get("Shop");
                    if (shop == null) return HANDLED;
                    Integer slot = (Integer) player.getTemporaryAttributes().get("ShopSelectedSlot");
                    if (slot == null) return HANDLED;
                    if (buttonId == CLICK_1) shop.buy(player, slot, 1);
                    else if (buttonId == CLICK_2) shop.buy(player, slot, 5);
                    else if (buttonId == CLICK_3) shop.buy(player, slot, 10);
                    else if (buttonId == CLICK_4) shop.buy(player, slot, 50);

                }
                break;
            case 620:
                if (componentId == 25) {
                    Shop shop = (Shop) player.getTemporaryAttributes().get("Shop");
                    if (shop == null) return HANDLED;
                    if (buttonId == CLICK_1) shop.sendInfo(player, slotId);
                    else if (buttonId == CLICK_2) shop.buy(player, slotId, 1);
                    else if (buttonId == CLICK_3) shop.buy(player, slotId, 5);
                    else if (buttonId == CLICK_4) shop.buy(player, slotId, 10);
                    else if (buttonId == CLICK_5) shop.buy(player, slotId, 50);
                    else if (buttonId == CLICK_9) shop.buy(player, slotId, 500);
                    else if (buttonId == CLICK_8) shop.sendExamine(player, slotId);
                }
                break;
            case 621:
                if (componentId == 0) {
                    if (buttonId == CLICK_9) player.getInventory().sendExamine(slotId);
                    else {
                        Shop shop = (Shop) player.getTemporaryAttributes().get("Shop");
                        if (shop == null) return HANDLED;
                        if (buttonId == CLICK_1) shop.sendValue(player, slotId);
                        else if (buttonId == CLICK_2) shop.sell(player, slotId, 1);
                        else if (buttonId == CLICK_3) shop.sell(player, slotId, 5);
                        else if (buttonId == CLICK_4) shop.sell(player, slotId, 10);
                        else if (buttonId == CLICK_5) shop.sell(player, slotId, 50);
                    }
                }
                break;
            case 667:
                if (componentId == 7) {
                    if (slotId > 14) return HANDLED;
                    Item item = player.getEquipment().getItem(slotId);
                    if (item == null) return HANDLED;
                    if (buttonId == CLICK_8) player.getPackets().sendGameMessage(ItemExamines.getExamine(item));
                    else if (buttonId == CLICK_1) {
                        sendRemove(player, slotId);
                        InterfaceHandler.refreshEquipBonuses(player);
                    }
                } else if (componentId == 49) {
                    player.getBank().setDisplayEquipment(false);
                    player.getBank().openBank();
                }
                break;
            case 670:
                if (componentId == 0) {
                    if (slotId >= player.getInventory().getItemsContainerSize()) return HANDLED;
                    Item item = player.getInventory().getItem(slotId);
                    if (item == null) return HANDLED;
                    if (buttonId == CLICK_1) {
                        if (sendWear(player, slotId)) InterfaceHandler.refreshEquipBonuses(player);
                    } else if (buttonId == CLICK_4) player.getInventory().sendExamine(slotId);
                }
                break;
            case 11:
                if (componentId == 17) {
                    if (buttonId == CLICK_1) player.getBank().depositItem(slotId, 1, false);
                    else if (buttonId == CLICK_2) player.getBank().depositItem(slotId, 5, false);
                    else if (buttonId == CLICK_3) player.getBank().depositItem(slotId, 10, false);
                    else if (buttonId == CLICK_4) player.getBank().depositItem(slotId, Integer.MAX_VALUE, false);
                    else if (buttonId == CLICK_5) {
                        player.getTemporaryAttributes().put("bank_item_X_Slot", slotId);
                        player.getTemporaryAttributes().remove("bank_isWithdraw");
                        player.getPackets().sendRunScript(108, "Enter Amount:");
                    } else if (buttonId == CLICK_9) player.getInventory().sendExamine(slotId);
                } else if (componentId == 18) player.getBank().depositAllInventory(false);
                else if (componentId == 20) player.getBank().depositAllEquipment(false);
                break;
            case 762:
                if (componentId == 117) {
                    openEquipmentBonuses(player, true);
                } else if (componentId == 15) player.getBank().switchInsertItems();
                else if (componentId == 19) player.getBank().switchWithdrawNotes();
                else if (componentId == 33) player.getBank().depositAllInventory(true);
                else if (componentId == 35) player.getBank().depositAllEquipment(true);
                else if (componentId == 44) {
                    player.closeInterfaces();
                    player.getInterfaceManager().sendInterface(767);
                    player.setCloseInterfacesEvent(() -> player.getBank().openBank());
                } else if (componentId >= 44 && componentId <= 62) {
                    int tabId = 9 - ((componentId - 44) / 2);
                    if (buttonId == CLICK_1) player.getBank().setCurrentTab(tabId);
                    else if (buttonId == CLICK_2) player.getBank().collapse(tabId);
                } else if (componentId == 93) {
                    if (buttonId == CLICK_1) player.getBank().withdrawItem(slotId, 1);
                    else if (buttonId == CLICK_2) player.getBank().withdrawItem(slotId, 5);
                    else if (buttonId == CLICK_3) player.getBank().withdrawItem(slotId, 10);
                    else if (buttonId == CLICK_4) player.getBank().withdrawLastAmount(slotId);
                    else if (buttonId == CLICK_5) {
                        player.getTemporaryAttributes().put("bank_item_X_Slot", slotId);
                        player.getTemporaryAttributes().put("bank_isWithdraw", Boolean.TRUE);
                        player.getPackets().sendRunScript(108, "Enter Amount:");
                    } else if (buttonId == CLICK_9) player.getBank().withdrawItem(slotId, Integer.MAX_VALUE);
                    else if (buttonId == CLICK_6) player.getBank().withdrawItemButOne(slotId);
                    else if (buttonId == CLICK_8) player.getBank().sendExamine(slotId);

                }
                break;
            case 763:
                if (componentId == 0) {
                    if (buttonId == CLICK_1) player.getBank().depositItem(slotId, 1, true);
                    else if (buttonId == CLICK_2) player.getBank().depositItem(slotId, 5, true);
                    else if (buttonId == CLICK_3) player.getBank().depositItem(slotId, 10, true);
                    else if (buttonId == CLICK_4) player.getBank().depositLastAmount(slotId);
                    else if (buttonId == CLICK_5) {
                        player.getTemporaryAttributes().put("bank_item_X_Slot", slotId);
                        player.getTemporaryAttributes().remove("bank_isWithdraw");
                        player.getPackets().sendRunScript(108, "Enter Amount:");
                    } else if (buttonId == CLICK_9) player.getBank().depositItem(slotId, Integer.MAX_VALUE, true);
                    else if (buttonId == CLICK_8) player.getInventory().sendExamine(slotId);
                }
                break;
        }

        switch (buttonId) {
            case CLICK_1:
                handleButton1(player, interfaceId, componentId, slotId, slotId2);
                break;
            case CLICK_2:
                handleButton2(player, interfaceId, componentId, slotId, slotId2);
                break;
            case CLICK_3:
                handleButton3(player, interfaceId, componentId, slotId, slotId2);
                break;
            case CLICK_4:
                handleButton4(player, interfaceId, componentId, slotId, slotId2);
                break;
            case CLICK_5:
                handleButton5(player, interfaceId, componentId, slotId, slotId2);
                break;
            case CLICK_7:
                handleButton7(player, interfaceId, componentId, slotId, slotId2);
                break;
            case CLICK_8:
                handleButton8(player, interfaceId, componentId, slotId, slotId2);
                break;
            case CLICK_9:
                handleButton9(player, interfaceId, componentId, slotId, slotId2);
                break;
            case CLICK_10:
                handleButton10(player, interfaceId, componentId, slotId, slotId2);
                break;

        }
        return DEFAULT;
    }

    private static void displayEquipmentStats(Player player, int itemId) {
        player.getPackets().sendHideIComponent(667, 52, false);
    }

    public static void openEquipmentBonuses(Player player, boolean banking) {

        player.setInfiniteStopDelay();
        player.resetStopDelay();
        player.getPackets().sendConfigByFile(4894, banking ? 1 : 0);
        player.getPackets().sendItems(93, player.getInventory().getItems());

        player.getPackets().sendInterSetItemsOptionsScript(670, 0, 93, 4, 7, "Equip", "Compare", "Stats", "Examine");
        player.getPackets().sendUnlockIComponentOptionSlots(670, 0, 0, 27, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        player.getPackets().sendUnlockIComponentOptionSlots(667, 7, 0, 27, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        if (banking) {
            player.getBank().setDisplayEquipment(true);
            player.getInterfaceManager().sendInterface(767);
        }

        refreshEquipBonuses(player);

        player.getInterfaceManager().sendInventoryInterface(670);
        player.getInterfaceManager().sendInterface(667);
    }

    public static void sendRemove(Player player, int slotId) {
        if (slotId >= 15) return;
        Item item = player.getEquipment().getItem(slotId);
        if (item == null || !player.getInventory().addItem(item.getId(), item.getAmount())) return;
        player.getEquipment().getItems().set(slotId, null);
        player.getEquipment().refresh(slotId);
        player.getAppearance().generateAppearanceData();
        if (Runecrafting.isTiara(item.getId())) player.getPackets().sendConfig(491, 0);
        if (slotId == 3) player.getCombatDefinitions().decreaseSpecial(0);
    }

    public static boolean equipItem(Player player, int slotId, int itemId) {
        if (player.hasFinished() || player.isDead()) return false;
        Item item = player.getInventory().getItem(slotId);
        if (item == null || item.getId() != itemId) return false;
        if (item.getDefinitions().isNoted() || !item.getDefinitions().isWearItem(player.getAppearance().isMale())) {
            player.getPackets().sendGameMessage("You can't wear that.");
            return false;
        }
        String itemName = item.getDefinitions() == null ? "" : item.getDefinitions().getName().toLowerCase();
        for (String strings : Settings.DONATOR_ITEMS) {
            if (itemName.contains(strings) && !player.hasDonorRights(RanksManager.Ranks.MEMBER)) {
                player.getPackets().sendGameMessage("You need to be a donor to equip " + itemName + ".");
                return false;
            }
        }
        int targetSlot = Equipment.getItemSlot(itemId);
        if (targetSlot == -1) {
            player.getPackets().sendGameMessage("You can't wear that.");
            return false;
        }
        boolean isTwoHandedWeapon = targetSlot == 3 && Equipment.isTwoHandedWeapon(item);
        if (isTwoHandedWeapon && !player.getInventory().hasFreeSlots() && player.getEquipment().hasShield()) {
            player.getPackets().sendGameMessage("Not enough free space in your inventory.");
            return false;
        }
        HashMap<Integer, Integer> requirements = item.getDefinitions().getWearingSkillRequirements();
        boolean hasRequirements = true;
        if (requirements != null) {
            for (int skillId : requirements.keySet()) {
                if (skillId > 24 || skillId < 0) continue;
                int level = requirements.get(skillId);
                if (level < 0 || level > 120) continue;
                if (!RequirementsManager.hasRequirement(player, skillId, level, "use this item", false))
                    hasRequirements = false;
            }
        }
        if (!hasRequirements) return false;
        if (!player.getControllerManager().canEquip(targetSlot, itemId)) return false;
        player.getInventory().getItems().remove(slotId, item);
        if (targetSlot == 3) {
            if (isTwoHandedWeapon && player.getEquipment().getItem(5) != null) {
                if (!player.getInventory().getItems().add(player.getEquipment().getItem(5))) {
                    player.getInventory().getItems().set(slotId, item);
                    return false;
                }
                player.getEquipment().getItems().set(5, null);
            }
        } else if (targetSlot == 5) {
            if (player.getEquipment().getItem(3) != null
                && Equipment.isTwoHandedWeapon(player.getEquipment().getItem(3))) {
                if (!player.getInventory().getItems().add(player.getEquipment().getItem(3))) {
                    player.getInventory().getItems().set(slotId, item);
                    return false;
                }
                player.getEquipment().getItems().set(3, null);
            }

        }
        if (player.getEquipment().getItem(targetSlot) != null && (
                itemId != player.getEquipment().getItem(targetSlot).getId() || !item.getDefinitions().isStackable())) {
            if (player.getInventory().getItems().get(slotId) == null) {
                player.getInventory().getItems().set(slotId, new Item(player.getEquipment().getItem(targetSlot).getId
                        (), player.getEquipment().getItem(targetSlot).getAmount()));
            } else
                player.getInventory().getItems().add(new Item(player.getEquipment().getItem(targetSlot).getId(),
                        player.getEquipment().getItem(targetSlot).getAmount()));
            player.getEquipment().getItems().set(targetSlot, null);
        }
        int oldAmt = 0;
        if (player.getEquipment().getItem(targetSlot) != null) {
            oldAmt = player.getEquipment().getItem(targetSlot).getAmount();
        }
        Item item2 = new Item(itemId, oldAmt + item.getAmount());
        player.getEquipment().getItems().set(targetSlot, item2);
        player.getEquipment().refresh(targetSlot, targetSlot == 3 ? 5 : 3);
        if (targetSlot == 3) player.getCombatDefinitions().decreaseSpecial(0);
        player.getCharges().wear(targetSlot);
        return true;
    }

    static boolean sendWear(Player player, int... slotIds) {
        if (player.hasFinished() || player.isDead()) return false;

        boolean worn = false;
        Item[] copy = player.getInventory().getItems().getItemsCopy();
        for (int slotId : slotIds) {
            Item item = player.getInventory().getItem(slotId);
            if (item == null) continue;
            if (equipItem(player, slotId, item.getId())) worn = true;
        }
        player.getInventory().refreshItems(copy);
        if (worn) {
            player.getAppearance().generateAppearanceData();
            player.getPackets().sendSound(2240, 0, 1);
            return true;
        }
        return false;
    }

    private static void refreshEquipBonuses(Player player) {
        player.getPackets().sendIComponentText(667, 31, "Stab: +" + player.getCombatDefinitions().getBonuses()[0]);
        player.getPackets().sendIComponentText(667, 32, "Slash: +" + player.getCombatDefinitions().getBonuses()[1]);
        player.getPackets().sendIComponentText(667, 33, "Crush: +" + player.getCombatDefinitions().getBonuses()[2]);
        player.getPackets().sendIComponentText(667, 34, "Magic: +" + player.getCombatDefinitions().getBonuses()[3]);
        player.getPackets().sendIComponentText(667, 35, "Range: +" + player.getCombatDefinitions().getBonuses()[4]);
        player.getPackets().sendIComponentText(667, 36, "Stab: +" + player.getCombatDefinitions().getBonuses()[5]);
        player.getPackets().sendIComponentText(667, 37, "Slash: +" + player.getCombatDefinitions().getBonuses()[6]);
        player.getPackets().sendIComponentText(667, 38, "Crush: +" + player.getCombatDefinitions().getBonuses()[7]);
        player.getPackets().sendIComponentText(667, 39, "Magic: +" + player.getCombatDefinitions().getBonuses()[8]);
        player.getPackets().sendIComponentText(667, 40, "Range: +" + player.getCombatDefinitions().getBonuses()[9]);
        player.getPackets().sendIComponentText(667, 41,
                "Summoning: +" + player.getCombatDefinitions().getBonuses()[10]);
        player.getPackets().sendIComponentText(667, 42,
                "Absorb Melee: " + player.getCombatDefinitions().getBonuses()[ABSORB_MELEE_BONUS.getId()] + "%");
        player.getPackets().sendIComponentText(667, 43,
                "Absorb Magic: +" + player.getCombatDefinitions().getBonuses()[ABSORB_MAGIC_BONUS.getId()] + "%");
        player.getPackets().sendIComponentText(667, 44,
                "Absorb Ranged: +" + player.getCombatDefinitions().getBonuses()[ABSORB_RANGE_BONUS.getId()] + "%");
        player.getPackets().sendIComponentText(667, 45, "Strength: " + player.getCombatDefinitions().getBonuses()[14]);
        player.getPackets().sendIComponentText(667, 46,
                "Ranged Str: " + player.getCombatDefinitions().getBonuses()[15]);
        player.getPackets().sendIComponentText(667, 47, "Prayer: +" + player.getCombatDefinitions().getBonuses()[16]);
        player.getPackets().sendIComponentText(667, 48,
                "Magic Damage: +" + player.getCombatDefinitions().getBonuses()[17] + "%");
    }
}
