package com.programmers.challenge.season1;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 월간 코드 챌린지 시즌1 > 삼각 달팽이
 * Difficulty : Easy
 * Tags : DataStructure
 * <p>
 * https://programmers.co.kr/learn/courses/30/lessons/68645
 * https://prgms.tistory.com/29
 */
@Slf4j
public class TriangleSnail {
    /**
     * Time Complexity : O(N)
     * <p>
     * Algorithm :
     */
    public int[] solution(int n) {
        int[][] arr = new int[n][n];

        //채우기
        fillDataInTriangleSnailOrder(arr, 0, 0, 0, n);

        //출력하기
        List<Integer> result = getResultInOrder(arr, n);
        return result.stream().mapToInt(Number::intValue).toArray();
    }

    private void fillDataInTriangleSnailOrder(int[][] arr, int rowIndex, int colIndex, int count, int size) {
        if (size == 0)
            return;

        //맨 왼쪽 채우기
        for (int i = rowIndex; i < rowIndex + size; i++) {
            arr[i][0] = ++count;
        }

        //만 아래 채우기
        count--;
        for (int i = colIndex; i < colIndex + size; i++) {
            arr[size - 1][i] = ++count;
        }

        //대각선 채우기
        count--;
        for (int i = size - 1; i >= 1; i--) { //todo : index 수정이 필요함
            arr[i][i] = ++count;
        }

        //반복
        int subSize = size < 4 ? 0 : size - 4 + 1;
        rowIndex = 0;
        colIndex = rowIndex - 1;

        log.info("rowIndex: {} colIndex:{} count:{} subSize: {}", rowIndex, colIndex, count, subSize);


//        fillDataInTriangleSnailOrder(arr, );

    }

    private List<Integer> getResultInOrder(int[][] arr, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
//                log.info("{}:{}", i, j);
                result.add(arr[i][j]);
            }
            System.out.println();
        }
        return result;
    }
}
