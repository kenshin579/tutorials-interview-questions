package com.programmers.challenge.season1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTwoIntegersTest {

    /**
     * 반환값
     * - 다른 인덱스에 있는 두개의 수를 뽑아서 모든 수
     * - 오른 차순으로
     */
    @Test
    public void solution() {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] expected = {2, 3, 4, 5, 6, 7};

        assertThat(new AddTwoIntegers().solution(numbers)).isEqualTo(expected);
    }

    @Test
    public void solution2() {
        int[] numbers = {5, 0, 2, 7};
        int[] expected = {2, 5, 7, 9, 12};

        assertThat(new AddTwoIntegers().solution(numbers)).isEqualTo(expected);
    }
}