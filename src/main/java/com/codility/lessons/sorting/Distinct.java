package com.codility.lessons.sorting;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class Distinct {

	/**
	 * distinct 값의 수를 반환함
	 * <p>
	 * 결과 : 100%
	 *
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		Set<Integer> uniqueSet = new HashSet<>();

		int size = A.length;
		for (int i = 0; i < size; i++) {
			uniqueSet.add(A[i]);
		}

		return uniqueSet.size();
	}
}
