package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class IsBalancedTest {

    @Test
    public void test_isBalanced1() {
        //[3,9,20,null,null,15,7]
        TreeNode treeNode = new TreeNode(3);

        assertThat(new IsBalanced().isBalanced(treeNode)).isTrue();
    }

    @Test
    public void test_isBalanced2() {
        //[1,2,2,3,3,null,null,4,4]
        TreeNode treeNode = new TreeNode(3);

        assertThat(new IsBalanced().isBalanced(treeNode)).isTrue();
    }

}