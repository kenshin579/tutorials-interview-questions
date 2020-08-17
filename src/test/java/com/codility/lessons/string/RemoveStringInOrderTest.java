package com.codility.lessons.string;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveStringInOrderTest {

    @Test
    public void solution() {
        assertThat(new RemoveStringInOrder().solution("banana")).isEqualTo(3);
    }

    @Test
    public void solution2() {
        assertThat(new RemoveStringInOrder().solution("abcdefg")).isEqualTo(3);
    }

    @Test
    public void solution3() {
        assertThat(new RemoveStringInOrder().solution("banana")).isEqualTo(3);
    }

    @Test
    public void isStringAlphabaticOrder() {
        assertThat(new RemoveStringInOrder().isStringAlphabeticOrder("abcd")).isTrue();
        assertThat(new RemoveStringInOrder().isStringAlphabeticOrder("bcd")).isTrue();
        assertThat(new RemoveStringInOrder().isStringAlphabeticOrder("dbcd")).isFalse();
    }
}