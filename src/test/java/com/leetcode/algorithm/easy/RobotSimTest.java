package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RobotSimTest {

    @Test
    public void robotSim() {
        int[] commands = {4, -1, 3};
        int[][] obstacles = {{}};

        assertThat(new RobotSim().robotSim(commands, obstacles)).isEqualTo(25);

    }

    @Test
    public void robotSim2() {
        int[] commands = {4, -1, 4, -2, 4};
        int[][] obstacles = {
                {2, 4}
        };

        assertThat(new RobotSim().robotSim(commands, obstacles)).isEqualTo(65);

    }
}