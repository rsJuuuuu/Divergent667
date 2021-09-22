package com.rs.game.actionHandling.handlers.listeners;

import com.rs.cores.CoresManager;
import com.rs.game.actionHandling.Handler;
import com.rs.game.actionHandling.HandlerManager;
import com.rs.game.player.Player;
import com.rs.game.player.actions.combat.SpecialAttack;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

import java.util.TimerTask;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.registerInterfaceAction;
import static com.rs.game.actionHandling.HandlerManager.registerInterfaceListener;
import static com.rs.game.player.InterfaceManager.GameInterface.SETTINGS;

/**
 * Created by Peng on 15.10.2016.
 */
public class GameFrame implements Handler {
    @Override
    public void register() {
        registerInterfaceAction(CLICK_1, (player, componentId, slotId, slotId2, buttonId, interfaceId) -> {
            switch (componentId) {
                case 180:
                    HandlerManager.interfaceHandler.openWorldMap(player);
                    return HANDLED;
                case 182:
                    if (interfaceId == 746) HandlerManager.interfaceHandler.openWorldMap(player);
                    return HANDLED;
            }
            return DEFAULT;
        }, 548, 746);

        registerInterfaceAction(CLICK_2, (player, componentId, slotId, slotId2, buttonId, interfaceId) -> {
            player.getPrayer().toggleSettingQuickPrayers();
            return RETURN;
        }, 749);
        registerInterfaceAction(CLICK_1, (player, componentId, slotId, slotId2, buttonId, interfaceId) -> {
            player.getPrayer().toggleQuickPrayers();
            return RETURN;
        }, 749);
        registerInterfaceListener(CLICK_1, (player, componentId, slotId, slotId2, buttonId, interfaceId) ->
                handleClick(player, interfaceId, componentId, slotId, slotId2));
    }

    private int handleClick(Player player, int interfaceId, int componentId, int slotId, int slotId2) {
        switch (interfaceId) {
            case 261:
                if (player.getInterfaceManager().containsInventoryInter()) return HANDLED;
                if (componentId == 14) {
                    if (player.getInterfaceManager().containsScreenInter()) {
                        player.getPackets().sendGameMessage(
                                "Please close the interface you have open before setting " + "" + "" + "" + ""
                                + "your graphic options.");
                        return HANDLED;
                    }
                    player.stopAll();
                    player.getInterfaceManager().sendInterface(742);
                } else if (componentId == 4) player.switchAllowChatEffects();
                else if (componentId == 5) {
                    player.getInterfaceManager().overrideInterface(SETTINGS, 982);
                } else if (componentId == 6) player.switchMouseButtons();
                else if (componentId == 16) {
                    if (player.getInterfaceManager().containsScreenInter()) {
                        player.getPackets().sendGameMessage(
                                "Please close the interface you have open before setting " + "your audio options.");
                        return HANDLED;
                    }
                    player.stopAll();
                    player.getInterfaceManager().sendInterface(743);
                }
                break;
            case 982:
                if (componentId == 5) player.getInterfaceManager().openInterfaces(SETTINGS);
                else if (componentId == 42) player.setPrivateChatSetup(player.getPrivateChatSetup() == 0 ? 1 : 0);
                else if (componentId >= 49 && componentId <= 61) player.setPrivateChatSetup(componentId - 48);
                break;
            case 271:
                WorldTasksManager.schedule(new WorldTask() {
                    @Override
                    public void run() {
                        if (componentId == 8 || componentId == 42) player.getPrayer().togglePrayer(slotId);
                        else if (componentId == 43 && player.getPrayer().isSettingQuickPrayers())
                            player.getPrayer().toggleSettingQuickPrayers();
                    }
                });
                break;
            case 187:
                if (componentId == 1) {
                    player.getMusicsManager().playAnotherMusic(slotId / 2);
                } else if (componentId == 4) player.getMusicsManager().addPlayingMusicToPlayList();
                else if (componentId == 10) player.getMusicsManager().switchPlayListOn();
                else if (componentId == 11) player.getMusicsManager().clearPlayList();
                else if (componentId == 13) player.getMusicsManager().switchShuffleOn();
                break;
            case 590:
                player.getEmotesManager().useBookEmote(slotId);
                break;
            case 206:
                if (componentId == 15) player.getPriceCheckManager().removeItem(slotId, 1);
                break;
            case 207:
                if (componentId == 0) player.getPriceCheckManager().addItem(slotId, 1);
                break;
            case 884:
                if (componentId == 4) {
                    if (SpecialAttack.processInstantSpecial(player)) return HANDLED;
                    CoresManager.fastExecutor.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            WorldTasksManager.schedule(new WorldTask() {
                                @Override
                                public void run() {
                                    player.getCombatDefinitions().switchUsingSpecialAttack();
                                }
                            }, 0);
                        }
                    }, 200);
                } else if (componentId >= 11 && componentId <= 14)
                    player.getCombatDefinitions().setAttackStyle(componentId - 11);
                else if (componentId == 15) player.getCombatDefinitions().switchAutoRetaliate();
                break;
            case 755:
                if (componentId == 44)
                    player.getPackets().sendWindowsPane(player.getInterfaceManager().hasResizableScreen() ? 746 :
                            548, 2);
                break;
            case 750:
                if (componentId == 1) {
                    player.toggleRun(!player.isResting());
                    if (player.isResting()) player.stopAll();
                }
                break;
            case 182:
                if (player.getInterfaceManager().containsInventoryInter()) return HANDLED;
                if (componentId == 6 || componentId == 13) if (!player.hasFinished()) player.logout();
                break;
            default:
                return DEFAULT;
        }
        return HANDLED;
    }
}
