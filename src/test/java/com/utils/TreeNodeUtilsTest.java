package com.utils;

import com.leetcode.algorithm.common.struct.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class TreeNodeUtilsTest {

    @Test
    public void getPreOrderListFromTreeNode() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        assertThat(TreeNodeUtils.getPreOrderListFromTreeNode(root))
                .isEqualTo(Arrays.asList(2, 1, 3));
    }
}