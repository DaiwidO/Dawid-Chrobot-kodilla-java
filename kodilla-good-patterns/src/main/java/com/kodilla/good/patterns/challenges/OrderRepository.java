package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements OrderingRepository {

    private List<OrderRequest> orders = new ArrayList<OrderRequest>();

    @Override
    public void saveInRepository(User user, Product product, int quantity) {
        orders.add(new OrderRequest(user, product, quantity));
        System.out.println("Order Saved in repository. Total orders: " + orders.size());
    }
}
