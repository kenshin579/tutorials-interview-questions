package com.java.examples.test.test1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Question2 {
	public static int countBits(int number) {
		int tag; //todo : 이름을 왜 tag로 했나?
		String numStr = "";
		int oldNumber = number; //todo : 이거 사용하지도 않음

		while (true) {
			tag = number % 2;
			numStr = String.valueOf(tag) + numStr;
			if (number / 2 == 0) {
				break;
			}
			number = number / 2;
		}

		int n = 0;
		for (int i = 0; i < numStr.length(); i++) {
			if (numStr.charAt(i) != '1') //todo : 1인것만 카운드하면 되지 않나?
				continue;
			n++;
		}
		return n;
	}
}
