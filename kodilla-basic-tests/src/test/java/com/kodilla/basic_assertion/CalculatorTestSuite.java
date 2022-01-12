package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    };

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 5;
        int subResult = calculator.square(a);
        assertEquals(25, subResult);
    }

    @Test
    public void testSquareMinus() {
        Calculator calculator = new Calculator();
        int a = -2;
        int subResult = calculator.square(a);
        assertEquals(4, subResult);
    }

    @Test
    public void testSquare0() {
        Calculator calculator = new Calculator();
        int a = 0;
        int subResult = calculator.square(a);
        assertEquals(0, subResult);
    }
}
