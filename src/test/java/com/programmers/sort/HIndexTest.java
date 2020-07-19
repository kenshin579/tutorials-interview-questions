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

        //H:1 4편
        //H:2 3편
        //H:3 3편 <-- 이게 정답
        //H:4 2편
        assertThat(new HIndex().solution(citations)).isEqualTo(3);
    }

    @Test
    public void solution2() {
        int[] citations = {0, 15, 4, 0, 7, 10, 0};
        //0, 0, 0, 4, 7, 10, 15

        //H:1 4편
        //H:2 4편
        //H:3 4편
        //H:4 4편 <-- 이게 정답
        //H:5 3편
        assertThat(new HIndex().countCitations(citations, 5)).isEqualTo(3);
        assertThat(new HIndex().solution(citations)).isEqualTo(4);
    }

    @Test
    public void solution3() {
        int[] citations = {20, 19, 18, 1};
        //1, 18, 19, 20

        //h:1, 4편
        //h:2, 3편
        //H:3, 3편 <-- 이게 답임
        //h:4, 3편

        assertThat(new HIndex().countCitations(citations, 1)).isEqualTo(4);
        assertThat(new HIndex().solution(citations)).isEqualTo(3);
    }

    @Test
    public void solution4() {
        int[] citations = {20, 19, 18, 17};
        //17, 18, 19, 20

        //h:1, 4편
        //h:2, 4편
        //H:3, 4편
        //h:4, 4편 <- 이게 답임
        //h:5, 4편

        assertThat(new HIndex().countCitations(citations, 4)).isEqualTo(4);
        assertThat(new HIndex().solution(citations)).isEqualTo(4);

    }

    @Test
    public void solution5() {
        int[] citations = {0, 0, 0, 0, 0};

        assertThat(new HIndex().solution(citations)).isEqualTo(0);

    }

    @Test
    public void solution6() {
        int[] citations = {};

        assertThat(new HIndex().solution(citations)).isEqualTo(0);

    }

    @Test
    public void solution7() {
        int[] citations = {0, 67, 2, 3, 15, 9, 0, 2};
        //0, 0, 2, 2, 3, 9, 15, 67

        //h:1, 6편
        //h:2, 6편
        //H:3, 4편 <-- ??
        //h:4, 3편
        //h:5, 3편
        //h:6, 3편
        //h:9, 3편

        assertThat(new HIndex().solution(citations)).isEqualTo(3);

    }
}