package com.baekjoon;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubSumTest {

    /**
     * 반환값 : M값이 된느 경우의 수
     */
    @Test
    public void mySolution() {
        int[] arr = {1, 1, 1, 1};

        assertThat(new SubSum().solution1(arr, 2)).isEqualTo(3);
        assertThat(new SubSum().mySolution(arr, 2)).isEqualTo(3);
    }

    @Test
    public void mySolution2() {
        int[] arr = {1, 2, 3, 4, 2, 5, 3, 1, 1, 2};

        assertThat(new SubSum().solution1(arr, 5)).isEqualTo(3);
        assertThat(new SubSum().mySolution(arr, 5)).isEqualTo(3);
    }
}