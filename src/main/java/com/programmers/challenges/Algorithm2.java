package com.programmers.challenges;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.internal.bytebuddy.dynamic.scaffold.MethodGraph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Slf4j
public class Algorithm2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();

        LinkedList<String> queue = new LinkedList<>();

        String[] input = inputStr.split(" ");
        int numOfCommands = Integer.parseInt(input[0]);
        int numOfQueueSize = Integer.parseInt(input[1]);
        String cmdStr, value;
        int count = 0;

        for (int i = 0; i < numOfCommands; i++) {
            cmdStr = br.readLine();

            if (cmdStr.contains("OFFER")) {
                value = cmdStr.split(" ")[1];
                if (count < numOfQueueSize) {
                    System.out.println(queue.add(value));
                    count++;
                } else {
                    System.out.println(false);
                }
            } else if (cmdStr.contains("TAKE")) {
                System.out.println(queue.poll());
                count--;
            } else if (cmdStr.contains("SIZE")) {
                System.out.println(queue.size());
            }
        }
    }
}
