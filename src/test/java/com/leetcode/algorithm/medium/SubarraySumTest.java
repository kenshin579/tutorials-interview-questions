package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SubarraySumTest {

    @Test
    public void test_subarraySum() {
        int[] nums = {1, 1, 1};
        assertThat(new SubarraySum().subarraySum(nums, 2)).isEqualTo(2);
    }
}