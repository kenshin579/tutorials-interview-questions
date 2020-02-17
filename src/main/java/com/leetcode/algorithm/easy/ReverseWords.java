package com.leetcode.algorithm.easy;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            sb.append(reverse(s1[i]));
            if (i < s1.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    protected String reverse(String s) {
        char[] chars = s.toCharArray();
        char[] reverseChars = new char[chars.length];
        int index;
        for (int i = 0; i < chars.length; i++) {
            index = chars.length - i - 1;
            reverseChars[index] = chars[i];
        }
        return new String(reverseChars);
    }
}
