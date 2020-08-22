package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.BinaryTree;
import com.leetcode.algorithm.common.util.BinaryTreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class IsBalancedTest {

    @Test
    public void test_isBalanced1() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        binaryTree.print();

        assertThat(new IsBalanced().isBalanced(binaryTree.getRoot())).isTrue();
    }

    @Test
    public void test_isBalanced2() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(1, 2, 2, 3, 3, null, null, 4, 4));
        binaryTree.print();
        assertThat(new IsBalanced().isBalanced(binaryTree.getRoot())).isFalse();
    }

    @Test
    public void test_isBalanced3() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(1));
        binaryTree.print();
        assertThat(new IsBalanced().isBalanced(binaryTree.getRoot())).isTrue();
    }

    @Test
    public void test_isBalanced4() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 9, 10));
        binaryTree.print();
        assertThat(new IsBalanced().isBalanced(binaryTree.getRoot())).isTrue();
    }

    @Test
    public void test_isBalanced5() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 9, null, 10));
        binaryTree.print();
        assertThat(new IsBalanced().isBalanced(binaryTree.getRoot())).isFalse();
    }

    @Test
    public void test_isBalanced6() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 9, null));
        binaryTree.print();
        assertThat(new IsBalanced().isBalanced(binaryTree.getRoot())).isFalse();
    }


}