package com.java.examples.test.test4;

import lombok.extern.slf4j.Slf4j;

/**
 *
 */
@Slf4j
public class Question1 {
	public static int getSearchPriceArrayIndex(int[] priceArray, int searchPrice) {
		int index = 0; //todo: 데이터는 못찾는 경우에는
		int len = priceArray.length;
		if (searchPrice < priceArray[len / 2]) {
			for (int i = 0; i < len / 2; i++) {
				if (searchPrice == priceArray[i]) {
					index = i;
					return index;
				}
			}
		} else {
			for (int i = len / 2; i < len; i++) {
				if (searchPrice == priceArray[i]) {
					index = i;
					return index;
				}
			}
		}
		return index;
	}

	public static int getSearchPriceArrayIndex_binarySearch(int[] priceArray, int searchPrice) {
		int startIndex = 0;
		int endIndex = priceArray.length - 1;
		int midIndex;
		while (startIndex <= endIndex) {
			midIndex = (startIndex + endIndex) / 2;

			if (priceArray[midIndex] == searchPrice) {
				return midIndex;
			} else if (searchPrice < priceArray[midIndex]) {
				endIndex = midIndex - 1;
			} else {
				startIndex = midIndex + 1;
			}
		}
		return -1;
	}
}
