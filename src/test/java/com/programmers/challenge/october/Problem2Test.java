package com.programmers.challenge.october;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem2Test {

	@Test
	public void solution() {
		int[] expected = { 4, 9 };
		int[][] arr = {
				{ 1, 1, 0, 0 },
				{ 1, 0, 0, 0 },
				{ 1, 0, 0, 1 },
				{ 1, 1, 1, 1 }
		};
		assertThat(new Problem2().solution(arr)).isEqualTo(expected);
	}

	@Test
	public void solution2() {
		int[] expected = { 10, 15 };
		int[][] arr = {
				{ 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 1, 1, 1, 1 },
				{ 0, 1, 0, 0, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 1, 0, 0, 1 },
				{ 0, 0, 0, 0, 1, 1, 1, 1 }
		};
		assertThat(new Problem2().solution(arr)).isEqualTo(expected);
	}

	@Test
	public void solution3() {
		int[] expected = { 5, 5 };
		int[][] arr = {
				{ 1, 0, 1, 0 },
				{ 1, 1, 0, 0 },
				{ 0, 0, 1, 1 },
				{ 0, 0, 1, 1 }
		};
		assertThat(new Problem2().solution(arr)).isEqualTo(expected);
	}

	@Test
	public void solution4() {
		int[] expected = { 1, 3 };
		int[][] arr = {
				{ 1, 0 },
				{ 1, 1 }
		};
		assertThat(new Problem2().solution(arr)).isEqualTo(expected);
	}
}