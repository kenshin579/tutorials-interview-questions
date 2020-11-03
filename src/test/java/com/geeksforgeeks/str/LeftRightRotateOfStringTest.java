package com.geeksforgeeks.str;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeftRightRotateOfStringTest {

    /**
     * rotation (양수:오른쪽, 음수:왼쪽으로 회전)
     */
    @Test
    public void rotateString_left() {
        assertThat(new LeftRightRotateOfString().rotateString("GeeksforGeeks", -2)).isEqualTo("eksforGeeksGe");
    }

    @Test
    public void rotateString_right() {
        assertThat(new LeftRightRotateOfString().rotateString("GeeksforGeeks", 2)).isEqualTo("ksGeeksforGee");
    }
}