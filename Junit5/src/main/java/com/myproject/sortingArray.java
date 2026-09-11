package com.myproject;

import java.util.Arrays;

public class sortingArray
{
    public int[] sortingArrays(int[] array)
    {
        for (int i=0;i<1000000;i++){
            Arrays.sort(array);
        }
        return array;
    }
}
