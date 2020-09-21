package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 125. Valid Palindrome
 * Difficulty : Easy
 * Tags : String
 *
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3411/
 * https://leetcode.com/problems/valid-palindrome/
 */
@Slf4j
public class ValidPalindrome {
    /**
     * Time Complexity : O(N)
     * Algorithm :
     * - start, end index를 두고
     * - char 값이 같은지 비교해 나가고 다른 경우에는 false를 반환함
     * - alpha 값이 아닌 경우에는 index 증가/감소시켜 skip 하도록 함
     */
    public boolean isPalindrome(String s) {
        char[] strChars = s.toCharArray();
        if (s.equals("")) return true;

        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            log.info("start:{} end:{}", start, end);
            if (Character.isLetterOrDigit(strChars[start])
                    && Character.isLetterOrDigit(strChars[end])) {
                if (Character.toLowerCase(strChars[start]) != Character.toLowerCase(strChars[end])) {
                    return false;
                }
                start++;
                end--;
            } else {
                if (!Character.isLetterOrDigit(strChars[start])) {
                    start++;
                }
                if (!Character.isLetterOrDigit(strChars[end])) {
                    end--;
                }
            }
        }
        return true;
    }
}
