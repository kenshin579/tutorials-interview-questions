package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * https://leetcode.com/problems/reverse-string/
 */
@Slf4j
public class ReverseString {
    public void reverseString(char[] s) {
        int endIndex = s.length - 1;
        int startIndex = 0;
        char temp;
        while (startIndex < endIndex) {
            temp = s[endIndex];
            s[endIndex] = s[startIndex];
            s[startIndex] = temp;

            startIndex++;
            endIndex--;
        }
    }
}
