package com.java.examples.linkedlist;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class LinkedListTest {
    @Test
    public void test_insert_size() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(3);
        linkedList.insert(4);
        assertThat(linkedList.size()).isEqualTo(2);
    }

    @Test
    public void test_print() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        linkedList.print();
        assertThat(linkedList.size()).isEqualTo(3);
    }

    @Test
    public void test_getIndex() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);

        log.info("{}", linkedList);

        assertThat(linkedList.getIndex(0)).isEqualTo(3);
        assertThat(linkedList.getIndex(1)).isEqualTo(4);
        assertThat(linkedList.getIndex(2)).isEqualTo(5);
        assertThat(linkedList.getIndex(3)).isEqualTo(6);
    }

    @Test
    public void test_remove_size() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        assertThat(linkedList.size()).isEqualTo(4);
        linkedList.remove(2);
        linkedList.print();
        assertThat(linkedList.size()).isEqualTo(3);
        assertThat(linkedList.getIndex(2)).isEqualTo(4);
    }

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