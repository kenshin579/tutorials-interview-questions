package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class MaxDepthTest {

    @Test
    public void maxDepth1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        BTreePrinter.printNode(root);

        assertThat(new MaxDepth().maxDepth(root)).isEqualTo(3);
//        assertThat(new MaxDepth().maxDepthBFS(root)).isEqualTo(3);
    }

    @Test
    public void maxDepth2() {
        assertThat(new MaxDepth().maxDepth(null)).isEqualTo(0);
    }

    @Test
    public void maxDepth3() {
        TreeNode root = new TreeNode(5,
                new TreeNode(7),
                null);
        BTreePrinter.printNode(root);

        assertThat(new MaxDepth().maxDepth(root)).isEqualTo(2);
    }

    @Test
    public void maxDepth4() {
        TreeNode root = new TreeNode(5);
        BTreePrinter.printNode(root);

        assertThat(new MaxDepth().maxDepth(root)).isEqualTo(1);
    }
}