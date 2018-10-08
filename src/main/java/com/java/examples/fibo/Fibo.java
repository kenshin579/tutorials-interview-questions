package com.java.examples.fibo;

public class Fibo {
    /**
     * Generate the nth Fibonacci number
     *
     * @param n
     * @return
     */
    public static int fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        else {
            return fibo(n - 2) + fibo(n - 1);
        }
    }

    /**
     * non-recursive version
     *
     * @param n
     * @return
     */
    public static int fibo2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int prev = 0, curr = 1, sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = prev + curr;
            prev = curr;
            curr = sum;
        }

        return sum;
    }

}
