package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.ListNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * Difficulty : Easy
 * Tags : LinkedList
 *
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 *
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
    /**
     * Time Complexity : O(N)
     *
     * Algorithm :
     * 1.ListNode의 size를 먼저 확인
     * 2.ListNode를 travserse하면서 size 크기 만큼 2^n을 해서 sum하면 된다
     */
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
