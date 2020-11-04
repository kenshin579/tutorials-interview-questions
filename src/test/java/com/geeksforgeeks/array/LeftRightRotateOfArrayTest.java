package com.geeksforgeeks.array;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LeftRightRotateOfArrayTest {

	@Test
	public void rotateArray() {
		int[] arr = {1, 2, 3, 4, 5};

		assertThat(new LeftRightRotateOfArray().rotateArray(arr, -2)).isEqualTo(Arrays.asList(3, 4, 5, 1, 2));
	}
}