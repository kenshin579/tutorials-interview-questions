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
     * Time Complexity : O(N * M), N: 입력값, M: string 가장의 긴 값
     *
     * Algorithm :
     * 1.countAndSay(num) <-- 숫자를 보고 몇개 있지를
     * - 1 | ## <-- 분리해서 첫번째, 두번째 char가 다르면, 다음 char로 넘어감
     * - 같은 char이면 count를 하나씩 올림
     * 2.fibonacci sequence처럼 앞의 결과를 가지고 처리를 해야 해서 loop을 돌면서 countAndSay를 호출함
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
