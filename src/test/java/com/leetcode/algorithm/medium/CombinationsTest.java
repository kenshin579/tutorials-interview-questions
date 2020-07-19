package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class CombinationsTest {

    /**
     * 반환값 : all possible combinations of k numbers out of 1 ... n
     */
    @Test
    public void combine() {
        List<List<Integer>> result = asList(
                asList(2, 4),
                asList(3, 4),
                asList(2, 3),
                asList(1, 2),
                asList(1, 3),
                asList(1, 4)
        );
        assertThat(new Combinations().combine(4, 2)).containsExactlyInAnyOrderElementsOf(result);
    }

    @Test
    public void combinationWithBits() {
        String arr[] = {"A", "B", "C", "D"};
        List<String> result = Arrays.asList("AB", "AC", "AD", "BC", "BD", "CD");

        assertThat(new Combinations().combinationWithBits(arr, 2)).containsExactlyInAnyOrderElementsOf(result);
    }

    @Test
    public void bitOperations() {
        int max = 4;
        int N = (int) Math.pow(2, max);
        String code, code2, code3;
        for (int i = 0; i < N; i++) {
            code = Integer.toBinaryString(i);
            code2 = Integer.toBinaryString(N| i);
            code3 = Integer.toBinaryString(N | i).substring(1);
            log.info("code: {} code2 : {} code3 : {}", code, code2, code3);
        }
    }
}