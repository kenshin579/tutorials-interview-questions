package com.leetcode.algorithm;

import com.leetcode.algorithm.easy.TwoSum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class TwoSumTest {
    @Test
    public void test_twoSum1() {
        int[] nums = {2, 7, 11, 15};
        int[] results = {0, 1};
        assertThat(new TwoSum().twoSum(nums, 9)).isEqualTo(results);
    }

    @Test
    public void test_twoSum2() {
        int[] nums = {4, 6, 9, 11};
        int[] results = {1, 3};
        assertThat(new TwoSum().twoSum(nums, 17)).isEqualTo(results);
    }

    @Test
    public void test_twoSum3() {
        int[] nums = {-1, -2, -3, -4, -5};
        int[] results = {2, 4};
        assertThat(new TwoSum().twoSum(nums, -8)).isEqualTo(results);
    }
}