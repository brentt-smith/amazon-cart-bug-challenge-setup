package org.example;

import io.split.client.SplitClient;

import java.util.List;

public class Checkout {
    private final PromotionsProvider provider;
    private final SplitClient splitClient;

    public Checkout(PromotionsProvider provider,
                    SplitClient splitClient) {
        this.provider = provider;
        this.splitClient = splitClient;
    }

    public double cartPrice(String user, List<Item> items) {
        double total = 0;
        List<Promotion> promotions = provider.getActivePromotions();

        for (Item item : items) {
            boolean thereWasDiscount = false;

            for (Promotion prom : promotions) {
                if (prom.getItemId() == item.id()) {
                    total += item.retailPrice() * (1 - prom.getDiscount());
                    thereWasDiscount = true;
                }
            }

            if (!thereWasDiscount) {
                total += item.retailPrice();
            }
        }

        return total;
    }

}
