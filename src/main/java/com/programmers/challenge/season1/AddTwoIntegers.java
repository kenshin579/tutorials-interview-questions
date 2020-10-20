package com.programmers.challenge.season1;

import lombok.extern.slf4j.Slf4j;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 월간 코드 챌린지 시즌1 > 두 개 뽑아서 더하기
 * Difficulty : Easy
 * Tags : DataStructure
 * <p>
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 */
@Slf4j
public class AddTwoIntegers {
    /**
     * Time Complexity : O(N^2)
     * <p>
     * Algorithm :
     * - loop을 돌때 항시 다른 인덱스를 더하도록 해야함
     * - 중복과 정렬을 동시에 하기 위해 SortedSet을 사용함
     */
    public int[] solution(int[] numbers) {
        SortedSet<Integer> result = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
//                log.info("{}.{}", i, j);
                result.add(numbers[i] + numbers[j]);
            }
        }

        return result.stream().mapToInt(Number::intValue).toArray();
    }
}
