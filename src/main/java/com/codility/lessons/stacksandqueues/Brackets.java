package com.codility.lessons.stacksandqueues;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class Brackets {

	private char[][] TOKENS = { { '{', '}' }, { '(', ')' }, { '[', ']' } };

	/**
	 * brackets 매칭이 잘 된 경우
	 * https://www.youtube.com/watch?v=IhJGJG-9Dx8
	 * <p>
	 * 결과: 100%
	 *
	 * @param S
	 * @return
	 */
	public int solution(String S) {
		//        log.info("{}", TOKENS[1][0]);
		Stack<Character> stack = new Stack<>();

		if (S.length() == 0) {
			return 1;
		}

		if (S.length() % 2 != 0) {
			return 0;
		}

		for (char ch : S.toCharArray()) {
			log.info("ch:{}", ch);

			if (openingTerm(ch)) {
				stack.push(ch);
			} else {
				//closingTerm
				if (!stack.isEmpty()) {
					if (!matchingTerm(stack.pop(), ch)) {
						return 0;
					}
				}
			}
		}

		return stack.isEmpty() ? 1 : 0;
	}

	private boolean matchingTerm(char openTerm, char endTerm) {
		for (int i = 0; i < TOKENS.length; i++) {
			if (TOKENS[i][0] == openTerm) {
				if (TOKENS[i][1] == endTerm) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean openingTerm(char openTerm) {
		for (int i = 0; i < TOKENS.length; i++) {
			if (TOKENS[i][0] == openTerm) {
				return true;
			}
		}
		return false;
	}
}
