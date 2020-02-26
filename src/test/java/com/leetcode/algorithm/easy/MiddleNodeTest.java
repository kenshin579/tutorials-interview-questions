package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.LinkedList;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleNodeTest {

    @Test
    public void middleNode() {
        LinkedList linkedList = this.generateLinkedList(5);
        linkedList.printList();
        assertThat(new MiddleNode().middleNode(linkedList.head).val).isEqualTo(3);
    }

    @Test
    public void middleNode2() {
        LinkedList linkedList = this.generateLinkedList(2);
        linkedList.printList();

        assertThat(new MiddleNode().middleNode(linkedList.head).val).isEqualTo(2);
    }

    private LinkedList generateLinkedList(int max) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < max; i++) {
            linkedList.insertNode(i + 1);
        }
        return linkedList;
    }
}