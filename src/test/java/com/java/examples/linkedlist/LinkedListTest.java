package com.java.examples.linkedlist;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class LinkedListTest {
    @Test
    public void test_reverse_linked_list() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(3);
        linkedList.insert(1);
        linkedList.insert(5);
        linkedList.insert(2);
        linkedList.insert(9);

        linkedList.print();
        linkedList.reverse();
        linkedList.print();
    }
}