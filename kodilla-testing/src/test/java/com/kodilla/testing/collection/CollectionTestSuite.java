package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @Test
    @DisplayName("when create empty ArratList, " +
            "then exterminate should return a empty list" )

    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(0, result.size());
    }

    @Test
    @DisplayName("when create a random ArrayList, "+
            "then exterminate should return a List of even numbers")

    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        Random randomGenerator = new Random();
        List<Integer> randomList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            randomList.add(randomGenerator.nextInt(50));
        }

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(randomList);

        //Then
        for(int number : result){
            Assertions.assertTrue(number % 2 == 0);
        }
    }
}
