package com.rs.utils.stringUtils;

/**
 * Created by Peng on 25.11.2016 15:45.
 */
public class TimeUtils {
    private static long timeCorrection;
    private static long lastTimeUpdate;

    public static boolean timePassed(long since, long offset) {
        return timeSince(since) >= offset;
    }

    /**
     * How long has it been since this point of time
     */
    private static long timeSince(Long time) {
        return getTime() - time;
    }

    public static synchronized long getTime() {
        long l = System.currentTimeMillis();
        if (l < lastTimeUpdate) timeCorrection += lastTimeUpdate - l;
        lastTimeUpdate = l;
        return l + timeCorrection;
    }

    /**
     * Format a milliseconds time into seconds and minutes used for pot delays etc
     *
     * @param time the time to format in milliseconds
     * @return the formatted time string
     */
    public static String formatTime(long time) {
        int seconds = (int) time / 1000;
        int minutes = 0;
        while (seconds > 60) {
            seconds -= 60;
            minutes++;
        }
        return minutes + ":" + seconds;
    }

}
