package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinDepthTest {

    @Test
    public void minDepth() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        BTreePrinter.printNode(root);

        assertThat(new MaxDepth().maxDepth(root)).isEqualTo(2);
    }

    @Test
    public void minDepth2() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2));
        BTreePrinter.printNode(root);

        assertThat(new MinDepth().minDepth(root)).isEqualTo(2);
    }

    @Test
    public void minDepth3() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                null);
        BTreePrinter.printNode(root);

        assertThat(new MinDepth().minDepth(root)).isEqualTo(2);
    }

    @Test
    public void minDepth4() {
        assertThat(new MinDepth().minDepth(null)).isEqualTo(0);
    }

    @Test
    public void minDepth5() {
        TreeNode root = new TreeNode(1);
        BTreePrinter.printNode(root);
        assertThat(new MinDepth().minDepth(root)).isEqualTo(1);
    }
}