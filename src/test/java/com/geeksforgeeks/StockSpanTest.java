package com.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StockSpanTest {

    @Test
    public void solution() {
        int price[] = {10, 4, 5, 90, 120, 80};
        int answers[] = {1, 1, 2, 4, 5, 1};

        assertThat(new StockSpan().solution(price)).isEqualTo(answers);
    }

    @Test
    public void solution2() {
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        int answers[] = {1, 1, 1, 2, 1, 4, 6};

        assertThat(new StockSpan().solution(price)).isEqualTo(answers);
    }
}