package com.rs.game.player.content.skills.construction;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;

public class RoomReference implements Serializable {

    private static final long serialVersionUID = 738514883298748999L;

    private CopyOnWriteArrayList<HouseObject> roomObjects = new CopyOnWriteArrayList<>();

    public RoomReference(Rooms.Room room, int x, int y, int plane, int rotation) {
        this.room = room;
        this.x = (byte) x;
        this.y = (byte) y;
        this.plane = (byte) plane;
        this.rotation = (byte) rotation;
    }

    private Rooms.Room room;
    private byte x, y, plane, rotation;

    public byte getRotation() {
        return rotation;
    }

    public byte getPlane() {
        return plane;
    }

    public byte getY() {
        return y;
    }

    public byte getX() {
        return x;
    }

    public Rooms.Room getRoom() {
        return room;
    }

    public CopyOnWriteArrayList<HouseObject> getObjects() {
        return roomObjects;
    }

    public void setRotation(int rotation) {
        this.rotation = (byte) rotation;
    }
}
