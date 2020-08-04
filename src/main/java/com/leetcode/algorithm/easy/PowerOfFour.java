package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 342. Power of Four
 * https://leetcode.com/problems/power-of-four/
 */
@Slf4j
public class PowerOfFour {
    /**
     * Time Complexity : O()
     * <p>
     * Algorithm :
     * - 4를 곱하면서 기존 num와 같은 같이 나오면 true 아니면 false를 반환함
     * Issue : Time Limit Exceeded 발생함
     */
    public boolean isPowerOfFour(int num) {
        int number = 1;
        while (number <= num) {
            if (number == num) {
                return true;
            }
            number *= 4;
        }
        return false;
    }

    /**
     * Loops/Recursion 사용하지 않고 하는 방법?
     * Time Complexity :
     * <p>
     * Algorithm :
     */
    public boolean isPowerOfFour2(int num) {
        log.info("num : {} {}", num, Integer.toBinaryString(num));
        return false;
    }
}
