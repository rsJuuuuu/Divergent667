package com.rs.tools.itemIcons;

import com.rs.game.item.Item;
import com.rs.utils.IdSearch;
import com.rs.utils.fxUtils.FXUtils;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static com.rs.utils.fxUtils.FXUtils.ITEM_ID;

/**
 * Created by Peng on 6.1.2017 2:11.
 */
public class ItemSearch extends AnchorPane {

    private String lastKeyWord = "";

    private ListView<ItemPanel> searchResults = new ListView<>();
    private TextField searchField = new TextField();

    private ItemIconsLoader.RequestManager requestManager = ItemIconsLoader.getRequestManager();

    public ItemSearch() {
        searchField.textProperty().addListener((observable, oldValue, newValue) -> search(searchField.getText()));
        searchResults.setFixedCellSize(40);
        setAnchor(this);
        VBox layout = new VBox();
        layout.setLayoutY(14.0);
        setAnchor(layout);
        VBox.setVgrow(searchResults, Priority.ALWAYS);

        searchField.setMinHeight(30.0);
        searchField.setPrefHeight(30.0);
        searchField.setMaxHeight(30.0);
        searchField.setPromptText("Search for an item");
        searchField.setAlignment(Pos.BASELINE_CENTER);
        searchResults.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        searchResults.setOnDragDetected(event -> {
            if (searchResults.getSelectionModel().getSelectedItem() == null) return;
            Dragboard dragboard = searchResults.startDragAndDrop(TransferMode.MOVE);
            ClipboardContent content = new ClipboardContent();
            StringBuilder dragContent = new StringBuilder();
            for (ItemPanel panel : searchResults.getSelectionModel().getSelectedItems()) {
                dragContent.append(FXUtils.SPLIT_VALUE);
                dragContent.append(FXUtils.constructDragContent(ITEM_ID, panel.getItemId()));
            }
            content.putString(dragContent.toString());
            dragboard.setContent(content);
        });

        layout.getChildren().add(searchResults);
        layout.getChildren().add(searchField);
        getChildren().add(layout);
    }

    private ArrayList<String> results = new ArrayList<>();
    private ArrayList<ItemPanel> panels = new ArrayList<>();

    private void search(String keyword) {
        results.clear();
        panels.clear();
        if (lastKeyWord.equals(keyword)) return;
        if (keyword.isEmpty() || keyword.length() < 3) {
            lastKeyWord = keyword;
            requestManager.flush();
            searchResults.getItems().clear();
            return;
        }
        if (lastKeyWord.equals("") || lastKeyWord.length() < 3 || lastKeyWord.length() > keyword.length()) {
            results = IdSearch.searchForItem(keyword, false, 500, null);
            for (String result : results) {
                int id = Integer.valueOf(result.substring(result.indexOf("(Id: ") + 5, result.lastIndexOf(")")));
                panels.add(new ItemPanel(new Item(id), requestManager));
            }
        } else {
            panels.addAll(searchResults.getItems().stream().filter(item -> item.getItemName().toLowerCase().contains
                    (keyword)).collect(Collectors.toList()));
        }
        requestManager.flush();
        for (ItemPanel panel : panels)
            requestManager.loadBackground(panel.getItemId(), panel);
        lastKeyWord = keyword;
        searchResults.getItems().clear();
        searchResults.getItems().addAll(panels);
    }

    private void setAnchor(Node node) {
        FXUtils.setAnchors(node, 0, 0, 0, 0);
    }
}
