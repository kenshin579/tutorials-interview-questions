package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseStrTest {

    @Test
    public void test_reverseStr1() {
        assertThat(new ReverseStr().reverseStr("abcdefg", 2)).isEqualTo("bacdefg");
    }
}