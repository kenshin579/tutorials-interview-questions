package com.geeksforgeeks.dp;

import lombok.extern.slf4j.Slf4j;

/**
 * SubsetSum
 * https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
 * https://www.youtube.com/watch?v=s6FhG--P7z0
 */
@Slf4j
public class SubsetSum {
    /**
     * Time Complexity : O(targetSum * N)
     * - sum : targetSum , N : size of array
     * <p>
     * Algorithm : DP 방식
     * - Knapsack 문제와 비슷하게 행:set의 값 vs 열:target 값에 subset의 true/false값을 갖는 테이블을 생성함
     * - bottom + right 값이 결과임
     */
    public boolean isSubsetSum(int[] set, int targetSum) {
        log.info("targetSum : {}", targetSum);

        int N = set.length;
        boolean[][] DP = new boolean[N][targetSum + 1];
        int value, prevIndex;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= targetSum; j++) {
                log.info("{}.{}", i, j);
                if (j == 0) {
                    DP[i][j] = true;
                } else {
                    value = set[i];
                    if (i == 0) {
                        DP[i][j] = value == j;
                    } else {
                        if (value > j) {
                            DP[i][j] = DP[i - 1][j];
                        } else {
                            prevIndex = j - value;
                            DP[i][j] = DP[i - 1][prevIndex] || DP[i - 1][j];
                        }
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            log.info("{}", DP[i]);
        }

        return DP[N - 1][targetSum];
    }
}
