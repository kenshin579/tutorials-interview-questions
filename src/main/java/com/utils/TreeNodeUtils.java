package com.utils;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.medium.PreorderTraversal;

import java.util.List;

public final class TreeNodeUtils {
    public static List<Integer> getPreOrderListFromTreeNode(TreeNode root) {
        return new PreorderTraversal().preorderTraversal(root);
    }

    public static int height(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
