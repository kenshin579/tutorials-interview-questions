package com.programmers.devmatching;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem1Test {

    @Test
    public void solution() {
        String[] customers = {
                "10/01 23:20:25 30",
                "10/01 23:25:50 26",
                "10/01 23:31:00 05",
                "10/01 23:33:17 24",
                "10/01 23:50:25 13",
                "10/01 23:55:45 20",
                "10/01 23:59:39 03",
                "10/02 00:10:00 10"
        };
        assertThat(new Problem1().solution(3, customers)).isEqualTo(4);
    }

    @Test
    public void solution2() {
        String[] customers = {
                "02/28 23:59:00 03",
                "03/01 00:00:00 02",
                "03/01 00:05:00 01"};
        assertThat(new Problem1().solution(2, customers)).isEqualTo(2);
    }
}