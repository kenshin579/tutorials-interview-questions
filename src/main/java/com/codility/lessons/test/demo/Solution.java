package com.codility.lessons.test.demo;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] A) {
        int maxInteger = 100000;
        Map<Integer, Boolean> hashMapForIntegerValue = new HashMap<>();
        for (int n : A) {
            hashMapForIntegerValue.put(n, true);
        }

        for (int i = 1; i < maxInteger; i++) {
            if (!hashMapForIntegerValue.containsKey(i)) {
                return i;
            }
        }
        return 1;
    }
}
