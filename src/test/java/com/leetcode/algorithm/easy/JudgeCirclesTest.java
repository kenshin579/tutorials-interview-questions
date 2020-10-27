package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeCirclesTest {

    @Test
    public void judgeCircle() {
        assertThat(new JudgeCircles().judgeCircle("UD")).isTrue();
    }

    @Test
    public void judgeCircle2() {
        assertThat(new JudgeCircles().judgeCircle("RRDD")).isFalse();
    }

    @Test
    public void judgeCircle1() {
        assertThat(new JudgeCircles().judgeCircle("LL")).isFalse();
    }

    @Test
    public void judgeCircle3() {
        assertThat(new JudgeCircles().judgeCircle("LDRRLRUULR")).isFalse();
    }
}