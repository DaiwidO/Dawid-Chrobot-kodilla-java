package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final String name;
    private final BigDecimal people;

    public Country(String name, BigDecimal people) {
        this.name = name;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeopleQuantity() {
        return people;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", people=" + people +
                '}';
    }
}
