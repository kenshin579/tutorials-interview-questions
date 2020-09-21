package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 14. Longest Common Prefix
 * Difficulty : Easy
 * Tags : String
 *
 * https://leetcode.com/problems/longest-common-prefix/
 * 가정 : 공통 str을 찾을 때 첫 index부터 같아야 함
 * <p>
 * todo : 다양한 다른 방법도 알아보기
 * https://www.geeksforgeeks.org/longest-common-prefix-using-word-by-word-matching/
 */
@Slf4j
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        return wordByWordMatchingSolution(strs);
    }

    private String wordByWordMatchingSolution(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String currentLCPStr = "";

        currentLCPStr = getCommonPrefix(strs[0], strs[1]);
        log.info("currentLCPStr : {}", currentLCPStr);
        for (int i = 1; i < strs.length; i++) {
            currentLCPStr = getCommonPrefix(currentLCPStr, strs[i]);
            log.info("currentLCPStr : {}", currentLCPStr);
        }
        return currentLCPStr;
    }

    protected String getCommonPrefix(String str1, String str2) {
        int minSize = Math.min(str1.length(), str2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minSize; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            }
        }
        return new String(sb);
    }

    private String mySolution(String[] strs) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        String shortStr = Arrays.stream(strs)
                .sorted((str1, str2) -> str1.length() > str2.length() ? 1 : -1).findFirst().get();

        log.info("shortStr : {}", shortStr);

        Map<String, Integer> strVsIndexMap = new HashMap<>();
        for (String str : strs) {
            if (!str.equals(shortStr)) {
                strVsIndexMap.put(str, str.indexOf(shortStr.charAt(0)));
            }
        }

        log.info("strVsIndexMap : {}", strVsIndexMap);

        if (strVsIndexMap.size() != strs.length - 1) {
            return "";
        }

        //처리
        char[] shortStrChars = shortStr.toCharArray();
        Integer strIndex;
        char ch;
        int matchCount;

        for (int i = 1; i < shortStrChars.length; i++) {
            ch = shortStrChars[i];
            matchCount = 0;

            for (String keyStr : strVsIndexMap.keySet()) {
                strIndex = strVsIndexMap.get(keyStr);

                log.info("{}={} keyStr : {} strIndex: {}", i, ch, keyStr, strIndex);
                if (ch == keyStr.charAt(strIndex + 1)) {
                    matchCount++;

                    //update hashmap
                    strVsIndexMap.put(keyStr, strIndex + 1);
                    log.info("updating :: strVsIndexMap : {} matchCount : {}", strVsIndexMap, matchCount);
                } else {
                    log.info("no match :: {} == {}", ch, keyStr.charAt(strIndex + 1));
//                    result();
                }
            }
//
//            if (matchCount < strs.length - 1) {
//                return "";
//            }
        }
        return new String(sb);
    }
}
