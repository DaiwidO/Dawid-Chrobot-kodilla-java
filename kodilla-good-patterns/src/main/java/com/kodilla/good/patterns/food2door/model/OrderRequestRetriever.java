package com.kodilla.good.patterns.food2door.model;

import com.kodilla.good.patterns.food2door.supplier.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.supplier.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.supplier.HealthyShop;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        Food banana = new Food("banana", "#5333");


        return new OrderRequest(healthyShop, banana, 4);
    }
}
