package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixBlockSumTest {

    @Test
    public void matrixBlockSum() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] result = {
                {12, 21, 26},
                {27, 45, 33},
                {24, 39, 28}
        };
        assertThat(new MatrixBlockSum().matrixBlockSum(mat, 1)).isEqualTo(result);
    }

    @Test
    public void matrixBlockSum2() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] result = {
                {45, 45, 45},
                {45, 45, 45},
                {45, 45, 45}
        };
        assertThat(new MatrixBlockSum().matrixBlockSum(mat, 2)).isEqualTo(result);
    }
}