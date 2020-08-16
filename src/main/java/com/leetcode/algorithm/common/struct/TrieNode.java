package com.leetcode.algorithm.common.struct;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class TrieNode {
    private final Map<Character, TrieNode> children = new HashMap<>();
    private boolean endOfWord;

    @Override
    public String toString() {
        return "TrieNode{\n" +
                " children=" + children +
                ", endOfWord=" + endOfWord +
                "}\n";
    }
}
