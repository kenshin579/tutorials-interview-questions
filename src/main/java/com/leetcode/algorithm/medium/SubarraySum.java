package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. Subarray Sum Equals K
 * Difficulty : Medium
 * Tags : Etc
 *
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * https://www.geeksforgeeks.org/number-subarrays-sum-exactly-equal-k/
 */
@Slf4j
public class SubarraySum {
    /**
     * Time Complexity : O(n)
     *
     * Algorithm :
     * hint : map 사용하기
     * - 그전의 sum을 각각 map에 기록을 둔다
     * - 현재 값 - K의 값이 map에 있으면 subarray의 값이 zero라는 의미이고 매칭이 있다는 의미로 count를 ++하면 된다
     * ㅁ. 9, 4 | 20, 30, 10 , 5
     * <p>
     *
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currSum = 0;
        int key;
        Map<Integer, Integer> prevSumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum == k) {
                count++;
            }

            key = currSum - k;
            if (prevSumMap.containsKey(key)) {
                count += prevSumMap.get(key);
            }

            prevSumMap.put(currSum, prevSumMap.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }


    /**
     * Time Complexity : O(N^2)
     *
     * Algorithm :
     */
    public int subarraySum2(int[] nums, int k) {
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
