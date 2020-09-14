package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 541. Reverse String II
 * https://leetcode.com/problems/reverse-string-ii/
 * 2k 블록마다 reverse 하는 예제임
 * ex.
 * 12345678901234567890
 * ___456___012___679__
 * 32145698701254367809
 * <p>
 *
 */
@Slf4j
public class ReverseStr {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int length = s.length();
        char temp;
        int startIndex, endIndex;
        for (int start = 0; start < length; start += 2 * k) {
            startIndex = start;
            endIndex = Math.min(start + k - 1, length - 1);
            while (startIndex < endIndex) {
                temp = chars[startIndex];
                chars[startIndex] = chars[endIndex];
                chars[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
        }
        return new String(chars);
    }
}
