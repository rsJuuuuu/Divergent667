package com.rs.game.player.cutscenes.actions;

import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.player.cutscenes.Cutscene;
import com.rs.game.world.WorldTile;

public class NPCFaceTileAction extends CutsceneAction {

	private final int x;
	private final int y;

	public NPCFaceTileAction(int cachedObjectIndex, int x, int y,
							 int actionDelay) {
		super(cachedObjectIndex, actionDelay);
		this.x = x;
		this.y = y;
	}

	@Override
	public void process(Player player, Object[] cache) {
		Cutscene scene = (Cutscene) cache[0];
		Npc npc = (Npc) cache[getCachedObjectIndex()];
		npc.setNextFaceWorldTile(new WorldTile(scene.getBaseX() + x, scene
				.getBaseY() + y, npc.getPlane()));
	}

}
