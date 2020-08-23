package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TreeNode;
import com.leetcode.algorithm.common.util.BTreePrinter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class BstFromPreorderTest {

    @Test
    public void bstFromPreorder() {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        //TreeNode [8,5,10,1,7,null,12]
        TreeNode treeNode = new TreeNode();


        TreeNode actual = new BstFromPreorder().bstFromPreorder(preorder);
        BTreePrinter.printNode(actual);

//        assertThat(actual).isEqualTo(treeNode);
    }

    @Test
    public void bstFromPreorderRecursive() {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        //TreeNode [8,5,10,1,7,null,12]
        TreeNode treeNode = new TreeNode();

        TreeNode actual = new BstFromPreorder().bstFromPreorderRecursive(preorder);
        BTreePrinter.printNode(actual);
    }
}