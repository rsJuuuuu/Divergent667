package com.rs.game.player.cutscenes.actions;

import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.player.cutscenes.Cutscene;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;

public class CreateNPCAction extends CutsceneAction {

	private final int id;
	private final int x;
	private final int y;
	private final int plane;

	public CreateNPCAction(int cachedObjectIndex, int id, int x, int y,
						   int plane, int actionDelay) {
		super(cachedObjectIndex, actionDelay);
		this.id = id;
		this.x = x;
		this.y = y;
		this.plane = plane;
	}

	@Override
	public void process(Player player, Object[] cache) {
		Cutscene scene = (Cutscene) cache[0];
		if (cache[getCachedObjectIndex()] != null)
			scene.destroyCache(cache[getCachedObjectIndex()]);
		Npc npc = (Npc) (cache[getCachedObjectIndex()] = World
				.spawnNPC(id,
						new WorldTile(scene.getBaseX() + x, scene.getBaseY()
								+ y, plane), -1, true, true));
		npc.setRandomWalk(false);
	}

}
