package com.programmers.challenge.season1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryBitOperationTest {

	/**
	 *
	 */
	@Test
	public void solution() {
		int[] expected = { 3, 8 };
		assertThat(new BinaryBitOperation().solution("110010101001")).isEqualTo(expected);
	}

	@Test
	public void solution2() {
		int[] expected = { 3, 3 };
		assertThat(new BinaryBitOperation().solution("01110")).isEqualTo(expected);
	}

	@Test
	public void solution3() {
		int[] expected = { 4, 1 };
		assertThat(new BinaryBitOperation().solution("1111111")).isEqualTo(expected);
	}
}