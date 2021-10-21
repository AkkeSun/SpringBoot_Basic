package com.example.springboot_basic;

import com.example.springboot_basic.applicationListener.PreListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setWebApplicationType(WebApplicationType.SERVLET);
        app.addListeners(new PreListener()); // PreListener 등록
        app.run(args);
    }
}
