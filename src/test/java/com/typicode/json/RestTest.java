package com.typicode.json;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestTest {
    @Test
    public void testGetPostById() {
        given().when().get("https://jsonplaceholder.typicode.com/posts/1").then().log().body();
    }
    @Test
    public void createPost() {
        String body = "{\n" +
                "    \"title\": \"Мое название\",\n" +
                "    \"body\": \"Это моя первая новость\",\n" +
                "    \"userId\": 1000\n" +
                "}";
        given().header("Content-type", "application/json; charset=UTF-8").body(body).when().post("https://jsonplaceholder.typicode.com/posts").then().log().body();
    }
}
