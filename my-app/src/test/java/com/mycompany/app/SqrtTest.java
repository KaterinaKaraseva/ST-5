package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {
    @Test
    void testAverage() {
        Sqrt sqrt = new Sqrt(16);
        assertEquals(2.5, sqrt.average(2.0, 3.0), 0.0001);
    }

    @Test
    void testGoodTrue() {
        Sqrt sqrt = new Sqrt(16);
        assertTrue(sqrt.good(4.0, 16.0));
    }

    @Test
    void testGoodFalse() {
        Sqrt sqrt = new Sqrt(16);
        assertFalse(sqrt.good(3.9, 16.0));
    }

    @Test
    void testImprove() {
        Sqrt sqrt = new Sqrt(16);
        double improved = sqrt.improve(4.0, 16.0);
        assertEquals(4.0, improved, 0.0001);
    }

    @Test
    void testIterBaseCase() {
        Sqrt sqrt = new Sqrt(16);
        double result = sqrt.iter(4.0, 16.0);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    void testIterRecursiveCase() {
        Sqrt sqrt = new Sqrt(16);
        double result = sqrt.iter(2.0, 16.0);
        assertTrue(Math.abs(result - 4.0) < 0.0001);
    }

    @Test
    void testCalcFor16() {
        Sqrt sqrt = new Sqrt(16);
        double result = sqrt.calc();
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    void testCalcFor2() {
        Sqrt sqrt = new Sqrt(2);
        double result = sqrt.calc();
        assertEquals(Math.sqrt(2), result, 0.0001);
    }

    @Test
    void testCalcForZero() {
        Sqrt sqrt = new Sqrt(0);
        double result = sqrt.calc();
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testCalcForLargeNumber() {
        Sqrt sqrt = new Sqrt(1000000);
        double result = sqrt.calc();
        assertEquals(1000.0, result, 0.0001);
    }
}