package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.ListNode;
import com.leetcode.algorithm.common.util.ListNodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class InsertionSortListTest {

    @Test
    public void insertionSortList() {
        ListNode head = new ListNode(4,
                new ListNode(2,
                        new ListNode(1,
                                new ListNode(3))));

        ListNodeUtil.print(head);

        ListNode result = new InsertionSortList().insertionSortList(head);

        ListNodeUtil.print(result);
    }
}