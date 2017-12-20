package com.fox.utils;

import com.fox.Settings;
import com.fox.components.AppFrame;

public class ProcessTest {

	private Process proc;
	
	public ProcessTest(Process proc) {
		this.proc = proc;
	}
	
	public void startTesting() {
		new Thread() {
			@Override
			public void run() {
				while(true) {
					try {
						proc.exitValue();
						AppFrame.pbar.setString("Click Launch to play "+Settings.SERVER_NAME+"!");
						AppFrame.playButton.setEnabled(true);
	    	    		break;
					} catch (Exception e) {
						try {
							AppFrame.pbar.setString(""+Settings.SERVER_NAME+" is currently running.");
							Thread.sleep(600L);
						} catch (InterruptedException ex) {
							e.printStackTrace();
						}
					}
				}
			}
		}.start();
	}
}
