package com.programmers.challenge.october;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem4Test {

	@Test
	public void solution() {
		assertThat(new Problem4().solution("baby")).isEqualTo(9);
	}

	@Test
	public void solution2() {
		assertThat(new Problem4().solution("oo")).isZero();
	}

	@Test
	public void solution3() {
//		assertThat(new Problem4().solution("abbca")).isEqualTo(3);
	}
}