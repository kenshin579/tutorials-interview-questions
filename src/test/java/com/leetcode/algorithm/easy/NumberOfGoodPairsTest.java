package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfGoodPairsTest {

    /**
     * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
     * 반환값 : good pair가 되는 수를 반환함
     */
    @Test
    public void numIdenticalPairs() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        //1: (0, 3), (0, 4), (3, 4)
        //3: (2, 5)
        assertThat(new NumberOfGoodPairs().numIdenticalPairs(nums)).isEqualTo(4);
    }

    @Test
    public void numIdenticalPairs2() {
        int[] nums = {1, 1, 1, 1};
        assertThat(new NumberOfGoodPairs().numIdenticalPairs(nums)).isEqualTo(6);
    }

    @Test
    public void numIdenticalPairs3() {
        int[] nums = {1, 2, 3};
        assertThat(new NumberOfGoodPairs().numIdenticalPairs(nums)).isEqualTo(0);
    }

    @Test
    public void getSummationValue() {
        assertThat(new NumberOfGoodPairs().getSummationValue(3)).isEqualTo(6);
        assertThat(new NumberOfGoodPairs().getSummationValue(4)).isEqualTo(10);
    }
}