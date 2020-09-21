package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 287. Find the Duplicate Number
 * Difficulty : Medium
 * Tags : Array
 *
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3414/
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */
@Slf4j
public class FindDuplicate {
    /**
     * Time Complexity : O(N)
     * <p>
     * Algorithm :
     * - array loop 돌면서 map에 해당 숫자 : 카운트를 기록함
     * - count가 2이상인 숫자를 반환함
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> numVsCount = new HashMap<>();

        int num;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            if (!numVsCount.containsKey(num)) {
                numVsCount.put(num, 1);
            } else {
                numVsCount.put(num, numVsCount.get(num) + 1);
            }
        }

        for (Integer n : numVsCount.keySet()) {
            if (numVsCount.get(n) > 1) {
                result.add(n);
            }
        }
        return result;
    }
}
