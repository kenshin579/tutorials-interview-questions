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
	 * 1. worst case : O(N^2)
	 * 2. best case : O(N)
	 * T(N) = 2T(N/2) + 1
	 *
	 * Algorithm : binary search 로직으로 풀면 됨
	 *
	 * todo : iterative 버전도 추가하면 좋을 듯함
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
