package com.codility.lessons.sorting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    private static final Logger LOG = LoggerFactory.getLogger(Distinct.class);

    /**
     * distinct 값의 수를 반환함
     * <p>
     * 결과 : 100%
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        Set<Integer> uniqueSet = new HashSet<>();

        int size = A.length;
        for (int i = 0; i < size; i++) {
            uniqueSet.add(A[i]);
        }

        return uniqueSet.size();
    }
}
