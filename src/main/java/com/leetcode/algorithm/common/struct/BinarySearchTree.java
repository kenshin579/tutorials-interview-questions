package com.leetcode.algorithm.common.struct;

import com.leetcode.algorithm.common.util.BTreePrinter;

/**
 * https://www.baeldung.com/java-binary-tree
 */
public class BinarySearchTree {
    public TreeNode root;

    private TreeNode insertRecursive(TreeNode currNode, int value) {
        if (currNode == null)
            return new TreeNode(value);

        if (value < currNode.val) {
            currNode.left = insertRecursive(currNode.left, value);
        } else if (value > currNode.val) {
            currNode.right = insertRecursive(currNode.right, value);
        }
        return currNode;
    }

    public void add(int value) {
        root = this.insertRecursive(root, value);
    }

    /**
     * https://prismoskills.appspot.com/lessons/Binary_Trees/Tree_printing.jsp
     * https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram
     */
    public void print() {
        BTreePrinter.printNode(root);
    }
}

