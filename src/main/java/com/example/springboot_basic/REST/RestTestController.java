package com.example.springboot_basic.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

    @GetMapping("/rest1")
    public String rest1() throws InterruptedException {
        Thread.sleep(5000L);
        return "Test1";
    }

    @GetMapping("/rest2")
    public String rest2() throws InterruptedException {
        Thread.sleep(3000L);
        return "Test2";
    }
}
