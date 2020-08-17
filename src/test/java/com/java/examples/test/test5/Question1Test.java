package com.java.examples.test.test5;

import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class Question1Test {

	@Test
	public void change() {
		assertThat(Question1.change(7, 2)).isEqualTo(Integer.toString(7, 2));
	}

	@Test
	public void change1() {
		assertThat(Question1.change(2353, 16)).isEqualTo(Integer.toString(2353, 16));
	}

	@Test
	public void change2() {
		assertThat(Question1.change(2352, 8)).isEqualTo(Integer.toString(2352, 8));
	}

	@Test
	public void change3() {
		assertThat(Question1.change(2352, 12)).isEqualTo(Integer.toString(2352, 12));
	}

	@Test
	@Ignore
	public void change4() {
		String expected = Integer.toString(94, 16);
		log.info("expected : {}", expected);

		assertThat(Question1.change(94, 16)).isEqualTo(expected);
	}
}