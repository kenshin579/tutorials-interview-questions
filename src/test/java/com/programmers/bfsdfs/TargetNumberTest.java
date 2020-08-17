package com.programmers.bfsdfs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TargetNumberTest {

    /**
     *
     * 반환값 :
     */
    @Test
    public void solution() {
        int[] nums = {1, 1, 1, 1, 1};

        assertThat(new TargetNumber().solution(nums, 3)).isEqualTo(5);

    }
}