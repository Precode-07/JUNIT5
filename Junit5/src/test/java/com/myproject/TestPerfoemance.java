package com.myproject;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class TestPerformance
{
    @Test
    void testSortingarray_Exception()
    {
        sortingArray array = new sortingArray();
        int[] unsorted ={6,3,1};

        assertTimeout(Duration.ofMillis(10),() -> array.sortingArrays(unsorted));
    }

}
