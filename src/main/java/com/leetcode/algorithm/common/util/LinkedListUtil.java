package com.leetcode.algorithm.common.util;

import com.leetcode.algorithm.common.struct.LinkedList;

public final class LinkedListUtil {

    public static LinkedList generateLinkedList(int max) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < max; i++) {
            linkedList.insertNode(i + 1);
        }
        return linkedList;
    }
}
