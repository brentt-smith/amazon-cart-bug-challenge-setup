package org.example.model;

import org.example.Promotion;

public class MyPromotion implements Promotion {

    private long itemId;
    private double discount;
    private String description;

    public MyPromotion(long itemId, double discount, String description) {
        this.itemId = itemId;
        this.discount = discount;
        this.description = description;
    }

    public long getItemId() {
        return itemId;
    }

    public double getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }
}
