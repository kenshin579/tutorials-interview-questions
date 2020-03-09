package com.codility.lessons.matrix;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {
    public int solution(int[][] A) {
        int currentValue;
        int count = 0;
        for (int i = 1; i < A.length - 1; i++) {
            for (int j = 1; j < A[0].length - 1; j++) {
                currentValue = A[i][j];
                if (A[i][j - 1] > currentValue && currentValue < A[i][j + 1]
                        && A[i - 1][j] < currentValue && currentValue > A[i + 1][j]) {
                    count++;
                }

                if (A[i][j - 1] < currentValue && currentValue > A[i][j + 1]
                        && A[i - 1][j] > currentValue && currentValue < A[i + 1][j]) {
                    count++;
                }
            }
        }
        return count++;
    }
}
