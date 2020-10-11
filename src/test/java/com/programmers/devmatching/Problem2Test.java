package com.programmers.devmatching;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem2Test {

    @Test
    public void solution() {
        assertThat(new Problem2().solution("PM 01:00:00", 10)).isEqualTo("13:00:10");
    }

    @Test
    public void solution2() {
        assertThat(new Problem2().solution("PM 11:59:59", 1)).isEqualTo("00:00:00");
    }

    @Test
    public void solution3() {
        assertThat(new Problem2().solution("AM 11:59:59", 1)).isEqualTo("12:00:00");
    }

    @Test
    public void solution4() {
        assertThat(new Problem2().solution("PM 01:12:13", 24)).isEqualTo("13:12:37");
    }
}