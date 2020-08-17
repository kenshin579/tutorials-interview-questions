package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class FindLUSLengthTest {

    @Test
    public void findLUSlength() {
        assertThat(new FindLUSLength().findLUSlength("aba", "cdc")).isEqualTo(3);
    }
}