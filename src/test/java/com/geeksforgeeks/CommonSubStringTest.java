package com.geeksforgeeks;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonSubStringTest {

	@Test
	public void getStr1() {
		assertThat(CommonSubString.getStr("penpineapple", "applepen")).isEqualTo("apple");
		assertThat(CommonSubString.LCSubStr("penpineapple", "applepen")).isEqualTo("apple");
	}

//	@Test
//	public void name() {
//		List<Integer> lists = List.of(1, 2, 3, 4);
//		lists.stream().map(x -> x + 1).collect(Collectors.toList());
//	}
}