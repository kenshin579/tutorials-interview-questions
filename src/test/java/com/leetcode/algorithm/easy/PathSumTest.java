package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class PathSumTest {

    @Test
    public void pathSum() {
//        root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
        TreeNode treeNode = new TreeNode(9);
        assertThat(new PathSum().pathSum(treeNode, 8)).isEqualTo(3);
    }
}