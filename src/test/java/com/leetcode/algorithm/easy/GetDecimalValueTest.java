package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.LinkedList;
import com.leetcode.algorithm.common.util.LinkedListUtil;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class GetDecimalValueTest {

    @Test
    public void getDecimalValue() {
        LinkedList linkedList = LinkedListUtil.generateLinkedListSample(Arrays.asList(1, 0, 1));
        linkedList.printList();

        assertThat(new GetDecimalValue().getDecimalValue(linkedList.head)).isEqualTo(5);
    }

    @Test
    public void getDecimalValue2() {
        LinkedList linkedList = LinkedListUtil.generateLinkedListSample(Arrays.asList(1, 0, 0, 1, 1));
        linkedList.printList();

        assertThat(new GetDecimalValue().getDecimalValue(linkedList.head)).isEqualTo(19);
    }

    @Test
    public void getDecimalValue3() {
        LinkedList linkedList = LinkedListUtil.generateLinkedListSample(Arrays.asList(0));
        linkedList.printList();

        assertThat(new GetDecimalValue().getDecimalValue(linkedList.head)).isEqualTo(0);
    }

    @Test
    public void getDecimalValue4() {
        LinkedList linkedList = LinkedListUtil.generateLinkedListSample(Arrays.asList(1));
        linkedList.printList();

        assertThat(new GetDecimalValue().getDecimalValue(linkedList.head)).isEqualTo(1);
    }

    @Test
    public void getDecimalValue5() {
        LinkedList linkedList = LinkedListUtil.generateLinkedListSample(Arrays.asList(1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0));
        linkedList.printList();

        assertThat(new GetDecimalValue().getDecimalValue(linkedList.head)).isEqualTo(18880);
    }

    @Test
    public void getDecimalValue6() {
        LinkedList linkedList = LinkedListUtil.generateLinkedListSample(Arrays.asList(0, 0));
        linkedList.printList();

        assertThat(new GetDecimalValue().getDecimalValue(linkedList.head)).isEqualTo(0);
    }
}