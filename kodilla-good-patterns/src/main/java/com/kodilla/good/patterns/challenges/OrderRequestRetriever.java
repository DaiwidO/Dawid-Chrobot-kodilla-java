package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user1 = new User("Mateusz", "Kowalski",
                "MateruszKowalski@gmail.com", "Sienkiewicza 3");
        Product toothbrush = new Product("toothbrush", "12345");
        return new OrderRequest(user1, toothbrush, 2);
    }

    /*
    other examples
    User user1 = new User("Mateusz", "Kowalski",
            "MateruszKowalski@gmail.com", "Sienkiewicza 3");
    User user2 = new User("Daniel", "Kowalski",
            "DanielKowalski@gmail.com",  "Warszawska 4");

    Product toothbrush = new Product("toothbrush", "12345");
    Product thongs = new Product("thongs", "67890");

    OrderRequest orderRequest1 = new OrderRequest(user1, toothbrush, 2);
    OrderRequest orderRequest2 = new OrderRequest(user2, thongs, 1);
    OrderRequest orderRequest3 = new OrderRequest(user1, thongs, 1);
     */
}
