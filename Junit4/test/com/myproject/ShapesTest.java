package com.myproject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ShapesTest
{
    Shapes shape = new Shapes();
    @Test
    void testcomputeSquareArea()
    {
        assertEquals(576,shape.computeSquareArea(24));
    }

    @Test
    void testcomputeCircleArea()
    {

        assertEquals(78.5,shape.computeCircleArea(5), "Area of circle calculation is wrong.");
    }
}
