package com.java.examples.permutation;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;

@Slf4j
public class StringPermutationTest {
    @Test
    public void permute() {
        StringPermutation.printPermutedString("ABC");
//        StringPermutation.printPermutedString("AB");
    }

    @Test
    public void getPermutatedStringAsList() {
        ArrayList<String> abc = StringPermutation.getPermutatedStringAsList("ABC");
        log.info("abc : {}", abc);
    }

    @Test
    public void printPermutatedString() {
        StringPermutation.permuteStrWithPrefixStr("ABC");
    }
}