package com.devex.devops.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ExampleControllerTest {

    @Autowired
    private ExampleController exampleController;

    @Test
    void helloWorld() {
       assertEquals(exampleController.helloWorld(), "hello world");
    }
}