package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 102. Binary Tree Level Order Traversal
 * Difficulty : Medium
 * Tags : Tree
 * <p>
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * <p>
 * }
 */
@Slf4j
public class LevelOrder {
	/**
	 * Time Complexity : O(N)
	 *
	 * Algorithm :
	 *
	 */
	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new ArrayDeque<>();
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> subResult = new ArrayList<>();

		TreeNode current;
		if (root != null) {
			queue.add(root);
		}

		while (!queue.isEmpty()) {
			current = queue.poll();
			subResult.add(current.val);

			if (queue.size() == 0) {
				result.add(subResult);
				subResult = new ArrayList<>();
			}

			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}
		return result;
	}
}
