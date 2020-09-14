package com.geeksforgeeks.dp;

import lombok.extern.slf4j.Slf4j;

/**
 * 0-1 Knapsack
 * https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
 * https://m.blog.naver.com/PostView.nhn?blogId=lhm0812&logNo=220853228613&proxyReferer=https:%2F%2Fwww.google.com%2F
 * <p>
 * 참고
 * 배낭문제는 2가지 문제로 나닌다.
 * 1. 물건을 쪼갤 수 있는 배낭문제(Fraction Knapsack Problem)
 * - 해결 : Greedy 방식으로 해결함
 * 2. 물건을 쪼갤 수 없는 배낭문제(0/1 Knapsack Problem)으로 나뉜다.
 * - 해결 : DP 방식으로 해결함
 * - https://www.youtube.com/watch?v=8LusJS5-AGo
 * - https://www.youtube.com/watch?v=cJ21moQpofY
 */
@Slf4j
public class Knapsack {
    /**
     * Time Complexity : O(N*W)
     * - where ‘N’ is the number of weight element and ‘W’ is capacity
     * <p>
     * Algorithm : create max value table
     */
    public int getSumOfWeights(int[] values, int[] weights, int W) {
        int N = values.length;
        int[][] DP = new int[N + 1][W + 1];
        int maxValue, weight, prevMaxIndex, prevMaxValue;

        for (int i = 0; i <= N; i++) { //items
            for (int j = 0; j <= W; j++) { //capacity 값
                log.info("{}.{}", i, j);
                if (i == 0 || j == 0) {
                    DP[i][j] = 0;
                } else {
                    weight = weights[i - 1];

                    if (j >= weight) {
                        prevMaxIndex = j - weight;
                        prevMaxValue = DP[i - 1][prevMaxIndex];
                        maxValue = Math.max(values[i - 1] + prevMaxValue, DP[i - 1][j]);
                        log.info("j:{} w:{} max({}, {}) -> {}", j, weight, values[i - 1] + prevMaxValue, DP[i - 1][j], maxValue);
                        DP[i][j] = maxValue;
                    } else { //j가 적은 값인 경우
                        DP[i][j] = DP[i - 1][j];
                    }
                }
            }
            System.out.println();
        }

        for (int i = 0; i <= N; i++) {
            log.info("{}.DP : {}", i, DP[i]);
        }
        return DP[N][W];
    }
}
