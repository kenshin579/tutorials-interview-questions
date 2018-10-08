package com.codility.lessons.primeandcompositenumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountFactorsTest {

    @Test
    public void solution() {
        CountFactors countFactors = new CountFactors();
        assertEquals(8, countFactors.solution(24));
    }
}