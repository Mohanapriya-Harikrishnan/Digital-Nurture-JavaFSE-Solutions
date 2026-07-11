package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void testNotNull() {
        assertNotNull(calculator);
    }

    @Test
    void testTrue() {
        assertTrue(5 > 2);
    }

    @Test
    void testFalse() {
        assertFalse(5 < 2);
    }
}