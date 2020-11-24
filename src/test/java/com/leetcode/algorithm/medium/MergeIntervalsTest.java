package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeIntervalsTest {

	@Test
	public void merge() {
		int[][] intervals = {
				{ 1, 3 },
				{ 2, 6 },
				{ 8, 10 },
				{ 15, 18 }
		};

		int[][] result = {
				{ 1, 6 },
				{ 8, 10 },
				{ 15, 18 }
		};

		assertThat(new MergeIntervals().merge(intervals)).isEqualTo(result);
	}

	@Test
	public void merge2() {
		int[][] intervals = {
				{ 1, 4 },
				{ 4, 5 }
		};

		int[][] result = {
				{ 1, 5 }
		};

		assertThat(new MergeIntervals().merge(intervals)).isEqualTo(result);
	}
}