package com.rs.cores;

import com.rs.Settings;
import com.rs.game.npc.Npc;
import com.rs.game.world.World;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.stringUtils.TimeUtils;

public final class WorldThread extends Thread {

	protected WorldThread() {
		setPriority(Thread.MAX_PRIORITY);
		setName("World Thread");
	}

	@Override
	public final void run() {
		while (!CoresManager.shutdown) {
			long currentTime = TimeUtils.getTime();
			try {
				// long debug = Utils.getLife();
				WorldTasksManager.processTasks();
				// System.out.print("TASKS: "+(Utils.getLife()-debug));
				// debug = Utils.getLife();
				for (Player player : World.getPlayers()) {
					if (player == null || !player.hasStarted() || player.hasFinished())
						continue;
					if (currentTime - player.getPacketsDecoderPing() > Settings.MAX_DECODER_PING_DELAY
							&& player.getSession().getChannel().isOpen())
						player.getSession().getChannel().close();
					player.processEntity();
				}
			//	System.out.print(" ,PLAYERS PROCESS: "+(Utils.getLife()-debug));
			//	 debug = Utils.getLife();
				for (Npc npc : World.getNPCs()) {
					if (npc == null || npc.hasFinished())
						continue;
					npc.processEntity();
				}
				//	 System.out.print(" ,NPCS PROCESS: "+(Utils.getLife()-debug));
				//	 debug = Utils.getLife();

				for (Player player : World.getPlayers()) {
					if (player == null || !player.hasStarted() || player.hasFinished())
						continue;
					player.getPackets().sendLocalPlayersUpdate();
					player.getPackets().sendLocalNPCsUpdate();
				}
				// System.out.print(" ,PLAYER UPDATE: "+(Utils.getLife()-debug)+", "+World.getPlayers().size()+", "+World.getNPCs().size());
				// debug = Utils.getLife();
				for (Player player : World.getPlayers()) {
					if (player == null || !player.hasStarted()
							|| player.hasFinished())
						continue;
					player.resetMasks();
				}
				for (Npc npc : World.getNPCs()) {
					if (npc == null || npc.hasFinished())
						continue;
					npc.resetMasks();
				}
			} catch (Throwable e) {
				e.printStackTrace();
			}
			// System.out.println(" ,TOTAL: "+(Utils.getLife()-currentTime));
			LAST_CYCLE_CTM = TimeUtils.getTime();
			long sleepTime = Settings.WORLD_CYCLE_TIME + currentTime
					- LAST_CYCLE_CTM;
			if (sleepTime <= 0)
				continue;
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static long LAST_CYCLE_CTM;

}
