package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
@Slf4j
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        char[] charS = s.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char aChar : charS) {
            charCountMap.put(aChar, charCountMap.getOrDefault(aChar, 0) + 1);
        }

        char aChar;
        for (int i = 0; i < charS.length; i++) {
            aChar = charS[i];
            if (charCountMap.get(aChar) == 1) {
                return i;
            }
        }
        return -1;
    }
}
