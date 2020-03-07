package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.BinaryTree;
import com.leetcode.algorithm.common.util.BinaryTreeUtil;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class MinDepthTest {

    @Test
    public void minDepth() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        binaryTree.print();
        assertThat(new MinDepth().minDepth(binaryTree.root)).isEqualTo(2);
    }

    @Test
    public void minDepth2() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(1, null, 2));
        binaryTree.print();
        assertThat(new MinDepth().minDepth(binaryTree.root)).isEqualTo(2);
    }

    @Test
    public void minDepth3() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(1, 2));
        binaryTree.print();
        assertThat(new MinDepth().minDepth(binaryTree.root)).isEqualTo(2);
    }

    @Test
    public void minDepth4() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList());
        binaryTree.print();
        assertThat(new MinDepth().minDepth(binaryTree.root)).isEqualTo(0);
    }

    @Test
    public void minDepth5() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(1));
        binaryTree.print();
        assertThat(new MinDepth().minDepth(binaryTree.root)).isEqualTo(1);
    }
}