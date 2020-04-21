package com.java.examples.test.test1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class Question2Test {

	@Test
	public void countBits() {
		assertThat(Question2.countBits(7)).isEqualTo(3);
	}

	@Test
	public void countBits2() {
		int num = 999999;
		log.info("{}", Integer.toString(num, 2));
		assertThat(Question2.countBits(num)).isEqualTo(12);

	}
}