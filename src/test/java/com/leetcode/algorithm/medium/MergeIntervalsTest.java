package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class MergeIntervalsTest {

    @Test
    public void merge() {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] result = {
                {1, 6},
                {8, 10},
                {15, 18}
        };

        assertThat(new MergeIntervals().merge(intervals)).isEqualTo(result);
    }

    @Test
    public void merge2() {
        int[][] intervals = {
                {1, 4},
                {3, 5}
        };

        int[][] result = {
                {1, 5}
        };

        assertThat(new MergeIntervals().merge(intervals)).isEqualTo(result);
    }

    @Test
    public void merge3() {
        int[][] intervals = {
                {1, 4},
                {2, 3}
        };

        int[][] result = {
                {1, 4}
        };

        assertThat(new MergeIntervals().merge(intervals)).isEqualTo(result);
    }

    @Test
    public void merge4() {
        int[][] intervals = {
                {1, 2},
                {3, 4}
        };

        int[][] result = {
                {1, 2},
                {3, 4}
        };

        assertThat(new MergeIntervals().merge(intervals)).isEqualTo(result);
    }

    @Test
    public void convertStackToArrays() {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{2, 3});
        stack.push(new int[]{1, 4});
        stack.push(new int[]{3, 1});

        int[][] result = new MergeIntervals().convertStackToArrays(stack);
        assertThat(result.length).isEqualTo(3);

        assertThat(result[0][0]).isEqualTo(2);
        assertThat(result[1][0]).isEqualTo(1);
        assertThat(result[2][0]).isEqualTo(3);
    }

    @Test
    public void isPartiallyOverlapped() {
        assertThat(new MergeIntervals().isPartiallyOverlapped(new int[]{1, 3}, new int[]{2, 4})).isTrue();
        assertThat(new MergeIntervals().isPartiallyOverlapped(new int[]{1, 6}, new int[]{2, 4})).isFalse();
        assertThat(new MergeIntervals().isPartiallyOverlapped(new int[]{1, 3}, new int[]{7, 9})).isFalse();
    }

    @Test
    public void contains() {
        assertThat(new MergeIntervals().contains(new int[]{1, 5}, new int[]{2, 4})).isTrue();
        assertThat(new MergeIntervals().contains(new int[]{1, 5}, new int[]{3, 9})).isFalse();
        assertThat(new MergeIntervals().contains(new int[]{1, 5}, new int[]{8, 10})).isFalse();
    }

    @Test
    public void sort() {
        int[][] intervals = {
                {1, 4},
                {4, 5},
                {3, 4}
        };

        int[][] merge = new MergeIntervals().merge(intervals);

        for (int i = 0; i < merge.length - 1; i++) {
            assertThat(merge[i][0]).isLessThan(merge[i + 1][0]);
        }
    }

    @Test
    public void test_stack() {
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{2, 3});
        stack.push(new int[]{1, 4});
        int[] pop = stack.pop();
        assertThat(pop[0]).isEqualTo(1);
        assertThat(pop[1]).isEqualTo(4);
    }
}