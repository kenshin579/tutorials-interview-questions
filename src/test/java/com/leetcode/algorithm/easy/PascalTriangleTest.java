package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class PascalTriangleTest {

    @Test
    public void generate() {
        List<List<Integer>> expected = Arrays.asList(
                asList(1),
                asList(1, 1),
                asList(1, 2, 1),
                asList(1, 3, 3, 1),
                asList(1, 4, 6, 4, 1)
        );

        List<List<Integer>> generate = new PascalTriangle().generate(5);
        assertThat(generate).isEqualTo(expected);

    }

    @Test
    public void generate2() {
        List<List<Integer>> expected = Arrays.asList(
                asList(1)
        );

        List<List<Integer>> generate = new PascalTriangle().generate(1);
        assertThat(generate).isEqualTo(expected);
    }

    @Test
    public void generate3() {
        List<List<Integer>> expected = Arrays.asList(
                asList(1),
                asList(1, 1)
        );

        List<List<Integer>> generate = new PascalTriangle().generate(2);
        assertThat(generate).isEqualTo(expected);
    }

    @Test
    public void generate4() {
        List<List<Integer>> expected = Arrays.asList(
                asList(1),
                asList(1, 1),
                asList(1, 2, 1)
        );

        List<List<Integer>> generate = new PascalTriangle().generate(3);
        assertThat(generate).isEqualTo(expected);
    }
}