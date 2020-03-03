package com.leetcode.algorithm.common.struct;

/**
 * https://www.baeldung.com/java-binary-tree
 */
public class BinaryTree {
    TreeNode root;

    private TreeNode insertRecursive(TreeNode currNode, int value) {
        if (currNode == null)
            return new TreeNode(value);

        if (currNode.val < value) {
            currNode.left = insertRecursive(currNode, value);
        } else if (currNode.val > value) {
            currNode.right = insertRecursive(currNode, value);
        } else {
            return currNode;
        }
        return currNode;
    }

    public void add(int value) {
        root = this.insertRecursive(root, value);
    }

    public void print() {

    }
}
