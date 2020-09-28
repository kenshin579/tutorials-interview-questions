package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class LevelOrderBottomTest {

    @Test
    public void levelOrderBottom() {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        List<List<Integer>> result = Arrays.asList(
                asList(15, 7),
                asList(9, 20),
                asList(3)
        );

        assertThat(new LevelOrderBottom().levelOrderBottom(treeNode)).isEqualTo(result);
    }

    @Test
    public void levelOrderBottom2() {
        TreeNode treeNode = new TreeNode(3);
        List<List<Integer>> result = Arrays.asList(
                asList(3)
        );

        assertThat(new LevelOrderBottom().levelOrderBottom(treeNode)).isEqualTo(result);
    }
}