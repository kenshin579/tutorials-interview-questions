package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 111. Minimum Depth of Binary Tree
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
     * - 아이디어는 MaxDepth랑 비슷함
     *
     * todo: depth 정의는 아래와 같지만, 코딩에서는 좀 차이가 나는 듯함 - 이건 잘 이해가 안됨)
     * FAQ
     * * 1. height와 depth의 차이는 뭔가?
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
            log.info("case1");
            return 0;
        }

        //root 하나만 있는 경우
        if (root.left == null && root.right == null) {
            log.info("case2");
            return 1;
        }

        if (root.left == null) {
            log.info("case3");
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            log.info("case4");
            return minDepth(root.left) + 1;
        }

        int minLeftDepth = minDepth(root.left);
        log.info("minLeftDepth : {}", minLeftDepth);
        int minRightDepth = minDepth(root.right);
        log.info("minRightDepth : {}", minRightDepth);

        log.info("case5");
        return Math.min(minLeftDepth, minRightDepth) + 1;
    }

}
