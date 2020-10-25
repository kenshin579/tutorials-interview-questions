package com.geeksforgeeks.graph;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinFarthestDistanceTest {

    @Test
    public void minFarthestDistance() {
        int N = 6;
        int[][] edges = {
                {1, 4},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 6}
        };

        assertThat(new MinFarthestDistance().minFarthestDistance(edges, N)).isEqualTo(2);

    }
}