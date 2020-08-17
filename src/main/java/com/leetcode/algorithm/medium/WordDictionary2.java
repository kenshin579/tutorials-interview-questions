package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.common.struct.TrieNode;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * 211. Add and Search Word - Data structure design
 * https://leetcode.com/problems/design-add-and-search-words-data-structure/
 * Design Add and Search Words Data Structure
 */
@Slf4j
public class WordDictionary2 {
    private final TrieNode root;

    class TrieNode {
        private final Map<Character, TrieNode> children = new HashMap<>();
        private boolean endOfWord;

        public Map<Character, TrieNode> getChildren() {
            return children;
        }

        public void setEndOfWord(boolean endOfWord) {
            this.endOfWord = endOfWord;
        }
    }

    /**
     * Initialize your data structure here.
     */
    public WordDictionary2() {
        root = new TrieNode();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            current = current.getChildren()
                    .computeIfAbsent(ch, c -> new TrieNode());
        }
        current.setEndOfWord(true);
    }

    /**
     * Returns if the word is in the data structure.
     * A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        TrieNode current = root;
        Stack<TrieNode> stack = new Stack<>();

        for (char ch : word.toCharArray()) {
            //stack에 넣기?
            if (ch == '.') {
//                stack.add(current.getChildren().get())
            } else {
                if (current.getChildren().containsKey(ch)) {
                    current = current.getChildren().get(ch);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
