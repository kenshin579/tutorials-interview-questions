package com.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonSubStringTest {

	@Test
	public void getStr1() {
		assertThat(CommonSubString.getStr("penpineapple", "applepen")).isEqualTo("apple");
		assertThat(CommonSubString.LCSubStr("penpineapple", "applepen")).isEqualTo("apple");
	}
}