package com.leetcode.algorithm.medium;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class Subsets2Test {

    /**
     *
     * 반환 : return all possible subsets (the power set).
     * 조건 : The solution set must not contain duplicate subsets.
     */
    @Test
    public void subsetsWithDup1() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = asList(
                asList(2),
                asList(1),
                asList(1, 2, 2),
                asList(2, 2),
                asList(1, 2),
                asList()
        );

        assertThat(new Subsets2().subsetsWithDup(nums)).isEqualTo(result);
    }
}