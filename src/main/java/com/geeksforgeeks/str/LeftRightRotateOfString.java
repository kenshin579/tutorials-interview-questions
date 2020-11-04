package com.geeksforgeeks.str;

import lombok.extern.slf4j.Slf4j;

/**
 * Left Right Rotate of String
 * Difficulty : Easy
 * Tags : String
 *
 * https://www.geeksforgeeks.org/left-rotation-right-rotation-string-2/
 */
@Slf4j
public class LeftRightRotateOfString {
    /**
     * Time Complexity : O(1)
     * - substring의 구현에 따라서 달라질 것 같음 O(1)일 거라고 가정함
     *
     * Algorithm : substring 메서드를 이용해서 작업함
     * 1. left rotation인 경우
     * - abc -> bc[0-1] + a[2] -> bca
     * 2. right rotation인 경우
     * - 기존 left rotation 메서드 사용
     * - abc -> c[2] + ab[0-1] -> cab
     */
    public String rotateString(String str, int rotation) {
        rotation = rotation % str.length();
        if (rotation > 0) {
            return rightRotate(str, rotation);
        }
        return leftRotate(str, Math.abs(rotation));
    }

    private String rightRotate(String sb, int rotation) {
        return leftRotate(sb, sb.length() - rotation);
    }

    private String leftRotate(String sb, int rotation) {
        return sb.substring(rotation) + sb.substring(0, rotation);
    }


}
