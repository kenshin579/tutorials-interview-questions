package com.programmers.challenge.season1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PopBallonTest {

    @Test
    public void solution() {
        int[] input = {9, -1, -5};
        assertThat(new PopBallon().solution(input)).isEqualTo(3);
    }

    @Test
    public void solution2() {
        int[] input = {-16, 27, 65, -2, 58, -92, -71, -68, -61, -33};
        assertThat(new PopBallon().solution(input)).isEqualTo(6);

    }
}