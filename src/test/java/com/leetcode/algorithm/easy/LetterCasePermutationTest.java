package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class LetterCasePermutationTest {

    @Test
    public void letterCasePermutation() {
        List<String> result = Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2");
        assertThat(new LetterCasePermutation().letterCasePermutation("a1b2")).isEqualTo(result);
    }

    @Test
    public void letterCasePermutation2() {
        List<String> result = Arrays.asList("3z4", "3Z4");
        assertThat(new LetterCasePermutation().letterCasePermutation("3z4")).isEqualTo(result);
    }

    @Test
    public void letterCasePermutation3() {
        List<String> result = Arrays.asList("12345");
        assertThat(new LetterCasePermutation().letterCasePermutation("12345")).isEqualTo(result);
    }
}