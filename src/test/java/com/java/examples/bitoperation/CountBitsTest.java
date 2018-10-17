package com.java.examples.bitoperation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class CountBitsTest {

    private static final Logger LOG = LoggerFactory.getLogger(CountBitsTest.class);

    /**
     * 7:111
     * 6:110 -> 110(6)
     * 5:101 -> 100(4)
     * 4:100
     * 3:011 -> 000(0)
     */
    @Test
    public void countBits() {
        int num = 7;
        LOG.info("{}", Integer.toString(num, 2));
        assertEquals(3, CountBits.countBits2(num));
    }

    /**
     * 23:10111
     * 22:10110 -> 10110(22)
     * 21:10101 -> 10100(20)
     * 20:10100
     * 19:10011 -> 10000(16)
     * 16:10000
     * 15:01111 -> 00000(0)
     */
    @Test
    public void countBits2() {
        int num = 23;
        LOG.info("{}", Integer.toString(num, 2));
        assertEquals(4, CountBits.countBits2(num));
    }

    /**
     * 13:1101
     * 12:1100 -> 1100(12)
     * 11:1011 -> 1000(8)
     * 8:1000
     * 7:0111 -> 0000(0)
     */
    @Test
    public void countBits3() {
        int num = 13;
        LOG.info("{}", Integer.toString(num, 2));
        assertEquals(3, CountBits.countBits2(num));
    }
}