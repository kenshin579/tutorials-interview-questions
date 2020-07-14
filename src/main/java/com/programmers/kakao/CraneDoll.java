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
        Stack<Integer> bucket = new Stack();
        int value;
        int answer = 0;

        for (int pos = 0; pos < moves.length; pos++) {
            value = popDollFromBoard(board, moves[pos]);
            if (value != 0) {
                if (putIntoBucket(bucket, value))
                    answer++;
            }

            log.info("pos : {} bucket : {} value : {} answer : {}", pos, bucket, value, answer);
        }
        return answer;
    }

    protected int popDollFromBoard(int[][] board, int pos) {
        int value = 0;
        for (int rowIndex = 0; rowIndex < board.length; rowIndex++) {
            value = board[rowIndex][pos - 1];
            if (value != 0) {
                board[rowIndex][pos - 1] = 0;
                break;
            }
        }
        return value;
    }

    protected boolean putIntoBucket(Stack<Integer> bucket, Integer number) {
        boolean disappear = false;
        if (bucket.size() == 0) {
            bucket.add(number);
        } else if (bucket.peek().equals(number)) {
            bucket.pop();
            disappear = true;
        } else {
            bucket.add(number);
        }

        return disappear;
    }
}
