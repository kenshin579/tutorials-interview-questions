package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 704. Binary Search
 * Difficulty : Easy
 * Tags : BinarySearch
 *
 * <p>
 * https://leetcode.com/problems/binary-search/
 */
@Slf4j
public class Search {
    public int search(int[] nums, int target) {
        return nonRecursiveBST(nums, target);
    }

    private int nonRecursiveBST(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int midIndex;

        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }

        while (startIndex < endIndex) {
            midIndex = startIndex + (endIndex - startIndex) / 2;
            log.info("midIndex : {}", midIndex);

            if (nums[midIndex] == target) {
                return midIndex;
            }

            if (nums[midIndex] < target) {
                startIndex = midIndex + 1;
            } else if (nums[midIndex] > target) {
                endIndex = midIndex - 1;
            }

        }
        return -1;
    }

    private int recursiveBinarySearch(int[] nums, int startIndex, int endIndex, int target) {
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        log.info("midIndex : {}", midIndex);

        if (nums[midIndex] == target) {
            return midIndex;
        }

        if (startIndex < endIndex) {
            if (nums[midIndex] < target) {
                return recursiveBinarySearch(nums, midIndex + 1, endIndex, target);
            } else if (nums[midIndex] > target)
                return recursiveBinarySearch(nums, startIndex, midIndex - 1, target);
        }
        return -1;
    }
}
