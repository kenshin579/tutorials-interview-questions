package com.programmers.challenges;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Algorithm5 {
    public boolean solution(String account1, String account2, int count) {
        java.util.List<Thread> threads = new java.util.ArrayList<>();
        for (int i = 0; i < count; i++) {
            final int condition = i % 2;
            Thread thread = new Thread(() -> {
                if (condition == 0) {
                    transfer(account1, account2, 1);
                } else {
                    transfer(account2, account1, 1);
                }
            });
            threads.add(thread);
            thread.start();
        }
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        return true;
    }

    public void transfer(String fromAccount, String toAccount, int money) {

        String account1 = fromAccount;
        String account2 = toAccount;
//
//
//
//
//
        synchronized (account1) {
            synchronized (account2) {
                String message = String.format("Transfer %d from %s to %s", money, account1, account2);
                System.out.println(message);
            }
        }
//
//
//
//
//

    }
}
