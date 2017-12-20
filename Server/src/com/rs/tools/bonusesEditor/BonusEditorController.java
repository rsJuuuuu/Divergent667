package com.rs.tools.bonusesEditor;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.utils.Constants;
import com.rs.utils.fxUtils.propertyItems.IntegerItem;
import com.rs.utils.game.itemUtils.ItemBonuses;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import org.controlsfx.control.PropertySheet;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Peng on 29.7.2016.
 */
public class BonusEditorController {

    public ListView<String> itemList;
    public TextField searchField;
    public PropertySheet propertySheet;

    private HashMap<Integer, int[]> itemBonuses;

    private IntegerItem[] bonuses = new IntegerItem[18];

    private int[] currentData;

    public BonusEditorController() throws IOException {
        Cache.init();
        ItemBonuses.init();
        itemBonuses = ItemBonuses.getItemBonusesMap();
    }

    void init() {
        for (int itemId : itemBonuses.keySet()) {
            itemList.getItems().add(ItemDefinitions.getItemDefinitions(itemId).getName() + " (ID: " + itemId + ")");
        }
        searchField.textProperty().addListener((observable, oldValue, newValue) -> search(oldValue, newValue));
        Constants.BonusType type;
        for (int i = 0; i < bonuses.length; i++) {
            type = Constants.BonusType.forId(i);
            if (type == null) continue;
            bonuses[i] = new IntegerItem(type.getName());
            propertySheet.getItems().add(bonuses[i]);
        }
    }

    private void search(String oldVal, String newVal) {
        if (oldVal != null && (newVal.length() < oldVal.length())) {
            for (int itemId : itemBonuses.keySet()) {
                itemList.getItems().add(ItemDefinitions.getItemDefinitions(itemId).getName() + " (ID: " + itemId + ")");
            }
        }
        String value = newVal.toUpperCase();
        ObservableList<String> subEntries = FXCollections.observableArrayList();
        for (Object entry : itemList.getItems()) {
            String entryText = (String) entry;
            if (entryText.toUpperCase().contains(value)) subEntries.add(entryText);
        }
        itemList.setItems(subEntries);
    }

    private void save() {
        for (int i = 0; i < currentData.length; i++) {
            currentData[i] = (int) bonuses[i].getValue();
        }
    }

    @FXML
    private void openData() {
        if (currentData != null) save();
        String line = itemList.getSelectionModel().getSelectedItem();
        if (line == null) return;
        int id = Integer.valueOf(line.substring(line.indexOf("(ID: ") + "(ID: ".length(), line.lastIndexOf(")")));
        int[] bonuses = itemBonuses.get(id);
        currentData = bonuses;
        for (int i = 0; i < bonuses.length; i++) {
            this.bonuses[i].setValue(bonuses[i]);
        }
    }

    @FXML
    private void globalSave() {
        if (currentData != null) save();
        ItemBonuses.saveItemBonuses();
    }

    @FXML
    public void doClose() {
        System.exit(0);
    }

    public void globalKeyPressed(KeyEvent event) {
        switch (event.getCode()) {
            case S:
                if (event.isControlDown()) globalSave();
        }
    }
}
