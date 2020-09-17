package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1512. Number of Good Pairs
 * Difficulty : Easy
 * Tags : Map
 *
 * https://leetcode.com/problems/number-of-good-pairs/
 */
@Slf4j
public class NumberOfGoodPairs {
    /**
     * Time complexity : O(N)
     *
     * @param nums
     * @return
     */
    public int numIdenticalPairs(int[] nums) {
        //todo: stream으로 변경하는 방법은?
        Map<Integer, List<Integer>> valueVsIndexMap = new HashMap<>();
        int value;
        List<Integer> indexList;
        for (int index = 0; index < nums.length; index++) {
            value = nums[index];
            if (!valueVsIndexMap.containsKey(value)) { //처음
                indexList = new ArrayList<>();
                indexList.add(index);
                valueVsIndexMap.put(value, indexList);
            } else {
                indexList = valueVsIndexMap.get(value);
                indexList.add(index);
                valueVsIndexMap.put(value, indexList);
            }
        }

        int count = 0;
        int size;
        for (Integer valueKey : valueVsIndexMap.keySet()) {
            size = valueVsIndexMap.get(valueKey).size();
            if (size != 1) {
                count += getSummationValue(size - 1);
            }
        }
        return count;
    }

    protected int getSummationValue(int value) {
        return (value * (value + 1)) / 2;
    }
}
