package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class PreorderTraversalTest {

    @Test
    public void preorderTraversal() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5, new TreeNode(1), new TreeNode(7));
        root.right = new TreeNode(10, null, new TreeNode(12));

        assertThat(new PreorderTraversal().preorderTraversal(root))
                .isEqualTo(Arrays.asList(8, 5, 1, 7, 10, 12));
    }

    @Test
    public void preorderTraversalNonRecursive() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5, new TreeNode(1), new TreeNode(7));
        root.right = new TreeNode(10, null, new TreeNode(12));

        assertThat(new PreorderTraversal().preorderTraversalNonRecursive(root))
                .isEqualTo(Arrays.asList(8, 5, 1, 7, 10, 12));
    }
}