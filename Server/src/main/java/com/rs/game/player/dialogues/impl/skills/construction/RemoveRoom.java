package com.rs.game.player.dialogues.impl.skills.construction;

import com.rs.game.player.content.skills.construction.RoomReference;
import com.rs.game.player.dialogues.Dialogue;

public class RemoveRoom extends Dialogue {

    private RoomReference room;

    @Override
    public void start() {
        this.room = (RoomReference) parameters[0];
        sendOptions("Remove the " + room.getRoom().getName() + "?", "Yes.", "No.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (componentId == 1) player.getHouse().removeRoom(room);
        end();
    }

    @Override
    public void finish() {

    }

}
