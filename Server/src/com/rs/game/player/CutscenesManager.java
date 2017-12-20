package com.rs.game.player;

import com.rs.game.player.cutscenes.Cutscene;
import com.rs.game.player.cutscenes.CutSceneHandler;

public final class CutscenesManager {

	transient private Player player;
	private Cutscene cutscene;

	/*
	 * cutscene play stuff
	 */

	public CutscenesManager(Player player) {
		this.player = player;
	}

	public void process() {
		if (cutscene == null)
			return;
		if (cutscene.process(player))
			return;
		cutscene = null;
	}

	public void logout() {
		if (hasCutscene())
			cutscene.logout(player);
	}

	public boolean hasCutscene() {
		return cutscene != null;
	}

	public boolean play(Object key) {
		if(hasCutscene())
			return false;
		Cutscene cutscene = (Cutscene) (key instanceof Cutscene ? key
				: CutSceneHandler.getCutscene(key));
		if (cutscene == null)
			return false;
		cutscene.createCache(player);
		this.cutscene = cutscene;
		return true;
	}

}
