package com.programmers.challenge.october;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem1Test {

	@Test
	public void solution() {
		assertThat(new Problem1().solution(45)).isEqualTo(7);

	}
}