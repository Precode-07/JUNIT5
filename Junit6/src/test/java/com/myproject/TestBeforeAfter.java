package com.myproject;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBeforeAfter {

    Shapes shape;

    @BeforeAll
    static void beforeA()
    {
        System.out.println("Before all tests...");
    }
    @AfterAll
    static void after()
    {
        System.out.println("After all tests...");
    }
    @BeforeEach
    void init() {
        shape = new Shapes();
        System.out.println("Before Test");
    }

    @Test
    void computeSquareArea() {
        assertEquals(25, shape.computeSquareArea(5));
        System.out.println("Actual test running....");
    }

    @Test
    void computeCircleArea() {
        assertEquals(78.5, shape.computeCircleArea(5));
        System.out.println("Actual test running....");
    }

    @AfterEach
    void destroy()
    {
        System.out.println("After test clean up.");
    }
}