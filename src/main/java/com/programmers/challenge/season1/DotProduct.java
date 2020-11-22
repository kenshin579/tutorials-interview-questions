package com.programmers.challenge.season1;

import lombok.extern.slf4j.Slf4j;

/**
 * 월간 코드 챌린지 시즌1 > 3진법 뒤집기
 * Difficulty : Easy
 * Tags : Basic
 *
 * https://programmers.co.kr/learn/courses/30/lessons/70128
 */
@Slf4j
public class DotProduct {
    /**
     * Time Complexity: O(N)
     *
     * Algorithm :
     * 1. loop돌면서 dot product을 계산하면 됨
     */
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
            log.info("answer : {}", answer);
        }
        return answer;
    }
}
