package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BuildTreeTest {

    @Test
    public void buildTree() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode result = null;

        assertThat(new BuildTree().buildTree(inorder, postorder)).isEqualTo(result);

    }
}