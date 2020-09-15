package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.LinkedList;
import com.leetcode.algorithm.common.struct.ListNode;
import com.leetcode.algorithm.common.util.LinkedListUtil;
import com.leetcode.algorithm.common.util.ListNodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class ReverseListTest {

    @Test
    public void reverseList() {
        LinkedList linkedList = LinkedListUtil.convertLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        ListNodeUtil.print(linkedList.head);

        ListNode result = new ReverseList().reverseList(linkedList.head);
        ListNodeUtil.print(result);
        List<Integer> values = ListNodeUtil.convertToList(result);
        assertThat(values).isEqualTo(Arrays.asList(5, 4, 3, 2, 1));
    }

    @Test
    public void reverseList2() {
        LinkedList linkedList = LinkedListUtil.convertLinkedList(Arrays.asList(1, 2));
        ListNodeUtil.print(linkedList.head);

        ListNode result = new ReverseList().reverseList(linkedList.head);
        ListNodeUtil.print(result);
        List<Integer> values = ListNodeUtil.convertToList(result);
        assertThat(values).isEqualTo(Arrays.asList(2, 1));
    }
}