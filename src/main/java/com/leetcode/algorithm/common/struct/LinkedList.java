package com.leetcode.algorithm.common.struct;

/**
 * https://freestrokes.tistory.com/84
 */
public class LinkedList {
    public ListNode head;

    public LinkedList() {
        head = null;    // head 노드 초기화
    }

    /**
     * Time Complexity : O(N)
     *
     * Algorithm :
     * 1. 새로운 노드 생성(val)
     * 2. tempNode가 head를 가리키도록 하고 tempNode가 마지막 노드까지 iterate함
     * 3. 마지막 노드에서 .next가 새로운 노드로 연결시킴
     */
    public void insertNode(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            this.head = newNode;
        } else {
            ListNode tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }
}
