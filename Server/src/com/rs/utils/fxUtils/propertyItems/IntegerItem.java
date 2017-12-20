package com.rs.utils.fxUtils.propertyItems;

import javafx.beans.binding.ObjectBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableValue;
import org.controlsfx.control.PropertySheet;

import java.util.Optional;

/**
 * Created by Peng on 11.2.2017 22:33.
 */
public class IntegerItem implements PropertySheet.Item {

    private class ObservableIntegerItem extends ObjectBinding {

        @Override
        protected Object computeValue() {
            return null;
        }
    }

    private IntegerProperty value = new SimpleIntegerProperty();

    private String name;
    private String category;

    public IntegerItem(String name) {
        this.name = name;
        category = "Other";
    }

    public IntegerItem(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public Class<?> getType() {
        return Integer.class;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public Object getValue() {
        return value.getValue();
    }

    @Override
    public void setValue(Object o) {
        value.setValue((Integer) o);
    }

    @Override
    public Optional<ObservableValue<?>> getObservableValue() {
        return Optional.of(value);
    }
}
