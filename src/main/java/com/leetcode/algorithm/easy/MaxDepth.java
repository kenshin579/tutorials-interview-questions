package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * https://www.baeldung.com/java-binary-tree
 * https://stackoverflow.com/questions/2603692/what-is-the-difference-between-tree-depth-and-height
 * https://www.youtube.com/watch?v=YT1994beXn0
 */
@Slf4j
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}
