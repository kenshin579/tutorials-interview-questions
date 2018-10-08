package com.codility.lessons.primeandcompositenumbers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountFactors {
    private static final Logger LOG = LoggerFactory.getLogger(CountFactors.class);

    /**
     * 입력 숫자에 대한 factor의 갯수를 반환함
     * <p>
     * 결과: 71%
     *
     * @param N
     * @return
     */
    public int solution(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
        return count;
    }
}
