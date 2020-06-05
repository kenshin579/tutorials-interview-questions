package com.java.examples.test.test3;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *
 */
@Slf4j
public class Question1 {
	public static String wordLength(String text1, String text2){
		int p = text2.length();
		int max = 0;
		String result = "";

		for (int i = 0; i < p; i++) {
			for (int j = 0; j < p; j++) {
				if (i < j) {
					String pp = text2.substring(i, j + 1);

					if (text1.indexOf(pp) != -1 && max < pp.length()) {
						max = pp.length();
						result = pp;
					}
				}
			}
		}
		return result;
	}
}
