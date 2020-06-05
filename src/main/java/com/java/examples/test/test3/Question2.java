package com.java.examples.test.test3;

import lombok.extern.slf4j.Slf4j;

/**
 * https://stackoverflow.com/questions/19058859/what-does-mean-in-java
 * https://www.geeksforgeeks.org/bitwise-operators-in-java/
 * https://www.binaryconvert.com/result_signed_int.html?decimal=045049048
 */
@Slf4j
public class Question2 {
	public static int countBits(int number) {
		int[] b = new int[32]; //array로 저장하고 있음 (64bit 넘는 경우는 있나? number?)
		int i = 0;
		while (number != 1) {
			b[i++] = number % 2;
			number = number / 2;
		}
		b[i] = number;
		int count = 0;
		for (int j = i; j >= 0; --j) {
			count++;
		}
		return count;
	}
}
