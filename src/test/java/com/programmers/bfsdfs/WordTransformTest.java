package com.programmers.bfsdfs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordTransformTest {

    /**
     * 조건 :
     * 1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
     * 2. words에 있는 단어로만 변환할 수 있습니다.
     *
     * 반환값 : 가장 짧은 변환 수
     */
    @Test
    public void solution() {
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        assertThat(new WordTransform().solution("hit", "cog", words)).isEqualTo(4);
    }

    @Test
    public void solution2() {
        String[] words = {"hot", "dot", "dog", "lot", "log"};
        assertThat(new WordTransform().solution("hit", "cog", words)).isEqualTo(0);
    }
}