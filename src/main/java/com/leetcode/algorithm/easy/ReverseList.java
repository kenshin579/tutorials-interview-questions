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
        ListNode tempNode;
        ListNode reverseNode = head;
        ListNode traverseNode = head;

        if (traverseNode != null)
            traverseNode = traverseNode.next;
        if (reverseNode != null)
            reverseNode.next = null;

        while (traverseNode != null) {
            tempNode = new ListNode(traverseNode.val);
            tempNode.next = reverseNode;
            reverseNode = tempNode;
            traverseNode = traverseNode.next;
        }
        return reverseNode;
    }
}
