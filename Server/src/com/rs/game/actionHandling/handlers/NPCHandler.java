package com.rs.game.actionHandling.handlers;

import com.rs.game.actionHandling.HandlerManager;
import com.rs.game.actionHandling.actions.ActionListener;
import com.rs.game.actionHandling.actions.NpcListener;
import com.rs.game.npc.Npc;
import com.rs.game.npc.impl.slayer.Strykewyrm;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Player;
import com.rs.game.player.RouteEvent;
import com.rs.game.player.actions.Fishing;
import com.rs.game.player.actions.Fishing.FishingSpots;
import com.rs.game.player.actions.combat.PlayerCombat;
import com.rs.game.player.actions.thieving.PickPocketAction;
import com.rs.game.player.actions.thieving.PickPocketableNPC;
import com.rs.game.player.info.RanksManager;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.utils.stringUtils.TimeUtils;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.*;

public class NPCHandler extends ActionHandler<Integer> {

    /**
     * Perform the appropriate action for this click
     *
     * @param player player clicking
     * @param npc    being clicked
     * @param packet that was received
     */
    public static void handleClick(Player player, Npc npc, WorldPacketsDecoder.Packets packet) {

        if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished()
            || !player.getMapRegionsIds().contains(npc.getRegionId())) return;
        player.stopAll(false);
        if (!player.getControllerManager().processNPCClick(npc, optionForPacket(packet))) return;

        switch (packet) {
            case ATTACK_NPC:
            case NPC_EXAMINE:
                HandlerManager.npcHandler.processClick(player, npc.getId(), optionForPacket(packet), packet, npc);
                return;
            default:
                player.setRouteEvent(new RouteEvent(npc, () -> {
                    npc.resetWalkSteps();
                    player.faceEntity(npc);
                    FishingSpots spot = FishingSpots.forId(npc.getId() | (optionForPacket(packet) << 24));
                    if (spot != null) {
                        player.getActionManager().setAction(new Fishing(spot, npc));
                        return;
                    }
                    npc.faceEntity(player);
                    if (npc.getDefinitions().name.contains("Banker") || npc.getDefinitions().name.contains("banker")) {
                        player.faceEntity(npc);
                        if (!player.withinDistance(npc, 2)) return;
                        npc.faceEntity(player);
                        switch (packet) {
                            case NPC_CLICK_1:
                                player.getDialogueManager().startDialogue("Banker", npc.getId());
                                return;
                            default:
                                player.getBank().openBank();
                        }
                        return;
                    }
                    HandlerManager.npcHandler.processClick(player, npc.getId(), optionForPacket(packet), packet, npc);
                }));
        }
    }

    public int executeClick(Player player, WorldPacketsDecoder.Packets packet, ActionListener action, Object...
            params) {
        Npc npc = (Npc) params[0];
        return ((NpcListener) action).execute(player, npc, optionForPacket(packet));
    }

    /**
     * Process a player attacking an npc
     *
     * @param player the player
     * @param npc    the npc
     */
    private static void handleAttack(final Player player, Npc npc) {
        if (!npc.getDefinitions().hasAttackOption()) return;
        if (!player.getControllerManager().canAttack(npc)) return;
        if (npc instanceof Follower) {
            Follower follower = (Follower) npc;
            if (follower == player.getFollower()) {
                player.getPackets().sendGameMessage("You can't attack your own familiar.");
                return;
            }
            if (!follower.canAttack(player)) {
                player.getPackets().sendGameMessage("You can't attack this npc.");
                return;
            }
        } else if (!npc.isForceMultiAttacked()) {
            if (!npc.isAtMultiArea() || !player.isAtMultiArea()) {
                if (player.getAttackedBy() != npc && player.getAttackedByDelay() > TimeUtils.getTime()) {
                    player.getPackets().sendGameMessage("You are already in combat.");
                    return;
                }
                if (npc.getAttackedBy() != player && npc.getAttackedByDelay() > TimeUtils.getTime()) {
                    player.getPackets().sendGameMessage("This npc is already in combat.");
                    return;
                }
            }
        }
        player.stopAll(false);
        player.getActionManager().setAction(new PlayerCombat(npc));
    }

    /**
     * Handle npc examine
     *
     * @param player the player examining
     */
    private static void handleExamine(final Player player, Npc npc) {
        if (player.hasRights(RanksManager.Ranks.OWNER)) {
            player.examinedNpc = npc;
            player.sendMessage(npc.toString());
        }
    }

    /*
     * If you must register events in npc handler do it down here
     */
    public void init() {
        registerNpcDialogue(4247, CLICK_1, "EstateAgent", 4247);
        registerNpcDialogue(8443, CLICK_1, "PvpTeleports", 8443);
        registerNpcDialogue(13727, CLICK_1, "Xuans", 13727);
        registerNpcAction((player, npc, clickType) -> {
            player.cureAll();
            return HANDLED;
        }, 961);
        registerNpcAction(CLICK_1, (player, npc, clickType) -> {
            player.sendInterface(729);
            return HANDLED;
        });
        registerNpcAction(CLICK_1, (player, npc, clickType) -> {
            Strykewyrm.handleStomping(player, npc);
            return HANDLED;
        }, 9462);
        registerNpcListener(CLICK_2, (player, npc, clickType) -> {
            PickPocketableNPC pocket = PickPocketableNPC.get(npc.getId());
            if (pocket != null) {
                player.getActionManager().setAction(new PickPocketAction(npc, pocket));
                return HANDLED;
            }
            return DEFAULT;
        });
        registerNpcListener(EXAMINE, (player, npc, clickType) -> {
            handleExamine(player, npc);
            return RETURN;
        });
        registerNpcListener(ATTACK, (player, npc, clickType) -> {
            handleAttack(player, npc);
            return RETURN;
        });
    }

    @Override
    boolean isGlobalKey(Integer key) {
        return key < 0;
    }
}