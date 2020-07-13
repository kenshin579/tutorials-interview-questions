package com.java.examples.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class GetNumTest {

	@Test
	public void getNum1() {
		assertThat(GetNum.getNum(7)).isEqualTo(3);
	}

	@Test
	public void getNum2() {
		int num = 999999;
		log.info("{}", Integer.toString(num, 2));
		assertThat(GetNum.getNum(num)).isEqualTo(12);

	}
}