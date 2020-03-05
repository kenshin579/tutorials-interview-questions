package com.geeksforgeeks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JobSequenceWithDealineTest {

    @Test
    public void jobSequenceWithDeadline() {
        List<Job> jobs = new ArrayList<>();
        Job job = Job.builder().jobId("a").deadLine(4).profit(20).build();
        jobs.add(job);
        job = Job.builder().jobId("b").deadLine(1).profit(10).build();
        jobs.add(job);
        job = Job.builder().jobId("c").deadLine(1).profit(40).build();
        jobs.add(job);
        job = Job.builder().jobId("d").deadLine(1).profit(30).build();
        jobs.add(job);

        List<String> result = Arrays.asList("c", "a");

        assertThat(new JobSequenceWithDealine().jobSequenceWithDeadline(jobs)).isEqualTo(result);
    }

    @Test
    public void jobSequenceWithDeadline2() {
        List<Job> jobs = new ArrayList<>();
        Job job = Job.builder().jobId("a").deadLine(2).profit(100).build();
        jobs.add(job);
        job = Job.builder().jobId("b").deadLine(1).profit(19).build();
        jobs.add(job);
        job = Job.builder().jobId("c").deadLine(2).profit(27).build();
        jobs.add(job);
        job = Job.builder().jobId("d").deadLine(1).profit(25).build();
        jobs.add(job);
        job = Job.builder().jobId("3").deadLine(3).profit(15).build();
        jobs.add(job);

        List<String> result = Arrays.asList("c", "a", "e");

        assertThat(new JobSequenceWithDealine().jobSequenceWithDeadline(jobs)).isEqualTo(result);
    }
}