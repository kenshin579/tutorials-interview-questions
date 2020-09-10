package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.ListNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 */
@Slf4j
public class MergeTwoLists {
    /**
     * Time Complexity :
     *
     * Algorithm :
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                result = new ListNode(l1.val);

            }
        }
        return null;
    }
}
