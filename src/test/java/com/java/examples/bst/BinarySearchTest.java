package com.java.examples.bst;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class BinarySearchTest {
    private final int MAX_ARRAY = 10;

    int[] numArr;
    int searchNum;

    @Before
    public void setUp() throws Exception {
        //고정 값
        numArr = getFixedArray();
        searchNum = 3;

        //random 값
//        numArr = getRandomArray();
//        searchNum = numArr[this.getRandomNumber(MAX_ARRAY)];
        log.info("searchNum : {} numArr : {}", searchNum, numArr);

    }

    @Test
    public void test_recursive() {
        int searchIndex = BinarySearch.RecursiveBinarySeach(numArr, 0, numArr.length, searchNum);
        log.info("searchIndex :{}", searchIndex);
        assertThat(searchIndex).isNotNegative();
    }

    @Test
    public void test_non_recursive() {
        int searchIndex = BinarySearch.nonrecursiveBinarySearch(numArr, searchNum);
        log.info("searchIndex :{}", searchIndex);
        assertThat(searchIndex).isNotNegative();
    }

    private int getRandomNumber(int max) {
        return new Random().nextInt(max);
    }

    private int[] getFixedArray() {
        List<Integer> temp = Arrays.asList(2, 3, 5, 8, 12, 15);
        searchNum = 3;
        Collections.sort(temp);
        //https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
        return temp.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[] getRandomArray() {
        List<Integer> temp = new ArrayList();

        for (int i = 1; i < MAX_ARRAY; i++) {
            temp.add(getRandomNumber(50));
        }
        Collections.sort(temp);
        //https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
        return temp.stream().mapToInt(Integer::intValue).toArray();

    }
}