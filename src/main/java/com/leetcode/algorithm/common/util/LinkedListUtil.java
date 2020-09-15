package com.leetcode.algorithm.common.util;

import com.leetcode.algorithm.common.struct.LinkedList;

import java.util.List;

public final class LinkedListUtil {

    public static LinkedList convertLinkedList(int max) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < max; i++) {
            linkedList.insertNode(i + 1);
        }
        return linkedList;
    }

    public static LinkedList convertLinkedList(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        list.forEach(linkedList::insertNode);
        return linkedList;
    }
}
