package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for changing list")
    class TestListChanges {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2.5);

            //When
            boolean result = shapeCollector.addFigure(circle);

            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(8.7);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertTrue(result);
        }
    }

    @Nested
    @DisplayName("Tests for viewing list")
    class TestViewList {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(4.9, 5.5);
            shapeCollector.addFigure(triangle);

            //When
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(triangle, result);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2.5);
            Square square = new Square(8.7);
            Triangle triangle = new Triangle(4.9, 5.5);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("Circle, Square, Triangle", result);
        }
    }
}