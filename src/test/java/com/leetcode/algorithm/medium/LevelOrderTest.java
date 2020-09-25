package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
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
		//todo : 작업이 더 필요함
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
	public void levelOrder2() {
		TreeNode root = new TreeNode(
				3,
				new TreeNode(9),
				new TreeNode(20)

		);

		List<List<Integer>> expected = Arrays.asList(
				asList(3),
				asList(9, 20)
		);

		List<List<Integer>> result = new LevelOrder().levelOrder(root);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void levelOrder3() {
		TreeNode root = new TreeNode(3);

		List<List<Integer>> expected = Arrays.asList(
				asList(3)
		);

		List<List<Integer>> result = new LevelOrder().levelOrder(root);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void levelOrder4() {
		TreeNode root = new TreeNode(1,
				new TreeNode(2,
						new TreeNode(4),
						new TreeNode(5)),
				new TreeNode(3));

		BTreePrinter.printNode(root);

		List<List<Integer>> expected = Arrays.asList(
				asList(1),
				asList(2, 3),
				asList(4, 5)
		);

		List<List<Integer>> result = new LevelOrder().levelOrder(root);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void levelOrder5() {
		TreeNode root = new TreeNode(1,
				new TreeNode(2,
						new TreeNode(4),
						new TreeNode(5)),
				new TreeNode(3,
						new TreeNode(8),
						new TreeNode(9)));

		BTreePrinter.printNode(root);

		List<List<Integer>> expected = Arrays.asList(
				asList(1),
				asList(2, 3),
				asList(4, 5, 8, 9)
		);

		List<List<Integer>> result = new LevelOrder().levelOrder(root);
		assertThat(result).isEqualTo(expected);
	}

	@Test
	public void levelOrder6() {
		TreeNode root = new TreeNode(1,
				new TreeNode(2,
						null,
						new TreeNode(5)),
				new TreeNode(3,
						new TreeNode(8),
						new TreeNode(9)));

		BTreePrinter.printNode(root);

		List<List<Integer>> expected = Arrays.asList(
				asList(1),
				asList(2, 3),
				asList(5, 8, 9)
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