package com.geeksforgeeks;

import lombok.extern.slf4j.Slf4j;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Transform String
 * https://www.geeksforgeeks.org/transform-one-string-to-another-using-minimum-number-of-given-operation/
 */
@Slf4j
public class TransformString {
    public int minOps(String A, String B) {
        if (A.length() != B.length()
                || !isStringSameCharacter(A, B))
            return -1;

        //count mismatch
        //A는 계속 decrement하고 B는 같은 경우에는 decrement함

        int aPos = A.length() - 1;
        int bPos = B.length() - 1;
        int count = 0;

        while (aPos >=0) {
            if (A.charAt(aPos) != B.charAt(bPos))
                count++;
            else
                bPos--;
            aPos--;
        }
        return count;
    }

    protected boolean isStringSameCharacter(String A, String B) {
        Set<Character> setB = B.chars().mapToObj(chr -> (char) chr).collect(Collectors.toSet());

        for (int i = 0; i < A.length(); i++) {
            if (!setB.contains(A.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public int bestSolution(String A, String B) {
        // This parts checks whether conversion is
        // possible or not
        if (A.length() != B.length())
            return -1;

        int i, j, res = 0;
        int count[] = new int[256];

        // count characters in A

        // subtract count for every character in B
        for (i = 0; i < A.length(); i++) {
            count[A.charAt(i)]++;
            count[B.charAt(i)]--;
        }

        // Check if all counts become 0
        for (i = 0; i < 256; i++)
            if (count[i] != 0)
                return -1;

        i = A.length() - 1;
        j = B.length() - 1;

        while (i >= 0) {
            // If there is a mismatch, then
            // keep incrementing result 'res'
            // until B[j] is not found in A[0..i]
            if (A.charAt(i) != B.charAt(j))
                res++;
            else
                j--;
            i--;
        }
        return res;
    }
}
