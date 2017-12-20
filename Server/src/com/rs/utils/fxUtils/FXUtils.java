package com.rs.utils.fxUtils;

import com.sun.istack.internal.Nullable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.AnchorPane;
import org.pmw.tinylog.Logger;

import java.util.Optional;

/**
 * Created by Peng on 4.2.2017 22:25.
 */
public class FXUtils {

    /**
     * Set the anchor pane constants of a node
     */
    public static void setAnchors(Node node, double left, double right, double top, double bottom) {
        if (left != -1) AnchorPane.setLeftAnchor(node, left);
        if (right != -1) AnchorPane.setRightAnchor(node, right);
        if (top != -1) AnchorPane.setTopAnchor(node, top);
        if (bottom != -1) AnchorPane.setBottomAnchor(node, bottom);
    }

    /**
     * Ask the user about something
     *
     * @return true if user clicked ok
     */
    public static boolean confirm(String title, String header, String question) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(question);

        Optional<ButtonType> result = alert.showAndWait();
        return result.isPresent() && result.get().equals(ButtonType.OK);
    }

    /**
     * Ask the user for some text input
     */
    public static String getTextInput(String title, String header, String question) {
        TextInputDialog dialog = new TextInputDialog(header);
        dialog.setTitle(title);
        dialog.setHeaderText(header);
        dialog.setContentText(question);
        String resultString = null;
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) resultString = result.get();
        return resultString;
    }

    /**
     * Show some info to the user
     */
    public static void showAlert(String title, String header, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setWidth(800);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Make a text field only accept numeric input
     */
    public static void setNumericInput(TextField input, @Nullable String defaultValue) {
        input.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                input.setText(newValue.replaceAll("[^\\d]", ""));
            }
            if (defaultValue != null) if (input.getText().isEmpty()) input.setText(defaultValue);
        });
    }

    /**
     * Get an integer from the user
     *
     * @param cancelValue value to be returned if the user cancelled the dialogue
     */
    public static int getIntegerInput(String title, String header, String question, int cancelValue) {
        while (true) {
            String amountString = getTextInput(title, header, question);
            if (amountString == null) return cancelValue;
            else {
                int value;
                try {
                    value = Integer.parseInt(amountString);
                    return value;
                } catch (NumberFormatException nfe) {
                    showAlert("title", "Invalid input string", "Enter a number.");
                }
            }
        }
    }

    /**
     * Drag constants
     */
    public static final String DRAG_INDEX = "DRAG_INDEX";
    public static final String ITEM_ID = "ITEM_ID";
    public static final String ITEM_AMOUNT = "ITEM_AMOUNT";
    public static final String ORGANIZE_DRAG = "ORGANIZE_DRAG";
    public static final String SPLIT_VALUE = "!";

    /**
     * Parse a certain parameter from input given by a drag event
     */
    private static String getDragParameter(String string, String key) {
        if (!string.contains(key)) return "";
        String dragPart = string.substring(string.indexOf(key) + key.length());
        try {
            return dragPart.substring(dragPart.indexOf("(") + 1, dragPart.indexOf(")"));
        } catch (Exception e) {
            Logger.error("Invalid drag format: " + e.getCause().getMessage());
            return "";
        }
    }

    /**
     * Construct a drag content string
     */
    public static String constructDragContent(Object... params) {
        boolean bracketType = false;
        StringBuilder builder = new StringBuilder();
        for (Object param : params) {
            builder.append(param).append(bracketType ? ")" : "(");
            bracketType = !bracketType;
        }
        return builder.toString();
    }

    /**
     * Get an integer with a key from drag content
     */
    public static int parseDragInteger(String content, String key) {
        try {
            return Integer.valueOf(getDragParameter(content, key));
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * Get a boolean value with a key from drag content
     */
    public static boolean parseDragBoolean(String content, String key) {
        try {
            return Boolean.valueOf(getDragParameter(content, key));
        } catch (Exception e) {
            return false;
        }
    }
}
