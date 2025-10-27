package com.kodilla.stream.array;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Starting ArrayOperationsTestSuite");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Finished ArrayOperationsTestSuite");
    }

    int testNumber = 1;
    @BeforeEach
    void beforeEach() {
        System.out.println("test #" + testNumber);
        testNumber++;
    }

    @DisplayName("testing getAverage(int[] numbers)")
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(3.0, average, 0.01);
    }
}