package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 208. Implement Trie (Prefix Tree)
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 * https://leetcode.com/problems/implement-trie-prefix-tree/solution/
 * <p>
 * Trie (prefix tree) : string의 데이터 셋에서 key 조회로 사용되는 데이터 구조이다
 *
 * Trie 데이터 구조가 사용되는 Applications:
 * 1. Autocomplete
 * 2. Spell checker
 * 3. IP routing (Logest prefix matching)
 * 4. T9 predictive text
 * 5. Solving word games
 *
 */
@Slf4j
public class TrieWithMap {
    private final TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public TrieWithMap() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     * Time complexity : O(m), m is the length of key
     */
    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
           if (!current.getChildren().containsKey(ch)) {
               current.getChildren().put(ch, new TrieNode());
           }
           current = current.getChildren().get(ch);
        }
        current.setEndOfWord(true);
    }

    /**
     * Returns if the word is in the trie.
     * Time complexity :
     */
    public boolean search(String word) {
        TrieNode last = searchPrefix(word);
        return last != null && last.isEndOfWord();
    }

    private TrieNode searchPrefix(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            if (current.getChildren().containsKey(ch)) {
                current = current.getChildren().get(ch);
            } else {
                return null;
            }
        }
        return current;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode last = searchPrefix(prefix);
        return last != null;
    }

    class TrieNode {
        private final Map<Character, TrieNode> children = new HashMap<>();
        private boolean endOfWord;

        public Map<Character, TrieNode> getChildren() {
            return children;
        }

        public boolean isEndOfWord() {
            return endOfWord;
        }

        public void setEndOfWord(boolean endOfWord) {
            this.endOfWord = endOfWord;
        }
    }
}
