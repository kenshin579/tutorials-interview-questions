package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 705. Design HashSet
 * Difficulty : Easy
 * Tags : Hash
 *
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3410/
 * https://leetcode.com/problems/design-hashset/
 */
@Slf4j
public class MyHashSet {
    private Map<Integer, Object> map;
    private Object PRESENT = new Object();

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        map = new HashMap<>();
    }

    public void add(int key) {
        map.put(key, PRESENT);
    }

    public void remove(int key) {
        map.remove(key);
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return map.containsKey(key);
    }
}
