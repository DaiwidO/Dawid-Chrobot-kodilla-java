package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product, int quantity) {
        System.out.println("Item: " + product.getProductName() + " #" + product.getProductId() + " is bought by "
                + user.getFirstName() + " " + user.getLastName());

        return true;
    }
}
