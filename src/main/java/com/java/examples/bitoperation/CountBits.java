package com.java.examples.bitoperation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountBits {

	/**
	 * https://www.geeksforgeeks.org/count-set-bits-in-an-integer/
	 * Loop through all bits in an integer, check if a bit is set and if it is then increment the set bit count. See below program.
	 *
	 * @param n
	 * @return
	 */
	public static int countBits1(int n) {
		int count = 0;
		while (n > 0) {
			count += n & 1; //마지막 bit를 1이면 count함
			n >>= 1; //마지막 bit를 삭제함
		}
		return count;
	}

	/**
	 * https://github.com/mission-peace/interview/blob/master/src/com/interview/bits/CountBits.java
	 * https://www.quora.com/How-do-you-count-the-number-of-1-bits-in-a-number-using-only-bitwise-operations
	 *
	 * @param number
	 * @return
	 */
	public static int countBits2(int number) {
		int count = 0;
		while (number > 0) {
			number &= number - 1;
			count++;
		}
		return count;
	}
}
