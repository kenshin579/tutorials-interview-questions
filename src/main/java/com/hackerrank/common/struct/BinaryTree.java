package com.hackerrank.common.struct;

import com.hackerrank.common.util.BTreePrinter;

public class BinaryTree {
    public Node root;

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public void print() {
        BTreePrinter.printNode(root);
    }
}
