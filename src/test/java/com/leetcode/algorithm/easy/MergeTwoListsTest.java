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
        assertListNode(result);

    }

    private void assertListNode(ListNode head) {
        List<Integer> intValues = ListNodeUtil.convertToList(head);

        assertThat(intValues).isNotEmpty();
        assertThat(intValues).isSorted();
    }
}