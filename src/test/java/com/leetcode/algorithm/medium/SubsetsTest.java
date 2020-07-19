package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SubsetsTest {

    /**
     * 입력 값 : set of distinct integers
     * 반환값 : all possible subsets
     * 조건 : set must not contain duplicate subsets.
     */
    @Test
    public void subsets() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = asList(
                asList(3),
                asList(1),
                asList(2),
                asList(1, 2, 3),
                asList(1, 3),
                asList(2, 3),
                asList(1, 2),
                asList()
        );

        assertThat(new Subsets().subsets(nums)).containsExactlyInAnyOrderElementsOf(result);
    }

    @Test
    public void convertBinaryStrToDecimal() {
        assertThat(new Subsets().convertBinaryStrToDecimal("111")).isEqualTo(7);
    }

}