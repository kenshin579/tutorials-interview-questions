package com.codility.lessons.coutingelements;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class FrogRiver {

	public Set<Integer> initPositionSet(int X) {
		Set<Integer> unmarkedSet = new HashSet<>();

		for (int i = 1; i <= X; i++) {
			unmarkedSet.add(i);
		}
		return unmarkedSet;
	}

	/**
	 * 모든 position에 leave가 있는 경우에 개구리가 반대쪽으로 넘어갈 수 있음
	 *
	 * @param X position의 수
	 * @param A
	 * @return
	 */
	public int solution(int X, int[] A) {
		// write your code in Java SE 8
		int size = A.length;
		Set<Integer> unmarkedSet = initPositionSet(X);

		for (int i = 0; i < size; i++) {
			if (unmarkedSet.size() > 0) {
				if (unmarkedSet.contains(A[i])) {
					unmarkedSet.remove(A[i]);
				}
			}

			if (unmarkedSet.size() == 0) {
				return i;
			}

		}
		return -1;
	}

}
