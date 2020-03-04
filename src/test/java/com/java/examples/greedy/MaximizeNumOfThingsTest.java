package com.java.examples.greedy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class MaximizeNumOfThingsTest {

    @Test
    public void maximizeNumOfThings() {
        int[] taskTimes = {5, 3, 4, 2, 1};
        assertThat(new MaximizeNumOfThings().maximizeNumOfThings(taskTimes, 6)).isEqualTo(3);
    }

    @Test
    public void maximizeNumOfThings2() {
        int[] taskTimes = {10, 4, 2, 8, 5, 9};
        assertThat(new MaximizeNumOfThings().maximizeNumOfThings(taskTimes, 23)).isEqualTo(0);
    }

    @Test
    public void maximizeNumOfThings3() {
        int[] taskTimes = {10, 4, 2, 8, 5, 9};
        assertThat(new MaximizeNumOfThings().maximizeNumOfThings(taskTimes, 19)).isEqualTo(4);
    }


}