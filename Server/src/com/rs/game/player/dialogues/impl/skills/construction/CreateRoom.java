package com.rs.game.player.dialogues.impl.skills.construction;

import com.rs.game.player.content.skills.construction.RoomReference;
import com.rs.game.player.content.skills.construction.Rooms;
import com.rs.game.player.dialogues.Dialogue;

public class CreateRoom extends Dialogue {

    private RoomReference room;

    @Override
    public void start() {
        this.room = (RoomReference) parameters[0];
        sendPreview();
    }

    public void sendPreview() {
        sendOptions("Select an Option", "Rotate clockwise", "Rotate anticlockwise.",
                "Build" + ".", "Cancel");
        player.getHouse().previewRoom(room, false);
    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (componentId == 4) {
            end();
            return;
        }
        if (componentId == 3) {
            end();
            Rooms.createRoom(player, room);
            return;
        }
        player.getHouse().previewRoom(room, true);
        room.setRotation((room.getRotation() + (componentId == 1 ? 1 : -1)) & 0x3);
        sendPreview();
    }

    @Override
    public void finish() {
        player.getHouse().previewRoom(room, false);
    }

}
