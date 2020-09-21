package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * 208. Implement Trie (Prefix Tree)
 * Difficulty : Medium
 * Tags : Trie
 *
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
public class Trie {
    private final TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     * Time complexity : O(m), m is the length of key
     */
    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (!current.containsKey(ch)) {
                current.put(ch, new TrieNode());
            }
            current = current.get(ch);
        }
        current.setEnd();
    }

    /**
     * Returns if the word is in the trie.
     * Time complexity :
     */
    public boolean search(String word) {
        TrieNode last = searchPrefix(word);
        return last != null && last.isEnd();
    }

    private TrieNode searchPrefix(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            if (current.containsKey(ch)) {
                current = current.get(ch);
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
        // R links to node children
        private TrieNode[] links;

        private final int R = 26;

        private boolean isEnd;

        public TrieNode() {
            links = new TrieNode[R];
        }

        private boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        private TrieNode get(char ch) {
            return links[ch - 'a'];
        }

        private void put(char ch, TrieNode node) {
            links[ch - 'a'] = node;
        }

        private void setEnd() {
            isEnd = true;
        }

        private boolean isEnd() {
            return isEnd;
        }
    }
}
