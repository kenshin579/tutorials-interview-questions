package com.leetcode.algorithm.easy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestPalindromeTest {

    /**
     *
     * 조건
     * find the length of the longest palindromes that can be built with those letters.
     * - case sensitive 하다 ("Aa" is not considered a palindrome here.)
     * - 모든 글자를 다 쓸 필요는 없음
     */
    @Test
    public void longestPalindrome() {
        assertThat(new LongestPalindrome().longestPalindrome("abccccdd")).isEqualTo(7);
    }

    @Test
    public void longestPalindrome2() {
        assertThat(new LongestPalindrome().longestPalindrome("ccc")).isEqualTo(3);
    }

    @Test
    public void longestPalindrome3() {
        assertThat(new LongestPalindrome().longestPalindrome("bananas")).isEqualTo(5);
    }

    @Test
    public void longestPalindrome4() {
        assertThat(new LongestPalindrome().exactLongestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"))
                .isEqualTo(983);
        assertThat(new LongestPalindrome().longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"))
                .isEqualTo(983);

    }

    @Test
    public void longestPalindrome5() {
        assertThat(new LongestPalindrome().exactLongestPalindrome("ababbcdgcgccecggffggfggf")).isEqualTo(21);
        assertThat(new LongestPalindrome().longestPalindrome("ababbcdgcgccecggffggfggf")).isEqualTo(21);
    }

}