package com.programmers.challenge.season1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem3Test {

	@Test
	public void solution() {
		int[][] edges = {
				{ 1, 2 },
				{ 2, 3 },
				{ 3, 4 }
		};
		assertThat(new Problem3().solution(4, edges)).isEqualTo(2);
	}

	@Test
	public void solution3() {
		int[][] edges = {
				{ 1, 5 },
				{ 2, 5 },
				{ 3, 5 },
				{ 4, 5 }
		};

		assertThat(new Problem3().solution(5, edges)).isEqualTo(2);
	}
}