package com.google;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class ValidParenthesis {

	/**
	 * 기록:
	 * https://blog.advenoh.pe.kr/algorithm/Algorithm-2%EA%B0%9C%EC%9D%98-array%EC%97%90%EC%84%9C-common-value-%EC%B0%BE%EA%B8%B0/
	 * <p>
	 * Parentheses가 valid한지 체크하는 함수를 작성하시오
	 * ex. ()()() -> true
	 * )( -> false
	 * <p>
	 * 복잡도 : O(n)
	 *
	 * @param str
	 * @return
	 */
	public boolean isBalanced(String str) {
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
