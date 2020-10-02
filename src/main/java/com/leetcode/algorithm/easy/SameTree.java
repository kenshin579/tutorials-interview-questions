package com.leetcode.algorithm.easy;

/**
 * 100. Same Tree
 * Difficulty : Easy
 * Tags : Tree
 *
 * https://leetcode.com/problems/same-tree/
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        else if ((p != null && q !=null) && p.val == q.val) {
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            
            return left && right;
        }
        return false;
    }
}
