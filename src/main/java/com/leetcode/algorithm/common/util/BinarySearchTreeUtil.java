package com.leetcode.algorithm.common.util;

import com.leetcode.algorithm.common.struct.BinarySearchTree;
import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Slf4j
public class BinarySearchTreeUtil {
	public static BinarySearchTree generateBinaryTree(List<Integer> list) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		list.forEach(binarySearchTree::add);
		return binarySearchTree;
	}

	public static List<Integer> convertToListAsDFS(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> result = new ArrayList<>();
		TreeNode current;
		if (root != null) {
			stack.push(root);
		}

		while (!stack.isEmpty()) {
			current = stack.pop();
			result.add(current.val);

			if (current.right != null) {
				stack.push(current.right);
			}

			if (current.left != null) {
				stack.push(current.left);
			}
		}

		return result;
	}
}
