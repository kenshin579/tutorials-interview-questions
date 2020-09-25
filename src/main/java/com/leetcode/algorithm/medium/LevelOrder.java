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
	 * <p>
	 * Algorithm :
	 */
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<Queue<TreeNode>> queueList = new ArrayList<>(1);
		Queue<TreeNode> currentQueue = new ArrayDeque<>();
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> subResult;

		TreeNode current;
		if (root != null) {
			currentQueue.add(root);
			queueList.add(currentQueue);
		}

		Queue<TreeNode> newQueue = null;

		while (!queueList.isEmpty()) {
			currentQueue = queueList.remove(0);
			subResult = new ArrayList<>();

			while (!currentQueue.isEmpty()) {
				current = currentQueue.poll();
				subResult.add(current.val);
				log.info("current.val : {}", current.val);

				if (queueList.size() == 0) {
					newQueue = new ArrayDeque<>();
				}

				if (current.left != null) {
					newQueue.add(current.left);
				}

				if (current.right != null) {
					newQueue.add(current.right);
				}

				if (newQueue != null && (current.left != null || current.right != null))
					queueList.add(newQueue);
			}

			if (subResult.size() > 0)
				result.add(subResult);
		}
		return result;
	}
}
