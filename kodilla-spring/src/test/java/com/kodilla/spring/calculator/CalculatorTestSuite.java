package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {

        //Given
        double a = 7.5;
        double b = 3.4;

        //When
        double add = calculator.add(a, b);
        double sub = calculator.sub(a, b);
        double mul = calculator.mul(a, b);
        double div = Math.round(calculator.div(a, b) * 10.0) / 10.0;

        //Then
        assertEquals(add, 10.9);
        assertEquals(sub, 4.1);
        assertEquals(mul, 25.5);
        assertEquals(div, 2.2);
        //do nothing
    }
}
