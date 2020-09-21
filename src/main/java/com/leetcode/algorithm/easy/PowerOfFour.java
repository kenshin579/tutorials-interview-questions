package com.leetcode.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 342. Power of Four
 * Difficulty : Easy
 * Tags : BitManipulation
 *
 * https://leetcode.com/problems/power-of-four/
 * https://www.geeksforgeeks.org/find-whether-a-given-number-is-a-power-of-4-or-not/
 */
@Slf4j
public class PowerOfFour {
    /**
     * Time Complexity : O()
     * <p>
     * Algorithm :
     * - 4를 곱하면서 기존 num와 같은 같이 나오면 true 아니면 false를 반환함
     * Issue : Time Limit Exceeded 발생함
     * 단점 : negative이면 무한으로 늘어남
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
     * Time Complexity :
     * <p>
     * Algorithm :
     * - loop을 돌면서 N % 4의 값이 0이 아니면 false
     */
    public boolean isPowerOfFour2(int num) {
        while (num != 1) {
            log.info("num : {} {}", num, num % 4);
            if (num % 4 != 0) {
                return false;
            }
            num /= 4;
        }
        return true;
    }

    /**
     * Time Complexity : O(B)
     * B : bit 갯수만큼
     * <p>
     * Algorithm :
     * - first bit이 1일지 확인
     * - zero bit의 수가 even이면
     */
    public boolean isPowerOfFour3(int num) {
        if (num == 1) return true;
        int count = 0;
        int firstBitCheck = num & (num - 1);
        if (firstBitCheck == 0 && num > 0) {
            //zero bit check
            while (num != 1) {
                log.info("num : {} count : {}", num, count);
                num >>= 1;
//                count *= 2;
                count++;
            }
            return count % 2 == 0;
        }
        return false;

    }
}
