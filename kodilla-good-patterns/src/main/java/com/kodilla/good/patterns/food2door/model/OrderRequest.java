package com.kodilla.good.patterns.food2door.model;

import com.kodilla.good.patterns.food2door.supplier.FoodSupplier;

public class OrderRequest {

    private FoodSupplier supplier;
    private Food food;
    private int quantity;

    public OrderRequest(FoodSupplier supplier, Food food, int quantity) {
        this.supplier = supplier;
        this.food = food;
        this.quantity = quantity;
    }

    public FoodSupplier getSupplier() {
        return supplier;
    }

    public Food getProduct() {
        return food;
    }

    public int getQuantity() {
        return quantity;
    }
}
