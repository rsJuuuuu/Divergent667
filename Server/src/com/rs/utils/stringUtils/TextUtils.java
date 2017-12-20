package com.rs.utils.stringUtils;

import java.awt.*;
import java.text.DecimalFormat;

/**
 * Created by Peng on 25.11.2016 15:44.
 */
public class TextUtils {

    private static DecimalFormat decimalFormat = new DecimalFormat("#.##");

    /**
     * Allow max 2 digits on a double
     */
    public static String trim(double decimal) {
        return decimalFormat.format(decimal);
    }

    /**
     * Combine the array members into one string
     */
    public static String combine(String[] array) {
        StringBuilder builder = new StringBuilder();
        for (String string : array) {
            if (builder.length() > 0) builder.append(" ");
            builder.append(string);
        }
        return builder.toString();
    }

    /**
     * Combine part of an array to one string
     */
    public static String combine(String[] fullArray, int combineStart, int offset) {
        String[] result = new String[offset];
        System.arraycopy(fullArray, combineStart, result, 0,
                fullArray.length < offset + combineStart ? fullArray.length - combineStart : offset);
        return combine(result);
    }

    /**
     * Format player name with _s
     */
    public static String formatPlayerNameForProtocol(String name) {
        if (name == null) return "";
        name = name.replaceAll(" ", "_");
        name = name.toLowerCase();
        return name;
    }

    /**
     * Add capital starting and remove _s
     */
    public static String formatPlayerNameForDisplay(String name) {
        if (name == null) return "";
        name = name.replaceAll("_", " ");
        name = name.toLowerCase();
        StringBuilder newName = new StringBuilder();
        boolean wasSpace = true;
        for (int i = 0; i < name.length(); i++) {
            if (wasSpace) {
                newName.append(("" + name.charAt(i)).toUpperCase());
                wasSpace = false;
            } else {
                newName.append(name.charAt(i));
            }
            if (name.charAt(i) == ' ') {
                wasSpace = true;
            }
        }
        return newName.toString();
    }

    /**
     * Format message for chat
     */
    public static String fixChatMessage(String message) {
        StringBuilder newText = new StringBuilder();
        boolean wasSpace = true;
        for (int i = 0; i < message.length(); i++) {
            if (wasSpace) {
                newText.append(("" + message.charAt(i)).toUpperCase());
                if (!String.valueOf(message.charAt(i)).equals(" ")) wasSpace = false;
            } else newText.append(("" + message.charAt(i)).toLowerCase());
            if (String.valueOf(message.charAt(i)).contains(".") || String.valueOf(message.charAt(i)).contains("!")
                || String.valueOf(message.charAt(i)).contains("?")) wasSpace = true;
        }
        return newText.toString();
    }

    /**
     * Make it yellow and add + if needed
     */
    public static String formatItemBonus(int bonus, boolean newRow) {
        return (newRow ? "<br>" : "") + (bonus > 0 ? "+" : "") + bonus;
    }

    /**
     * Convert an awt color (rgb) to hex for use in client
     */
    public static String convertToHex(Color color) {
        return Integer.toHexString(color.getRGB()).substring(2);
    }

}
