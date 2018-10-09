package com.google;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonSet {
    private static final Logger LOG = LoggerFactory.getLogger(CommonSet.class);

    /**
     * 복잡도 : O(n)
     *
     * @param A
     * @param B
     * @return
     */
    public List<Integer> solution(int[] A, int[] B) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Boolean> mapA = new HashMap<>();

        //O(N)
        for (int x : A) {
            if (!mapA.containsKey(x)) {
                mapA.put(x, true);
            }
        }

        for (int x : B) {
            if (mapA.containsKey(x)) {
                result.add(x);
            }
        }
        return result;
    }
}
