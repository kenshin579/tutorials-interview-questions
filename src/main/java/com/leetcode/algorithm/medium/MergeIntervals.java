package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * 56. Merge Intervals
 * Difficulty : Medium
 * Tags : Array
 *
 * https://leetcode.com/problems/merge-intervals/
 * https://www.geeksforgeeks.org/merging-intervals/
 */
@Slf4j
@Deprecated
public class MergeIntervals {
	/**
	 * Time Complexity :
	 *
	 * Algorithm : Stack을 사용하는 방법
	 *
	 */
	public int[][] merge(int[][] intervals) {
		int[][] result = new int[intervals.length][2];

		Stack<int[]> stack = new Stack<>();

		//sort
		Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

		//stack에 쌓으면서 merge를 진행하면 됨
		stack.push(intervals[0]);
		int[] pop;

		for (int i = 1; i < intervals.length; i++) {
			pop = stack.pop();

		}

		//stack에서 뽑아서

		return result;
	}

	boolean isMutuallyExclusiveOverlapped(int[] x, int[] y) {

		return false;
	}
}
