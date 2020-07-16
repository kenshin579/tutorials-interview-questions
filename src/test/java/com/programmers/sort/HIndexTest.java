package com.programmers.sort;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HIndexTest {

    /**
     * 반환 값 : HIndex =
     */
    @Test
    public void solution() {
        //논문의 수 : 5
        //논문의 인용 횟수
        int[] citations = {3, 0, 6, 1, 5};
        //0, 1, 3, 5, 6

        //1 h:(4, 1) : 4편의 논문 1회 이상 인용, 1편의 논문: 1회 이하 인용
        //3 h:(3, 2) : 3편의 논문 h:3회 이상 인용, 2편의 논문: 3회 이하 인용
        //5 h:(2, 3) : 2편의 논문 5회 이상 인용, 3편의 눈몬: 5회 이하 인용함
        //6 h:(1, 5) : 1편의 논문 6회 이상 인용, 4편의 논문: 6회 이사 인용함

        assertThat(new HIndex().solution(citations)).isEqualTo(3);
    }

    @Test
    public void solution2() {
        int[] citations = {0, 15, 4, 0, 7, 10, 0};
        //0, 0, 0, 4, 7, 10, 15

        //4 (4, 3)
        //7 (3, 4)
        //10 (2, 5)
        //15 (1, 6)

        assertThat(new HIndex().solution(citations)).isEqualTo(4);
    }
}