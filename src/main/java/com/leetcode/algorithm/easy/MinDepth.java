package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * https://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
 */
@Slf4j
public class MinDepth {
    /**
     * Time Complexity : O(N)
     * ==> O(N) = 2T(N/2) + 1
     *
     * Algorithm : DFS - root에서 leaves까지 traverse해서 계산해야 하기 때문에
     * 1.
     * 2.
     *
     * FAQ
     * 1. height와 depth의 차이는 뭔가?
     * - height : the number of edges on the longest path from the node to the leaf
     * - depth : number of edges from the node to the root node
     * (ex. leaf node => height 0, depth 3
     * root => height 3, depth 0)
     * 참고
     * - https://stackoverflow.com/questions/2603692/what-is-the-difference-between-tree-depth-and-height
     * - https://www.baeldung.com/cs/tree-depth-height-difference
     */
    public int minDepth(TreeNode root) {
        log.info("root : {}", root);
        if (root == null) {
            return 0;
        }
//
//        //root 하나만 있는 경우
//        if (root.left == null && root.right == null) {
//            return 1;
//        }
//
//        if (root.left == null) {
//            return minDepth(root.right) + 1;
//        }
//        if (root.right == null) {
//            return minDepth(root.left) + 1;
//        }

        int minLeftDepth = minDepth(root.left);
        log.info("minLeftDepth : {}", minLeftDepth);
        int minRightDepth = minDepth(root.right);
        log.info("minRightDepth : {}", minRightDepth);

        return Math.min(minLeftDepth, minRightDepth) + 1;
    }

}
