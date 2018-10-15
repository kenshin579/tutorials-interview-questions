package com.java.examples.bst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Solution {
    private static final Logger LOG = LoggerFactory.getLogger(Solution.class);

    public long solution(int N) {
        return 0;
    }

    public static void main(String[] args) {
        int priceCount = 4000;

        // 가격정보 배열
        int[] priceArray = new int[priceCount];
        for (int priceArrayIdx = 1; priceArrayIdx < priceCount; priceArrayIdx++) {
            priceArray[priceArrayIdx - 1] = priceArrayIdx * 1000;
        }
        System.out.println("가격의 배열인덱스 : " + getSearchPriceArrayIntex(priceArray, 690000));

    }

    /**
     * 이건 recursive로 디자인됨.
     *
     * @param priceArray
     * @param start
     * @param end
     * @param searchNumber
     * @return
     */
    public static int binarySearch(int[] priceArray, int start, int end, int searchNumber) {
        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (priceArray[mid] == searchNumber) {
                return mid;
            }

            if (priceArray[mid] > searchNumber) {
                return binarySearch(priceArray, start, mid - 1, searchNumber);
            }
            return binarySearch(priceArray, mid + 1, end, searchNumber);
        }
        return -1;
    }

//    public static int binarySearch(int[] priceArray, int start, int end, int searchNumber) {
//        if (end >= start) {
//            int mid = start + (end - start) / 2;
//
//            if (priceArray[mid] == searchNumber) {
//                return mid;
//            }
//
//            if (priceArray[mid] > searchNumber) {
//                return binarySearch(priceArray, start, mid - 1, searchNumber);
//            }
//            return binarySearch(priceArray, mid + 1, end, searchNumber);
//        }
//        return -1;
//    }

    /**
     * https://www.youtube.com/watch?v=j5uXyPJ0Pew
     * non recursive 방식임.
     *
     * @param priceArray
     * @param searchPrice
     * @return
     */
    public static int getSearchPriceArrayIntex(int[] priceArray, int searchPrice) {
        int startIndex = 0;
        int endIndex = priceArray.length - 1;
        int midIndex;
        while (startIndex <= endIndex) {
            midIndex = (startIndex + endIndex) / 2;

            if (priceArray[midIndex] == searchPrice) {
                return midIndex;
            } else if (searchPrice < priceArray[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return -1;
    }
}
