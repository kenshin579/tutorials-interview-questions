package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PathSumTest {

    @Test
    public void hasPathSum() {
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

        assertThat(new PathSum().hasPathSumDFS(root, 22)).isTrue();
        assertThat(new PathSum().hasPathSumBFS(root, 22)).isTrue();
    }

    @Test
    public void hasPathSum4() {
        assertThat(new PathSum().hasPathSumDFS(null, 0)).isFalse();
        assertThat(new PathSum().hasPathSumBFS(null, 0)).isFalse();
    }

    @Test
    public void hasPathSum2() {
        TreeNode root = new TreeNode(5);
        BTreePrinter.printNode(root);

        assertThat(new PathSum().hasPathSumDFS(root, 5)).isTrue();
        assertThat(new PathSum().hasPathSumBFS(root, 5)).isTrue();
    }

    @Test
    public void hasPathSum3() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4),
                new TreeNode(8));

        BTreePrinter.printNode(root);

        assertThat(new PathSum().hasPathSumDFS(root, 13)).isTrue();
        assertThat(new PathSum().hasPathSumBFS(root, 13)).isTrue();
    }

    @Test
    public void hasPathSum6() {
        TreeNode root = new TreeNode(5,
                new TreeNode(2),
                null);
        BTreePrinter.printNode(root);

        assertThat(new PathSum().hasPathSumDFS(root, 1)).isFalse();
        assertThat(new PathSum().hasPathSumBFS(root, 1)).isFalse();
    }

    @Test
    public void hasPathSum7() {
        assertThat(new PathSum().hasPathSumDFS(null, 0)).isFalse();
        assertThat(new PathSum().hasPathSumBFS(null, 0)).isFalse();
    }
}