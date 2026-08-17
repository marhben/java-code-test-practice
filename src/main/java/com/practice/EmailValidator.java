package com.practice;

/**
* Task part 1: In src/main/java/com/practice, create a class named
* EmailValidator with this method:
* public static boolean isValidEmail(String email)
* It should return true for a reasonably valid email format:
* exactly one @symbol, at least one character before it, and at least one dot after the @
* with characters on both sides of that dot. Return false for anything that
* doesn't match. If email is null, throw an IllegalArgumentException.
* */

public class EmailValidator {

    public static boolean isValidEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException();
        }

        int atIndex = email.indexOf("@");
        int atLastIndex = email.lastIndexOf("@");

        if (atIndex == -1 || atIndex != atLastIndex) {
            return false;
        }

        String beforeAt = email.substring(0, atIndex);
        String afterAt = email.substring(atIndex + 1);
        int dotIndex = afterAt.indexOf(".");

        if (beforeAt.isEmpty()) {
            return false;
        }

        if (dotIndex <= 0 || dotIndex == afterAt.length() - 1) {
            return false;
        }
        return true;
    }
}
