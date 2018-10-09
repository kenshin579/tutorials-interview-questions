package com.google;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CommonSetTest {
    private static final Logger LOG = LoggerFactory.getLogger(CommonSetTest.class);

    @Test
    public void test_find_common_valuves() {
        int[] A = {1, 1, 1, 1, 2, 2};
        int[] B = {3, 3, 4, 1, 2};

        List<Integer> expectedArray = Arrays.asList(1, 2);
        List<Integer> result = new CommonSet().solution(A, B);
        assertEquals(expectedArray, result);
    }
}