package com.leetcode.algorithm.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class FindDuplicateTest {

    /**
     * 반환값 : 중복된 데이터를 array로 반환하기
     */
    @Test
    public void findDuplicates() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        assertThat(new FindDuplicate().findDuplicates(nums)).isEqualTo(Arrays.asList(2, 3));
    }
}