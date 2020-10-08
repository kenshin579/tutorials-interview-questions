package com.programmers.challenge.october;

import lombok.extern.slf4j.Slf4j;

/**
 * https://algospot.com/judge/problem/read/QUADTREE
 * https://haedallog.tistory.com/144
 * https://coding-god.tistory.com/32
 * https://hsp1116.tistory.com/53
 * https://soojong.tistory.com/entry/python%EB%B0%B1%EC%A4%80-%EC%BF%BC%EB%93%9C%ED%8A%B8%EB%A6%AC
 */
@Slf4j
public class Problem2 {
	public int[] solution(int[][] arr) {
		String s = quadTree(arr, 0, 0, arr.length);
//		log.info("s : {}", s);
		return countZeroAndOne(s);
	}

	private int[] countZeroAndOne(String s) {
		int[] answer = new int[2];

		int sumOne = 0;
		int sumZero = 0;
		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			if (Character.getNumericValue(chars[i]) == 0)
				sumZero += 1;
			else if (Character.getNumericValue(chars[i]) == 1)
				sumOne += 1;

		}

		answer[0] = sumZero;
		answer[1] = sumOne;
		return answer;
	}

	private String quadTree(int[][] arr, int i, int j, int size) {
//		log.info("i : {} j : {} size: {}", i, j, size);

		//모든 같은 값인 경우
		if (isAllEqualToTheValue(arr, 0, i, j, size)) {
//			log.info("all zero");
			return "0";
		}
		if (isAllEqualToTheValue(arr, 1, i, j, size)) {
//			log.info("all one");
			return "1";
		}

		//다른 값인 경우 - 4등분함
		size /= 2;

		String result = "("
				+ quadTree(arr, i, j, size) //좌상단
				+ quadTree(arr, i, j + size, size) //우상단
				+ quadTree(arr, i + size, j, size) //좌하단
				+ quadTree(arr, i + size, j + size, size) //우하단
				+ ")";
		return result;
	}

	private boolean isAllEqualToTheValue(int[][] arr, int value, int a, int b, int size) {
		//		log.info("{}.{}.{}", a, b, size);
		for (int i = a; i < a + size; i++) {
			for (int j = b; j < b + size; j++) {
				if (arr[i][j] != value) {
					return false;
				}
			}
		}
		return true;
	}

}
