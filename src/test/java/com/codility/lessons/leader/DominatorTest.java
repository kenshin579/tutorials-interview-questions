package com.codility.lessons.leader;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DominatorTest {

    @Test
    public void solution() {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        Dominator dominator = new Dominator();
        assertEquals(7, dominator.solution(A));
    }
}