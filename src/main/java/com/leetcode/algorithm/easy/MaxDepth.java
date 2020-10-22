package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;

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
 * https://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
 */
@Slf4j
public class MaxDepth {
    /**
     * todo : 이렇게 제출하면 맞는데...
     * MaxDepth == Height of Tree (?)
     * Time Complexity : O(N)
     * ==> T(N) = 2T(N/2) + 1
     *
     * Algorithm : DFS
     * 1.base case : root가 null이면 0
     * 2.subproblem : left, right 호출하되 depth가 호출할 때마다 1로 증가되야 함
     */
    public int maxDepth(TreeNode root) {
//        log.info("root : {}", root);
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
//        log.info("leftMaxDepth : {}", leftMaxDepth);
        int rightMaxDepth = maxDepth(root.right);
//        log.info("rightMaxDepth : {}", rightMaxDepth);

        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }

    /**
     * https://www.geeksforgeeks.org/iterative-method-to-find-height-of-binary-tree/
     */
    public int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int height = 0;
//        while (!queue.isEmpty()) {
//
//        }
        return height;
    }
}
