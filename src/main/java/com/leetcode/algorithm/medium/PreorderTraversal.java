package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal
 * Difficulty : Medium
 * Tags : Tree
 *
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * https://leetcode.com/problems/binary-tree-preorder-traversal/discuss/739974/Java-Two-solutions.
 */
@Slf4j
public class PreorderTraversal {
    /**
     * Time Complexity : O(N)
     * => T(N) = 2T(N/2) + 1
     * https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
     * <p>
     * Algorithm :
     * 1. node가 null이 아닌 경우에는 current.val을 list에 넣고
     * 2. left, right도 넣도록 함
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalRecursive(root, result);
        return result;
    }

    private void preorderTraversalRecursive(TreeNode current, List<Integer> result) {
        log.info("current : {} result : {}", current, result);
        if (current != null) { //base case
            result.add(current.val);
            preorderTraversalRecursive(current.left, result);
            preorderTraversalRecursive(current.right, result);
        }
    }

    /**
     * Time Complexity: O(N)
     * Algorithm : stack을 사용함
     * 1.기존 아이디어 : TreeNode의 값을 preorder 순서로 stack에 넣고 빼면서 list에 넣음
     * - stack에는 root, right, left 순서로 넣어야 root, left, right 순서로 뽑을 수 있다
     */
    public List<Integer> preorderTraversalNonRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        TreeNode current;

        while (!stack.isEmpty()) {
            current = stack.pop();

            if (current != null) {
                result.add(current.val);
                stack.push(current.right);
                stack.push(current.left);
            }
        }
        return result;
    }
}
