package com.codility.lessons.prefixsums;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PassingCars {

	/**
	 * 자동차가 통과하는 수를 카운트를 함
	 * - 조건 : (P,Q) : P <-- east, Q <-- west로 갈때 passing함
	 * <p>
	 * 결과 : 50%
	 * <p>
	 * 단점: N^2
	 *
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		// write your code in Java SE 8
		int size = A.length;
		long MAX_PASSING_CARS = 1000000000;
		int count = 0;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (A[i] == 0 && A[j] == 1) {
					count++;
					log.info("{}:{}", i, j);
				}
			}
		}

		if (MAX_PASSING_CARS < count) {
			return -1;
		}
		return count;
	}
}
