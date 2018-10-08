package com.codility.lessons.maximumslice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaxProfit {

    private static final Logger LOG = LoggerFactory.getLogger(MaxProfit.class);

    /**
     * stock에서 얻을 수 있는 최고값을 반환함
     * <p>
     * 결과 : 66%
     * 성능 : N^2
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        int size = A.length;
        int max = 0;
        int stockProfit;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                stockProfit = A[j] - A[i];
                if (stockProfit > max) {
                    max = stockProfit;
                }
            }
        }

        return max;
    }
}
