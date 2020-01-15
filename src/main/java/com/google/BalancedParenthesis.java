package com.google;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class BalancedParenthesis {
    public static char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    public static boolean isOpenTerm(char c) {
        for (char[] token : TOKENS) {
            log.info("arr:  {}", token);
            if (token[0] == c) {
                return true;
            }
        }
        return false;
    }

    /**
     * https://www.youtube.com/watch?v=IhJGJG-9Dx8
     *
     * @param str
     * @return
     */
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        if (str.length() % 2 != 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
