package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.*;
import org.junit.jupiter.api.*;

class CollectionTestSuite {

    @BeforeEach
    public void before(TestInfo testinfo) {
        System.out.println("Test Case: " + testinfo.getDisplayName() + " - begin");
    }

    @AfterEach
    public void after(TestInfo testinfo) {
        System.out.println("Test Case: " + testinfo.getDisplayName() + " - finished");
    }

    @DisplayName("Test normal list for exterminating odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        Integer numbersInArray[] = new Integer[] {5, 4, 6, 658, 584, 451, 333, 100, 0, 51};
        List<Integer> numbers = Arrays.asList(numbersInArray);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        for(int i=0; i < result.size(); i++){
            Assertions.assertTrue((result.get(i) % 2) == 0);
        }
    }

    @DisplayName("Test empty list for exterminating odd numbers")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbersEmpty = new LinkedList<>();
        OddNumbersExterminator exterminatorEmpty = new OddNumbersExterminator();

        //When
        List<Integer> resultEmpty = exterminatorEmpty.exterminate(numbersEmpty);

        //Then
        for(int i=0; i < resultEmpty.size(); i++){
            Assertions.assertTrue((resultEmpty.get(i) % 2) == 0);
        }
    }
}
