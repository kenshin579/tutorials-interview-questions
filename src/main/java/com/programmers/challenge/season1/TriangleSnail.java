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
 * https://velog.io/@delay/programmers68645
 * https://hongjuzzang.github.io/solution/code_p68645/
 * https://minhamina.tistory.com/58
 */
@Slf4j
@Deprecated
public class TriangleSnail {
    /**
     * Time Complexity : O(N)
     * <p>
     * Algorithm :
     */
    public int[] solution(int n) {
        int[][] arr = new int[n][n];

        //채우기
        //N = 6
        int count = fillDataInTriangleSnailOrder(arr, 0, 0, 0, n);
        log.info("1.count: {}", count);

        count = fillDataInTriangleSnailOrder(arr, 2, 1, count, 3);
        log.info("2.count: {}", count);
        //출력하기
        List<Integer> result = getResultInOrder(arr, n);
        return result.stream().mapToInt(Number::intValue).toArray();
    }

    private int fillDataInTriangleSnailOrder(int[][] arr, int rowIndex, int colIndex, int count, int size) {
        log.info("r:{} c:{} count:{} size:{}", rowIndex, colIndex, count, size);
//        if (size == 0)
//            return;

        //맨 왼쪽 채우기
        for (int i = rowIndex; i < rowIndex + size - 1; i++) {
            arr[i][colIndex] = ++count;
        }

        //만 아래 채우기
        for (int i = colIndex; i < colIndex + size - 1; i++) {
            arr[rowIndex + size - 1][i] = ++count;
        }

        //대각선 채우기
        for (int i = colIndex + size - 1; i >= colIndex; i--) {
//            arr[][i] = ++count;
        }
        return count;

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
