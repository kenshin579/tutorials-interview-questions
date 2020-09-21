package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.BinaryTree;
import com.leetcode.algorithm.common.util.BinaryTreeUtil;
import org.junit.Test;

import java.util.Arrays;

public class LevelOrderTest {

	@Test
	public void levelOrder() {
		//todo : 다시 보기
		BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
		binaryTree.print();
	}
}