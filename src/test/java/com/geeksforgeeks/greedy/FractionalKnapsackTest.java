package com.geeksforgeeks.greedy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionalKnapsackTest {

    /**
     * 반환값 : 주어진 W값을 넘지 않는 선에서 최대 value 값을 반환함
     */
    @Test
    public void geMaxValue() {
        int[] values = {60, 40, 100, 120};
        int[] weights = {10, 40, 20, 30};

        assertThat(new FractionalKnapsack().getMaxValue(values, weights, 50)).isEqualTo(240);
    }

    @Test
    public void geMaxValue3() {
        int[] wt = {10, 40, 20, 30};
        int[] val = {60, 40, 100, 120};
        int capacity = 50;

        assertThat(FractionalKnapsack.getMaxValue2(wt, val, capacity)).isEqualTo(240);
    }

    @Test
    public void geMaxValue2() {
        int[] values = {100, 60, 120};
        int[] weights = {20, 10, 30};

        assertThat(new FractionalKnapsack().getMaxValue(values, weights, 50)).isEqualTo(240);
    }
}