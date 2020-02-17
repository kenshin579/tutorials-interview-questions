package com.leetcode.algorithm.medium;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList = null;

        while (l1.next != null) {
            sumList = new ListNode(l1.val + l2.val);
            l1 = l1.next;
        }

        return new ListNode(l1.val + l2.val);
    }
}
