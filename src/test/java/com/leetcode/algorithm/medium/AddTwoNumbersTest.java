package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTwoNumbersTest {

    @Test
    public void test_addTwoNumbers() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        assertThat(new AddTwoNumbers().addTwoNumbers(l1, l2).val).isEqualTo(new ListNode(3).val);
    }
}