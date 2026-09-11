package com.myproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void divide() {
        Calc c = new Calc();
        int actualResult = c.divide(10,2);
        int expectResult = 5;
        assertEquals(expectResult,actualResult);
    }
}