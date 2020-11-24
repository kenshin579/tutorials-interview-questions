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
        String num = "1";
        if (n == 1) {
            return num;
        }

        for (int i = 1; i < n; i++) {
            log.info("num : {}", num);
            num = countAndSay(num);
        }
        return num;
    }

    String countAndSay(String num) {
        StringBuilder sb = new StringBuilder();
        char prevNum = num.charAt(0);
        num = num.substring(1) + " ";
        int count = 1;

        for (char curNum : num.toCharArray()) {
//            log.info("prevNum: {} curNum : {} count : {} sb : {}", prevNum, curNum, count, sb);
            if (prevNum != curNum) {
                sb.append(count).append(prevNum);
                prevNum = curNum;
                count = 1;
            } else {
                count++;
            }
        }

        return sb.toString();
    }
}
