package com.programmers.binarysearch;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BudgetTest {

    /**
     * 키워드 :
     *
     * 1. 모든 요청이 배정될 수 있는 경우에는 요청한 금액을 그대로 배정합니다.
     * 2. 모든 요청이 배정될 수 없는 경우에는 특정한 정수 상한액을 계산하여 그 이상인 예산요청에는 모두 상한액을 배정합니다.
     *    상한액 이하의 예산요청에 대해서는 요청한 금액을 그대로 배정합니다.
     *
     * 해설 : 120, 110, 127, 127을 배정하고 그 합이 484로 가능한 최대가 됩니다.
     * 반환 값 : 위 조건을 만족하는 상한액(max)을 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한사항
     * - 지방의 수는 3 이상 100,000 이하인 자연수입니다.
     * - 각 지방에서 요청하는 예산은 1 이상 100,000 이하인 자연수입니다.
     * - 총 예산은 지방의 수 이상 1,000,000,000 이하인 자연수입니다.
     */
    @Test
    public void solution() {
        int[] bucket = {120, 110, 140, 150};

        assertThat(new Budget().mySolution(bucket, 485)).isEqualTo(127);
        assertThat(new Budget().solution2(bucket, 485)).isEqualTo(127);
    }
}