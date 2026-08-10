package com.practice;

/**
 * Task:
 * In src/main/java/com/practice, create a new class StringUtils with a method:
 * public static boolean isPalindrome(String input)
 * It should return true if input is a palindrome, ignoring case, spaces, and
 * punctuation (e.g. "A man, a plan, a canal: Panama" → true).
 * Then write JUnit tests for it in src/test/java/com/practice covering:
 * a normal palindrome, a non-palindrome, an empty string, and a string with mixed punctuation/case.
 * */

public class StringUtils {

    public static boolean isPalindrome(String input) {
        if (input == null) return false;

        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < cleanInput.length() /2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(cleanInput.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }
}
