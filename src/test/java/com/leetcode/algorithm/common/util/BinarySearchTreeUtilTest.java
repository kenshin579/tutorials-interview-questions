package com.leetcode.algorithm.common.util;

import com.leetcode.algorithm.common.struct.BinarySearchTree;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class BinarySearchTreeUtilTest {

	@Test
	public void convertToListAsBFS() {
		BinarySearchTree binarySearchTree = BinarySearchTreeUtil.generateBinaryTree(Arrays.asList(5, 2, 3, 1, 7, 10));
		binarySearchTree.print();

		List<Integer> result = BinarySearchTreeUtil.convertToListAsDFS(binarySearchTree.root);
		assertThat(result).isEqualTo(Arrays.asList(5, 2, 1, 3, 7, 10));

	}
}