package com.java.examples.bst;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class BinarySearchTest {
    int priceCount = 4000;

    // 가격정보 배열
    int[] priceArray = new int[priceCount];

    @Before
    public void setUp() throws Exception {
        for (int priceArrayIdx = 1; priceArrayIdx < priceCount; priceArrayIdx++) {
            priceArray[priceArrayIdx - 1] = priceArrayIdx * 1000;
        }
    }

    @Test
    public void recurisve_test() {
        assertThat(BinarySearch.RecursiveBinarySeach(priceArray, 0, priceArray.length, 690000)).isEqualTo(689);
    }

    @Test
    public void non_recurisve_test() {
        assertThat(BinarySearch.nonrecursiveBinarySearch(priceArray, 690000)).isEqualTo(689);
    }
}