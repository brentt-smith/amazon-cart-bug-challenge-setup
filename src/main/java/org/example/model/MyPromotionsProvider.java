package org.example.model;

import org.example.Promotion;
import org.example.PromotionsProvider;

import java.util.List;

public class MyPromotionsProvider implements PromotionsProvider {
    private List<Promotion> activePromotions;

    public MyPromotionsProvider(List<Promotion> promotions) {
        this.activePromotions = promotions;
    }

    public List<Promotion> getActivePromotions() {
        return activePromotions;
    }
}
