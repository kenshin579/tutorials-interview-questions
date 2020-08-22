package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.LinkedList;
import com.leetcode.algorithm.common.struct.ListNode;
import com.leetcode.algorithm.common.util.LinkedListUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class ReverseListTest {

    @Test
    public void reverseList() {
        LinkedList linkedList = LinkedListUtil.generateLinkedListSample(Arrays.asList(1, 2, 3, 4, 5));
        linkedList.printList();

        ListNode tempNode = new ReverseList().reverseList(linkedList.getHead());
        int count = 5;
        while (tempNode != null) {
            assertThat(tempNode.val).isEqualTo(count--);
            tempNode = tempNode.next;
        }
    }
}