package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PathSumIITest {

    @Test
    public void pathSum() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                null,
                                new TreeNode(1))));

        BTreePrinter.printNode(root);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(5, 4, 11, 2),
                Arrays.asList(5, 8, 4, 5)
        );

        assertThat(new PathSumII().pathSum(root, 22)).isEqualTo(expected);
    }

    @Test
    public void hasPathSum4() {
        List<List<Integer>> expected = Arrays.asList();
        assertThat(new PathSumII().pathSum(null, 0)).isEqualTo(expected);
    }

    @Test
    public void hasPathSum2() {
        TreeNode root = new TreeNode(5);
        BTreePrinter.printNode(root);

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(5)
        );

        assertThat(new PathSumII().pathSum(root, 5)).isEqualTo(expected);
    }

    @Test
    public void hasPathSum3() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4),
                new TreeNode(8));

        BTreePrinter.printNode(root);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(5, 8)
        );

        assertThat(new PathSumII().pathSum(root, 13)).isEqualTo(expected);
    }

    @Test
    public void hasPathSum6() {
        TreeNode root = new TreeNode(5,
                new TreeNode(2),
                null);
        BTreePrinter.printNode(root);

        List<List<Integer>> expected = Arrays.asList();

        assertThat(new PathSumII().pathSum(root, 1)).isEqualTo(expected);
    }

    @Test
    public void hasPathSum7() {
        List<List<Integer>> expected = Arrays.asList();
        assertThat(new PathSumII().pathSum(null, 0)).isEqualTo(expected);
    }
}