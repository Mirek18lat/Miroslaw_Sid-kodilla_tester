package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult, 0.1);
    };

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult, 0.1);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 5;
        double subResult = calculator.square(a);
        assertEquals(25, subResult, 0.1);
    }

    @Test
    public void testSquareMinus() {
        Calculator calculator = new Calculator();
        double a = -2;
        double subResult = calculator.square(a);
        assertEquals(4, subResult, 0.1);
    }

    @Test
    public void testSquare0() {
        Calculator calculator = new Calculator();
        double a = 0;
        double subResult = calculator.square(a);
        assertEquals(0, subResult, 0.1);
    }
}
