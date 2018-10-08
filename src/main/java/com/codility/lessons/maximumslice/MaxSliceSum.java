package com.codility.lessons.maximumslice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaxSliceSum {
    private static final Logger LOG = LoggerFactory.getLogger(MaxSliceSum.class);

    private int getSum(int[] A, int startIndex, int endIndex) {
        int sum = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            sum += A[i];
        }

        return sum;
    }

    /**
     * array의 slice구간에서 sum이 가장 큰것
     * - brute force solution
     *
     * <p>
     * 결과: 69%
     * <p>
     * 성능 : O(n^2)
     *
     * @param A
     * @return
     */
    public int solution1(int[] A) {
        int size = A.length;
        int max = Integer.MIN_VALUE;
        int sum;

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                sum = getSum(A, i, j);
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    /**
     * kadane's algorithm
     * - https://www.youtube.com/watch?v=86CQq3pKSUw
     * <p>
     * 성능 : O(N)
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        int maxCurrent = A[0];
        int maxGlobal = A[0];

        int size = A.length;
        for (int i = 1; i < size; i++) {
            maxCurrent = Math.max(A[i], A[i] + maxCurrent);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }
}
