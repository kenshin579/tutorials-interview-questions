package com.utils;

public final class StringUtils {
    public static boolean isAlpha(String s) {
        return s != null && s.chars().allMatch(Character::isLetter);
    }
}
