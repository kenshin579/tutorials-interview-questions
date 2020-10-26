package com.programmers.master;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameMapShortestPathTest {

    @Test
    public void solution() {
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };

        assertThat(new GameMapShortestPath().solution(maps)).isEqualTo(11);
    }

    @Test
    public void solution2() {
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}
        };

        assertThat(new GameMapShortestPath().solution(maps)).isEqualTo(-1);

    }
}