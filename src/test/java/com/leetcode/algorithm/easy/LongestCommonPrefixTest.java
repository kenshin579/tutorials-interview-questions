package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        String[] strs = {"flower", "flow", "flight"};
        assertThat(new LongestCommonPrefix().longestCommonPrefix(strs)).isEqualTo("fl");
    }

    @Test
    public void longestCommonPrefix2() {
        String[] strs = {"dog", "racecar", "car"};
        assertThat(new LongestCommonPrefix().longestCommonPrefix(strs)).isEqualTo("");
    }

    @Test
    public void longestCommonPrefix3() {
        String[] strs = {"dar", "racecar", "car"};
        assertThat(new LongestCommonPrefix().longestCommonPrefix(strs)).isEqualTo("ar");
    }

    @Test
    public void longestCommonPrefix4() {
        String[] strs = {"dar", "racecar", "car"};
        assertThat(new LongestCommonPrefix().longestCommonPrefix(strs)).isEqualTo("ar");
    }

    @Test
    public void getCommonPrefix1() {
        assertThat(new LongestCommonPrefix().getCommonPrefix("apple", "ape")).isEqualTo("ap");
    }

    @Test
    public void getCommonPrefix2() {
        assertThat(new LongestCommonPrefix().getCommonPrefix("acarple", "ape")).isEqualTo("a");
    }

    @Test
    public void getCommonPrefix3() {
        assertThat(new LongestCommonPrefix().getCommonPrefix("geeks", "gee")).isEqualTo("gee");
    }
}