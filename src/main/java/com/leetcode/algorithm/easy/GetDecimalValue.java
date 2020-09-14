package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.ListNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *
 */
@Slf4j
public class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        ListNode tempNode = head;
        int nthCount = 0;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
            nthCount++;
        }

        tempNode = head;
        int decimalValue = 0;
        while (tempNode.next != null) {
            decimalValue += (int) (tempNode.val * Math.pow(2, nthCount));
            tempNode = tempNode.next;
            nthCount--;
        }
        decimalValue += tempNode.val;
        return decimalValue;
    }
}
