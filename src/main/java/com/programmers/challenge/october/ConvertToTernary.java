package com.programmers.challenge.october;

import lombok.extern.slf4j.Slf4j;

/**
 * 월간 코드 챌린지 시즌1 > 3진법 뒤집기
 * Difficulty : Easy
 * Tags : Bit
 *
 * https://prgms.tistory.com/32
 * https://www.geeksforgeeks.org/ternary-number-system-or-base-3-numbers/
 */
@Slf4j
public class ConvertToTernary {
	/**
	 * Time Complexity :
	 *
	 * Algorithm :
	 */
	public int solution(int n) {
		int answer;
		String binaryStr = Integer.toString(n, 3); //10진수 -> 3진수

		String flippedStr = flipBothEnds(binaryStr);
//		log.info("flippedStr : {}", flippedStr);

		answer = convertToDec(flippedStr); //3진수 -> 10진수
//		log.info("answer: {}", answer);

		return answer;
	}

	private int convertToDec(String flippedStr) {
		char[] chars = flippedStr.toCharArray();
		int answer = 0;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != '0') {
				answer += Character.getNumericValue(chars[i]) * Math.pow(3, chars.length - 1 - i);
//				log.info("{}*{}^{} = {}", chars[i], 3, chars.length - 1 - i, chars[i] * Math.pow(3, chars.length - 1 - i));
			}
		}

		return answer;
	}

	private String flipBothEnds(String str) {
		char[] chars = str.toCharArray();
		int start = 0;
		int end = chars.length - 1;
		char temp;
		while (start < end) {

			temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;

			start++;
			end--;
		}

		String s = new String(chars);
//		log.info("s: {}", s);
		return s;
	}
}
