package com.leetcode.algorithm.common.struct;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

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

//        trie.insert("DEV");
//        trie.insert("DEAR");
        trie.insert("PIE");
//        trie.insert("POP");
//        trie.insert("POW");

//        log.info("trie : {}", trie);

        trie.print();
    }
}