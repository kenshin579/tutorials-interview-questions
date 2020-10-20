package com.programmers.challenge.season1;

import lombok.extern.slf4j.Slf4j;

/**
 * 시간 초가 이슈도 있음
 */
@Slf4j
public class Problem4 {
	public long solution(String s) {
		char[] chars = s.toCharArray();
		int sum = 0;

		for (int i = 0; i < chars.length; i++) {
			for (int j = i; j < chars.length; j++) {
				if (i != j) {
					log.info("{}.{}", i, j);
					sum += getMaxDiff(chars, i, j);
					log.info("sum : {} {}", sum, getMaxDiff(chars, i, j));
				}
			}
			System.out.println();
		}

		return sum;
	}

	private int getMaxDiff(char[] chars, int start, int end) {
		int max = -1;
		for (int i = start; i <= end; i++) {
			max = Math.max(diffChars(chars, start, i), max);
		}
		return max;
	}

	private int diffChars(char[] chars, int start, int end) {
		if (chars[start] == chars[end]) {
			return 0;
		} else {
			return end - start;
		}
	}

}
