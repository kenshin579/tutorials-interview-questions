package com.programmers.challenges;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class Algorithm1Test {

    @Test
    public void getSticks() {
        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> result = Arrays.asList(1, 5);
        assertThat(new Algorithm1().getSticks(nums, 6)).isEqualTo(result);
    }
}