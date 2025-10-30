package com.kodilla.exception.test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {


    @Nested
    @DisplayName("Tests for probablyIWillThrowException()")
    class Tests {

        @BeforeAll
        public static void beforeAll() {
            System.out.println("This is the beginning of tests");
        }
        @AfterAll
        public static void afterAll() {
            System.out.println("This is the ending of tests");
        }

        SecondChallenge secondChallenge = new SecondChallenge();

        @Nested
        @DisplayName("Tests with different x value")
        class TestWithDifferentXValue {


            @Test
            void testWhenXEquals1() {
                assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 2.0));
            }

            @Test
            void testWhenXIsAbove1() {
                assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.01, 2.0));
            }

            @Test
            void testWhenXEquals2() {
                assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 2.0));
            }

            @Test
            void testWhenXIsBelow2() {
                assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 2.0));
            }

        }

        @Nested
        @DisplayName("Tests with different y value")
        class TestWithDifferentYValue {

            @Test
            void testWhenYIsBelow1Point5() {
                assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 1.49));
            }

            @Test
            void testWhenYEquals1Point5() {
                assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(1.5, 1.5));
            }

            @Test
            void testWhenYIsAbove1Point5() {
                assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 1.51));
            }
        }


        @Nested
        @DisplayName("Tests with valid arguments")
        class TestWithValidArguments {

            @Test
            void testWhenArgumentsAreValid1() {
                assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 2.0));
            }

            @Test
            void testWhenArgumentsAreValid2() {
                //When
                String result = secondChallenge.probablyIWillThrowException(1.4, 2.0);

                //Then
                assertEquals("Done!",result);
            }
        }
    }
}