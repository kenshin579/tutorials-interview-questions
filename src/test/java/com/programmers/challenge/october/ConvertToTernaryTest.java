package com.programmers.challenge.october;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertToTernaryTest {

	@Test
	public void solution() {
		assertThat(new ConvertToTernary().solution(45)).isEqualTo(7);

	}
}