package com.rs.game.player.dialogues.impl.skills.slayer;

import com.rs.game.actionHandling.Handler;
import com.rs.game.player.content.skills.slayer.SlayerTask;
import com.rs.game.player.dialogues.Dialogue;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.*;

/**
 * Created by Peng on 2.8.2016.
 */
public class SlayerMaster extends Dialogue implements Handler {

    @Override
    public void start() {
        if (parameters.length > 0) switch ((String) parameters[0]) {
            case "get_task":
                stage = 2;
                break;
        }
        else {
            sendNpcDialogue("Kuradal", "Hello warrior, what can I do for you?", 9085, 9827);
            stage = 1;
        }
    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (stage == 1) {
            sendOptions("Slayer Options", "I would like a new Slayer Task", "Reset my slayer task (Cost: 30 "
                                                                            + "points)", "Tell me my current task",
                    "Show me the Rewards Shop",
                    "I would like to toggle boss " + "tasks");
            stage = 2;
        } else if (stage == 2) {
            int amount;
            switch (componentId) {
                case 1:
                    if (player.getTask() != null) {
                        sendNpcDialogue("Kuradal", "Please reset or finish your task if you want another!", 9085, 9827);
                        stage = 1;
                        return;
                    }
                    SlayerTask.setTask(player);
                    player.getCoopSlayer().setNextTask();
                    amount = player.getTask().getTaskAmount();
                    sendNpcDialogue("Kuradal",
                            "Your new task is to kill: x" + amount + " " + player.getTask().getName(), 9085, 9827);
                    stage = 1;
                    break;
                case 2:
                    if (player.getSlayerPoints() >= 30 && player.getTask() != null) {
                        player.setTask(null);
                        player.setSlayerPoints(player.getSlayerPoints() - 30);
                        player.getCoopSlayer().disband();
                        player.sendMessage("Your task has been reset.");
                        end();
                    } else {
                        sendNpcDialogue("Kuradal", "Please come back when you have at least 30 slayer points" + ". "
                                                   + "And have a task", 9085, 9827);
                        stage = 1;
                    }
                    break;
                case 3:
                    if (player.getTask() == null) {
                        sendNpcDialogue("Kuradal", "You do not have a task.", 9085, 9827);
                    } else {
                        amount = player.getTask().getTaskAmount();
                        sendNpcDialogue("Kuradal",
                                "Your current task is to kill: x" + amount + " " + player.getTask().getName()
                                + ".", 9085, 9827);
                    }
                    stage = 1;
                    break;
                case 4:
                    end();
                    player.getInterfaceManager().sendInterface(164);
                    player.getPackets().sendIComponentText(164, 20, "" + player.getSlayerPoints() + "");
                    break;
                case 5:
                    player.toggleBossTasks();
                    sendNpcDialogue("Kuradal", "You will " + (player.isAllowBossTasks() ? "now " : "no longer ")
                                               + "be assigned boss slayer tasks.", 9085, 9827);
                    stage = 3;
                    break;
            }
        }else{
            end();
        }

    }

    @Override
    public void finish() {
    }

    @Override
    public void register() {
        registerNpcShop(CLICK_3, "Slayer shop", 9085);
        registerNpcDialogue(9085, CLICK_1, "SlayerMaster");
        registerNpcDialogue(9085, CLICK_2, "SlayerMaster", "get_task");
        registerNpcAction(CLICK_4, (player, npc, clickType) -> {
            player.getInterfaceManager().sendInterface(161);
            player.getPackets().sendIComponentText(164, 20, "" + player.getSlayerPoints() + "");
            return RETURN;
        });
    }
}
