package com.codility.lessons.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SolutionTest {

    @Test
    public void solution() {
        assertThat(new Solution().solution("SMS messages are really short", 12)).isEqualTo(3);
    }

    @Test
    public void solution2() {
        assertThat(new Solution().solution("SMS messages are really short", 10)).isEqualTo(4);
    }

    @Test
    public void solution3() {
        assertThat(new Solution().solution("SMS messages are really short", 8)).isEqualTo(5);
    }

    @Test
    public void solution4() {
        assertThat(new Solution().solution("SMS messages", 5)).isEqualTo(-1);
    }

    @Test
    public void solution5() {
        assertThat(new Solution().solution("aksdjhfkajsdhfjashdfkjahsdjkfhasdfasd", 12)).isEqualTo(-1);
    }

    @Test
    public void solution6() {
        assertThat(new Solution().solution("Here you can find activities to practise your reading skills", 12)).isEqualTo(6);
    }

    @Test
    public void isAlphabetic() {
        assertThat(Character.isAlphabetic('s')).isTrue();
        assertThat(Character.isAlphabetic(' ')).isFalse();
    }
}