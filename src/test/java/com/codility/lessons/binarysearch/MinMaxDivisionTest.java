package com.codility.lessons.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinMaxDivisionTest {

    @Test
    public void solution() {
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        MinMaxDivision minMaxDivision = new MinMaxDivision();
        assertEquals(3, minMaxDivision.solution(3, 5, A));
    }

}