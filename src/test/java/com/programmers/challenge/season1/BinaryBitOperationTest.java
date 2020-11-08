package com.programmers.challenge.season1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryBitOperationTest {

    /**
     * 반환값 :
     * [x, y], x: 1로 될때까지의 반복 횟수, y: 총 제거할 0의 수
     */
    @Test
    public void solution() {
        int[] expected = {3, 8};
        assertThat(new BinaryBitOperation().solution("110010101001")).isEqualTo(expected);
    }

    @Test
    public void solution2() {
        int[] expected = {3, 3};
        assertThat(new BinaryBitOperation().solution("01110")).isEqualTo(expected);
    }

    @Test
    public void solution3() {
        int[] expected = {4, 1};
        assertThat(new BinaryBitOperation().solution("1111111")).isEqualTo(expected);
    }

    @Test
    public void convertToBinary() {
        assertThat(new BinaryBitOperation().convertToBinary(6)).isEqualTo("110");
        assertThat(new BinaryBitOperation().convertToBinary(2)).isEqualTo("10");
        assertThat(new BinaryBitOperation().convertToBinary(1)).isEqualTo("1");
    }
}