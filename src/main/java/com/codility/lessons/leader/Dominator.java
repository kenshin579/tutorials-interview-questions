package com.codility.lessons.leader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
    private static final Logger LOG = LoggerFactory.getLogger(Dominator.class);

    private static Map<Integer, Integer> valueCountMap = new HashMap<>();

    /**
     * array에서 dominate한 값의 index 아무거나 반환하면 됨
     * - domnator는 같은 값이 전체 요소의 반이상인 요소
     * <p>
     * 결과: 100%
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        int maxNumOfDominator = A.length / 2;

        int size = A.length;
        for (int i = 0; i < size; i++) {
            LOG.info("A[i]: {}", A[i]);

            updateCountMap(A[i]);
            if (isDominatedNumber(A[i], maxNumOfDominator)) {
                return i;
            }
        }
        return -1;
    }

    private void updateCountMap(int num) {
        if (!valueCountMap.containsKey(num)) {
            valueCountMap.put(num, 1);
        } else {
            int count = valueCountMap.get(num) + 1;
            valueCountMap.put(num, count);
        }
    }

    private boolean isDominatedNumber(int num, int maxNumOfDominator) {
        if (valueCountMap.containsKey(num)) {
            int count = valueCountMap.get(num);
            return count > maxNumOfDominator;
        }
        return false;
    }
}
