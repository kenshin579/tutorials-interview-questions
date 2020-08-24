package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumOfLeftLeavesTest {

    @Test
    public void sumOfLeftLeaves() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );

        assertThat(new SumOfLeftLeaves().sumOfLeftLeaves(root)).isEqualTo(24);
    }
}