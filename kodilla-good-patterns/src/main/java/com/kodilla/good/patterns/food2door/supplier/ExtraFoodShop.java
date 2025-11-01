package com.kodilla.good.patterns.food2door.supplier;

import com.kodilla.good.patterns.food2door.model.OrderRequest;

public class ExtraFoodShop implements FoodSupplier {

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Order request received by ExtraFoodShop.");
        System.out.println("Extra Food Shop is unavailable for the moment.");
    }
}
