package com.codility.lessons.primeandcompositenumbers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountFactors {

	/**
	 * 입력 숫자에 대한 factor의 갯수를 반환함
	 * <p>
	 * 결과: 71%
	 *
	 * @param N
	 * @return
	 */
	public int solution(int N) {
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				count++;
			}
		}
		return count;
	}
}
