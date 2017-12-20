package com.rs.game.actionHandling.handlers.listeners;

import com.rs.game.actionHandling.Handler;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.content.skills.summoning.SpecialAttack;
import com.rs.game.player.Player;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.registerInterfaceListener;
import static com.rs.game.actionHandling.HandlerManager.registerNpcListener;

/**
 * Created by Peng on 9.10.2016.
 */
public class Summoning implements Handler {

    @Override
    public void register() {
        registerInterfaceListener(CLICK_1, (player, componentId, slotId, slotId2, buttonId, interfaceId) ->
                handleSummoning(player, interfaceId, componentId, slotId));
        registerNpcListener(CLICK_2, (player, npc, clickType) -> {
            if (npc instanceof Follower) {
                if (!player.getFollowerManager().ownsFollower((Follower) npc)) {
                    player.getPackets().sendGameMessage("That isn't your familiar.");
                    return HANDLED;
                }
                if (npc.getDefinitions().hasOption("store")) {
                    player.getFollowerManager().store();
                } else if (npc.getDefinitions().hasOption("cure")) {
                    if (!player.getPoison().isPoisoned()) {
                        player.getPackets().sendGameMessage("Your aren't poisoned or diseased.");
                        return HANDLED;
                    } else {
                        player.getFollower().drainSpecial(2);
                        player.addPoisonImmune(120);
                    }
                }
                return DEFAULT;
            }
            return DEFAULT;
        });
    }

    private int handleSummoning(Player player, int interfaceId, int componentId, int slotId) {
        switch (interfaceId) {
            case 747:
                if (player.getFollower() == null) return DEFAULT;
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
            case 665:
                if (player.getFollower() == null || player.getFollower().getBob() == null) return DEFAULT;
                if (componentId == 0) player.getFollower().getBob().addItem(slotId, 1);
                break;
            case 880:
                if (componentId >= 7 && componentId <= 19) Follower.setLeftClickOption(player, (componentId - 7) / 2);
                else if (componentId == 21) Follower.confirmLeftOption(player);
                else if (componentId == 25) Follower.setLeftClickOption(player, 7);
            case 662:
                if (player.getFollower() == null) return DEFAULT;
                if (componentId == 49) player.getFollower().call();
                else if (componentId == 51) player.getDialogueManager().startDialogue("DismissD");
                else if (componentId == 67) player.getFollower().takeBob();
                else if (componentId == 69) player.getFollower().renewFamiliar();
                else if (componentId == 74) {
                    if (player.getFollower().getSpecialAttack() == SpecialAttack.CLICK)
                        player.getFollower().setSpecial(true);
                    if (player.getFollower().hasSpecialOn()) player.getFollower().submitSpecial(player);
                }
                break;
            case 671:
                if (player.getFollower() == null || player.getFollower().getBob() == null) return DEFAULT;
                if (componentId == 27) {
                    player.getFollower().getBob().removeItem(slotId, 1);
                } else if (componentId == 29) player.getFollower().takeBob();
                break;
            default:
                return DEFAULT;
        }
        return HANDLED;
    }
}
