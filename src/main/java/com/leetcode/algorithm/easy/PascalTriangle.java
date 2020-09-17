package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * Difficulty : Easy
 * Tags : Etc
 *
 * https://leetcode.com/problems/pascals-triangle/
 */
@Slf4j
public class PascalTriangle {
    /**
     * Time Complexity : O(N^2)
     * <p>
     * Algorithm :
     * 1. list of list를 만들어야 해서 2개의 loop안에서
     * - base case : [[1], [1, 1]]를 만들고
     * 2. numRows 3부터는 중간 값은 중간값을 더해서 계산한 값을 list에 추가함
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sumList;

        for (int i = 0; i < numRows; i++) {
            sumList = new ArrayList<>();
            log.info("i:{}", i);
            for (int j = 0; j <= i; j++) {
                log.info("j:{} {}", j, sumList);
                if (j == 0 || j == i) {
                    sumList.add(1);
                } else {
                    sumList.add(result.get(i - 1).get(j)
                            + result.get(i - 1).get(j - 1));
                }
            }
            result.add(sumList);
            log.info("result : {}", result);
            System.out.println();
        }
        return result;
    }
}
