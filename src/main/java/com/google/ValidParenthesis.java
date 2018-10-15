package com.google;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class ValidParenthesis {
    private static final Logger LOG = LoggerFactory.getLogger(ValidParenthesis.class);

    /**
     * Parentheses가 valid한지 체크하는 함수를 작성하시오
     * ex. ()()() -> true
     * )( -> false
     * <p>
     * 복잡도 : O(n)
     *
     * @param str
     * @return
     */
    public boolean solution(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        if (str.length() % 2 != 0) {
            return false;
        }

        if (chars[0] == ')') {
            return false;
        }

        for (char ch : chars) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                // close parenthesis
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
