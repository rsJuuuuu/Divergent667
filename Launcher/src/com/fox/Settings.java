package com.fox;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class Settings {

	public static final String SERVER_NAME = "Divergent";
	public static final String DOWNLOAD_URL = "DOWNLOAD_URL_HERE.jar";

	public static final String SAVE_NAME = "Divergent.jar";
	public static final String SAVE_DIR = System.getProperty("user.home") + File.separator;

	/**
	 * Used for checking online status
	 */
	public static final String SERVER_IP = "localhost";
	public static final int SERVER_PORT = 43594;

	public static final boolean enableMusicPlayer = false;
	public static final boolean addLinks = false;

	// Frame Settings
	public static final Dimension frameSize = new Dimension(500, 150);
	public static final Color tooltipColor = new Color(150,150,150);
	public static final Color borderColor = new Color(0, 0, 0);
	public static final Color backgroundColor = new Color(30, 30, 30);
	public static final Color primaryColor = new Color(226, 60, 40); // 226,
																		// 166,
																		// 59
	public static final Color iconShadow = new Color(0, 0, 0);
	public static final Color buttonDefaultColor = new Color(255, 255, 255);

	// link settings
	public static final String youtube = "";
	public static final String twitter = "";
	public static final String facebook = "";

	public static final String community = "";
	public static final String leaders = "";
	public static final String store = "";
	public static final String vote = "";
	public static final String bugs = "";

	public static ImageIcon getIconImage() {
		try {
			URL url = new URL("http://i43.tinypic.com/5vspbo.png");
			BufferedImage bufferedimage = ImageIO.read(url);
			return new ImageIcon(bufferedimage);
		} catch (Exception exception1) {
			exception1.printStackTrace();
		}
		;
		return null;
	}

}
