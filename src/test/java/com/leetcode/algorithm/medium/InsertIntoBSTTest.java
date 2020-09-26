package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
import com.utils.TreeNodeUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertIntoBSTTest {

    @Test
    public void insertIntoBST() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7));

        BTreePrinter.printNode(root);

        TreeNode result = new InsertIntoBST().insertIntoBST(root, 5);
        BTreePrinter.printNode(result);

        assertThat(TreeNodeUtils.getPreOrderListFromTreeNode(result))
                .isEqualTo(Arrays.asList(4, 2, 1, 3, 7, 5));
    }

    @Test
    public void insertIntoBST2() {
        TreeNode root = null;

        BTreePrinter.printNode(root);

        TreeNode result = new InsertIntoBST().insertIntoBST(root, 5);
        BTreePrinter.printNode(result);

        assertThat(TreeNodeUtils.getPreOrderListFromTreeNode(result))
                .isEqualTo(Arrays.asList(5));

    }

    @Test
    public void insertIntoBST3() {
        TreeNode root = new TreeNode(4);

        BTreePrinter.printNode(root);

        TreeNode result = new InsertIntoBST().insertIntoBST(root, 2);
        BTreePrinter.printNode(result);

        assertThat(TreeNodeUtils.getPreOrderListFromTreeNode(result))
                .isEqualTo(Arrays.asList(4, 2));

    }
}