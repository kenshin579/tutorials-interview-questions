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

    @Test
    public void isSameTree() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3)
        );

        TreeNode q = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3)
        );

        assertThat(new SameTree().isSameTree(p, q)).isTrue();
    }

    @Test
    public void isSameTree2() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                null
        );

        TreeNode q = new TreeNode(1,
                null,
                new TreeNode(3)
        );

        assertThat(new SameTree().isSameTree(p, q)).isFalse();
    }

    @Test
    public void isSameTree3() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(1)
        );

        TreeNode q = new TreeNode(1,
                new TreeNode(1),
                new TreeNode(2)
        );

        assertThat(new SameTree().isSameTree(p, q)).isFalse();
    }

    @Test
    public void isSameTree4() {
        assertThat(new SameTree().isSameTree(null, null)).isTrue();
    }

    @Test
    public void isSameTree5() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);

        assertThat(new SameTree().isSameTree(p, q)).isTrue();
    }

    @Test
    public void isSameTree6() {
        TreeNode p = new TreeNode(1);
        TreeNode q = null;

        assertThat(new SameTree().isSameTree(p, q)).isFalse();
    }

    @Test
    public void isSameTree7() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                null);
        TreeNode q = new TreeNode(1);

        assertThat(new SameTree().isSameTree(p, q)).isFalse();
    }

    @Test
    public void isSameTree8() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                null);
        TreeNode q = new TreeNode(1);

        assertThat(new SameTree().isSameTree(p, q)).isFalse();
    }

}
