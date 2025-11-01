package com.kodilla.good.patterns.challenges;

public interface OrderingRepository {

    void saveInRepository(User user, Product product, int quantity);
}
