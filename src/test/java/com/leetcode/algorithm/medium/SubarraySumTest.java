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
        assertThat(new SubarraySum().subarraySum2(nums, 2)).isEqualTo(2);
    }

    @Test
    public void test_subarraySum2() {
        int[] nums = {1, 2, 1, 2, 1};
        assertThat(new SubarraySum().subarraySum(nums, 3)).isEqualTo(4);
        assertThat(new SubarraySum().subarraySum2(nums, 3)).isEqualTo(4);
    }

    @Test
    public void test_subarraySum3() {
        int[] nums = {10, 2, -2, -20, 10};
        assertThat(new SubarraySum().subarraySum(nums, -10)).isEqualTo(3);
        assertThat(new SubarraySum().subarraySum2(nums, -10)).isEqualTo(3);
    }

    @Test
    public void test_subarraySum4() {
        int[] nums = {9, 4, 20, 3, 10, 5};
        assertThat(new SubarraySum().subarraySum(nums, 33)).isEqualTo(2);
        assertThat(new SubarraySum().subarraySum2(nums, 33)).isEqualTo(2);
    }

    @Test
    public void test_subarraySum5() {
        int[] nums = {1, 2, 3};
        assertThat(new SubarraySum().subarraySum(nums, 3)).isEqualTo(2);
        assertThat(new SubarraySum().subarraySum2(nums, 3)).isEqualTo(2);
    }

    @Test
    public void test_subarraySum6() {
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertThat(new SubarraySum().subarraySum(nums, 0)).isEqualTo(55);
        assertThat(new SubarraySum().subarraySum2(nums, 0)).isEqualTo(55);
    }

    @Test
    public void test_subarraySum7() {
        int[] nums = {0, 0, 0};
        assertThat(new SubarraySum().subarraySum(nums, 0)).isEqualTo(6);
        assertThat(new SubarraySum().subarraySum2(nums, 0)).isEqualTo(6);
    }
}