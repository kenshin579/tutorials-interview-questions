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
     * Time Complexity :
     *
     * Algorithm :
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
