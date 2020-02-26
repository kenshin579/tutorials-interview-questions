package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.LinkedList;
import com.leetcode.algorithm.common.util.LinkedListUtil;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleNodeTest {

    @Test
    public void middleNode() {
        LinkedList linkedList = LinkedListUtil.generateLinkedListSample(5);
        linkedList.printList();
        assertThat(new MiddleNode().middleNode(linkedList.head).val).isEqualTo(3);
    }

    @Test
    public void middleNode2() {
        LinkedList linkedList = LinkedListUtil.generateLinkedListSample(2);
        linkedList.printList();

        assertThat(new MiddleNode().middleNode(linkedList.head).val).isEqualTo(2);
    }
}