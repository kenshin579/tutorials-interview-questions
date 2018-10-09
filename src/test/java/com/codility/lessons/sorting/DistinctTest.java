package com.codility.lessons.sorting;

import com.codility.lessons.leader.Dominator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class DistinctTest {
    private static final Logger LOG = LoggerFactory.getLogger(DistinctTest.class);

    @Test
    public void solution() {
        int[] A = {2, 1, 1, 2, 3, 1};
        Distinct distinct = new Distinct();
        assertEquals(3, distinct.solution(A));
    }
}