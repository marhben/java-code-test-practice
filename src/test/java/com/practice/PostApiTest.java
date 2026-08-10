package com.practice;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

/**
 *  Task: Write a JUnit test using REST-assured against the free public test API
 *   https://jsonplaceholder.typicode.com/posts/1.
 *   Requirements:
 *   1. Send a GET request to that URL.
 *   2. Assert the response status code is 200.
 *   3. Assert the JSON response body has a field "id" equal to 1.
 *   4. Assert the field "userId" is present and is an integer.
 *   Create a new test class src/test/java/com/practice/PostApiTest.java. As a hint
 *   for REST-assured syntax, the entry point is a static import:
 *   import static io.restassured.RestAssured.given;
 *   */


public class PostApiTest {

    @Test
    void testApi() {
        RestAssured.given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", instanceOf(Integer.class));

    }

}