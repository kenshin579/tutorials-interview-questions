package com.codility.lessons.sorting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctTest {

    @Test
    public void solution() {
        int[] A = {2, 1, 1, 2, 3, 1};
        Distinct distinct = new Distinct();
        assertEquals(3, distinct.solution(A));
    }
}