package com.leetcode.algorithm.common.util;

import com.leetcode.algorithm.common.struct.BinaryTree;

import java.util.List;

public class BinaryTreeUtil {
    public static BinaryTree generateBinaryTree(List<Integer> list) {
        BinaryTree binaryTree = new BinaryTree();
        list.forEach(binaryTree::add);
        return binaryTree;
    }
}
