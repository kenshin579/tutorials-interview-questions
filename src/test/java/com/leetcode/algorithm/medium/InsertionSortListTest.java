package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.ListNode;
import com.leetcode.algorithm.common.util.ListNodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class InsertionSortListTest {

    @Test
    public void insertionSortList() {
        ListNode head = new ListNode(4,
                new ListNode(2,
                        new ListNode(1,
                                new ListNode(3))));

        ListNodeUtil.print(head);

        ListNode result = new InsertionSortList().insertionSortList(head);

        ListNodeUtil.print(result);
    }

    @Test
    public void insertionSortList2() {
        ListNode head = new ListNode(4);
        ListNodeUtil.print(head);

        ListNode result = new InsertionSortList().insertionSortList(head);
        ListNodeUtil.print(result);
        assertListNode(result);
    }

    @Test
    public void insertionSortList3() {
        ListNode head = new ListNode(4,
                new ListNode(2));
        ListNodeUtil.print(head);

        ListNode result = new InsertionSortList().insertionSortList(head);
        ListNodeUtil.print(result);
        assertListNode(result);
    }

    private void assertListNode(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }

        assertThat(result).isNotEmpty();
        assertThat(result).isSorted();
    }
}