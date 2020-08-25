package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 */
@Slf4j
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                log.info("[{}][{}] {}, {}", i, j, nums[i], nums[j]);
                if (target == nums[i] + nums[j]) {
                    results[0] = i;
                    results[1] = j;
                    break;
                }

            }
        }
        return results;
    }
}
