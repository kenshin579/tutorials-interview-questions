package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. Combinations
 * https://leetcode.com/problems/combinations/
 * https://www.baeldung.com/java-combinations-algorithm
 * https://bumbums.tistory.com/2
 * Permutation과 다르게 순서는 상관이 없다
 * <p>
 */
@Slf4j
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        //todo : recursive하게 하는 방법을 찾아보면 좋을 듯함

        return result;
    }

    /**
     * Time Complexity :
     *
     * Algorithm :
     * - Power Set중에서 bit가 K인 것만 결과를 찾아내는 방법임
     * https://www.youtube.com/watch?v=NYpqCbHPEO4
     *
     */
    public List<String> combinationWithBits(String[] arr, int K) {
        List<String> result = new ArrayList<>();

        int n = arr.length;
        int N = (int) Math.pow(2, n);
        log.info("N : {}", N);
        for (int i = 0; i < N; i++) {
            String code = Integer.toBinaryString(N | i).substring(1); //code = 0011
            String b = "";

            int counter = 0;
            for (int j = 0; j < n; j++) {
                if (code.charAt(j) == '1') {
                    b += arr[j];
                    counter++;
                }
            }

            log.info("b : {} counter: {}", b, counter);
            if (counter == K) {
                result.add(b);
            }
        }
        return result;
    }
}
