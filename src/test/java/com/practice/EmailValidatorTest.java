package com.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  Part 1: Create EmailValidatorTest in src/test/java/com/practice. Add a
 *   @ParameterizedTest with @ValueSource(strings = {...}) covering a few emails
 *   you believe are valid, asserting
 *   assertTrue(EmailValidator.isValidEmail(email)) for each.
 *   As you pick your valid test strings, also think of some tricky ones to try as
 *   invalid cases later — for example, what should happen with "a@.com" (nothing
 *   between @ and the dot) or "a@b." (nothing after the dot)?
 *   Part 2: Add a second @ParameterizedTest with @ValueSource(strings = {...})
 *   covering invalid emails — including tricky ones like "a@.com", "a@b.",
 *   "noatsign.com", "two@@at.com", and an empty string "". Assert
 *   assertFalse(EmailValidator.isValidEmail(email)) for each.
 *   Part 3: Add a plain @Test that asserts calling
 *   EmailValidator.isValidEmail(null) throws IllegalArgumentException. Syntax
 *   hint:
 *   assertThrows(IllegalArgumentException.class, () ->
 *   EmailValidator.isValidEmail(null));
 *   */
public class EmailValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"email@gmail.com", "m@email.com", "a@b.c"})
    void testIsValidEmail(String email) {
        assertTrue(EmailValidator.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a@.com", "a@b", "noatsign.com", "two@@.com", ""})
    void testInvalidEmail(String email) {
        assertFalse(EmailValidator.isValidEmail(email));
    }

    @Test
    void testIsNullEmail() {
        assertThrows(IllegalArgumentException.class, () -> EmailValidator.isValidEmail(null));
    }
}
