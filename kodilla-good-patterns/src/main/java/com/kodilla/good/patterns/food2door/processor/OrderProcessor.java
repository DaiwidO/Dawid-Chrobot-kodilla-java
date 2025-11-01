package com.kodilla.good.patterns.food2door.processor;

import com.kodilla.good.patterns.food2door.model.OrderRequest;
import com.kodilla.good.patterns.food2door.supplier.FoodSupplier;

public class OrderProcessor {

    public void processOrder(FoodSupplier foodSupplier, OrderRequest orderRequest){
        foodSupplier.process(orderRequest);
    }


}
