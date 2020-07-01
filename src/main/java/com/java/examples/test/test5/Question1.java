package com.java.examples.test.test5;

import lombok.extern.slf4j.Slf4j;

/**
 *
 */
@Slf4j
public class Question1 {
	public static String change(int num, int n){
		String returnString = "";
		String temp = "";
		int temp1 = 0;
		while(num != 0){
			if( (num % n) < 10 ) {
				returnString = (num % n) + returnString;
				num /= n;
			}
			else {
				temp1 = (char)((num % n)  + 55); //todo : 왜 55를 사용했나?
				returnString = Integer.toString(temp1) + returnString;
				//todo : 무한 loop을 돈다
			}
			log.info("num : {} temp1 : {}",  num, temp1);
		}

		log.info("returnString : {}", returnString);
		return returnString;
	}
}
