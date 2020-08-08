package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyHashSetTest {

    /**
     * 조건 : built-in HashSet library 사용하지 않기
     */
    @Test
    public void allTest() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(2);
        assertThat(myHashSet.contains(2)).isTrue();
        myHashSet.remove(2);
        assertThat(myHashSet.contains(2)).isFalse();
    }

    @Test
    public void allTest2() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        assertThat(myHashSet.contains(1)).isTrue();
        assertThat(myHashSet.contains(3)).isFalse();
        myHashSet.add(2);
        assertThat(myHashSet.contains(1)).isTrue();
        myHashSet.remove(2);
        assertThat(myHashSet.contains(2)).isFalse();
    }
}