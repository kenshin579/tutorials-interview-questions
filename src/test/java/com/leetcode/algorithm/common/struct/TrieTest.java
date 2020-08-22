package com.leetcode.algorithm.common.struct;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class TrieTest {
    @Test
    public void trie_test() {
        Trie trie = new Trie();

        trie.insert("Programming");
        trie.insert("is");
        trie.insert("a");
        trie.insert("way");
        trie.insert("of");
        trie.insert("life");

//        log.info("trie : {}", trie);

        trie.print();
    }

    @Test
    public void trie_test2() {
        Trie trie = new Trie();

        trie.insert("abc");
        trie.insert("abgl");
        trie.insert("cdf");
        trie.insert("abcd");
        trie.insert("lmn");

        assertThat(trie.containsNode("lmn")).isTrue();
        assertThat(trie.containsNode("cdf")).isTrue();
        assertThat(trie.containsNode("ab")).isFalse();
        assertThat(trie.containsNode("lm")).isFalse();

        trie.delete("abcd");
        assertThat(trie.containsNode("abcd")).isFalse();

        trie.print();
    }

    @Test
    public void insertRecursive() {
        Trie trie = new Trie();

        trie.insertRecursive("abc");
        assertThat(trie.containsNode("abc")).isTrue();
    }

    @Test
    public void searchRecursive() {
        Trie trie = new Trie();

        trie.insertRecursive("at");
        trie.insertRecursive("and");
        trie.insertRecursive("an");
        trie.insertRecursive("add");

        assertThat(trie.searchRecursive("at")).isTrue();
        assertThat(trie.searchRecursive("an")).isTrue();
        assertThat(trie.searchRecursive("add")).isTrue();

        assertThat(trie.searchRecursive("adda")).isFalse();
        assertThat(trie.searchRecursive("bat")).isFalse();
        assertThat(trie.containsNode("ad")).isFalse();
        assertThat(trie.searchRecursive("ad")).isFalse();
        assertThat(trie.searchRecursive("ana")).isFalse();

    }
}