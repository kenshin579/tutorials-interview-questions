package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 104. Maximum Depth of Binary Tree
 * Difficulty : Easy
 * Tags : Tree
 *
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
    /**
     * Time Complexity : O(N)
     * ==> T(N) = 2T(N/2) + 1
     *
     * Algorithm : DFS
     * 1.base case : root가 null이면 0
     * 2.subproblem : left, right 호출하되 depth가 호출할 때마다 1로 증가되야 함
     */
    public int maxDepth(TreeNode root) {
        log.info("root : {}", root);
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        log.info("leftMaxDepth : {}", leftMaxDepth);
        int rightMaxDepth = maxDepth(root.right);
        log.info("rightMaxDepth : {}", rightMaxDepth);

        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}
