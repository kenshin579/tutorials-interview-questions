package com.java.examples.test.test2;

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
	public static List<Stack<Integer>> doDo() {
		final List<Integer> elements = Arrays.asList(9, 7, 6, 6, 4, 3, 4, 5, 3, 4, 3, 4, 1, 2);

		List<Stack<Integer>> result = new ArrayList<Stack<Integer>>();
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		for (int i = 0; i < elements.size(); i++) {
			sum += elements.get(i);
			if (sum > 20) {
				sum = elements.get(i);
				result.add(stack);
				stack = new Stack<Integer>();
				stack.add(elements.get(i));
			} else {
				stack.add(elements.get(i));
			}
			if (i == elements.size() - 1) {
				result.add(stack);
			}
		}
		return result;
	}
}
