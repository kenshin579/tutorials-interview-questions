package com.hackerrank.tree;

import com.hackerrank.common.struct.BinaryTree;
import com.hackerrank.common.util.BinaryTreeUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class HeightOfBinaryTreeTest {

    @Test
    public void height() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(1));
        binaryTree.print();

        assertThat(HeightOfBinaryTree.height(binaryTree.root)).isEqualTo(0);
    }

    @Test
    public void height2() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 1, 7, 5, 4));
        binaryTree.print();

        assertThat(HeightOfBinaryTree.height(binaryTree.root)).isEqualTo(3);
    }

    @Test
    public void height3() {
        BinaryTree binaryTree = BinaryTreeUtil.generateBinaryTree(Arrays.asList(3, 1));
        binaryTree.print();

        assertThat(HeightOfBinaryTree.height(binaryTree.root)).isEqualTo(1);
    }
}