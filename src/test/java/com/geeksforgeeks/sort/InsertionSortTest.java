package com.geeksforgeeks.sort;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertionSortTest {

    @Test
    public void insertionSort() {
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
        new InsertionSort().insertionSort(arr);

        assertThat(arr).isSorted();

    }

    @Test
    public void insertionSort2() {
        int[] arr = {5, 3, 1, 7, 4, 5};

        new InsertionSort().insertionSort(arr);

        assertThat(arr).isSorted();
    }
}