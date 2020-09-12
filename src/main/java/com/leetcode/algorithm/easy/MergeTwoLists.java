package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.ListNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 */
@Slf4j
public class MergeTwoLists {
    /**
     * Time Complexity : O(N+M)
     * <p>
     * Algorithm :
     * 1. l1, l2의 값을 비교해서 result listNode에 하나씩 추가한다
     * 2. l1, l2 남아 있는 부분을 추가하도록 함
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode current = null;
        ListNode result = null;

        while (l1 != null && l2 != null) {
            log.info("l1.val:{}, l2.val:{}", l1.val, l2.val);
            if (l1.val <= l2.val) {
                log.info("case1");
                if (current == null) {
                    current = new ListNode(l1.val);
                    result = current;
                } else {
                    current.next = new ListNode(l1.val);
                    current = current.next;
                }
                l1 = l1.next;
            } else {
                log.info("case2");
                if (current == null) {
                    current = new ListNode(l2.val);
                    result = current;
                } else {
                    current.next = new ListNode(l2.val);
                    current = current.next;
                }
                l2 = l2.next;
            }
            if (result == null) {
                result = current;
            }
            log.info("result : {}", result);
            System.out.println();

        }

        while (l1 != null) {
            if (current == null) {
                current = new ListNode(l1.val);
                result = current;
            } else {
                current.next = new ListNode(l1.val);
                current = current.next;
            }
            l1 = l1.next;
        }

        while (l2 != null) {
            if (current == null) {
                current = new ListNode(l2.val);
                result = current;
            } else {
                current.next = new ListNode(l2.val);
                current = current.next;
            }
            l2 = l2.next;
        }

        return result;
    }
}
