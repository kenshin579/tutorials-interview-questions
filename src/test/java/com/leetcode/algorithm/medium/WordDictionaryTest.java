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
        assertThat(obj.search("badd")).isFalse();
        assertThat(obj.search(".ad")).isTrue();
        assertThat(obj.search(".ae")).isFalse();
        assertThat(obj.search("b..")).isTrue();
    }

    @Test
    public void wordDictionaryTest3() {
        WordDictionary obj = new WordDictionary();
        obj.addWord("a");
        obj.addWord("a");
        assertThat(obj.search(".")).isTrue();
        assertThat(obj.search("a")).isTrue();
        assertThat(obj.search("aa")).isFalse();
        assertThat(obj.search("a")).isTrue();
        assertThat(obj.search(".a")).isFalse();
        assertThat(obj.search("a.")).isFalse();
    }

    @Test
    public void wordDictionaryTest4() {
        WordDictionary obj = new WordDictionary();
        obj.addWord("at");
        obj.addWord("and");
        obj.addWord("an");
        obj.addWord("add");
        assertThat(obj.search("at")).isTrue();
        assertThat(obj.search(".at")).isFalse();
        assertThat(obj.search("a")).isFalse();

        obj.addWord("bat");
        obj.addWord("cat");
        assertThat(obj.search(".at")).isTrue();
        assertThat(obj.search("ba.")).isTrue();
        assertThat(obj.search("b.t")).isTrue();
        assertThat(obj.search(".at")).isTrue();
        assertThat(obj.search("an.")).isTrue();
        assertThat(obj.search("a.d.")).isFalse();
        assertThat(obj.search("b.")).isFalse();
        assertThat(obj.search("a.d")).isTrue();
        assertThat(obj.search(".")).isFalse();
    }
}