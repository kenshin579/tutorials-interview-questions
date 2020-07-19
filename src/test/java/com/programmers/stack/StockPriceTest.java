package com.programmers.stack;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StockPriceTest {

    /**
     * 반환값 : 가격이 떨어지지 않은 기간은 몇 초 카운트하면 됨
     */
    @Test
    public void solution() {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = {4, 3, 1, 1, 0};

        assertThat(new StockPrice().bestSolution(prices)).isEqualTo(answer);
        assertThat(new StockPrice().mySolution(prices)).isEqualTo(answer);
        assertThat(new StockPrice().solution2(prices)).isEqualTo(answer);
    }

    @Test
    public void solution2() {
        int[] prices = {1, 1, 1};
        int[] answer = {2, 1, 0};

        assertThat(new StockPrice().bestSolution(prices)).isEqualTo(answer);
        assertThat(new StockPrice().mySolution(prices)).isEqualTo(answer);
        assertThat(new StockPrice().solution2(prices)).isEqualTo(answer);
    }

    @Test
    public void solution3() {
        int[] prices = {2, 3, 6, 7, 5, 3, 5, 7, 8, 3, 2};
        int[] answer = {10, 9, 2, 1, 1, 5, 3, 2, 1, 1, 0};

        assertThat(new StockPrice().bestSolution(prices)).isEqualTo(answer);
        assertThat(new StockPrice().mySolution(prices)).isEqualTo(answer);
        assertThat(new StockPrice().solution2(prices)).isEqualTo(answer);
    }
}