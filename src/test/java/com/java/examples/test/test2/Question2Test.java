package com.java.examples.test.test2;

import com.java.examples.test.test1.Question2;
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
	public void countBits1() {
		int num = 115;
		log.info("{}", Integer.toString(num, 2));
		assertThat(Question2.countBits(num)).isEqualTo(5);
	}

	@Test
	public void countBits2() {
		int num = 999999;
		log.info("{}", Integer.toString(num, 2));
		assertThat(Question2.countBits(num)).isEqualTo(12);
	}

	@Test
	public void countBits3() {
		int num = 10;
		log.info("{}", Integer.toString(num, 2));
		assertThat(Question2.countBits(num)).isEqualTo(2);
	}

	@Test
	public void countBits_negative1() {
		int num = -10;
		log.info("{}", Integer.toString(num, 2));
		assertThat(Question2.countBits(num)).isEqualTo(30);
	}
}