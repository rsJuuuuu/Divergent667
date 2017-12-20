package com.rs.game.npc.impl.others;

import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.game.npc.Npc;
import com.rs.game.player.OwnedObjectManager;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Hunter.HunterNPC;

import java.util.List;

@SuppressWarnings("serial")
public class HuntNpc extends Npc {

	public HuntNpc(int id, WorldTile tile, int mapAreaNameHash,
                   boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
	}

	@Override
	public void processNPC() {
		super.processNPC();
		List<WorldObject> objects = World.getRegion(getRegionId())
				.getSpawnedObjects();
		if (objects != null) {
			final HunterNPC info = HunterNPC.forId(getId());
			int objectId = info.getEquipment().getObjectId();
			for (WorldObject object : objects) {
				if (object.getId() == objectId) {
					if (OwnedObjectManager.convertIntoObject(object,
							new WorldObject(info.getTransformObjectId(), 10, 0,
									this.getX(), this.getY(), this.getPlane()),
                            player -> player != null && player.getSkills().getLevel(Skills.HUNTER) >= info.getLevel())) {
						setSpawnTask(); // auto finishes
					}
				}
			}
		}
	}
}
