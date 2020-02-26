package com.leetcode.algorithm.common.struct;

/**
 * https://freestrokes.tistory.com/84
 */
public class LinkedList {
    public ListNode head;

    public LinkedList() {
        head = null;    // head 노드 초기화
    }

    public void insertNode(int data) {
        ListNode newNode = new ListNode(data);
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

    public void printList() {
        ListNode tempNode = this.head;    // tempNode에 head가 가리키는 첫번째 노드를 할당

        while (tempNode != null) {
            System.out.print(tempNode.val);
            if (tempNode.next != null)
                System.out.print(" -> ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
