package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 392. Is Subsequence
 * https://leetcode.com/problems/is-subsequence/
 */
@Slf4j
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] charS = s.toCharArray();
        int indexS = 0;
        int foundIndex;
        char aChar;
        int prevIndex = -1;
        int queryIndex;

        while (indexS < charS.length) {
            aChar = charS[indexS];
            queryIndex = prevIndex == -1 ? 0 : prevIndex + 1;
            foundIndex = t.indexOf(aChar, queryIndex);

            if (prevIndex > foundIndex) {
                return false;
            }
            log.info("aChar[{}]:{} foundIndex:{} queryIndex : {}", indexS, aChar, foundIndex, queryIndex);
            prevIndex = foundIndex;
            log.info("aChar[{}]:{} prevIndex : {}", indexS, aChar, prevIndex);

            indexS++;
        }
        return true;
    }
}
