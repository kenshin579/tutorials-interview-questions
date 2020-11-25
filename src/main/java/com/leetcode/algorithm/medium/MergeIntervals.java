package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * 56. Merge Intervals
 * Difficulty : Medium
 * Tags : Array
 * <p>
 * https://leetcode.com/problems/merge-intervals/
 * https://www.geeksforgeeks.org/merging-intervals/
 */
@Slf4j
public class MergeIntervals {
    /**
     * Time Complexity : O(N)
     * <p>
     * Algorithm : Stack을 사용하는 방법
     * 1. stack에 하나 추가
     * 2. stack에서 하나씩 꺼내면서 나머지 intervals의 값을 loop을 돌면서 overlap이면 merge하도록 함
     */
    public int[][] merge(int[][] intervals) {
        Stack<int[]> stack = new Stack<>();

        //sort
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        //stack에 쌓으면서 merge를 진행하면 됨
        stack.push(intervals[0]);
        int[] interval;

        for (int i = 1; i < intervals.length; i++) {
            interval = stack.pop();

            if (isPartiallyOverlapped(interval, intervals[i])) {
                stack.push(new int[] {interval[0], intervals[i][1]});
            } else if (contains(interval, intervals[i])) {
                stack.push(interval);
            } else {
                stack.push(interval);
                stack.push(intervals[i]);
            }

        }

        //stack에서 뽑아서
        return convertStackToArrays(stack);
    }

    int[][] convertStackToArrays(Stack<int[]> stack) {
        int[][] result = new int[stack.size()][2];
        int[] pop;
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            pop = stack.pop();
            result[index--] = pop;
        }
        return result;
    }

    boolean isPartiallyOverlapped(int[] x, int[] y) {
        return !contains(x, y) && y[0] >= x[0] && y[0] <= x[1];
    }

    boolean contains(int[] x, int[] y) {
        return y[0] >= x[0] && x[1] >= y[1];
    }
}
