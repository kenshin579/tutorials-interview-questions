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

        int countOccurrence;
        for (int hIndex = 1; hIndex <= citations.length; hIndex++) {
            countOccurrence = countCitations(citations, hIndex);

            log.info("hIndex : {} countOccurrence : {}", hIndex, countOccurrence);
            if (hIndex == countOccurrence) {
                answer = hIndex;
                break;
            }

        }
        return answer;
    }

    protected int countCitations(int[] citations, int countOccurrence) {
        int count = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] != 0 && citations[i] >= countOccurrence) {
                count++;
            }
        }

        return count;
    }
}
