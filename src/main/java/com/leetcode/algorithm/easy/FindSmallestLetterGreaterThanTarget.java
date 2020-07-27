package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 744. Find Smallest Letter Greater Than Target
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
@Slf4j
public class FindSmallestLetterGreaterThanTarget {
    /**
     * Time Complexity : O(N)
     * Algorithm : 단순 loop 방식
     * - loop 돌면서 target보다 큰 값을 찾음
     */
    public char nextGreatestLetter(char[] letters, char target) {
        char letter;
        for (char c : letters) {
            letter = c;
            if (target < letter) {
                return c;
            }
        }
        return letters[0];
    }

    /**
     * Time complexity : O(log N)
     * Algorithm : Binary Search + Iterative
     * todo : 스터디 중
     */
    public char nextGreatestLetter2(char[] letters, char target) {
        int leftIndex = 0;
        int rightIndex = letters.length - 1;
        int midIndex;

        while (leftIndex <= rightIndex) {
            midIndex = (leftIndex + rightIndex) / 2;
            log.info("L: {} R: {} midIndex : {} letter : {}", leftIndex, rightIndex, midIndex, letters[midIndex]);

            if (letters[midIndex] == target) {
                return letters[midIndex + 1];
            } else if (letters[midIndex] < target) {
                //right
                leftIndex = midIndex + 1;
            } else {
                //left
                rightIndex = midIndex - 1;
            }
        }
        return letters[0];
    }
}
