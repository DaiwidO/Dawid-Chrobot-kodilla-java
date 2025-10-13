package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    static void afterAllTests(){
        System.out.println("This is the ending of tests.");
    }
    @BeforeEach
    void beforeEachTest(){
        testCounter++;
        System.out.println("Starting test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Circle")
    class CircleShapeCollectorTests {

        @Test
        void testAddFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(5);

            //When
            shapeCollector.addFigure(circle);

            //Then
            assertEquals(1, shapeCollector.getFiguresQuantity());
        }

        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(5);
            shapeCollector.addFigure(circle);

            //When
            shapeCollector.removeFigure(circle);

            //Then
            assertEquals(0, shapeCollector.getFiguresQuantity());
        }

        @Test
        void testGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(5);
            shapeCollector.addFigure(circle);

            //When
            Shape retrievedFigure = shapeCollector.getFigure(0);

            //Then
            assertEquals(circle, retrievedFigure);
            assertNull(shapeCollector.getFigure(2));
        }

        @Test
        void testShowFigures(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(5);
            shapeCollector.addFigure(circle);

            //When
            String result = shapeCollector.showFigures();

            //Then
            assertEquals("Circle ", result);
        }
    }

    @Nested
    @DisplayName("Tests for Square")
    class SquareShapeCollectorTests {

        @Test
        void testAddFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(4);

            //When
            shapeCollector.addFigure(square);

            //Then
            assertEquals(1, shapeCollector.getFiguresQuantity());
        }

        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(4);
            shapeCollector.addFigure(square);

            //When
            shapeCollector.removeFigure(square);

            //Then
            assertEquals(0, shapeCollector.getFiguresQuantity());
        }

        @Test
        void testGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(4);
            shapeCollector.addFigure(square);

            //When
            Shape retrievedFigure = shapeCollector.getFigure(0);

            //Then
            assertEquals(square, retrievedFigure);
            assertNull(shapeCollector.getFigure(2));
        }

        @Test
        void testShowFigures(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(4);
            shapeCollector.addFigure(square);

            //When
            String result = shapeCollector.showFigures();

            //Then
            assertEquals("Square ", result);
        }
    }

    @Nested
    @DisplayName("Tests for Triangle")
    class TriangleShapeCollectorTests {

        @Test
        void testAddFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(4, 5);

            //When
            shapeCollector.addFigure(triangle);

            //Then
            assertEquals(1, shapeCollector.getFiguresQuantity());
        }

        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(4, 5);
            shapeCollector.addFigure(triangle);

            //When
            shapeCollector.removeFigure(triangle);

            //Then
            assertEquals(0, shapeCollector.getFiguresQuantity());
        }

        @Test
        void testGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(4, 5);
            shapeCollector.addFigure(triangle);

            //When
            Shape retrievedFigure = shapeCollector.getFigure(0);

            //Then
            assertEquals(triangle, retrievedFigure);
            assertNull(shapeCollector.getFigure(2));
        }

        @Test
        void testShowFigures(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(4, 5);
            shapeCollector.addFigure(triangle);

            //When
            String result = shapeCollector.showFigures();

            //Then
            assertEquals("Triangle ", result);
        }
    }
}