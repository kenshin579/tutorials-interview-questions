package com.programmers.bruteforce;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarpetTest {

    /**
     * 입력값 : 카펫의 brown과 yellow 격자의 수를 알고 있음
     * 반환값 : 전체 카펫의 가로, 세로 크기를 알아내는 문제임
     *
     * 조건 : 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
     */
    @Test
    public void solution() {
        int[] result = {4, 3};
        assertThat(new Carpet().solution(10, 2)).isEqualTo(result);
    }

    @Test
    public void solution2() {
        int[] result = {3, 3};
        assertThat(new Carpet().solution(8, 1)).isEqualTo(result);
    }

    @Test
    public void solution3() {
        int[] result = {8, 6};
        assertThat(new Carpet().solution(24, 24)).isEqualTo(result);
    }
}