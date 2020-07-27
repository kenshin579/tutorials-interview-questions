package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindSmallestLetterGreaterThanTargetTest {

    /**
     * Time Complexity : O(N)
     * 반환값 : find the smallest element in the list (target보다 큰 값)
     * 주의사항
     * - Letters also wrap around.
     * - letters lower case만 그리고 sorted된 순서로 되어 있음
     */
    @Test
    public void nextGreatestLetter() {
        char[] letters = {'c', 'f', 'j'};
        //abcdefghijklmnopqrstuvwxyz
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'a')).isEqualTo('c');
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter2(letters, 'a')).isEqualTo('c');
    }

    @Test
    public void nextGreatestLetter2() {
        char[] letters = {'c', 'f', 'j'};
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'c')).isEqualTo('f');
    }

    @Test
    public void nextGreatestLetter3() {
        char[] letters = {'c', 'f', 'j'};
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'd')).isEqualTo('f');
    }

    @Test
    public void nextGreatestLetter4() {
        char[] letters = {'c', 'f', 'j'};
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'g')).isEqualTo('j');
    }

    @Test
    public void nextGreatestLetter5() {
        char[] letters = {'c', 'f', 'j'};
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'j')).isEqualTo('c');
    }

    @Test
    public void nextGreatestLetter6() {
        char[] letters = {'c', 'f', 'j'};
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'k')).isEqualTo('c');
    }

    @Test
    public void nextGreatestLetter7() {
        char[] letters = {'a', 'b'};
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'z')).isEqualTo('a');
    }

    @Test
    public void nextGreatestLetter8() {
        char[] letters = {'b', 'd', 'e', 'f', 'g'};
//        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'c')).isEqualTo('d');
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter2(letters, 'c')).isEqualTo('d');
    }

    @Test
    public void nextGreatestLetter9() {
        char[] letters = {'c', 'd', 'e', 'f', 'g'};
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'f')).isEqualTo('g');
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter2(letters, 'f')).isEqualTo('g');
    }

    @Test
    public void nextGreatestLetter10() {
        char[] letters = {'c', 'd', 'e', 'f', 'g'};
//        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(letters, 'c')).isEqualTo('d');
        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter2(letters, 'c')).isEqualTo('d');
//        assertThat(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter2(letters, 'g')).isEqualTo('d');
    }
}