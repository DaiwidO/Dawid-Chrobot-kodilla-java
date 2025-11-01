package com.kodilla.good.patterns.food2door.supplier;

import com.kodilla.good.patterns.food2door.model.OrderRequest;

public interface FoodSupplier {

    void process(OrderRequest orderRequest);
}
