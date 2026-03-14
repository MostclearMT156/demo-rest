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
        PostObject po = new PostObject(1000, 1, "Hello", "Hellow from rest");
        String body = "{\n" +
                "    \"title\": \"Мое название\",\n" +
                "    \"body\": \"Это моя первая новость\",\n" +
                "    \"userId\": 1000\n" +
                "}";
        given().header("Content-type", "application/json; charset=UTF-8").body(po).when().post("https://jsonplaceholder.typicode.com/posts").then().log().body();
    }
}
