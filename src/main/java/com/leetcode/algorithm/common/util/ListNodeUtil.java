package com.leetcode.algorithm.common.util;

import com.leetcode.algorithm.common.struct.ListNode;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Integer> convertToList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result;
    }
}
