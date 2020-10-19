package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 107. Binary Tree Level Order Traversal II
 * Difficulty : Easy
 * Tags : Tree
 * <p>
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 * <p>
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
 *
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/discuss/881546/My-Java-DFS-SOlution-and-BFS-Solution
 */
@Slf4j
public class LevelOrderBottom {
    /**
     * Time Complexity : O(N)
     * <p>
     * Algorithm : BFS 방식으로 level 단위로 traversal하기 위해 queue를 사용함
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
//                log.info("current.val : {}", current.val);

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
                result.add(0, subResult);
        }


        return result;
    }

    public List<List<Integer>> levelOrderBottomDFS(TreeNode root) {
        return null;
    }
}
