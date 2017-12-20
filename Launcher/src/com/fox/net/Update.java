package com.fox.net;

import java.io.File;

import com.fox.Settings;

public class Update {

	public static byte updateExists() {
		File file = new File(Settings.SAVE_DIR + Settings.SAVE_NAME);
		if (!file.exists())
			return 1;
		
		String localCheck = Checksum.getLocalChecksum();
		String remoteCheck = Checksum.getRemoteChecksum();
		
		if (remoteCheck == null || localCheck == null)
			return 2;
		
		if (!remoteCheck.equalsIgnoreCase(localCheck))
			return 3;
		
		return 0;
	}

}
