package com.programmers.dp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NRepresentationTest {

    @Test
    public void solution() {
        assertThat(new NRepresentation().solution(5, 12)).isEqualTo(12);
    }

    @Test
    public void solution2() {
        assertThat(new NRepresentation().solution(2, 11)).isEqualTo(3);
    }
}