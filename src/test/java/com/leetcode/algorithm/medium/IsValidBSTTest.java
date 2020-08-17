package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.BinaryTree;
import com.leetcode.algorithm.common.util.BinaryTreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class IsValidBSTTest {

    @Test
    public void isValidBST() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(2, 1, 3));
        assertThat(new IsValidBST().isValidBST(binaryTree.root)).isTrue();
    }

    @Test
    public void isValidBST2() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(5, 1, 4, null, null, 3, 6));
        assertThat(new IsValidBST().isValidBST(binaryTree.root)).isFalse();
    }
}