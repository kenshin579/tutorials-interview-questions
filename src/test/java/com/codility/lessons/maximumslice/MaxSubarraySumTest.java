package com.codility.lessons.maximumslice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubarraySumTest {

    @Test
    public void test_case1() {
        int[] A = {3, 2, -6, 4, 0};
        MaxSliceSum maxSliceSum = new MaxSliceSum();
//        assertEquals(5, maxSliceSum.kadaneAlgorithm(A));
//        assertEquals(5, maxSliceSum.bruteForce(A));
        assertEquals(5, maxSliceSum.divideConquer(A, A.length));
    }

    @Test
    public void test_case2() {
        int[] A = {-2, -3, 4, -1, -2, 1, 5, -3};
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        assertEquals(7, maxSliceSum.kadaneAlgorithm(A));
        assertEquals(7, maxSliceSum.bruteForce(A));
    }

    @Test
    public void test_case3() {
        int[] A = {3, -2, 5, -1};
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        assertEquals(6, maxSliceSum.kadaneAlgorithm(A));
        assertEquals(6, maxSliceSum.bruteForce(A));
    }

    @Test
    public void solution2() {
        int[] A = {10};
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        assertEquals(10, maxSliceSum.kadaneAlgorithm(A));
        assertEquals(10, maxSliceSum.bruteForce(A));
    }

    @Test
    public void solution3() {
        int[] A = {-10};
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        assertEquals(-10, maxSliceSum.kadaneAlgorithm(A));
        assertEquals(-10, maxSliceSum.kadaneAlgorithm(A));
    }
}