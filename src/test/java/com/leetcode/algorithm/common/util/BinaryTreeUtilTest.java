package com.leetcode.algorithm.common.util;

import com.leetcode.algorithm.common.struct.BinaryTree;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeUtilTest {

	@Test
	public void generateBinaryTree() {
		//todo : null이 있는 경우, TreeNode.val 값을 int -> Integer로 변경을 해야 할 듯하다. 하지만, TreeNode(null) 값이라서 null이랑은 다름...
		BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
		binaryTree.print();
	}
}