package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 409. Longest Palindrome
 * Difficulty : Easy
 * Tags : String
 *
 * https://leetcode.com/problems/longest-palindrome/
 * https://leetcode.com/problems/longest-palindrome/solution/
 */
@Slf4j
public class LongestPalindrome {
    /**
     * Time Complexity : O(N)
     * Algorithm (Greedy) :
     * - 각 알파펫이 몇개 있는지 map으로 저장함
     * - map을 iterate하면서 total count를 계산한다.
     * ㅁ. odd인 경우는 한번만 더할 수 있고 이후 odd 값은 even 값으로만 더할 수 있음
     */
    public int longestPalindrome(String s) {
        Map<Character, Integer> charVsCount = new LinkedHashMap<>();

        char key;
        for (int i = 0; i < s.length(); i++) {
            key = s.charAt(i);
            if (charVsCount.containsKey(key)) {
                charVsCount.put(key, charVsCount.get(key) + 1);
            } else {
                charVsCount.put(key, 1);
            }
        }

        log.info("charVsCount : {}", charVsCount);

        int count = 0;
        Integer occurence;

        if (charVsCount.size() == 1) {
            return s.length();
        }

        for (Character ch : charVsCount.keySet()) {
            occurence = charVsCount.get(ch);
            count += occurence / 2 * 2;
            if (count % 2 == 0 && occurence % 2 == 1) {
                count++;
            }
        }

        log.info("length : {} size : {} count : {}", s.length(), charVsCount.size(), count);
        return count;
    }

    public int exactLongestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray())
            count[c]++;

        int ans = 0;
        log.info("count : {}", count);
        for (int v : count) {
            ans += v / 2 * 2;
            log.info("v : {} ans : {}", v, ans);
            if (ans % 2 == 0 && v % 2 == 1) {
                ans++;
                log.info("ans : {}", ans);
            }
        }
        return ans;
    }
}
