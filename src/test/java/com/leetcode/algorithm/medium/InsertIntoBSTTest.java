package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
import org.junit.Test;

public class InsertIntoBSTTest {

	@Test
	public void insertIntoBST() {
		TreeNode root = new TreeNode(4,
				new TreeNode(2,
						new TreeNode(1),
						new TreeNode(3)),
				new TreeNode(7));

		BTreePrinter.printNode(root);

		TreeNode result = new InsertIntoBST().insertIntoBST(root, 5);
		BTreePrinter.printNode(result);


	}
}