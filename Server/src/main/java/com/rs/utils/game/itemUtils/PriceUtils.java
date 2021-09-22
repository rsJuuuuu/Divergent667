package com.rs.utils.game.itemUtils;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.item.ItemConstants;

public final class PriceUtils {

    /**
     * Get the price of this item
     */
    public static int getPrice(int itemId) {
        ItemDefinitions definitions = ItemDefinitions.getItemDefinitions(itemId);
        if (definitions.isNoted()) itemId = definitions.getCertId();
        else if (definitions.isLoaned()) itemId = definitions.getLendId();
        if (!ItemConstants.isTradeable(new Item(itemId, 1))) return 0;
        if (itemId == 995) return 1;
        return definitions.getValue();
    }

    /**
     * Get the price a normal store should pay for this item
     */
    public static int getStoreSellPrice(int itemId) {
        return (int) (getPrice(itemId) * Settings.STORE_SELL_MODIFIER);
    }
}
