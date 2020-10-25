package com.geeksforgeeks.graph;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinDistanceOfGraphTest {

    @Test
    public void minFarthestDistance() {
        int N = 6;
        int[][] arr = {
                {1, 4},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 6}
        };

        assertThat(new MinDistanceOfGraph().minFarthestDistance(arr, N)).isEqualTo(2);

    }
}