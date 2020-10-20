package com.programmers.challenge.season1;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * 월간 코드 챌린지 시즌1 > 두 개 뽑아서 더하기
 * Difficulty : Easy
 * Tags :
 * <p>
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 */
@Slf4j
public class AddTwoIntegers {
    /**
     * Time Complexity :
     * <p>
     * Algorithm :
     */
    public int[] solution(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
//                log.info("{}.{}", i, j);
                result.add(numbers[i] + numbers[j]);
            }
        }

        return result.stream().mapToInt(Number::intValue).toArray();
    }
}
