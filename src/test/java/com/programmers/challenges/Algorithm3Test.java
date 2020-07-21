package com.programmers.challenges;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class Algorithm3Test {
    @Test
    public void name() {
        List<String> strList = Arrays.asList("abc", "gsdf");

        Integer resut = strList.stream().max(String::compareToIgnoreCase).map(String::length).orElse(0);
        log.info("resut : {}", resut);
    }
}