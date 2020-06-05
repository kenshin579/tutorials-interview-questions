package com.java.examples.test.test3;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class Question1Test {

	@Test
	public void wordLength() {
		assertThat(Question1.wordLength("penpineapple", "applepen")).isEqualTo("apple");
	}

	@Test
	public void wordLength2() {
		assertThat(Question1.wordLength("penpineapple", "applepen")).isEqualTo("apple");
	}
}