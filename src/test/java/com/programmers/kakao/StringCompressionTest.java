package com.programmers.kakao;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCompressionTest {

    @Test
    public void solution() {
        assertThat(new StringCompression().solution("aabbaccc")).isEqualTo(7);
    }

    @Test
    public void solution1() {
        assertThat(new StringCompression().solution("ababcdcdababcdcd")).isEqualTo(9);
    }

    @Test
    public void solution2() {
        assertThat(new StringCompression().solution("abcabcdede")).isEqualTo(8);
    }

    @Test
    public void solution3() {
        assertThat(new StringCompression().solution("abcabcabcabcdededededede")).isEqualTo(14);
    }

    @Test
    public void solution4() {
        assertThat(new StringCompression().solution("xababcdcdababcdcd")).isEqualTo(17);
    }
}