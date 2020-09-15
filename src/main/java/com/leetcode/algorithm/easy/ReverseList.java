package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.ListNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/lq2j
 */
@Slf4j
public class ReverseList {
    /**
     * Time Complexity : O(N)
     *
     * Algorithm :
     * 1.currNode로 List를 iterate한다
     * 2.3가지 노드 prev, curr, next 노드를 가지고 4단계 step으로 reverse하는 과정을 거킨다
     */
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode;

        while (currNode != null) {
            nextNode = currNode.next; //c의 다음 노드를 가리킴
            currNode.next = prevNode; //c -> p를 reverse하게 가리키도록 함

            //다음 step을 위해서
            prevNode = currNode; //p(전노드) -> c(현재)를 가리키도록 함
            currNode = nextNode; //c(현재) -> n(다음)을 가리키도록 함
        }
        return prevNode;
    }
}
