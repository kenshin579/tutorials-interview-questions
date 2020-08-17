package com.hackerrank.common.util;

import com.hackerrank.common.struct.BinaryTree;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BinaryTreeUtil {
    public static BinaryTree generateBinaryTree(List<Integer> list) {
        BinaryTree binaryTree = new BinaryTree();
        list.forEach(x -> binaryTree.insert(binaryTree.root, x));
        return binaryTree;
    }
}
