package com.codility.lessons.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BracketsTest {

    @Test
    public void solution() {
        Brackets brackets = new Brackets();
        assertEquals(1, brackets.solution("{[()()]}"));
    }

    @Test
    public void solution_empty() {
        Brackets brackets = new Brackets();
        assertEquals(1, brackets.solution(""));
    }

    @Test
    public void solution_brackets_매칭이_안된_경우() {
        Brackets brackets = new Brackets();
        assertEquals(0, brackets.solution("([)()]"));
    }

    @Test
    public void solution_size가_다름() {
        Brackets brackets = new Brackets();
        assertEquals(0, brackets.solution("([)()]]"));
    }
}