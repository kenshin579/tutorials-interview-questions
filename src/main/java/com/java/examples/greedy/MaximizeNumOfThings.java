package com.java.examples.greedy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 가장 작은 것부터 선택하면 됨
 * <p>
 * https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/tutorial/
 */
@Slf4j
public class MaximizeNumOfThings {
    public int maximizeNumOfThings(int[] taskTimes, int myTime) {
        int count = 0;
        int currentMyTime = myTime;
        List<Integer> taskTimesAsList = Arrays.stream(taskTimes).boxed().collect(Collectors.toList());
        Collections.sort(taskTimesAsList);

        log.info("sorted taskTimesAsList : {}", taskTimesAsList);

        for (Integer taskTime : taskTimesAsList) {
            log.info("taskTime : {} count : {} currentMyTime : {}", taskTime, count, currentMyTime);
            if (currentMyTime <= 0) {
                break;
            }
            if (taskTime <= currentMyTime) {
                count++;
                currentMyTime -= taskTime;
            } else {
                return 0;
            }
        }
        return count;
    }
}
