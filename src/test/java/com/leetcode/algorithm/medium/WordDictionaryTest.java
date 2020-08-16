package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordDictionaryTest {

    @Test
    public void wordDictionaryTest() {
        String word = "frank";
        WordDictionary obj = new WordDictionary();
        obj.addWord(word);
        assertThat(obj.search(word)).isTrue();
    }

    @Test
    public void wordDictionaryTest2() {
        WordDictionary obj = new WordDictionary();
        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");
        assertThat(obj.search("pad")).isFalse();
        assertThat(obj.search("bad")).isTrue();
        assertThat(obj.search(".ad")).isTrue();
        assertThat(obj.search("b..")).isTrue();
    }
}