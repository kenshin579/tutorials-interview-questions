package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.LinkedList;
import com.leetcode.algorithm.common.struct.ListNode;
import com.leetcode.algorithm.common.util.LinkedListUtil;
import com.leetcode.algorithm.common.util.ListNodeUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseBetweenTest {

    @Test
    public void reverseBetween() {
        LinkedList linkedList = LinkedListUtil.convertLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        ListNodeUtil.print(linkedList.head);

        ListNode result = new ReverseBetween().reverseBetween(linkedList.head, 2, 4);
        ListNodeUtil.print(result);
        List<Integer> values = ListNodeUtil.convertToList(result);
        assertThat(values).isEqualTo(Arrays.asList(1, 4, 3, 2, 5));
    }

    @Test
    public void reverseBetween2() {
        LinkedList linkedList = LinkedListUtil.convertLinkedList(Arrays.asList(5));
        ListNodeUtil.print(linkedList.head);

        ListNode result = new ReverseBetween().reverseBetween(linkedList.head, 1, 1);
        ListNodeUtil.print(result);
        List<Integer> values = ListNodeUtil.convertToList(result);
        assertThat(values).isEqualTo(Arrays.asList(5));
    }

    @Test
    public void reverseBetween3() {
        LinkedList linkedList = LinkedListUtil.convertLinkedList(Arrays.asList(3, 5));
        ListNodeUtil.print(linkedList.head);

        ListNode result = new ReverseBetween().reverseBetween(linkedList.head, 1, 2);
        ListNodeUtil.print(result);
        List<Integer> values = ListNodeUtil.convertToList(result);
        assertThat(values).isEqualTo(Arrays.asList(5, 3));
    }
}