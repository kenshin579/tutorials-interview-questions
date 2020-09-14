package com.geeksforgeeks;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Job Sequence 문제
 * 하나의 Job은 1 unit time을 사용한다고 이해하면 됨
 * -
 * https://www.geeksforgeeks.org/job-sequencing-problem/
 * https://www.youtube.com/watch?v=zPtI8q9gvX8
 */
@Slf4j
public class JobSequenceWithDealine {
    public List<String> jobSequenceWithDeadline(List<Job> jobs) {
        List<String> result = new ArrayList<>();
        //sort
        List<Job> sortedJobs = jobs.stream()
                .sorted((o1, o2) -> o2.getProfit() - o1.getProfit())
                .collect(Collectors.toList());

        log.info("sortedJobs: {}", sortedJobs);

        for (int i = 0; i < sortedJobs.size(); i++) {

        }

        return result;
    }
}
