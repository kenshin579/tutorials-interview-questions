package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TrieWithMapTest {
    @Test
    public void trie_test() {
        TrieWithMap trie = new TrieWithMap();

        trie.insert("apple");
        assertThat(trie.search("apple")).isTrue();
        assertThat(trie.search("app")).isFalse();
        assertThat(trie.startsWith("app")).isTrue();

        trie.insert("app");
        assertThat(trie.search("app")).isTrue();
    }

    @Test
    public void trie_test2() {
        TrieWithMap trie = new TrieWithMap();

        trie.insert("a");
        assertThat(trie.search("a")).isTrue();
        assertThat(trie.startsWith("a")).isTrue();
    }

}