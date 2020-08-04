package com.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {
    @Test
    public void isAlpha() {
        assertThat(StringUtils.isAlpha("abc")).isTrue();
        assertThat(StringUtils.isAlpha("abc!")).isFalse();
        assertThat(StringUtils.isAlpha("1234")).isFalse();
    }
}