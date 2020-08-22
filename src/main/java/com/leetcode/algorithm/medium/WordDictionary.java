package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 211. Add and Search Word - Data structure design
 * https://leetcode.com/problems/design-add-and-search-words-data-structure/
 * https://wdxtub.com/interview/14520604445699.html
 * https://ttzztt.gitbooks.io/lc/content/add-and-search-word-data-structure-design.html
 *
 * @see com.leetcode.algorithm.common.struct.Trie
 */
@Slf4j
public class WordDictionary {
    private final TrieNode root;

    class TrieNode {
        private final Map<Character, TrieNode> children = new HashMap<>();
        private boolean endOfWord;

        private Map<Character, TrieNode> getChildren() {
            return children;
        }

        private void setEndOfWord(boolean endOfWord) {
            this.endOfWord = endOfWord;
        }

        public boolean isEndOfWord() {
            return endOfWord;
        }

        @Override
        public String toString() {
            return "TrieNode{\n" +
                    " children=" + children +
                    ", endOfWord=" + endOfWord +
                    "}\n";
        }
    }

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
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
    public boolean search(TrieNode current, String word, int index) {
        log.info("0.index:{} word:{} {}", index, word, current);
        if (current == null) {
            return false;
        }

        if (current.isEndOfWord() && word.length() == index) {
            return true;
        }

        if (index < word.length()) {
            char key = word.charAt(index);
            if (current.getChildren().containsKey(key)) {
                TrieNode root1 = current.getChildren().get(key);
                log.info(" 1.word[{}]={} {}", index, key, root1);
                return search(root1, word, index + 1);
            } else if (key == '.') {
                boolean result = false;
                for (Character ch : current.getChildren().keySet()) {
                    TrieNode root1 = current.getChildren().get(ch);
//                log.info(" 2.ch : {} index : {}", ch, index);
                    log.info(" 2.ch:{} i:{} {}", ch, index + 1, root1);
                    result = result || search(root1, word, index + 1);
                }
                return result;
            }
            log.info("end : false");
        }
        return false;
    }

    public boolean search(String word) {
        return search(root, word, 0);
    }
}
