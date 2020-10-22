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
     * Algorithm : 트리의 지름의 최대 값은 아래 2가지 케이스로 나뉜다
     * Case1. root를 포함하는 경우
     * - leftDepth + rightDepth를 합치면 된다
     * Case2. root를 포함하지 않는 경우
     * - 왼쪽, 오른쪽 중에 최대 값이 있다
     * 최종 : Case1, Case2의 값중에 최대 값을 반환하면 된다
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
//        log.info("  1 ==> lh{}:rh{}", leftHeight, rightHeight);

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
//        log.info("  2 ==> ld:{}:rd{}", leftDiameter, rightDiameter);

        int max = Math.max(leftHeight + rightHeight, //root를 지나가는 경우
                Math.max(leftDiameter, rightDiameter)); //root를 지나가지 않는 경우
//        log.info("max = {} ({}:max:{})", max, leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));

        return max;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);

        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}
