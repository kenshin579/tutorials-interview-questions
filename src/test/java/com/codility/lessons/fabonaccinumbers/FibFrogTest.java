package com.codility.lessons.fabonaccinumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibFrogTest {

    @Test
    public void solution() {
        int[] A = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        FibFrog fibFrog = new FibFrog();
        assertEquals(3, fibFrog.solution(A));
    }
}