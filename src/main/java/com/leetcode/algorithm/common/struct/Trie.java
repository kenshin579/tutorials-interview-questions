package com.leetcode.algorithm.common.struct;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.Map;

/**
 * https://www.youtube.com/watch?v=AXjmTQ8LEoI
 * https://www.geeksforgeeks.org/search-in-a-trie-recursively/
 */
@Slf4j
public class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    /**
     * Iterative implmentation of insert  into trie
     */
    public void insert(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            current = current.getChildren()
                    .computeIfAbsent(ch, c -> new TrieNode());
        }
        current.setEndOfWord(true);
    }

    /**
     * Recursive implementation of insert into trie
     */
    public void insertRecursive(String word) {
        insertRecursive(root, word, 0);
    }

    private void insertRecursive(TrieNode current, String word, int index) {
        if (index < word.length()) {
            char key = word.charAt(index);
            current = current.getChildren().computeIfAbsent(key, k -> new TrieNode());
//            if (!current.getChildren().containsKey(key)) {
//                current.getChildren().put(key, new TrieNode());
//            }
//            current = current.getChildren().get(key);
            insertRecursive(current, word, index + 1);
        } else {
            current.setEndOfWord(true);
        }
    }

    public boolean searchRecursive(String word) {
       return searchRecursive(root, word, 0);
    }

    private boolean searchRecursive(TrieNode current, String word, int index) {
        log.info("i:{} word:{} {}", index, word, current);
        if (current == null) {
            return false;
        }

        if (current.isEndOfWord()
                && word.length() == index) {
            return true;
        }

        if (index < word.length()) {
            char key = word.charAt(index);
            log.info("word[{}]={}", index, key);
            return searchRecursive(current.getChildren().get(key), word, index + 1);
        }
        return false;
    }

    public boolean delete(String word) {
        return delete(root, word, 0);
    }

    public boolean containsNode(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.getChildren().get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.isEndOfWord();
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void print() {
        print(root, 0, new StringBuilder(""));
    }

    /**
     * https://stackoverflow.com/questions/11706774/how-to-print-a-trie-in-java
     */
    public void print(TrieNode rootNode, int level, StringBuilder sequence) {
        if (rootNode.isEndOfWord()) {
//            sequence = sequence.insert(level, null);
            System.out.println(sequence);
        }

        Map<Character, TrieNode> children = rootNode.getChildren();
        Iterator<Character> iterator = children.keySet().iterator();
        while (iterator.hasNext()) {
            char character = iterator.next();
            sequence = sequence.insert(level, character);
            print(children.get(character), level + 1, sequence);
            sequence.deleteCharAt(level);
        }
    }

    //todo : 삭제에 대한 스터디가 필요함
    private boolean delete(TrieNode current, String word, int index) {
        if (index == word.length()) {
            if (!current.isEndOfWord()) {
                return false;
            }
            current.setEndOfWord(false);
            return current.getChildren().isEmpty();
        }
        char ch = word.charAt(index);
        TrieNode node = current.getChildren().get(ch);
        if (node == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(node, word, index + 1) && !node.isEndOfWord();

        if (shouldDeleteCurrentNode) {
            current.getChildren().remove(ch);
            return current.getChildren().isEmpty();
        }
        return false;
    }

}
