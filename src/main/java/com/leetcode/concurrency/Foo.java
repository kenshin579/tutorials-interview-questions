package com.leetcode.concurrency;

import lombok.extern.slf4j.Slf4j;

/**
 * 1114. Print in Order
 * https://leetcode.com/problems/print-in-order/
 */
@Slf4j
@Deprecated
public class Foo {
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
