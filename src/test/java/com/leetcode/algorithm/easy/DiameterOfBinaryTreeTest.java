package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiameterOfBinaryTreeTest {

    @Test
    public void diameterOfBinaryTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3));

        BTreePrinter.printNode(root);
        assertThat(new DiameterOfBinaryTree().diameterOfBinaryTree(root)).isEqualTo(3);
    }

    @Test
    public void diameterOfBinaryTree2() {
        assertThat(new DiameterOfBinaryTree().diameterOfBinaryTree(null)).isEqualTo(0);
    }
}