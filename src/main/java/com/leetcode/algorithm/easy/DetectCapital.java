package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 520. Detect Capital
 * https://leetcode.com/problems/detect-capital/
 * https://www.youtube.com/watch?v=i8C2x_HvomM
 */
@Slf4j
public class DetectCapital {
    /**
     * Time Complexity : O(N)
     *
     * Algorithm :
     * - 대문자를 카운트한 값을 사용함
     */
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                count++;
            }
        }

        log.info("word : {} count : {}", word, count);

        return word.length() == count
                || count == 0
                || count == 1 && Character.isUpperCase(chars[0]);
    }
}
