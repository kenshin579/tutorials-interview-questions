package com.leetcode.algorithm.common.util;

import com.leetcode.algorithm.common.struct.BinarySearchTree;

import java.util.List;

public class BinarySearchTreeUtil {
    public static BinarySearchTree generateBinaryTree(List<Integer> list) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        list.forEach(binarySearchTree::add);
        return binarySearchTree;
    }
}
