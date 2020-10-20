package com.programmers.challenge.season1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertToTernaryTest {

	@Test
	public void solution() {
		assertThat(new ConvertToTernary().solution(45)).isEqualTo(7);
	}

	@Test
	public void solution2() {
		assertThat(new ConvertToTernary().solution(125)).isEqualTo(229);
	}
}