package com.leetcode.algorithm.common.util;

import com.leetcode.algorithm.common.struct.ListNode;

public final class ListNodeUtil {

    public static void print(ListNode head) {
        ListNode tempNode = head;

        while (tempNode != null) {
            System.out.print(tempNode.val);
            if (tempNode.next != null)
                System.out.print(" -> ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
