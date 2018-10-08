package com.codility.lessons.maximumslice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProfitTest {

    @Test
    public void solution() {
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        MaxProfit maxProfit = new MaxProfit();
        assertEquals(356, maxProfit.solution(A));
    }

}