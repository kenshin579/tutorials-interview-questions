package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * 211. Add and Search Word - Data structure design
 * https://leetcode.com/problems/add-and-search-word-data-structure-design/
 * todo : Time Limit Exceeded 발생함
 * @see com.leetcode.algorithm.medium.WordDictionary2
 */
@Slf4j
public class WordDictionary {
    private Set<String> dict;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        dict = new HashSet<>();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        dict.add(word);
    }

    /**
     * Returns if the word is in the data structure.
     * A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        if (word.contains(".")) {
            return dict.stream().anyMatch(it -> Pattern.matches(word, it));
        } else {
            return dict.contains(word);
        }
    }
}
