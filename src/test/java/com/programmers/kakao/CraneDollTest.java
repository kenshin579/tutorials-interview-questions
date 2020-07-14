package com.programmers.kakao;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class CraneDollTest {

    @Test
    public void solution1() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1};
        assertThat(new CraneDoll().solution(board, moves)).isEqualTo(1);
    }

    @Test
    public void solution2() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 1};
        assertThat(new CraneDoll().solution(board, moves)).isEqualTo(1);
    }

    @Test
    public void solution3() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        assertThat(new CraneDoll().solution(board, moves)).isEqualTo(4);
    }

    @Test
    public void solution4() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 4, 1};
        assertThat(new CraneDoll().solution(board, moves)).isEqualTo(1);
    }

    @Test
    public void popDollFromBoard() {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        CraneDoll craneDoll = new CraneDoll();

        assertThat(craneDoll.popDollFromBoard(board, 1)).isEqualTo(4);
        assertThat(craneDoll.popDollFromBoard(board, 3)).isEqualTo(1);
        assertThat(craneDoll.popDollFromBoard(board, 5)).isEqualTo(3);
    }

    @Test
    public void putIntoBucket_다른_번호로_입력_하는_경우() {
        Stack<Integer> bucket = new Stack<>();

        CraneDoll craneDoll = new CraneDoll();
        assertThat(craneDoll.putIntoBucket(bucket, 3)).isEqualTo(1);
        assertThat(craneDoll.putIntoBucket(bucket, 1)).isEqualTo(2);
        assertThat(craneDoll.putIntoBucket(bucket, 2)).isEqualTo(3);

    }

    @Test
    public void putIntoBucket_같은_번호가_있는_경우_삭제해야_함() {
        Stack<Integer> bucket = new Stack<>();

        CraneDoll craneDoll = new CraneDoll();
        assertThat(craneDoll.putIntoBucket(bucket, 1)).isEqualTo(1);
        assertThat(craneDoll.putIntoBucket(bucket, 1)).isEqualTo(0);
        assertThat(craneDoll.putIntoBucket(bucket, 2)).isEqualTo(1);
    }
}