package com.rs.tools.shopEditor;

import com.rs.cache.Cache;
import com.rs.game.item.Item;
import com.rs.game.player.content.shops.Shop;
import com.rs.game.player.content.shops.ShopHandler;
import com.rs.tools.itemIcons.ItemPanel;
import com.rs.tools.itemIcons.ItemSearch;
import com.rs.utils.fxUtils.FXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;

import static com.rs.utils.fxUtils.FXUtils.*;

/**
 * Created by Peng on 24.9.2016.
 */
public class ShopEditorController {

    public AnchorPane searchPane;
    private int currentShop = 0;
    private int currentShopIndex = 0;

    public ListView<String> shopList;
    public ListView<ItemPanel> itemList;

    public ItemSearch search;

    public TitledPane shopPanel;

    public TextField nameField;
    public TextField currencyField;
    public CheckBox generalStoreBox;
    public CheckBox allowSellingBox;

    public Label leftStatus, rightStatus;

    public ShopEditorController() {
        try {
            Cache.init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setLeftStatus(String text) {
        leftStatus.setText(text);
    }

    void init() {
        search = new ItemSearch();
        searchPane.getChildren().add(search);
        ShopHandler.init();
        refreshShopList();
        refresh();
        openShopData();

        itemList.setOnDragDetected(event -> {
            if (itemList.getSelectionModel().getSelectedItem() == null) return;
            Dragboard dragboard = itemList.startDragAndDrop(TransferMode.MOVE);
            ClipboardContent content = new ClipboardContent();
            content.putString(FXUtils.constructDragContent(ITEM_ID, itemList.getSelectionModel().getSelectedItem()
                    .getItemId(), ITEM_AMOUNT, itemList.getSelectionModel().getSelectedItem().getItemAmount(),
                    DRAG_INDEX, itemList.getSelectionModel().getSelectedIndex(), ORGANIZE_DRAG, Boolean.TRUE));
            dragboard.setContent(content);
        });
        itemList.setOnDragOver(dragEvent -> {
            itemList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            dragEvent.acceptTransferModes(TransferMode.MOVE);
        });
        itemList.setOnDragExited(dragEvent -> {
            itemList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        });
        itemList.setOnDragDropped(dragEvent -> {
            String result = dragEvent.getDragboard().getString();
            dragEvent.setDropCompleted(true);
            Shop shop = ShopHandler.getShop(currentShop);
            if (shop == null) return;

            boolean organizeDrag = FXUtils.parseDragBoolean(result, ORGANIZE_DRAG);
            if (organizeDrag) {
                int dragIndex = FXUtils.parseDragInteger(result, DRAG_INDEX);
                int itemId = FXUtils.parseDragInteger(result, ITEM_ID);
                int amount = FXUtils.parseDragInteger(result, ITEM_AMOUNT);
                if (dragIndex == -1 || itemId == -1 || amount == -1) return;

                int index;
                if (dragEvent.getTarget() instanceof ItemPanel)
                    index = itemList.getItems().indexOf(dragEvent.getTarget());
                else index = Integer.MAX_VALUE;

                itemList.getItems().remove(dragIndex);
                shop.getOriginalStock().remove(dragIndex);
                if (itemList.getItems().size() < index) {
                    index = itemList.getItems().size();
                }
                shop.getOriginalStock().add(index, new Item(itemId, amount));
                itemList.getItems().add(index, new ItemPanel(new Item(itemId, amount)));
                itemList.getSelectionModel().select(index);
            } else {
                String[] results = result.split(FXUtils.SPLIT_VALUE);
                for (String params : results) {
                    if (params.isEmpty()) continue;
                    int id = FXUtils.parseDragInteger(params, ITEM_ID);
                    dragEvent.setDropCompleted(true);
                    int amount = getNumberInput("Add item", "Enter an amount:");
                    if (amount < 0) return;
                    Item item = new Item(id, amount);
                    itemList.getItems().add(new ItemPanel(item));
                    shop.getOriginalStock().add(item);
                }
                refresh();
            }
        });
        itemList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        itemList.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case DELETE:
                    deleteSelected();
                    break;
            }
        });
        generalStoreBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (getCurrentShop() == null) return;
            getCurrentShop().setGeneralStore(newValue);
            refresh();
        });
        allowSellingBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if (getCurrentShop() == null) return;
            getCurrentShop().setAllowSelling(newValue);
            refresh();
        });
    }

    void doClose() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    private void deleteSelected() {
        if (itemList.getSelectionModel().getSelectedItem() != null) {
            Shop shop = ShopHandler.getShop(currentShop);
            if (shop == null) return;
            int id;
            Item itemToRemove = null;
            for (ItemPanel itemPanel : itemList.getSelectionModel().getSelectedItems()) {
                id = itemPanel.getItemId();
                for (Item item : shop.getOriginalStock())
                    if (item.getId() == id) itemToRemove = item;
                shop.getOriginalStock().remove(itemToRemove);
            }
            refresh();
        }
    }

    private void save() {
        ShopHandler.saveShops();
        showAlert("Saving finished", "Shops have successfully been saved.");
    }

    private Shop getCurrentShop() {
        return ShopHandler.getShop(currentShop);
    }

    @FXML
    void processGlobalKey(KeyEvent event) {
        switch (event.getCode()) {
            case S:
                if (event.isControlDown()) save();
        }
    }

    @FXML
    void openShopData() {
        String line = shopList.getSelectionModel().getSelectedItem();
        currentShopIndex = shopList.getSelectionModel().getSelectedIndex();
        currentShop = Integer.parseInt(line.substring(line.indexOf("(") + 1, line.indexOf(")")));
        refresh();
    }

    @FXML
    void handleMenuAction(ActionEvent e) {
        MenuItem menuItem = (MenuItem) e.getSource();
        switch (menuItem.getText().toLowerCase()) {
            case "quit":
                doClose();
                break;
            case "save":
                save();
                break;
            case "edit":
                if (itemList.getSelectionModel().getSelectedItem() != null) {
                    int amount = getNumberInput("Edit item", "Enter new amount");
                    if (amount <= 0) return;
                    Shop shop = ShopHandler.getShop(currentShop);
                    if (shop == null) return;
                    int id = itemList.getSelectionModel().getSelectedItem().getItemId();
                    int index = 0;
                    for (Item item : shop.getOriginalStock()) {
                        if (item.getId() == id) break;
                        index++;
                    }
                    shop.getOriginalStock().get(index).setAmount(amount);
                    refresh();
                }
                break;
            case "remove":
                deleteSelected();
                break;
            case "rename":
                openShopRenameDialog();
                break;
            case "add new":
                String name = openTextInputDialog("Create shop", "Enter a name for your shop");
                ShopHandler.getShops().add(new Shop(name, 995, false, false));
                refresh();
                break;
            case "reload":
                refresh();
                break;
            case "delete selected":
                if (FXUtils.confirm("Shop editor",
                        "Deleting shop " + currentShop, "Are you sure you want to delete this shop?")) {
                    ShopHandler.getShops().remove(currentShop);
                    refresh();
                }
                return;
            default:
                System.out.println("Unhandled menu item " + menuItem.getText());
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Shops Editor");
        alert.setHeaderText(title);
        alert.setContentText(message);

        alert.showAndWait();
    }

    private void openShopRenameDialog() {
        Shop shop = ShopHandler.getShop(currentShop);
        if (shop == null) return;

        String newName = openTextInputDialog("Rename shop", "Please enter a new name for the shop");
        if (newName == null) return;

        shop.setName(newName);
        refresh();
    }

    private int getNumberInput(String header, String message) {
        String amountString = openTextInputDialog(header, message);
        if (amountString == null) return -1;
        amountString = amountString.replaceAll("k", "000");
        amountString = amountString.replaceAll("m", "000000");
        int amount;
        try {
            amount = Integer.parseInt(amountString);
        } catch (NumberFormatException nfe) {
            showAlert("Invalid input string", "Enter a number.");
            return -1;
        }
        return amount;
    }

    /**
     * Open a text input dialog
     *
     * @param header      header text
     * @param contentText the question
     * @return text input or null if nothing was entered / cancel pressed
     */
    private String openTextInputDialog(String header, String contentText) {
        return FXUtils.getTextInput("Shop editor", header, contentText);
    }

    private void refreshShopView() {
        itemList.getItems().clear();
        Shop shop = ShopHandler.getShop(currentShop);
        if (shop == null) return;
        ArrayList<Item> stock = shop.getOriginalStock();
        for (Item item : stock) {
            if (item == null) continue;
            itemList.getItems().add(new ItemPanel(item));
        }
        allowSellingBox.setSelected(shop.allowsSelling());
        generalStoreBox.setSelected(shop.isGeneralStore());
    }

    private void refreshShopList() {
        shopList.getItems().clear();
        for (int i = 0; i < ShopHandler.getShops().size(); i++)
            shopList.getItems().add("(" + i + ") " + ShopHandler.getShops().get(i).getName());
        shopList.getSelectionModel().select(currentShopIndex);
    }

    private void refresh() {
        refreshShopList();
        if (shopList.getItems().size() != 0) {
            String line = shopList.getSelectionModel().getSelectedItem();
            shopPanel.setText(shopList.getSelectionModel().getSelectedItem());
            int id = Integer.parseInt(line.substring(line.indexOf("(") + 1, line.indexOf(")")));
            setLeftStatus("Opening shop " + id);
        }
        refreshShopView();
        setLeftStatus("");
    }
}
