package com.fox.net;

import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Observable;

import com.fox.Settings;
import com.fox.components.AppFrame;
import com.fox.utils.Utils;

public class Download extends Observable implements Runnable {

	private static final int MAX_BUFFER_SIZE = 1024;
	public static final String STATUSES[] = { "Downloading", "Paused", "Complete", "Cancelled", "Error" };

	public static final int DOWNLOADING = 0;
	public static final int PAUSED = 1;
	public static final int COMPLETE = 2;
	public static final int CANCELLED = 3;
	public static final int ERROR = 4;

	private URL url;
	private int size;
	private int downloaded;
	private int status;

	public Download(String url) {
		try {
			this.url = new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		size = -1;
		downloaded = 0;
		status = DOWNLOADING;
	}

	public String getUrl() {
		return url.toString();
	}

	public int getSize() {
		return size;
	}

	public float getProgress() {
		return ((float) downloaded / size) * 100;
	}

	public int getStatus() {
		return status;
	}

	public void pause() {
		status = PAUSED;
		stateChanged();
	}

	public void resume() {
		status = DOWNLOADING;
		stateChanged();
		download();
	}

	public void cancel() {
		status = CANCELLED;
		stateChanged();
	}

	private void error() {
		status = ERROR;
		stateChanged();
	}

	public void download() {
		Thread thread = new Thread(this);
		thread.start();
	}

	@SuppressWarnings("unused")
	private String getFileName(URL url) {
		String fileName = url.getFile();
		return fileName.substring(fileName.lastIndexOf('/') + 1);
	}

	public void backup() {
		File file = new File(Settings.SAVE_DIR + Settings.SAVE_NAME + ".temp");
		if (!file.exists())
			return;
		file.renameTo(new File(Settings.SAVE_DIR + Settings.SAVE_NAME));
	}

	public void backupOld() {
		File file = new File(Settings.SAVE_DIR + Settings.SAVE_NAME);
		if (!file.exists())
			return;
		file.renameTo(new File(Settings.SAVE_DIR + Settings.SAVE_NAME + ".temp"));
	}

	public void removeBackup() {
		File file = new File(Settings.SAVE_DIR + Settings.SAVE_NAME + ".temp");
		if (!file.exists())
			return;
		file.delete();
	}

	public void run() {
		AppFrame.playButton.setEnabled(false);
		RandomAccessFile file = null;
		InputStream stream = null;
		backupOld();
		try {
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Range", "bytes=" + downloaded + "-");
			connection.connect();

			if (connection.getResponseCode() / 100 != 2) {
				error();
			}

			int contentLength = connection.getContentLength();

			if (contentLength < 1) {
				error();
			}

			if (size == -1) {
				size = contentLength;
				stateChanged();
			}

			file = new RandomAccessFile(Settings.SAVE_DIR + Settings.SAVE_NAME, "rw");
			file.seek(downloaded);

			stream = connection.getInputStream();

			int lastNum = 0;

			while (status == DOWNLOADING) {

				byte buffer[];

				if (size - downloaded > MAX_BUFFER_SIZE) {
					buffer = new byte[MAX_BUFFER_SIZE];
				} else {
					buffer = new byte[size - downloaded];
				}

				int read = stream.read(buffer);

				if (read == -1)
					break;

				int progress = (int) getProgress();

				if (progress > lastNum) {
					AppFrame.pbar.setValue(progress);
					lastNum = progress;
					AppFrame.pbar.setString("Downloading Update: " + progress + "%");
				}

				file.write(buffer, 0, read);
				downloaded += read;
				stateChanged();
			}

			if (status == DOWNLOADING) {
				removeBackup();
				status = COMPLETE;
				stateChanged();
				AppFrame.pbar.setValue(0);
				AppFrame.pbar.setString("Click Launch to play " + Settings.SERVER_NAME + "!");
				Utils.launchClient();
			}
		} catch (Exception e) {
			backup();
			error();
		} finally {
			if (file != null)
				try {
					file.close();
				} catch (Exception e) {
				}
			if (stream != null)
				try {
					stream.close();
				} catch (Exception e) {
				}
		}
	}

	private void stateChanged() {
		setChanged();
		notifyObservers();
	}

}