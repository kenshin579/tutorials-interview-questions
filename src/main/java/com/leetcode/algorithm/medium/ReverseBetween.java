package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.ListNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 92. Reverse Linked List II
 * Difficulty : Medium
 * Tags : LinkedList
 *
 * https://leetcode.com/problems/reverse-linked-list-ii/
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
@Slf4j
public class ReverseBetween {
    /**
     * Time Complexity : O(N)
     * <p>
     * Algorithm :
     * 1. 기존 reverseList를 동일함
     * 2. front -> [reverse List, tail] -> end
     * - 여기서 front 부분을 기억해두고 tail 부분을 기억해두고 나중에 연결시켬
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int index = 1;
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode;
        ListNode frontNode = null;
        ListNode endNode = null;
        ListNode tailNode = null;

        if (m == n) {
            return head;
        }

        while (currNode != null) {
            log.info("index : {} currNode.val: {}", index, currNode.val);
            if (index < m) {
                log.info("case1");
                if (index == m - 1) {
                    frontNode = currNode;
                }
                nextNode = currNode.next; //c의 다음 노드를 가리킴
                currNode = nextNode; //c(현재) -> n(다음)을 가리키도록 함
            } else if (index > n) {
                log.info("case2");
                endNode = currNode;
                break;
            } else {
                log.info("case3");
                nextNode = currNode.next; //c의 다음 노드를 가리킴
                currNode.next = prevNode; //c -> p를 reverse하게 가리키도록 함
                if (prevNode == null) {
                    tailNode = currNode;
                }
                //다음 step을 위해서
                prevNode = currNode; //p(전노드) -> c(현재)를 가리키도록 함
                currNode = nextNode; //c(현재) -> n(다음)을 가리키도록 함
            }
            index++;
        }

        //front -> reverse -> end 연결하기
        if (frontNode != null) {
            frontNode.next = prevNode;
        }

        if (endNode != null) {
            tailNode.next = endNode;
        }

        return frontNode == null ? prevNode : head;
    }
}
