package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.BinaryTree;
import com.leetcode.algorithm.common.util.BinaryTreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

@Slf4j
public class MaxDepthTest {

    @Test
    public void maxDepth() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(1));
        binaryTree.print();

//        log.info("{}", BinaryTreeUtil.generateBinaryTree(Arrays.asList(5, 2, 7, 8, 6)));

    }
}