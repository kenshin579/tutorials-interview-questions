package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordDictionary2Test {

    @Test
    public void wordDictionaryTest() {
        String word = "frank";
        WordDictionary2 obj = new WordDictionary2();
        obj.addWord(word);
        assertThat(obj.search(".rank")).isTrue();
        assertThat(obj.search("frank")).isTrue();
        assertThat(obj.search("frank1")).isFalse();
        assertThat(obj.search("fa")).isFalse();
    }

    @Test
    public void wordDictionaryTest2() {
        WordDictionary2 obj = new WordDictionary2();
        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");
        assertThat(obj.search("pad")).isFalse();
        assertThat(obj.search("bad")).isTrue();
        assertThat(obj.search(".ad")).isTrue();
        assertThat(obj.search("b..")).isTrue();
    }
}