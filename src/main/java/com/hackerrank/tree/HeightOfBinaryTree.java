package com.hackerrank.tree;

import com.hackerrank.common.struct.Node;
import lombok.extern.slf4j.Slf4j;

/**
 * 높이(height) : 루트 노드에서 가장 깊숙히 있는 노드의 깊이
 *
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 * https://tutorialspoint.dev/data-structure/graph-data-structure/roots-tree-gives-minimum-height
 */
@Slf4j
public class HeightOfBinaryTree {
    /**
     * https://stackoverflow.com/questions/2597637/finding-height-in-binary-search-tree
     */
    public static int height(Node root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;
    }
}
