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
        assertThat(new PowerOfFour().isPowerOfFour2(16)).isTrue();
        assertThat(new PowerOfFour().isPowerOfFour3(16)).isTrue();
    }

    @Test
    public void isPowerOfFour2() {
        assertThat(new PowerOfFour().isPowerOfFour(5)).isFalse();
        assertThat(new PowerOfFour().isPowerOfFour2(5)).isFalse();
        assertThat(new PowerOfFour().isPowerOfFour3(5)).isFalse();
    }

    @Test
    public void isPowerOfFour3() {
        assertThat(new PowerOfFour().isPowerOfFour(4)).isTrue();
        assertThat(new PowerOfFour().isPowerOfFour2(4)).isTrue();
        assertThat(new PowerOfFour().isPowerOfFour3(4)).isTrue();
    }

    @Test
    public void isPowerOfFour4() {
        assertThat(new PowerOfFour().isPowerOfFour(256)).isTrue();
        assertThat(new PowerOfFour().isPowerOfFour2(256)).isTrue();
        assertThat(new PowerOfFour().isPowerOfFour3(256)).isTrue();
    }

    @Test
    public void isPowerOfFour5() {
        assertThat(new PowerOfFour().isPowerOfFour(1024)).isTrue();
        assertThat(new PowerOfFour().isPowerOfFour2(1024)).isTrue();
        assertThat(new PowerOfFour().isPowerOfFour3(1024)).isTrue();
    }

    @Test
    public void isPowerOfFour6() {
        assertThat(new PowerOfFour().isPowerOfFour(81)).isFalse();
        assertThat(new PowerOfFour().isPowerOfFour2(81)).isFalse();
        assertThat(new PowerOfFour().isPowerOfFour3(81)).isFalse();
    }

    @Test
    public void isPowerOfFour7() {
        assertThat(new PowerOfFour().isPowerOfFour(1)).isTrue();
        assertThat(new PowerOfFour().isPowerOfFour2(1)).isTrue();
        assertThat(new PowerOfFour().isPowerOfFour3(1)).isTrue();
    }

    @Test
    public void isPowerOfFour8() {
        assertThat(new PowerOfFour().isPowerOfFour(-2147483648)).isFalse();
        assertThat(new PowerOfFour().isPowerOfFour2(-2147483648)).isFalse();
        assertThat(new PowerOfFour().isPowerOfFour3(-2147483648)).isFalse();
    }

    @Test
    public void isPowerOfFour9() {
        assertThat(new PowerOfFour().isPowerOfFour(2)).isFalse();
        assertThat(new PowerOfFour().isPowerOfFour2(2)).isFalse();
        assertThat(new PowerOfFour().isPowerOfFour3(2)).isFalse();
    }
}