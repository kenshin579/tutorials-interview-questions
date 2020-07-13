package com.java.examples.test;

public class GetNum {
	public static int getNum(int num) {
		//todo : 변수 이름도 아닌듯함. 다시 해석해야 함
		int a = 0;
		int c = 0; //todo : 몇번째까지 저장을 했는지 용도임
		int[] b = new int[100]; //todo : 왜 100으로 제한을 해야 했나?

		for (int i = 0; i < 100; i++) {
			b[i] = num % 2; //나머지를 저장함
			num = num / 2;
			if (num == 1) {
				a = 1;
				c = i;
				break;
			}
		}

		int result = 0;
		if (a == 1) {
			result++;
		}
		for (int i = c; i >= 0; i--) {
			if (b[i] == 1) {
				result++; //count함
			}
		}

		return result;
	}
}
