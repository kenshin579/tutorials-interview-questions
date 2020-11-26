package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EraseOverlapIntervalTest {

    /**
     * 반환 값 : 겹치는 intervals이 없게 하려면 최소 몇개의 interval을 삭제해야 하나?
     */
    @Test
    public void eraseOverlapIntervals() {
        int[][] intervals = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 3}
        };

        assertThat(new EraseOverlapInterval().eraseOverlapIntervals(intervals)).isEqualTo(1);
    }

    @Test
    public void eraseOverlapIntervals2() {
        int[][] intervals = {
                {1, 2},
                {1, 2},
                {1, 2}
        };

        assertThat(new EraseOverlapInterval().eraseOverlapIntervals(intervals)).isEqualTo(2);
    }

    @Test
    public void eraseOverlapIntervals3() {
        int[][] intervals = {
                {1, 2},
                {2, 3}
        };

        assertThat(new EraseOverlapInterval().eraseOverlapIntervals(intervals)).isEqualTo(0);
    }
}