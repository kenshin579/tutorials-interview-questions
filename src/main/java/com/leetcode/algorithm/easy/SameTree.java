package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;

/**
 * 100. Same Tree
 * Difficulty : Easy
 * Tags : Tree
 *
 * https://leetcode.com/problems/same-tree/
 *
 */
class SameTree {
    /**
     * Time complexity: O(N)
     * ==> T(N) = 2T(N/2) + 1
     *
     * Algorithm :
     * The function recursively calls itself to check down the branches of a TreeNode, checking until the nodes are
     * null, at which point they return true.
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {  // If both branches' current objects are null, pass check for that branch
            return true;
        }
        else if ((p != null && q !=null) && p.val == q.val) {
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            
            return left && right;  // Return result of check of next branches
        }
        return false;  // If values aren't equal return false
    }
}
