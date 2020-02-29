package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * https://www.geeksforgeeks.org/number-subarrays-sum-exactly-equal-k/
 */
@Slf4j
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if (sum == k) {
                count++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
