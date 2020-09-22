package com.leetcode.algorithm.common.struct;

import com.leetcode.algorithm.common.util.BTreePrinter;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://stackoverflow.com/questions/32223123/inserting-elements-in-binary-tree-in-java
 * https://www.geeksforgeeks.org/bfs-vs-dfs-binary-tree/
 * https://stackoverflow.com/questions/62705675/construct-a-binary-tree-from-a-sequence-of-values
 */
@Slf4j
public class BinaryTree {
	public TreeNode root;

    /**
     * todo : value에 null값을 받으려면 TreeNode.val 타입을 변경해야 함 (변경하는게 맞나?)
     * @param value the value (null 값도 포함될 수 있음)
     */
    public void add(Integer value) {
        if (root == null) {
            root = new TreeNode(value);
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode current;

        while (!queue.isEmpty()) {
            current = queue.poll();

            //null인 곳에 insert를 함
            if (current.left == null) {
                current.left = value == null ? null : new TreeNode(value);
                break;
            }
            if (current.right == null) {
                current.right = value == null ? null : new TreeNode(value);
                break;
            }

            queue.add(current.left);
            queue.add(current.right);
        }
    }

	public void print() {
		BTreePrinter.printNode(root);
	}
}
