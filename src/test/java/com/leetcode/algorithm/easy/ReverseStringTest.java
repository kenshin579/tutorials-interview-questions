package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class ReverseStringTest {

    @Test
    public void reverseString() {
        char[] s = "hello".toCharArray();
        char[] result = "olleh".toCharArray();

        new ReverseString().reverseString(s);
        assertThat(s).isEqualTo(result);
    }

    @Test
    public void reverseString2() {
        char[] s = "Hannah".toCharArray();
        char[] result = "hannaH".toCharArray();

        new ReverseString().reverseString(s);
        assertThat(s).isEqualTo(result);
    }
}