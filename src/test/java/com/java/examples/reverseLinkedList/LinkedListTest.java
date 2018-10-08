package com.java.examples.reverseLinkedList;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkedListTest {

    private static final Logger LOG = LoggerFactory.getLogger(LinkedListTest.class);

    @Test
    public void test_reverse_linked_list() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.insert(3);
        list1.insert(1);
        list1.insert(5);
        list1.insert(2);
        list1.insert(9);

        list1.print();
        list1.reverse();
        list1.print();
    }
}