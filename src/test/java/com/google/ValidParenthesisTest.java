package com.google;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesisTest {

    @Test
    public void test_valid_parentheses() {
        assertTrue(new ValidParenthesis().solution("()()()"));
        assertTrue(new ValidParenthesis().solution("((()))"));
        assertTrue(new ValidParenthesis().solution("(())(())()"));
        assertTrue(new ValidParenthesis().solution("(())(())()()"));
    }

    @Test
    public void test_not_valid_parentheses() {
        assertFalse(new ValidParenthesis().solution(")("));
        assertFalse(new ValidParenthesis().solution("((())"));
        assertFalse(new ValidParenthesis().solution("(()()))"));
    }
}