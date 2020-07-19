package com.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TransformStringTest {

    /**
     * The only operation allowed is to put any character from A and insert it at front
     * <p>
     * 반환값 : mins operation의 숙
     */
    @Test
    public void minOps() {
        assertThat(new TransformString().bestSolution("ABD", "BAD")).isEqualTo(1);
        assertThat(new TransformString().minOps("ABD", "BAD")).isEqualTo(1);
    }

    @Test
    public void minOps2() {
        assertThat(new TransformString().bestSolution("EACBD", "EABCD")).isEqualTo(3);
        assertThat(new TransformString().minOps("EACBD", "EABCD")).isEqualTo(3);
    }

    @Test
    public void minOps3() {
        assertThat(new TransformString().bestSolution("ACDB", "ABCD")).isEqualTo(2);
        assertThat(new TransformString().minOps("ACDB", "ABCD")).isEqualTo(2);
    }

    @Test
    public void minOps3_길이가_다른_경우() {
        assertThat(new TransformString().bestSolution("EACBDD", "EABCD")).isEqualTo(-1);
        assertThat(new TransformString().minOps("EACBDD", "EABCD")).isEqualTo(-1);
    }

    @Test
    public void minOps4_다른_chars가_있는_경우() {
        assertThat(new TransformString().bestSolution("EAFCD", "EABCD")).isEqualTo(-1);
        assertThat(new TransformString().minOps("EAFCD", "EABCD")).isEqualTo(-1);
    }

    @Test
    public void isStringSameCharacter() {
        assertThat(new TransformString().isStringSameCharacter("ABC", "ABD")).isFalse();
        assertThat(new TransformString().isStringSameCharacter("ABC", "ABC")).isTrue();
    }
}