package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NonOverlappingIntervalTest {

    /**
     * 반환 값 :
     */
    @Test
    public void eraseOverlapIntervals() {
        int[][] intervals = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 3}
        };

        assertThat(new NonOverlappingInterval().eraseOverlapIntervals(intervals)).isEqualTo(1);
    }

    @Test
    public void eraseOverlapIntervals2() {
        int[][] intervals = {
                {1, 2},
                {1, 2},
                {1, 2}
        };

        assertThat(new NonOverlappingInterval().eraseOverlapIntervals(intervals)).isEqualTo(2);
    }

    @Test
    public void eraseOverlapIntervals3() {
        int[][] intervals = {
                {1, 2},
                {2, 3}
        };

        assertThat(new NonOverlappingInterval().eraseOverlapIntervals(intervals)).isEqualTo(0);
    }
}