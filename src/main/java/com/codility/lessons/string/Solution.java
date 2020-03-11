package com.codility.lessons.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {
    public int solution(String S, int K) {
        String[] split = S.split(" ");
        if (split.length == 1 && split[0].length() != K) {
            return -1;
        }

        int totalCount = 0;
        int subTotalStrLen = 0;
        String word;
        StringBuilder sb = null;
        for (int i = 0; i < split.length; i++) {
            word = split[i];

            if (word.length() > K) {
                return -1;
            }
            if (subTotalStrLen == 0) {
                subTotalStrLen += word.length();
                sb = new StringBuilder();
                sb.append(word);
            } else {
                subTotalStrLen += word.length() + 1;
                if (subTotalStrLen <= K) {
                    sb.append(" ").append(word);
                }
            }

            log.info("split[{}]={} len: {} subTotalStrLen:{} totalCount:{}", i, word, word.length(), subTotalStrLen, totalCount);

            if (subTotalStrLen >= K) {
                if (subTotalStrLen > K) {
                    i--;
                }
                totalCount++;
                subTotalStrLen = 0;
            }
            log.info("{}.subTotalStrLen:{} totalCount:{}", i, subTotalStrLen, totalCount);
            log.info("{}.[{}]", i, new String(sb));
            log.info("");

            if (subTotalStrLen != 0 && i == split.length - 1) {
                totalCount++;
            }
        }
        return totalCount;
    }

    private int test(String S, int K) {
        StringBuilder sb = new StringBuilder();

        String[] split = S.split(" ");
        if (split.length == 1 && split[0].length() != K) {
            return -1;
        }

        int totalCount = 0;
        int len = 0;
        String eachWord;
        int subCount = 0;

        for (int i = 0; i < split.length; i++) {
            eachWord = split[i];
            len += eachWord.length();

            if (sb.toString().equals("")) {
                sb.append(eachWord);
            } else {
                sb.append(" ").append(eachWord);
            }

            if (len >= K) {
                i--;
                totalCount++;
                len = 0;
            }
            if (len > 0 && i == split.length - 1) {
                totalCount++;
            }

            log.info("split[{}]={} len: {}, total:{} sb: {}", i, eachWord, eachWord.length(), len, new String(sb));
        }
        return totalCount;
    }
}
