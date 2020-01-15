package com.java.examples.bitoperation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConvertDeciToAnyBase {

	/**
	 * 기록:|
	 * https://www.geeksforgeeks.org/convert-base-decimal-vice-versa/
	 *
	 * @param n
	 * @param base
	 * @return
	 */
	public static String convertToAnyBase(int n, int base) {
		StringBuilder sb = new StringBuilder();
		int remainder;
		while (n > 0) {
			remainder = n % base;
			n = n / base;
			sb.insert(0, remainder);
		}
		return sb.toString();
	}
}
