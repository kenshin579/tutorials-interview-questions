package com.codility.lessons.matrix;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    public void solution() {
        int[][] matrix = {
                {0, 1, 9, 3},
                {7, 5, 8, 3},
                {9, 2, 9, 4},
                {4, 6, 7, 1}
        };
        assertThat(new Solution().solution(matrix)).isEqualTo(2);
    }
}