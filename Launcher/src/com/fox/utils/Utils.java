package com.fox.utils;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.ImageIcon;

import com.fox.Settings;
import com.fox.components.AppFrame;

public class Utils {

	public static void main(String[] args) {
		System.out.println(getServerTime());
	}

	public static DateFormat df;

	public static String getServerTime() {
		if (df == null) {
			df = new SimpleDateFormat("h:mm:ss a");
			df.setTimeZone(TimeZone.getTimeZone("EST"));
		}
		return df.format(new Date()).replace("ip.", "PM").replace("ap.", "AM");
	}

	/**
	 * Uses the ProcessBuilder class to launch the client.jar from the specified
	 * folder
	 */
	public static void launchClient() {
		AppFrame.playButton.setEnabled(true);
		try {
			ProcessBuilder pb = new ProcessBuilder(
					new String[] { "java", "-jar", Settings.SAVE_DIR + Settings.SAVE_NAME });
			pb.directory(new File(System.getProperty("java.home") + File.separator + "bin"));
			final Process proc = pb.start();
			AppFrame.playButton.setEnabled(false);
			new ProcessTest(proc).startTesting();
		} catch (Exception e) {

		}
	}

	/**
	 * Checks if the server is online or offline by attempting to make a TCP
	 * connection
	 * 
	 * @return true if it connects (ie. it is online)
	 */
	public static boolean hostAvailabilityCheck() {
		try (Socket s = new Socket(Settings.SERVER_IP, Settings.SERVER_PORT)) {
			s.setTcpNoDelay(true);
			return true;
		} catch (IOException ex) {
			/* ignore */
		}
		return false;
	}

	/**
	 * Loads a custom font from the data/font folder. Font must be either otf or
	 * ttf.
	 * 
	 * @param fontName
	 * @param size
	 */
	public static void setFont(Component c, String fontName, float size) {
		try {
			Font font = Font.createFont(0, Utils.class.getResource("/data/fonts/" + fontName).openStream());
			GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
			genv.registerFont(font);
			font = font.deriveFont(size);
			c.setFont(font);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Opens the users browser and goes to the specified URL
	 * 
	 * @param url
	 */
	public static void openWebpage(String url) {
		Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
		if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
			try {
				desktop.browse(new URL(url).toURI());
			} catch (Exception e) {
				// e.printStackTrace();
			}
		}
	}

	private static long timeCorrection;
	private static long lastTimeUpdate;

	public static synchronized long currentTimeMillis() {
		long l = System.currentTimeMillis();
		if (l < lastTimeUpdate)
			timeCorrection += lastTimeUpdate - l;
		lastTimeUpdate = l;
		return l + timeCorrection;
	}

	public static ImageIcon getImage(String name) {
		return new ImageIcon(Utils.class.getResource("/data/img/" + name));
	}
}
