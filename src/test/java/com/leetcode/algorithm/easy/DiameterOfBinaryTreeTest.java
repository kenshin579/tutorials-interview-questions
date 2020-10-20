package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
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

        assertThat(new DiameterOfBinaryTree().diameterOfBinaryTree(root)).isEqualTo(3);
    }
}