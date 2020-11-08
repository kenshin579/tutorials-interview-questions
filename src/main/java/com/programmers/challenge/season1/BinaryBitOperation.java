package com.programmers.challenge.season1;

import lombok.extern.slf4j.Slf4j;

/**
 * 월간 코드 챌린지 시즌1 > 이진 변환 반복하기
 * Difficulty : Easy
 * Tags : Bit
 * <p>
 * https://programmers.co.kr/learn/courses/30/lessons/70129
 */
@Slf4j
public class BinaryBitOperation {
    /**
     * Time Complexity  : O(M*N), M: 반복 주기, N: string 길이
     * Algorithm :
     * 1.0을 제거하고 남은 1의 길이 -> 이진 변환
     * 2.변환된 이진 값으로 반복
     * 결과는 반복되는 주기횟수와 제거할 0의 총 겟수를 반환하면 됨
     */
    public int[] solution(String s) {
        int[] answer = new int[2];
        int countRepeat = 0;
        int totalNumOfZero = 0;
        StringBuilder sb;
        while (s.length() != 1) {
            countRepeat++;
            log.info("s : {}", s);
            sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    sb.append('1');
                } else { //zero
                    totalNumOfZero++;
                }
            }
            log.info("sb : {}", sb);
            s = convertToBinary(sb.length());
        }

        answer[0] = countRepeat;
        answer[1] = totalNumOfZero;
        return answer;
    }

    String convertToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
