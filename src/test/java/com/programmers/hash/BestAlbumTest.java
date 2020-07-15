package com.programmers.hash;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BestAlbumTest {

    /**
     * 기준 :
     * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
     * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
     * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
     *
     */
    @Test
    public void solution() {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] answers = {4, 1, 3, 0};

        assertThat(new BestAlbum().solution(genres, plays)).isEqualTo(answers);
    }
}