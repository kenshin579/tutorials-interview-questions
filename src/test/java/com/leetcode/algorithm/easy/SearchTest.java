package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest {

    @Test
    public void search() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertThat(new Search().search(nums, 9)).isEqualTo(4);
    }

    @Test
    public void search2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertThat(new Search().search(nums, 2)).isEqualTo(-1);
    }

    @Test
    public void search3() {
        int[] nums = {-1, 0, 3, 5, 7, 9, 12};
        assertThat(new Search().search(nums, 9)).isEqualTo(5);
    }

    @Test
    public void search4() {
        int[] nums = {-1, 0, 3, 5, 7, 9, 12};
        assertThat(new Search().search(nums, 5)).isEqualTo(3);
    }
}