package com.java.examples.bst;

import lombok.extern.slf4j.Slf4j;

/**
 * Binary Search 조건
 * - array는 정렬이 되어 있어야 함
 * <p>
 * 결과
 * - 검색한 index를 반환함
 */
@Slf4j
public class BinarySearch {

	//기록:|
	public static int RecursiveBinarySeach(int[] numArr, int start, int end, int searchNumber) {
		if (end >= start) {
			int mid = start + (end - start) / 2;

			if (numArr[mid] == searchNumber) {
				return mid;
			}

			if (numArr[mid] > searchNumber) {
				return RecursiveBinarySeach(numArr, start, mid - 1, searchNumber);
			}
			return RecursiveBinarySeach(numArr, mid + 1, end, searchNumber);
		}
		return -1;
	}

	/**
	 * 기록:|
	 * https://www.youtube.com/watch?v=j5uXyPJ0Pew
	 * non recursive 방식임.
	 *
	 * @param numArr
	 * @param searchNumber
	 * @return
	 */
	public static int nonrecursiveBinarySearch(int[] numArr, int searchNumber) {
		int startIndex = 0;
		int endIndex = numArr.length - 1;
		int midIndex;
		while (startIndex <= endIndex) {
			midIndex = (startIndex + endIndex) / 2;

			if (numArr[midIndex] == searchNumber) {
				return midIndex;
			} else if (searchNumber < numArr[midIndex]) {
				endIndex = midIndex - 1;
			} else {
				startIndex = midIndex + 1;
			}
		}
		return -1;
	}
}
