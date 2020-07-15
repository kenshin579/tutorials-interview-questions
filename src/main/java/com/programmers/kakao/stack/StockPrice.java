package com.programmers.kakao.stack;

import lombok.extern.slf4j.Slf4j;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 * todo : 문제를 정확하게 이해하기가 좀 어려움
 */
@Slf4j
public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count;
        for (int i = 0; i < prices.length; i++) {
            count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) {
                    count++;
                }
            }
            answer[i] = count;
            log.info("i:{}.answer : {} count : {}", i + 1, answer, count);
        }
        return answer;
    }
}
