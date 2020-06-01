package com.java.examples.test.test1;

import org.junit.Test;

import java.util.List;
import java.util.Stack;

import static com.java.examples.test.test1.Question1.doDo;

public class Question1Test {

	@Test
	public void doDo1() {
		List<Stack<Integer>> stackList = doDo();
		for (Stack<Integer> stack : stackList) {
			for (Integer element : stack) {
				System.out.print(element.toString() + " ");
			}
			System.out.println();
		}
	}
}