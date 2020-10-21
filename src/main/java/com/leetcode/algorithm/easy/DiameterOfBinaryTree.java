package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.utils.TreeNodeUtils;
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
        int leftHeight = TreeNodeUtils.height(root.left);
        int rightHeight = TreeNodeUtils.height(root.right);
        log.info("1.{}:{}", leftHeight, rightHeight);

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        log.info("2.{}:{}", leftDiameter, rightDiameter);
        int max = Math.max(leftHeight + rightHeight + 1, //root를 지나가는 경우
                Math.max(leftDiameter, rightDiameter)); //root를 지나가지 않는 경우
        log.info("max = {} ({}:{})", max, leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));

        return max;
    }
}
