package com.leetcode.algorithm.medium;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class PermutationsTest {

    /**
     *
     * 반환값 : all possible permutations.
     */
    @Test
    public void permute() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = asList(
                asList(1, 2, 3),
                asList(1, 3, 2),
                asList(2, 1, 3),
                asList(2, 3, 1),
                asList(3, 1, 2),
                asList(3, 2, 1)
        );

        assertThat(new Permutations().permute(nums)).isEqualTo(result);
    }
}