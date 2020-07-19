package com.leetcode.algorithm.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class ShortestWayToFormStringTest {

    /**
     * 1 step : take a substring of source and append it at the end of source
     * 반환값 : find the minimum number of steps to make target a substring of source
     */
    @Test
    public void tranform() {
        assertThat(new ShortestWayToFormString().tranform("abcd", "dbcfda")).isEqualTo(2);
    }

    @Test
    public void tranform2() {
        assertThat(new ShortestWayToFormString().tranform("abc", "abdabb")).isEqualTo(-1);
    }

    @Test
    public void tranform3() {
        assertThat(new ShortestWayToFormString().tranform("abcd", "fabcda")).isEqualTo(0);
    }

    @Test
    public void subString() {
        log.info("");
    }
}