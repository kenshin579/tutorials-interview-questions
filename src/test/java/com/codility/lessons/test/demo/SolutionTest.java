package com.codility.lessons.test.demo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void solution() {
        int[] A = {1, 3, 6, 4, 1, 2};
        assertThat(new Solution().solution(A)).isEqualTo(5);
    }

    @Test
    public void solution2() {
        int[] A = {1, 2, 3};
        assertThat(new Solution().solution(A)).isEqualTo(4);
    }

    @Test
    public void solution3() {
        int[] A = {-1, -3};
        assertThat(new Solution().solution(A)).isEqualTo(1);
    }
}