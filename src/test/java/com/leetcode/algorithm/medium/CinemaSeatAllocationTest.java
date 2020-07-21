package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CinemaSeatAllocationTest {

    @Test
    public void maxNumberOfFamilies() {
        int[][] reservedSeats = {
                {1, 2},
                {1, 3},
                {1, 8},
                {2, 6},
                {3, 1},
                {3, 10}
        };
        assertThat(new CinemaSeatAllocation().maxNumberOfFamilies(3, reservedSeats)).isEqualTo(4);
    }

    @Test
    public void maxNumberOfFamilies2() {
        int[][] reservedSeats = {
                {2, 1},
                {1, 8},
                {2, 6}
        };
        assertThat(new CinemaSeatAllocation().maxNumberOfFamilies(2, reservedSeats)).isEqualTo(2);
    }

    @Test
    public void maxNumberOfFamilies3() {
        int[][] reservedSeats = {
                {4, 3},
                {1, 4},
                {4, 6},
                {1, 7}
        };
        assertThat(new CinemaSeatAllocation().maxNumberOfFamilies(4, reservedSeats)).isEqualTo(4);
    }


}