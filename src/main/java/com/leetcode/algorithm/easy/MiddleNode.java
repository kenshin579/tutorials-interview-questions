package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.ListNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 * <p>
 */
@Slf4j
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode tempNode = head;
        int count = 1;

        while (tempNode.next != null) {
            tempNode = tempNode.next;
            count++;
        }

        int middle = count / 2;
        log.info("count : {} {}", count, middle);
        count = 0;
        tempNode = head;
        while (tempNode.next != null && count < middle) {
            tempNode = tempNode.next;
            count++;
        }

        return tempNode;
    }
}
