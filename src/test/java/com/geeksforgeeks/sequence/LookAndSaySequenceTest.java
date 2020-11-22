package com.geeksforgeeks.sequence;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LookAndSaySequenceTest {

    /**
     * 반환값 :
     * 1을 "1개의 1"로 읽는다: 11
     * 11을 "2개의 1"로 읽는다: 21
     * 21을 "1개의 2와, 1개의 1"로 읽는다: 1211
     * 1211을 "1개의 1과, 1개의 2와, 2개의 1"로 읽는다: 111221
     */
    @Test
    public void lookAndSaySequence() {
        assertThat(new LookAndSaySequence().lookAndSaySequence(1)).isEqualTo(1);
    }

    @Test
    public void lookAndSaySequence2() {
        assertThat(new LookAndSaySequence().lookAndSaySequence(2)).isEqualTo(11);
    }

    @Test
    public void lookAndSaySequence3() {
        assertThat(new LookAndSaySequence().lookAndSaySequence(3)).isEqualTo(1211);
    }

    @Test
    public void lookAndSaySequence4() {
        assertThat(new LookAndSaySequence().lookAndSaySequence(4)).isEqualTo(111221);
    }

    @Test
    public void countAndSay() {
        assertThat(new LookAndSaySequence().countAndSay(1)).isEqualTo(11);
    }

    @Test
    public void countAndSay2() {
        assertThat(new LookAndSaySequence().countAndSay(11)).isEqualTo(21);
    }

    @Test
    public void countAndSay3() {
        assertThat(new LookAndSaySequence().countAndSay(21)).isEqualTo(1211);
    }
}