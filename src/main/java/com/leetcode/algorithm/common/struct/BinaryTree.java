package com.leetcode.algorithm.common.struct;

import com.leetcode.algorithm.common.util.BTreePrinter;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://stackoverflow.com/questions/32223123/inserting-elements-in-binary-tree-in-java
 * https://www.geeksforgeeks.org/bfs-vs-dfs-binary-tree/
 */
@Slf4j
public class BinaryTree {
    private TreeNode root;

    /**
     * BFS 방식으로 추가함
     *
     * @param value
     */
    public void add(Integer value) {
        if (root == null) {
            root = new TreeNode(value);
            return;
        }

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        TreeNode currNode;
        while (true) {
            currNode = treeNodeQueue.poll();
            if (currNode.left == null) {
                currNode.left = new TreeNode(value);
                return;
            }
            if (currNode.right == null) {
                currNode.right = new TreeNode(value);
                return;
            }
            treeNodeQueue.add(currNode.left);
            treeNodeQueue.add(currNode.right);
        }
    }

    public void print() {
        BTreePrinter.printNode(root);
    }

    public TreeNode getRoot() {
        return root;
    }
}
