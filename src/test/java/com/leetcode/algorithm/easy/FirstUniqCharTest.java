package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class FirstUniqCharTest {

    @Test
    public void firstUniqChar() {
        assertThat(new FirstUniqChar().firstUniqChar("leetcode")).isEqualTo(0);
    }

    @Test
    public void firstUniqChar2() {
        assertThat(new FirstUniqChar().firstUniqChar("loveleetcode")).isEqualTo(2);
    }
}