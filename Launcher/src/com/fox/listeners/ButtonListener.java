package com.fox.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.fox.Launcher;
import com.fox.Settings;
import com.fox.components.AppFrame;
import com.fox.net.Download;
import com.fox.net.Update;
import com.fox.utils.Utils;

public class ButtonListener implements ActionListener {

	public static Download download;

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		case "_":
			Launcher.app.setState(JFrame.ICONIFIED);
			break;

		case "X":
			System.exit(0);
			break;

		case "play":
			Thread t = new Thread() {
				public void run() {

					AppFrame.playButton.setEnabled(false);
					AppFrame.pbar.setString("Checking for Client Updates...");

					byte status = Update.updateExists();
					if (status == 0) {
						AppFrame.pbar.setString("Now Launching " + Settings.SERVER_NAME + "!");
						Utils.launchClient();
						return;
					}
					if (status == 1) {
						download = new Download(Settings.DOWNLOAD_URL);
						download.download();
					}
					if (status == 3) {
						if (download == null) {
							download = new Download(Settings.DOWNLOAD_URL);
							download.download();
						} else {
							if (download.getStatus() == Download.COMPLETE)
								return;

							if (download.getStatus() == Download.DOWNLOADING) {
								download.pause();
							} else if (download.getStatus() == Download.PAUSED) {
								download.resume();
							}
						}
						return;
					}
				}
			};
			t.start();
			break;

		default:
			System.out.println(e.getActionCommand());
			break;

		}
	}

}
