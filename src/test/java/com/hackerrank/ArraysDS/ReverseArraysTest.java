package com.hackerrank.ArraysDS;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseArraysTest {

    @Test
    public void reverseArray() {
        int[] a = {1, 4, 3, 2};
        int[] result = {2, 3, 4, 1};

        assertArrayEquals(result, ReverseArrays.reverseArray(a));
    }
}