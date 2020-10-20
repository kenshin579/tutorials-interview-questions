package com.programmers.challenge.october;

import lombok.extern.slf4j.Slf4j;

/**
 * 월간 코드 챌린지 시즌1 > 쿼드압축 후 개수 세기
 * Difficulty : Medium
 * Tags : Compression
 *
 * https://algospot.com/judge/problem/read/QUADTREE
 * https://haedallog.tistory.com/144
 * https://coding-god.tistory.com/32
 * https://hsp1116.tistory.com/53
 * https://soojong.tistory.com/entry/python%EB%B0%B1%EC%A4%80-%EC%BF%BC%EB%93%9C%ED%8A%B8%EB%A6%AC
 */
@Slf4j
public class QuadTree {
	/**
	 * Time Complexity :
	 *
	 * Algorithm :
	 * 1.arr의 값을 quad 영역으로 recursive하게 순환함
	 * - quad 영역이 하나의 값으로 압축할 수 있으면 하나의 값으로 String 값을 반환함
	 * - 하나의 값으로 압축이 안되면 quad 영역으로 나눠서 recursve하게 호출함
	 * - 반환하는 String 값을 합쳐서 반환함
	 * 2.반환된 String의 0, 1를 count해서 반환함
	 */
	public int[] solution(int[][] arr) {
		String s = compressStringsByQuadTree(arr, 0, 0, arr.length);
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

	private String compressStringsByQuadTree(int[][] arr, int i, int j, int size) {
//		log.info("i : {} j : {} size: {}", i, j, size);

		//모든 같은 값인 경우 - 압축
		if (isAllValuesAreEqualToGivenValue(arr, 0, i, j, size)) {
			log.info("all zero");
			return "0";
		}
		if (isAllValuesAreEqualToGivenValue(arr, 1, i, j, size)) {
			log.info("all one");
			return "1";
		}

		//다른 값인 경우 - 4등분함
		size /= 2;

		return "("
				+ compressStringsByQuadTree(arr, i, j, size) //좌상단
				+ compressStringsByQuadTree(arr, i, j + size, size) //우상단
				+ compressStringsByQuadTree(arr, i + size, j, size) //좌하단
				+ compressStringsByQuadTree(arr, i + size, j + size, size) //우하단
				+ ")";
	}

	private boolean isAllValuesAreEqualToGivenValue(int[][] arr, int value, int a, int b, int size) {
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
