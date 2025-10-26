package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    int t = 0;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Starting WorldTestSuite");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("Finished WorldTestSuite");
    }
    @BeforeEach
    void beforeEach() {
        t++;
        System.out.println("Starting test #" + t);
    }

    @DisplayName("testing getPeopleQuantity() from World class")
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("1000000"));
        Country belgium = new Country("Belgium",new BigDecimal("200000"));
        Country germany = new Country("Germany",new BigDecimal("2000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(belgium);

        Continent asia = new Continent("Asia");
        asia.addCountry(germany);

        World world = new World("World");
        world.addContinent(europe);
        world.addContinent(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("3200000"), result);
    }
}
