package com.leetcode.algorithm.medium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecodeStringTest {

    @Test
    public void decodeString() {
        assertThat(new DecodeString().decodeString("3[hi]")).isEqualTo("hihihi");
    }

    @Test
    public void decodeString1() {
        assertThat(new DecodeString().decodeString("2[3[hi]co]")).isEqualTo("hihihicohihihico");
    }

    @Test
    public void decodeString2() {
        assertThat(new DecodeString().decodeString("10[p]")).isEqualTo("pppppppppp");
    }

    @Test
    public void decodeString3() {
        assertThat(new DecodeString().decodeString("2[2[hi]2[co]]x2[bo]")).isEqualTo("hihicocohihicocoxbobo");
    }

    @Test
    public void decodeString4() {
        assertThat(new DecodeString().decodeString("2[a]")).isEqualTo("aa");
    }

    @Test
    public void decodeString5() {
        assertThat(new DecodeString().decodeString("3[b2[ca]]")).isEqualTo("bcacabcacabcaca");
    }
}