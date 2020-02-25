package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseStrTest {

    @Test
    public void test_reverseStr1() {
        assertThat(new ReverseStr().reverseStr("abcdefg", 2)).isEqualTo("bacdfeg");
    }

    @Test
    public void test_reverseStr2() {
        assertThat(new ReverseStr().reverseStr("abcdefg", 3)).isEqualTo("cbadefg");
    }

    @Test
    public void test_reverseStr3() {
        assertThat(new ReverseStr().reverseStr("abcdefg", 1)).isEqualTo("abcdefg");
    }

    @Test
    public void test_reverseStr1_str이_k보다_적은_경우() {
        assertThat(new ReverseStr().reverseStr("abcdefg", 5)).isEqualTo("edcbafg");
    }

    @Test
    public void test_reverseStr1_str이_k와_같은_경우() {
        assertThat(new ReverseStr().reverseStr("abcdefg", 7)).isEqualTo("gfedcba");
    }

    @Test
    public void test_reverseStr_숫자_테스트1() {
        assertThat(new ReverseStr().reverseStr("12345678901234567890", 2)).isEqualTo("21346578091243568790");
    }

    @Test
    public void test_reverseStr_숫자_테스트2() {
        assertThat(new ReverseStr().reverseStr("12345678901234567890", 3)).isEqualTo("32145698701254367809");
    }

    @Test
    public void test_reverseStr_숫자_테스트3() {
        assertThat(new ReverseStr().reverseStr("12345678901234567890", 4)).isEqualTo("43215678210934560987");
    }
}