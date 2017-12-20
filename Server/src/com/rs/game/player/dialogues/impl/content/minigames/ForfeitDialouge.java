package com.rs.game.player.dialogues.impl.content.minigames;

import com.rs.game.player.dialogues.Dialogue;

public class ForfeitDialouge extends Dialogue {

    @Override
    public void start() {
        sendOptions("Forfeit Duel?", "Yes.", "No.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
        switch (componentId) {
            case 1:
                if (!player.getDuelConfigurations().getRule(7)) {
                    player.getDuelConfigurations().endDuel(player, false, false);
                    player.getDuelConfigurations().endDuel(player.getDuelConfigurations().getOther(player), false,
                            false);
                } else {
                    sendText("You can't forfeit during this duel.");
                }
                break;
            case 2:
                break;
        }
        end();
    }

    @Override
    public void finish() {

    }

}
