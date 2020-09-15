package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.LinkedList;
import com.leetcode.algorithm.common.util.LinkedListUtil;
import com.leetcode.algorithm.common.util.ListNodeUtil;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleNodeTest {

    @Test
    public void middleNode() {
        LinkedList linkedList = LinkedListUtil.convertLinkedList(5);
        ListNodeUtil.print(linkedList.head);
        assertThat(new MiddleNode().middleNode(linkedList.head).val).isEqualTo(3);
    }

    @Test
    public void middleNode2() {
        LinkedList linkedList = LinkedListUtil.convertLinkedList(2);
        ListNodeUtil.print(linkedList.head);
        assertThat(new MiddleNode().middleNode(linkedList.head).val).isEqualTo(2);
    }
}