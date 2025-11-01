package com.kodilla.good.patterns.food2door.model;

public class Food {

    private String name;
    private String productId;

    public Food(String name, String productId) {
        this.name = name;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }
}
