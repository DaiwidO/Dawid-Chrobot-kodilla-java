package com.kodilla.good.patterns.food2door.supplier;

import com.kodilla.good.patterns.food2door.model.OrderRequest;

public class GlutenFreeShop implements FoodSupplier{


    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Order request received by GlutenFreeShop.");
        if (orderRequest.getQuantity() >= 4) {
            System.out.println("Not sufficient quantity in the shop.\nOrder canceled");
        }
        else {
            System.out.println("Order placed successfully.");
        }
    }
}
