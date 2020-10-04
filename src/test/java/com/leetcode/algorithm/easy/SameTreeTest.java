package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.common.struct.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SameTreeTest {

    @Test
    public void sameTree() {
        TreeNode tree1 = new TreeNode();
        TreeNode tree2 = new TreeNode();
        assertThat(new SameTree().isSameTree(tree1, tree2)).isTrue();
    }
    
    @Test
    public void sameTree2() {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2, null, null), null);
        TreeNode tree2 = new TreeNode(1, null, new TreeNode(2, null, null));
        assertThat(new SameTree().isSameTree(tree1, tree2)).isFalse();
    }
    
    @Test
    public void sameTree3() {
        TreeNode tree1 = new TreeNode(1, 
                                      new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, new TreeNode(5, null, null))), 
                                      new TreeNode(6, null, new TreeNode(7, null, null)));
        TreeNode tree2 = new TreeNode(1, 
                                      new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, new TreeNode(5, null, null))), 
                                      new TreeNode(6, null, new TreeNode(7, null, null)));
        assertThat(new SameTree().isSameTree(tree1, tree2)).isTrue();
    }
}
