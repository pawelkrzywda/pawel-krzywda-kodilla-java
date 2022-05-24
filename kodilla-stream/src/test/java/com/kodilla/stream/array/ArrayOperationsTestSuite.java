package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] numbers = new int[]{1,5,98,54,321,54,8,45,965,785,41,65,96,35,12,45,46,99,102,300};

        //When
        double result = getAverage(numbers);

        //Then
        assertEquals(158.85, result);
    }
}
