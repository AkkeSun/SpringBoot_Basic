package com.example.springboot_basic.cors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsTestController {

    @GetMapping("/corsTest")
    public String corsTest(){
        return "Hello";
    }
}
