package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 543. Diameter of Binary Tree
 * Difficulty : Easy
 * Tags : Tree
 *
 * https://leetcode.com/problems/diameter-of-binary-tree/
 *
 * https://bonoogi.postype.com/post/7600170
 * https://www.youtube.com/watch?v=ey7DYc9OANo
 * https://www.youtube.com/watch?v=_O-mK2g_jhI
 */
@Slf4j
public class DiameterOfBinaryTree {
    /**
     * Time Complexity :
     * Algorithm :
     * 1.diameter를 계산
     * 2.diameter
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = new MaxDepth().maxDepth(root.left);
        int rightHeight = new MaxDepth().maxDepth(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        int max = Math.max(leftHeight + rightHeight + 1, //root를 지나가는 경우
                Math.max(leftDiameter, rightDiameter)); //root를 지나가지 않는 경우

        log.info("{}, {}", leftHeight, rightHeight);
        log.info("max = {} ({}, {})", max, leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));

        return max;
    }
}
