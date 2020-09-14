package com.geeksforgeeks.sort;

import lombok.extern.slf4j.Slf4j;

/**
 * Insertion Sort
 * https://www.geeksforgeeks.org/insertion-sort/
 */
@Slf4j
public class InsertionSort {
    /**
     * Time Complexity : O(N^2)
     * <p>
     * Algorithm :
     * 1. arr를 1 ~ n까지 iterate해가면서
     * 2. arr[i]와 i보다 앞에 있는 값과 차래로 비교하면서 작은 값이 있으면 swap함
     */
    public void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                log.info("[{}]={} [{}]={}", i, j, arr[i], arr[j]);
                if (arr[i] < arr[j]) { //move
                    swap(arr, i, j);
                }
            }
            System.out.println();
        }
    }

    private void swap(int arr[], int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
