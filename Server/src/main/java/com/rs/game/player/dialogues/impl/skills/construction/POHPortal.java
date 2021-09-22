package com.rs.game.player.dialogues.impl.skills.construction;

import com.rs.game.player.dialogues.Dialogue;

public class POHPortal extends Dialogue {


    @Override
    public void start() {
        sendOptions("What do you want to do?", "Enter your house.", "Enter your house (build "
                + "mode).");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (stage == -1) {
            switch (componentId) {
                case 1:
                    player.getHouse().setBuildMode(false);
                    player.getHouse().enterHouse();
                    end();
                    break;
                case 2:
                    player.getHouse().setBuildMode(true);
                    player.getHouse().enterHouse();
                    end();
                    break;
            }
        }
    }

    @Override
    public void finish() {

    }

}
