package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class IsValidTest {

    @Test
    public void isValid() {
        assertThat(new IsValid().isValid("()")).isTrue();
    }

    @Test
    public void isValid2() {
        assertThat(new IsValid().isValid("()[]{}")).isTrue();
    }

    @Test
    public void isValid3() {
        assertThat(new IsValid().isValid("(]")).isFalse();
    }

    @Test
    public void isValid4() {
        assertThat(new IsValid().isValid("([)]")).isFalse();
    }

    @Test
    public void isValid5() {
        assertThat(new IsValid().isValid("{[]}")).isTrue();
    }

    @Test
    public void isValid6() {
        assertThat(new IsValid().isValid("")).isTrue();
    }

    @Test
    public void isValid7() {
        assertThat(new IsValid().isValid("[])")).isFalse();
    }
}