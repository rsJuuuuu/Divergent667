package com.rs.game.npc;

import java.io.Serializable;

public class Drop implements Serializable {

    private int itemId, minAmount, maxAmount;
    private double rate;

    public static Drop create(int itemId, double rate, int minAmount, int maxAmount) {
        return new Drop((short) itemId, rate, minAmount, maxAmount);
    }

    public Drop(int itemId, double rate, int minAmount, int maxAmount) {
        this.itemId = itemId;
        this.rate = rate;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    public int getMinAmount() {
        return minAmount;
    }

    int getExtraAmount() {
        return maxAmount - minAmount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public int getItemId() {
        return itemId;
    }

    public double getRate() {
        return rate;
    }

    public void setItemId(short itemId) {
        this.itemId = itemId;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setMinAmount(int amount) {
        this.minAmount = amount;
    }

    public void setMaxAmount(int amount) {
        this.maxAmount = amount;
    }

}