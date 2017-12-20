package com.rs.game.player.controllers.impl;

import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.game.player.controllers.Controller;

public class CorpBeastController extends Controller {

	@Override
	public void start() {

	}

	@Override
	public boolean processObjectClick1(WorldObject object) {
		if (object.getId() == 37929) {
			removeController();
			player.stopAll();
            player.setNextWorldTile(new WorldTile(2970, 4384, 2));
            return false;
		}
		return true;
	}

	@Override
	public void magicTeleported(int type) {
		removeController();
	}

	@Override
	public boolean sendDeath() {
		removeController();
		return true;
	}

	@Override
	public boolean login() {
		return false; // so doesnt remove script
	}

	@Override
	public boolean logout() {
		return false; // so doesnt remove script
	}

}
