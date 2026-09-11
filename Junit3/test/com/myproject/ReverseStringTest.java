package com.myproject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReverseStringTest 
{
    @Test
    void test() 
    {
        ReverseString reverse = new ReverseString();
        assertEquals("avaJ", reverse.reverseString("Java"));
    }
}