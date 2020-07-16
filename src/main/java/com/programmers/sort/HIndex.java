package com.programmers.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42747
 */
@Slf4j
public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        log.info("citations : {}", citations);
        int numOfCitation;
        int high;
        int low;

        for (int i = 0; i < citations.length; i++) {
            numOfCitation = citations[i];

            if (numOfCitation != 0) {
                high = citations.length - i;
                low = citations.length - high;
                log.info("high : {} low : {}", high, low);
                if (numOfCitation == high && numOfCitation > low) {
                    answer = numOfCitation;
                    break;
                }
            }
        }
        return answer;
    }
}
