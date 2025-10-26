package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final String name;
    private final List<Continent> continents = new ArrayList<>();

    public World(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Continent> getContinents() {
        return new ArrayList<>(continents);
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public void removeContinent(Continent continent) {
        continents.remove(continent);
    }

    public BigDecimal getPeopleQuantity() {

        BigDecimal peopleQuantity = new BigDecimal(0);
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, quantity) -> sum.add(quantity));
    }
}
