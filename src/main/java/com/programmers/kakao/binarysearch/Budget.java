package com.programmers.kakao.binarysearch;

import java.util.stream.IntStream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43237
 * https://daniel-park.tistory.com/26
 * https://kjhov195.github.io/2020-04-05-algorithm_binary_search_1/
 * https://willbfine.tistory.com/299
 */
public class Budget {
    public int solution(int[] budgets, int M) {
        int sum = IntStream.of(budgets).sum();
        int max = IntStream.of(budgets).max().getAsInt();
        /******************************
         * 이분탐색을 활용하여 할당예산 이상 나오지
         * 않을 경우 최댓값을 기준으로 상한선이 정해
         * 지기 때문에 1과 최댓값을 이용해서
         * 대소 비교를 통해 할당 예산이 허용하는
         * 최대치까지 구할 수 있다.
         *******************************/
        if (sum <= M) return max;
        search(1, max, budgets, M);
        return res;
    }

    static int res = Integer.MIN_VALUE;

    public void search(int start, int end, int[] budgets, int M) {

        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        int sum = 0;
        for (int i = 0; i < budgets.length; i++) {
            sum += budgets[i] > mid ? mid : budgets[i];
        }

        if (sum <= M) {
            res = Math.max(mid, res);
            search(mid + 1, end, budgets, M);
        } else {
            search(start, mid, budgets, M);
        }

    }
}
