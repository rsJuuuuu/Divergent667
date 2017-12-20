package com.rs.tools.dropEditor;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.npc.Drop;
import com.rs.tools.itemIcons.ItemIconsLoader;
import com.rs.utils.fxUtils.FXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * Created by Peng on 4.2.2017 22:16.
 */
public class DropPanel extends AnchorPane {

    private static ItemIconsLoader.RequestManager requestManager;

    static {
        requestManager = ItemIconsLoader.getRequestManager();
    }

    @FXML
    private Pane iconPane;
    @FXML
    private TitledPane dropPane;
    @FXML
    private TextField minField;
    @FXML
    private TextField maxField;
    @FXML
    private TextField rateField;

    private Drop drop;

    DropPanel(Drop drop, DropEditorController parent) {
        this.drop = drop;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/rs/tools/dropEditor/DropPanel.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        dropPane.setText(ItemDefinitions.getItemDefinitions(drop.getItemId()).getName());
        dropPane.setOnMouseClicked(event -> parent.select(DropPanel.this));
        rateField.setText(String.valueOf(drop.getRate()));
        minField.setText(String.valueOf(drop.getMinAmount()));
        maxField.setText(String.valueOf(drop.getMaxAmount()));
        FXUtils.setNumericInput(minField, "0");
        FXUtils.setNumericInput(maxField, "0");
        FXUtils.setNumericInput(rateField, "0");
        requestManager.loadBackground(drop.getItemId(), iconPane);

        rateField.focusedProperty().addListener((observable, oldValue, newValue) -> updateValues());
        minField.focusedProperty().addListener((observable, oldValue, newValue) -> updateValues());
        maxField.focusedProperty().addListener((observable, oldValue, newValue) -> updateValues());
    }

    private void updateValues() {
        drop.setMaxAmount(Integer.parseInt(maxField.getText()));
        drop.setMinAmount(Integer.parseInt(minField.getText()));
        drop.setRate(Double.parseDouble(rateField.getText()));
    }

    public Drop getDrop() {
        return drop;
    }
}
