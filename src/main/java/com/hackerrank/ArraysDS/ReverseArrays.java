package com.hackerrank.ArraysDS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseArrays {

    private static final Logger LOG = LoggerFactory.getLogger(ReverseArrays.class);

    /**
     * https://www.hackerrank.com/challenges/arrays-ds/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=30-day-campaign
     * 복잡도 : O(n)
     *
     * @param a
     * @return
     */
    static int[] reverseArray(int[] a) {
        int[] result = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            result[j] = a[i];
            j++;
        }
        return result;
    }
}
