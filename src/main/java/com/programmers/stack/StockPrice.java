package com.programmers.stack;

import lombok.extern.slf4j.Slf4j;


import java.util.ArrayList;

/**
 * 주식 가격 스택/큐 문제
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 * https://youngest-programming.tistory.com/206
 * https://sas-study.tistory.com/256
 */
@Slf4j
public class StockPrice {
    public int[] mySolution(int[] prices) {
        int[] answer = new int[prices.length];
        int count;
        for (int i = 0; i < prices.length; i++) {
            count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) {
                    count++;
                }

                if (prices[i] > prices[j]) {
                    count++;
                    break; //todo: 조금 더 효율성을 따져서 break 하도록 함
                }
            }
            answer[i] = count;
            log.info("i:{}.answer : {} count : {}", i + 1, answer, count);
        }
        return answer;
    }

    public int[] bestSolution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    log.info("j:{} i:{} answer[{}]: {} <-- break", j, i, i, answer[i]);
                    break;
                }
                //break없이 쭉 loop인 경우에는
                if (j == answer.length - 1) {
                    answer[i] = j - i;
                    log.info("j:{} i:{} answer[{}]: {}", j, i, i, answer[i]);
                }
            }
        }
        return answer;
    }

    public int[] solution2(int[] prices) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int price : prices) {
            list.add(price);
        }
        int position = 0;
        while (!list.isEmpty()) {
            int value = list.get(position);
            list.remove(position);
            //남은 리스트에서 비교
            for (int i = 0; i < list.size(); i++) {
                int relativeValue = list.get(i);
                // 가격이 떨어진 경우
                if (relativeValue < value) {
                    resultList.add(i + 1);
                    break;
                }
                //마지막까지 가격 안떨어진 경우
                else if (i == list.size() - 1) {
                    resultList.add(i + 1);
                    break;
                }
            }
            //하나남은경우 0을 결과에 추가하고 break
            if (list.size() == 1) {
                resultList.add(0);
                break;
            }
        }
        answer = resultList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
