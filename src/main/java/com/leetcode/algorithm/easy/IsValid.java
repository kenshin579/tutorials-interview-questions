package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Difficulty : Easy
 * Tags : String
 *
 * https://leetcode.com/problems/valid-parentheses/
 */
@Slf4j
public class IsValid {
    Map<Character, Character> bracketMap = new HashMap<>() {
        {
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }
    };

    /**
     * Time Complexity : O(N), s의 길이
     * Algorithm : 이건 stack 사용하면 됨
     * 1. OpenBracket이면 stack에 push
     * 2. CloseBracket이면 stack에서 pop한 OpenBracket과 match이 되는지 확인
     * 3. Stack에 아무것도 없으면 true 반환한다
     */
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
            } else { //CloseBracket인 경우
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
