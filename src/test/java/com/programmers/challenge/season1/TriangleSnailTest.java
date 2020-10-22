package com.programmers.challenge.season1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleSnailTest {

    @Test
    public void solution() {
        int[] expected = {1, 2, 9, 3, 10, 8, 4, 5, 6, 7};
        assertThat(new TriangleSnail().solution(4)).isEqualTo(expected);
    }

    @Test
    public void solution2() {
        int[] expected = {1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9};
        assertThat(new TriangleSnail().solution(5)).isEqualTo(expected);
    }

    @Test
    public void solution3() {
        int[] expected = {1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11};
        assertThat(new TriangleSnail().solution(6)).isEqualTo(expected);
    }

    @Test
    public void solution4() {
        int[] expected = {1};
        assertThat(new TriangleSnail().solution(1)).isEqualTo(expected);
    }

    @Test
    public void solution5() {
        int[] expected = {1, 2, 3};
        assertThat(new TriangleSnail().solution(2)).isEqualTo(expected);
    }

    @Test
    public void solution6() {
        int[] expected = {1, 2, 6, 3, 4, 5};
        assertThat(new TriangleSnail().solution(3)).isEqualTo(expected);
    }
}