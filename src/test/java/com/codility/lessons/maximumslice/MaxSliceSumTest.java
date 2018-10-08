package com.codility.lessons.maximumslice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSliceSumTest {

    @Test
    public void solution() {
        int[] A = {3, 2, -6, 4, 0};
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        assertEquals(5, maxSliceSum.solution(A));
    }

    @Test
    public void solution2() {
        int[] A = {10};
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        assertEquals(10, maxSliceSum.solution(A));
    }

    @Test
    public void solution3() {
        int[] A = {-10};
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        assertEquals(-10, maxSliceSum.solution(A));
    }
}