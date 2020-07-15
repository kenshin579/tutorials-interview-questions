package com.programmers.kakao.stack;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StockPriceTest {

    /**
     * 반환값 :가격이 떨어지지 않은 기간은 몇 초 카운트하면 됨
     */
    @Test
    public void solution() {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = {4, 3, 1, 1, 0};

        assertThat(new StockPrice().solution(prices)).isEqualTo(answer);
    }

    @Test
    public void solution2() {
        int[] prices = {1, 1, 1};
        int[] answer = {2, 1, 0};

        assertThat(new StockPrice().solution(prices)).isEqualTo(answer);
    }
}