package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

/**
 * 394. Decode String
 * Difficulty : Medium
 * Tags : String
 *
 * https://leetcode.com/problems/decode-string/
 * https://www.geeksforgeeks.org/decode-string-recursively-encoded-count-followed-substring/
 * https://medium.com/@rebeccahezhang/leetcode-394-decode-string-6aafb1ad6bc3
 * https://learnersbucket.com/examples/algorithms/decode-a-string-encoded-with-number-followed-by-string/
 */
@Slf4j
public class DecodeString {
    /**
     * Time Complexity: O(N)
     * <p>
     * Algorithm :
     * 1.num룰 만나면 numStack에 넣는다
     * 2.(이면 현재 decodeStr을 strStack에 넣는다
     * 3.)이면 strStack에서 pop()해서 tmp에
     * - numStack에 숫자 꺼내서 숫자만큼 decodeStr의 반복함
     * 4.char면 decodeStr에 추가함
     */
    public String decodeString(String s) {
        final char CLOSE_BRACKET = ']';
        final char OPEN_BRACKET = '[';
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder decodedStr = new StringBuilder();
        StringBuilder tmp;
        int num;
        int length = s.length();

        for (int i = 0; i < length; i++) {
//            log.info("charAt({})={}", i, s.charAt(i));
            num = 0;
            if (Character.isDigit(s.charAt(i))) {
                while (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + Character.getNumericValue(s.charAt(i));
                    i++;
                }
                i--;
                numStack.push(num);
//                log.info("numStack : [{}]", numStack);
            } else if (s.charAt(i) == OPEN_BRACKET) {
                strStack.push(decodedStr.toString());
                decodedStr = new StringBuilder();
//                log.info("  ( strStack : [{}] decodedStr:[{}] size:{}", strStack, decodedStr, strStack.size());
            } else if (s.charAt(i) == CLOSE_BRACKET) {
                tmp = new StringBuilder(strStack.pop());
                num = numStack.pop();
//                log.info("  ) tmp: [{}] num : {}", tmp, num);
                tmp.append(String.valueOf(decodedStr).repeat(Math.max(0, num)));
//                log.info("  ) tmp: [{}] strStack : [{}] decodedStr:[{}]", tmp, strStack, decodedStr);
                decodedStr = tmp;
            } else {
                decodedStr.append(s.charAt(i));
            }
//            log.info("decodedStr : {}", decodedStr);
        }
        return decodedStr.toString();
    }
}
