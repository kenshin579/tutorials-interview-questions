package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 392. Is Subsequence
 * Difficulty : Easy
 * Tags : String
 *
 * https://leetcode.com/problems/is-subsequence/
 */
@Slf4j
public class IsSubsequence {
    /**
     * Time Complexity : O(S+T) ?
     *
     * Algorithm :
     * 1. S의 char가 T 스트링에 있는 확인
     * 1.1 그전에 찾은 index보다는 큰 값이어야 함
     */
    public boolean isSubsequence(String s, String t) {
        char[] charS = s.toCharArray();
        char aChar;
        int indexS = 0;
        int foundIndex;
        int prevIndex = -1;
        int indexT;

        while (indexS < charS.length) {
            aChar = charS[indexS];
            indexT = prevIndex == -1 ? 0 : prevIndex + 1;
            foundIndex = t.indexOf(aChar, indexT);

            if (prevIndex > foundIndex) {
                return false;
            }
            log.info("aChar[{}]:{} foundIndex:{} indexT : {}", indexS, aChar, foundIndex, indexT);
            prevIndex = foundIndex;
            log.info("aChar[{}]:{} prevIndex : {}", indexS, aChar, prevIndex);

            indexS++;
        }
        return true;
    }
}
