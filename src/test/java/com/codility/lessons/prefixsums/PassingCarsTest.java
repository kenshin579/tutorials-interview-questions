package com.codility.lessons.prefixsums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassingCarsTest {

    @Test
    public void solution() {
        int[] A = {0, 1, 0, 1, 1};
        PassingCars passingCars = new PassingCars();
        assertEquals(5, passingCars.solution(A));
    }

    @Test
    public void solution_안되는_경우() {
        int[] A = {0, 0, 0, 0, 0};
        PassingCars passingCars = new PassingCars();
        assertEquals(0, passingCars.solution(A));
    }
}