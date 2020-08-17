package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrieTest {

    /**
     * 조건
     * - lowercase만
     * - non-empty strings 만
     */
    @Test
    public void trie_test1() {
        Trie trie = new Trie();

        trie.insert("apple");
        assertThat(trie.search("apple")).isTrue();
        assertThat(trie.search("app")).isFalse();
        assertThat(trie.startsWith("app")).isTrue();

        trie.insert("app");
        assertThat(trie.search("app")).isTrue();
    }
}