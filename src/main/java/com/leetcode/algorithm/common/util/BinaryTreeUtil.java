package com.leetcode.algorithm.common.util;

import com.leetcode.algorithm.common.struct.BinaryTree;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BinaryTreeUtil {
    public static BinaryTree generateBinaryTree(List<Integer> list) {
        BinaryTree binaryTree = new BinaryTree();
        list.forEach(binaryTree::add);
        return binaryTree;
    }
}
