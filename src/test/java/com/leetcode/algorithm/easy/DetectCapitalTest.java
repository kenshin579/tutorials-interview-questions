package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DetectCapitalTest {

    /**
     * 조건
     * - non-empty str값
     */
    @Test
    public void detectCapitalUse() {
        assertThat(new DetectCapital().detectCapitalUse("USA")).isTrue();
        assertThat(new DetectCapital().detectCapitalUse("leetcode")).isTrue();
        assertThat(new DetectCapital().detectCapitalUse("Google")).isTrue();
    }

    @Test
    public void detectCapitalUse2() {
        assertThat(new DetectCapital().detectCapitalUse("FlagG")).isFalse();
        assertThat(new DetectCapital().detectCapitalUse("USa")).isFalse();
        assertThat(new DetectCapital().detectCapitalUse("usA")).isFalse();
        assertThat(new DetectCapital().detectCapitalUse("uSa")).isFalse();
    }
}