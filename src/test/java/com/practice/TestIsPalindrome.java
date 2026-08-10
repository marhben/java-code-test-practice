package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestIsPalindrome {

    @Test
    void testIsValidPalindrome() {
        assertTrue(StringUtils.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void testIsNonPalindrome() {
        assertFalse(StringUtils.isPalindrome("A plan, a man, a bird: Panama"));
    }

    @Test
    void testIsPalindromeEmptyString() {
        assertTrue(StringUtils.isPalindrome(""));
    }

    @Test
    void testIsPalindromeWithMixedPunctuation() {
        assertTrue(StringUtils.isPalindrome("MAdam...!,. "));
    }
}
