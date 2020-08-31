package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 112. Path Sum
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
 * https://leetcode.com/problems/path-sum/discuss/816992/Simple-recursive-solution-wvideo-whiteboard-explanation
 */
@Slf4j
public class PathSum {
    /**
     * Time Complexity : todo: O(??)
     * Algorithm :DFS
     * - Subproblem 찾기 : 문제를 더 작게 만들기 위해서 sum에서 현재 노드의 값을 빼면서 recursive하게 호출함
     * - Base 케이스는 root가 null일 때는 faslse 이고 sum이 현재 값과 같은 경우에는 true를 반환하도록 함
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        log.info("root : {}, sum : {}", root, sum);

        if (root == null) {
            log.info("false");
            return false;
        }

        if (sum == root.val && root.left == null && root.right == null) {
            log.info("true");
            return true;
        }

        boolean left = hasPathSum(root.left, sum - root.val);
        log.info("left : {}", left);
        boolean right = hasPathSum(root.right, sum - root.val);
        log.info("right : {}", right);
        return left || right;
    }
}
