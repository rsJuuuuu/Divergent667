package com.rs.tools.itemIcons;

import com.rs.game.item.Item;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

/**
 * Created by Peng on 24.9.2016.
 */
public class ItemPanel extends GridPane {

    private static ItemIconsLoader.RequestManager defaultRequestManager = ItemIconsLoader.getRequestManager();

    private Item item;

    public ItemPanel(Item item) {
        this(item, defaultRequestManager);
    }

    ItemPanel(Item item, ItemIconsLoader.RequestManager requestManager) {
        this.item = item;
        Label itemName = new Label("");

        if (item == null) {
            itemName.setText("");
            setBackground(null);
            return;
        }
        requestManager.loadBackground(item.getId(), this);
        itemName.setText((item.getAmount() != 1 ? (item.getAmount() + "x ") : "") + item.getName()
                         + (item.getDefinitions().isNoted() ? " (noted)" : ""));

        GridPane.setConstraints(itemName, 1, 1);

        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setFillWidth(true);
        columnConstraints.setHgrow(Priority.ALWAYS);
        getColumnConstraints().add(columnConstraints);
        getChildren().addAll(itemName);
    }

    public int getItemId() {
        return item.getId();
    }

    public int getItemAmount() {
        return item.getAmount();
    }

    String getItemName() {
        return item.getName();
    }
}
