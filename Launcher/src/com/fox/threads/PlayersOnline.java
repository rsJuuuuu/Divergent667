package com.fox.threads;

import java.net.URL;
import java.util.Scanner;

import com.fox.components.AppFrame;

public class PlayersOnline implements Runnable {

	@Override
	public void run() {
		while(true) {
			try {
				readPlayersOnline();
				System.gc();
				Thread.sleep(30000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void readPlayersOnline() {
		try (Scanner scanner = new Scanner(new URL("http://as-pk.net/players.txt").openStream())) {
			scanner.useDelimiter("/r/n");
			if (!scanner.hasNextInt()) {
				AppFrame.playerCount.setText("Error fetching Players Online");
				return;
			}
			int count = scanner.nextInt();
			AppFrame.playerCount.setText("There are "+count+" player(s) Online!");
		} catch (Exception e) {
			AppFrame.playerCount.setText("Error fetching Players Online");
		}
	}
	
}
