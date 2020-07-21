package com.programmers.challenges;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class Algorithm3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        String inputStr;
        List<String> strList = new ArrayList<>();


        for (int i = 0; i < num; i++) {
            inputStr = sc.next();
            strList.add(inputStr);
        }
//        log.info("strList: {}", strList);

        //print
        int headerFooterSize = getMaxSize(strList) + 2 + 2;
//        log.info("headerFooterSize : {}", headerFooterSize);

        printHeaderFooter(headerFooterSize);
        printHeaderFooterWithSpace(headerFooterSize);
        for (int i = 0; i < strList.size(); i++) {
            System.out.print("# " + strList.get(i));
            printEndOfStr(headerFooterSize - 3 - strList.get(i).length());
            System.out.println();
        }
        printHeaderFooterWithSpace(headerFooterSize);
        printHeaderFooter(headerFooterSize);
    }

    private static void printEndOfStr(int max) {
        for (int i = 0; i < max; i++) {
            System.out.print(" ");
        }
        System.out.print("#");
    }

    private static void printHeaderFooter(int max) {
        for (int i = 0; i < max; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    private static void printHeaderFooterWithSpace(int max) {
        for (int i = 0; i < max; i++) {
            if (i == 0 || i == max - 1) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    private static int getMaxSize(List<String> strList) {
        int max = strList.get(0).length();

        for (int i = 1; i < strList.size(); i++) {
            if (strList.get(i).length() > max) {
                max = strList.get(i).length();
            }
        }
        return max;
    }

}
