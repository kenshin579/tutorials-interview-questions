package com.codility.lessons.coutingelements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogRiverTest {

    @Test
    public void test_solution() {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        FrogRiver frogRiver = new FrogRiver();
        assertEquals(6, frogRiver.solution(5, A));
    }

    @Test
    public void test_solution_안되는_경우() {
        int[] A = {1, 3, 1, 4, 2, 3, 2, 4};
        FrogRiver frogRiver = new FrogRiver();
        assertEquals(-1, frogRiver.solution(5, A));
    }
}