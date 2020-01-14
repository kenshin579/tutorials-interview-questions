package com.google;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@Slf4j
public class CommonSetTest {
    @Test
    public void test_find_common_values() {
        int[] A = {1, 1, 1, 1, 2, 2};
        int[] B = {3, 3, 4, 1, 2};

        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> result = new CommonSet().solution(A, B);
        assertEquals(expectedResult, result);
    }

    @Test
    public void test_find_common_values2() {
        int[] A = {2, 7, 1, 4, 5, 6, 9, 8, 7};
        int[] B = {4, 6, 8, 2, 3, 5, 3, 1};

        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(4, 6, 8, 2, 5, 1));
        Set<Integer> result = new CommonSet().solution(A, B);
        assertEquals(expectedResult, result);
    }
}