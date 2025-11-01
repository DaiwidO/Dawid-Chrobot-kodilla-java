package com.kodilla.good.patterns.food2door.model;

public class Food {

    private String name;
    private String productID;

    public Food(String name, String productID) {
        this.name = name;
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public String getProductID() {
        return productID;
    }
}
