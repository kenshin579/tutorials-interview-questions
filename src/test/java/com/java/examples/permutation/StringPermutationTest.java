package com.java.examples.permutation;

import org.junit.Test;

public class StringPermutationTest {
    @Test
    public void test_string_permutation() {
        String str = "ABC";
        int n = str.length();
        StringPermutation stringPermutation = new StringPermutation();
        stringPermutation.permute(str, 0, n - 1);
    }
}