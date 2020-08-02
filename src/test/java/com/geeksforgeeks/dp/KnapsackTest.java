package com.geeksforgeeks.dp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KnapsackTest {

    /**
     * 가치(value)의 합이 최대가 되도록 짐을 고르면 됨
     *
     * 반환값 :
     * 조건 : You cannot break an item, either pick the complete item or don’t pick it (0-1 property).
     */
    @Test
    public void getSumOfWeights() {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        assertThat(new Knapsack().getSumOfWeights(values, weights, 50)).isEqualTo(220);
    }

    @Test
    public void getSumOfWeights2() {
        int[] values = {2, 2, 4, 5, 3};
        int[] weights = {3, 1, 3, 4, 2};
        assertThat(new Knapsack().getSumOfWeights(values, weights, 7)).isEqualTo(2+5+3);
    }

    @Test
    public void getSumOfWeights3() {
        int[] values = {2, 2, 4, 5, 3};
        int[] weights = {3, 1, 3, 4, 2};
        assertThat(new Knapsack().getSumOfWeights(values, weights, 0)).isEqualTo(0);
    }
}