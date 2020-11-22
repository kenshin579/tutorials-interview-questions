package com.geeksforgeeks.sequence;

import lombok.extern.slf4j.Slf4j;

/**
 * Look and Say Sequence
 * Difficulty : Easy
 * Tags : Sequence
 *
 * https://www.geeksforgeeks.org/look-and-say-sequence/
 * https://ko.wikipedia.org/wiki/%EC%9D%BD%EA%B3%A0_%EB%A7%90%ED%95%98%EA%B8%B0_%EC%88%98%EC%97%B4
 */
@Slf4j
public class LookAndSaySequence {
    /**
     * Time Complexity :
     *
     * Algorithm :
     */
    public String lookAndSaySequence(int n) {
        return "";
    }

    String countAndSay(String numStr) {
        StringBuilder sb = new StringBuilder();
//        String numStr = Integer.toString(n);
        int count = 0;
        char prevNum;

        for (int i = 0; i < numStr.length(); i++) {
            log.info("count : {} sb : {}", count, sb);
        }

        return sb.toString();
    }
}
