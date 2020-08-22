package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.BinaryTree;
import com.leetcode.algorithm.common.struct.LinkedList;
import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SortedListToBSTTest {

    @Test
    public void sortedListToBST() {
        int[] head = {-10, -3, 0, 5, 9};
        LinkedList linkedList = setAndGetLinkedList(head);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(-10);
        binaryTree.add(-3);
        binaryTree.add(0);
        binaryTree.add(5);
        binaryTree.add(9);
        binaryTree.print();

        TreeNode treeNode = new SortedListToBST().sortedListToBST(linkedList.getHead());
//        assertThat(treeNode).isEqualTo(binaryTree.getRoot());
        log.info("");

    }

    private LinkedList setAndGetLinkedList(int[] head) {
        LinkedList linkedList = new LinkedList();
        for (int x : head) {
            linkedList.insertNode(x);
        }
        return linkedList;
    }
}
