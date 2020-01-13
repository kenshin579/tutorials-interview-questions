package com.java.examples.bst;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class BinarySearchTest {
    private final int MAX_ARRAY = 10;

    int[] numArr = new int[MAX_ARRAY];
    int searchNum;

    @Before
    public void setUp() throws Exception {
        List<Integer> temp = new ArrayList();

        for (int i = 1; i < MAX_ARRAY; i++) {
            temp.add(getRandomNumber(50));
        }
        searchNum = temp.get(this.getRandomNumber(numArr.length));
        Collections.sort(temp);
        //https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
        numArr = temp.stream().mapToInt(Integer::intValue).toArray();
        log.info("searchNum : {} numArr : {}", searchNum, numArr);

    }

    @Test
    public void test_recursive() {
        assertThat(BinarySearch.RecursiveBinarySeach(numArr, 0, numArr.length, searchNum)).isNotNegative();
    }

    @Test
    public void test_non_recursive() {
        int index = BinarySearch.nonrecursiveBinarySearch(numArr, searchNum);
        log.info("index :{}", index);
        assertThat(index).isNotNegative();
    }

    private int getRandomNumber(int max) {
        return new Random().nextInt(max);
    }
}