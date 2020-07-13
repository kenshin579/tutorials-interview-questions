package com.java.examples.test.test5;

import lombok.extern.slf4j.Slf4j;

/**
 * https://stackoverflow.com/questions/19058859/what-does-mean-in-java
 * https://www.geeksforgeeks.org/bitwise-operators-in-java/
 * https://www.binaryconvert.com/result_signed_int.html?decimal=045049048
 */
@Slf4j
public class Question2 {
	public static int countBits(int number) {
		String returnString = "";

		while(number != 0){
//			if( (number % 2) < 10 ) { //todo : 이거 필요없음
				returnString = (number % 2) + returnString;
				number /= 2;
//			}
		}
		int cnt = 0;
		for(char ch: returnString.toCharArray()){
			if(ch =='1') cnt++;
		}
		return cnt;
	}
}
