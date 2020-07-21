package com.programmers.challenges;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.LinkedList;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class Algorithm2Test {

    @Test
    public void main() {
    }

    @Test
    public void queue() {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        log.info("{}", queue);

        Integer poll = queue.poll();
        log.info("poll : {}", poll);
    }

    @Test
    public void isLetter() {
        assertThat(Character.isLetter('!')).isFalse();
    }

    @Test
    public void isStrAlpha() {
//        assertThat(Algorithm2.isStrAlpha("!")).isFalse();
    }
}