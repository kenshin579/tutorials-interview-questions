package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.ListNode;
import lombok.extern.slf4j.Slf4j;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 * https://leetcode.com/problems/reverse-linked-list/
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/lq2j
 */
@Slf4j
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode tempNode;

        while (currNode != null) {
            tempNode = currNode.next;

            currNode.next = prevNode;
            prevNode = currNode;
            currNode = tempNode;
        }
        return prevNode;
    }
}
