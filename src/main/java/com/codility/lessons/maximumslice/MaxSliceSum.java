package com.codility.lessons.maximumslice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaxSliceSum {

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
    public int bruteForce(int[] A) {
        int globalMax = Integer.MIN_VALUE;
        int currentSum;

        if (A.length == 1) {
        	return A[0];
		}
        for (int i = 0; i < A.length; i++) {
        	currentSum = A[i];

            for (int j = i + 1; j < A.length; j++) {
				log.info("{}.{} max({}, {}+{}={})", i, j, currentSum, A[j], currentSum, A[j] + currentSum);
                currentSum = A[j] + currentSum;
                globalMax = Math.max(currentSum, globalMax);
                log.info("{}.{} currentSum : {} globalMax : {}", i, j, currentSum, globalMax);
            }
            log.info("");

        }
        return globalMax;
    }

	/**
	 * https://www.geeksforgeeks.org/maximum-subarray-sum-using-divide-and-conquer-algorithm/
	 * https://www.codesdope.com/blog/article/maximum-subarray-sum-using-divide-and-conquer/
	 * https://www.youtube.com/watch?v=yBCzO0FpsVc
	 *
	 * O(n log n)
	 * @param A
	 * @param n
	 * @return
	 */
    public int divideConquer(int[] A, int n) {
		if (n == 1) {
			return A[0];
		}

		int  m = n / 2;
		int leftMss = divideConquer(A, m);
//		int rightMss = divideConquer(A);
    	return 0;
	}

    /**
     * kadane's algorithm
     * - https://www.youtube.com/watch?v=86CQq3pKSUw
     * - https://www.youtube.com/watch?v=ohHWQf1HDfU
     * <p>
     * 성능 : O(N)
     *
     * @param A
     * @return
     */
    public int kadaneAlgorithm(int[] A) {
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
