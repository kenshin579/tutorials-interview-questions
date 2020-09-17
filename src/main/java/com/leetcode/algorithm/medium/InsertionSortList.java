package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.ListNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 147. Insertion Sort List
 * Difficulty : Medium
 * Tags : LinkedList
 *
 * https://leetcode.com/problems/insertion-sort-list/
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *
 * https://leetcode.com/problems/insertion-sort-list/discuss/812288/Clean-Java-solution-EASY-to-understand
 * }
 */
@Slf4j
public class InsertionSortList {
    /**
     * todo : 이해가 잘 안됨
     * Time Complexity :
     * <p>
     * Algorithm :
     */
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);

        while (head != null) {
            ListNode node = dummy;
            while (node.next != null && node.next.val < head.val) {
                node = node.next;
            }

            ListNode temp = head.next;
            head.next = node.next;
            node.next = head;
            head = temp;
        }

        return dummy.next;
    }
}
