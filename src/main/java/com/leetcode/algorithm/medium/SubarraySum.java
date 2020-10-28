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
     * Algorithm : map 사용하기
     * 1. 그전의 sum을 각각 map에 기록을 둔다
     *
     * todo : 다시 작성하기 - 2. (현재 값 - K)의 값이 map에 있으면 subarray의 값이 zero라는 의미이고 매칭이 있다는 의미로 count를 ++하면 된다
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int accumulatedSum = 0;
        int key;
        Map<Integer, Integer> allPrevSumsVsCount = new HashMap<>();

        for (int num : nums) {
            accumulatedSum += num;
            log.info("accumulatedSum : {} num:{}", accumulatedSum, num);
            if (accumulatedSum == k) {
                count++;
            }

            key = accumulatedSum - k; //target값을 뺀 값이 map에 있는지 확인
            log.info("key : {}", key);
            if (allPrevSumsVsCount.containsKey(key)) {
                count += allPrevSumsVsCount.get(key); //todo: 정확하게 이해는 못하기는 했음
            }

            allPrevSumsVsCount.put(accumulatedSum, allPrevSumsVsCount.getOrDefault(accumulatedSum, 0) + 1);
            log.info("allPrevSumsVsCount : {} count:{}", allPrevSumsVsCount, count);
            System.out.println();
        }
        return count;
    }


    /**
     * Time Complexity : O(N^2)
     *
     * Algorithm :
     * 1.outer, inner loop을 돌면서 sum이 target(k) 값이 같은 경우에 count 증가
     */
    public int subarraySum2(int[] nums, int k) {
        int count = 0;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
