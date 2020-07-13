package com.programmers.kakao;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

/**
 * 2019 카카오 개발자 겨울 인턴쉽
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 */
@Slf4j
public class CraneDoll {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> bucket = new Stack();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                log.info("[{}][{}] = {}", i, j, board[i][j]);
            }
        }
        return answer;
    }

    protected int popDollFromBoard(int[][] board, int pos) {
        return 0;
    }
}
