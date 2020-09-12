package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.ListNode;
import com.leetcode.algorithm.common.util.ListNodeUtil;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeTwoListsTest {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        ListNode l2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));

        ListNode result = new MergeTwoLists().mergeTwoLists(l1, l2);
        assertListNode(result, 6);

    }

    @Test
    public void mergeTwoLists2() {
        ListNode l1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        ListNode l2 = new ListNode(1,
                new ListNode(3));

        ListNode result = new MergeTwoLists().mergeTwoLists(l1, l2);
        assertListNode(result, 5);
    }

    @Test
    public void mergeTwoLists3() {
        ListNode l1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        ListNode l2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(6))));

        ListNode result = new MergeTwoLists().mergeTwoLists(l1, l2);
        assertListNode(result, 7);
    }

    @Test
    public void mergeTwoLists4() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        ListNode result = new MergeTwoLists().mergeTwoLists(l1, l2);
        assertListNode(result, 2);
    }

    @Test
    public void mergeTwoLists5() {
        ListNode l1 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(6))));

        ListNode result = new MergeTwoLists().mergeTwoLists(l1, null);
        assertListNode(result, 4);
    }

    @Test
    public void mergeTwoLists6() {
        ListNode l2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(6))));

        ListNode result = new MergeTwoLists().mergeTwoLists(null, l2);
        assertListNode(result, 4);
    }

    private void assertListNode(ListNode head, int totalSize) {
        List<Integer> intValues = ListNodeUtil.convertToList(head);

        assertThat(intValues.size()).isEqualTo(totalSize);
        assertThat(intValues).isNotEmpty();
        assertThat(intValues).isSorted();
    }
}