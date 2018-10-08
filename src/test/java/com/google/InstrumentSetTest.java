package com.google;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InstrumentSetTest {
    private static final Logger LOG = LoggerFactory.getLogger(InstrumentSetTest.class);

    @Test
    public void add() {
        InstrumentSet iset = new InstrumentSet();
        iset.add("item");
        assertEquals(1, iset.getAddCount());
    }

    @Test
    public void addAll() {
        InstrumentSet iset = new InstrumentSet();
        iset.addAll(Arrays.asList("Frank", "Joe", "Angela"));
        LOG.info("iset {}", iset);
        assertEquals(3, iset.getAddCount());
    }
}