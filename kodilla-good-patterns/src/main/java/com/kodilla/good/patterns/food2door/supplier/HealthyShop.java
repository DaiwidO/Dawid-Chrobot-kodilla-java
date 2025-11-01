package com.kodilla.good.patterns.food2door.supplier;


import com.kodilla.good.patterns.food2door.model.OrderRequest;

import java.util.Random;

public class HealthyShop implements FoodSupplier {

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Order request received by HealthyShop.");

        Random random = new Random();
        int randomInt = random.nextInt(10);

        if (randomInt < 5) {
            System.out.println("Order has been successfully processed.");
        }
        else {
            System.out.println("Not sufficient stock in the shop.\nOrder canceled");
        }
    }
}
