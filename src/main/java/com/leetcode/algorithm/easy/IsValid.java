package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 이건 stack 사용하면 됨
 * https://leetcode.com/problems/valid-parentheses/
 */
@Slf4j
public class IsValid {
    Map<Character, Character> bracketMap = new HashMap<Character, Character>() {
        {
            put('(', ')' );
            put('{', '}' );
            put('[', ']' );
        }
    };

    public boolean isValid(String s) {
        char[] charS = s.toCharArray();
        Stack<Character> stack = new Stack<>();


        if (s.isEmpty()) {
            return true;
        }
        if (isCloseBracket(charS[0]) || s.length() % 2 != 0) {
            return false;
        }

        Character popChar;

        for (char currChar : charS) {
            if (this.isOpenBracket(currChar)) {
                stack.push(currChar);
            } else {
                popChar = stack.pop();
                Character matchChar = bracketMap.get(popChar);
                if (!matchChar.equals(currChar)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpenBracket(Character bracketChar) {
        return bracketMap.containsKey(bracketChar);
    }

    private boolean isCloseBracket(Character bracketChar) {
        return bracketMap.containsValue(bracketChar);
    }
}
