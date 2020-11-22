package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchRotatedSortedArrayTest {

    /**
     * 반환값 :
     */
    @Test
    public void search() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertThat(new SearchRotatedSortedArray().search(nums, 0)).isEqualTo(4);
    }

    @Test
    public void search2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertThat(new SearchRotatedSortedArray().search(nums, 3)).isEqualTo(-1);
    }

    @Test
    public void search3() {
        int[] nums = {1};
        assertThat(new SearchRotatedSortedArray().search(nums, 0)).isEqualTo(-1);
    }
}