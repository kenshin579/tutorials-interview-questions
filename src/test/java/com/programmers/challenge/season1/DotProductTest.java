package com.programmers.challenge.season1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DotProductTest {

    @Test
    public void solution() {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        assertThat(new DotProduct().solution(a, b)).isEqualTo(3);
    }

    @Test
    public void solution2() {
        int[] a = {-1, 0, 1};
        int[] b = {1, 0, -1};
        assertThat(new DotProduct().solution(a, b)).isEqualTo(-2);
    }
}