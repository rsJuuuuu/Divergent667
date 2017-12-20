package com.rs.tools.npcEditor;

import com.rs.cache.Cache;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.data.NpcData;
import com.rs.game.npc.data.NpcDataLoader;
import com.rs.utils.Constants;
import com.rs.utils.fxUtils.propertyItems.IntegerItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import org.controlsfx.control.PropertySheet;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Peng on 11.2.2017 21:13.
 */
public class NpcEditorController {

    public ListView<String> npcList;
    public PropertySheet propertySheet;
    public TextField searchField;
    public Label statusLabel;

    private IntegerItem[] bonuses = new IntegerItem[10];

    private HashMap<String, IntegerItem> otherIntValues = new HashMap<>();

    private HashMap<Integer, NpcData> npcDataMap;
    private NpcData openData;

    public NpcEditorController() throws IOException {
        Cache.init();
        NpcDataLoader.init();
        npcDataMap = NpcDataLoader.getDataMap();
    }

    public void init() {
        Constants.BonusType type;
        for (int i = 0; i < bonuses.length; i++) {
            type = Constants.BonusType.forId(i);
            if (type == null) continue;
            bonuses[i] = new IntegerItem(type.getName(), "Combat Bonus");
            propertySheet.getItems().add(bonuses[i]);
        }
        putOtherValues("health", "attack animation", "defence animation", "death animation", "attack delay", "death "
                                                                                                             +
                                                                                                             "delay",
                "spawn delay", "max hit", "attack style", "attack gfx", "attack projectile", "aggression type");
        for (int npcId : npcDataMap.keySet()) {
            npcList.getItems().add(NPCDefinitions.getNPCDefinitions(npcId).getName() + " (ID: " + npcId + ")");
        }
        searchField.textProperty().addListener((observable, oldValue, newValue) -> search(oldValue, newValue));
    }

    private void search(String oldVal, String newVal) {
        if (oldVal != null && (newVal.length() < oldVal.length())) {
            for (int npcId : npcDataMap.keySet()) {
                npcList.getItems().add(NPCDefinitions.getNPCDefinitions(npcId).getName() + " (ID: " + npcId + ")");
            }
        }
        String value = newVal.toUpperCase();
        ObservableList<String> subEntries = FXCollections.observableArrayList();
        for (Object entry : npcList.getItems()) {
            String entryText = (String) entry;
            if (entryText.toUpperCase().contains(value)) subEntries.add(entryText);
        }
        npcList.setItems(subEntries);
    }

    @FXML
    private void openData() {
        if (openData != null) saveData();
        String line = npcList.getSelectionModel().getSelectedItem();
        if (line == null) return;
        int id = Integer.valueOf(line.substring(line.indexOf("(ID: ") + "(ID: ".length(), line.indexOf(")")));
        NpcData data = npcDataMap.get(id);
        this.openData = data;
        if (data.getBonuses() != null) {
            for (int i = 0; i < data.getBonuses().length; i++)
                bonuses[i].setValue(data.getBonuses()[i]);
        }
        NpcCombatDefinitions definitions = data.getDefinitions();
        if (definitions != null) {
            otherIntValues.get("health").setValue(definitions.getHealth());
            otherIntValues.get("attack animation").setValue(definitions.getAttackEmote());
            otherIntValues.get("defence animation").setValue(definitions.getDefenceEmote());
            otherIntValues.get("death animation").setValue(definitions.getDeathEmote());
            otherIntValues.get("attack delay").setValue(definitions.getAttackDelay());
            otherIntValues.get("death delay").setValue(definitions.getDeathDelay());
            otherIntValues.get("spawn delay").setValue(definitions.getSpawnDelay());
            otherIntValues.get("max hit").setValue(definitions.getMaxHit());
            otherIntValues.get("attack style").setValue(definitions.getAttackStyle());
            otherIntValues.get("attack gfx").setValue(definitions.getAttackGfx());
            otherIntValues.get("attack projectile").setValue(definitions.getAttackProjectile());
            otherIntValues.get("aggression type").setValue(definitions.getAgressivenessType());
        }
        propertySheet.lookupAll("");
        propertySheet.requestFocus();
        statusLabel.setText("Loaded npc " + id + " data");
    }

    private void saveData() {
        if (openData.getBonuses() == null) openData.setBonuses(new int[10]);
        for (int i = 0; i < openData.getBonuses().length; i++) {
            openData.getBonuses()[i] = (int) bonuses[i].getValue();
        }
        NpcCombatDefinitions definitions = openData.getDefinitions();
        definitions.setHp((int) otherIntValues.get("health").getValue());
        definitions.setAttA((int) otherIntValues.get("attack animation").getValue());
        definitions.setDefA((int) otherIntValues.get("defence animation").getValue());
        definitions.setDeathA((int) otherIntValues.get("death animation").getValue());
        definitions.setAttD((int) otherIntValues.get("attack delay").getValue());
        definitions.setDeathD((int) otherIntValues.get("death delay").getValue());
        definitions.setSpawnD((int) otherIntValues.get("spawn delay").getValue());
        definitions.setMax((int) otherIntValues.get("max hit").getValue());
        definitions.setAttS((int) otherIntValues.get("attack style").getValue());
        definitions.setAttG((int) otherIntValues.get("attack gfx").getValue());
        definitions.setAttP((int) otherIntValues.get("attack projectile").getValue());
        definitions.setAggT((int) otherIntValues.get("aggression type").getValue());
    }

    @FXML
    private void globalSave() {
        NpcDataLoader.save();
        statusLabel.setText("Saved all npc data");
    }

    public void doClose() {
    }

    private void putOtherValues(String... values) {
        for (String value : values) {
            otherIntValues.putIfAbsent(value, new IntegerItem(value));
            propertySheet.getItems().add(otherIntValues.get(value));
        }
    }

    public void globalKeyPressed(KeyEvent event) {
        switch (event.getCode()) {
            case S:
                if (event.isControlDown()) saveData();
        }
    }
}
