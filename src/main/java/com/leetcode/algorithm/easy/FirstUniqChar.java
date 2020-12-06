package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 387. First Unique Character in a String
 * Difficulty : Easy
 * Tags : String
 *
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
@Slf4j
public class FirstUniqChar {
    /**
     * Time Complexity : O(N)
     *
     * Algorithm :
     * 1.String의 각 char를 loop으로 돌면서 각 char의 count를 map으로 담기
     * 2.다시 string의 각 char를 돌면서 count가 1인 char의 index를 반환한다
     */
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
