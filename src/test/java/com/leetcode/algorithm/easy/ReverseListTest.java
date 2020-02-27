package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.LinkedList;
import com.leetcode.algorithm.common.util.LinkedListUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

@Slf4j
public class ReverseListTest {

    @Test
    public void reverseList() {
        LinkedList linkedList = LinkedListUtil.generateLinkedListSample(Arrays.asList(1, 2, 3, 4, 5));
        linkedList.printList();

        new ReverseList().reverseList(linkedList.head);
//        assertThat()

    }
}