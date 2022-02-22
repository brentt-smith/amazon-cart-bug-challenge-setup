package org.example.model;

import org.example.Item;

public class MyItem implements Item {

    private long id;
    private int retailPrice;

    public MyItem(long id, int retailPrice) {
        this.id = id;
        this.retailPrice = retailPrice;
    }

    public long id() {
        return id;
    }

    public int retailPrice() {
        return retailPrice;
    }
}
