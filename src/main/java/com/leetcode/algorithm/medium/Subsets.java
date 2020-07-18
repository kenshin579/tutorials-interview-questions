package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 * https://www.youtube.com/watch?v=RnlHPR0lyOE
 * backtracking
 * https://it00.tistory.com/26
 * <p>
 * https://www.geeksforgeeks.org/power-set/
 */
@Slf4j
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int max = convertBinaryStrToDecimal(generateBinaryStr(nums.length));
        List<Integer> subList;

        for (int eachNum = 0; eachNum <= max; eachNum++) {
            subList = new ArrayList<>();

            for (int bitIdx = 0; bitIdx < nums.length; bitIdx++) {
                if ((eachNum & (1 << bitIdx)) > 0) {
                    subList.add(nums[bitIdx]);
                }
            }
            result.add(subList);
        }
        return result;
    }


    protected String generateBinaryStr(int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append("1");
        }
        return sb.toString();
    }

    protected int convertBinaryStrToDecimal(String binStr) {
        return Integer.parseInt(binStr, 2);
    }
}
