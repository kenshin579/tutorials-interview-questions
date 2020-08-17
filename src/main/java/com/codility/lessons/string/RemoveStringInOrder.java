package com.codility.lessons.string;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * count how many
 * 효휼적인 방법은?
 * https://stackoverflow.com/questions/52020057/form-lexicographically-small-string-among-others-by-removing-exactly-one-charact
 * https://stackoverflow.com/questions/39807066/how-many-minimum-numbers-of-characters-from-a-given-string-s-should-delete-to-m
 * https://www.geeksforgeeks.org/minimum-number-deletions-make-sorted-sequence/
 * https://www.geeksforgeeks.org/lexicographically-smallest-string-formed-by-removing-at-most-one-character/
 */
@Slf4j
public class RemoveStringInOrder {
    public int solution(String S) {
        int count = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) > S.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    protected boolean isStringAlphabeticOrder(String s) {
        char sortedChars[] = s.toCharArray();
        Arrays.sort(sortedChars);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (sortedChars[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
