package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.ListNode;
import org.junit.Test;

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
    }
}