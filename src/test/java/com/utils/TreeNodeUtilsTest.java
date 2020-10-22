package com.utils;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
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

    @Test
    public void height() {
        TreeNode root = new TreeNode(1);

        assertThat(TreeNodeUtils.height(root)).isEqualTo(0);
    }

    @Test
    public void height2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                null);

        assertThat(TreeNodeUtils.height(root)).isEqualTo(1);
    }

    @Test
    public void height3() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        BTreePrinter.printNode(root);

        assertThat(TreeNodeUtils.height(root)).isEqualTo(1);
    }

    @Test
    public void height4() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null,
                        new TreeNode(4)),
                new TreeNode(3));

        BTreePrinter.printNode(root);

        assertThat(TreeNodeUtils.height(root)).isEqualTo(2);
    }

    @Test
    public void height5() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                null),
                        null),
                null);

        BTreePrinter.printNode(root);

        assertThat(TreeNodeUtils.height(root)).isEqualTo(3);
    }
}