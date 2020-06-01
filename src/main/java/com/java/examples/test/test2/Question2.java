package com.java.examples.test.test2;

import lombok.extern.slf4j.Slf4j;

/**
 * https://stackoverflow.com/questions/19058859/what-does-mean-in-java
 * https://www.geeksforgeeks.org/bitwise-operators-in-java/
 * https://www.binaryconvert.com/result_signed_int.html?decimal=045049048
 */
@Slf4j
public class Question2 {
	public static int countBits(int number) {
		int count = 0;
		while (number != 0) {
			count += (number & 1);
			number = number >>> 1;
			log.info("count : {} number : {} => {}", count, number, Integer.toString(number, 2));
		}
		return count;
	}
}
