package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class LevelOrderTest {

	@Test
	public void levelOrder() {
		//todo : 다시 보기
		//		BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
		//		binaryTree.print();
		TreeNode root = new TreeNode(
				3,
				new TreeNode(9),
				new TreeNode(20,
						new TreeNode(15),
						new TreeNode(7))

		);

		List<List<Integer>> expected = Arrays.asList(
				asList(3),
				asList(9, 20),
				asList(15, 7)
		);

		List<List<Integer>> result = new LevelOrder().levelOrder(root);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void ArrayDequeTest() {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(1);
		queue.add(3);
		queue.add(10);
		assertThat(queue.poll()).isEqualTo(1);
		assertThat(queue.poll()).isEqualTo(3);
	}
}