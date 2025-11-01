package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user1 = new User("Mateusz", "Kowalski",
                "MateruszKowalski@gmail.com", "Sienkiewicza 3");
        Product toothbrush = new Product("toothbrush", "12345");
        return new OrderRequest(user1, toothbrush, 2);
    }
}
