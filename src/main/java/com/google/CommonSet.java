package com.google;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Slf4j
public class CommonSet {

	/**
	 * 복잡도 : O(n)
	 *
	 * @param A
	 * @param B
	 * @return
	 */
	public Set<Integer> solution(int[] A, int[] B) {
		Set<Integer> result = new HashSet<>();
		Map<Integer, Boolean> mapB = new HashMap<>();

		for (int x : B) {
			if (!mapB.containsKey(x)) { //중복되는 값은 제거
				mapB.put(x, true);
			}
		}

		for (int x : A) {
			if (mapB.containsKey(x)) {
				result.add(x);
			}
		}
		return result;
	}
}
