package com.baekjoon;

import lombok.extern.slf4j.Slf4j;

/**
 * 2003 : 수들의 합2
 * https://www.acmicpc.net/problem/2003
 * Two Pointer 알고리즘
 * https://www.youtube.com/watch?v=iSjvuixMPmQ
 */
@Slf4j
public class SubSum {
    public int mySolution(int[] arr, int M) {
        int sum = 0;

        int leftIdx = 0;
        int rightIdx = 0;
        int count = 0;

        while (leftIdx <= rightIdx && rightIdx < arr.length) {
            //sum

            if (sum >= M) {
                sum -= arr[leftIdx++];
            } else {
                sum += arr[rightIdx++];
            }

            //check
            if (sum == M) {
                count++;
            }
            log.info("L:{} R:{} sum : {} count : {}", leftIdx, rightIdx, sum, count);
        }
        return count;
    }

    /**
     * O(N^2)
     */
    public int solution1(int[] arr, int M) {
        int sum;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == M) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
