package com.rs.game.player.content.skills.construction;

import java.io.Serializable;

/**
 * Created by Peng on 18.9.2016.
 */
public class HouseObject implements Serializable {

    private static final long serialVersionUID = 2011232556974180375L;

    private int x;
    private int y;
    private int rotation;
    private int objectId;
    private int objectType;

    /**
     * @param x          coordinate on room
     * @param y          coordinate on room
     * @param rotation   rotation
     * @param objectType type
     * @param objectId   id
     */
    HouseObject(int x, int y, int rotation, int objectType, int objectId) {
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        this.objectId = objectId;
        this.objectType = objectType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRotation() {
        return rotation;
    }

    public int getObjectId() {
        return objectId;
    }

    public int getObjectType() {
        return objectType;
    }

    @Override
    public String toString() {
        return "HouseObject{" + "x=" + x + ", y=" + y + ", rotation=" + rotation + ", objectId=" + objectId + ", " +
                "objectType=" + objectType + '}';
    }
}
