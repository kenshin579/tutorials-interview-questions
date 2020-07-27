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
    /**
     * Time Complexity : O(N*M) where M is the num of bits
     * Algorithm :
     * - power set을 만들기 위해 숫자의(ex. 1~N) bit 패턴을 이용해서 생성함
     *
     * 참고
     * - Power set P(S) of a set S is the set of all subsets of S
     * ㅁ. P(s) = {{}, {a}, {b}, {c}, {a,b}, {a, c}, {b, c}, {a, b, c}}
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        String maxBinaryStr = generateBinaryStr(nums.length);
        int max = convertBinaryStrToDecimal(maxBinaryStr);
        log.info("maxBinaryStr : {} max : {}", maxBinaryStr, max);

        List<Integer> subList;

        for (int eachNum = 0; eachNum <= max; eachNum++) {
            subList = new ArrayList<>();
            log.info("eachNum : {} {}", eachNum, Integer.toBinaryString(eachNum));

            for (int bitIdx = 0; bitIdx < nums.length; bitIdx++) {
                if ((eachNum & (1 << bitIdx)) > 0) {
                    subList.add(nums[bitIdx]);
                    log.info(" {}.subList : {}", bitIdx, subList);
                }
            }
            result.add(subList);
        }

        log.info("result : {}", result);
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
