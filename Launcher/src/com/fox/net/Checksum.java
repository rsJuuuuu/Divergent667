package com.fox.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.fox.Settings;

public class Checksum {
	
	public static String getLocalChecksum() {
		File local = new File(Settings.SAVE_DIR + Settings.SAVE_NAME);
		try (FileInputStream fis = new FileInputStream(local)) {
			return Checksum.calculateMd5(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getRemoteChecksum() {
		try (InputStream stream = new URL(Settings.DOWNLOAD_URL).openStream()) {
			return  Checksum.calculateMd5(stream);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String calculateMd5(final InputStream instream) {
	       return calculateDigest(instream, "MD5");
	}
	
	private static String calculateDigest(final InputStream instream, final String algorithm) {
		final byte[] buffer = new byte[4096];
		final MessageDigest messageDigest = getMessageDigest(algorithm);
		messageDigest.reset();
		int bytesRead;
		try {
			while ((bytesRead = instream.read(buffer)) != -1) {
				messageDigest.update(buffer, 0, bytesRead);
			}
		} catch (IOException e) {
			System.err.println("Error making a '" + algorithm + "' digest on the inputstream");
		}
		return toHex(messageDigest.digest());
	}

	public static String toHex(final byte[] ba) {
		int baLen = ba.length;
		char[] hexchars = new char[baLen * 2];
		int cIdx = 0;
		for (int i = 0; i < baLen; ++i) {
			hexchars[cIdx++] = hexdigit[(ba[i] >> 4) & 0x0F];
			hexchars[cIdx++] = hexdigit[ba[i] & 0x0F];
		}
		return new String(hexchars);
	}
	
	public static MessageDigest getMessageDigest(final String algorithm) {
       MessageDigest messageDigest = null;
       try {
           messageDigest = MessageDigest.getInstance(algorithm);
       } catch (NoSuchAlgorithmException e) {
           System.err.println("The '" + algorithm + "' algorithm is not available");
       }
       return messageDigest;
   }
	
	private static final char[] hexdigit = { 
		'0', '1', '2', '3', '4', '5', 
		'6', '7', '8', '9', 'a', 'b', 
		'c', 'd', 'e', 'f' 
	};

	
}
