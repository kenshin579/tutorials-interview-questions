package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseWordsTest {

    @Test
    public void reverseWords() {
        assertThat(new ReverseWords().reverseWords("Let's take LeetCode contest")).isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }

    @Test
    public void test_reverse() {
        assertThat(new ReverseWords().reverse("test")).isEqualTo("tset");
    }
}