package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

@Slf4j
public class PascalTriangleTest {

    @Test
    public void generate() {
        List<List<Integer>> result = Arrays.asList(
                asList(1),
                asList(1,1),
                asList(1,2,1),
                asList(1,3,1,1),
                asList(1,4,6,4,1)
        );

        List<List<Integer>> generate = new PascalTriangle().generate(5);
        log.info("generate : {}", generate);

    }
}