package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

/**
 * 112. Path Sum
 * Difficulty : Easy
 * Tags : Tree
 * <p>
 * https://leetcode.com/problems/path-sum/
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 * <p>
 * <p>
 * https://leetcode.com/problems/path-sum/
 * https://leetcode.com/problems/path-sum/discuss/816992/Simple-recursive-solution-wvideo-whiteboard-explanation
 * https://www.programcreek.com/2013/01/leetcode-path-sum/
 */
@Slf4j
public class PathSum {
    /**
     * Time Complexity : O(N)
     * ==> T(N) = 2T(N/2) + 1
     * <p>
     * Algorithm :DFS
     * - Subproblem 찾기 : 문제를 더 작게 만들기 위해서 sum에서 현재 노드의 값을 빼면서 recursive하게 호출함
     * - Base 케이스는 root가 null일 때는 false 이고 sum이 현재 값과 같은 경우에는 true를 반환하도록 함
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        log.info("root : {}, sum : {}", root, sum);

        if (root == null) {
            return false;
        }

        if (sum == root.val && root.left == null && root.right == null) {
            return true;
        }

        boolean left = hasPathSum(root.left, sum - root.val);
        boolean right = hasPathSum(root.right, sum - root.val);
        log.info("left : {} right : {}", left, right);
        return left || right;
    }

    /**
     * Time Complexity : O(N)
     * <p>
     * Algorithm : BFS
     * 1. node를 queue에 넣으면서 travers한다
     * - traverse할 때 현재 sum을 sums에 기록해둔다
     * 2. node을 queue에 꺼낼 때 sum도 같이 꺼내서 현재 sum과 currentNode.val의 합이 target sum과 같은 경우에 true를 반환한다
     * nodes : [5, 4, 8, 11, 13, 4, 7, 2]
     * sums : [0, 5, 5, 9, 13, 13, 20, 20]
     */
    public boolean hasPathSum2(TreeNode root, int sum) {
        log.info("root : {}, sum : {}", root, sum);
        if (root == null) {
            return false;
        }

        LinkedList<TreeNode> nodes = new LinkedList<>();
        LinkedList<Integer> sums = new LinkedList<>();

        nodes.add(root);
        sums.add(0);
        TreeNode currentNode;
        Integer currentSum;

        while (!nodes.isEmpty()) {
            currentNode = nodes.poll();
            currentSum = sums.poll();
            log.info("currentSum : {} val : {}", currentSum, currentNode.val);
            currentSum = currentSum + currentNode.val;
            log.info("currentSum : {}", currentSum);

            if (currentNode.left == null && currentNode.right == null
                    && sum == currentSum) {
                return true;
            }

            if (currentNode.left != null) {
                nodes.add(currentNode.left);
                sums.add(currentSum);
            }

            if (currentNode.right != null) {
                nodes.add(currentNode.right);
                sums.add(currentSum);
            }

            log.info("nodes : {}", nodes);
            log.info("sums : {}", sums);
            System.out.println();
        }

        return false;
    }
}
