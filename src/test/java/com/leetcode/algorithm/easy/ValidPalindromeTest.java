package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidPalindromeTest {

    /**
     * 조건 : only alphanumeric characters and ignoring cases
     * 반환값 : 참이면 true를 반환함
     */
    @Test
    public void isPalindrome() {
        assertThat(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }

    @Test
    public void isPalindrome2() {
        assertThat(new ValidPalindrome().isPalindrome("")).isTrue();
    }

    @Test
    public void isPalindrome3() {
        assertThat(new ValidPalindrome().isPalindrome("race a car")).isFalse();
    }

    @Test
    public void isPalindrome4() {
        assertThat(new ValidPalindrome().isPalindrome("abba")).isTrue();
    }

    @Test
    public void isPalindrome5() {
        assertThat(new ValidPalindrome().isPalindrome("a bba")).isTrue();
    }

    @Test
    public void isAlphabetic() {
        assertThat(Character.isAlphabetic('a')).isTrue();
        assertThat(Character.isAlphabetic('1')).isFalse();
    }

    @Test
    public void isLetterOrDigit() {
        assertThat(Character.isLetterOrDigit('a')).isTrue();
        assertThat(Character.isLetterOrDigit('1')).isTrue();
    }
}