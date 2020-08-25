package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;

/**
 * todo : bfs로 해결해보기
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * https://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
 */
public class MinDepth {
    /**
     * Time Complexity : O(N)
     * ==> O(N) = 2T(N/2) + 1
     *
     * Algorithm : todo : 알고리즘 스터디 다시 리뷰하기
     *
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        //root 하나만 있는 경우
        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        int minLeftDepth = minDepth(root.left);
        int minRightDepth = minDepth(root.right);

        return Math.min(minLeftDepth, minRightDepth) + 1;
    }

}
