package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PowerOfFourTest {

    /**
     *
     */
    @Test
    public void isPowerOfFour() {
        assertThat(new PowerOfFour().isPowerOfFour(16)).isTrue();
    }

    @Test
    public void isPowerOfFour2() {
        assertThat(new PowerOfFour().isPowerOfFour(5)).isFalse();
    }

    @Test
    public void isPowerOfFour3() {
        assertThat(new PowerOfFour().isPowerOfFour(4)).isTrue();
    }

    @Test
    public void isPowerOfFour4() {
        assertThat(new PowerOfFour().isPowerOfFour(256)).isTrue();
//        assertThat(new PowerOfFour().isPowerOfFour2(256)).isTrue();
    }

    @Test
    public void isPowerOfFour5() {
        assertThat(new PowerOfFour().isPowerOfFour(1024)).isTrue();
    }

    @Test
    public void isPowerOfFour6() {
        assertThat(new PowerOfFour().isPowerOfFour(81)).isFalse();
    }

    @Test
    public void isPowerOfFour7() {
        assertThat(new PowerOfFour().isPowerOfFour(1)).isTrue();
    }
}