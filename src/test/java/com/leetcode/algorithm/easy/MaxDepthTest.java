package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.BinaryTree;
import com.leetcode.algorithm.common.util.BinaryTreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class MaxDepthTest {

    @Test
    public void maxDepth1() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        binaryTree.print();

        assertThat(new MaxDepth().maxDepth(binaryTree.root)).isEqualTo(3);
    }

    @Test
    public void maxDepth2() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList());
        binaryTree.print();

        assertThat(new MaxDepth().maxDepth(binaryTree.root)).isEqualTo(0);
    }

    @Test
    public void maxDepth3() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(5, 2));
        binaryTree.print();

        assertThat(new MaxDepth().maxDepth(binaryTree.root)).isEqualTo(2);
    }
}