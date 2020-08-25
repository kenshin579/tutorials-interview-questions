package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 404. Sum of Left Leaves
 * https://leetcode.com/problems/sum-of-left-leaves/
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
@Slf4j
public class SumOfLeftLeaves {
    /**
     * Time Complexity :
     *
     * Algorithm :
     */
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        TreeNode current;

        while(!stack.isEmpty()) {
            current = stack.pop();
            if (current.left != null) {
                stack.push(current.left);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return sum;
    }
}
