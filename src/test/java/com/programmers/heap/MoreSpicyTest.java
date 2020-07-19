package com.programmers.heap;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Iterator;
import java.util.PriorityQueue;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class MoreSpicyTest {

    /**
     * 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
     * <p>
     * 반환 값 : K 이상으로 만들기 위해 섞어야 하는 최소 횟수
     */
    @Test
    public void solution() {
        int[] scoville = {1, 2, 3, 9, 10, 12};

        assertThat(new MoreSpicy().bestSolution(scoville, 7)).isEqualTo(2);
    }

    @Test
    public void test_PriorityQueue() {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.add(20);
        heap.add(10);
        heap.add(15);

        while (heap.size() > 0) {
            log.info("{}", heap.poll()); //min 값이 먼저인 것을 반환함
        }
    }
}