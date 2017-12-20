package com.rs.game.world;

import com.rs.cache.loaders.ObjectDefinitions;

public class WorldObject extends WorldTile {

    private static final long serialVersionUID = 5945496773263752522L;

	private int id;
	private int type;
	private int rotation;
	private int life;

	public WorldObject(int id, int type, int rotation, int x, int y, int plane) {
		super(x, y, plane);
		this.id = id;
		this.type = type;
		this.rotation = rotation;
		this.life = 1;
	}
	
	public WorldObject(int id, int type, int rotation, int x, int y, int plane, int life) {
		super(x, y, plane);
		this.id = id;
		this.type = type;
		this.rotation = rotation;
		this.life = life;
	}

    @Override
    public String toString() {
        return "WorldObject{name=" + getDefinitions().name + ", id=" + id + ", type=" + type + ", rotation=" +
                rotation + ", life=" + life + "} " + super.toString();
    }

    public int getId() {
        return id;
	}

	public int getType() {
        return type;
    }

	public int getRotation() {
		return rotation;
	}

	public void setRotation(int rotation) {
		this.rotation = rotation;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	public void decrementObjectLife() {
		this.life--;
	}

	public ObjectDefinitions getDefinitions() {
		return ObjectDefinitions.getObjectDefinitions(id);
	}

    public void setId(int id) {
        this.id = id;
    }
}
