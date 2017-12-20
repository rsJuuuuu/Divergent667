package com.rs.tools.dropEditor;

import com.rs.cache.Cache;
import com.rs.game.npc.Drop;
import com.rs.game.npc.drops.DropTable;
import com.rs.game.npc.drops.NpcDrops;
import com.rs.tools.itemIcons.ItemSearch;
import com.rs.utils.fxUtils.FXUtils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import org.controlsfx.control.MaskerPane;

import java.io.IOException;
import java.util.HashMap;

import static com.rs.utils.fxUtils.FXUtils.ITEM_ID;

/**
 * Created by Peng on 24.2.2016 22:11.
 */
public class DropEditorController {

    public TitledPane dropsPane;

    public AnchorPane searchPane;

    public ItemSearch search;

    public ListView<String> tableList;
    public ListView<DropPanel> dropsList;
    public ListView<Integer> keyList;

    public SplitPane dataPane;

    public TextField searchField;
    public TextField keyField;

    public CheckBox rdtBox;

    public MaskerPane loadingPane;

    private DropTable currentTable;

    private ObservableList<String> npcData = FXCollections.observableArrayList();
    private HashMap<String, DropTable> dropData;

    public DropEditorController() {
        try {
            Cache.init();
            NpcDrops.init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init() {
        searchField.textProperty().addListener((observable, oldVal, newVal) -> search(oldVal, newVal));
        FXUtils.setNumericInput(keyField, null);
        search = new ItemSearch();
        searchPane.getChildren().add(search);
        dropsList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        dropsList.setOnDragOver(dragEvent -> {
            dropsList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            dragEvent.acceptTransferModes(TransferMode.MOVE);
        });
        dropsList.setOnDragExited(dragEvent -> dropsList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE));
        dropsList.setOnDragDropped(dragEvent -> {
            String contentString = dragEvent.getDragboard().getString();
            for (String content : contentString.split(FXUtils.SPLIT_VALUE)) {
                if (content.isEmpty()) continue;
                int itemId = FXUtils.parseDragInteger(content, ITEM_ID);
                currentTable.addDrop(new Drop(itemId, 100, 1, 1));
            }
            dragEvent.setDropCompleted(true);
            loadingPane.setVisible(true);
            refresh(true);
            loadingPane.setVisible(false);
        });
        tableList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        refresh(false);
    }

    public void doClose() {
        System.exit(0);
    }

    private void search(String oldVal, String newVal) {
        if (oldVal != null && (newVal.length() < oldVal.length())) {
            tableList.setItems(npcData);
        }
        String value = newVal.toUpperCase();
        ObservableList<String> subEntries = FXCollections.observableArrayList();
        for (Object entry : tableList.getItems()) {
            String entryText = (String) entry;
            if (entryText.toUpperCase().contains(value)) subEntries.add(entryText);
        }
        tableList.setItems(subEntries);
    }

    public void refresh(boolean attemptReopen) {
        npcData.clear();
        tableList.getItems().clear();
        dropData = NpcDrops.getDropTables();
        npcData.addAll(dropData.keySet());
        tableList.setItems(npcData);
        openDropData(attemptReopen);
        if (searchField.getText() != null) search("", searchField.getText());
    }

    private void resetNpcData() {
        dataPane.setDisable(true);
        dropsList.getItems().clear();
        keyList.getItems().clear();
        dropsPane.setText("No drop table selected");
    }

    public void openDropData() {
        openDropData(false);
    }

    private void openDropData(boolean reloadCurrentTable) {
        resetNpcData();
        if (!reloadCurrentTable) {
            if (tableList.getSelectionModel().getSelectedIndex() < 0) return;
            String line = tableList.getItems().get(tableList.getSelectionModel().getSelectedIndex());
            if (line == null) return;
            currentTable = dropData.get(line);
        }
        if (currentTable == null) return;
        dropsPane.setText("Drop table for Npc: " + currentTable.getName());
        rdtBox.setSelected(currentTable.useRdt());
        for (Drop drop : currentTable.getDrops())
            dropsList.getItems().add(new DropPanel(drop, this));
        keyList.getItems().addAll(currentTable.getKeys());
        dataPane.setDisable(false);
    }

    public void select(DropPanel dropPanel) {
        dropsList.getSelectionModel().select(dropPanel);
    }

    public void addKey() {
        if (keyField.getText().isEmpty()) return;
        Integer key = Integer.valueOf(keyField.getText());
        String errorMessage = null;
        if (currentTable.getKeys().contains(key)) errorMessage = "Can not add duplicate keys.";
        else if (NpcDrops.getDropTable(key) != null && !NpcDrops.getDropTable(key).equals(currentTable)) errorMessage =
                "Another table (" + NpcDrops.getDropTable(key).getName() + ") is already linked to this npc id";
        if (errorMessage != null) {
            FXUtils.showAlert("Drop editor", "Error adding key", errorMessage);
            return;
        }
        currentTable.addKey(key);
        keyList.getItems().add(key);
        keyField.clear();
    }

    public void keyListKeyEvent(KeyEvent event) {
        if (currentTable == null) return;
        if (event.getCode() == KeyCode.DELETE) {
            if (keyList.getSelectionModel().getSelectedItems().size() == keyList.getItems().size()
                && !FXUtils.confirm("Drop editor", "Deleting npc key",
                    "If a table has no ids linked to it,\n it will " + "be deleted. Are you sure?"))
                for (Integer i : keyList.getSelectionModel().getSelectedItems()) {
                    currentTable.getKeys().remove(i);
                    keyList.getItems().remove(i);
                }
            if (keyList.getItems().size() == 0) {
                NpcDrops.deleteDropTable(currentTable);
                refresh(false);
            }
        }
    }

    public void updateRdt() {
        currentTable.setUseRdt(rdtBox.isSelected());
    }

    public void renameTable() {
        String name = FXUtils.getTextInput("Drop editor", "Renaming drop table",
                "Please enter a new name for the " + "table");
        if (name.isEmpty()) return;
        if (NpcDrops.getDropTables().containsKey(name)) {
            FXUtils.showAlert("Drop editor", "Renaming drop table", "A drop table with that name already exists!");
            return;
        }
        NpcDrops.renameDropTable(currentTable, name);
        refresh(true);
    }

    public void deleteTable() {
        if (currentTable == null) return;
        if (FXUtils.confirm("Drop editor",
                "Deleting drop table: " + currentTable.getName(),
                "Are you sure? This will remove drops from all " + "linked npcs.")) {
            NpcDrops.deleteDropTable(currentTable);
            refresh(false);
        }
    }

    public void addTable() {
        String name = FXUtils.getTextInput("Drop editor", "Adding a new drop table",
                "Enter a name for the table to " + "be added");
        int id = FXUtils.getIntegerInput("Drop editor", "Adding a new drop table",
                "Please enter an npc id to link " + "this table to", -1);
        if (id == -1) return;
        DropTable table = new DropTable(name, id);
        NpcDrops.addDropTable(table);
        refresh(true);
    }

    private void deleteSelectedTables() {
        if (FXUtils.confirm("Drop editor",
                "Deleting drop table: " + currentTable.getName(),
                "Are you sure? This will remove drops from all " + "linked npcs.")) {
            if (tableList.getSelectionModel().getSelectedItems() != null)
                for (String name : tableList.getSelectionModel().getSelectedItems())
                    NpcDrops.deleteDropTable(dropData.get(name));
            refresh(false);
        }
    }

    @FXML
    private void saveDrops() {
        Task task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                loadingPane.setVisible(true);
                NpcDrops.saveNpcDrops();
                return null;
            }

            @Override
            protected void succeeded() {
                super.succeeded();
                loadingPane.setVisible(false);
            }
        };
        new Thread(task).start();
    }

    public void applicationKey(KeyEvent event) {
        switch (event.getCode()) {
            case S:
                if (event.isControlDown()) saveDrops();
        }
    }

    private void deleteSelectedDrops() {
        if (dropsList.getSelectionModel().getSelectedItems() == null || currentTable == null) return;
        for (DropPanel panel : dropsList.getSelectionModel().getSelectedItems())
            currentTable.getDrops().remove(panel.getDrop());
        refresh(true);
    }

    public void dropListPress(KeyEvent event) {
        switch (event.getCode()) {
            case DELETE:
                deleteSelectedDrops();
        }
    }

    public void tableListClick(KeyEvent event) {
        switch (event.getCode()) {
            case DELETE:
                deleteSelectedTables();
        }
    }
}
