package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
import com.utils.TreeNodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class BstFromPreorderTest {

    @Test
    public void bstFromPreorder() {
        int[] preorder = {8, 5, 1, 7, 10, 12};

        TreeNode actual = new BstFromPreorder().bstFromPreorder(preorder);
        BTreePrinter.printNode(actual);
        assertThat(TreeNodeUtils.getPreOrderListFromTreeNode(actual))
                .isEqualTo(Arrays.stream(preorder).boxed().collect(Collectors.toList()));
    }

    @Test
    public void bstFromPreorderRecursive() {
        int[] preorder = {8, 5, 1, 7, 10, 12};

        TreeNode actual = new BstFromPreorder().bstFromPreorderRecursive(preorder);
        BTreePrinter.printNode(actual);

        assertThat(TreeNodeUtils.getPreOrderListFromTreeNode(actual))
                .isEqualTo(Arrays.stream(preorder).boxed().collect(Collectors.toList()));
    }
}