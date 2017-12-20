package com.rs.game.npc.impl.boss.corp;

import com.rs.game.npc.Npc;
import com.rs.game.world.Entity;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class DarkEnergyCore extends Npc {

	private CorporealBeast beast;
	private Entity target;

	public DarkEnergyCore(CorporealBeast beast) {
		super(8127, beast, -1, true, true);
		setForceMultiArea(true);
		this.beast = beast;
		changeTarget = 2;
	}

	private int changeTarget;
	private int delay;

	@Override
	public void processNPC() {
		if (isDead() || hasFinished())
			return;
		if (delay > 0) {
			delay--;
			return;
		}
		if (changeTarget > 0) {
			if (changeTarget == 1) {
				ArrayList<Entity> possibleTarget = beast.getPossibleTargets();
				if (possibleTarget.isEmpty()) {
					finish();
					beast.removeDarkEnergyCore();
					return;
				}
				target = possibleTarget.get(Utils.getRandom(possibleTarget
						.size() - 1));
				setNextWorldTile(new WorldTile(target));
				World.sendProjectile(this, this, target, 1828, 0, 0, 40, 40,
						20, 0);
			}
			changeTarget--;
			return;
		}
		if (target == null || target.getX() != getX()
				|| target.getY() != getY() || target.getPlane() != getPlane()) {
			changeTarget = 3;
			return;
		}
		int damage = Utils.getRandom(50) + 50;
		target.applyHit(new Hit(this, damage, HitLook.REGULAR_DAMAGE));
		beast.heal(damage);
		delay = getPoison().isPoisoned() ? 10 : (int) 0.5D;
		if (target instanceof Player) {
			Player player = (Player) target;
			player.getPackets()
					.sendGameMessage(
							"The dark core creature steals some life from you for its master.");
		}
	}

	@Override
	public void sendDeath(Entity source) {
		super.sendDeath(source);
		beast.removeDarkEnergyCore();
	}

}
