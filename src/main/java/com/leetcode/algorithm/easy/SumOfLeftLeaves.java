package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 404. Sum of Left Leaves
 * https://leetcode.com/problems/sum-of-left-leaves/
 * https://leetcode.com/problems/sum-of-left-leaves/discuss/808901/100-Faster-or-3-Solutions-or-Recursive-DFS-or-Iterative-BFS-or-Ugly-1-Liner
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
 */
@Slf4j
public class SumOfLeftLeaves {
    /**
     * Time Complexity : O(N)
     * ==> T(N) = 2T(N/2) + 1
     * <p>
     * Algorithm : DFS
     * 1. tree를 DFS 방식으로 traversal를 함
     * - traversal할 때 isLeftNode라는 boolean 값을 넘겨줘서 해당 node가 leftNode인지를 알려줌
     * 2. 현재 로드에서 left, right가 null이면 leave 노드여서 이 값을 반환함
     */
    public int sumOfLeftLeavesDFS(TreeNode root) {
        if (root == null)
            return 0;

        int leftSum = sumOfLeftLeavesDFS(root.left, true);
        int rightSum = sumOfLeftLeavesDFS(root.right, false);
        log.info("leftSum1 : {}", leftSum);
        log.info("rightSum1 : {}", rightSum);
        return leftSum + rightSum;
    }

    private int sumOfLeftLeavesDFS(TreeNode current, boolean isLeftNode) {
        //base case
        if (current == null)
            return 0;

        if (current.left == null && current.right == null && isLeftNode)
            return current.val;

        int leftSum = sumOfLeftLeavesDFS(current.left, true);
        int rightSum = sumOfLeftLeavesDFS(current.right, false);
        log.info("leftSum2 : {}", leftSum);
        log.info("rightSum2: {}", rightSum);
        return leftSum + rightSum;
    }

    /**
     * Time Complexity : O(N)
     * <p>
     * Algorithm : Stack을 사용한다
     * 1. Stack을 사용해서 node를 traversal함
     * 2. 각 노드에서 leftNode가 leafNode이면 sum에 값을 더하고 stack에는 추가하지 않음
     *
     */
    public int sumOfLeftLeavesBFS(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode current;
        stack.push(root);
        int sum = 0;

        while (!stack.isEmpty()) {
            current = stack.pop();
            log.info("current : {} sum : {}", current, sum);

            if (current.left != null) {
                //left leave node인지 체크
                if (current.left.left == null
                        && current.left.right == null) {
                    sum += current.left.val;
                } else {
                    stack.push(current.left);
                }
            }

            if (current.right != null) {
                stack.push(current.right);
            }
        }
        return sum;
    }

}
