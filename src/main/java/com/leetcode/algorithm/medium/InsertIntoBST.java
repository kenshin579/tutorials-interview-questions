package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 701. Insert into a Binary Search Tree
 * Difficulty : Medium
 * Tags : Tree
 *
 * https://leetcode.com/problems/insert-into-a-binary-search-tree/
 */
@Slf4j
public class InsertIntoBST {
	/**
	 * Time Complexity :
	 *
	 * Algorithm :
	 *
	 */
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null)
			return new TreeNode(val);

		if (root.val < val) {
			root.right = insertIntoBST(root.right, val);
		} else {
			root.left = insertIntoBST(root.left, val);
		}
		return root;
	}
}