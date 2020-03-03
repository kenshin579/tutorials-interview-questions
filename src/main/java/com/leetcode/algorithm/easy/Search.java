package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * Binary Search
 * <p>
 * https://leetcode.com/problems/binary-search/
 */
@Slf4j
public class Search {
    public int search(int[] nums, int target) {
        return recursiveBinarySearch(nums, 0, nums.length - 1, target);
    }

    public int recursiveBinarySearch(int[] nums, int startIndex, int endIndex, int target) {
        if (startIndex < endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            log.info("midIndex : {}", midIndex);

            if (nums[midIndex] == target) {
                return midIndex;
            }

            if (nums[midIndex] < target) {
                return recursiveBinarySearch(nums, midIndex + 1, endIndex, target);
            } else if (nums[midIndex] > target)
                return recursiveBinarySearch(nums, startIndex, midIndex - 1, target);
        }
        return -1;
    }
}
