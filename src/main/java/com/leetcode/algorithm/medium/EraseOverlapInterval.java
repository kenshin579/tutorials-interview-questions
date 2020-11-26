package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 435. Non-overlapping Intervals
 * Difficulty : Medium
 * Tags : Array
 * <p>
 * https://leetcode.com/problems/non-overlapping-intervals/
 */
@Slf4j
public class EraseOverlapInterval {

    /**
     * Time Complexity : O(N)
     *
     * Algorithm :
     * 1. 2번째 열 기준으로 정렬 시킴
     * 2. 겹치는 경우를 count함
     * - [3,4] > [6,7] : 겹치지 않음 (4 > 6)
     * - [1,2] > [2,3] : 겹치지 않음 (2 > 2)
     * - [2,3] > [1,3] : 겹친다 (3 > 1)
     * <p>
     * Note : [1,2] [2,3]은 edge가 맞닿았지만, 겹치지 않는 걸로 봄
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0 || intervals[0].length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new MyComparator());

        int prevIndex = 0;
        int count = 0;
        for (int currIndex = 1; currIndex < intervals.length; currIndex++) {
            if (intervals[prevIndex][1] > intervals[currIndex][0]) {
                count++;
            } else {
                prevIndex = currIndex;
            }
        }

        return count;
    }

    /**
     * array 2번째 column으로 정렬 시킴
     */
    class MyComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return a[1] - b[1];
        }
    }
}
