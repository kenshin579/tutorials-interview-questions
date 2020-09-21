package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.BinarySearchTree;
import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
import com.leetcode.algorithm.common.util.BinarySearchTreeUtil;
import org.junit.Test;

import java.util.Arrays;

public class DeleteNodeTest {

	@Test
	public void deleteNode() {
		BinarySearchTree binarySearchTree = BinarySearchTreeUtil.generateBinaryTree(Arrays.asList(5, 3, 6, 2, 4, 7));
		binarySearchTree.print();

		TreeNode result = new DeleteNode().deleteNode(binarySearchTree.root, 3);
		BTreePrinter.printNode(result);

		//        assertThat(result)

	}

	@Test
	public void deleteNode2() {
		BinarySearchTree binarySearchTree = BinarySearchTreeUtil.generateBinaryTree(Arrays.asList());
		binarySearchTree.print();

		TreeNode result = new DeleteNode().deleteNode(binarySearchTree.root, 3);
		BTreePrinter.printNode(result);

		//        assertThat(result)

	}


}