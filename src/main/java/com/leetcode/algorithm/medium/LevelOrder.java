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
	 * Time Complexity : O(N) : while loop이 2개 있지만, N만큼의 loop이라서 O(N)으로 봐도 괜찮지 않을 까 싶음
	 * <p>
	 * Algorithm : Level 단위로 traversal 하기 위해서 기본적으로 queue를 사용함 (BFS)
	 * - 각 level마다 List를 생성해야 해서 level마다 별도 Queue를 사용함
	 */
	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<Queue<TreeNode>> queueList = new ArrayDeque<>();
		Queue<TreeNode> currentQueue = new ArrayDeque<>();
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> subResult;

		TreeNode current;
		if (root != null) {
			currentQueue.add(root);
			queueList.add(currentQueue);
		}

		Queue<TreeNode> newQueue;

		while (!queueList.isEmpty()) {
			currentQueue = queueList.poll();
			subResult = new ArrayList<>();
			newQueue = null;

			while (!currentQueue.isEmpty()) {
				current = currentQueue.poll();
				subResult.add(current.val);
//				log.info("current.val : {}", current.val);

				if (newQueue == null) {
//					log.info("creating new queue");
					newQueue = new ArrayDeque<>();
				}

				if (current.left != null) {
					newQueue.add(current.left);
				}

				if (current.right != null) {
					newQueue.add(current.right);
				}
			}

			if (newQueue.size() > 0) {
				queueList.add(newQueue);
			}

			if (subResult.size() > 0)
				result.add(subResult);
		}
		return result;
	}
}
