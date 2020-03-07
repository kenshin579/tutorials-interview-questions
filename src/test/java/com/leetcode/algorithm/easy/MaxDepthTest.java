package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.BinarySearchTree;
import com.leetcode.algorithm.common.util.BinarySearchTreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class MaxDepthTest {

    @Test
    public void maxDepth1() {
        BinarySearchTree binarySearchTree = BinarySearchTreeUtil.generateBinaryTree(Arrays.asList(5, 2, 7, 8, 6));
        binarySearchTree.print();

        assertThat(new MaxDepth().maxDepth(binarySearchTree.root)).isEqualTo(3);
    }

    @Test
    public void maxDepth2() {
        BinarySearchTree binarySearchTree = BinarySearchTreeUtil.generateBinaryTree(Arrays.asList());
        binarySearchTree.print();

        assertThat(new MaxDepth().maxDepth(binarySearchTree.root)).isEqualTo(0);
    }

    @Test
    public void maxDepth3() {
        BinarySearchTree binarySearchTree = BinarySearchTreeUtil.generateBinaryTree(Arrays.asList(5, 2));
        binarySearchTree.print();

        assertThat(new MaxDepth().maxDepth(binarySearchTree.root)).isEqualTo(2);
    }
}